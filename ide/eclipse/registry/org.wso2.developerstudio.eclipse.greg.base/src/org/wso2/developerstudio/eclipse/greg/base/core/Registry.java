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

package org.wso2.developerstudio.eclipse.greg.base.core;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.apache.axis2.AxisFault;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.wso2.carbon.registry.app.RemoteRegistry;
import org.wso2.carbon.registry.core.Association;
import org.wso2.carbon.registry.core.Collection;
import org.wso2.carbon.registry.core.Comment;
import org.wso2.carbon.registry.core.Resource;
import org.wso2.carbon.registry.core.Tag;
import org.wso2.carbon.registry.core.exceptions.RegistryException;
import org.wso2.carbon.registry.core.utils.RegistryUtils;
import org.wso2.carbon.registry.ws.client.registry.WSRegistryServiceClient;


import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ServiceContext;
import org.apache.axis2.transport.http.HTTPConstants;
import org.wso2.carbon.authenticator.stub.AuthenticationAdminStub;
import org.wso2.carbon.component.mgt.stub.ProvisioningAdminServiceStub;
import org.wso2.carbon.component.mgt.stub.prov.data.Feature;
import org.wso2.developerstudio.eclipse.greg.base.Activator;
import org.wso2.developerstudio.eclipse.greg.core.exception.InvalidRegistryURLException;
import org.wso2.developerstudio.eclipse.greg.core.exception.RegistryContentRetrieveException;
import org.wso2.developerstudio.eclipse.greg.core.exception.UnknownRegistryException;
import org.wso2.developerstudio.eclipse.greg.core.interfaces.IGARImportDependency;
import org.wso2.developerstudio.eclipse.greg.core.utils.GARUtils;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.core.MediaManager;
import org.wso2.developerstudio.eclipse.platform.core.mediatype.PlatformMediaTypeConstants;

public class Registry {
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private static final String REGISTRY_WS_FEATURE_ID= "org.wso2.carbon.registry.ws.feature.group";
	private static final String AUTHENTICATION_ADMIN_SERVICE_URL= "/services/AuthenticationAdmin";
	private static final String PROVISIONING_ADMIN_SERVICE_URL= "/services/ProvisioningAdminService";
	private static final String REMOTE_REGISTRY_URL= "/registry";
	private static final String WS_REGISTRY_URL= "/services/";
	private static final int MIN_WS_API_VERSION= 320;
	
	private String[] rootCollection = null;
	private org.wso2.carbon.registry.core.Registry remregistry;
	private String serverUrl;
	private String userName;
	private String passwd;

	/**
	 * constructor 
	 * @param userName - registry user name
	 * @param pwd - password for the given user
	 * @param serverUrl - remote registry url
	 */
	public Registry(String userName, String pwd, String serverUrl) {
		this.userName = userName;
		this.passwd = pwd;
		this.serverUrl = serverUrl.replaceAll("/$","").concat("/");
	}

	public Registry() {

	}

	/**
	 * get registry instance via WS-Registry API
	 * @return
	 * @throws InvalidRegistryURLException 
	 * @throws UnknownRegistryException 
	 * @throws MalformedURLException
	 * @throws RegistryException
	 */
	private org.wso2.carbon.registry.core.Registry getWSRegistryServiceClient() throws InvalidRegistryURLException, UnknownRegistryException{
			registryInit();
			try {
				
				AuthenticationAdminStub authenticationStub = new AuthenticationAdminStub(serverUrl+ AUTHENTICATION_ADMIN_SERVICE_URL);

				authenticationStub._getServiceClient().getOptions().setManageSession(true);
				boolean loginStatus = authenticationStub.login(userName, passwd, (new URL(serverUrl)).getHost());

				if (!loginStatus) {
					throw new Exception("Invalid Authentication");
				}
				ServiceContext serviceContext = authenticationStub._getServiceClient()
				                                                  .getLastOperationContext()
				                                                  .getServiceContext();
				String sessionCookie = (String) serviceContext.getProperty(HTTPConstants.COOKIE_STRING);
				remregistry =  new WSRegistryServiceClient(serverUrl + WS_REGISTRY_URL, sessionCookie);
			

			}
			catch (RegistryException e) {
				throw new UnknownRegistryException(e);
			} catch (AxisFault e) {
				throw new UnknownRegistryException(e);
            } catch (Exception e) {
            	throw new UnknownRegistryException(e);
            }
		return remregistry;
	}
	
