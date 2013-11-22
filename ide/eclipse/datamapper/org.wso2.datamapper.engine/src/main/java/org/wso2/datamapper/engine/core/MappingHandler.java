package org.wso2.datamapper.engine.core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

import org.apache.avro.Schema;
import org.apache.avro.Schema.Field;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.axiom.om.OMElement;
import org.json.JSONException;
import org.json.JSONObject;
import org.mozilla.javascript.ConsString;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.NativeJavaMethod;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.wso2.datamapper.engine.inputAdapters.InputDataReaderAdapter;
import org.wso2.datamapper.engine.models.MappingConfigModel;
import org.wso2.datamapper.engine.sample.AvroWrapper;

public class MappingHandler {

	private Schema inSchema;
	private Schema outSchema;
	private Scriptable scope;
	private InputDataReaderAdapter inputDataReader;
	private Context context;
	private JSONObject outputJson;
	private Map<String, Schema> inputSchemaMap;
	private Map<String, Schema> outputSchemaMap;
	private HashMap<String, MappingConfigModel> mappingTypes;
	private AvroRecordCreator recordCreator;

	public MappingHandler(Schema inSchema, Schema outSchema, Scriptable scope,
			InputDataReaderAdapter inputDataReader, Context context) {
		
		this.inSchema = inSchema;
		this.outSchema = outSchema;
		this.scope = scope;
		this.inputDataReader = inputDataReader;
		this.context = context;
		
	}

	public GenericRecord executeMappingFunctions(HashMap<String, MappingConfigModel> mappingTypes) throws JSONException {
		
		SchemaCreator inputSchemaCreator = new SchemaCreator();	
		inputSchemaCreator.setSchema(this.inSchema);
		this.inputSchemaMap = inputSchemaCreator.getSchemaMap();
			
		SchemaCreator outputSchemaCreator = new SchemaCreator();	
		outputSchemaCreator.setSchema(this.outSchema);
		this.outputSchemaMap = outputSchemaCreator.getSchemaMap();
		
		Map<String, String> avroArrayMap = outputSchemaCreator.getAvroArrayMap();
		inputDataReader.setInputSchemaMap(inputSchemaMap);
		inputDataReader.setAvroArrayData(avroArrayMap);
		inputDataReader.setMappingTypes(mappingTypes);
		
		FunctionExecuter funcExecuter = new FunctionExecuter(mappingTypes, scope, outputSchemaMap, context);
		inputDataReader.setFuncExecuter(funcExecuter);
		
		this.mappingTypes = mappingTypes;	
		this.recordCreator = new AvroRecordCreator();
		
		GenericRecord inputRecord = new GenericData.Record(inSchema);
		GenericRecord outputRecord = new GenericData.Record(outSchema);
		GenericRecord childRecord;
		GenericRecord resultRecord;
		
		Map<String, String> inputAvroArrayMap = inputSchemaCreator.getAvroArrayMap();
		String arrayId = null;
		Schema tempSchema;
		GenericData.Array<GenericRecord> recArray =null;
		
		inputDataReader.setRootRecord(inputRecord);
		
		List<GenericRecord> outRecordList = null;
		Map<String, List<GenericRecord>> outRecordMap = new HashMap<String, List<GenericRecord>>();
		String outSchemaName = null;
		GenericRecord rootRecord;
		List<GenericRecord> inChildRecordList = new ArrayList<GenericRecord>();
		
		while (inputDataReader.hasChildRecords()) {
			
			childRecord = inputDataReader.getChildRecord();
			
			if(childRecord != null){	
					
				resultRecord = funcExecuter.execute(childRecord.getSchema().getName(), childRecord);		
				
				if (resultRecord != null) {
					arrayId = avroArrayMap.get(resultRecord.getSchema().getName());

					if(arrayId != null){
						tempSchema = outputSchemaMap.get(arrayId);
						
						if((outSchemaName != null) && (arrayId.equals(outSchemaName))){
							outRecordList.add(resultRecord);
							outRecordMap.put(outSchemaName, outRecordList);
						}else{
							outSchemaName = arrayId;
							outRecordList = new ArrayList<GenericRecord>();
							outRecordList.add(resultRecord);	
						}
					}else{
						outRecordList = new ArrayList<GenericRecord>();
						outRecordList.add(resultRecord);
						outRecordMap.put(childRecord.getSchema().getName(), outRecordList);
					}
				}else{
					inChildRecordList.add(childRecord);
				}
			}
		}
		
		rootRecord = inputDataReader.getRootRecord();
		
		for (GenericRecord genericRecord : inChildRecordList) {
			rootRecord.put(genericRecord.getSchema().getName(), genericRecord);
		}
		
		outputRecord = funcExecuter.execute(inputDataReader.getRootRecord().getSchema().getName(), rootRecord);
		
		if (outputRecord == null) {
			outputRecord = new GenericData.Record(outSchema);
		}
		
		Iterator<String> outRecordKeySet = outRecordMap.keySet().iterator();
		String key;
		List<GenericRecord> recList;
		
		while (outRecordKeySet.hasNext()) {
			key = outRecordKeySet.next();
			Schema tempsc = outputSchemaMap.get(key);
			recList = outRecordMap.get(key);
			
			if (tempsc.getType() == Schema.Type.RECORD) {
				for (GenericRecord genericRecord : recList) {
					outputRecord.put(key, genericRecord);
				}			
			}else if (tempsc.getType() == Schema.Type.ARRAY) {
				recArray = new GenericData.Array<GenericRecord>(recList.size(), tempsc);
				
				for (GenericRecord genericRecord : recList) {
					recArray.add(genericRecord);
				}	
				outputRecord.put(key, recArray);
			}
		}	

		return outputRecord;
	}
	
	public void endmapping() throws IOException{
				
		BufferedWriter outputWriter = new BufferedWriter(new FileWriter(new File("./resources/output.json")));
		outputWriter.write(this.outputJson.toString());
		outputWriter.flush();
		outputWriter.close();
		
		System.out.println("end writing");
	}

}
