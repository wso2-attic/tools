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

package org.wso2.carbonstudio.eclipse.capp.project.manager;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.xml.namespace.QName;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.IArtifactSourcePath;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.ICAppArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.configure.ICAppProjectSettings;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.configure.ISettingsAttribute;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.configure.ISettingsData;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.ICAppArtifactManager;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.IServerRole;
import org.wso2.carbonstudio.eclipse.capp.core.data.SettingsAttribute;
import org.wso2.carbonstudio.eclipse.capp.core.data.SettingsData;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.ArtifactDependency;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactTypeConstants;
import org.wso2.carbonstudio.eclipse.capp.core.utils.Constants;
import org.wso2.carbonstudio.eclipse.capp.project.Activator;
import org.wso2.carbonstudio.eclipse.capp.project.nature.DataConstants;
import org.wso2.carbonstudio.eclipse.capp.project.utils.CAppConstants;
import org.wso2.carbonstudio.eclipse.capp.project.utils.CAppUtils;
import org.wso2.carbonstudio.eclipse.capp.project.utils.ExtensionPointHandler;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;
import org.wso2.carbonstudio.eclipse.utils.project.ProjectUtils;

public class CAppArtifactManager implements ICAppArtifactManager{
	/**
     * 
     */
	private static final String JAVA_FILE_EXTENSION = ".java";

	/**
     * 
     */
	private static final String FILE_SEPARATOR_PROPERTY = "file.separator";

	/**
     * 
     */
	private static final String FILE_SEPARATOR = System.getProperty(FILE_SEPARATOR_PROPERTY);

	/**
     * 
     */
	private static final String FROM_CLASS_PROPERTY = "FROM_CLASS";

	/**
     * 
     */
	private static final String TYPE_PROPERTY = "Type";

	/**
     * 
     */
	private static final String PROJECTS_PROPERTY = "Projects";

	/**
     * 
     */
	private static final String CLASS_NAME_PROPERTY = "Class-name";

	/**
     * 
     */
	private static final String GADGET_ARCHIVE_EXTENSION = "dar";

	/**
     * 
     */
	private static final String MODULE_TAG = "<Module>";

	/**
     * 
     */
	private static final String XML_FILE_EXTENSION = "xml";

	/**
     * 
     */
	private static final String MANIFEST_LOCATION = "META-INF/MANIFEST.MF";

	/**
     * 
     */
	private static final String NAME_ENTRY = "name";

	/**
     * 
     */
	private static final String PROJECT_ENRTY_NAME = "project";
	
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private List<ICAppArtifactHandler> artifactHandlers;
	private Map<String,Artifact> artifactList;
	
	private CAppArtifactManager() {
    }
	
	private static CAppArtifactManager INSTANCE;
	public static CAppArtifactManager getInstance(){
		if (INSTANCE==null){
			INSTANCE=new CAppArtifactManager();
			INSTANCE.init();
		}
		return INSTANCE;
	}
	
	public void init(){
		ExtensionPointHandler.setArtifactHandlers(getArtifactHandlers());
		setupArtifactManager();
		CAppEnvironment.setcAppManager(this);
	}

	private void setupWorkspaceListener() {
		
    }
	
	private void setupArtifactManager(){
		for (ICAppArtifactHandler artifactHandler: artifactHandlers) {
			artifactHandler.setArtifactManager(this);
        }
	}
	
	public List<ICAppArtifactHandler> getArtifactHandlers() {
		if (artifactHandlers==null)
			artifactHandlers=new ArrayList<ICAppArtifactHandler>();
	    return artifactHandlers;
    }
	
	public void createDefaultArtifactPaths(IProject project){
		List<ICAppArtifactHandler> artifactHandlers = getArtifactHandlers();
		ICAppProjectSettings projectSetting = getProjectSettings(project);
		for (ICAppArtifactHandler artifactHandler : artifactHandlers) {
	        try {
	            artifactHandler.createArtifactDefaultPath(project, projectSetting);
            } catch (Exception e) {
	            log.error(e);
            }
        }
	}
	
