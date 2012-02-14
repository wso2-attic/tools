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

package org.wso2.maven.registry.handler.model;

import java.util.ArrayList;
import java.util.List;

public class BundleManifest extends SimpleJarManifest {
	private String bundleSymbolicName;
	private String bundleName;
	private String bundleVersion;
	private String bundleDescription;
	private String bundleActivatorName;
	private List<String> exportPackagesList;
	private List<String> importPackagesList;
	private List<String> bundleClassPath;
	private boolean dynamicImports=true;
	
	/**
     * @return the bundleSymbolicName
     */
    public String getBundleSymbolicName() {
    	return bundleSymbolicName;
    }
	/**
     * @param bundleSymbolicName the bundleSymbolicName to set
     */
    public void setBundleSymbolicName(String bundleSymbolicName) {
    	this.bundleSymbolicName = bundleSymbolicName;
    }
	/**
     * @return the bundleName
     */
    public String getBundleName() {
    	return bundleName;
    }
	/**
     * @param bundleName the bundleName to set
     */
    public void setBundleName(String bundleName) {
    	this.bundleName = bundleName;
    }
	/**
     * @return the bundleVersion
     */
    public String getBundleVersion() {
    	return bundleVersion;
    }
	/**
     * @param bundleVersion the bundleVersion to set
     */
    public void setBundleVersion(String bundleVersion) {
    	this.bundleVersion = bundleVersion;
    }
	/**
     * @return the bundleDescription
     */
    public String getBundleDescription() {
    	return bundleDescription;
    }
	/**
     * @param bundleDescription the bundleDescription to set
     */
    public void setBundleDescription(String bundleDescription) {
    	this.bundleDescription = bundleDescription;
    }

	public List<String> getExportPackagesList() {
		if (exportPackagesList==null){
			exportPackagesList=new ArrayList<String>();
		}
		return exportPackagesList;
	}
	
	private String getExportPackageListString(){
		String packages=null;
		for (String packageName : getExportPackagesList()) {
			if (packages==null){
				packages=packageName;
			}else{
				packages+= ","+packageName;
			}
		}
		return packages;
	}
	
	private String getImportPackageListString(){
		String imports=null;
		for (String packageName : getImportPackagesList()) {
			if (imports==null){
				imports=packageName;
			}else{
				imports+= ","+packageName;
			}
		}
		return imports;
	}
	
	private String getBundleClassPathListString(){
		String classPaths=null;
		for (String packageName : getBundleClassPath()) {
			if (classPaths==null){
				classPaths=packageName;
			}else{
				classPaths+= ","+packageName;
			}
		}
		return classPaths;
	}
	
	public String toString() {
		String manifest = null;
		List<String> headerLines = getHeaderLines();
		for (String line : headerLines) {
			manifest=appendLine(manifest, line);    
        }
		manifest=appendLine(manifest, "\n\n");
		return manifest;
	}

	private List<String> getHeaderLines() {
		List<String> list=new ArrayList<String>();
		List<ManifestHeader> manifestHeaders = getManifestHeaders();
		for (ManifestHeader manifestHeader : manifestHeaders) {
			list.add(getManifestHeaderLine(manifestHeader));
        }
		return list;
	}

	public List<ManifestHeader> getManifestHeaders(){
		List<ManifestHeader> list=new ArrayList<ManifestHeader>();
		list.add(new ManifestHeader("Manifest-Version",getManifestVersion()));
		list.add(new ManifestHeader("Bundle-SymbolicName",getBundleSymbolicName()));
		list.add(new ManifestHeader("Bundle-Name",getBundleName()));
		list.add(new ManifestHeader("Bundle-Version",getEffectiveBundleVersion()));
		list.add(new ManifestHeader("Bundle-Description",getBundleDescription()));
		if (getBundleActivatorName()!=null){
			list.add(new ManifestHeader("Bundle-Activator",getBundleActivatorName()));
		}
		String exportPackageListString = getExportPackageListString();
		if (exportPackageListString!=null){
			list.add(new ManifestHeader("Export-Package",exportPackageListString));
		}
		String importPackageListString = getImportPackageListString();
		if (importPackageListString!=null){
			list.add(new ManifestHeader("Import-Package",importPackageListString));
		}
		String bundleClassPathListString = getBundleClassPathListString();
		if (bundleClassPathListString!=null){
			list.add(new ManifestHeader("Bundle-ClassPath",bundleClassPathListString));
		}
		if (isDynamicImports()){
			list.add(new ManifestHeader("DynamicImport-Package","*"));
		}
		list.addAll(getAdditionalHeaders());
		return list;
	}
	protected List<ManifestHeader> getAdditionalHeaders(){return new ArrayList<ManifestHeader>();}
	
	public String getTimestampedBundleVersion() {
	    return null;
    }
	
	public String getEffectiveBundleVersion(){
		if (getTimestampedBundleVersion()==null){
			return getBundleVersion();
		}else{
			return getTimestampedBundleVersion();
		}
	}
	
    protected String getDefaultName() {
	    return "MANIFEST.MF";
    }

	public List<String> getBundleClassPath() {
		if (bundleClassPath==null){
			bundleClassPath=new ArrayList<String>();
		}
	    return bundleClassPath;
    }

	public List<String> getImportPackagesList() {
		if (importPackagesList==null){
			importPackagesList=new ArrayList<String>();
		}
	    return importPackagesList;
    }

	public void setBundleActivatorName(String bundleActivatorName) {
	    this.bundleActivatorName = bundleActivatorName;
    }

	public String getBundleActivatorName() {
	    return bundleActivatorName;
    }
	public void setDynamicImports(boolean dynamicImports) {
		this.dynamicImports = dynamicImports;
	}
	public boolean isDynamicImports() {
		return dynamicImports;
	}
	
	public static class ManifestHeader{
		private String headerName;
		private String headerValue;
		public ManifestHeader(String headerName,String headerValue) {
			setHeaderName(headerName);
			setHeaderValue(headerValue);
        }
		public void setHeaderName(String headerName) {
	        this.headerName = headerName;
        }
		public String getHeaderName() {
	        return headerName;
        }
		public void setHeaderValue(String headerValue) {
	        this.headerValue = headerValue;
        }
		public String getHeaderValue() {
	        return headerValue;
        }
	}
}