	/**
	 * get registry instance via RemoteRegistry API
	 * @return
	 * @throws InvalidRegistryURLException
	 * @throws UnknownRegistryException
	 */
	private org.wso2.carbon.registry.core.Registry getRemoteRegistry() throws InvalidRegistryURLException, UnknownRegistryException{
			registryInit();
			try {
				remregistry = new RemoteRegistry(new URL(serverUrl + REMOTE_REGISTRY_URL), 
												userName,
												passwd);
			} catch (MalformedURLException e) {
				throw new InvalidRegistryURLException(e);
			} catch (RegistryException e) {
				throw new UnknownRegistryException(e);
			}
		return remregistry;
	}
	
	private boolean isRegistryWSFeatureAvailable() {
		try {
			registryInit();
			AuthenticationAdminStub authenticationStub = new AuthenticationAdminStub(serverUrl + AUTHENTICATION_ADMIN_SERVICE_URL);
			authenticationStub._getServiceClient().getOptions().setManageSession(true);
			boolean loginStatus = authenticationStub.login(userName, passwd,
			                                               (new URL(serverUrl)).getHost());
			if (!loginStatus) {
				throw new Exception("Invalid Authentication");
			}
			ServiceContext serviceContext = authenticationStub._getServiceClient()
			                                                  .getLastOperationContext()
			                                                  .getServiceContext();
			String sessionCookie = (String) serviceContext.getProperty(HTTPConstants.COOKIE_STRING);

			ProvisioningAdminServiceStub provisioningAdminService = new ProvisioningAdminServiceStub(serverUrl + PROVISIONING_ADMIN_SERVICE_URL);
			ServiceClient client = provisioningAdminService._getServiceClient();
			Options option = client.getOptions();
			option.setManageSession(true);
			option.setProperty(org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING,sessionCookie);

			Feature[] allInstalledFeatures = provisioningAdminService.getAllInstalledFeatures();

			for (Feature feature : allInstalledFeatures) {
				if (REGISTRY_WS_FEATURE_ID.equals(feature.getFeatureID())) {
					int featureVersion = Integer.parseInt(feature.getFeatureVersion().replace(".",""));
					if(featureVersion>=MIN_WS_API_VERSION){
						return true;
					}
				}
			}
		} catch (Exception e) {
			return false;
		}
		return false;
	}
	
	private org.wso2.carbon.registry.core.Registry getRegistry() throws InvalidRegistryURLException, UnknownRegistryException{
		if (remregistry!=null){
			try {
				remregistry.get("/");
			} catch (RegistryException e) {
				//Assume session time out as the reason for the exception
				remregistry=null;
			}
		}
		if (remregistry == null) {
			if(isRegistryWSFeatureAvailable()){
				remregistry = getWSRegistryServiceClient();
			} else{
				remregistry = getRemoteRegistry();
			}
		}
		return remregistry;
	}

	/**
	 * set the remoteRegistry instance
	 * @param remoteRegistry
	 */
	public void setRegistry(org.wso2.carbon.registry.core.Registry remoteRegistry) {
		remregistry = remoteRegistry;
	}

	public String getServerUrl() {
		return serverUrl;
	}

	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	/**
	 * setting system properties to initialize the remote registry instance
	 */
	public static void registryInit() {
		System.setProperty("javax.net.ssl.trustStore", getJKSPath());
		System.setProperty("javax.net.ssl.trustStorePassword", "wso2carbon");
		System.setProperty("javax.net.ssl.trustStoreType", "JKS");

	}

