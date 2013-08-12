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

	private AXIOMXPath xpathExpression;
	private List<OMElement> nodeList;
	private List<String> inputValueList;
	private OMElement documentElement;

	@Override
	public void setInputReader(File inputFile) {
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
	public List readInputvalues(String elementXPath) {
		
		elementXPath = "//" + elementXPath.replace('.', '/');
		this.nodeList = new ArrayList<OMElement>();
		this.inputValueList = new ArrayList<String>();

		try {
			xpathExpression = new AXIOMXPath(elementXPath);
			this.nodeList = xpathExpression.selectNodes(this.documentElement);
			
			Iterator<OMElement> xmlElementIterator = this.nodeList.listIterator();
			OMElement element;
			
			while (xmlElementIterator.hasNext()) {
				element = xmlElementIterator.next();
				inputValueList.add(element.getText());		
			}
			

		} catch (JaxenException e) {
			e.printStackTrace();
		}

		return this.inputValueList;
	}

}
