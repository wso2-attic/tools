package org.wso2.datamapper.engine.core;

import java.util.HashMap;
import java.util.Map;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.mozilla.javascript.ConsString;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeJavaMethod;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.wso2.datamapper.engine.models.MappingConfigModel;

public class FunctionExecuter {
	
	private HashMap<String, MappingConfigModel> mappingTypes;
	private Scriptable scope;
	private Map<String, Schema> outputSchemaMap;
	private Context context;
	
	public FunctionExecuter(HashMap<String, MappingConfigModel> mappingTypes , Scriptable scope , Map<String, Schema> outputSchemaMap , Context context) {
		this.mappingTypes = mappingTypes;
		this.scope = scope;
		this.outputSchemaMap = outputSchemaMap;
		this.context = context;
	}

	public GenericRecord execute(String elementName, GenericRecord record) {
		
		GenericRecord inrecord = record;
		String inElementName = elementName;
		GenericRecord resultRecord = null;
		
		MappingConfigModel model = this.mappingTypes.get(inElementName);
		
		if (model != null) {

			String inputDataType = inElementName;
			String outputDataType = model.getOutputDataType();
			String funcType = model.getMappingFunctionType();
			
			Schema outSchema = this.outputSchemaMap.get(outputDataType);
			GenericRecord  outrecord = new GenericData.Record(outSchema);
			
			AvroWrapper inwrapper = new AvroWrapper(inrecord);
			AvroWrapper outwrapper = new AvroWrapper(outrecord);
			
			this.scope.put("input", this.scope, inwrapper);
			this.scope.put("output", this.scope, outwrapper);
		
			String script = "map_"+funcType+"_"+inputDataType+"_"+outputDataType+"();";
			Object resultOb = this.context.evaluateString(this.scope, script, "", 1, null);

			Scriptable scriptableOb = Context.toObject(resultOb, this.scope);

			if(resultOb != ScriptableObject.NOT_FOUND){
				resultRecord = outwrapper.getRecord();
			}
		}

		return resultRecord;
		
	}
}
