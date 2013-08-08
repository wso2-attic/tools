package org.wso2.datamapper.inputAdapters;

import java.io.File;
import java.util.List;

import org.apache.axiom.om.OMElement;

public interface InputDataReaderAdapter {

	public void setInputReader(File inputFile);
	public List<OMElement> readInputvalues(String elementPath);
	
}
