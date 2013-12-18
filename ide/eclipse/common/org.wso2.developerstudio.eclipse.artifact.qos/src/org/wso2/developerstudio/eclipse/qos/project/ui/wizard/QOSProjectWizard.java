/*
 * Copyright (c) 2011, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.qos.project.ui.wizard;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.core.model.MavenInfo;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.developerstudio.eclipse.qos.project.model.QOSProjectModel;
import org.wso2.developerstudio.eclipse.qos.project.model.Service;
import org.wso2.developerstudio.eclipse.qos.project.model.ServiceGroup;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;

public class QOSProjectWizard extends AbstractWSO2ProjectCreationWizard {

	private static final String QOS_PROJECT_NATURE = "org.wso2.developerstudio.eclipse.qos.project.nature";
	private IProject project;
	private QOSProjectModel qosProjectModel;
	private File pomfile;
	private File meta;
    private String serviceName;
    private Service service;
    private String metaFileName;


	public QOSProjectWizard() {
		setQosProjectModel(new QOSProjectModel());
		setModel(qosProjectModel);
//		setDefaultPageImageDescriptor(QOSImageUtils.getInstance().getImageDescriptor("esb-project-wizard.png"));
	}
	
	@Override
	protected boolean isRequiredWorkspaceLocation() {
		 return true;
	}
	
	public boolean performFinish() {
		try {
			project = createNewProject();
			pomfile = project.getFile("pom.xml").getLocation().toFile();
			
			if(!pomfile.exists()){
				createPOM(pomfile);
			}
			ProjectUtils.addNatureToProject(project,
											false,
			                                QOS_PROJECT_NATURE);
			MavenUtils
			.updateWithMavenEclipsePlugin(
					pomfile,
					new String[] { },
					new String[] { QOS_PROJECT_NATURE });
			
			getModel().addToWorkingSet(project);
			MavenInfo mavenInfo = getModel().getMavenInfo();
			metaFileName  = getServiceName()+"_"+mavenInfo.getVersion()+".xml";
			meta = project.getFile("src/main/resources/"+metaFileName).getLocation().toFile();
			meta.createNewFile();
			ServiceGroup serviceGroup = new ServiceGroup();
			serviceGroup.setName(project.getName());
			serviceGroup.setSuccessfullyAdded(true);
			serviceGroup.getService().add(getService());
			
		    JAXBContext jaxbContext = JAXBContext.newInstance(ServiceGroup.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(serviceGroup, meta); 
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			refreshDistProjects();
		}catch (Exception e) {
			MessageDialog.openError(getShell(), "Error while creating the project",e.getMessage());
			return false;
		}
		return true;
	}
	

	public QOSProjectModel getQosProjectModel() {
		return qosProjectModel;
	}

	public void setQosProjectModel(QOSProjectModel qosProjectModel) {
		this.qosProjectModel = qosProjectModel;
	}
	
	public IResource getCreatedResource() {
		return project;
	}
	
	public void setCurrentSelection(ISelection currentSelection) {
		// TODO Auto-generated method stub
		super.setCurrentSelection(currentSelection);
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public String getMetaFileName() {
		return metaFileName;
	}

	public void setMetaFileName(String metaFileName) {
		this.metaFileName = metaFileName;
	}
}
