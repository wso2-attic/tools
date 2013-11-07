package org.wso2.datamapper.engine.inputAdapters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.avro.Schema;
import org.apache.avro.Schema.Field;
import org.apache.avro.Schema.Type;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMXMLBuilderFactory;
import org.apache.axiom.om.OMXMLParserWrapper;
import org.apache.axiom.om.xpath.AXIOMXPath;
import org.jaxen.JaxenException;
import org.wso2.datamapper.engine.core.AvroRecordCreator;
import org.wso2.datamapper.engine.models.MappingConfigModel;

public class XmlInputReader implements InputDataReaderAdapter{

	private OMElement documentElement;	
	
	public void setInputFile(File inputFile) {
		try {
			InputStream in = new FileInputStream(inputFile);
			OMXMLParserWrapper builder = OMXMLBuilderFactory.createOMBuilder(in);
			this.documentElement = builder.getDocumentElement();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public OMElement getRootElement() {
		return this.documentElement;
	}

	public List<GenericRecord> getInputRecordList(Schema schema , OMElement element) {

		OMElement parentElement = element;
		Iterator<OMElement> childItr = null;
		Iterator<OMElement> childElementsItr = null;
		List<GenericRecord> recordList = new ArrayList<GenericRecord>();
		
		childItr = parentElement.getChildElements();
		OMElement childElement;
		
		while (childItr.hasNext()) {
			childElement = childItr.next();
			GenericRecord rec = new GenericData.Record(schema);
			
			Iterator<Field> fieldItr = schema.getFields().listIterator();
			Schema.Field field;
			
			while (fieldItr.hasNext()) {
				field = fieldItr.next();
				
				if ((field.schema().getType() != Schema.Type.RECORD) && (field.schema().getType() != Schema.Type.ARRAY)) {
					childElementsItr = childElement.getChildrenWithLocalName(field.name());
					
					while (childElementsItr.hasNext()) {
						OMElement ele = childElementsItr.next();						
						rec.put(field.name(), ele.getText());
					}	
				}	
			}
			recordList.add(rec);
			
		}		
		return recordList;
	}
	
	public GenericRecord getInputRecord(Schema schema , OMElement element){
		
		OMElement childElement = element;
		GenericRecord record = new GenericData.Record(schema);
		
		Iterator<Field> fieldItr = schema.getFields().listIterator();
		Schema.Field field;
		
		Iterator<OMElement> childElementsItr = null;
		
		while (fieldItr.hasNext()) {
			field = fieldItr.next();
			
			if ((field.schema().getType() != Schema.Type.RECORD) && (field.schema().getType() != Schema.Type.ARRAY)) {
				childElementsItr = childElement.getChildrenWithLocalName(field.name());
				
				while (childElementsItr.hasNext()) {
					OMElement ele = childElementsItr.next();						
					record.put(field.name(), ele.getText());
				}	
			}	
		}
		System.out.println("record "+record);
		return record;
	}	

}
