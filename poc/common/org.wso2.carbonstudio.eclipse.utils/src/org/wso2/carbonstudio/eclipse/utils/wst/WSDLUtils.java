/*
 * Copyright 2005,2006 WSO2, Inc. http://www.wso2.org
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

package org.wso2.carbonstudio.eclipse.utils.wst;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.net.URL;

import javax.wsdl.Definition;
import javax.wsdl.WSDLException;
import javax.wsdl.factory.WSDLFactory;
import javax.wsdl.xml.WSDLReader;
import javax.wsdl.xml.WSDLWriter;

/**
 * This class presents a convenient way of reading the 
 * WSDL file(url) and producing a useful set of information
 * It does NOT use any of the standard WSDL classes from 
 * Axis2, rather it uses wsdl4j to read the wsdl and extract 
 * the properties (This is meant as a convenience for the UI
 * only. We may not need the whole conversion the WSDLpump 
 * goes through)
 * One would need to change this to suit a proper WSDL 
 */
public class WSDLUtils {

	public static Definition readWSDL(URL url) throws Exception {
		WSDLFactory WSDLFactoryObject = WSDLFactory.newInstance();
		WSDLReader WSDLReaderObject = WSDLFactoryObject.newWSDLReader();
		Definition definitionInstance = WSDLReaderObject.readWSDL(null,url.toURI().toString());
		return definitionInstance;
	}

	public static void writeWSDL(Definition definition, OutputStream outputStream) throws WSDLException{
		WSDLFactory WSDLFactoryObject = WSDLFactory.newInstance();
		WSDLWriter wsdlWriter = WSDLFactoryObject.newWSDLWriter();
		wsdlWriter.writeWSDL(definition, outputStream);
	}
	
	public static void writeWSDL(Definition definition, Writer writer) throws WSDLException{
		WSDLFactory WSDLFactoryObject = WSDLFactory.newInstance();
		WSDLWriter wsdlWriter = WSDLFactoryObject.newWSDLWriter();
		wsdlWriter.writeWSDL(definition, writer);
	}
	
	public static void writeWSDL(Definition definition, File file) throws WSDLException, FileNotFoundException{
		writeWSDL(definition, new FileOutputStream(file));
	}

}

