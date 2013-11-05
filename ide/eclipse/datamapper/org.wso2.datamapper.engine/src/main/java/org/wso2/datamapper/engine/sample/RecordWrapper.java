package org.wso2.datamapper.engine.sample;

import org.apache.avro.generic.GenericRecord;

public class RecordWrapper {
	
	public void wrapRecord(GenericRecord record) {
		getWrapper(record);
	}
	
	public void getWrapper(GenericRecord record) {
		
		record.getSchema().getFields();
		
		
	}

}
