package org.wso2.carbonstudio.eclipse.artifact.synapse.ui.wizard;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.xml.namespace.QName;
import javax.xml.stream.FactoryConfigurationError;

import org.apache.axiom.om.OMElement;
import org.apache.maven.model.Plugin;
import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.wso2.carbonstudio.eclipse.artifact.synapse.model.SynapseModel;
import org.wso2.carbonstudio.eclipse.artifact.synapse.template.SynapseClassTemplate;
import org.wso2.carbonstudio.eclipse.esb.project.artifact.ESBArtifact;
import org.wso2.carbonstudio.eclipse.esb.project.artifact.ESBProjectArtifact;
import org.wso2.carbonstudio.eclipse.libraries.utils.LibraryUtils;
import org.wso2.carbonstudio.eclipse.maven.util.MavenUtils;
import org.wso2.carbonstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;
import org.wso2.carbonstudio.eclipse.utils.jdt.JavaUtils;
import org.wso2.carbonstudio.eclipse.utils.project.ProjectUtils;

public class SynapseCreationWizard extends AbstractWSO2ProjectCreationWizard {

	private SynapseModel synapseModel;
	private IProject esbProject;
	private IFile synapseConfig;
	private File pomfile;
	private IContainer saveLocation;
	private List<File> fileLst = new ArrayList<File>();

	// private ICarbonStudioLog log;

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
				addDependancies(esbProject);
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
					addPluginEntry("wso2-esb-synapse-plugin", "1.0.2");
					createArtifactMetaDataEntry(synapseModel.getName(), "synapse/configuration");
				}
			}
			ProjectUtils.addNatureToProject(esbProject,
			                                false,
			                                "org.wso2.carbonstudio.eclipse.artifact.synapse.project.nature",
			                                "org.wso2.carbonstudio.eclipse.esb.project.nature");
			esbProject.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			
			if(fileLst.size()>0){
				openEditor(fileLst.get(0));
			}

		} catch (CoreException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	// synapse/configuration
	public void createNewSynapseConfig(String template) throws Exception {
		synapseConfig =synapseModel.getEsbProject().getFile(new Path(synapseModel.getName().replaceAll(".xml$", "")+
		                                                              ".xml"));
		File synapseConfigFile =new File(saveLocation.getLocation().toFile(),
		                                  synapseModel.getName().replaceAll(".xml$", "") + ".xml");
		FileUtils.writeContent(synapseConfigFile, template);
		addPluginEntry("wso2-esb-synapse-plugin", "1.0.2");
		createArtifactMetaDataEntry(synapseModel.getName(), "synapse/configuration");
		fileLst.add(synapseConfigFile);
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

	public void createArtifactMetaDataEntry(String name, String type)
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
		                                           new File(synapseModel.getEsbProject()
		                                                                .getLocation().toFile(),
		                                                    synapseModel.getName().replaceAll(".xml$", "") + ".xml")));
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

	private void addDependancies(IProject project) {
		try {
			String[] depedencyList1 = getDepandanceyList();
			if (depedencyList1 != null) {
				for (String libName : depedencyList1) {
					if (libName != "") {
						File dependencyPath = LibraryUtils.getDependencyPath(libName);
						JavaUtils.addJarLibraryToProject(project, dependencyPath);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String[] getDepandanceyList() throws Exception {
		String[] depedencyList = null;
		ResourceBundle mediatorPropetiesBundle = ResourceBundle.getBundle("synapse");
		String jarList = mediatorPropetiesBundle.getString("Plugin_dependencies");
		if (!"".equals(jarList)) {
			String delimiter = ",";
			depedencyList = jarList.split(delimiter);
		}
		return depedencyList;
	}

	public void copyImportFile(IContainer importLocation) throws IOException {
		File importFile = getModel().getImportFile();
		File destFile = new File(importLocation.getLocation().toFile(), importFile.getName());
		FileUtils.copy(importFile, destFile);
		fileLst.add(destFile);
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
				}
				if (localName.equals("sequence")) {
					File destFile =
					                new File(esbProject.getFolder("src" + File.separator + "main" +
					                                                      File.separator +
					                                                      "synapse-config" +
					                                                      File.separator +
					                                                      "sequences")
					                                   .getLocation().toFile(), qName + ".xml");
					FileUtils.createFile(destFile, element.toString());
					addPluginEntry("maven-sequence-plugin", "1.0.4");
					fileLst.add(destFile);
				}
				if (localName.equals("endpoint")) {
					File destFile =
					                new File(esbProject.getFolder("src" + File.separator + "main" +
					                                                      File.separator +
					                                                      "synapse-config" +
					                                                      File.separator +
					                                                      "endpoints")
					                                   .getLocation().toFile(), qName + ".xml");
					FileUtils.createFile(destFile, element.toString());
					addPluginEntry("maven-endpoint-plugin", "1.0.4");
					fileLst.add(destFile);
				}
				if (localName.equals("proxy")) {
					File destFile =
					                new File(esbProject.getFolder("src" + File.separator + "main" +
					                                                      File.separator +
					                                                      "synapse-config" +
					                                                      File.separator +
					                                                      "proxy-services")
					                                   .getLocation().toFile(), qName + ".xml");
					FileUtils.createFile(destFile, element.toString());
					addPluginEntry("maven-proxy-plugin", "1.0.4");
					fileLst.add(destFile);
				}
				if (localName.equals("localentry")) {
					File destFile =
					                new File(esbProject.getFolder("src" + File.separator + "main" +
					                                                      File.separator +
					                                                      "synapse-config" +
					                                                      File.separator +
					                                                      "local-entries")
					                                   .getLocation().toFile(), qName + ".xml");
					FileUtils.createFile(destFile, element.toString());
					addPluginEntry("maven-localentry-plugin", "1.0.4");
					fileLst.add(destFile);
				}
				createArtifactMetaDataEntry(qName, "synapse" + localName);
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
		} catch (Exception e) { /* ignore */}
	}

}
