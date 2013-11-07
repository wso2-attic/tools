package org.wso2.datamapper.engine.core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.avro.Schema;
import org.apache.avro.Schema.Field;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.axiom.om.OMElement;
import org.mozilla.javascript.ConsString;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeJavaMethod;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.wso2.datamapper.engine.inputAdapters.InputDataReaderAdapter;
import org.wso2.datamapper.engine.models.MappingConfigModel;

public class MappingExecuter {
	
	private Map<String, Schema> inputSchemaMap;
	private Map<String, Schema> outputSchemaMap;
	private HashMap<String, MappingConfigModel> mappingTypes;
	private GenericRecord inputRecord;
	private GenericRecord outputRecord;
	private InputDataReaderAdapter inputDataReader;
	private Scriptable scope;
	private Context context;
	private Map<String, String> avroArrayMap;
	private Schema outputSchema;
	
	
	public void setInputSchemaMap(Map<String, Schema> inputSchemaMap) {
		this.inputSchemaMap = inputSchemaMap;
	}

	public void setOutputSchemaMap(Map<String, Schema> outputSchemaMap) {
		this.outputSchemaMap = outputSchemaMap;
	}

	public void setMappingTypes(HashMap<String, MappingConfigModel> mappingTypes) {
		this.mappingTypes = mappingTypes;
	}

	public void setInputDataReader(InputDataReaderAdapter inputDataReader) {
		this.inputDataReader = inputDataReader;
	}

	public void setScope(Scriptable scope) {
		this.scope = scope;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public void setAvroArrayMap(Map<String, String> avroArrayMap) {
		this.avroArrayMap = avroArrayMap;
	}

	public void setOutputSchema(Schema outputSchema) {
		this.outputSchema = outputSchema;
	}

	public void execute(OMElement root) {
		
		Schema inputSchema = this.inputSchemaMap.get(root.getLocalName());	
		this.inputRecord = new GenericData.Record(inputSchema);
		this.outputRecord = new GenericData.Record(this.outputSchema);
	
		Iterator<OMElement> childIter = root.getChildElements();
		OMElement childElement;		
		MappingConfigModel model = this.mappingTypes.get(root.getLocalName());
		
		while (childIter.hasNext()) {
			childElement = childIter.next();
			System.out.println("child element "+childElement.getLocalName());
			Schema tempSchema = this.inputSchemaMap.get(childElement.getLocalName());
			
			if(tempSchema != null){
				
				if(tempSchema.getType() == Schema.Type.RECORD){
					GenericRecord rec = this.inputDataReader.getInputRecord(tempSchema, childElement);		
					
				}else if(tempSchema.getType() == Schema.Type.ARRAY){
					
					model = this.mappingTypes.get(tempSchema.getElementType().getName());
					if(model != null){
						
						String inputDataType = tempSchema.getElementType().getName();
						String outputDataType = model.getOutputDataType();
						String funcType = model.getMappingFunctionType();
						
						Schema outSchema = outputSchemaMap.get(outputDataType);
						
						List<GenericRecord> inRecordList;
						Iterator<GenericRecord> inRecordIter;
						GenericRecord inrec;
						
						inRecordList = this.inputDataReader.getInputRecordList(tempSchema.getElementType(), childElement);
						inRecordIter = inRecordList.listIterator();
						
						String arraySchemaName = this.avroArrayMap.get(outputDataType);
						Schema outputSchema = this.outputSchemaMap.get(arraySchemaName);
						
						GenericData.Array<GenericRecord> recArray = new GenericData.Array<GenericRecord>(inRecordList.size(), outputSchema);
						GenericRecord  outrec;
						while (inRecordIter.hasNext()) {
							inrec = inRecordIter.next();
							outrec = new GenericData.Record(outSchema);
							
							String script = "map_"+funcType+"_"+inputDataType+"_"+outputDataType+"("+inrec+","+outrec+");";
							Object resultOb = this.context.evaluateString(this.scope, script, "", 1, null);
							
							Scriptable scriptableOb = Context.toObject(resultOb, this.scope);

							if(resultOb != ScriptableObject.NOT_FOUND){
								recArray.add(getOutputRecord(scriptableOb,outrec));
							}
						}	
						this.outputRecord.put(arraySchemaName, recArray);
					}
				}
				
			}else{
				this.inputRecord.put(childElement.getLocalName(), childElement.getText());

			}
			
			System.out.println(" input "+this.inputRecord);
		}
		
		model = this.mappingTypes.get(root.getLocalName());
		String inputDataType = root.getLocalName();
		String outputDataType = model.getOutputDataType();
		String funcType = model.getMappingFunctionType();

		String script = "map_"+funcType+"_"+inputDataType+"_"+outputDataType+"("+this.inputRecord+","+this.outputRecord+");";
		Object resultOb = this.context.evaluateString(this.scope, script, "", 1, null);
		
		Scriptable scriptableOb = Context.toObject(resultOb, this.scope);

		if(resultOb != ScriptableObject.NOT_FOUND){
			getOutputRecord(scriptableOb,this.outputRecord);
		}
			
		System.out.println(" result "+this.outputRecord);

	}
	
	public GenericRecord getOutputRecord(Scriptable scrObj,GenericRecord resultRec) {
		Scriptable object = scrObj;
		GenericRecord record = resultRec;

			Object[] propertyIds = ScriptableObject.getPropertyIds(object);
			
			for (Object id : propertyIds) {
				String key = id.toString();
				Object value = ScriptableObject.getProperty(object, key);

				if (value instanceof NativeJavaObject) {
					record.put(key, ((NativeJavaObject) value).getDefaultValue(String.class));
				}else if(value instanceof ConsString) {
					record.put(key, value);
				}else if(value instanceof NativeJavaMethod){
					continue;
				}else{
					record.put(key, value);
				}
			}
		return record;
	}

}
