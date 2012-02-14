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

package org.wso2.carbonstudio.eclipse.artifacts.axis2.model;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.SourceType;

public class Axis2SourceDescriptor {
	
	public final static String SERVICE_NAME="ServiceName";
	public final static String PROJECT_NAME="ProjectName";
	public final static String CLASS_NAME="ClassName";
	public final static String CLASS_LOCATION="ClassLocation";
	public final static String REFERENCE_PROJECTS="ReferenceProjects";
	public final static String REFERENCE_LIBRARIES="ReferenceLibraries";
	public final static String SERVICE_PROJECT_REFERENCES="UseProjectReferences";
	public final static String SERVICE_TYPE="TYPE";
	public final static String SERVER_ROLE="ServerRole";
	public final static String ARTIFACT_VERSION="Version";

	
	private String className;
	private String classLocation;
	private String projectName;
	private IProject project;
	private SourceType sourceType;
	private String serviceName;
	private String referencedProjects;
	private String referencedLibraries;
	private boolean projectReferences = true;
	private String serviceType;
	private String serverRole="";
	private String version="1.0.0";
	
	/**
     * @return the className
     */
    public String getClassName() {
    	return className;
    }
	/**
     * @param className the className to set
     */
    public void setClassName(String className) {
    	this.className = className;
    }
	/**
     * @return the classLocation
     */
    public String getClassLocation() {
    	if (classLocation==null && getSourceType()!=null){
    		classLocation=getSourceType().getPath().removeFirstSegments(1).toString();
    	}
    	return classLocation;
    }
	/**
     * @param classLocation the classLocation to set
     */
    public void setClassLocation(String classLocation) {
    	this.classLocation = classLocation;
    }
	/**
     * @return the projectName
     */
    public String getProjectName() {
    	return projectName;
    }
	/**
     * @param projectName the projectName to set
     */
    public void setProjectName(String projectName) {
    	this.projectName = projectName;
   		project=null;
    }
	/**
     * @return the sourceType
     */
    public SourceType getSourceType() {
    	return sourceType;
    }
	/**
     * @param sourceType the sourceType to set
     */
    public void setSourceType(SourceType sourceType) {
    	this.sourceType = sourceType;
    }
	/**
     * @return the project
     */
    public IProject getProject() {
    	if (project==null && getProjectName()!=null)
    		project=ResourcesPlugin.getWorkspace().getRoot().getProject(getProjectName());
    	return project;
    }
	public void setServiceName(String serviceName) {
	    this.serviceName = serviceName;
    }
	public String getServiceName() {
	    return serviceName;
    }
	public void setReferencedProjects(String referencedProjects) {
	    this.referencedProjects = referencedProjects;
    }
	public String getReferencedProjects() {
	    return referencedProjects;
    }
	public void setReferencedLibraries(String referencedLibraries) {
	    this.referencedLibraries = referencedLibraries;
    }
	public String getReferencedLibraries() {
	    return referencedLibraries;
    }
	public void setProjectReferences(boolean projectReferences) {
	    this.projectReferences = projectReferences;
    }
	public boolean isProjectReferences() {
	    return projectReferences;
    }
	public void setServiceType(String serviceType) {
	    this.serviceType = serviceType;
    }
	public String getServiceType() {
	    return serviceType;
    }
	
	public Axis2SourceDescriptor clone() {
		Axis2SourceDescriptor o = new Axis2SourceDescriptor();
		o.setClassLocation(getClassLocation());
		o.setClassName(getClassName());
		o.setProjectName(getProjectName());
		o.setProjectReferences(isProjectReferences());
		o.setReferencedLibraries(getReferencedLibraries());
		o.setReferencedProjects(getReferencedProjects());
		o.setServiceName(getServiceName());
		o.setServiceType(getServiceType());
		o.setSourceType(getSourceType());
		o.setServerRole(getServerRole());
		o.setVersion(getVersion());
	    return o;
	}
	public void setServerRole(String serverRole) {
	    this.serverRole = serverRole;
    }
	public String getServerRole() {
		if (serverRole==null)
			serverRole="";
	    return serverRole;
    }
	
	public IPackageFragmentRoot[] getLibraryReferencesForService()  throws CoreException {
		IProject project=getProject();
		IPackageFragmentRoot[] referencedLibrariesForProject = getReferencedLibrariesForProject(project);
		if (isProjectReferences()){
			return referencedLibrariesForProject;
		}else{
            String[] projectNameList = getReferencedLibraries().split(",");
            ArrayList<IPackageFragmentRoot> customReferences = new ArrayList<IPackageFragmentRoot>();
            for (IPackageFragmentRoot fragmentRoot : referencedLibrariesForProject) {
            	if (Arrays.binarySearch(projectNameList,fragmentRoot.getPath().toOSString())>=0){
            		customReferences.add(fragmentRoot);
            	}
            }
            return customReferences.toArray(new IPackageFragmentRoot[]{});
		}
	}
    
	public IProject[] getProjectReferencesForService(IWorkspace o)  throws CoreException {
		IProject project=getProject();
        IProject[] projects;
        if (isProjectReferences()){
        	projects = project.getDescription().getReferencedProjects();
        }else{
            String[] projectNameList = getReferencedProjects().split(",");
            ArrayList<IProject> customReferences = new ArrayList<IProject>();
            for (String projectName : projectNameList) {
            	customReferences.add(o.getRoot().getProject(projectName));
            }
            projects=customReferences.toArray(new IProject[]{});
        }
        return projects;
	}
	
    public IPackageFragmentRoot[] getReferencedLibrariesForProject(IProject project) throws JavaModelException{
		IJavaProject p = JavaCore.create(project);
		IPackageFragmentRoot[] packageFragmentRoots = p.getPackageFragmentRoots();
		ArrayList<IPackageFragmentRoot> jarClassPaths = new ArrayList<IPackageFragmentRoot>();
		for (IPackageFragmentRoot packageFragmentRoot : packageFragmentRoots) {
	        if (packageFragmentRoot.getRawClasspathEntry().getEntryKind()==IClasspathEntry.CPE_LIBRARY){
	        	jarClassPaths.add(packageFragmentRoot);
	        }
        }
		return jarClassPaths.toArray(new IPackageFragmentRoot[]{});
    }
    
	public void setVersion(String version) {
	    this.version = version;
    }
	public String getVersion() {
		if (version==null)
			version="1.0.0";
	    return version;
    }
}
