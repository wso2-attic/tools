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

package org.wso2.carbonstudio.eclipse.artifact.registry.utils;

import java.io.File;
import java.util.List;

import org.apache.axiom.om.OMDocument;
import org.apache.axiom.om.OMElement;
import org.wso2.carbonstudio.eclipse.platform.core.manifest.AbstractXMLDoc;
import org.wso2.carbonstudio.eclipse.artifact.registry.Activator;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

public class RegistryResourceInfo extends AbstractXMLDoc {
	private String path;
	private int type;
	private File sourceFile;
	private File base;
	private String relativePath;
	private static String RESOURCE_TAG_NAME = "item";
	private static String COLLECTION_TAG_NAME = "collection";
	private static ICarbonStudioLog log = Logger.getLog(Activator.PLUGIN_ID);

	public String getRelativePath() {
		return relativePath;
	}

	public void setRelativePath(String relativePath) {
		this.relativePath = relativePath;
	}

	public RegistryResourceInfo() {

	}

	public RegistryResourceInfo(String path, File inputFile, int type,
			File base, String relativePt) {
		setPath(path);
		setType(type);
		setBase(base);
		setRelativePath(relativePt);
		sourceFile = inputFile;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

	protected void deserialize(OMElement documentElement) {

		if (documentElement.getLocalName().equals(RESOURCE_TAG_NAME)) {
			setType(RegistryArtifactConstants.REGISTRY_RESOURCE);
			List<OMElement> childElements = getChildElements(documentElement,
					"file");
			if (childElements.size() > 0) {
				setRelativePath(childElements.get(0).getText());
			}
		} else if (documentElement.getLocalName().equals(COLLECTION_TAG_NAME)) {
			setType(RegistryArtifactConstants.REGISTRY_COLLECTION);
			List<OMElement> childElements = getChildElements(documentElement,
					"directory");
			if (childElements.size() > 0) {
				setRelativePath(childElements.get(0).getText());
			}
		}
		List<OMElement> childElements = getChildElements(documentElement,
				"path");
		if (childElements.size() > 0) {
			setPath(childElements.get(0).getText());
		}
	}

	protected String serialize() {
		OMDocument createOMDocument = factory.createOMDocument();
		OMElement documentElement = getDocumentElement();
		createOMDocument.addChild(documentElement);
		String pretifiedString;
		try {
			pretifiedString = getPretifiedString(documentElement);
		} catch (Exception e) {
			log.error(e);
			return null;
		}
		return pretifiedString;
	}

	private OMElement getDocumentElement() {
		OMElement documentElement;
		// String content = "";
		if (getType() == RegistryArtifactConstants.REGISTRY_RESOURCE) {
			documentElement = getElement("item", "");
			OMElement fileElement = getElement("file",
					getResourceBaseRelativePath());
			documentElement.addChild(fileElement);
			// content = "\t<item>\n\t\t" + "<path>" + getPath()
			// + "</path>\n\t\t" + "<file>" + getResourceBaseRelativePath()
			// + "</file>\n\t" + "</item>";
		} else {
			documentElement = getElement("collection", "");
			OMElement fileElement = getElement("directory",
					getResourceBaseRelativePath());
			documentElement.addChild(fileElement);
			// content = "\t<collection>\n\t\t" + "<path>"
			// + getPath() + "</path>\n\t\t"
			// + "<directory>" + getResourceBaseRelativePath()
			// + "</directory>\n\t"
			// + "</collection>\n";

		}
		OMElement fileElement = getElement("path", getPath());
		documentElement.addChild(fileElement);
		return documentElement;
	}

	public String getResourceBaseRelativePath() {
		if(sourceFile.equals(getBase())){
			return getBase().getName();
		}
		return sourceFile.toString().substring(getBase().getPath().length() + 1);
	}

	public String getDeployPath() {
		if (getType() == RegistryArtifactConstants.REGISTRY_COLLECTION) {
			return getPath().trim();
		} else {
			return getPath().trim().endsWith("/") ? getPath().trim()
					+ getRelativePath() : getPath().trim() + "/"
					+ getRelativePath();
		}
	}

	protected String getDefaultName() {
		return null;
	}

	public void setBase(File base) {
		this.base = base;
	}

	public File getBase() {
		return base;
	}
}
