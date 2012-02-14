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

package org.wso2.carbonstudio.eclipse.capp.artifact.registry.handler.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.CharacterIterator;
import java.text.MessageFormat;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLStreamException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.wso2.carbonstudio.eclipse.capp.artifact.libraries.utils.ProjectUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.handler.utils.HandlerInfo.DataType;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.handler.utils.HandlerInfo.PropertyData;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.CAppArtifactBundleManifest;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactBundleCreator;
import org.wso2.carbonstudio.eclipse.libraries.utils.LibraryUtils;
import org.wso2.carbonstudio.eclipse.utils.archive.ArchiveManipulator;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;
import org.wso2.carbonstudio.eclipse.utils.jdt.ClassUtils;
import org.wso2.carbonstudio.eclipse.utils.jdt.JavaUtils;

public class RegistryHandlerBundleCreator extends ArtifactBundleCreator {
	private String packageName = "";
	private String projectName;
	private IProject selectedProject;
	private File generatedJar;
	private final String BUNDLE_ACTIVATOR_NAME = "org.wso2.custom.internal.registry.handler.Activator";
	private static final String HANDLER_VAR_NAME="handler";
	private static final String FILTER_VAR_NAME="filter";

	public RegistryHandlerBundleCreator(Artifact artifact, File location,
			String parentApplication) {
		super(artifact, location, parentApplication);
		String[] projectNameInfo = location.getPath().split(
				Pattern.quote(File.separator));
		projectName = projectNameInfo[projectNameInfo.length - 3];
	}

	public File getBundle() throws Exception {
		File tmpFolder = FileUtils.createTempDirectory();
		File bundleContentPath = new File(tmpFolder, "bundle-content");
		File gadgetPath = new File(getLocation(), getArtifact().getFile());
		bundleContentPath.mkdirs();
		ArchiveManipulator archiveManipulator = new ArchiveManipulator();
		if (gadgetPath.exists() && gadgetPath.isDirectory()) {
			File gar = new File(bundleContentPath, getArtifact().getName()
					+ "_" + getArtifact().getVersion() + ".gar");
			archiveManipulator
					.archiveDir(gar.toString(), gadgetPath.toString());
			String s = getArtifact().getFile();
			getArtifact().setFile(gar.getName());
			getArtifact()
					.toFile(
							new File(bundleContentPath, getArtifact()
									.getDefaultName()));
			getArtifact().setFile(s);
		} else {
			FileUtils.copyDirectory(getLocation(), bundleContentPath);
		}
		File metainfPath = new File(bundleContentPath, "META-INF");
		File manifestFile = new File(metainfPath, "MANIFEST.MF");
		manifestFile.getParentFile().mkdirs();
		CAppArtifactBundleManifest cAppArtifactBundleManifest = new CAppArtifactBundleManifest(
				getArtifact());
		cAppArtifactBundleManifest.setParentApplication(getParentApplication());
		cAppArtifactBundleManifest.toFile(manifestFile);
		File bundle = new File(tmpFolder, getArtifact().getName() + "-"
				+ getArtifact().getTimestampedVersion() + ".jar");
		archiveManipulator.archiveDir(bundle.toString(), bundleContentPath
				.toString());
		return bundle;
	}

	public Map<Artifact, File> getArtifactContent(File contentLocation)
			throws Exception {
		File tmpFolder = contentLocation == null ? new File(FileUtils
				.createTempDirectory(), getArtifact().getName() + "-"
				+ getArtifact().getTimestampedVersion()) : contentLocation;
		FileUtils.copyDirectory(getLocation(), tmpFolder);
		if (tmpFolder.isDirectory()) {
			File registryInfoFile = new File(getLocation(), getArtifact()
					.getFile());
			if (registryInfoFile.getName().endsWith(".xml")) {
				File bundleFile = createCustomHandlerBundle(tmpFolder,
						registryInfoFile);
				String file = getArtifact().getFile();
				getArtifact().setFile(bundleFile.getName());
				getArtifact().toFile(
						new File(tmpFolder, getArtifact().getDefaultName()));
				getArtifact().setFile(file);
			}
		}
		return createArtifactMap(getArtifact(), tmpFolder);
	}

