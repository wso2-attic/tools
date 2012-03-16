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

package org.wso2.developerstudio.eclipse.artifact.synapse.ui.wizard;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.FactoryConfigurationError;

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
import org.wso2.developerstudio.eclipse.artifact.synapse.Activator;
import org.wso2.developerstudio.eclipse.artifact.synapse.model.SynapseModel;
import org.wso2.developerstudio.eclipse.artifact.synapse.template.SynapseClassTemplate;
import org.wso2.developerstudio.eclipse.capp.maven.utils.MavenConstants;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBArtifact;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBProjectArtifact;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;

public class SynapseCreationWizard extends AbstractWSO2ProjectCreationWizard {
	
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private SynapseModel synapseModel;
	private IProject esbProject;
	private IFile synapseConfig;
	private File pomfile;
	private IContainer saveLocation;
	private List<File> fileList = new ArrayList<File>();


	public SynapseCreationWizard() {
		setSynapseModel(new SynapseModel());
		setModel(synapseModel);
		setWindowTitle("Create a Synapse Configuration");
	}

	protected boolean isRequireProjectLocationSection() {
		return false;
	}


	protected boolean isRequiredWorkingSet() {
	    return false;
	}
	
	public boolean performFinish() {
		try {
			esbProject = synapseModel.getEsbProject().getProject();
			saveLocation = esbProject.getFolder("src" + File.separator + "main" +
                                 File.separator +
                                 "synapse-config");
			pomfile = esbProject.getFile("pom.xml").getLocation().toFile();
			getModel().getMavenInfo().setPackageName("synapse/configuration");
			if (!pomfile.exists()) {
				createPOM(pomfile);
			}
			esbProject.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			if (synapseModel.getSelectedOption().equals("new.synapse")) {
				this.createNewSynapseConfig(SynapseClassTemplate.getSimpleTemplete());
			} else if (synapseModel.getSelectedOption().equals("new.synapse.tp")) {
				this.createNewSynapseConfig(SynapseClassTemplate.getRichTemplate());
			} else if (synapseModel.getSelectedOption().equals("import.synapse.config")) {
				if (synapseModel.isESBartifactsCreate()) {
					List<OMElement> esbArtiList = synapseModel.getAvailablePLESList();
					createESBArtifacts(esbArtiList);
				} else {
					File synConfig = new File(saveLocation.getLocation().toFile(),
							synapseModel.getImportFile().getName());
					FileUtils.copy(synapseModel.getImportFile(), synConfig);
					addPluginEntry("wso2-esb-synapse-plugin", MavenConstants.MAVEN_SYNAPSE_VERSION);
					createArtifactMetaDataEntry(synConfig.getName(), "synapse/configuration",
					                            saveLocation.getLocation().toFile());
				}
			}
			updatePom();
//			ProjectUtils.addNatureToProject(esbProject,
//			                                false,
//			                                "org.wso2.developerstudio.eclipse.artifact.synapse.project.nature",
//			                                "org.wso2.developerstudio.eclipse.esb.project.nature");
			esbProject.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			String[] labels={"OK", "Cancel"};
			MessageDialog message=new MessageDialog(getShell(), "Open imported files in the Editor", getDefaultPageImage(), "Do you like to open the imported files in Developer Studio?", 0,labels , 0);
			
			if(message.openQuestion(getShell(), "Open imported files in the Editor", "Do you like to open the imported files in Developer Studio?")){
				for (File file : fileList) {
	                openEditor(file);
                }
			}
		} catch (Exception e) {
			log.error(e);
		}
		return true;
	}
	
