/*
 * Copyright WSO2, Inc. (http://wso2.com)
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

package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.cloudconnector;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.synapse.config.xml.TemplateMediatorFactory;
import org.apache.synapse.mediators.template.TemplateMediator;
import org.eclipse.emf.ecore.xml.type.internal.QName;
import org.wso2.developerstudio.eclipse.capp.core.manifest.ArtifactDependency;
import org.wso2.developerstudio.eclipse.esb.project.artifact.Artifact;
import org.wso2.developerstudio.eclipse.esb.project.artifact.Artifacts;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer.MediatorFactoryUtils;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;

public class CloudConnectorDirectoryTraverser {

	private static final String synapseNS = "http://ws.apache.org/ns/synapse";
	private Properties properties = new Properties();
	private static String rootDirectory=null;
	private static CloudConnectorDirectoryTraverser instance=null;
	/*
	 * Private Constructor
	 */
	private CloudConnectorDirectoryTraverser(){		
	}
	/*
	 * static method for creating an instance of this class 
	 */
	public static CloudConnectorDirectoryTraverser getInstance(String file){
		rootDirectory=file;
		if(instance == null){
			instance=new CloudConnectorDirectoryTraverser();
		}
		return instance;
	}
		
	private TemplateMediator readTemplateConfiguration(String fileLocation) throws IOException, XMLStreamException{
		String path = fileLocation;	
				String source = FileUtils.getContentAsString(new File(path));
				OMElement element = AXIOMUtil.stringToOM(source);
				TemplateMediator templateMediator=null;
				
				if (element.getFirstChildWithName(new QName(synapseNS, "sequence", null)) != null) {
					MediatorFactoryUtils.registerFactories();
					TemplateMediatorFactory templateMediatorFactory = new TemplateMediatorFactory();
					templateMediator = (TemplateMediator) templateMediatorFactory.createMediator(element, properties);						
				}
		return templateMediator;
	}
	
	public Collection<String> getCloudConnectorConfigurationParameters() throws Exception{
		return readTemplateConfiguration(getConfigurationFileLocation(getOperationFileNamesMap())).getParameters();
	}
	
	public Map<String, String> getOperationFileNamesMap() throws Exception{		
		Map<String, String> operationFileNamesMap=new HashMap<String,String>();
		File artifactsFile = new File(rootDirectory+"/connector.xml");
		String artifactsContent = FileUtils.getContentAsString(artifactsFile);
		Connector connector = new Connector();
		connector.deserialize(artifactsContent);

		for (Dependency dependency : connector.getComponentDependencies()) {
			String pathname = rootDirectory +"/"+ dependency.getComponent();
			File artifactFile = new File(pathname + "/component.xml");
			String artifactContent = FileUtils.getContentAsString(artifactFile);
			Component subComponent = new Component();
			subComponent.deserialize(artifactContent);
			for (SubComponents subComponents : subComponent.getSubComponents()) {
				operationFileNamesMap.put(subComponents.getFileName(),dependency.getComponent());
			}

		}
		return operationFileNamesMap;
	}
	
	/**
	 * Returning Operations map in the Cloud Connector zip. This map contains
	 * the name of the operation and the file name of the operation.
	 * 
	 * @return
	 * @throws Exception
	 */
	
	public Map<String, String> getOperationsMap() throws Exception{
		Map<String, String> operationNamesAndFileNamesMap=new HashMap<String,String>();
		File connectorFile = new File(rootDirectory+"/connector.xml");
		String connectorFileContent = FileUtils.getContentAsString(connectorFile);
		Connector connector = new Connector();
		connector.deserialize(connectorFileContent);

		for (Dependency dependency : connector.getComponentDependencies()) {
			String pathname = rootDirectory +"/"+ dependency.getComponent();
			File artifactFile = new File(pathname + "/component.xml");
			String artifactContent = FileUtils.getContentAsString(artifactFile);
			Component subComponent = new Component();
			subComponent.deserialize(artifactContent);
			for (SubComponents subComponents : subComponent.getSubComponents()) {
				operationNamesAndFileNamesMap.put(subComponents.getName(),subComponents.getFileName());
			}

		}
		return operationNamesAndFileNamesMap;
	}
	
	public String getConfigurationFileLocation(Map<String, String> artifactsMap) throws Exception{
		return rootDirectory+"/"+artifactsMap.get("config")+"/config.xml";
	}
}
