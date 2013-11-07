package org.wso2.datamapper.engine.inputAdapters;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;
import org.apache.axiom.om.OMElement;
import org.wso2.datamapper.engine.core.AvroRecordCreator;

public interface InputDataReaderAdapter {
	
	public void setInputFile(File inputFile);
	public List<GenericRecord> getInputRecordList(Schema schema , OMElement element);
	public OMElement getRootElement() ;
	public GenericRecord getInputRecord(Schema schema , OMElement element);
}