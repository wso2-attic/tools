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

package org.wso2.developerstudio.eclipse.artifact.template.wizards;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.PluginExecution;
import org.apache.maven.model.Repository;
import org.apache.maven.model.RepositoryPolicy;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.wso2.developerstudio.eclipse.artifact.template.Activator;
import org.wso2.developerstudio.eclipse.artifact.template.model.TemplateModel;
import org.wso2.developerstudio.eclipse.capp.maven.utils.MavenConstants;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBArtifact;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBProjectArtifact;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.core.templates.ArtifactTemplate;
import org.wso2.developerstudio.eclipse.platform.core.templates.ArtifactTemplateHandler;
import org.wso2.developerstudio.eclipse.platform.ui.editor.Openable;
import org.wso2.developerstudio.eclipse.platform.ui.startup.ESBGraphicalEditor;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;

public class TemplateProjectCreationWizard extends AbstractWSO2ProjectCreationWizard {
	
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private TemplateModel templateModel;
	private ESBProjectArtifact esbProjectArtifact;
	private List<File> fileLst = new ArrayList<File>();
	private IProject project;
	
	public TemplateProjectCreationWizard() {
		this.templateModel = new TemplateModel();
		setModel(this.templateModel);
		setWindowTitle("Template wizards");
		//setDefaultPageImageDescriptor(LocalEntryImageUtils.getInstance().getImageDescriptor("local-entries-wizard-artifact.png"));
	}

	protected boolean isRequireProjectLocationSection() {
		return false;
	}

	public boolean performFinish() {
		try {
			project = templateModel.getTemplateSaveLocation().getProject();
			createSequenceArtifact(templateModel);
			if(fileLst.size()>0){
				openEditor(fileLst.get(0));
			}
		} catch (Exception e) {
			log.error("An unexpected error has occurred", e);
		}
		return true;
	}
	
	private boolean createSequenceArtifact(TemplateModel sequenceModel) throws Exception {
        boolean isNewArtifact =true;
        IContainer location = project.getFolder("src" + File.separator + "main"
				+ File.separator + "synapse-config" + File.separator
				+ "templates");

		// Adding the metadata about the sequence to the metadata store.
		esbProjectArtifact = new ESBProjectArtifact();
		esbProjectArtifact.fromFile(project.getFile("artifact.xml")
				.getLocation().toFile());
		
		File pomfile = project.getFile("pom.xml").getLocation().toFile();
		getModel().getMavenInfo().setPackageName("synapse/template");
		if (!pomfile.exists()) {
			createPOM(pomfile);
		}

		updatePom();
		project.refreshLocal(IResource.DEPTH_INFINITE,
				new NullProgressMonitor());
		String groupId = getMavenGroupId(pomfile);
		groupId += ".template";

		if (getModel().getSelectedOption().equals("Sequence.import.template")) {
			IFile sequence = location.getFile(new Path(getModel().getImportFile().getName()));
			if(sequence.exists()){
				if(!MessageDialog.openQuestion(getShell(), "WARNING", "Do you like to override exsiting project in the workspace")){
					return false;	
				}
				isNewArtifact = false;
			} 	
			copyImportFile(location,isNewArtifact,groupId);
		} else {
			ArtifactTemplate selectedTemplate = ArtifactTemplateHandler
					.getArtifactTemplates("org.wso2.developerstudio.eclipse.esb.template.sq_template");
			String templateContent = FileUtils
					.getContentAsString(selectedTemplate
							.getTemplateDataStream());
			String content = createSequenceTemplate(templateContent);
			File destFile = new File(location.getLocation().toFile(),
					sequenceModel.getTemplateName() + ".xml");
			FileUtils.createFile(destFile, content);
			fileLst.add(destFile);
			ESBArtifact artifact = new ESBArtifact();
			artifact.setName(sequenceModel.getTemplateName());
			artifact.setVersion("1.0.0");
			artifact.setType("synapse/template");
			artifact.setServerRole("EnterpriseServiceBus");
			artifact.setGroupId(groupId);
			artifact.setFile(FileUtils.getRelativePath(project.getLocation()
					.toFile(), new File(location.getLocation().toFile(),
					sequenceModel.getTemplateName() + ".xml")).replaceAll(Pattern.quote(File.separator), "/"));
			esbProjectArtifact.addESBArtifact(artifact);
		}
		esbProjectArtifact.toFile();
		project.refreshLocal(IResource.DEPTH_INFINITE,
				new NullProgressMonitor());
		return true;
	}
	
	public String createSequenceTemplate(String templateContent) throws IOException{
		String content = "";
		content = MessageFormat.format(templateContent,templateModel.getTemplateName());
        return content;
	}
 
