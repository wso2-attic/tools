/*
 * Copyright (c) WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.artifact.messagestore.ui.wizard;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

import javax.xml.namespace.QName;

import org.wso2.developerstudio.eclipse.artifact.messagestore.Activator;
import org.wso2.developerstudio.eclipse.artifact.messagestore.model.MessageStoreModel;
import org.wso2.developerstudio.eclipse.artifact.messagestore.provider.MessageStoreTypeList.MessageStoreType;
import org.wso2.developerstudio.eclipse.artifact.messagestore.util.MessageStoreImageUtils;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBArtifact;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBProjectArtifact;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import static org.wso2.developerstudio.eclipse.artifact.messagestore.Constants.*;
import org.apache.synapse.config.xml.MessageStoreSerializer;
import org.apache.synapse.message.store.InMemoryMessageStore;
import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMAttribute;
import org.apache.axiom.om.OMElement;
import org.apache.commons.lang.StringUtils;

/**
 * WSO2 message-store creation wizard class
 */
public class MessageStoreCreationWizard extends AbstractWSO2ProjectCreationWizard {
	
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	
	private final MessageStoreModel messageStoreModel;
	private ESBProjectArtifact esbProjectArtifact;
	private IProject esbProject;
	private IFile artifactFile;
	
	public MessageStoreCreationWizard() {
		messageStoreModel = new MessageStoreModel();
		setModel(messageStoreModel);
		setWindowTitle("New Message Store");
		setDefaultPageImageDescriptor(MessageStoreImageUtils.getInstance().getImageDescriptor("message-store.png"));
	}

	@Override
	public IResource getCreatedResource() {
		return null;
	}

	@Override
	public boolean performFinish() {
		try {
			esbProject = messageStoreModel.getSaveLocation().getProject();
			IContainer location = esbProject.getFolder("src/main/synapse-config/message-stores");
			File pomfile = esbProject.getFile("pom.xml").getLocation().toFile();
			if (!pomfile.exists()) {
				createPOM(pomfile);
			}
			esbProjectArtifact = new ESBProjectArtifact();
			esbProjectArtifact.fromFile(esbProject.getFile("artifact.xml").getLocation().toFile());
			//updatePom();
			esbProject.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			String groupId = getMavenGroupId(pomfile) + ".message-store";
            if(getModel().getSelectedOption().equals(FIELD_IMPORT_STORE)){
            	//TODO:
            }else{
			artifactFile = location.getFile(new Path(messageStoreModel.getStoreName() + ".xml"));
			File destFile = artifactFile.getLocation().toFile();
			FileUtils.createFile(destFile, getTemplateContent());
			//fileLst.add(destFile);
			String relativePath = FileUtils.getRelativePath(esbProject.getLocation().toFile(),
					new File(location.getLocation().toFile(), messageStoreModel.getStoreName() + ".xml"))
					.replaceAll(Pattern.quote(File.separator), "/");
			esbProjectArtifact.addESBArtifact(createArtifact(messageStoreModel.getStoreName(), groupId,
					"1.0.0", relativePath));
			esbProjectArtifact.toFile();
            }
			esbProject.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
            
			/*for (File file : fileLst) {
				if (file.exists()) {
					openEditor(file);
				}
			}*/
		} catch (CoreException e) {
			log.error("CoreException has occurred", e);
		} catch (Exception e) {
			log.error("An unexpected error has occurred", e);
		}
		return true;
	}
	
	protected boolean isRequireProjectLocationSection() {
		return false;
	}

	protected boolean isRequiredWorkingSet() {
		return false;
	}
	
	private ESBArtifact createArtifact(String name,String groupId,String version,String path){
		ESBArtifact artifact=new ESBArtifact();
		artifact.setName(name);
		artifact.setVersion(version);
		artifact.setType("synapse/message-store");
		artifact.setServerRole("EnterpriseServiceBus");
		artifact.setGroupId(groupId);
		artifact.setFile(path);
		return artifact;
	}
	
	private String getTemplateContent(){
		Map<String,Object> parameters = new HashMap<String,Object>();
		OMElement wrap = OMAbstractFactory.getOMFactory().createOMElement("wrap",null);
		String className = "org.apache.synapse.message.store.InMemoryMessageStore";
		InMemoryMessageStore store = new InMemoryMessageStore();
		store.setName(messageStoreModel.getStoreName());
		String lineSeparator = System.getProperty("line.separator","\n");
		
		if(messageStoreModel.getMessageStoreType()==MessageStoreType.CUSTOM){
			className = messageStoreModel.getCustomProviderClass();
			for (Entry<String, String> param : messageStoreModel
					.getCustomParameters().entrySet()) {
				if(!StringUtils.isBlank(param.getKey()) && !StringUtils.isBlank(param.getValue())){
					parameters.put(param.getKey(), param.getValue().toString());
				}
			}
		} else if(messageStoreModel.getMessageStoreType()==MessageStoreType.JMS){
			className = "org.wso2.carbon.message.store.persistence.jms.JMSMessageStore";
			if(!StringUtils.isBlank(messageStoreModel.getJmsContextFactory())){
				parameters.put("java.naming.factory.initial", messageStoreModel.getJmsContextFactory());
			}
			if(!StringUtils.isBlank(messageStoreModel.getJmsProviderUrl())){
				parameters.put("java.naming.provider.url", messageStoreModel.getJmsProviderUrl());
			}
			if(!StringUtils.isBlank(messageStoreModel.getJmsQueueName())){
				parameters.put("store.jms.destination", messageStoreModel.getJmsQueueName());
			}
			if(!StringUtils.isBlank(messageStoreModel.getJmsConnectionFactory())){
				parameters.put("store.jms.connection.factory", messageStoreModel.getJmsConnectionFactory());
			}
			if(!StringUtils.isBlank(messageStoreModel.getJmsUsername())){
				parameters.put("store.jms.username", messageStoreModel.getJmsUsername());
			}
			if(!StringUtils.isBlank(messageStoreModel.getJmsPassword())){
				parameters.put("store.jms.password", messageStoreModel.getJmsPassword());
			}
			if(!StringUtils.isBlank(messageStoreModel.getJmsApiVersion())){
				parameters.put("store.jms.JMSSpecVersion", messageStoreModel.getJmsApiVersion());
			}
			parameters.put("store.jms.cache.connection", ((Boolean)messageStoreModel.getJmsEnableCaching()).toString());
			parameters.put("store.jms.ConsumerReceiveTimeOut", ((Integer)messageStoreModel.getJmsTimeout()).toString());

		} 
		store.setParameters(parameters);
		MessageStoreSerializer.serializeMessageStore(wrap, store);
		OMElement messageStoreElement = wrap.getFirstElement();
		OMAttribute classAttr = messageStoreElement.getAttribute(new QName("class"));
		if(classAttr!=null){
			classAttr.setAttributeValue(className);
		} else{
			messageStoreElement.addAttribute("class", className, null);
		}
		return messageStoreElement.toString().replace("><", ">" + lineSeparator + "<");
	}

}