	/**
	 * 
	 * @param collectionPath
	 * @return
	 * @throws UnknownRegistryException 
	 * @throws InvalidRegistryURLException 
	 * @throws RegistryException
	 * @throws MalformedURLException
	 */
	public Resource getResourcesPerCollection(String collectionPath) throws InvalidRegistryURLException, UnknownRegistryException{
		remregistry = getRegistry();
		Resource resource;
		try {
			resource = remregistry.get(collectionPath);
			return resource;
		} catch (RegistryException e) {
			throw new UnknownRegistryException(e);
		}
	}

	public String[] getRootCollection() {
		return rootCollection;
	}

	public void setRootCollection(String[] rootCollection) {
		this.rootCollection = rootCollection;
	}

	/**
	 * to define the content type of the resource, we need to get the extension of the resource
	 * @param resource
	 * @return
	 */
	private String getExtension(Resource resource){
		String pathID = resource.getPath();
		String extension=null;
		String[] pathInfo = pathID.split("/");
		String resourceNameWithExt = pathInfo[pathInfo.length - 1];
		if (resourceNameWithExt.contains("\\.")) {
			String[] temp = resourceNameWithExt.split("\\.");
			extension = temp[temp.length - 1];
		}
		
		return extension;
	}
	/**
	 * get the file content from the registry and write it in to a temperory file
	 * @param resourcePath
	 * @param filePath
	 * @return
	 * @throws UnknownRegistryException 
	 * @throws InvalidRegistryURLException 
	 * @throws RegistryContentRetrieveException 
	 * @throws IOException 
	 * @throws RegistryException
	 * @throws IOException
	 */
	public File getContent(String resourcePath, String filePath) throws InvalidRegistryURLException, UnknownRegistryException, RegistryContentRetrieveException, IOException{
		remregistry = getRegistry();
		Resource resource = getResourcesPerCollection(resourcePath);
		

		String resourceName = RegistryUtils.getResourceName(resourcePath);

		String mediaType = resource.getMediaType();
		String extension = null;
		if (mediaType != null) {
			//read the extension from mediaTypes.properties file
			extension = getMediaTypeFileExtension(mediaType);
			/**
			 * if the media type is not specified in the properties file, get the extension by 
			 * file path
			 */
			if (extension == null) {
				extension = getExtension(resource);
			}
		} else {
			extension = getExtension(resource);
		}
		//get the content of the resource
		byte[] content = getResourceContent(resource);
		File tempFile;

		//if the resource content is taking for the first time, save the content to the temp file
		if (filePath == null) {
			File tempDir = File.createTempFile("test", "test");
			tempDir.delete();
			tempDir.mkdirs();

			tempFile = new File(tempDir, resourceName);
			tempFile.deleteOnExit();
			if(!tempFile.exists()){
				tempFile.createNewFile();
			}
		} else
			tempFile = new File(filePath);
		//write the content in to the temp file
		if(tempFile.exists()){
			FileOutputStream fos = new FileOutputStream(tempFile);
			fos.write(content);
		}

		return tempFile;

	}
	

	private byte[] getResourceContent(Resource resource) throws UnknownRegistryException, RegistryContentRetrieveException{
		try {
			Object resContent = resource.getContent();
			byte[] content = getResourceContent(resContent);
			return content;
		} catch (RegistryException e) {
			throw new UnknownRegistryException(e);
		} catch (IOException e) {
			throw new RegistryContentRetrieveException(e);
		}
	}
	/**
	 * 
	 * @param resourceContent
	 * @return
	 * @throws IOException
	 */
	public byte[] getResourceContent(Object resourceContent) throws IOException {
		return (byte[]) resourceContent;
	}

	/**
	 * Get filename extension for mediatype
	 * @param mediaType
	 * @return
	 */
	public String getMediaTypeFileExtension(String mediaType){
		return MediaTypes.getMediaTypes().get(mediaType);
	}
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<String> getAllMediaTypes() {
		return MediaTypes.getAllKeys();
	}

