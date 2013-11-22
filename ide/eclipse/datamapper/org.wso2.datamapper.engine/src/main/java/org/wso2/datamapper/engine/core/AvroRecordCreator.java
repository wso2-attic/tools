package org.wso2.datamapper.engine.core;

import java.util.HashMap;

import org.apache.avro.Schema;
import org.apache.avro.Schema.Field;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.axiom.om.OMElement;
import org.wso2.datamapper.engine.models.MappingConfigModel;

public class AvroRecordCreator {
	
	public GenericRecord genRecord(Schema schema){
		
		GenericRecord record = null;
		
		if(schema.getType() == Schema.Type.RECORD){
			record = new GenericData.Record(schema);
			
			for (Field field : schema.getFields()) {
				
				if(field.schema().getType() == Schema.Type.RECORD){
					record.put(field.name(), genRecord(field.schema()));
				}		
			}
		}

		return record;
		
	}
	
}
