package org.wso2.tools.mar;

import org.apache.axis2.context.OperationContext;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.deployment.DeploymentConstants;
import org.xml.sax.SAXParseException;
import org.xml.sax.SAXException;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import java.util.Map;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipEntry;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.validation.*;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.sax.SAXSource;
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

public class ModuleValidator {
    private OperationContext operationContext;

    public static String FILE_RESOURCE_MAP = "file.resource.map";
    private static final String DEFAULT_SCHEMA_LANGUAGE = "http://www.w3.org/2001/XMLSchema";

    public static final String MODULE_XML_SCHEMA_URL =
            "http://svn.apache.org/viewvc/webservices/axis2/trunk/java/xdocs/latest/resources/schemas/module.xsd?view=co";

    public void setOperationContext(OperationContext operationContext) {
        this.operationContext = operationContext;
    }

    public void validate(String fileId) throws ValidationException {

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

                // now validate the module.xml files against the schema
                ModuleXMLErrorHandler moduleXMLErrorHandler = validateAgainstModuleXMLSchema(zin);
                if (moduleXMLErrorHandler.isValidationError()) {
                    throw new ValidationException(moduleXMLErrorHandler.getSaxParseException());
                }

            }
        } catch (Exception e) {
            throw new ValidationException(e);
        }
    }

    public void validateModuleXML(String fileId) throws ValidationException {

        String marFileLocation = null;
        try {
            marFileLocation = getFilePathFromFileId(fileId);

            // now validate the module.xml files against the schema
            ModuleXMLErrorHandler moduleXMLErrorHandler =
                    validateAgainstModuleXMLSchema(new FileInputStream(marFileLocation));
            if (moduleXMLErrorHandler.isValidationError()) {
                throw new ValidationException(moduleXMLErrorHandler.getSaxParseException());
            }
        } catch (Exception e) {
            throw new ValidationException(e);
        }
    }

    protected ModuleXMLErrorHandler validateAgainstModuleXMLSchema(InputStream zin)
            throws SAXException, IOException {
        SchemaFactory factory = SchemaFactory.newInstance(DEFAULT_SCHEMA_LANGUAGE);
        ModuleXMLErrorHandler moduleXMLErrorHandler = new ModuleXMLErrorHandler();
        factory.setErrorHandler(moduleXMLErrorHandler);
        Schema schema = factory.newSchema(new StreamSource(MODULE_XML_SCHEMA_URL));

        javax.xml.validation.Validator validator = schema.newValidator();
        validator.setErrorHandler(moduleXMLErrorHandler);
        XMLReader reader = XMLReaderFactory.createXMLReader();
        SAXSource source = new SAXSource(reader, new InputSource(zin));
        validator.validate(source);
        return moduleXMLErrorHandler;
    }

    private String getFilePathFromFileId(String fileId) {
        ConfigurationContext configCtx =
                operationContext.getConfigurationContext();
        Map fileResMap =
                (Map) configCtx.getProperty(FILE_RESOURCE_MAP);
        return (String) fileResMap.get(fileId);
    }


    /**
     * This class handles validation errors to be used for error reporting
     */
    private class ModuleXMLErrorHandler extends DefaultHandler {

        private boolean validationError = false;
        private SAXParseException saxParseException = null;

        public void error(SAXParseException exception) throws SAXException {
            validationError = true;
            saxParseException = exception;
        }

        public void fatalError(SAXParseException exception) throws SAXException {
            validationError = true;
            saxParseException = exception;
        }

        public void warning(SAXParseException exception) throws SAXException {
        }

        public boolean isValidationError() {
            return validationError;
        }

        public SAXParseException getSaxParseException() {
            return saxParseException;
        }
    }
}