	/**
	 * 
	 * @param resourcePath
	 * @param destination
	 */
	public static void extractFilesToLocation(String resourcePath,File destination) {
		URL resource = Activator.getDefault().getBundle().getResource(resourcePath);
		if (isResourceFolder(resource)) {
			Enumeration confFolder = Activator.getDefault().getBundle().getEntryPaths(resourcePath);
			String[] filePath = resource.getFile().split("/");
			File newDestinationPath = new File(destination,
											   filePath[filePath.length - 1]);
			newDestinationPath.mkdirs();
			while (confFolder != null && confFolder.hasMoreElements()) {
				String newResourcefile = confFolder.nextElement().toString();
				extractFilesToLocation(newResourcefile, newDestinationPath);
			}

		} else {
			copyResourceToDestination(resource, destination);
		}
	}

	/**
	 * copy jks file to resource folder
	 * @param url
	 * @param destination
	 */
	private static void copyResourceToDestination(URL url, File destination) {
		String[] filePath = url.getFile().split("/");
		File destinationFile = new File(destination,
										filePath[filePath.length - 1]);

		InputStream confOpenStream;
		try {
			confOpenStream = url.openStream();
			BufferedInputStream confBufferedInStream = null;
			confBufferedInStream = new BufferedInputStream(confOpenStream);
			FileOutputStream out = new FileOutputStream(destinationFile);
			byte[] buf = new byte[1024];
			int len;
			while ((len = confBufferedInStream.read(buf)) > 0) {
				out.write(buf, 0, len);
			}

			confOpenStream.close();
			out.close();
		} catch (IOException e) {
			log.error(e);
		}
	}

	/**
	 * 
	 * @param url - resource folder url
	 * @return
	 */
	private static boolean isResourceFolder(URL url) {
		boolean result = true;
		try {
			InputStream openStream = url.openStream();
			if (openStream.available() > 0){
				result = false;
			}
			openStream.close();
		} catch (IOException e) {
		}
		return result;
	}