	public void updatePom() throws Exception{
		File mavenProjectPomLocation = project.getFile("pom.xml").getLocation().toFile();
		MavenProject mavenProject = MavenUtils.getMavenProject(mavenProjectPomLocation);

		boolean pluginExists = MavenUtils.checkOldPluginEntry(mavenProject,
				"org.wso2.maven", "wso2-esb-template-plugin",
				MavenConstants.WSO2_ESB_TEMPLATE_VERSION);
		if(pluginExists){
			return ;
		}
		
		Plugin plugin = MavenUtils.createPluginEntry(mavenProject, "org.wso2.maven", "wso2-esb-template-plugin", MavenConstants.WSO2_ESB_TEMPLATE_VERSION, true);
		
		PluginExecution pluginExecution = new PluginExecution();
		pluginExecution.addGoal("pom-gen");
		pluginExecution.setPhase("process-resources");
		pluginExecution.setId("template");
		
		Xpp3Dom configurationNode = MavenUtils.createMainConfigurationNode();
		Xpp3Dom artifactLocationNode = MavenUtils.createXpp3Node(configurationNode, "artifactLocation");
		artifactLocationNode.setValue(".");
		Xpp3Dom typeListNode = MavenUtils.createXpp3Node(configurationNode, "typeList");
		typeListNode.setValue("${artifact.types}");
		pluginExecution.setConfiguration(configurationNode);
		
		plugin.addExecution(pluginExecution);
		Repository repo = new Repository();
		repo.setUrl("http://maven.wso2.org/nexus/content/groups/wso2-public/");
		repo.setId("wso2-nexus");
		
		RepositoryPolicy releasePolicy=new RepositoryPolicy();
		releasePolicy.setEnabled(true);
		releasePolicy.setUpdatePolicy("daily");
		releasePolicy.setChecksumPolicy("ignore");
		
		repo.setReleases(releasePolicy);
		
		if (!mavenProject.getRepositories().contains(repo)) {
	        mavenProject.getModel().addRepository(repo);
	        mavenProject.getModel().addPluginRepository(repo);
        }
		
		MavenUtils.saveMavenProject(mavenProject, mavenProjectPomLocation);
	}
	
	public void copyImportFile(IContainer importLocation,boolean isNewAritfact, String groupId) throws IOException {
		File importFile = getModel().getImportFile();
		File destFile = null;
		List<OMElement> selectedSeqList = ((TemplateModel)getModel()).getSelectedTempSequenceList();
		if(selectedSeqList != null && selectedSeqList.size() >0 ){
			for (OMElement element : selectedSeqList) {
				String name = element.getAttributeValue(new QName("name"));
				destFile = new File(importLocation.getLocation().toFile(), name + ".xml");
				FileUtils.createFile(destFile, element.toString());
				fileLst.add(destFile);
				if(isNewAritfact){
				ESBArtifact artifact=new ESBArtifact();
				artifact.setName(name);
				artifact.setVersion("1.0.0");
				artifact.setType("synapse/template");
				artifact.setServerRole("EnterpriseServiceBus");
				artifact.setGroupId(groupId);
				artifact.setFile(FileUtils.getRelativePath(importLocation.getProject().getLocation().toFile(), new File(importLocation.getLocation().toFile(),name+".xml")));
				esbProjectArtifact.addESBArtifact(artifact);
				}
			} 
		}else{
			destFile = new File(importLocation.getLocation().toFile(), importFile.getName());
			FileUtils.copy(importFile, destFile);
			fileLst.add(destFile);
			String name = importFile.getName().replaceAll(".xml$","");
			if(isNewAritfact){
			ESBArtifact artifact=new ESBArtifact();
			artifact.setName(name);
			artifact.setVersion("1.0.0");
			artifact.setType("synapse/template");
			artifact.setServerRole("EnterpriseServiceBus");
			artifact.setGroupId(groupId);
			artifact.setFile(FileUtils.getRelativePath(importLocation.getProject().getLocation().toFile(), new File(importLocation.getLocation().toFile(),name+".xml")));
			esbProjectArtifact.addESBArtifact(artifact);
			}
		}
	}
	
	protected boolean isRequiredWorkingSet() {
		return false;
	}
			
	public void openEditor(File file) {
		try{
		refreshDistProjects();
		IFile dbsFile  = ResourcesPlugin
		.getWorkspace()
		.getRoot()
		.getFileForLocation(
				Path.fromOSString(file.getAbsolutePath()));
		String path = dbsFile.getParent().getFullPath()+"/";
		String source = FileUtils.getContentAsString(file);
		Openable openable = ESBGraphicalEditor.getOpenable();
		openable.editorOpen(file.getName(),"template.sequence",path+"template_", source);
		}catch(Exception e){
			log.error("Cannot open the editor", e);
		}
	}

	@Override
	public IResource getCreatedResource() {
		return null;
	} 

}
