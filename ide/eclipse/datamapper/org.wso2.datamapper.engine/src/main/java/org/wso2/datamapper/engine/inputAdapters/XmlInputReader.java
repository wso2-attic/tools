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
	private String complexElementId;
	private Type schemaType;
	private Field field;
	private String inputType;
	private Map<String, Schema> schemaMap;
	
	public void setInputReader(File inputFile) {
		try {
			InputStream in = new FileInputStream(inputFile);
			OMXMLParserWrapper builder = OMXMLBuilderFactory.createOMBuilder(in);
			this.documentElement = builder.getDocumentElement();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void setSchemaMap(Map<String, Schema> schemaMap) {
		this.schemaMap = schemaMap;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}
	
	public OMElement getRootElement() {
		return this.documentElement;
	}

	public List<GenericRecord> getInputRecordList(Schema schema , String xpath) {
		
		AXIOMXPath xpathExpression;
		Iterator<OMElement> machinElementsItr = null;
		Iterator<OMElement> childElementsItr = null;
		List<GenericRecord> recordList = new ArrayList<GenericRecord>();
		AvroRecordCreator recCreator = new AvroRecordCreator();
		
		try {
			xpathExpression = new AXIOMXPath ("//"+xpath);
			machinElementsItr = xpathExpression.selectNodes(this.documentElement).listIterator();
			OMElement childElement;
			while (machinElementsItr.hasNext()) {
				childElement = (OMElement) machinElementsItr.next();
				GenericRecord rec = recCreator.genRecord(schema);
				Schema inSchema = rec.getSchema();
				Iterator<Field> fieldItr = inSchema.getFields().listIterator();
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
		
		} catch (JaxenException e) {
			e.printStackTrace();
		}
		
		return recordList;
	}
	
	public GenericRecord getInputRecord(Schema schema , String elementId){
		
		AvroRecordCreator recCreator = new AvroRecordCreator();
		GenericRecord rec = recCreator.genRecord(schema);
		
		AXIOMXPath xpathExpression;
		Iterator<OMElement> childElementsItr = null;
		
		try {
			xpathExpression = new AXIOMXPath ("//"+elementId);
			OMElement element = (OMElement)xpathExpression.selectSingleNode(this.documentElement);
			
			Schema inSchema = rec.getSchema();
			Iterator<Field> fieldItr = inSchema.getFields().listIterator();
			Schema.Field field;
			
			while (fieldItr.hasNext()) {
				field = fieldItr.next();
				
				if ((field.schema().getType() != Schema.Type.RECORD) && (field.schema().getType() != Schema.Type.ARRAY)) {
					childElementsItr = element.getChildrenWithLocalName(field.name());
					
					while (childElementsItr.hasNext()) {
						OMElement ele = childElementsItr.next();						
						rec.put(field.name(), ele.getText());
					}	
				}		
			}
			
		} catch (JaxenException e) {
			e.printStackTrace();
		}
		
		return rec;
	}

	public Iterator<OMElement> getInputElementIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
