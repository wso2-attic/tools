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

package org.wso2.developerstudio.eclipse.capp.project.manager;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMAttribute;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.wso2.developerstudio.eclipse.capp.core.artifacts.configure.ICAppProjectSettings;
import org.wso2.developerstudio.eclipse.capp.core.artifacts.configure.ISettingsAttribute;
import org.wso2.developerstudio.eclipse.capp.core.artifacts.configure.ISettingsData;
import org.wso2.developerstudio.eclipse.capp.core.data.SettingsAttribute;
import org.wso2.developerstudio.eclipse.capp.core.data.SettingsData;
import org.wso2.developerstudio.eclipse.capp.core.manifest.AbstractXMLDoc;
import org.wso2.developerstudio.eclipse.capp.project.Activator;
import org.wso2.developerstudio.eclipse.capp.project.utils.CAppConstants;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;


public class CAppProjectSettings extends AbstractXMLDoc implements ICAppProjectSettings {
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private IProject cAppProject;
	private IFile cAppSettingsFile;
	private Map<String,ISettingsData> settingsList;
	
	public CAppProjectSettings(IProject project) {
		setcAppProject(project);
		readSettings();
	}

	public ISettingsData getSettings(String id) {
//		readSettings();
		return settingsList.get(id);
	}

	public void removeSettings(String id) {
		settingsList.remove(id);
		writeSettings();
	}

	public void setSettings(String id, ISettingsData data) {
		settingsList.put(id, data);
		writeSettings();
	}

	@SuppressWarnings("unchecked")
    private void readSettings(){
		if (settingsList==null)
			settingsList=new HashMap<String, ISettingsData>();
		if(getcAppSettingsFile() != null){
			if (getcAppSettingsFile().exists()){
				try {
					settingsList.clear();
		            XMLStreamReader parser = XMLInputFactory.newInstance().createXMLStreamReader(getcAppSettingsFile().getContents());
		            StAXOMBuilder builder = new StAXOMBuilder(parser);
		            OMElement documentElement =  builder.getDocumentElement();
		            deserialize(documentElement);
	            } catch (XMLStreamException e) {
		            log.error(e);
	            } catch (FactoryConfigurationError e) {
		            log.error(e);
	            } catch (CoreException e) {
		            log.error(e);
	            }
			}else{
				String rootElement="<capp />";
				try {
		            getcAppSettingsFile().create(new ByteArrayInputStream(rootElement.getBytes()), true, null);
	            } catch (CoreException e) {
		            log.error(e);
	            }
			}
		}
	}
	
	public String toString() {
		return serialize();
	}
	
	private void writeSettings(){
        try {
    		if (getcAppSettingsFile().exists()){
    			toFile(getcAppSettingsFile());
    		}
	        getcAppProject().refreshLocal(IResource.DEPTH_INFINITE, null);
        } catch (CoreException e) {
	        log.error(e);
//        } catch (IOException e) {
//	        // TODO Auto-generated catch block
//	        log.error(e);
        }
 
	}

	public void setcAppProject(IProject cAppProject) {
	    this.cAppProject = cAppProject;
    }

	public IProject getcAppProject() {
		if(this.cAppProject == null){
			IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
			if(projects.length != 0){
				for (IProject prj : projects) {
					try {
						if(prj.hasNature(CAppConstants.CAPP_NATURE_ID)){
							cAppProject = prj;
							break;
						}
					} catch (CoreException e) {
						log.error(e);
					}
				}
			}
		}
	    return cAppProject;
    }

	public IFile getcAppSettingsFile() {
		if (cAppSettingsFile==null){
			if(getcAppProject() != null){
				cAppSettingsFile = getcAppProject().getFile(getDefaultName());
			}
		}
	    return cAppSettingsFile;
    }
	
	private ISettingsData getSettingsData(OMElement element){
		SettingsData settingsData = new SettingsData(element.getLocalName());
		Iterator attributes = element.getAllAttributes();
		Iterator children = element.getChildren();
		while(children.hasNext()){
			Object obj = children.next();
			if (obj instanceof OMElement){
    			OMElement child=(OMElement)obj;
    			if (child.getType()==OMElement.ELEMENT_NODE){
    				settingsData.addChildSettings(getSettingsData(child));
    			}
			}
		}
		while(attributes.hasNext()){
			OMAttribute child=(OMAttribute)attributes.next();
			settingsData.addSettingsAttribute(new SettingsAttribute(child.getLocalName(),child.getAttributeValue()));
		}
		settingsData.setSettingsValue(element.getText());
		return settingsData;
	}
	
	private static final OMFactory factory = OMAbstractFactory.getOMFactory();
	
	private OMElement getOMElement(ISettingsData settingsData){
		OMElement element = factory.createOMElement(new QName(settingsData.getSettingsName()));
		for(ISettingsData childSettingsData:settingsData.getChildSettings()){
			element.addChild(getOMElement(childSettingsData));
		}
		for(ISettingsAttribute settingsAttribute:settingsData.getAttributes()){
			element.addAttribute(settingsAttribute.getAttributeName(), settingsAttribute.getAttributeValue(), null);
		}
		element.setText(settingsData.getSettingsValue());
		return element;
	}

    protected String getDefaultName() {
	    return CAppConstants.CAPP_PROJECT_SETTINGS_FILE;
    }

    protected void deserialize(OMElement documentElement) {
    	Iterator<OMElement> childElements = (Iterator<OMElement>)documentElement.getChildElements();
        while(childElements.hasNext()){
        	OMElement child=childElements.next();
        	settingsList.put(child.getLocalName(),getSettingsData(child));
        }
    }

    protected String serialize() {
		if (new File(getcAppSettingsFile().getLocation().toOSString()).exists()){
    		if (settingsList==null){
    			settingsList=new HashMap<String, ISettingsData>();
    		}
    		try {
                XMLStreamReader parser = XMLInputFactory.newInstance().createXMLStreamReader(getcAppSettingsFile().getContents());
                StAXOMBuilder builder = new StAXOMBuilder(parser);
                OMElement documentElement =  builder.getDocumentElement();
                XMLOutputFactory xof = XMLOutputFactory.newInstance();
    //	            XMLStreamWriter writer = xof.createXMLStreamWriter(new FileOutputStream(getcAppSettingsFile().getRawLocation().toOSString()));
                while(documentElement.getFirstElement()!=null){
                	documentElement.getFirstElement().detach();
                }
                for(ISettingsData child:settingsList.values()){
    	            documentElement.addChild(getOMElement(child));
                }
                ByteArrayOutputStream stream = new ByteArrayOutputStream(); 
                prettify(documentElement, stream);
                return stream.toString();
            } catch (XMLStreamException e) {
                log.error(e);
            } catch (FactoryConfigurationError e) {
                log.error(e);
            } catch (CoreException e) {
                log.error(e);
            } catch (FileNotFoundException e) {
                log.error(e);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                log.error(e);
            }
		}
        return "<capp />";
    }
}
