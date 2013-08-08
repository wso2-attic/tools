/*
 * Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.datamapper.inputAdapters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMXMLBuilderFactory;
import org.apache.axiom.om.OMXMLParserWrapper;
import org.apache.axiom.om.xpath.AXIOMXPath;
import org.jaxen.JaxenException;

public class XmlInputReader implements InputDataReaderAdapter {

	private File inputFile;
	private AXIOMXPath xpathExpression;
	private List<OMElement> nodeList;
	private OMElement documentElement;
	private Iterator<OMElement> it;
	private List<String> inputValueList;

	@Override
	public void setInputReader(File inputFile) {
		this.inputFile = inputFile;
		try {
			InputStream in = new FileInputStream(inputFile);
			OMXMLParserWrapper builder = OMXMLBuilderFactory.createOMBuilder(in);
			this.documentElement = builder.getDocumentElement();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<OMElement> readInputvalues(String elementPath) {
		
		elementPath = "//" + elementPath.replace('.', '/');
		this.nodeList = new ArrayList<OMElement>();

		try {
			xpathExpression = new AXIOMXPath(elementPath);
			String temp ="";
			this.nodeList = xpathExpression.selectNodes(this.documentElement);

		} catch (JaxenException e) {
			e.printStackTrace();
		}

		return this.nodeList;
	}

}
