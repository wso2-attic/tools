package org.wso2.datamapper.inputAdapters;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;
import org.apache.axiom.om.OMElement;

public interface InputDataReaderAdapter {

	public void setInputReader(File inputFile);
	public GenericRecord readInputvalues(Schema schema);
	
}
