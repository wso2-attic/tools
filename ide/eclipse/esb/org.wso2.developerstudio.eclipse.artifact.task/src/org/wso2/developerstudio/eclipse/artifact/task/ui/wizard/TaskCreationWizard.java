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

package org.wso2.developerstudio.eclipse.artifact.task.ui.wizard;

import java.io.File;
import java.util.regex.Pattern;

import org.wso2.developerstudio.eclipse.artifact.task.Activator;
import org.wso2.developerstudio.eclipse.artifact.task.model.TaskModel;
import org.wso2.developerstudio.eclipse.artifact.task.validator.TriggerTypeList.TriggerType;
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

/**
 * WSO2 ESB task creation wizard class
 */
public class TaskCreationWizard extends AbstractWSO2ProjectCreationWizard {
	
private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	
	private final TaskModel artifactModel;
	private IFile artifactFile;
	private ESBProjectArtifact esbProjectArtifact;
	private IProject esbProject;
	
	public TaskCreationWizard() {
		artifactModel = new TaskModel();
		setModel(artifactModel);
	}

	@Override
	public IResource getCreatedResource() {
		return artifactFile;
	}

	@Override
	public boolean performFinish() {
		try {
			esbProject = artifactModel.getSaveLocation().getProject();
			IContainer location = esbProject.getFolder("src/main/synapse-config/task");

			File pomfile = esbProject.getFile("pom.xml").getLocation().toFile();
			if (!pomfile.exists()) {
				createPOM(pomfile);
			}
			// FIXME : implement updatePOM()

			esbProject.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());

			String groupId = getMavenGroupId(pomfile) + ".task";

			// Adding the metadata about the API to the metadata store.
			esbProjectArtifact = new ESBProjectArtifact();
			esbProjectArtifact.fromFile(esbProject.getFile("artifact.xml").getLocation().toFile());

			artifactFile = location.getFile(new Path(artifactModel.getName() + ".xml"));
			File destFile = artifactFile.getLocation().toFile();
			FileUtils.createFile(destFile, getTemplateContent());

			String relativePath = FileUtils.getRelativePath(esbProject.getLocation().toFile(),
					new File(location.getLocation().toFile(), artifactModel.getName() + ".xml"))
					.replaceAll(Pattern.quote(File.separator), "/");
			esbProjectArtifact.addESBArtifact(createArtifact(artifactModel.getName(), groupId,
					"1.0.0", relativePath));

			esbProjectArtifact.toFile();
			esbProject.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());

			openEditor(destFile);

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
	
	private String getTemplateContent(){
		String content = new String();
		/*
		 * FIXME: use template extension-point instead of hard-coding template
		 * content
		 */
		content += "<task xmlns=\"";
		content += "http://ws.apache.org/ns/synapse\"";
		content += " name=\"";
		content += artifactModel.getName();
		content += "\" class=\"";
		content += artifactModel.getTaskImplementation();
		content += "\" group=\"";
		content += artifactModel.getGroup();
		if (artifactModel.getPinnedServers() != null
				&& artifactModel.getPinnedServers().length() > 0) {
			content += "\" pinnedServers=\"";
			content += artifactModel.getPinnedServers();
		}
		content += "\">\n"; 
		if(artifactModel.getTriggerType() ==TriggerType.CRON){
			content += "<trigger cron=\"" + artifactModel.getCron() + "\"/>";
		} else{
			if (artifactModel.getCount() <= 1 && artifactModel.getInterval() == 0) {
				content += "<trigger once=\"true\"/>";
			} else{
				content += "<trigger count=\"" + artifactModel.getCount() + "\" interval=\""
						+ artifactModel.getInterval() + "\"/>";
			}
		}
		content += "\n</task>";
		return content;
	}
	
	
	private ESBArtifact createArtifact(String name,String groupId,String version,String path){
		ESBArtifact artifact=new ESBArtifact();
		artifact.setName(name);
		artifact.setVersion(version);
		artifact.setType("synapse/task");
		artifact.setServerRole("EnterpriseServiceBus");
		artifact.setGroupId(groupId);
		artifact.setFile(path);
		return artifact;
	}

}