	private File createCustomHandlerBundle(File tmpFolder, File registryInfoFile)
			throws IOException, FileNotFoundException, XMLStreamException,
			FactoryConfigurationError, CoreException,
			InvocationTargetException, InterruptedException {
		File bundleContentLocation = FileUtils.createTempDirectory();

		HandlerInfo handlerInfo = getHandlerInfo(registryInfoFile);
		File axomDependencyPath = LibraryUtils.getDependencyPath("axiom-1.2.9.wso2v1.jar");
		File geranimoStaxDependencyPath = LibraryUtils.getDependencyPath("geronimo-stax-api_1.0_spec_1.0.1.wso2v1.jar");
		File activatorClass = getActivatorJavaClass(bundleContentLocation,
				handlerInfo);
		File libFolder = createLibFolder(bundleContentLocation, handlerInfo);
		File registryCoreLibraryPath = CAppEnvironment.getRegistryHandler()
				.getRegistryCoreLibraryPath();
		File osgiLibPath = getOSGILibraryPath();

		List<File> dependencyList = getDependencyLibArrayList(new Object[] {
				libFolder, registryCoreLibraryPath, osgiLibPath, axomDependencyPath, geranimoStaxDependencyPath });

		bundleContentLocation = compileFile(activatorClass, dependencyList,
				bundleContentLocation);

		createBundleManifest(bundleContentLocation, libFolder, handlerInfo);

		ArchiveManipulator archiveManipulator = new ArchiveManipulator();
		File bundleFile = new File(tmpFolder, getArtifact().getName() + "_"
				+ getArtifact().getTimestampedVersion() + ".jar");
		archiveManipulator.archiveDir(bundleFile, bundleContentLocation);
		return bundleFile;
	}

	private void createBundleManifest(File bundleContentLocation,
			File bundleLibLocation, HandlerInfo handlerInfo) throws IOException {
		File manifestFile = new File(
				new File(bundleContentLocation, "META-INF"), "MANIFEST.MF");
		manifestFile.getParentFile().mkdirs();
		CAppArtifactBundleManifest bundleManifest = new CAppArtifactBundleManifest(
				getArtifact());
		bundleManifest.setBundleActivatorName(BUNDLE_ACTIVATOR_NAME);
		bundleManifest.getImportPackagesList().add(
				"org.wso2.carbon.registry.core.jdbc.handlers");
		bundleManifest.getImportPackagesList().add(
				"org.wso2.carbon.registry.core.exceptions");
		bundleManifest.getImportPackagesList().add(
				"org.wso2.carbon.registry.core.config");
//		bundleManifest.getImportPackagesList().add("org.apache.axiom.om");
//		bundleManifest.getImportPackagesList().add("org.apache.axiom.om.impl");
//		bundleManifest.getImportPackagesList().add("org.apache.axiom.om.impl.builder");
//		bundleManifest.getImportPackagesList().add("org.apache.axiom.om.impl.llom");
//		bundleManifest.getImportPackagesList().add("org.apache.axiom.om.util");

		bundleManifest.getExportPackagesList().add(
				ClassUtils.getPackageName(handlerInfo.getHandlerClass()));
		bundleManifest.getExportPackagesList().add(
				ClassUtils.getPackageName(handlerInfo.getFilterClass()));
		File[] listFiles = bundleLibLocation.listFiles();
		String root = bundleContentLocation.toString();
		if (!root.endsWith(File.separator))
			root = root + File.separator;
		for (File file : listFiles) {
			bundleManifest.getBundleClassPath().add(
					file.toString().substring(root.length()));
		}
		bundleManifest.getBundleClassPath().add(".");

		bundleManifest.toFile(manifestFile);
	}

	private File createLibFolder(File bundleContentLocation,
			HandlerInfo handlerInfo) throws CoreException, IOException,
			InvocationTargetException, InterruptedException {
		File libFolder = new File(bundleContentLocation, "lib");
		libFolder.mkdirs();
		IProject handlerProject = getHandlerProject(handlerInfo);
		IProject filterProject = getFilterProject(handlerInfo);
		if (handlerProject.getName().equals(filterProject.getName())) {
			File jar = ProjectUtils.generateJar(handlerProject);
			FileUtils.copy(jar, new File(libFolder, jar.getName()));
		} else {
			File jar = ProjectUtils.generateJar(handlerProject);
			FileUtils.copy(jar, new File(libFolder, jar.getName()));
			jar = ProjectUtils.generateJar(filterProject);
			FileUtils.copy(jar, new File(libFolder, jar.getName()));
		}
		return libFolder;
	}

	private List<File> getDependencyLibArrayList(Object[] list) {
		List<File> dependencyList = new ArrayList<File>();
		for (Object o : list) {
			if (o instanceof File) {
				File file = (File) o;
				if (file.isFile()) {
					dependencyList.add(file);
				} else {
					dependencyList.addAll(Arrays.asList(file.listFiles()));
				}
			}
		}
		return dependencyList;
	}

