package org.wso2.carbonstudio.eclipse.artifact.mediator.ui.wizard;

import java.io.File;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.maven.model.Plugin;
import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.IEditorPart;
import org.wso2.carbonstudio.eclipse.artifact.mediator.model.CustomMediatorModel;
import org.wso2.carbonstudio.eclipse.artifact.mediator.template.CustomMediatorClassTemplate;
import org.wso2.carbonstudio.eclipse.libraries.utils.LibraryUtils;
import org.wso2.carbonstudio.eclipse.maven.util.MavenUtils;
import org.wso2.carbonstudio.eclipse.platform.core.model.MavenInfo;
import org.wso2.carbonstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.carbonstudio.eclipse.platform.ui.wizard.pages.ProjectOptionsDataPage;
import org.wso2.carbonstudio.eclipse.utils.jdt.JavaUtils;
import org.wso2.carbonstudio.eclipse.utils.project.ProjectUtils;

public class CustomMediatorCreationWizard extends AbstractWSO2ProjectCreationWizard {
    private  CustomMediatorModel customMediatorModel;
    private  IProject project;
//	private  ICarbonStudioLog log;
	
    public CustomMediatorCreationWizard(){
     setCustomMediatorModel(new CustomMediatorModel());
     setModel(customMediatorModel);
     setWindowTitle("Mediator Creation Wizard");
    }
    
    public IWizardPage getNextPage(IWizardPage page) {
		IWizardPage nextPage = super.getNextPage(page);
		if(page instanceof ProjectOptionsDataPage ){
				if(getModel().getSelectedOption().equalsIgnoreCase("import.mediator")){
					IProject temp =customMediatorModel.getMediatorProject();
					File pomfile = temp.getFile("pom.xml").getLocation().toFile();
					if(!pomfile.exists()){
				      try {
				    	  getModel().setMavenInfo(new MavenInfo("org.wso2.carbon",temp.getName(),
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
   
	@Override
	public boolean performFinish(){
	    try {
	    	
			if(customMediatorModel.getSelectedOption().equals("new.mediator")){
				project = createNewProject();
				IFolder  srcFolder= ProjectUtils.getWorkspaceFolder(project, "src", "main","java");
		     	JavaUtils.addJavaSupportAndSourceFolder(project, srcFolder);	     	
		     	
		    	/*create the new Java project*/
		     	String className = customMediatorModel.getMediatorClassName();
		     	String packageName = customMediatorModel.getMediatorClassPackageName();
		     	IJavaProject iJavaProject = JavaCore.create(project);
		     	IPackageFragmentRoot root = iJavaProject.getPackageFragmentRoot(srcFolder);
		     	IPackageFragment sourcePackage = root.createPackageFragment(packageName, false, null);
		     	
		     	/*get the Mediator class template*/
		     	String template = CustomMediatorClassTemplate.getClassTemplete(packageName, className);
				ICompilationUnit cu = sourcePackage.createCompilationUnit(className+".java", template, false, null);

				/*Map<File, ArrayList<String>> exportedPackagesInfoMap = FileUtils
				.processJarList(project.getLocation().toFile()
						.listFiles(new FilenameFilter() {
							public boolean accept(File file, String name) {
								return name.endsWith(".jar");
							}
						}));*/
				
				//createExportPackages(iJavaProject);
				project.refreshLocal(IResource.DEPTH_INFINITE,new NullProgressMonitor());
				try {
					IEditorPart javaEditor = JavaUI.openInEditor(cu);
					JavaUI.revealInEditor(javaEditor, (IJavaElement) cu);
				} catch (Exception e) { /* ignore */}
			} else{
		     project = customMediatorModel.getMediatorProject();
		    // createExportPackages(JavaCore.create(project));
			 project.refreshLocal(IResource.DEPTH_INFINITE,new NullProgressMonitor());
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
				if(plg.getId().equals("maven-synapse-mediator-plugin")){ 
					project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
					return true;
				}
			}
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			ProjectUtils.addNatureToProject(project,false,
			                       "org.wso2.carbonstudio.eclipse.artifact.mediator.project.nature");
			
			customMediatorModel.addToWorkingSet(project);
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
	    } catch (CoreException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	/*private void createExportPackages(IJavaProject iJavaProject) throws CoreException,
			JavaModelException, Exception {

            BundlesDataInfo bundleData = new BundlesDataInfo();
			IFile mediatorData = project.getFile("mediator-data.xml");
			//mediatorData.setHidden(true);
			ArrayList<String> exportedPackagesList = new ArrayList<String>();
			IPackageFragment[] packages = iJavaProject.getPackageFragments();
		    for (IPackageFragment iPackageFragment : packages) {
				    iPackageFragment.getElementName();
				    if (iPackageFragment.getKind() == IPackageFragmentRoot.K_SOURCE) { 
				    	 if(iPackageFragment.hasChildren()){
						    	exportedPackagesList.add(iPackageFragment.getElementName());
				    	 }
					}
			}
		 bundleData.createProjectElement(project, exportedPackagesList); 
		 bundleData.toFile(mediatorData);
	}
*/	
	public void setCustomMediatorModel(CustomMediatorModel customMediatorModel) {
		this.customMediatorModel = customMediatorModel;
	}

	public CustomMediatorModel getCustomMediatorModel() {
		return customMediatorModel;
	}

	@Override
	public IResource getCreatedResource() {
		return project;
	}
	
	private void addDependancies(IProject project) {
		try {
			String[] depedencyList1 = getDepandanceyList();
			for (String libName : depedencyList1) {
				JavaUtils.addJarLibraryToProject(project,
						LibraryUtils.getDependencyPath(libName));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private String[] getDepandanceyList() throws Exception {
		ResourceBundle mediatorPropetiesBundle = ResourceBundle.getBundle("mediator");
		String jarList = mediatorPropetiesBundle.getString("Plugin_dependencies");
		String delimiter = ",";
		String[] depedencyList = jarList.split(delimiter);
		return depedencyList;
	}
}
