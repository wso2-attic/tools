package org.wso2.developerstudio.eclipse.platform.ui.mvn.wizard;

import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.core.exception.ObserverFailedException;
import org.wso2.developerstudio.eclipse.platform.core.utils.Constants;
import org.wso2.developerstudio.eclipse.platform.ui.Activator;
import org.wso2.developerstudio.eclipse.platform.ui.mvn.util.MavenMultiModuleProjectImageUtils;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;

import java.util.ArrayList;
import java.util.List;

public class MvnMultiModuleWizard extends AbstractWSO2ProjectCreationWizard {
	private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);

	private MvnMultiModuleModel moduleModel;
	private IProject project;
	private IProject multiModuleProject;

	public MvnMultiModuleWizard() {
		moduleModel = new MvnMultiModuleModel();
		setModel(moduleModel);
		setWindowTitle("Maven Modules Creation Wizard");
		setDefaultPageImageDescriptor(MavenMultiModuleProjectImageUtils.getInstance().getImageDescriptor("maven-24x24.png"));
	}

	public void init() {

		if (multiModuleProject != null) {
			IFile pomFile = multiModuleProject.getFile("pom.xml");
			if (pomFile.exists()) {
				// Parse the pom and see the packaging type
				try {
					MavenProject mavenProject2 =
					                             MavenUtils.getMavenProject(pomFile.getLocation()
					                                                               .toFile());

					setMavenProperty(mavenProject2.getGroupId(), mavenProject2.getArtifactId(),
					                 mavenProject2.getVersion());
				} catch (Exception e) {
					log.error("Error occured while trying to create the Maven Project", e);
				}
			} else {
				setMavenProperty("org.wso2.maven", multiModuleProject.getName(), "1.0.0");
			}
		}
	}

	/**
	 * @throws ObserverFailedException
	 */
	private void setMavenProperty(String groupId, String artifactId, String version) {
		try {
			moduleModel.setModelPropertyValue("group.id", groupId);
			moduleModel.setModelPropertyValue("artifact.id", artifactId);
			moduleModel.setModelPropertyValue("version.id", version);
		} catch (ObserverFailedException e) {
			log.error("Error occured while trying to inject values to the Project Model", e);
		}
	}

	public boolean performFinish() {
		// If the multiModuleProject is not empty, then this is thru UI. Just generate the POM
		MavenProject mavenProject =
		                            MavenUtils.createMavenProject(moduleModel.getGroupId(),
		                                                          moduleModel.getArtifactId(),
		                                                          moduleModel.getVersion(), "pom");

		List modules = mavenProject.getModules();

		List<IProject> selectedProjects = moduleModel.getSelectedProjects();
		
		selectedProjects=sortProjects(selectedProjects);

		if (multiModuleProject != null) {
			IFile pomFile = multiModuleProject.getFile("pom.xml");
			if (pomFile.exists()) {
				// Parse the pom and see the packaging type
				try {
					MavenProject mavenProject2 =
					                             MavenUtils.getMavenProject(pomFile.getLocation()
					                                                               .toFile());
					String packaging = mavenProject2.getPackaging();
					if (!"pom".equalsIgnoreCase(packaging)) {
						addMavenModules(multiModuleProject, mavenProject, modules,
						                selectedProjects, pomFile);
					} else {
						modules = mavenProject2.getModules();
						mavenProject2.setGroupId(moduleModel.getGroupId());
						mavenProject2.setArtifactId(moduleModel.getArtifactId());
						mavenProject2.setVersion(moduleModel.getVersion());
						addMavenModules(multiModuleProject, mavenProject2, modules,
						                selectedProjects, pomFile);
					}

				} catch (Exception e) {
					log.error("Error occured while trying to generate the Maven Project for the Project Pom",
					          e);
				}

			} else {
				// Since pom is not there, just create the new pom with all the necessary things
				addMavenModules(multiModuleProject, mavenProject, modules, selectedProjects,
				                pomFile);
			}
//			Adding Maven Multi Module Nature to POM generated Project 
			addMavenMultiModuleProjectNature(multiModuleProject);

		} else {
			try {
				moduleModel.setProjectName(moduleModel.getArtifactId());
				project = createNewProject();
				
				addMavenMultiModuleProjectNature(project);

				addMavenModules(project, mavenProject, modules, selectedProjects,
				                project.getFile("pom.xml"));

			} catch (CoreException e) {
				log.error("Error occured while creating the new Maven Multi Module Project", e);
			} catch (ObserverFailedException e) {
				log.error("Error occured while trying to inject values to the Project Model", e);
			}
		}
		return true;
	}

	private void addMavenMultiModuleProjectNature(IProject projectToAdddNature){
		try {
			ProjectUtils.addNatureToProject(projectToAdddNature, false,"org.wso2.developerstudio.eclipse.mavenmultimodule.project.nature");
			projectToAdddNature.refreshLocal(IResource.DEPTH_INFINITE,new NullProgressMonitor());
		} catch (CoreException e) {
			log.error("Error occured while adding the Maven Multi Module Nature to Project", e);
		}
	}

	/**
	 * @param mavenProject
	 * @param modules
	 * @param selectedProjects
	 * @param pomFile
	 */
	private void addMavenModules(IProject selectedProject, MavenProject mavenProject, List modules,
	                             List<IProject> selectedProjects, IFile pomFile) {
		modules.clear();
		for (IProject iProject : selectedProjects) {
			String relativePath =
			                      FileUtils.getRelativePath(selectedProject.getLocation().toFile(),
			                                                iProject.getLocation().toFile());
			if (!modules.contains(relativePath)) {
				modules.add(relativePath);
			}
		}
		try {
			MavenUtils.saveMavenProject(mavenProject, pomFile.getLocation().toFile());
			selectedProject.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (Exception e) {
			log.error("Error occured while trying to save the maven project", e);
		}
	}

	@Override
	public IResource getCreatedResource() {
		return project;
	}
	
	@Override
	protected boolean isProjectWizard() {
		return false;
	}

	public void setMultiModuleProject(IProject multiModuleProject) {
		this.multiModuleProject = multiModuleProject;
	}

	public IProject getMultiModuleProject() {
		return multiModuleProject;
	}
	
	private List<IProject> sortProjects(List<IProject> projects){
		try {
		List<IProject> distributionProjects=new ArrayList<IProject>();
		List<IProject> projectList=new ArrayList<IProject>();
		
		for (IProject iProject : projects) {
	            if(iProject.hasNature(Constants.DISTRIBUTION_PROJECT_NATURE)){
	            	distributionProjects.add(iProject);
	            }else{
	            	projectList.add(iProject);
	            }
        }
		
		projects=projectList;
		for (IProject iProject : distributionProjects) {
	        projectList.add(iProject);
        }
		
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return projects;
	}
}
