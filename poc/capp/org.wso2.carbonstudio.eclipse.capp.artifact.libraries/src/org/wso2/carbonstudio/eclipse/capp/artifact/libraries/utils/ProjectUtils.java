/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbonstudio.eclipse.capp.artifact.libraries.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.wso2.carbonstudio.eclipse.capp.artifact.libraries.Activator;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;
import org.wso2.carbonstudio.eclipse.utils.jdt.JavaUtils;

public class ProjectUtils {
	private static ICarbonStudioLog log = Logger.getLog(Activator.PLUGIN_ID);

	private static boolean isProjectJarIgnoreResource(IProject project,
			IResource resource) {
		if (resource.getName().equals(".classpath")
				|| resource.getName().equals(".project")
				|| resource.getName().equals(".settings")
				|| resource.toString().contains("src")) {
			return true;
		}
		return false;

	}

	public static File generateJar(final IProject project) throws IOException,
			CoreException, InvocationTargetException, InterruptedException {
		return generateJar(project, new IResource[] {}, true);
	}

	public static File generateJar(final IProject project,
			boolean generateManifest) throws IOException, CoreException,
			InvocationTargetException, InterruptedException {
		return generateJar(project, new IResource[] {}, generateManifest);
	}

	public static File generateJar(final IProject project,
			IResource[] otherResources) throws IOException, CoreException,
			InvocationTargetException, InterruptedException {
		return generateJar(project, otherResources, true);
	}

	public static File generateJar(final IProject project,
			IResource[] otherResources, boolean generateManifest)
			throws IOException, CoreException, InvocationTargetException,
			InterruptedException {
		final File buildPath = JavaUtils.buildProject(project);
		final List<IResource> resources = new ArrayList<IResource>();
		try {
			project.accept(new IResourceVisitor() {
				public boolean visit(IResource resource) throws CoreException {

					if (resource instanceof IProject) {
						return true;
					}

					if (isProjectJarIgnoreResource(project, resource) || resource.getLocation().toOSString().equals(buildPath.toString())) {
						return false;
					} else {
						resources.add(resource);
						return false;
					}
				}
			});

			IPath bin = JavaUtils.getJavaOutputDirectory(project);
			IFolder folder = project.getFolder(bin.removeFirstSegments(1));
			folder.accept(new IResourceVisitor() {

				public boolean visit(IResource resource) throws CoreException {
					if(resource.getLocation().toOSString().equals(buildPath.toString())) {
						return true;
					}
					else {
						IFolder folder = project.getFolder(resource.getFullPath().removeFirstSegments(1));
						resources.add(folder);
//						if(!resource.getName().equals("bin")){
//							IFolder folder = project.getFolder(resource.getFullPath().removeFirstSegments(1));
////							resources.add(resource);
//							resources.add(folder);
//						}
						return false;
					}
				}
			});

			// IPath output = getJavaOutputDirectory(project);
			// final IFolder folder =
			// project.getFolder(output.removeFirstSegments(1));
			// folder.accept(new IResourceVisitor(){
			// public boolean visit(IResource resource) throws CoreException {
			// if (resource==folder){
			// return true;
			// }
			// resources.add(resource);
			// return false;
			// }});
		} catch (CoreException e) {
			log.error(e);
			throw e;
		}
		resources.addAll(Arrays.asList(otherResources));
		
//		JarPackageData description = new JarPackageData();
		File tempDir = FileUtils.createTempDirectory();
		tempDir.mkdirs();
//		IPath location = new Path(tempDir.toString()).append(project.getName()
//				+ ".jar");
		File srcDir = new File(tempDir.toString() + File.separator + project.getName());
		File jarFile = new File(srcDir.getPath() + ".jar");
		
//		description.setJarLocation(location);
//		description.setElements(resources.toArray());
//		description.setGenerateManifest(generateManifest);
		IFile manifestFile = project.getFolder("META-INF").getFile(
				"MANIFEST.MF");
		if (!manifestFile.getLocation().toFile().exists()) {
//			FileOutputStream fout = new FileOutputStream(manifestFile.getLocation().toOSString());
			File file = new File(manifestFile.getLocation().toOSString());
			FileUtils.writeContent(file, "Manifest-Version: 1.0");
			resources.add(manifestFile);
//			manifestFile.create(arg0, arg1, arg2)
			// description.setSaveManifest(false);
//			description.setGenerateManifest(false);
//			description.setManifestLocation(manifestFile.getFullPath());
			// description.setReuseManifest(true);
		}
		
		for (IResource resource : resources) {
			File srcFile = new File(resource.getLocation().toOSString());
			File destFile = null;
			if(srcFile.isFile()){
				destFile = new File(srcDir.getPath() + File.separator + resource.getName());
				FileUtils.copy(srcFile, destFile);
			}else{
				if(resource.toString().contains("bin")){
					String[] split = resource.toString().split("bin");
					String classPath = split[split.length - 1];
//					int count = 1;
//					for (String stringPart : split) {
//						classPath += File.separator + split[count++];
//					}
					destFile = new File(srcDir.getPath() + File.separator + classPath);
					FileUtils.copyDirectory(srcFile, destFile);
					
				}else{
					destFile = new File(srcDir.getPath() + File.separator + resource.getName());
					FileUtils.copyDirectory(srcFile, destFile);
				}
			}
		}
		
		// Shell shell = new Shell();
//		IJarExportRunnable runnable = description.createJarExportRunnable(null);
//		try {
//			runnable.run(new NullProgressMonitor());
//		} catch (InvocationTargetException e) {
//			runnable.getStatus();
//			throw e;
//		}
		// new ProgressMonitorDialog(shell).run(true,true, runnable);
		zipFolder(srcDir.getPath(), jarFile.getPath());
		return new File(jarFile.getPath());
	}
	
