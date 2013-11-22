package org.wso2.datamapper.engine.inputAdapters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
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
import org.apache.commons.logging.impl.AvalonLogger;
import org.jaxen.JaxenException;
import org.mozilla.javascript.ConsString;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeJavaMethod;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.wso2.datamapper.engine.core.AvroWrapper;
import org.wso2.datamapper.engine.core.FunctionExecuter;
import org.wso2.datamapper.engine.models.MappingConfigModel;

public class XmlInputReader implements InputDataReaderAdapter{

	private OMElement documentElement;	
	private Iterator<OMElement> childElementIter;
	private Map<String, Schema> inputSchemaMap;
	private Map<String, Schema> outputSchemaMap;
	private Map<String, String> avroArrayMap;
	private HashMap<String, MappingConfigModel> mappingTypes;
	private FunctionExecuter funcExecuter;
	private GenericRecord rootRecord;
	private Iterator<OMElement> childArrayIter;

	public boolean hasChildRecords() {
		return childElementIter.hasNext();
	}
	
	public void setAvroArrayData(Map<String, String> avroArrayMap) {
		this.avroArrayMap = avroArrayMap;
	}

	public void setMappingTypes(HashMap<String, MappingConfigModel> mappingTypes) {
		this.mappingTypes = mappingTypes;
	}

	public void setInputSchemaMap(Map<String, Schema> inputSchemaMap) {
		this.inputSchemaMap = inputSchemaMap;
	}

	public void setFuncExecuter(FunctionExecuter funcExecuter) {
		this.funcExecuter = funcExecuter;
	}

	public GenericRecord getRootRecord() {
		return rootRecord;
	}

	public void setRootRecord(GenericRecord rootRecord) {
		this.rootRecord = rootRecord;
	}

	public void setInputFile(File inputFile) {
		
		try {
			InputStream in = new FileInputStream(inputFile);
			OMXMLParserWrapper builder = OMXMLBuilderFactory.createOMBuilder(in);
			this.documentElement = builder.getDocumentElement();
			childElementIter = this.documentElement.getChildElements();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public GenericRecord getChildRecord() {
		
		OMElement childElement = null;
		String childName;	
			
		childElement = childElementIter.next();
		childName = childElement.getLocalName();
				
		GenericRecord childRecord = getChild(childElement);
			
		if (childRecord == null) {
			rootRecord.put(childName, childElement.getText());
		}
		
		return childRecord;
	}

	public GenericRecord getChild(OMElement element) {
		
		GenericRecord childRec = null;
		OMElement parentElement = element;	
		
		Schema sc = inputSchemaMap.get(parentElement.getLocalName());
		
		if(sc != null) {
			OMElement childElement = null;
			if( sc.getType() == Schema.Type.RECORD){
				
				childRec = new GenericData.Record(sc);		
				Iterator<OMElement> childIter = parentElement.getChildElements();
				
				while (childIter.hasNext()) {
					childElement = childIter.next();
					childRec.put(childElement.getLocalName(), childElement.getText());
				}			
			}			
		}
		
		return childRec;
	}
	
	public OMElement getChildElement(OMElement ele , Iterator<OMElement> childIter) {
		
		OMElement element = ele;
		Iterator<OMElement> iter = childIter;
		OMElement childElement = null;
		
		if(iter.hasNext()){
			childElement = iter.next();
			getChildElement(childElement, childElement.getChildElements());
		}

		return childElement;
		
	}


}
