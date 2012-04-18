package org.wso2.developerstudio.eclipse.artifact.carbon.ui.bundle.ui.wizard;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.maven.model.Plugin;
import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.wso2.developerstudio.eclipse.artifact.carbon.ui.bundle.model.CarbonUiModel;
import org.wso2.developerstudio.eclipse.artifact.carbon.ui.bundle.templates.CarbonUIbudleTemplate;
import org.wso2.developerstudio.eclipse.artifact.carbon.ui.bundle.utils.CarbonUIImageUtils;
import org.wso2.developerstudio.eclipse.libraries.utils.LibraryUtils;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.core.model.MavenInfo;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.pages.ProjectOptionsDataPage;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.pages.ProjectOptionsPage;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;
import org.wso2.developerstudio.eclipse.utils.jdt.JavaUtils;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;

public class CarbonUIbundleWizard extends AbstractWSO2ProjectCreationWizard {
    private static CarbonUiModel uibundleModel;
	private  IProject project;
//	private  IDeveloperStudioLog log;
	
    public CarbonUIbundleWizard(){
     setUibundleModel(new CarbonUiModel());
     setModel(uibundleModel);
     setWindowTitle("Carbon UI bundle wizard");
     setDefaultPageImageDescriptor(CarbonUIImageUtils.getInstance().getImageDescriptor("carbon-ui-bundle-wizard.png"));
    }
    