	public void createDefaultArtifactPaths(IProject project, List<ICAppArtifactHandler> artifactHandlers){
		ICAppProjectSettings projectSetting = getProjectSettings(project);
		for (ICAppArtifactHandler artifactHandler : artifactHandlers) {
	        try {
	            artifactHandler.createArtifactDefaultPath(project, projectSetting);
            } catch (Exception e) {
	            log.error(e);
            }
        }
	}
	
	public ICAppProjectSettings getProjectSettings(IProject project){
//		if (projectSettings==null)
//			projectSettings=new HashMap<IProject,CAppProjectSettingsManager>();
//		if (!projectSettings.containsKey(project)){
//			if (project.exists()){
				CAppProjectSettings cAppProjectSettingsManager = new CAppProjectSettings(project);
				return cAppProjectSettingsManager;
//				projectSettings.put(project, cAppProjectSettingsManager);
//			}else{
//				return null;
//			}
//		}
//		return projectSettings.get(project);
	}

	public Map<Artifact,IFolder> getArtifactList(IProject project){
		final Map<Artifact,IFolder> paths=new HashMap<Artifact,IFolder>();
		try {
	        project.accept(new IResourceVisitor(){
	            public boolean visit(IResource resource) throws CoreException {
	            	if (resource instanceof IFolder){
	            		IFolder folder=(IFolder)resource;
	            		Artifact artifact;
                        try {
	                        artifact = getArtifact(folder);
		            		if (artifact!=null){
		            			paths.put(artifact,folder);
		            			return false;
		            		}
	            		} catch (IOException e) {
	                        log.error(e);
                        }

	            	}
	                return !(resource instanceof IFile);
	            }
	        	
	        });
        } catch (CoreException e) {
	        log.error(e);
        }
		return paths;		
	}

	public List<Artifact> getArtifacts(IProject project){
		Map<Artifact, IFolder> artifactList = getArtifactList(project);
		List<Artifact> paths=new ArrayList<Artifact>();
		for(Artifact artifact:artifactList.keySet()){
			paths.add(artifact);
		}
		return paths;
	}

	private List<IArtifactSourcePath> getArtifactPaths(IProject project, ICAppProjectSettings projectSetting,
                                  ICAppArtifactHandler artifactHandler) {
	    try {
	    	IArtifactSourcePath[] artifactPathModels = artifactHandler.getArtifactPathModelsForCAppProjectContent(project, projectSetting);
	    	if (artifactPathModels!=null){
	    		return Arrays.asList(artifactPathModels);
	    	}
	    	
	    } catch (Exception e) {
	        log.error(e);
	    }
	    return null;
    }
	
	
	public boolean isFolderAnArtifactPath(IFolder folder){
		ICAppProjectSettings projectSetting = getProjectSettings(folder.getProject());
		for (ICAppArtifactHandler artifactHandler : artifactHandlers) {
	        try {
	        	if (artifactHandler.isFolderArtifactPath(folder, projectSetting))
	        		return true;
            } catch (Exception e) {
	            log.error(e);
            }
        }
		return false;
	}
	
	public boolean isCAppProject(IProject project){
		try {
	        return project.hasNature(CAppConstants.CAPP_NATURE_ID);
        } catch (CoreException e) {
	        log.error(e);
        }
        return false;
	}

    public List<IArtifactSourcePath> getArtifactPaths(IProject project, String artifactId) {
    	ICAppProjectSettings projectSetting = getProjectSettings(project);
		ICAppArtifactHandler artifactHandler = getArtifactHandler(artifactId);
		return getArtifactPaths(project, projectSetting, artifactHandler);
    }

    public ICAppArtifactHandler getArtifactHandler(String artifactId) {
		for (ICAppArtifactHandler artifactHandler: artifactHandlers) {
			if (artifactHandler.getID().equals(artifactId))
				return artifactHandler;
        }
	    return null;
    }

    public void createArtifactPath(IProject project, String artifactId, IFolder newArtifactFolder) throws Exception {
    	ICAppArtifactHandler artifactHandler = getArtifactHandler(artifactId);
    	artifactHandler.createArtifactPath(newArtifactFolder, getProjectSettings(project));
    }

