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
	
	public void setInputReader(File inputFile);
	public List<GenericRecord> getInputRecordList(Schema schema,String element);
	public void setInputType(String inputType);
	public OMElement getRootElement() ;
	public void setSchemaMap(Map<String, Schema> schemaMap);
	public GenericRecord getInputRecord(Schema schema , String elementId);
	public Iterator<OMElement> getInputElementIterator();
}