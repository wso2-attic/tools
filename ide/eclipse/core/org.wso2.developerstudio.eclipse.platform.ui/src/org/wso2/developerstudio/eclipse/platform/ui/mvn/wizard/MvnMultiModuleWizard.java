package org.wso2.developerstudio.eclipse.platform.ui.mvn.wizard;

import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.wizard.IWizardPage;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.core.exception.ObserverFailedException;
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
	
	public void init(){
		
		if(multiModuleProject != null){
			IFile pomFile = multiModuleProject.getFile("pom.xml");
			if(pomFile.exists()){
				//Parse the pom and see the packaging type
				try {
					MavenProject mavenProject2 = MavenUtils.getMavenProject(pomFile.getLocation().toFile());
//					String packaging = mavenProject2.getPackaging();
//					if("pom".equalsIgnoreCase(packaging)){
						moduleModel.setModelPropertyValue("group.id", mavenProject2.getGroupId());
						moduleModel.setModelPropertyValue("artifact.id", mavenProject2.getArtifactId());
						moduleModel.setModelPropertyValue("version.id", mavenProject2.getVersion());
//					}
				}catch (Exception e) {
				}
			}else{
//				Suggest some default values
				try {
	                moduleModel.setModelPropertyValue("group.id", "org.wso2.maven");
	                moduleModel.setModelPropertyValue("artifact.id", multiModuleProject.getName());
	                moduleModel.setModelPropertyValue("version.id", "1.0.0");
                } catch (ObserverFailedException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
                }
			}
		}
	}
	

	public boolean performFinish() {
//		If the multiModuleProject is not empty, then this is thru UI. Just generate the POM
		MavenProject mavenProject = MavenUtils.createMavenProject(moduleModel.getGroupId(), moduleModel.getArtifactId(), moduleModel.getVersion(), "pom");
		
		List modules = mavenProject.getModules();
		
		List<IProject> selectedProjects = moduleModel.getSelectedProjects();
		
		if(multiModuleProject != null){
			IFile pomFile = multiModuleProject.getFile("pom.xml");
			if(pomFile.exists()){
				//Parse the pom and see the packaging type
				try {
	                MavenProject mavenProject2 = MavenUtils.getMavenProject(pomFile.getLocation().toFile());
	                String packaging = mavenProject2.getPackaging();
	                if(!"pom".equalsIgnoreCase(packaging)){
	                	
	                	for (IProject iProject : selectedProjects) {
	                		String relativePath = FileUtils.getRelativePath(multiModuleProject.getLocation().toFile(), iProject.getLocation().toFile());
	                		if (!modules.contains(relativePath)) {
	                            modules.add(relativePath);
                            }
	                	}
	                	try {
	                		MavenUtils.saveMavenProject(mavenProject, pomFile.getLocation().toFile());
	                		multiModuleProject.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
	                	} catch (Exception e) {
	                		e.printStackTrace();
	                	}
	                }else{
	                	modules=mavenProject2.getModules();
	                	mavenProject2.setGroupId(moduleModel.getGroupId());
	                	mavenProject2.setArtifactId(moduleModel.getArtifactId());
	                	mavenProject2.setVersion(moduleModel.getVersion());
	                	for (IProject iProject : selectedProjects) {
	                		String relativePath = FileUtils.getRelativePath(multiModuleProject.getLocation().toFile(), iProject.getLocation().toFile());
	                		if (!modules.contains(relativePath)) {
	                            modules.add(relativePath);
                            }
	                	}
	                	try {
	                		MavenUtils.saveMavenProject(mavenProject2, pomFile.getLocation().toFile());
	                		multiModuleProject.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
	                	} catch (Exception e) {
	                		e.printStackTrace();
	                	}
	                }
	                
                } catch (Exception e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
                }
				
				
			}else{
//				Since pom is not there, just create the new pom with all the necessary things
            	for (IProject iProject : selectedProjects) {
            		String relativePath = FileUtils.getRelativePath(multiModuleProject.getLocation().toFile(), iProject.getLocation().toFile());
            		if (!modules.contains(relativePath)) {
                        modules.add(relativePath);
                    }
            	}
            	try {
            		MavenUtils.saveMavenProject(mavenProject, pomFile.getLocation().toFile());
            		multiModuleProject.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
            	} catch (Exception e) {
            		e.printStackTrace();
            	}
			}
			
			
			
            
		}else{
			try {
				moduleModel.setProjectName(moduleModel.getArtifactId());
	            project = createNewProject();
	            
	            for (IProject iProject : selectedProjects) {
					String relativePath = FileUtils.getRelativePath(project.getLocation().toFile(), iProject.getLocation().toFile());
            		if (!modules.contains(relativePath)) {
                        modules.add(relativePath);
                    }
	            }
				try {
		            MavenUtils.saveMavenProject(mavenProject, project.getFile("pom.xml").getLocation().toFile());
		            project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
	            } catch (Exception e) {
		            e.printStackTrace();
	            }
	            
            } catch (CoreException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
            } catch (ObserverFailedException e) {
	            // TODO Auto-generated catch block
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