    public IServerRole[] getServerRoles(IProject project) {
    	ICAppProjectSettings projectSettings = getProjectSettings(project);
    	ISettingsData rawSettings = projectSettings.getSettings(CAppConstants.CAPP_SERVER_ROLES_SECTION);
    	if (rawSettings==null){
    		return new IServerRole[]{}; 
    	}
		List<ISettingsData> children = rawSettings.getAllChildSettings(CAppConstants.CAPP_SERVER_ROLE);
		ArrayList<IServerRole> serverRoles = new ArrayList<IServerRole>();
		for(ISettingsData child:children){
			serverRoles.add(CAppEnvironment.createServerRole(child.getSettingsAttribute("name").getAttributeValue()));
		}
	    return serverRoles.toArray(new IServerRole[]{});
    }

    public void addServerRole(IProject project, IServerRole serverRole) {
    	ICAppProjectSettings projectSettings = getProjectSettings(project);
    	ISettingsData settingsData = projectSettings.getSettings(CAppConstants.CAPP_SERVER_ROLES_SECTION);
		if (settingsData==null){
			settingsData=new SettingsData(CAppConstants.CAPP_SERVER_ROLES_SECTION);
		}
		SettingsData serverRoleSettingsData = new SettingsData(CAppConstants.CAPP_SERVER_ROLE);
		settingsData.addChildSettings(serverRoleSettingsData);
		serverRoleSettingsData.addSettingsAttribute(new SettingsAttribute("name", serverRole.getServerRoleName()));
		projectSettings.setSettings(CAppConstants.CAPP_SERVER_ROLES_SECTION, settingsData);
    }

    public void removeServerRole(IProject project, IServerRole serverRole) {
    	ICAppProjectSettings projectSettings = getProjectSettings(project);
    	ISettingsData serverRoleSettings = projectSettings.getSettings(CAppConstants.CAPP_SERVER_ROLES_SECTION);
    	if (serverRoleSettings==null){
    		return; 
    	}
    	List<ISettingsData> childSettings = serverRoleSettings.getAllChildSettings(CAppConstants.CAPP_SERVER_ROLE, new ISettingsAttribute[]{new SettingsAttribute("name", serverRole.getServerRoleName())});
    	for (ISettingsData data : childSettings) {
    		serverRoleSettings.removeChildSettings(data);
        }
		projectSettings.setSettings(CAppConstants.CAPP_SERVER_ROLES_SECTION, serverRoleSettings);
    }

    public boolean isServerRolePresent(IProject project, IServerRole serverRole) {
	    return isServerRolePresent(project, serverRole.getServerRoleName());
    }

    public boolean isServerRolePresent(IProject project, String serverRoleName) {
    	IServerRole[] serverRoles = getServerRoles(project);
    	for (IServerRole serverRole : serverRoles) {
	        if (serverRole.getServerRoleName().equals(serverRoleName)){
	        	return true;
	        }
	        	
        }
	    return false;
    }

    public boolean isArtifactSignatureAlreadyExists(Artifact artifact, IProject project){
    	String artifactName = artifact.getName();
    	String artifactVersion = artifact.getVersion();
    	return isArtifactSignatureAlreadyExists(project, artifactName, artifactVersion);
    }

	public boolean isArtifactSignatureAlreadyExists(IProject project, String artifactName,
                                                    String artifactVersion) {
	    List<Artifact> artifacts = getArtifacts(project);
    	for (Artifact otherArtifact : artifacts) {
	        if (otherArtifact.getName().equals(artifactName) && otherArtifact.getVersion().equals(artifactVersion)){
	        	return true;
	        }
        }
    	return false;
    }
	
	public boolean isArtifactFolderAlreadyExists(IProject project, String currentArtifactFolder){
		Map<Artifact, IFolder> projectArtifactList = getArtifactList(project);
		for (Artifact artifact : projectArtifactList.keySet()) {
			IFolder artifactFolder = (IFolder) artifact.getSource().getParent();
			if(currentArtifactFolder.equals(artifactFolder.getName())){
				return true;
			}
		
		}
		return false;
	}
	
    public void createArtifact(IFile file, Artifact artifact) throws Exception {
    	createArtifact(file, artifact, null);
    }
    
