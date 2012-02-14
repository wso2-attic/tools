package org.wso2.tools.wsdl;

import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.OperationContext;
import org.apache.axis2.context.MessageContext;
import org.apache.woden.tool.converter.Convert;

import java.io.File;
import java.util.Map;
import java.util.Hashtable;
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

public class WSDLConverter {

    public static String FILE_RESOURCE_MAP = "file.resource.map";

    /**
     * This will convert a given WSDL v1.1 document to WSDL v2.0
     *
     * @param fileId - id to the path of the wsdl 1.1 document
     * @return path of the equivalent wsdl 2.0 document
     */
    public String convert(String fileId) throws WSDLConversionException {

        String wsdl11FilePath = getFilePathFromFileId(fileId);

        return convertWSDLFile(wsdl11FilePath);
    }

    protected String convertWSDLFile(String wsdl11FilePath) throws WSDLConversionException {

        //ID Generation
        String uuid = String.valueOf(System.currentTimeMillis() + Math.random());

        Convert converter = new Convert();
        try {
            int lastIndex = wsdl11FilePath.lastIndexOf('/');

            String filePath = wsdl11FilePath.substring(0, lastIndex);

            String fileName = converter.convertFile(null, wsdl11FilePath,
                                                    new File(wsdl11FilePath).getParent(), true,
                                                    false);

            File outFile = new File(filePath, fileName);

            ConfigurationContext configCtx =
                    MessageContext.getCurrentMessageContext().getConfigurationContext();
            Map fileResourcesMap =
                    (Map) configCtx.getProperty(FILE_RESOURCE_MAP);
            if (fileResourcesMap == null) {
                fileResourcesMap = new Hashtable();
                configCtx.setProperty(FILE_RESOURCE_MAP,fileResourcesMap);
            }

            fileResourcesMap.put(uuid,outFile.getAbsolutePath());

            return "/filedownload" + "?id=" + uuid;


        } catch (Exception e) {
            throw new WSDLConversionException(e.getMessage(), e);
        }
    }

    protected String getTargetFileLocation(String wsdl11FilePath) throws WSDLConversionException {
        File file = new File(wsdl11FilePath);
        if (file.isFile()) {
            String name = file.getName();
            String wsdlFileName = name.substring(0, name.lastIndexOf(".")) + "-wsdl20.wsdl";
            return file.getParent() + File.separator + wsdlFileName;
        } else {
            throw new WSDLConversionException("File path does not refers to a file");
        }
    }

    private String getFilePathFromFileId(String fileId) {
        ConfigurationContext configCtx =
                MessageContext.getCurrentMessageContext().getConfigurationContext();
        Map fileResMap =
                (Map) configCtx.getProperty(FILE_RESOURCE_MAP);
        return (String) fileResMap.get(fileId);
    }
}