	private File getOSGILibraryPath() {
		org.eclipse.osgi.framework.internal.core.InternalSystemBundle b = (org.eclipse.osgi.framework.internal.core.InternalSystemBundle) Platform
				.getBundle("org.eclipse.osgi");
		org.eclipse.osgi.internal.baseadaptor.SystemBundleData d = (org.eclipse.osgi.internal.baseadaptor.SystemBundleData) b
				.getBundleData();
		File osgiLibPath = d.getBundleFile().getBaseFile();
		return osgiLibPath;
	}

	private File getActivatorJavaClass(File bundleContentLocation,
			HandlerInfo handlerInfo) throws IOException {
		String handlerFileContent = HandlerTemplateUtil.getInstance()
				.getTemplateString("Activator.java");
		List<String> propertySetMethodCallList = getPropertySetMethodCallList(handlerInfo);
		String methodCallListString="\n";
		for (String methodCall : propertySetMethodCallList) {
			methodCallListString+=methodCall+"\n";
		}
		handlerFileContent = MessageFormat
				.format(
						handlerFileContent,
						new Object[] {
								handlerInfo.getHandlerClass(),
								ClassUtils.getClassName(handlerInfo.getHandlerClass()),
								handlerInfo.getFilterClass(),
								ClassUtils.getClassName(handlerInfo.getFilterClass()),
								filterMethodList((String[]) handlerInfo.getSelectedMethods().toArray(new String[] {})),
								methodCallListString,
								"{",
								"}",
								HANDLER_VAR_NAME,
								FILTER_VAR_NAME});
		File activatorClass = new File(bundleContentLocation, "Activator.java");
		FileUtils.writeContent(activatorClass, handlerFileContent);
		return activatorClass;
	}

	private List<String> getPropertySetMethodCallList(HandlerInfo handlerInfo) {
		List<String> propertySetMethodCallList=new ArrayList<String>();
		
		String objectVarName = FILTER_VAR_NAME;
		Map<String, PropertyData> filterProperties = handlerInfo.getFilterProperties();
		addPropertySetMethods(propertySetMethodCallList, objectVarName,
				filterProperties);
		objectVarName = HANDLER_VAR_NAME;
		Map<String, PropertyData> handlerProperties = handlerInfo.getHandlerProperties();
		addPropertySetMethods(propertySetMethodCallList, objectVarName,
				handlerProperties);
		return propertySetMethodCallList;
	}
	private static String backlashDoubler(String myStr){
	    final StringBuilder result = new StringBuilder();
	    final StringCharacterIterator iterator = new StringCharacterIterator(myStr);
	    char character =  iterator.current();
	    while (character != CharacterIterator.DONE ){
	     
	      if (character == '\\') {
	         result.append("\\\\");
	      }
	       else {
	        result.append(character);
	      }

	      
	      character = iterator.next();
	    }
	    return result.toString();
	  }

	private void addPropertySetMethods(List<String> propertySetMethodCallList,
			String objectVarName, Map<String, PropertyData> filterProperties) {
		boolean omVarCreated=false;
		boolean varCreated=false;
		for (String propertyName : filterProperties.keySet()) {
			PropertyData propertyData = filterProperties.get(propertyName);

			String methodCall = objectVarName + "." + JavaUtils.getSetMethod(propertyName);
			String dataVar;
			String data = backlashDoubler(propertyData.data).replaceAll("\"", "\\\\\"").replaceAll("\\n", "\\\\n\"+\n\t\t\"");
			if (propertyData.type==DataType.STRING){
				dataVar = objectVarName+"PropertyData";
				String variableToAssign=(!varCreated? "String ":"")+dataVar;
				propertySetMethodCallList.add(variableToAssign+" = \""+data+"\";");
				varCreated=true;
			}else{
				dataVar = objectVarName+"PropertyDataOMElement";
				String variableToAssign=(!omVarCreated? "OMElement ":"")+dataVar;
				propertySetMethodCallList.add(variableToAssign+" = getElement(\""+data+"\");");
				omVarCreated=true;
			}
			propertySetMethodCallList.add(methodCall + "(" + dataVar + ");");
		}
	}

	private IProject getHandlerProject(HandlerInfo handlerInfo)
			throws CoreException {
		IProject handlerProject = null;
		List<IProject> projects = JavaUtils
				.getProjectsContainingClassName(handlerInfo.getHandlerClass());
		if (projects.size() > 0) {
			handlerProject = projects.get(0);
		}
		return handlerProject;
	}

	private IProject getFilterProject(HandlerInfo handlerInfo)
			throws CoreException {
		IProject filterProject = null;
		List<IProject> projects = JavaUtils
				.getProjectsContainingClassName(handlerInfo.getFilterClass());
		if (projects.size() > 0) {
			filterProject = projects.get(0);
		}
		return filterProject;
	}

