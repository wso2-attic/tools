package org.wso2.datamapper.inputAdapters;

import java.io.File;
import java.util.List;

public interface InputDataReaderAdapter {

	public void setInputReader(File inputFile);
	public List<String> readInputvalues(String elementPath, int index);
	
}
