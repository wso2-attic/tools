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

public class MappingHandler {

	private Schema inSchema;
	private Schema outSchema;
	private Scriptable scope;
	private GenericRecord outputRecord;
	private InputDataReaderAdapter inputDataReader;
	private Context context;
	private JSONObject outputJson;

	public MappingHandler(Schema inSchema, Schema outSchema, Scriptable scope,
			InputDataReaderAdapter inputDataReader, Context context) {
		
		this.inSchema = inSchema;
		this.outSchema = outSchema;
		this.scope = scope;
		this.inputDataReader = inputDataReader;
		this.context = context;
		this.outputRecord = new GenericData.Record(outSchema);
		
	}

	public void executeMappingFunctions(HashMap<String, MappingConfigModel> mappingTypes) throws JSONException {
		
		SchemaCreator inputSchemaCreator = new SchemaCreator();	
		inputSchemaCreator.setSchema(this.inSchema);
		Map<String, Schema> inputSchemaMap = inputSchemaCreator.getSchemaMap();
			
		SchemaCreator outputSchemaCreator = new SchemaCreator();	
		outputSchemaCreator.setSchema(this.outSchema);
		Map<String, Schema> outputSchemaMap = outputSchemaCreator.getSchemaMap();
		
		String outputDatatype;
		MappingConfigModel model;
		String inputDataType;
		String functype;
		Schema inSchema;
		Schema outSchema;
		GenericData.Array<GenericRecord> recArray =null;
		GenericRecord inrec = null;
		GenericRecord outrec = null;
		List<GenericRecord> inRecordList;
		Iterator<GenericRecord> inRecordIter;
		GenericRecord tempRec = null;
		
		AvroRecordCreator recCreator = new AvroRecordCreator();
		outrec = recCreator.genRecord(this.outSchema);

		boolean isSimpleElementsField = false;

		for (Field field : outrec.getSchema().getFields()){

			if(field.schema().getType() == Schema.Type.ARRAY){
				
				outputDatatype = field.schema().getElementType().getName();	
				
				model = mappingTypes.get(outputDatatype);
				inputDataType = model.getInputDataType();
				functype = model.getMappingFunctionType();
				
				inSchema = inputSchemaMap.get(inputDataType);
				outSchema = outputSchemaMap.get(outputDatatype);	
				
				inRecordList = this.inputDataReader.getInputRecordList(inSchema, inputDataType);
				inRecordIter = inRecordList.listIterator();
				
				recArray = new GenericData.Array<GenericRecord>(inRecordList.size(), field.schema());
				
				
				while (inRecordIter.hasNext()) {
					tempRec = recCreator.genRecord(outSchema);
					inrec = inRecordIter.next();
					
					String script = "map_"+functype+"_"+inputDataType+"_"+outputDatatype+"("+inrec+","+tempRec+");";
					Object resultOb = this.context.evaluateString(this.scope, script, "", 1, null);
					
					Scriptable scriptableOb = Context.toObject(resultOb, this.scope);
					
					if(resultOb != ScriptableObject.NOT_FOUND){
						getOutputRecord(scriptableOb,tempRec);
						recArray.add(tempRec);
					}	
				}
				outrec.put(field.name(), recArray);
				
			}else{
				if(!isSimpleElementsField){
					
					outputDatatype = outrec.getSchema().getName();	
					
					model = mappingTypes.get(outputDatatype);
					inputDataType = model.getInputDataType();
					functype = model.getMappingFunctionType();
					
					inSchema = inputSchemaMap.get(inputDataType);
					inrec = this.inputDataReader.getInputRecord(inSchema, inputDataType);
					
					System.out.println("in record "+inrec);
					System.out.println("out record "+outrec);
					
					String script = "map_"+functype+"_"+inputDataType+"_"+outputDatatype+"("+inrec+","+outrec+");";
					Object resultOb = this.context.evaluateString(this.scope, script, "", 1, null);
					
					Scriptable scriptableOb = Context.toObject(resultOb, this.scope);
					
					if(resultOb != ScriptableObject.NOT_FOUND){
						getOutputRecord(scriptableOb,outrec);
					}
					isSimpleElementsField = true;
				}
			}	
		
		}
		
		System.out.println("final record "+outrec);

	}
	
	public GenericRecord getOutputRecord(Scriptable scrObj,GenericRecord resultRec) {
		Scriptable object = scrObj;
		this.outputRecord = resultRec;

			Object[] propertyIds = ScriptableObject.getPropertyIds(object);
			
			for (Object id : propertyIds) {
				String key = id.toString();
				Object value = ScriptableObject.getProperty(object, key);

				if (value instanceof NativeJavaObject) {
					this.outputRecord.put(key, ((NativeJavaObject) value).getDefaultValue(String.class));
				}else if(value instanceof ConsString) {
					this.outputRecord.put(key, value);
				}else if(value instanceof NativeJavaMethod){
					continue;
				}else{
					this.outputRecord.put(key, value);
				}
			}
		return this.outputRecord;
	}
	
	public void endmapping() throws IOException{
				
		BufferedWriter outputWriter = new BufferedWriter(new FileWriter(new File("./resources/output.json")));
		outputWriter.write(this.outputJson.toString());
		outputWriter.flush();
		outputWriter.close();
		
		System.out.println("end writing");
	}

}
