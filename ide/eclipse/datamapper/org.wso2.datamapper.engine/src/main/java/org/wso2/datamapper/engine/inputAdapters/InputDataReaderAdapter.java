package org.wso2.datamapper.engine.inputAdapters;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;
import org.apache.axiom.om.OMElement;
import org.wso2.datamapper.engine.core.AvroRecordCreator;
import org.wso2.datamapper.engine.core.FunctionExecuter;
import org.wso2.datamapper.engine.models.MappingConfigModel;

public interface InputDataReaderAdapter {
	
	public void setInputFile(File inputFile);
	public boolean hasChildRecords();
	public void setInputSchemaMap(Map<String, Schema> inputSchemaMap);
	public void setAvroArrayData(Map<String, String> avroArrayMap );
	public void setMappingTypes(HashMap<String, MappingConfigModel> mappingTypes);
	public void setFuncExecuter(FunctionExecuter funcExecuter);
	public void setRootRecord(GenericRecord rootRecord);
	public GenericRecord getRootRecord();
	public GenericRecord getChildRecord();
}