   public IWizardPage getNextPage(IWizardPage page) {
		IWizardPage nextPage = super.getNextPage(page);
		if(page instanceof ProjectOptionsDataPage ){
				if(getModel().getSelectedOption().equalsIgnoreCase("import.uibundle")){
					IProject temp =uibundleModel.getCarbonUIproject();
					File pomfile = temp.getFile("pom.xml").getLocation().toFile();
					if(!pomfile.exists()){
				      try {
				    	  getModel().setMavenInfo(new MavenInfo("org.wso2.carbon." + temp.getName(),temp.getName(),
				    			  "1.0.0"));
					      getModel().setProjectName(temp.getName());
					} catch (Exception e) {
						//log.error("project update fail",e);
					}
					}else{					    
					   nextPage=null;
					}
				}
		}
		return nextPage;
	}

    
	public boolean performFinish(){
	    try {
			if(uibundleModel.getSelectedOption().equals("new.uibundle")){
				project = createNewProject();
//				IFolder  srcFolder= ProjectUtils.getWorkspaceFolder(project, "src",uibundleModel.getProjectName());
				IFolder  srcFolder= ProjectUtils.getWorkspaceFolder(project, "src");
		     	JavaUtils.addJavaSupportAndSourceFolder(project, srcFolder);
		     	ProjectUtils.createFolder(srcFolder);
		     	
		     	if(uibundleModel.isActivatorRequired()){
//			     	String className = "Activator";
		     		String className = uibundleModel.getActivatorClassName();
		     		className = getClassName(uibundleModel.getActivatorClassName());
//			     	String packageName = uibundleModel.getProjectName();
		     		String packageName = getPackageName(uibundleModel.getActivatorClassName());
			     	IJavaProject iJavaProject = JavaCore.create(project);
			     	IPackageFragmentRoot root = iJavaProject.getPackageFragmentRoot(srcFolder);
			     	IPackageFragment sourcePackage = root.createPackageFragment(packageName, false, null);
			     	String template = CarbonUIbudleTemplate.createActivatorClassTemplete(packageName, className);
					sourcePackage.createCompilationUnit(className+".java", template, false, null);
		     	}
		     	/*create Meta INF Folder data*/
				IFolder metaInf = this.createWorkspaceFolder("META-INF");
				String componentXmlSource = CarbonUIbudleTemplate.createComponentXMLTemplate();
				createProjectFile(metaInf, "component.xml", componentXmlSource);
				String metaInfSource = CarbonUIbudleTemplate.createManifestFileTemplate(uibundleModel);
				createProjectFile(metaInf, "MANIFEST.MF", metaInfSource);
			    createDirectoryhierarchy(uibundleModel.getDeployPath()); 
				project.refreshLocal(IResource.DEPTH_INFINITE,new NullProgressMonitor());
			} else{
		      project = uibundleModel.getCarbonUIproject();
			}
			File pomfile = project.getFile("pom.xml").getLocation().toFile();
			getModel().getMavenInfo().setPackageName("bundle");
			if(!pomfile.exists()){
				createPOM(pomfile);
				addDependancies(project);
			}
			MavenProject mavenProject = MavenUtils.getMavenProject(pomfile);
			List<Plugin> plugins = mavenProject.getBuild().getPlugins();
			for(Plugin plg:plugins){
				if(plg.getId().equals("maven-bundle-plugin")){ 
					project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
					return true;
				}
			}
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			ProjectUtils.addNatureToProject(project,false,
			                       "org.wso2.developerstudio.eclipse.artifact.carbon.ui.bundle.project.nature");
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			
			try {
				IFile activatorClassForProject = getManifestFileForProject(project);
				IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(),activatorClassForProject);
			} catch (Exception e) {
				e.printStackTrace();
			}
	    } catch (CoreException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	
	
	private IFile getActivatorClassForProject(IProject project) throws JavaModelException{
		List<File> javaFileList = new ArrayList<File>();
		File[] javaFiles = FileUtils.getAllExactMatchingFiles(project.getLocation().toString(), null, "java", javaFileList);
		for (File javaFile : javaFiles) {
			String relativePath = FileUtils.getRelativePath(project.getLocation().toFile(), javaFile);
			IFile sourceFile = project.getFile(relativePath);
			boolean isClassImplemented = JavaUtils.isClassImplement(project, "BundleActivator");
			if(isClassImplemented){
				return sourceFile;
			}
		}
		return null;
	}
	
	private IFile getManifestFileForProject(IProject project) throws JavaModelException{
		List<File> manifestFileList = new ArrayList<File>();
		File[] manifestFiles = FileUtils.getAllExactMatchingFiles(project.getLocation().toString(), "MANIFEST", "MF", manifestFileList);
		for (File manifest : manifestFiles) {
			String relativePath = FileUtils.getRelativePath(project.getLocation().toFile(), manifest);
			IFile sourceFile = project.getFile(relativePath);
//			boolean isClassImplemented = JavaUtils.isClassImplement(project, "BundleActivator");
//			if(isClassImplemented){
			return sourceFile;
//			}
		}
		return null;
	}
	
	private String getClassName(String fullyQualifiedClassName){
		return (fullyQualifiedClassName.lastIndexOf('.') > 0)?fullyQualifiedClassName.substring(fullyQualifiedClassName.lastIndexOf('.')+1):fullyQualifiedClassName;
	}
	
	private String getPackageName(String fullyQualifiedClassName){
		return (fullyQualifiedClassName.lastIndexOf('.') > 0)?fullyQualifiedClassName.substring(0,fullyQualifiedClassName.lastIndexOf('.')):"";
	}

	private void createDirectoryhierarchy(String path) throws CoreException {
		 StringBuffer buff = new StringBuffer();
		 String delimiter = "/";
		 String[]  temp =path.split(delimiter);
		  for(int i =0; i < temp.length ; i++){
			  buff.append(temp[i]);
			  IFolder folder = project.getFolder(buff.toString());  
			  folder.create(true, true, new NullProgressMonitor());
			  buff.append("/");
		  }
	}
	
	public static CarbonUiModel getUibundleModel() {
		return uibundleModel;
	}

	public void setUibundleModel(CarbonUiModel uiModel) {
		uibundleModel = uiModel;
	}
	
	public IResource getCreatedResource() {
		return project;
	}
	
	private void createProjectFile(IFolder folder,String fileName,String fileSource) throws IOException{
		File  metaInf = new File(folder.getLocation().toFile(),fileName);
		FileUtils.createFile(metaInf, fileSource);
	}
	
	private IFolder createWorkspaceFolder(String folderName) throws CoreException {
		IFolder folder = ProjectUtils.getWorkspaceFolder(project,folderName);
		if (!folder.exists()) {
			folder.create(false, true, null);
		}
		return folder;
	}
	
	private void addDependancies(IProject project) {
		try {
			String[] depedencyList1 = getDepandanceyList();
			for (String libName : depedencyList1) {
				File dependencyPath = LibraryUtils.getDependencyPath(libName);
				JavaUtils.addJarLibraryToProject(project, dependencyPath);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private String[] getDepandanceyList() throws Exception {
		ResourceBundle mediatorPropetiesBundle = ResourceBundle.getBundle("carbonUI");
		String jarList = mediatorPropetiesBundle.getString("Plugin_dependencies");
		String delimiter = ",";
		String[] depedencyList = jarList.split(delimiter);
		return depedencyList;
	}
}
