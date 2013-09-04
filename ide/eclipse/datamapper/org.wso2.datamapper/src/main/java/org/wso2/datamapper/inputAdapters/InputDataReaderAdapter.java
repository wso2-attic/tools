package org.wso2.datamapper.inputAdapters;

import java.io.File;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;

public interface InputDataReaderAdapter {

	public void setInputReader(File inputFile);
	public GenericRecord readInputvalues(Schema schema);
	
}