	public void updatePom() throws Exception {

		File mavenProjectPomLocation = esbProject.getFile("pom.xml").getLocation().toFile();
		MavenProject mavenProject = MavenUtils.getMavenProject(mavenProjectPomLocation);

		List<Plugin> plugins = mavenProject.getBuild().getPlugins();
		
		for(Plugin plg:plugins){
			if(plg.getId().equals("wso2-esb-synapse-plugin")){
				return ;
			}
		}
		
		Plugin plugin = MavenUtils.createPluginEntry(mavenProject, "org.wso2.maven", "wso2-esb-synapse-plugin", MavenConstants.MAVEN_SYNAPSE_VERSION, true);
		
		PluginExecution pluginExecution = new PluginExecution();
		pluginExecution.addGoal("pom-gen");
		pluginExecution.setPhase("process-resources");
		pluginExecution.setId("synapse");
		
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

	

	// synapse/configuration
	public void createNewSynapseConfig(String template) throws Exception {
		synapseConfig =synapseModel.getEsbProject().getFile(new Path(synapseModel.getName().replaceAll(".xml$", "")+
		                                                              ".xml"));
		File synapseConfigFile =new File(saveLocation.getLocation().toFile(),
		                                  synapseModel.getName().replaceAll(".xml$", "") + ".xml");
		FileUtils.writeContent(synapseConfigFile, template);
		addPluginEntry("wso2-esb-synapse-plugin", MavenConstants.MAVEN_SYNAPSE_VERSION);
		createArtifactMetaDataEntry(synapseModel.getName(), "synapse/configuration",
		                            saveLocation.getLocation().toFile());
		fileList.add(synapseConfigFile);
	}

	public boolean addPluginEntry(String artifactId, String version) throws Exception {

		MavenProject mavenProject = MavenUtils.getMavenProject(pomfile);
		List<Plugin> plugins = mavenProject.getBuild().getPlugins();
		for (Plugin plg : plugins) {
			if (plg.getId().equals(artifactId)) {
				return true;
			}
		}
		MavenUtils.createPluginEntry(mavenProject, "org.wso2.maven", artifactId, version, true);
		return false;
	}

	public void createArtifactMetaDataEntry(String name, String type,File baseDir)
	                                                                 throws FactoryConfigurationError,
	                                                                 Exception {
		ESBProjectArtifact esbProjectArtifact = new ESBProjectArtifact();
		esbProjectArtifact.fromFile(esbProject.getFile("artifact.xml").getLocation().toFile());
		ESBArtifact artifact = new ESBArtifact();
		artifact.setName(name);
		artifact.setVersion("1.0.0");
		artifact.setType(type);
		artifact.setServerRole("EnterpriseServiceBus");
		artifact.setFile(FileUtils.getRelativePath(esbProject.getLocation().toFile(),
			                                           new File(baseDir,
			                                                    name + ".xml")));	
		esbProjectArtifact.addESBArtifact(artifact);
		esbProjectArtifact.toFile();
	}

	public void setSynapseModel(SynapseModel customMediatorModel) {
		this.synapseModel = customMediatorModel;
	}

	public SynapseModel geSynapseModel() {
		return synapseModel;
	}

	public IResource getCreatedResource() {
		return synapseConfig;
	}


	public void copyImportFile(IContainer importLocation) throws IOException {
		File importFile = getModel().getImportFile();
		File destFile = new File(importLocation.getLocation().toFile(), importFile.getName());
		FileUtils.copy(importFile, destFile);
		fileList.add(destFile);
	}

	public void createESBArtifacts(List<OMElement> selectedElementsList)
	                                                                    throws FactoryConfigurationError,
	                                                                    Exception {

		if (selectedElementsList != null) {

			for (OMElement element : selectedElementsList) {

				String localName = element.getLocalName();
				String qName = element.getAttributeValue(new QName("name"));
				if (("".equals(qName)) || (qName == null)) {
					qName = element.getAttributeValue(new QName("key"));
					if(("".equals(qName)) || (qName == null)){
						continue;
					}
				}
				synapseModel.setName(qName);
				
				String commonESBPath = "src" + File.separator + "main" +
                                                         File.separator +
                                                         "synapse-config" +
                                                         File.separator;
				if (localName.equals("sequence")) {
					File baseDir = esbProject.getFolder(commonESBPath + "sequences").getLocation().toFile();
					File destFile = new File(baseDir, qName + ".xml");
					FileUtils.createFile(destFile, element.toString());
					addPluginEntry("maven-sequence-plugin", MavenConstants.MAVEN_SEQUENCE_VERSION);
					fileList.add(destFile);
					createArtifactMetaDataEntry(qName, "synapse/sequence", baseDir);
				} else if (localName.equals("endpoint")) {
					File baseDir = esbProject.getFolder(commonESBPath + "endpoints").getLocation().toFile();
					File destFile = new File(baseDir, qName + ".xml");
					FileUtils.createFile(destFile, element.toString());
					addPluginEntry("maven-endpoint-plugin", MavenConstants.MAVEN_ENDPOINT_VERSION);
					fileList.add(destFile);
					createArtifactMetaDataEntry(qName, "synapse/endpoint", baseDir);
				}else if (localName.equals("proxy")) {
					File baseDir = esbProject.getFolder(commonESBPath + "proxy-services").getLocation().toFile();
					File destFile = new File(baseDir, qName + ".xml");
					FileUtils.createFile(destFile, element.toString());
					addPluginEntry("maven-proxy-plugin", MavenConstants.MAVEN_PROXY_SERVICE_VERSION);
					fileList.add(destFile);
					createArtifactMetaDataEntry(qName, "synapse/proxy-service", baseDir);
				}else if (localName.equals("localentry")) {
					File baseDir = esbProject.getFolder(commonESBPath + "local-entries").getLocation().toFile();
					File destFile = new File(baseDir, qName + ".xml");
					FileUtils.createFile(destFile, element.toString());
					addPluginEntry("maven-localentry-plugin", MavenConstants.MAVEN_LOCAL_ENTRY_VERSION);
					fileList.add(destFile);
					createArtifactMetaDataEntry(qName, "synapse/local-entry", baseDir);
				}	
			}
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
		} catch (Exception e) { 
			log.error("cannot open editor",e);
		}
	}

}
