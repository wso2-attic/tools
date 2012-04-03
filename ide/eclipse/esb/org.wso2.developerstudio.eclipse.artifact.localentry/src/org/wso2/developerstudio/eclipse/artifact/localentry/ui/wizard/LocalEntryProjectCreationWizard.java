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

package org.wso2.developerstudio.eclipse.artifact.localentry.ui.wizard;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

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
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.wso2.developerstudio.eclipse.artifact.localentry.model.LocalEntryModel;
import org.wso2.developerstudio.eclipse.artifact.localentry.utils.LocalEntryArtifactConstants;
import org.wso2.developerstudio.eclipse.artifact.localentry.utils.LocalEntryImageUtils;
import org.wso2.developerstudio.eclipse.artifact.localentry.utils.LocalEntryTemplateUtils;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBArtifact;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBProjectArtifact;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;

public class LocalEntryProjectCreationWizard extends AbstractWSO2ProjectCreationWizard {

	private LocalEntryModel localEntryModel;
	private IFile localEntryFile;
	private LocalEntryModel leModel;
	private ESBProjectArtifact esbProjectArtifact;
	private List<File> fileLst = new ArrayList<File>();
	private IProject esbProject;
	
	public LocalEntryProjectCreationWizard() {
		this.localEntryModel = new LocalEntryModel();
		setModel(this.localEntryModel);
		setWindowTitle(LocalEntryArtifactConstants.LE_WIZARD_WINDOW_TITLE);
		setDefaultPageImageDescriptor(LocalEntryImageUtils.getInstance().getImageDescriptor("local-entries-wizard-artifact.png"));
	}
	
	
	public IResource getCreatedResource() {
		// TODO Auto-generated method stub
		return localEntryFile;
	}
	
	protected boolean isRequireProjectLocationSection() {
		return false;
	}

