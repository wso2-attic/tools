package org.wso2.developerstudio.eclipse.artifact.sequence.ui.wizard;

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
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.wso2.developerstudio.eclipse.artifact.sequence.model.SequenceModel;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBArtifact;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBProjectArtifact;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.core.templates.ArtifactTemplate;
import org.wso2.developerstudio.eclipse.platform.core.templates.ArtifactTemplateHandler;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;

public class SequenceProjectCreationWizard extends AbstractWSO2ProjectCreationWizard {
	private final SequenceModel seqModel;
	private static final String SEQ_WIZARD_WINDOW_TITLE = "Create New Sequence";
	private ESBProjectArtifact esbProjectArtifact;
	private List<File> fileLst = new ArrayList<File>();
	private IProject esbProject;

	public SequenceProjectCreationWizard() {
		this.seqModel = new SequenceModel();
		setModel(this.seqModel);
		setWindowTitle(SEQ_WIZARD_WINDOW_TITLE);
	}

	
	protected boolean isRequireProjectLocationSection() {
		return false;
	}
	
	protected boolean isRequiredWorkingSet() {
	  return false;
	}
	
	public boolean performFinish() {
		try {
			SequenceModel sequenceModel = (SequenceModel)getModel();
			esbProject = sequenceModel.getSequenceSaveLocation().getProject();
			IContainer location = esbProject.getFolder("src" + File.separator + "main" +
			                                           File.separator +
			                                           "synapse-config" +
			                                           File.separator +
			                                           "sequences");
			
			//Adding the metadata about the sequence to the metadata store.
			esbProjectArtifact=new ESBProjectArtifact();
			esbProjectArtifact.fromFile(esbProject.getFile("artifact.xml").getLocation().toFile());
			
			if (getModel().getSelectedOption().equals("import.sequence")) {
				copyImportFile(location);
			}else{
//				Map<String,List<String>> filters=new HashMap<String,List<String>> ();
//				DeveloperStudioProviderUtils.addFilter(filters,
//													CSProviderConstants.FILTER_MEDIA_TYPE,
//													ESBMediaTypeConstants.MEDIA_TYPE_SEQUENCE);
				ArtifactTemplate selectedTemplate = ArtifactTemplateHandler.getArtifactTemplates("org.wso2.developerstudio.eclipse.esb.sequence");
				String templateContent = FileUtils.getContentAsString(selectedTemplate.getTemplateDataStream());
				String content = createSequenceTemplate(templateContent);
				File destFile = new File(location.getLocation().toFile(), sequenceModel.getSequenceName() + ".xml");
				FileUtils.createFile(destFile, content);
				fileLst.add(destFile);
				ESBArtifact artifact=new ESBArtifact();
				artifact.setName(sequenceModel.getSequenceName());
				artifact.setVersion("1.0.0");
				artifact.setType("synapse/sequence");
				artifact.setServerRole("EnterpriseServiceBus");
				artifact.setFile(FileUtils.getRelativePath(esbProject.getLocation().toFile(), new File(location.getLocation().toFile(),sequenceModel.getSequenceName()+".xml")));
				esbProjectArtifact.addESBArtifact(artifact);
			}

			File pomfile = esbProject.getFile("pom.xml").getLocation().toFile();
			getModel().getMavenInfo().setPackageName("synapse/sequence");
			if(!pomfile.exists()){
				createPOM(pomfile);
			}
			
			updatePom();
			
//			ProjectUtils.addNatureToProject(esbProject,
//					false,
//                    "org.wso2.developerstudio.eclipse.sequence.project.nature" ,
//                    "org.wso2.developerstudio.eclipse.esb.project.nature");
			esbProject.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			
			esbProjectArtifact.toFile();
			
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
	
	public void updatePom() throws Exception{
		File mavenProjectPomLocation = esbProject.getFile("pom.xml").getLocation().toFile();
		MavenProject mavenProject = MavenUtils.getMavenProject(mavenProjectPomLocation);

		List<Plugin> plugins = mavenProject.getBuild().getPlugins();
		
		for(Plugin plg:plugins){
			if(plg.getId().equals("wso2-esb-sequence-plugin")){
				return ;
			}
		}
		
		Plugin plugin = MavenUtils.createPluginEntry(mavenProject, "org.wso2.maven", "wso2-esb-sequence-plugin", "1.0.5", true);
		
		PluginExecution pluginExecution = new PluginExecution();
		pluginExecution.addGoal("pom-gen");
		pluginExecution.setPhase("process-resources");
		pluginExecution.setId("sequence");
		
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


	public void copyImportFile(IContainer importLocation) throws IOException {
		File importFile = getModel().getImportFile();
		File destFile = null;
		List<OMElement> selectedSeqList = ((SequenceModel)getModel()).getSelectedSeqList();
		if(selectedSeqList != null && selectedSeqList.size() >0 ){
			for (OMElement element : selectedSeqList) {
				String name = element.getAttributeValue(new QName("name"));
				destFile = new File(importLocation.getLocation().toFile(), name + ".xml");
				FileUtils.createFile(destFile, element.toString());
				fileLst.add(destFile);
				ESBArtifact artifact=new ESBArtifact();
				artifact.setName(name);
				artifact.setVersion("1.0.0");
				artifact.setType("synapse/sequence");
				artifact.setServerRole("EnterpriseServiceBus");
				artifact.setFile(FileUtils.getRelativePath(importLocation.getProject().getLocation().toFile(), new File(importLocation.getLocation().toFile(),name+".xml")));
				esbProjectArtifact.addESBArtifact(artifact);
			} 
			
		}else{
			destFile = new File(importLocation.getLocation().toFile(), importFile.getName());
			FileUtils.copy(importFile, destFile);
			fileLst.add(destFile);
			String name = importFile.getName().replaceAll(".xml$","");
			ESBArtifact artifact=new ESBArtifact();
			artifact.setName(name);
			artifact.setVersion("1.0.0");
			artifact.setType("synapse/sequence");
			artifact.setServerRole("EnterpriseServiceBus");
			artifact.setFile(FileUtils.getRelativePath(importLocation.getProject().getLocation().toFile(), new File(importLocation.getLocation().toFile(),name+".xml")));
			esbProjectArtifact.addESBArtifact(artifact);
		}
		
		
	}
	
	public String createSequenceTemplate(String templateContent) throws IOException{
//		String defaultNS = ESBPreferenceData.getDefaultNamesapce();
//		if(defaultNS.equals("") || defaultNS == null){
//			defaultNS = SynapseConstants.NS_1_4;
//		}
		String content = "";
		if(!seqModel.getSelectedEP().equals("")){
			String contentWithoutClosingTag = templateContent.substring(0, templateContent.length()-2);
			contentWithoutClosingTag = contentWithoutClosingTag.concat(seqModel.getSelectedEP());
			content = MessageFormat.format(contentWithoutClosingTag,seqModel.getSequenceName(),seqModel.getOnErrorSequence());
		}else{
			content = MessageFormat.format(templateContent,seqModel.getSequenceName(),seqModel.getOnErrorSequence());
		}
        return content;
	}

	
	public IResource getCreatedResource() {
		// TODO Auto-generated method stub
		return null;
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
