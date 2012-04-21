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

package org.wso2.developerstudio.eclipse.utils.jdt;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.wso2.developerstudio.eclipse.utils.constants.ProjectConstants;
import java.io.File;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * This util class contains logic to extract java library dependencies from a
 * given Eclipse Java based project.
 */
public class JavaLibraryUtil {

	/**
     * 
     */
//	private static final String POM_FILE_NAME = "pom";
//	private static final String POM_FILE_EXTENSION = "xml";

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

		if (project.isOpen() && project.hasNature(ProjectConstants.JAVA_NATURE_ID)) {

			// TODO: Verify the entries returned by following 2 methods are
			// distinct
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
					// So jar list has been null. Hence assign varjar list to
					// jar.
					jarLibs = varJarLibs;
				}
			} else {
				jarLibs = newLibList;
			}

			for (int i = 0; i < jarLibs.length; i++) {

				File libraryFile = jarLibs[i].getPath().toFile();
				JarFile jarFile = new JarFile(libraryFile);
				String pomFilePath = getPomFilePath(jarFile);
				if (pomFilePath != null) {
					try {
						InputStream is = jarFile.getInputStream(jarFile.getEntry(pomFilePath));
						MavenProject mavenProject =
						                            getMavenProject(new Scanner(is).useDelimiter("\\A")
						                                                           .next());
						JavaLibraryBean bean =
						                       new JavaLibraryBean(jarLibs[i].getPath()
						                                                     .toOSString(),
						                                           mavenProject.getGroupId(),
						                                           mavenProject.getArtifactId(),
						                                           mavenProject.getVersion());
						if (isProperty(bean.toString())) {
							resolveBeanProperties(mavenProject, bean);
						}
						dependencyInfoMap.put(libraryFile.getPath(), bean);
					} catch (Exception e) {
						// TODO: invalid pom or getPomFilePath() is wrong
						// dependencyInfoMap.put(libraryFile.getPath(), null);
					}
				} else {
					// TODO: Not used maven to build or invalid
					// dependencyInfoMap.put(libraryFile.getPath(), null);
				}
			}
		}
		return (Map<String, JavaLibraryBean>) Collections.unmodifiableMap(dependencyInfoMap);
	}
	
	 private static String getPomFilePath(JarFile jarFile){
    	 for (Enumeration<JarEntry> e = jarFile.entries(); e.hasMoreElements();) {
             JarEntry je = (JarEntry) e.nextElement();
             if(je.getName().endsWith("pom.xml")){
            	 return je.getName();
             }
         }
    	return null;
    }

//	private static MavenProject getMavenProject(File file) throws Exception {
//		MavenXpp3Reader mavenXpp3Reader = new MavenXpp3Reader();
//		Model model;
//		model = mavenXpp3Reader.read(new FileInputStream(file));
//		return new MavenProject(model);
//	}
	
	private static MavenProject getMavenProject(String serializedModel) throws Exception {
		StringReader sReader = new StringReader( serializedModel );
		MavenXpp3Reader mavenXpp3Reader = new MavenXpp3Reader();
		Model model;
		model = mavenXpp3Reader.read(sReader);
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
