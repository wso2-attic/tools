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

package org.wso2.developerstudio.eclipse.artifact.library.ui.wizard;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.maven.model.Dependency;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.Repository;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.wizard.IWizardPage;
import org.wso2.developerstudio.eclipse.artifact.library.model.LibraryArtifactModel;
import org.wso2.developerstudio.eclipse.artifact.library.util.Constants;
import org.wso2.developerstudio.eclipse.artifact.library.util.LibraryImageUtils;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.core.bundle.BundlesDataInfo;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.pages.MavenDetailsPage;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.pages.ProjectOptionsDataPage;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;

public class LibraryArtifactCreationWizard extends
		AbstractWSO2ProjectCreationWizard {
	private LibraryArtifactModel libraryModel;
	private NewJavaLibraryWizardPage javaLibraryWizardPage;
	private IWizardPage[] pages;

	public LibraryArtifactCreationWizard() {
		libraryModel = new LibraryArtifactModel();
		setLibraryModel(libraryModel);
		setModel(getLibraryModel());
		setDefaultPageImageDescriptor(LibraryImageUtils.getInstance().getImageDescriptor("jar-wizard.png"));
	}

	public IResource getCreatedResource() {
		return null;
	}

	public boolean performFinish() {
		try {
			BundlesDataInfo bundleData = new BundlesDataInfo();
			IProject project = createNewProject();
			//IFolder libFolder = ProjectUtils.getWorkspaceFolder(project, "lib"); 
			//libFolder.create(true, true, new NullProgressMonitor());
			IFile bundlesDataFile = project.getFile("bundles-data.xml");
				
			List<Dependency> dependencyList = new ArrayList<Dependency>();
			List<String> exportedPackages = new ArrayList<String>();
			StringBuffer sb=new StringBuffer();
			
			if (libraryModel.isFragmentHostBundle()) {
				bundleData.setFragmentHost(libraryModel.getFragmentHostBundleName());
			}
			
			List<IProject> projects = new ArrayList<IProject>();
			for (Object resource : libraryModel.getLibraries()) {
				File libraryResource = null;
				if (resource instanceof File) {
					libraryResource = (File) resource;
				} else if (resource instanceof IFile) {
					libraryResource = new File(((IFile) resource).getLocation()
							.toOSString());
				} else if (resource instanceof IProject) {
					IProject workSpacePrj = (IProject) resource;
					projects.add(workSpacePrj);
					File pomfile = workSpacePrj.getFile("pom.xml").getLocation().toFile();
					if (!pomfile.exists()) {
						MavenProject mavenProject = MavenUtils.createMavenProject(
								"org.wso2.carbon." + workSpacePrj.getName() , workSpacePrj.getName(), "1.0.0", "jar");
						MavenUtils.saveMavenProject(mavenProject, pomfile);
					}
				}
				if (libraryResource != null) {
					FileUtils.copyFile(libraryResource.toString(),
							new File(project.getLocation().toFile(),
									libraryResource.getName()).toString());
				}
			}
			project.refreshLocal(IResource.DEPTH_INFINITE,
					new NullProgressMonitor());

			Map<File, ArrayList<String>> exportedPackagesInfoMap = FileUtils
					.processJarList(project.getLocation().toFile()
							.listFiles(new FilenameFilter() {

								public boolean accept(File file, String name) {
									return name.endsWith(".jar");
								}
							}));
			for (File jarFile : exportedPackagesInfoMap.keySet()) {
				Path base = new Path(project.getLocation().toFile()
						.toString());
				Path jar = new Path(jarFile.toString());
				String jarName = null;
				for (int i = base.segmentCount(); i < jar.segmentCount(); i++) {
					if (jarName == null) {
						jarName = jar.segment(i);
					} else {
						jarName += "/" + jar.segment(i);
					}
				}
				if (jarName == null) {
					jarName = "libraries/" + jarFile.getName();
				}
				
				exportedPackages.addAll(exportedPackagesInfoMap.get(jarFile));
				bundleData.createJarElement(jarFile.getName(), exportedPackagesInfoMap.get(jarFile));
				
				Dependency dependency = new Dependency();
				dependency.setArtifactId(jarFile.getName());
				dependency.setGroupId("dummy.groupid");
				dependency.setVersion("1.0.0");
				dependency.setScope("system");
				dependency.setSystemPath("${basedir}/" + jarFile.toString().substring(base.toFile().getPath().length() + 1) );
				dependencyList.add(dependency);
				
			}
			for (IProject prj : projects) {
				IFile pomFile = prj.getFile("pom.xml");
				if(pomFile.exists()) {
					try {
						MavenProject mavenProject = MavenUtils.getMavenProject(pomFile.getLocation().toFile());
						Dependency dependency = new Dependency();
						dependency.setArtifactId(mavenProject.getArtifactId());
						dependency.setGroupId(mavenProject.getGroupId());
						dependency.setVersion(mavenProject.getVersion());
						dependencyList.add(dependency);
					} catch (Exception ignored) {
						//ignored
					}
				}
				bundleData.createProjectElement(prj, new ArrayList<String>());
				//TODO: add export packages for project (maven build)
			}
			
			for(String exportedpackage : exportedPackages) {
				sb.append(exportedpackage.trim()).append(",");
			}
			String exportPackageNodeValue = sb.toString().trim().replaceAll(",$","");
			bundleData.toFile(bundlesDataFile);
			project.refreshLocal(IResource.DEPTH_INFINITE,
					new NullProgressMonitor());
			bundlesDataFile.setHidden(true);
			
			

			File pomfile = project.getFile("pom.xml").getLocation().toFile();
			getModel().getMavenInfo().setPackageName("bundle");
			if (!pomfile.exists()) {
				createPOM(pomfile);
			}
			
			MavenProject mavenProject = MavenUtils.getMavenProject(pomfile);

			mavenProject.getModel().getProperties().put("CApp.type","lib/library/bundle");
			
			Plugin plugin = MavenUtils.createPluginEntry(mavenProject,
					"org.apache.felix", "maven-bundle-plugin", "2.3.4",
					true);
			
			Xpp3Dom configurationNode = MavenUtils.createMainConfigurationNode(plugin);
			Xpp3Dom instructionNode = MavenUtils.createXpp3Node(configurationNode, "instructions");
			Xpp3Dom symbolicNameNode = MavenUtils.createXpp3Node(instructionNode, "Bundle-SymbolicName");
			symbolicNameNode.setValue(mavenProject.getArtifactId());
			Xpp3Dom bundleNameNode = MavenUtils.createXpp3Node(instructionNode, "Bundle-Name");
			bundleNameNode.setValue(mavenProject.getArtifactId());
			Xpp3Dom exportPackageNode = MavenUtils.createXpp3Node(instructionNode, "Export-Package");
			exportPackageNode.setValue(exportPackageNodeValue);
			Xpp3Dom dynamicImportNode = MavenUtils.createXpp3Node(instructionNode, "DynamicImport-Package");
			dynamicImportNode.setValue("*");
			if (libraryModel.isFragmentHostBundle()) {
				Xpp3Dom fragmentHostNode = MavenUtils.createXpp3Node(instructionNode, "Fragment-Host");
				fragmentHostNode.setValue(libraryModel.getFragmentHostBundleName());
			}
		

			Repository repo = new Repository();
			repo.setUrl("http://dist.wso2.org/maven2");
			repo.setId("wso2-maven2-repository-1");

			mavenProject.getModel().addRepository(repo);
			mavenProject.getModel().addPluginRepository(repo);		

			MavenUtils.addMavenDependency(mavenProject, dependencyList);
			MavenUtils.saveMavenProject(mavenProject, pomfile);
			
			
			ProjectUtils.addNatureToProject(project, false,
					Constants.LIBRARY_PROJECT_NATURE);
			project.refreshLocal(IResource.DEPTH_INFINITE,
					new NullProgressMonitor());

		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

	public void addPages() {
		javaLibraryWizardPage = new NewJavaLibraryWizardPage();
		super.addPages();
		addPage(javaLibraryWizardPage);
		pages = getPages();
	}

	public IWizardPage getNextPage(IWizardPage page) {
		IWizardPage nextPage = super.getNextPage(page);
		if (page instanceof ProjectOptionsDataPage) {
			nextPage = javaLibraryWizardPage;
		}
		if (page instanceof NewJavaLibraryWizardPage) {
			nextPage = pages[1];
		}
		if (page instanceof MavenDetailsPage) {
			nextPage = null;

		}
		return nextPage;
	}

	public IWizardPage getPreviousPage(IWizardPage page) {
		IWizardPage previousPage = super.getNextPage(page);
		if (page instanceof MavenDetailsPage) {
			previousPage = javaLibraryWizardPage;
		}
		if (page instanceof NewJavaLibraryWizardPage) {
			previousPage = pages[0];
		}
		return previousPage;
	}

	public boolean canFinish() {
		if (getContainer().getCurrentPage() instanceof ProjectOptionsDataPage) {
			return false;
		}
		return super.canFinish();
	}

	public void setLibraryModel(LibraryArtifactModel libraryModel) {
		this.libraryModel = libraryModel;
	}

	public LibraryArtifactModel getLibraryModel() {
		return libraryModel;
	}

}
