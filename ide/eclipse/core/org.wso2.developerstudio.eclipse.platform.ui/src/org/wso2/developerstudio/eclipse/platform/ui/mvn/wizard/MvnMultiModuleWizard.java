package org.wso2.developerstudio.eclipse.platform.ui.mvn.wizard;

import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;

import java.util.List;

public class MvnMultiModuleWizard extends AbstractWSO2ProjectCreationWizard  {

	private MvnMultiModuleModel moduleModel;
	private IProject project;
	private IProject multiModuleProject;
	
	
	public MvnMultiModuleWizard(){
		 moduleModel = new MvnMultiModuleModel();
		 setModel(moduleModel);
	     setWindowTitle("Maven Modules Creation Wizard");
	   //  setDefaultPageImageDescriptor(MediatorImageUtils.getInstance().getImageDescriptor("new-mediator-wizard.png"));

	}
	

	public boolean performFinish() {
//		If the multiModuleProject is not empty, then this is thru UI. Just generate the POM
		MavenProject mavenProject = MavenUtils.createMavenProject(moduleModel.getGroupId(), moduleModel.getArtifactId(), moduleModel.getVersion(), "pom");
		
		List modules = mavenProject.getModules();
		
		List<IProject> selectedProjects = moduleModel.getSelectedProjects();
		
		if(multiModuleProject != null){
			for (IProject iProject : selectedProjects) {
				String relativePath = FileUtils.getRelativePath(multiModuleProject.getLocation().toFile(), iProject.getLocation().toFile());
				modules.add(relativePath);
            }
			try {
	            MavenUtils.saveMavenProject(mavenProject, multiModuleProject.getFile("pom.xml").getLocation().toFile());
            } catch (Exception e) {
	            e.printStackTrace();
            }
		}
		
		
//        try {
//			project = createNewProject();
//			
//			//Add Logic here 
//			
//			
//		} catch (CoreException e) {
//		 
//		}
		return true;
	}


	@Override
	public IResource getCreatedResource() {
		return project;
	}


	public void setMultiModuleProject(IProject multiModuleProject) {
	    this.multiModuleProject = multiModuleProject;
    }


	public IProject getMultiModuleProject() {
	    return multiModuleProject;
    }
}
