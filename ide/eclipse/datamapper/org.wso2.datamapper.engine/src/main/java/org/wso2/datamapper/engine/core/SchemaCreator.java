package org.wso2.datamapper.engine.core;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.avro.Schema;
import org.apache.avro.Schema.Field;

public class SchemaCreator {

	private Map<String, Schema> schemaMap;
	private String fieldName;
	
	public SchemaCreator(){
		this.schemaMap = new LinkedHashMap<String, Schema>();
	}
	
	public void setSchema(Schema schema) {

		if(schema.getType() == Schema.Type.ARRAY){
			this.schemaMap.put(this.fieldName, schema);
			this.fieldName = null;
			setSchema(schema.getElementType());
			
		} else if(schema.getType() == Schema.Type.RECORD){
			
			this.schemaMap.put(schema.getName(), schema);
			Iterator<Field> fieldItr = schema.getFields().listIterator();
			Schema.Field field;
			
			while (fieldItr.hasNext()) {
				field = (Schema.Field) fieldItr.next();
				this.fieldName = field.name();
				setSchema(field.schema());
			}
		}
	}

	public Map<String, Schema> getSchemaMap() {
		return this.schemaMap;
	}

}
