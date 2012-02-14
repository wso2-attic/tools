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
package org.wso2.tools.mar;

import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.deployment.DeploymentConstants;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/*
 * 
 */

public class ModuleXSLValidator {

    public static String FILE_RESOURCE_MAP = "file.resource.map";
    public static final String MODULE_XSL_LOCATION = "org/wso2/tools/mar/module_validator.xsl";
    public static final String MODULE_XSL_FORMATTER_LOCATION =
            "org/wso2/tools/mar/module_formatter.xsl";

    public String validate(String fileId) throws AxisFault {

        String marFileLocation = getFilePathFromFileId(fileId);

        try {
            // first whether the archive extension is mar
            if (!marFileLocation.endsWith(".mar")) {
                throw new ValidationException("Axis modules must always be mar files.");
            } else {

                // lets check whether this archive contains a module.xml file inside the META-INF
                ZipInputStream zin = new ZipInputStream(new FileInputStream(marFileLocation));
                ZipEntry entry;
                boolean moduleXMLFound = false;
                while ((entry = zin.getNextEntry()) != null) {
                    if (entry.getName().equalsIgnoreCase(DeploymentConstants.MODULE_XML)) {
                        moduleXMLFound = true;
                        break;
                    }
                }
                if (!moduleXMLFound) {
                    throw new ValidationException(
                            "module.xml not found in " + DeploymentConstants.MODULE_XML);
                }
                return doTransformation(zin, marFileLocation);

            }
        } catch (Exception e) {
            throw AxisFault.makeFault(e);
        }
    }

    public String validateModuleXML(String fileId) throws AxisFault {

        String marFileLocation;
        try {
            marFileLocation = getFilePathFromFileId(fileId);

            return doTransformation(new FileInputStream(marFileLocation), marFileLocation);

        } catch (Exception e) {
            throw AxisFault.makeFault(e);
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

    private String doTransformation(InputStream xmlStream, String inFilePath) throws AxisFault {

        //ID Generation
        String uuid = String.valueOf(System.currentTimeMillis() + Math.random());
        try {
//            InputStream xslStream = Thread.currentThread().getContextClassLoader()
//                    .getResourceAsStream(MODULE_XSL_LOCATION);
            InputStream xslStream =
                    getClass().getClassLoader().getResourceAsStream(MODULE_XSL_LOCATION);
            InputStream xslForamtterStream =
                    getClass().getClassLoader().getResourceAsStream(MODULE_XSL_FORMATTER_LOCATION);
            Source xmlSource = new StreamSource(xmlStream);
            Source xslSource = new StreamSource(xslStream);
            Source xslForamtterSource = new StreamSource(xslForamtterStream);

            String fileName = uuid + ".html";

            File outFile = getOutputFilePath(inFilePath, fileName);

            DocumentBuilder docB = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = docB.newDocument();

            //do the first transformation
            Result result = new DOMResult(doc);
            Transformer transformer = TransformerFactory.newInstance()
                    .newTransformer(xslSource);
            transformer.transform(xmlSource, result);

            ///////////////////////////////////////////////////
//            System.out.println(DOM2Writer.nodeToString(doc));
            ////////////////////////////////////////////////////

            //the second transformation
            Result finalResult = new StreamResult(outFile);
            transformer = TransformerFactory.newInstance()
                    .newTransformer(xslForamtterSource);
            //setting the FileoutputPath to ConfigurationContext
            transformer.transform(new DOMSource(doc), finalResult);


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
            throw AxisFault.makeFault(e);
        }
        return "/filedownload" + "?id=" + uuid;
    }
}