	private File compileFile(File file, List<File> libraries,
			File bundleContentLocation) throws CoreException {
		IProject selectedProject = null;
		FileInputStream fs;
		try {
			fs = new FileInputStream(file);
			selectedProject = ResourcesPlugin.getWorkspace().getRoot()
					.getProject(
							projectName + "_"
									+ Calendar.getInstance().getTimeInMillis());

			selectedProject.create(new NullProgressMonitor());
			selectedProject.open(new NullProgressMonitor());
			selectedProject.setHidden(true);
			IFolder sourceFolder = selectedProject.getFolder("src/main/java");

			JavaUtils.addJavaSupportAndSourceFolder(selectedProject,
					sourceFolder);

			String[] classPath = BUNDLE_ACTIVATOR_NAME.split("\\.");
			String classFilePathInProject = "src/main/java";
			for (String path : classPath) {
				if (!path.equalsIgnoreCase("Activator")) {
					classFilePathInProject += "/" + path;
				}
			}
			IFolder folder = selectedProject.getFolder(classFilePathInProject);
			org.wso2.carbonstudio.eclipse.utils.project.ProjectUtils
					.createFolder(folder);
			IFile file2 = folder.getFile(file.getName());

			file2.create(fs, true, new NullProgressMonitor());

			IJavaProject javaProject = JavaCore.create(selectedProject);
			javaProject.open(new NullProgressMonitor());

			for (File library : libraries) {
				JavaUtils.addJarLibraryToProject(javaProject, library);
			}

			selectedProject.refreshLocal(IResource.DEPTH_INFINITE,
					new NullProgressMonitor());
			File outputLocation = JavaUtils.buildProject(selectedProject);

			FileUtils.copyDirectoryContents(outputLocation,
					bundleContentLocation);

			File[] listFiles = bundleContentLocation.listFiles();
			for (File containedFile : listFiles) {
				if ("Activator.java".equals(containedFile.getName())) {
					containedFile.delete();
				}
			}
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		} catch (CoreException e) {
			throw e;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ResourcesPlugin.getWorkspace().getRoot()
						.getProject(projectName).refreshLocal(
								IResource.DEPTH_INFINITE,
								new NullProgressMonitor());
				selectedProject.refreshLocal(IResource.DEPTH_INFINITE,
						new NullProgressMonitor());
				selectedProject.open(IResource.DEPTH_INFINITE,
						new NullProgressMonitor());
				selectedProject.delete(true, new NullProgressMonitor());
				ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE,new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return bundleContentLocation;
	}

	public void run(final String filenameNoExt) throws IOException {
		Process proc = Runtime.getRuntime().exec(
				String.format("java %s", filenameNoExt));
	}

	private void deleteClassFile(File file) {
		String fNameNoExt = file.getName().replaceAll(".java", "");

		File xFile = new File(fNameNoExt + ".class");
		if (xFile.exists()) {
			xFile.delete();
		}
	}

	private File createFile(File tempFolder, String content) {
		File parentDir = new File(tempFolder.getPath() + File.separator + "org"
				+ File.separator + "wso2" + File.separator + "carbonstudio"
				+ File.separator + "registry" + File.separator + "handler");
		parentDir.mkdirs();
		File file = new File(parentDir.getPath() + File.separator
				+ "Activator.java");
		try {
			FileUtils.createFile(file, content);
			File libFolder = new File(tempFolder.getPath() + File.separator
					+ "lib");
			libFolder.mkdir();
			FileUtils.copyDirectoryContents(generatedJar.getParentFile(),
					libFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return file;
	}

	private String getPackageName(String fullyQualifiedClassName) {
		if (fullyQualifiedClassName.contains(".")) {
			packageName = fullyQualifiedClassName.substring(0,
					fullyQualifiedClassName.length()
							- ClassUtils.getClassName(fullyQualifiedClassName)
									.length() - 1);
		}
		return packageName;
	}

	private static String filterMethodList(String[] methodsList) {
		if (methodsList.length>0){
			String filterMethodsListString = " Filter." + methodsList[0];
			for (int i = 1; i < methodsList.length; i++) {
				filterMethodsListString += ", Filter." + methodsList[i];
			}
			return filterMethodsListString;
		}else{
			return "";
		}
	}

	public HandlerInfo getHandlerInfo(File file) throws FileNotFoundException,
			XMLStreamException, FactoryConfigurationError {
		HandlerInfo handlerInfo = new HandlerInfo();
		handlerInfo.deserialize(file);
		return handlerInfo;
	}

	private static String getSetterName(String varName) {

		String setterName;

		if (varName.length() == 1) {
			setterName = "set" + varName.substring(0, 1).toUpperCase();
		} else {
			setterName = "set" + varName.substring(0, 1).toUpperCase()
					+ varName.substring(1, varName.length());
		}

		return setterName;
	}
}