	/**
	 * get the .metadata path of the runtime workspace
	 * @return
	 */
	public static String getMetaDataPath() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IPath location = root.getLocation();
		String metadataPath = location.toOSString() + 
							  File.separator +
							  ".metadata";
		return metadataPath;
	}

	/**
	 * jks file is saved under resources/security folder
	 * @return
	 */
	private static String getJKSPath() {
		extractFilesToLocation("resources/security",
								new File(getMetaDataPath()));
		String path = getMetaDataPath() + 
						File.separator + 
						"security" + 
						File.separator + 
						"wso2carbon.jks";
		return path;
	}

	/**
	 * 
	 * @param path
	 * @param registryPath
	 * @param name
	 * @param resourceUploadListener
	 * @throws UnknownRegistryException 
	 * @throws InvalidRegistryURLException 
	 * @throws MalformedURLException
	 * @throws RegistryException
	 * @throws FileNotFoundException
	 */
	public void addFolderToRegistry(File path, String registryPath,
									String name, 
									IResourceUploadListener resourceUploadListener) throws InvalidRegistryURLException, UnknownRegistryException
									{
		org.wso2.carbon.registry.core.Registry remote_reg = getRegistry();
		String selectedPath = registryPath;
		selectedPath = selectedPath.endsWith("/") ? selectedPath : 
					   selectedPath + "/";
		String description = "Added by WSO2 Developer Studio";
		String mediaType = "";
		String collectionName = selectedPath + (name == null ? path.getName() : name);

		addRegistryCollection(remote_reg, description, mediaType,
				collectionName);
		File[] files = path.listFiles();
		for (File file : files) {
			if (file.exists()) {
				try {
					if (file.isDirectory())
						addFolderToRegistry(file, collectionName, null,
											resourceUploadListener);
					else {
						resourceUploadListener.uploadFileStarting(file);
						addFileToRegistry(file, collectionName, null);
						resourceUploadListener.uploadFileDone(file);
					}
				} catch (Exception e) {
					log.error(e);
				}
			}
		}
	}

	public void addRegistryCollection(org.wso2.carbon.registry.core.Registry remote_reg,
			String description, String mediaType, String collectionPath) throws UnknownRegistryException{
		try {
			Collection collection = remote_reg.newCollection();
			collection.setDescription(description);
			collection.setMediaType(mediaType);
			remote_reg.put(collectionPath, collection);
		} catch (RegistryException e) {
			throw new UnknownRegistryException(e);
		}
	}

	/**
	 * add files to remote registry
	 * @param path
	 * @param registryPath
	 * @param name
	 * @throws FileNotFoundException 
	 * @throws UnknownRegistryException 
	 * @throws InvalidRegistryURLException 
	 */
	public void addFileToRegistry(File path, String registryPath, String name) throws InvalidRegistryURLException, UnknownRegistryException, FileNotFoundException{
		String selectedPath = registryPath;
		selectedPath = selectedPath.endsWith("/") ? selectedPath : 
					   selectedPath + "/";
		String mediaType = MediaManager.getMediaType(path);
		if (mediaType==PlatformMediaTypeConstants.MEDIA_TYPE_WSDL){
			try {
				IGARImportDependency garImportDependency = GARUtils.getGARDependencyModel(path.toURI().toURL());
				path = GARUtils.createGAR(garImportDependency);
				mediaType=PlatformMediaTypeConstants.MEDIA_TYPE_GAR;
			} catch (Exception e) {
				//in an error the wsdl will be uploaded
				e.printStackTrace();
			}
		}
		mediaType=mediaType==null?"":mediaType;
		String description = "Added by WSO2 Developer Studio";
		String resourcePath = selectedPath + (name == null ? path.getName() : name);
		
		addNewResource(path, mediaType, description, resourcePath);
	}

	private void addNewResource(File path, String mediaType,
			String description, String resourcePath) throws InvalidRegistryURLException, UnknownRegistryException, FileNotFoundException{
		try {
			org.wso2.carbon.registry.core.Registry remote_reg = getRegistry();
			Resource resource = remote_reg.newResource();
			resource.setDescription(description);
			resource.setContentStream(new FileInputStream(path));
			resource.setMediaType(mediaType);
			remote_reg.put(resourcePath, resource);
		} catch (RegistryException e) {
			throw new UnknownRegistryException(e);
		}
	}

	public static interface IResourceUploadListener {
		public void uploadFileStarting(File file);

		public void uploadFileDone(File file);
	}

	public RegistryAssociation[] getAllAssociations(String registryResourcePath) throws InvalidRegistryURLException, UnknownRegistryException{
		try {
			List<RegistryAssociation> regAssociations=new ArrayList<RegistryAssociation>();
			Association[] associations = getRegistry().getAllAssociations(registryResourcePath);
			for (Association association : associations) {
				RegistryAssociation registryAssociation = createRegistryAssociation(association);
				regAssociations.add(registryAssociation);
			}
			return regAssociations.toArray(new RegistryAssociation[]{});
		} catch (RegistryException e) {
			throw new UnknownRegistryException("Error in retrieving registyr associations: "+e.getMessage(),e);
		}
	}

	private RegistryAssociation createRegistryAssociation(
			Association association) {
		RegistryAssociation registryAssociation = new RegistryAssociation();
		registryAssociation.setAssociationType(association.getAssociationType());
		registryAssociation.setDestinationPath(association.getDestinationPath());
		registryAssociation.setSourcePath(association.getSourcePath());
		return registryAssociation;
	}

	public boolean resourceExists(String path) throws InvalidRegistryURLException, UnknownRegistryException, RegistryException{
		boolean resourceExists = getRegistry().resourceExists(path);
		return resourceExists;
	}

	public void removeAssociation(String selectedPath, String destinationPath,
			String associationType) throws InvalidRegistryURLException, UnknownRegistryException {
		try {
			getRegistry().removeAssociation(selectedPath, destinationPath, associationType);
		} catch (RegistryException e) {
			throw new UnknownRegistryException("Error in removing association: "+e.getMessage(),e);
		}
		
	}

	public void addAssociation(String selectedPath, String path, String type) throws InvalidRegistryURLException, UnknownRegistryException{
		try {
			getRegistry().addAssociation(selectedPath, path, type);
		} catch (RegistryException e) {
			throw new UnknownRegistryException("Error adding new association: "+e.getMessage(),e);
		}
		
	}

	public Resource get(String selectedPath) throws InvalidRegistryURLException, UnknownRegistryException{
		try {
			return getRegistry().get(selectedPath);
		} catch (RegistryException e) {
			throw new UnknownRegistryException("Error occured while retrieving the registry resource: "+e.getMessage(),e); 
		}
	}

	public Collection newCollection() throws InvalidRegistryURLException, UnknownRegistryException {
		try {
			return getRegistry().newCollection();
		} catch (Exception e) {
			throw new UnknownRegistryException("Error occured while trying to create a new collection: "+e.getMessage(),e);
		}
	}
	
	public Resource newResource() throws InvalidRegistryURLException, UnknownRegistryException {
		try {
			return getRegistry().newResource();
		} catch (Exception e) {
			throw new UnknownRegistryException("Error occured while trying to create a new resource: "+e.getMessage(),e);
		}
	}

	public void rename(String currentPath, String newPath) throws InvalidRegistryURLException, UnknownRegistryException{
		try {
			getRegistry().rename(currentPath, newPath);
		} catch (RegistryException e) {
			throw new UnknownRegistryException("Error occured while trying to rename the registry resource: "+e.getMessage(),e);
		}
		
	}

	public String put(String path, Resource resource) throws InvalidRegistryURLException, UnknownRegistryException {
		try {
			return getRegistry().put(path, resource);
		} catch (RegistryException e) {
			throw new UnknownRegistryException("Error occured while trying to add a registry resource to the registry: "+e.getMessage(),e);
		}
		
	}

	public Comment[] getComments(String registryResourcePath) throws InvalidRegistryURLException, UnknownRegistryException {
		try {
			return getRegistry().getComments(registryResourcePath);
		} catch (RegistryException e) {
			throw new UnknownRegistryException("Error occured while retrieving comments for the resource: "+e.getMessage(),e);
		}
	}

	public void addComment(String selectedPath, Comment comment) throws InvalidRegistryURLException, UnknownRegistryException{
		try {
			getRegistry().addComment(selectedPath, comment);
		} catch (RegistryException e) {
			throw new UnknownRegistryException("Error while saving new comment: "+e.getMessage(),e);
		}
	}

	public void removeComment(String commentPath) throws InvalidRegistryURLException, UnknownRegistryException {
		try {
			getRegistry().removeComment(commentPath);
		} catch (RegistryException e) {
			throw new UnknownRegistryException("Error while removing the comment: "+e.getMessage(),e);
		}
	}

	public void editComment(String commentPath, String comment) throws InvalidRegistryURLException, UnknownRegistryException {
		try {
			getRegistry().editComment(commentPath,comment);
		} catch (RegistryException e) {
			throw new UnknownRegistryException("Error while modifying the comment: "+e.getMessage(),e);
		}		
	}

	public RegistryAssociation[] getAssociations(String resourcePath, String associationType) throws InvalidRegistryURLException, UnknownRegistryException {
		try {
			List<RegistryAssociation> regAssociations=new ArrayList<RegistryAssociation>();
			Association[] associations = getRegistry().getAssociations(resourcePath,associationType);
			for (Association association : associations) {
				regAssociations.add(createRegistryAssociation(association));
			}
			return regAssociations.toArray(new RegistryAssociation[]{});
		} catch (RegistryException e) {
			throw new UnknownRegistryException("Error in Retreiving associations: "+e.getMessage(),e);
		}
	}

	public String[] getVersions(String registryResourcePath) throws InvalidRegistryURLException, UnknownRegistryException {
		try {
			return getRegistry().getVersions(registryResourcePath);
		} catch (RegistryException e) {
			throw new UnknownRegistryException("Error occured while retrieving versions of the registry resource: "+e.getMessage(),e);
		}
	}
	
	public String getLifeCycleName(Resource resource) {
		String lifeCycle = null;
		try {
			lifeCycle = resource.getProperty("registry.LC.name");
		} catch (Exception e) {
			// This is an expected situation where the life cycle is not available
		}
		if (lifeCycle == null || lifeCycle.length() == 0) {
			return "No Life Cycle available for this resource";
		} else {
			return lifeCycle;
		}
	}

	public String getLifeCycleState(Resource resource) {
		String lifeCycleState = null;
		try {
			lifeCycleState = resource.getProperty("registry.lifecycle." + resource.getProperty("registry.LC.name") +".state");
		} catch (Exception e) {
			// This is an expected situation where the life cycle is not available
		}
		if (lifeCycleState == null || lifeCycleState.length() == 0) {
			return "N/A";
		} else {
			return lifeCycleState;
		}
	}
	
	
	public void restoreVersion(String versionPath) throws InvalidRegistryURLException, UnknownRegistryException{
		try {
			getRegistry().restoreVersion(versionPath);
		} catch (RegistryException e) {
			throw new UnknownRegistryException("Error occured while restoring version: "+e.getMessage(),e);
		}
		
	}

	public Tag[] getTags(String registryResourcePath) throws InvalidRegistryURLException, UnknownRegistryException{
		try {
			return getRegistry().getTags(registryResourcePath);
		} catch (RegistryException e) {
			throw new UnknownRegistryException("Error occured while trying to retrive tags: "+e.getMessage(),e);
		}
	}

	public void removeTag(String registryResourcePath, String tagName) throws InvalidRegistryURLException, UnknownRegistryException {
		try {
			getRegistry().removeTag(registryResourcePath, tagName);
		} catch (RegistryException e) {
			throw new UnknownRegistryException("Error occured while trying to remove tag: "+e.getMessage(),e);
		}
	}

	public void applyTag(String registryResourcePath, String tag) throws InvalidRegistryURLException, UnknownRegistryException {
		try {
			getRegistry().applyTag(registryResourcePath, tag);
		} catch (RegistryException e) {
			throw new UnknownRegistryException("Error occured while trying to apply tag: "+e.getMessage(),e);
		}		
	}

	public int getRating(String path, String username) throws InvalidRegistryURLException, UnknownRegistryException{
		try {
			return getRegistry().getRating(path, username);
		} catch (RegistryException e) {
			throw new UnknownRegistryException("Error occured while retrieving ratings from the user: "+e.getMessage(),e);
		}
	}
	
	public void setRating(String path, int rate) throws InvalidRegistryURLException, UnknownRegistryException{
		try {
	        getRegistry().rateResource(path, rate);
        } catch (RegistryException e) {
        	throw new UnknownRegistryException("Error occured while setting ratings to the resource: "+ path,e);
        }
	}

	public float getAverageRating(String path) throws InvalidRegistryURLException, UnknownRegistryException {
		try {
			return getRegistry().getAverageRating(path);
		} catch (RegistryException e) {
			throw new UnknownRegistryException("Error occured while retrieving the average ratings for the registry resource: "+e.getMessage(),e);
		}
	}

	public void delete(String path) throws InvalidRegistryURLException, UnknownRegistryException {
		try {
			getRegistry().delete(path);
		} catch (RegistryException e) {
			throw new UnknownRegistryException("Error occured while attempting to delete registry resource: "+e.getMessage(),e);
		}			
	}

	public void dump(String path, Writer writer) throws InvalidRegistryURLException, UnknownRegistryException {
		try {
			getRegistry().dump(path,writer);
		} catch (RegistryException e) {
			throw new UnknownRegistryException("Error occured while dumping registry resource: "+e.getMessage(),e);
		}			
		
	}

	public void restore(String destinationPath, Reader input) throws InvalidRegistryURLException, UnknownRegistryException {
		try {
			getRegistry().restore(destinationPath,input);
		} catch (RegistryException e) {
			throw new UnknownRegistryException("Error occured while restoring registry resource: "+e.getMessage(),e);
		}				
	}
}
