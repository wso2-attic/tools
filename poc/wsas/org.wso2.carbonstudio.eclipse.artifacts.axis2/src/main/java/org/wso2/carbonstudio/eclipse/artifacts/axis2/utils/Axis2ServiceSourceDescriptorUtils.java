/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbonstudio.eclipse.artifacts.axis2.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.wso2.carbonstudio.eclipse.artifacts.axis2.Activator;
import org.wso2.carbonstudio.eclipse.artifacts.axis2.model.Axis2SourceDescriptor;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

/**
 * @deprecated
 * @author saminda
 *
 */
public class Axis2ServiceSourceDescriptorUtils {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	public static Axis2SourceDescriptor loadAxis2SourceDescriptor(IFile file){
		return loadAxis2SourceDescriptor(file.getLocation());
	}

	public static Axis2SourceDescriptor loadAxis2SourceDescriptor(InputStream stream) {
	    Properties properties = new Properties();
		try {
	        properties.load(stream);
	        Axis2SourceDescriptor axis2SourceDescriptor = new Axis2SourceDescriptor();
	        axis2SourceDescriptor.setServiceName(properties.getProperty(Axis2SourceDescriptor.SERVICE_NAME));
	        axis2SourceDescriptor.setProjectName(properties.getProperty(Axis2SourceDescriptor.PROJECT_NAME));
	        axis2SourceDescriptor.setClassName(properties.getProperty(Axis2SourceDescriptor.CLASS_NAME));
	        axis2SourceDescriptor.setClassLocation(properties.getProperty(Axis2SourceDescriptor.CLASS_LOCATION));
	        axis2SourceDescriptor.setReferencedProjects(properties.getProperty(Axis2SourceDescriptor.REFERENCE_PROJECTS));
	        axis2SourceDescriptor.setReferencedLibraries(properties.getProperty(Axis2SourceDescriptor.REFERENCE_LIBRARIES));
	        axis2SourceDescriptor.setProjectReferences(Boolean.parseBoolean(properties.getProperty(Axis2SourceDescriptor.SERVICE_PROJECT_REFERENCES)));
	        axis2SourceDescriptor.setServiceType(properties.getProperty(Axis2SourceDescriptor.SERVICE_TYPE).toUpperCase());
	        axis2SourceDescriptor.setServerRole(properties.getProperty(Axis2SourceDescriptor.SERVER_ROLE));
	        axis2SourceDescriptor.setVersion(properties.getProperty(Axis2SourceDescriptor.ARTIFACT_VERSION));
	        return axis2SourceDescriptor;
        } catch (FileNotFoundException e) {
	        log.error(e);
        } catch (IOException e) {
	        log.error(e);
        }
        return null;
    }
	
	public static Axis2SourceDescriptor loadAxis2SourceDescriptor(IPath axis2SourceDescriptorFilePath) {
		try {
	        return loadAxis2SourceDescriptor(new FileInputStream(axis2SourceDescriptorFilePath.toOSString()));
        } catch (FileNotFoundException e) {
	        log.error(e);
        }
        return null;
	}
	
	public static void saveAxis2SourceDescriptor(IPath axis2SourceDescriptorFilePath,Axis2SourceDescriptor axis2SourceDescriptor) {
		FileOutputStream fileOutputStream;
        try {
	        fileOutputStream = new FileOutputStream(axis2SourceDescriptorFilePath.toOSString());
			fileOutputStream.write(saveAxis2SourceDescriptor(axis2SourceDescriptor));
        } catch (FileNotFoundException e) {
	        log.error(e);
        } catch (IOException e) {
	        log.error(e);
        }

	}
	
	public static byte[] saveAxis2SourceDescriptor(Axis2SourceDescriptor axis2SourceDescriptor) {
	    Properties properties = new Properties();
        properties.setProperty(Axis2SourceDescriptor.SERVICE_NAME,axis2SourceDescriptor.getServiceName()!=null ? axis2SourceDescriptor.getServiceName():"");
        properties.setProperty(Axis2SourceDescriptor.PROJECT_NAME,axis2SourceDescriptor.getProjectName()!=null ? axis2SourceDescriptor.getProjectName():"");
        properties.setProperty(Axis2SourceDescriptor.CLASS_NAME,axis2SourceDescriptor.getClassName()!=null ? axis2SourceDescriptor.getClassName():"");
        properties.setProperty(Axis2SourceDescriptor.CLASS_LOCATION,axis2SourceDescriptor.getClassLocation()!=null ? axis2SourceDescriptor.getClassLocation():"");
        properties.setProperty(Axis2SourceDescriptor.REFERENCE_PROJECTS,axis2SourceDescriptor.getReferencedProjects()!=null ? axis2SourceDescriptor.getReferencedProjects():"");
        properties.setProperty(Axis2SourceDescriptor.REFERENCE_LIBRARIES,axis2SourceDescriptor.getReferencedLibraries()!=null ? axis2SourceDescriptor.getReferencedLibraries():"");
        properties.setProperty(Axis2SourceDescriptor.SERVICE_PROJECT_REFERENCES,Boolean.toString(axis2SourceDescriptor.isProjectReferences()));
        properties.setProperty(Axis2SourceDescriptor.SERVICE_TYPE,axis2SourceDescriptor.getServiceType()!=null ? axis2SourceDescriptor.getServiceType():"AXIS2");
        properties.setProperty(Axis2SourceDescriptor.SERVER_ROLE,axis2SourceDescriptor.getServerRole()!=null ? axis2SourceDescriptor.getServerRole():"");
        properties.setProperty(Axis2SourceDescriptor.ARTIFACT_VERSION,axis2SourceDescriptor.getVersion());
        try {
        	//FIXME
        	StringWriter stringWriter = new StringWriter();
//        	properties.store(stringWriter, null);
        	return stringWriter.getBuffer().toString().getBytes();
        } catch (Exception e) {
	        log.error(e);
        }
        return null;
	}

}
