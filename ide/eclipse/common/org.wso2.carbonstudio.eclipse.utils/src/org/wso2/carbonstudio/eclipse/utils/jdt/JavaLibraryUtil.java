/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbonstudio.eclipse.utils.jdt;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.wso2.carbonstudio.eclipse.utils.archive.ArchiveManipulator;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * This util class contains logic to extract java library dependencies from a
 * given Eclipse Java based project.
 */
public class JavaLibraryUtil {

	/**
     * 
     */
	private static final String POM_FILE_NAME = "pom";
	private static final String POM_FILE_EXTENSION = "xml";

	/**
	 * This method is extracting the jar libraries from the Eclipse java project
	 * classpath and retrieve maven based information from them.
	 * 
	 * @param project
	 * @return Map of classpath entreis and their maven information. If the
	 *         value is null for an entry, then that java library does not
	 *         contain any maven project information.
	 * @throws Exception
	 */
	public static Map<String, JavaLibraryBean> getDependencyInfoMap(IProject project)
	                                                                                 throws Exception {
		HashMap<String, JavaLibraryBean> dependencyInfoMap = new HashMap<String, JavaLibraryBean>();

		// TODO: Verify the entries returned by following 2 methods are distinct
		// or not.
		IPackageFragmentRoot[] jarLibs = JavaUtils.getReferencedLibrariesForProject(project);
		IPackageFragmentRoot[] varJarLibs =
		                                    JavaUtils.getReferencedVariableLibrariesForProject(project);
		IPackageFragmentRoot[] newLibList = null;
		if (jarLibs != null && varJarLibs != null) {
			newLibList = new IPackageFragmentRoot[jarLibs.length + varJarLibs.length];
			for (int i = 0; i < jarLibs.length; i++) {
				newLibList[i] = jarLibs[i];
			}

			for (int i = 0; i < varJarLibs.length; i++) {
				newLibList[jarLibs.length + i] = varJarLibs[i];
			}
		}

		if (newLibList == null) {
			if (varJarLibs != null) {
				// So jar list has been null. Hence assign varjar list to jar.
				jarLibs = varJarLibs;
			}
		} else {
			jarLibs = newLibList;
		}

		for (int i = 0; i < jarLibs.length; i++) {
			File tempLocation = FileUtils.createTempDirectory();
			File tempFile = new File(tempLocation,jarLibs[i].getElementName());
			
			String libraryFile=null;
			if(jarLibs[i].getPath().toFile().exists()){
				libraryFile=jarLibs[i].getPath().toOSString();
			}else{
				libraryFile=jarLibs[i].getResource().getLocation().toOSString();	
			}
			
			FileUtils.copy(new File(libraryFile), tempFile);
//			File jarFile =
//			               new File(tempLocation + File.pathSeparator +
//			                        jarLibs[i].getUnderlyingResource().getName());
			ArchiveManipulator archiver = new ArchiveManipulator();
			File extractLocation = 
			                       new File(tempLocation, "temp_" +
			                                              tempFile.getName());
			archiver.extract(tempFile, extractLocation);
			// If this is maven generated, we cna get the info from pom file
			boolean isMavenBuild = true;
//			extractLocation.listFiles(new f)
	
			File[] pomFiles =
			                  FileUtils.getAllMatchingFiles(extractLocation.getPath()+File.separator+"META-INF", POM_FILE_NAME,
			                                             POM_FILE_EXTENSION, new ArrayList<File>());
			if (pomFiles == null) {
				// Not used maven to build
				isMavenBuild = false;
			} else if (pomFiles.length > 1) {
				// This is impossible. Hence corrupted. Do something.
			} else if (pomFiles.length == 1) {
				File pomFile = pomFiles[0];
				MavenProject mavenProject = getMavenProject(pomFile);
//				JavaLibraryBean bean = new JavaLibraryBean("/media/dev/wso2products/3.2.0/wso2greg-4.0.0-SNAPSHOT/lib", "org.wso2.sample", "test.sample", "1.0.0");
				JavaLibraryBean bean =
				                       new JavaLibraryBean(jarLibs[i].getPath().toOSString(),
				                                           mavenProject.getGroupId(),
				                                           mavenProject.getArtifactId(),
				                                           mavenProject.getVersion());
				if (isProperty(bean.toString())) {
					resolveBeanProperties(mavenProject, bean);
				}
				dependencyInfoMap.put(tempFile.getPath(), bean);
			}
			if (!isMavenBuild) {
				// Set null as the bean. Then the client will be prompt to enter
				// the maven details for the lib.
				dependencyInfoMap.put(tempFile.getPath(), null);
			}

			FileUtils.deleteDir(tempLocation);
		}
		return (Map<String, JavaLibraryBean>) Collections.unmodifiableMap(dependencyInfoMap);
	}

	private static MavenProject getMavenProject(File file) throws Exception {
		MavenXpp3Reader mavenXpp3Reader = new MavenXpp3Reader();
		Model model;
		model = mavenXpp3Reader.read(new FileInputStream(file));
		return new MavenProject(model);
	}
	
	private static String resolveMavenProperty(MavenProject project,String property){
		if (project.getProperties().containsKey(property)) {
			return project.getProperties().getProperty(property, property);
		}
		return "${"+property+"}";
	}
	
	private static boolean isProperty(String value){
		if(value.contains("$")){
			return true;
		}
		return false;
	}
	
	private static void resolveBeanProperties(MavenProject project, JavaLibraryBean bean){
		if(isProperty(bean.getGroupId())){
			String value=bean.getGroupId();
			String key=value.substring(value.indexOf("{")+1,value.lastIndexOf("}"));
			String newValue=value.replace("${"+key+"}", resolveMavenProperty(project, key));
			bean.setGroupId(newValue);
		}
		
		if(isProperty(bean.getArtifactId())){
			String value=bean.getArtifactId();
			String key=value.substring(value.indexOf("{")+1,value.lastIndexOf("}"));
			String newValue=value.replace("${"+key+"}", resolveMavenProperty(project, key));
			bean.setArtifactId(newValue);
		}
		
		if(isProperty(bean.getVersion())){
			String value=bean.getVersion();
			String key=value.substring(value.indexOf("{")+1,value.lastIndexOf("}"));
			String newValue=value.replace("${"+key+"}", resolveMavenProperty(project, key));
			bean.setVersion(newValue);
		}
	}

}
