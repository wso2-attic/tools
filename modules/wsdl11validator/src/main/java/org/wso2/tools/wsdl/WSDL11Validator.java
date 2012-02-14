package org.wso2.tools.wsdl;

import com.ibm.wsdl.util.xml.DOM2Writer;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.MessageContext;
import org.eclipse.wst.wsdl.validation.internal.IValidationMessage;
import org.eclipse.wst.wsdl.validation.internal.IValidationReport;
import org.eclipse.wst.wsdl.validation.internal.WSDLValidationConfiguration;
import org.eclipse.wst.wsdl.validation.internal.WSDLValidator;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Map;

/*
 * Copyright 2004,2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * The implementation class for the WSDL 1.1 Validator service. It uses the
 * org.eclipse.wst.wsdl.validation plugin of eclipse to acccomplish this task
 */

public class WSDL11Validator {

    public static String FILE_RESOURCE_MAP = "file.resource.map";
    public static final String MODULE_XSL_FORMATTER_LOCATION =
            "net/wso2/tools/wsdl/module_formatter.xsl";

    /**
     * The validate method that is called to validate the WSDL
     *
     * @param fileId - The ID of the file to be validated
     * @return - A string which contains the validation details
     * @throws WSDL11ValidationException - Thrown in case an exception occurs
     */
    public String validate(String fileId) throws WSDL11ValidationException {


        String wsdlFileLocation;
        int SEV_ERROR = 0;
        int SEV_WARNING = 1;
        wsdlFileLocation = getFilePathFromFileId(fileId);

        // Initialize the WSDL validator
        WSDLValidator validator = new WSDLValidator();
        WSDLValidationConfiguration configuration = null;

        // Obtain the validation report

        IValidationReport valReport =
                validator.validate("file:" + wsdlFileLocation, null, configuration);

        // Obtain a dom document to create the intermediate XML file
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document document = null;
        DocumentBuilder builder = null;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException pce) {
            throw new WSDL11ValidationException(pce);

        }

        document = builder.newDocument();
        document.setXmlVersion("1.0");
        Element root = (Element) document.createElement("report");
        document.appendChild(root);

        // Set the namespaces of the root element
        root.setAttribute("xmlns:fn", "http://www.w3.org/2005/xpath-functions");
        root.setAttribute("xmlns:fo", "http://www.w3.org/1999/XSL/Format");
        root.setAttribute("xmlns:xdt", "http://www.w3.org/2005/xpath-datatypes");
        root.setAttribute("xmlns:xs", "http://www.w3.org/2001/XMLSchema");


        IValidationMessage[] validationMessages;
        validationMessages = valReport.getValidationMessages();

        // Iretare through the validation messages. Create an appropriate element for each message.
        for (int count = 0; count < valReport.getValidationMessages().length; count++) {

            Element child;
            IValidationMessage validationMessage = validationMessages[count];

            // The message is an error
            if (validationMessage.getSeverity() == SEV_ERROR) {
                child = document.createElement("error");
                child.setTextContent("Line number " + validationMessage.getLine() +
                        " , column number " + validationMessage.getColumn() + " : " +
                        validationMessage.getMessage());
            }

            // The message is an warning
            else if (validationMessage.getSeverity() == SEV_WARNING) {
                child = document.createElement("warning");
                child.setTextContent("Line number " + validationMessage.getLine() +
                        " , column number " + validationMessage.getColumn() + " : " +
                        validationMessage.getMessage());
            }
            // The message is any information
            else {
                child = document.createElement("info");
                child.setTextContent("Line number " + validationMessage.getLine() +
                        " , column number " + validationMessage.getColumn() + " : " +
                        validationMessage.getMessage());
            }

            root.appendChild(child);
        }

        // Transform the intermediate XML file
        try {
            return doTransformation(wsdlFileLocation, document);

        } catch (Exception e) {
            throw new WSDL11ValidationException(e);
        }
    }

    private String getFilePathFromFileId(String fileId) {
        ConfigurationContext configCtx =
                MessageContext.getCurrentMessageContext().getConfigurationContext();
        Map fileResMap =
                (Map) configCtx.getProperty(FILE_RESOURCE_MAP);
        return (String) fileResMap.get(fileId);
    }


    private File getOutputFilePath(String xmlfilePath, String xmlFileName) {
        int lastIndex = xmlfilePath.lastIndexOf('/');

        String filePath = xmlfilePath.substring(0, lastIndex);

        return new File(filePath, xmlFileName);
    }

    /**
     * Transform the intermidiate file to HTML form
     *
     * @param inFilePath - The path of the input file
     * @param doc        - The intermidiate DOM document
     * @return - The path of the generated html file
     * @throws WSDL11ValidationException - Thrown in case an exception occurs
     */
    private String doTransformation(String inFilePath, Document doc) throws
            WSDL11ValidationException {

        //ID Generation
        String uuid = String.valueOf(System.currentTimeMillis() + Math.random());
        try {
            String fileName = uuid + ".html";

            File outFile = getOutputFilePath(inFilePath, fileName);

            InputStream xslForamtterStream =
                    getClass().getClassLoader().getResourceAsStream(MODULE_XSL_FORMATTER_LOCATION);
            Source xslForamtterSource = new StreamSource(xslForamtterStream);
            Result finalResult = new StreamResult(outFile);

            //Transform the document
            Transformer transformer = TransformerFactory.newInstance()
                    .newTransformer(xslForamtterSource);
            transformer.transform(new DOMSource(doc), finalResult);

            //setting the FileoutputPath to ConfigurationContext
            ConfigurationContext configCtx =
                    MessageContext.getCurrentMessageContext().getConfigurationContext();
            Map fileResourcesMap =
                    (Map) configCtx.getProperty(FILE_RESOURCE_MAP);
            if (fileResourcesMap == null) {
                fileResourcesMap = new Hashtable();
                configCtx.setProperty(FILE_RESOURCE_MAP, fileResourcesMap);
            }

            fileResourcesMap.put(uuid, outFile.getAbsolutePath());

        } catch (Exception e) {
            throw new WSDL11ValidationException(e);
        }
        return "/filedownload/*" + "?id=" + uuid;
    }
}
