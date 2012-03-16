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

package org.wso2.developerstudio.eclipse.artifact.library.project.export;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.core.bundle.BundlesDataInfo;
import org.wso2.developerstudio.eclipse.platform.core.manifest.BundleManifest;
import org.wso2.developerstudio.eclipse.platform.core.project.export.ProjectArtifactHandler;
import org.wso2.developerstudio.eclipse.utils.archive.ArchiveManipulator;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;
import org.wso2.developerstudio.eclipse.utils.file.TempFileUtils;

public class LibraryArtifactHandler extends ProjectArtifactHandler {

	public List<IResource> exportArtifact(IProject project) throws Exception{
		List<IResource> exportResources = new ArrayList<IResource>();
		List<String> exportedPackageList = new ArrayList<String>();
		
			ArchiveManipulator archiveManipulator = new ArchiveManipulator();
			NullProgressMonitor nullProgressMonitor = new NullProgressMonitor();
			BundlesDataInfo bundleData = new BundlesDataInfo();
			IFile bundleDataFile = project.getFile("bundles-data.xml");

			MavenProject mavenProject = MavenUtils.getMavenProject(project.getFile("pom.xml")
					.getLocation().toFile());

			if (bundleDataFile.exists()) {

				File tempProject = createTempProject();
				File libResources = createTempDir(tempProject,"lib_resources");
				bundleData.deserialize(bundleDataFile);

				for (String lib : bundleData.getExportedPackageListsFromJar().keySet()) {
					IFile JarFile = project.getFile(lib);
					if (JarFile.exists()) {
						archiveManipulator.extract(JarFile.getLocation().toFile(), libResources);
						exportedPackageList.addAll(bundleData.getExportedPackageListsFromJar().get(
								lib));
					}
				}
				for (IProject lib : bundleData.getExportedPackageListsFromProject().keySet()) {
					if (lib.isOpen()) {
						lib.build(IncrementalProjectBuilder.FULL_BUILD, nullProgressMonitor);
						IJavaProject javaLibProject = JavaCore.create(lib);
						for (IPackageFragment pkg : javaLibProject.getPackageFragments()) {
							if (pkg.getKind() == IPackageFragmentRoot.K_SOURCE) {
								if (pkg.hasChildren()) {
									exportedPackageList.add(pkg.getElementName());
								}
							}
						}

						IPath outPutPath = getOutputPath(javaLibProject);
						// get resource location
						IPath resources = getResourcePath(lib);

						FileUtils.copyDirectoryContents(outPutPath.toFile(), libResources);
						if (resources.toFile().exists()) {
							FileUtils.copyDirectoryContents(resources.toFile(), libResources);
						}
					}
				}

				BundleManifest manifest = new BundleManifest();
				manifest.setBundleName(project.getName());
				manifest.setBundleSymbolicName(project.getName());
				if (null != mavenProject.getModel().getDescription()
						&& !"".equals(mavenProject.getModel().getDescription())) {
					manifest.setBundleDescription(mavenProject.getModel().getDescription());
				} else {
					manifest.setBundleDescription(project.getName());
				}
				if (null != mavenProject.getModel().getVersion()
						&& !"".equals(mavenProject.getDescription())) {
					manifest.setBundleVersion(mavenProject.getModel().getVersion());
				} else {
					manifest.setBundleVersion("1.0.0");
				}
				if (null != bundleData.getFragmentHost()
						&& !"".equals(bundleData.getFragmentHost())) {
					manifest.setFragmentHost(bundleData.getFragmentHost());
				}
				manifest.setExportPackagesList(exportedPackageList);
				File metaInfDir = new File(libResources, "META-INF");
				if (!metaInfDir.exists())
					metaInfDir.mkdir();
				File manifestFile = new File(metaInfDir, "MANIFEST.MF");
				FileUtils.createFile(manifestFile, manifest.toString());

				File tmpArchive = new File(tempProject, project.getName()
						.concat(".jar"));
				archiveManipulator.archiveDir(tmpArchive.toString(), libResources.toString());
				
				IFile libArchive = getTargetArchive(project,"jar");
				FileUtils.copy(tmpArchive, libArchive.getLocation().toFile());
				exportResources.add((IResource) libArchive);

				// cleaning temp project
//		        if(!org.apache.commons.io.FileUtils.deleteQuietly(tempProject.getLocation().toFile())){
//		        	tempProject.delete(true, getProgressMonitor());
//		        }
			}
			TempFileUtils.cleanUp();
		return exportResources;

	}

}