	public boolean performFinish() {
		try {
			leModel = (LocalEntryModel)getModel();
			esbProject =  leModel.getLocalEntrySaveLocation().getProject();
			IContainer location = esbProject.getFolder("src" + File.separator + "main" +
			                                           File.separator +
			                                           "synapse-config" +
			                                           File.separator +
			                                           "local-entries");
			
			//Adding the metadata about the localentry to the metadata store.
			esbProjectArtifact=new ESBProjectArtifact();
			esbProjectArtifact.fromFile(esbProject.getFile("artifact.xml").getLocation().toFile());
			
			if (getModel().getSelectedOption().equals(LocalEntryArtifactConstants.WIZARD_OPTION_IMPORT_OPTION)) {
				localEntryFile = location.getFile(new Path(getModel().getImportFile().getName()));
				if(localEntryFile.exists()){
					if(!MessageDialog.openQuestion(getShell(), "WARNING", "Do you like to override exsiting project in the workspace")){
						return false;	
					}
				} 	
				copyImportFile(location);
				
			} else {
				File localEntryFile = new File(location.getLocation().toFile(),leModel.getLocalENtryName() + ".xml");
				writeTemplete(localEntryFile);
				
				ESBArtifact artifact=new ESBArtifact();
				artifact.setName(localEntryModel.getLocalENtryName());
				artifact.setVersion("1.0.0");
				artifact.setType("synapse/local-entry");
				artifact.setServerRole("EnterpriseServiceBus");
				artifact.setFile(FileUtils.getRelativePath(esbProject.getLocation().toFile(), new File(location.getLocation().toFile(),localEntryModel.getLocalENtryName()+".xml")));
				esbProjectArtifact.addESBArtifact(artifact);
			}
			File pomfile = esbProject.getFile("pom.xml").getLocation().toFile();
			getModel().getMavenInfo().setPackageName("synapse/local-entry");
			if(!pomfile.exists()){
				createPOM(pomfile);
			}
//			ProjectUtils.addNatureToProject(esbProject,
//											false,
//			                                LocalEntryArtifactConstants.ESB_PROJECT_NATURE,
//			                                "org.wso2.developerstudio.eclipse.localentry.project.nature" );
			updatePom();
			esbProject.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			
			esbProjectArtifact.toFile();
			
			if(fileLst.size()>0){
				openEditor(fileLst.get(0));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public void updatePom() throws Exception{
		File mavenProjectPomLocation = esbProject.getFile("pom.xml").getLocation().toFile();
		MavenProject mavenProject = MavenUtils.getMavenProject(mavenProjectPomLocation);

		List<Plugin> plugins = mavenProject.getBuild().getPlugins();
		
		for(Plugin plg:plugins){
			if(plg.getId().equals("wso2-esb-localentry-plugin")){
				return ;
			}
		}
		
		Plugin plugin = MavenUtils.createPluginEntry(mavenProject, "org.wso2.maven", "wso2-esb-localentry-plugin", "1.0.5", true);
		
		PluginExecution pluginExecution = new PluginExecution();
		pluginExecution.addGoal("pom-gen");
		pluginExecution.setPhase("process-resources");
		pluginExecution.setId("localentry");
		
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
	
	protected boolean isRequiredWorkingSet() {
		return false;
	}
	
	private void writeTemplete(File localEntryFile){
		try {
			String content = "";
			String templateToUse = "InLineTextLE.xml";
			if(leModel.getSelectedLocalEntryType().equals(LocalEntryArtifactConstants.TYPE_IN_LINE_TEXT_LE)){
				templateToUse = "InLineTextLE.xml";
				
				content =
					      MessageFormat.format(LocalEntryTemplateUtils.getInstance()
					                                                  .getTemplateString(templateToUse),
					                                                  leModel.getLocalENtryName(), leModel.getInLineTextValue());
				
			}else if(leModel.getSelectedLocalEntryType().equals(LocalEntryArtifactConstants.TYPE_IN_LINE_XML_LE)){
				templateToUse = "InLineXmlLE.xml";
				
				content =
					      MessageFormat.format(LocalEntryTemplateUtils.getInstance()
					                                                  .getTemplateString(templateToUse),
					                                                  leModel.getLocalENtryName(), leModel.getInLineXMLValue());
				
			}else if(leModel.getSelectedLocalEntryType().equals(LocalEntryArtifactConstants.TYPE_SOURCE_URL_LE)){
				templateToUse = "SourceURLLE.xml";
				
				content =
					      MessageFormat.format(LocalEntryTemplateUtils.getInstance()
					                                                  .getTemplateString(templateToUse),
					                                                  leModel.getLocalENtryName(), leModel.getSourceURL());
			}else{
				
			}
			FileUtils.writeContent(localEntryFile, content);
			fileLst.add(localEntryFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void copyImportFile(IContainer importLocation) throws IOException {
		File importFile = getModel().getImportFile();
		List<OMElement> selectedLEList = leModel.getSelectedLEList();
		File destFile = null;
		if(selectedLEList != null && selectedLEList.size() >0 ){
			for (OMElement element : selectedLEList) {
				String key = element.getAttributeValue(new QName("key"));
				destFile  = new File(importLocation.getLocation().toFile(), key + ".xml");
				FileUtils.createFile(destFile, element.toString());
				fileLst.add(destFile);
				ESBArtifact artifact=new ESBArtifact();
				artifact.setName(key);
				artifact.setVersion("1.0.0");
				artifact.setType("synapse/local-entry");
				artifact.setServerRole("EnterpriseServiceBus");
				artifact.setFile(FileUtils.getRelativePath(importLocation.getProject().getLocation().toFile(), new File(importLocation.getLocation().toFile(),key+".xml")));
				esbProjectArtifact.addESBArtifact(artifact);
			}
			
		}else{
			destFile = new File(importLocation.getLocation().toFile(), importFile.getName());
			FileUtils.copy(importFile, destFile);
			fileLst.add(destFile);
			String key = importFile.getName().replaceAll(".xml$", "");
			ESBArtifact artifact=new ESBArtifact();
			artifact.setName(key);
			artifact.setVersion("1.0.0");
			artifact.setType("synapse/local-entry");
			artifact.setServerRole("EnterpriseServiceBus");
			artifact.setFile(FileUtils.getRelativePath(importLocation.getProject().getLocation().toFile(), new File(importLocation.getLocation().toFile(),key+".xml")));
			esbProjectArtifact.addESBArtifact(artifact);
		}
	}
	
	public void openEditor(File file){
		try {
			IFile dbsFile  = ResourcesPlugin
			.getWorkspace()
			.getRoot()
			.getFileForLocation(
					Path.fromOSString(file.getAbsolutePath()));
			IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(),dbsFile);
		} catch (Exception e) { /* ignore */}
	}
}