	public void createArtifact(IFile file, Artifact artifact,
			File otherDataLocation) throws CoreException,
			IOException, Exception {
		createArtifact(file, artifact, otherDataLocation, true);
	}
    
    public void createArtifact(IFile file, Artifact artifact, File otherDataLocation, boolean openResource) throws Exception {
    	IProject project = file.getProject();
    	IFile content = null;
    	if (isArtifactSignatureAlreadyExists(artifact, project)){
    		throw new Exception("An artifact with the same name and version exists in the same project.");
    	}
    	if (!CAppUtils.isCAppProject(project)){
    		throw new Exception("The selected project '"+project.getName()+"' is not a carbon application project.");
    	}
    
    	//If the server role is default lets try to set a default server role for that artifact type
    	if (artifact.getServerRole().equalsIgnoreCase(CAppEnvironment.getDefaultServerRole().getServerRoleName())){
    		artifact.setServerRole(getArtifactHandler(artifact).getDefaultServerRole().getServerRoleName());
    	}
    	
    	if (isCAppProject(file.getProject()) && !isServerRolePresent(file.getProject(),artifact.getServerRole())){
			addServerRole(file.getProject(), CAppEnvironment.createServerRole(artifact.getServerRole()));
		}
    	
    	IFolder folder=project.getFolder(file.getProjectRelativePath().removeLastSegments(1));
    	String artifactFolderName = folder.getName();
    	if(isArtifactFolderAlreadyExists(project, artifactFolderName)){
    		throw new Exception("Given folder name already exists under the selected project.");
    	}
    	folder=project.getFolder(CAppConstants.CAPP_ARTIFACTS_FOLDER_NAME).getFolder(artifactFolderName);
    	IFolder folder1=project.getFolder(CAppConstants.CAPP_ARTIFACTS_FOLDER_NAME);
    	file=folder.getFile(file.getName());
    	if (file.exists()){
    		file.delete(true, null);
    	}else if (!folder.exists()){
    		ProjectUtils.createFolder(folder);
    	}
    	String artifactFilePath=null;
    	boolean artifactLinked=false;
    	if (artifact.getFile().startsWith(Constants.FILE_SYSTEM_PATH_LINK_PROTOCOL)){
    		artifactFilePath = artifact.getFile().substring(Constants.FILE_SYSTEM_PATH_LINK_PROTOCOL.length());
    		artifactLinked=true;
    	}else{
    		artifactFilePath=artifact.getFile();
    	}
    	File artifactContentFile = new File(artifactFilePath);
    	IFile file1 = null;
    	if (artifactContentFile.exists()){
    		IPath folderPath = folder.getLocation();
    		IPath contentPath = folderPath.append(artifactContentFile.getName());
    		if (artifactLinked){
//    			IResource resource;
    			if (artifactContentFile.isFile()){
    				IFile file2 = folder.getFile(artifactContentFile.getName());
    				file2.createLink(new Path(artifactFilePath),IResource.ALLOW_MISSING_LOCAL, null);
//    				resource=file2;
    			}else{
    				IFolder folder2 = folder.getFolder(artifactContentFile.getName());
    				folder2.createLink(new Path(artifactFilePath),IResource.ALLOW_MISSING_LOCAL, null);
//    				resource=folder2;
    			}
    		}else{
        		File contentFile = new File(contentPath.toOSString());
        		
        		if (artifactContentFile.isDirectory()){
        			FileUtils.copyDirectory(artifactContentFile, contentFile);
        		}else{
    //    			contentPath=new File(contentPath);
        			FileUtils.copy(artifactContentFile, contentFile);
        		}
    		}
//        	IPath newFilePath = contentPath.removeFirstSegments(folderPath.segmentCount());

    	
    	if  (otherDataLocation!=null){
    		FileUtils.copyDirectoryContents(otherDataLocation,new File(folder.getLocation().toOSString()));
    	}
    	artifact.getFile();
    	IPath newFilePath = new Path(contentPath.toOSString().substring(folderPath.toOSString().length()+1));
    	artifact.setFile(newFilePath.toPortableString());
		content = folder.getFile(newFilePath);
//    	file.create(new ByteArrayInputStream(artifact.serialize().getBytes()), true, null);
//    	artifact.setSource(file);
//    	artifact.toFile();
//    	getArtifactList().put(file.getFullPath().toOSString(), artifact);
//    	folder.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
//        IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), file);
    	if (artifact.getType().equals(ArtifactTypeConstants.SERVICE_AXIS2_NAME)) {
			Properties properties = new Properties();
			properties.load(new FileInputStream(artifactContentFile));
			Object object = properties.get(CLASS_NAME_PROPERTY);
			String className = null;
			if (object instanceof String) {
				className = object.toString();
			}
			object = properties.get(PROJECTS_PROPERTY);
			String projectName = null;
			if (object instanceof String) {
				projectName = object.toString();
			}

			if ((properties.get(TYPE_PROPERTY) instanceof String) &&
			    (properties.get(TYPE_PROPERTY).toString().equals(FROM_CLASS_PROPERTY))) {
				IProject project1 =
				        ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
				String path = getSourceFolder(project1);
				file1 =
				        project1.getFile(path
				                .substring((FILE_SEPARATOR + projectName + FILE_SEPARATOR)
				                        .length()) +
				                         FILE_SEPARATOR +
				                         getFilePathFromClassName(className) +
				                         JAVA_FILE_EXTENSION);
			} else {
				file1 = null;
				content = null;
			}
		} else if (artifact.getType().equals(ArtifactTypeConstants.WSO2_GADGET)) {
			boolean hasGadgetFiles = false;
			if (content.getFileExtension() == null) {
				// Handling GS
				File[] fileList =
				        FileUtils.getMatchingFiles(content.getLocation().toOSString(), null,
				                                   XML_FILE_EXTENSION);
				for (int i = 0; i < fileList.length; i++) {
					if (FileUtils.getContentAsString(fileList[i]).contains(MODULE_TAG)) {
						content = content.getProject().getFile(content.getProjectRelativePath().toOSString() +
						                                 		FILE_SEPARATOR +
						                                 		fileList[i].getPath().substring(fileList[i].getPath().lastIndexOf(FILE_SEPARATOR) + 1));
						hasGadgetFiles = true;
						break;
					}
				}

				if (!hasGadgetFiles) {
					content = null;
				}

			} else if (content.getFileExtension().equals(GADGET_ARCHIVE_EXTENSION)) {
				content = null;
			}
		} else if (artifact.getType().equals(ArtifactTypeConstants.LIB_CARBON_UI)) {
			// Handling Carbon UI components
			OMElement document = getDocumentElement(content);
			String carbonUIProjectName = null;
			for (Iterator iterator =
			        document.getChildrenWithName(new QName(PROJECT_ENRTY_NAME)); iterator
			        .hasNext();) {
				OMElement element = (OMElement) iterator.next();
				carbonUIProjectName = element.getAttributeValue(new QName(NAME_ENTRY));
			}
			IProject carbonUIProject =
			        ResourcesPlugin.getWorkspace().getRoot().getProject(carbonUIProjectName);
			content = carbonUIProject.getFile(MANIFEST_LOCATION);
		} else if (artifact.getType().equals(ArtifactTypeConstants.LIB_SYNAPSE_MEDIATOR) ||
		           artifact.getType().equals(ArtifactTypeConstants.LIB_DATASERVICE_VALIDATOR) ||
		           artifact.getType().equals(ArtifactTypeConstants.LIB_REGISTRY_FILTER)) {
			// Handling ESB custom mediators
			OMElement document = getDocumentElement(content);
			String serverExtensionProject = null;
			for (Iterator iterator =
			        document.getChildrenWithName(new QName(PROJECT_ENRTY_NAME)); iterator
			        .hasNext();) {
				OMElement element = (OMElement) iterator.next();
				serverExtensionProject = element.getAttributeValue(new QName(NAME_ENTRY));
			}
			if (serverExtensionProject != null) {
				String serverExtensionClass = null;
				if (artifact.getType().equals(ArtifactTypeConstants.LIB_SYNAPSE_MEDIATOR)) {
					serverExtensionClass = getMediatorClassesForProject(serverExtensionProject);
				} else if (artifact.getType()
				        .equals(ArtifactTypeConstants.LIB_DATASERVICE_VALIDATOR)) {
					serverExtensionClass =
					        getDSValidatorClassesForProject(serverExtensionProject);
				} else if (artifact.getType().equals(ArtifactTypeConstants.LIB_REGISTRY_FILTER)) {
					serverExtensionClass =
					        getGRegFillterClassesForProject(serverExtensionProject);
				}
				IProject project1 =
				        ResourcesPlugin.getWorkspace().getRoot()
				                .getProject(serverExtensionProject);
				String path = getSourceFolder(project1);
				file1 =
				        project1
				                .getFile(path
				                        .substring((FILE_SEPARATOR + serverExtensionProject + FILE_SEPARATOR)
				                                .length()) +
				                         FILE_SEPARATOR +
				                         getFilePathFromClassName(serverExtensionClass) +
				                         JAVA_FILE_EXTENSION);
			} else {
				content = null;
			}
			// else if(artifact.getType().equals(""))
		} else if (artifact.getType().equals(ArtifactTypeConstants.LIB_REGISTRY_HANDLERS)) {
			// handling DS Validator
			content = null;
		} else if (artifact.getType().equals(ArtifactTypeConstants.SERVICE_JAXWS)) {
			content = null;
		} else if (artifact.getType().equals(ArtifactTypeConstants.LIB_LIBRARY_BUNDLE)) {
			content = null;
		}else if (artifact.getType().equals(ArtifactTypeConstants.WAR_ARTIFACT_TYPE)) {
			content = null;
		}else{
			
		}
    }
	
	if (otherDataLocation != null) {
		FileUtils.copyDirectoryContents(otherDataLocation, new File(folder.getLocation()
		        .toOSString()));
	}
	artifact.setSource(file);
	artifact.toFile();
	getArtifactList().put(file.getFullPath().toOSString(), artifact);
	folder.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
	Artifact superArtifact = getSuperArtifact(folder);
	ArtifactDependency artifactDependency = new ArtifactDependency(superArtifact, artifact);
	artifactDependency.setInclude(false);
	superArtifact.getDependencies().add(artifactDependency);
	if (openResource){
		if (file1 != null && file1.exists()) {
			IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(),
			               file1);
		} else if (content != null && content.exists()) {
			IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(),
			               content);
		}
	}
  }

	private OMElement getDocumentElement(IFile xmlFile) {
		try {
			XMLStreamReader parser =
			        XMLInputFactory.newInstance().createXMLStreamReader(
			                                                            new FileInputStream(xmlFile
			                                                                    .getLocation()
			                                                                    .toFile()));
			StAXOMBuilder builder = new StAXOMBuilder(parser);
			OMElement documentElement = builder.getDocumentElement();
			return documentElement;
		} catch (FileNotFoundException e) {
			log.error(e);
		} catch (XMLStreamException e) {
			log.error(e);
		} catch (FactoryConfigurationError e) {
			log.error(e);
		}
		return null;
	}
	private String getFilePathFromClassName(String className) {
	
		return className.replace('.', '/');
	}
	private String getSourceFolder(IProject project) {
		try {
			IJavaProject jProject = (IJavaProject) project.getNature(JavaCore.NATURE_ID);
			IClasspathEntry[] cPath = jProject.getRawClasspath();
			for (int i = 0; i < cPath.length; i++) {
				int entryKind = cPath[i].getEntryKind();
				if (entryKind == IClasspathEntry.CPE_SOURCE &&
				    cPath[i].getExclusionPatterns().length <= 0 &&
				    !cPath[i].getPath().toOSString().contains("test")) {
					return cPath[i].getPath().toOSString();
				}
			}
		} catch (CoreException e) {
			log.error(e);
		}
		return null;
	}
    public Artifact getArtifact(IFolder folder) throws CoreException, IOException {
    	IFile file = getArtifactFile(folder);
    	if (file.exists()){
    		try {
        		return getArtifact(file);
    		} catch (Exception e) {
	            log.error(e);
	            return null;
            }
    	}
	    return null;
    }
    
    public IFile getArtifactFile(IFolder folder) throws CoreException, IOException {
    	return folder.getFile("artifact.xml");
    }

	public Map<String,Artifact> getArtifactList() {
		if (artifactList==null){
			artifactList=new HashMap<String, Artifact>();
		}
	    return artifactList;
    }

    public Artifact getArtifact(IFile file) throws CoreException, IOException {
		String key = file.getFullPath().toOSString();
		if (!getArtifactList().containsKey(key)){
    		try {
    			if (!file.isSynchronized(IResource.DEPTH_ONE)){
    				file.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
    			}
        		Artifact artifact = new Artifact(file);
	            artifact.fromFile(file);
	            if (artifact.getName()!=null){
	            	artifact.setSuperArtifact(artifact.getType().equals(DataConstants.SUPER_ARTIFACT_TYPE));
	            	getArtifactList().put(key, artifact);
	            }else{
	            	return null;
	            }
    		} catch (Exception e) {
	            log.error(e);
	            return null;
            }
		}
		Artifact artifact = getArtifactList().get(key);
		try {
	        artifact.refresh();
        } catch (Exception e) {
	        log.error(e);
        }
		return artifact;
    }

    public ICAppArtifactHandler getArtifactHandler(Artifact artifact) {
    	for(ICAppArtifactHandler handler:getArtifactHandlers()){
    		if (handler.getArtifactType().equalsIgnoreCase(artifact.getType())){
    			return handler;
    		}
    	}
	    return null;
    }

    public void createSuperArtifact(IProject project, Artifact artifact) throws CoreException,IOException {
    	IFile file=project.getFile("root-artifact.xml");
    	if (file.exists()){
    		file.delete(true, null);
    	}
    	file.create(new ByteArrayInputStream(artifact.serialize().getBytes()), true, null);
    	project.refreshLocal(IResource.DEPTH_INFINITE, null);
    }

    public Artifact getSuperArtifact(IResource resource) throws CoreException, IOException {
	    IFile file = getSuperArtifactFile(resource);
	    return getArtifact(file);
    }
    
    public IFile getSuperArtifactFile(IResource resource){
    	return resource.getProject().getFile("root-artifact.xml");
    }

    public Artifact getArtifact(String name, String version, IProject project) {
	    return getArtifact(name, version, getArtifacts(project));
    }

    public Artifact getArtifact(String name, String version, List<Artifact> artifacts) {
    	for (Artifact artifact : artifacts) {
	        if (artifact.isEqual(name, version)){
	        	return artifact;
	        }
        }
	    return null;
    }

    public List<Artifact> getArtifacts(IProject project, IServerRole serverRole) {
	    return getArtifacts(project, serverRole.getServerRoleName());
    }

    public List<Artifact> getArtifacts(IProject project, String serverRoleName) {
    	List<Artifact> artifactsForServerRole=new ArrayList<Artifact>();
    	List<Artifact> artifacts = getArtifacts(project);
    	for (Artifact artifact : artifacts) {
	        if (artifact.getServerRole().equals(serverRoleName)){
	        	artifactsForServerRole.add(artifact);
	        }
        }
	    return artifactsForServerRole;
    }

    public List<IServerRole> getDefaultServerRolesForArtifacts() {
    	Map<String,IServerRole> serverRoles = new HashMap<String,IServerRole>();
//    	serverRoles.put(CAppEnvironment.getDefaultServerRole().getServerRoleName(), CAppEnvironment.getDefaultServerRole());
    	List<ICAppArtifactHandler> artifactHandlers = getArtifactHandlers();
    	for (ICAppArtifactHandler handler : artifactHandlers) {
    		List<IServerRole> supportingServerRoles = handler.getSupportingServerRoles();
    		for (IServerRole role : supportingServerRoles) {
    			serverRoles.put(role.getServerRoleName(),role);    
            }
        }
	    return Arrays.asList((IServerRole[])serverRoles.values().toArray(new IServerRole[]{}));
    }

    public String getServerRoleDescription(String serverRoleName) {
    	List<IServerRole> defaultServerRolesForArtifacts = getDefaultServerRolesForArtifacts();
    	for (IServerRole serverRole : defaultServerRolesForArtifacts) {
	        if (serverRole.getServerRoleName().equalsIgnoreCase(serverRoleName)){
	        	return serverRole.getServerRoleDescription();
	        }
        }
	    return serverRoleName;
    }

    public String getServerRoleDescription(IServerRole serverRole) {
	    return getServerRoleDescription(serverRole.getServerRoleName());
    }
    
	private String getMediatorClassesForProject(String project) {
		IProject prj = ResourcesPlugin.getWorkspace().getRoot().getProject(project);
		// filterClassesList = new ArrayList<String>();
		IJavaProject jp = JavaCore.create(prj);
		try {
			IPackageFragment[] packageFragments = jp.getPackageFragments();
			for (IPackageFragment fragment : packageFragments) {
				IClassFile[] classFiles = fragment.getClassFiles();
				IJavaElement[] children = fragment.getChildren();
				for (IJavaElement element : children) {
					String elementName = element.getElementName();
					ICompilationUnit[] compilationUnits = fragment.getCompilationUnits();

					for (ICompilationUnit unit : compilationUnits) {
						String a = unit.getElementName();
						IType[] types = unit.getTypes();
						for (IType type : types) {
							int elementType = type.getElementType();
							if (type.getSuperclassName() != null) {
								String[][] resolveType = type.resolveType(type.getSuperclassName());
								if ((resolveType[0][0]).toString()
								        .equals("org.apache.synapse.mediators") &&
								    (resolveType[0][1]).toString().equals("AbstractMediator")) {
									// String fullyQualifiedName =
									return type.getFullyQualifiedName();
								}
							}

						}
					}
				}
			}
		} catch (JavaModelException e) {
			log.error(e);
		}

		return null;
	}

	private String getDSValidatorClassesForProject(String project) {
		IProject prj = ResourcesPlugin.getWorkspace().getRoot().getProject(project);
		IJavaProject jp = JavaCore.create(prj);
		try {
			IPackageFragment[] packageFragments = jp.getPackageFragments();
			for (IPackageFragment fragment : packageFragments) {
				IJavaElement[] children = fragment.getChildren();
				for (IJavaElement element : children) {
					ICompilationUnit[] compilationUnits = fragment.getCompilationUnits();
					for (ICompilationUnit unit : compilationUnits) {
						String a = unit.getElementName();
						IType[] types = unit.getTypes();
						for (IType type : types) {
							String[] superInterfaceNames = type.getSuperInterfaceNames();
							if (superInterfaceNames != null) {
								for (String interfaceName : superInterfaceNames) {
									if (interfaceName.equals("Validator")) {
										return type.getFullyQualifiedName();
									}
								}
							}
						}
					}
				}
			}
		} catch (JavaModelException e) {
			log.error(e);
		}

		return null;
	}

	private String getGRegFillterClassesForProject(String project) {
		IProject prj = ResourcesPlugin.getWorkspace().getRoot().getProject(project);
		IJavaProject jp = JavaCore.create(prj);
		try {
			IPackageFragment[] packageFragments = jp.getPackageFragments();
			for (IPackageFragment fragment : packageFragments) {
				IJavaElement[] children = fragment.getChildren();
				for (IJavaElement element : children) {
					ICompilationUnit[] compilationUnits = fragment.getCompilationUnits();
					for (ICompilationUnit unit : compilationUnits) {
						String a = unit.getElementName();
						IType[] types = unit.getTypes();
						for (IType type : types) {
							if (type.getSuperclassName() != null) {
								String[][] resolveType = type.resolveType(type.getSuperclassName());
								if (resolveType != null &&
								    (resolveType[0][0])
								            .toString()
								            .equals(
								                    "org.wso2.carbon.registry.core.jdbc.handlers.filters") &&
								    (resolveType[0][1]).toString().equals("Filter")) {
									return type.getFullyQualifiedName();
								}
							}
						}
					}
				}
			}
		} catch (JavaModelException e) {
			log.error(e);
		}

		return null;
	}

	public IFolder getCAppArtifactsLocation(IProject project) {
		return project.getFolder(CAppConstants.CAPP_ARTIFACTS_FOLDER_NAME);
	}

}
