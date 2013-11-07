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
		
	}
	

	public void executeMappingFunctions(HashMap<String, MappingConfigModel> mappingTypes) throws JSONException {
		
		SchemaCreator inputSchemaCreator = new SchemaCreator();	
		inputSchemaCreator.setSchema(this.inSchema);
		Map<String, Schema> inputSchemaMap = inputSchemaCreator.getSchemaMap();
			
		SchemaCreator outputSchemaCreator = new SchemaCreator();	
		outputSchemaCreator.setSchema(this.outSchema);
		Map<String, Schema> outputSchemaMap = outputSchemaCreator.getSchemaMap();
		Map<String, String> avroArrayMap = outputSchemaCreator.getAvroArrayMap();
		
		OMElement rootElement = this.inputDataReader.getRootElement();		
		
		MappingExecuter executer = new MappingExecuter();
		executer.setInputSchemaMap(inputSchemaMap);
		executer.setOutputSchemaMap(outputSchemaMap);
		executer.setMappingTypes(mappingTypes);
		executer.setInputDataReader(this.inputDataReader);
		executer.setContext(this.context);
		executer.setScope(this.scope);
		executer.setAvroArrayMap(avroArrayMap);
		executer.setOutputSchema(this.outSchema);
		
		executer.execute(rootElement);

	}
	
	public void endmapping() throws IOException{
				
		BufferedWriter outputWriter = new BufferedWriter(new FileWriter(new File("./resources/output.json")));
		outputWriter.write(this.outputJson.toString());
		outputWriter.flush();
		outputWriter.close();
		
		System.out.println("end writing");
	}

}