	public static void zipFolder(String srcFolder, String destZipFile) {
		ZipOutputStream zip = null;
		FileOutputStream fileWriter = null;
		try{
			fileWriter = new FileOutputStream(destZipFile);
			zip = new ZipOutputStream(fileWriter);
		}catch (Exception ex){
			ex.printStackTrace();
			return;
		}

		addFolderContentsToZip( srcFolder, zip);
		try {
			zip.flush();
			zip.close();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	private static void addFolderContentsToZip(String srcFolder, ZipOutputStream zip) {
		File folder = new File(srcFolder);
		String fileListe[] = folder.list();
		try {
			int i = 0;
			while (true) {
				addToZip("", srcFolder+"/"+fileListe[i], zip);
				i++;
			}
		}catch (Exception ex) {
		}
	}
	
	private static void addToZip(String path, String srcFile, ZipOutputStream zip) {


		File folder = new File(srcFile);
		if (folder.isDirectory()) {
			addFolderToZip(path, srcFile, zip);
		}else {
		// Transfer bytes from in to out
			byte[] buf = new byte[1024];
			int len;
			try {
				FileInputStream in = new FileInputStream(srcFile);
				zip.putNextEntry(new ZipEntry(path +"/"+ folder.getName()));
				while ((len = in.read(buf)) > 0) {
					zip.write(buf, 0, len);
				}
			}catch (Exception ex){
				ex.printStackTrace();
			}
		}
	}
	
	static private void addFolderToZip(String path, String srcFolder, ZipOutputStream zip) {
		File folder = new File(srcFolder);
		String fileListe[] = folder.list();
		try {
			int i = 0;
			while (true) {
				String newPath=folder.getName();
				if (!path.equalsIgnoreCase("")){
					newPath=path+"/"+ newPath;
				}
				addToZip(newPath, srcFolder+"/"+fileListe[i], zip);
				i++;
			}
		}catch (Exception ex) {
		}
	}
}
