package org.wso2.datamapper.engine.core;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.avro.Schema;
import org.apache.avro.Schema.Field;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.axiom.om.OMElement;
import org.wso2.datamapper.engine.models.MappingConfigModel;

public class AvroRecordCreator {
	
	
	private OMElement rootElement;
	private HashMap<String, MappingConfigModel> mappingTypes;

	public void setRootElement(OMElement rootElement) {
		this.rootElement = rootElement;
	}

	public void setMappingTypes(HashMap<String, MappingConfigModel> mappingTypes) {
		this.mappingTypes = mappingTypes;
	}
	
	public GenericRecord genRecord(Schema schema){
		
		GenericRecord record = null;
		
		if(schema.getType() == Schema.Type.RECORD){
			record = new GenericData.Record(schema);
			
			for (Field field : schema.getFields()) {
				
				if(field.schema().getType() == Schema.Type.RECORD){
					record.put(field.name(), genRecord(field.schema()));
				}else if(field.schema().getType() == Schema.Type.ARRAY){
					//record.put(field.name(), new GenericData.Array<GenericRecord>(1, field.schema()));
				}		
			}
		}else if(schema.getType() == Schema.Type.ARRAY){
			Schema sc = schema.getElementType();
			record = genRecord(sc);
		}

		return record;
		
	}
	
	public void test() {
		
	}
	
	
/*	private Map<String, Schema> schemaMap;
	private String dataType;
	private GenericRecord record;
	
	
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public void setSchemaMap(Map<String, Schema> schemaMap) {
		this.schemaMap = schemaMap;
	}

	public GenericRecord getRecord() {
		getChildrecord(this.dataType);
		
		return this.record;
	}
	
	private void getChildrecord(String dataType) {
		
		System.out.println("keyss "+this.schemaMap.keySet());
		Set<String> schemaKeys = this.schemaMap.keySet();
		
		Iterator<String> keyItr = schemaKeys.iterator();
		
		while (keyItr.hasNext()) {
			String key = (String) keyItr.next();
			Schema schema = this.schemaMap.get(key);
			System.out.println("key "+key+"  : "+schema);
			
			
			if (schema.getType() == Schema.Type.RECORD) {
				if(this.record == null){
					this.record = new GenericData.Record(schema);
				}else{
					GenericRecord childRecord = new GenericData.Record(schema);
					this.record.put(key, childRecord);
				}
			} else if (schema.getType() == Schema.Type.ARRAY) {
				
				GenericData.Array<GenericRecord> recArray =  new GenericData.Array<GenericRecord>(1, schema);
				this.record.put(key, recArray);
			}
			System.out.println("llll "+this.record);

		}
		
		
		
		Schema sc = this.schemaMap.get(dataType);
		System.out.println("keyss "+this.schemaMap.keySet());
		
		//GenericRecord record = new GenericData.Record(sc);
		GenericData.Array<GenericRecord> recArray;
		//GenericRecord record;
		
		Iterator<Schema> schemaITr = this.schemaMap.values().iterator();
		
		while (schemaITr.hasNext()) {
				
			Schema schema = schemaITr.next();
			
			if (schema.getType() == Schema.Type.RECORD) {
				System.out.println("record 1 "+schema.getName());
				if(schema.getName().equals("root")){
					this.record = new GenericData.Record(schema);
					continue;
				}
				GenericRecord childRecord = new GenericData.Record(schema);
				this.record.put(schema.getName(), childRecord);
				System.out.println("qqqqq eeee "+this.record);
			} else if (schema.getType() == Schema.Type.ARRAY) {
				System.out.println("record 2 "+schema.getName());
				recArray =  new GenericData.Array<GenericRecord>(2, schema);
				this.record.put(schema.getName(), recArray);
				//recArray.add(getChildrecord(field.name()));
			}
			
			System.out.println("vvvvvv "+this.record);
			
		}
		
		
		
		if(sc.getType() == Schema.Type.RECORD){
			System.out.println("record "+sc.getName()+" "+sc.getType());
			record = new GenericData.Record(sc);
			getChildrecord(sc.getName());
		}else if(sc.getType() == Schema.Type.ARRAY){
			System.out.println("array  "+sc.getName()+" "+sc.getType().getName());
			getChildrecord(sc.getName());
			record = new GenericData.Record(sc);
		}
		
		

		for (Field field : sc.getFields()) {
			if(field.schema().getType() == Schema.Type.RECORD){
				record = new GenericData.Record(sc);
				record .put(field.name(), getChildrecord(field.name()));
			}else if(field.schema().getType() == Schema.Type.ARRAY){
				GenericData.Array<GenericRecord> recArray =  new GenericData.Array<GenericRecord>(2, field.schema());
				recArray.add(getChildrecord(field.name()));
			}else{
				
			}		
		}
		System.out.println("recprddddd "+record);
	
	}*/
	
	
}
