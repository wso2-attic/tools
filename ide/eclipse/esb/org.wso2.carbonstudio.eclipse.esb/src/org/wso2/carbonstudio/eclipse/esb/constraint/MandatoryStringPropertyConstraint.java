/*
 * Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
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
package org.wso2.carbonstudio.eclipse.esb.constraint;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.w3c.dom.Document;
import org.wso2.carbonstudio.eclipse.esb.Mediator;
import org.wso2.carbonstudio.eclipse.esb.ModelObject;
import org.wso2.carbonstudio.eclipse.esb.NamespacedProperty;
import org.wso2.carbonstudio.eclipse.esb.mediators.HeaderAction;
import org.wso2.carbonstudio.eclipse.esb.mediators.HeaderMediator;
import org.wso2.carbonstudio.eclipse.esb.mediators.HeaderValueType;
import org.xml.sax.SAXException;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

/**
 * A constraint responsible for validating mandatory string attributes.
 */
public class MandatoryStringPropertyConstraint extends AbstractModelConstraint {
	/**
	 * {@inheritDoc}
	 */
	public IStatus validate(IValidationContext ctx) {
		try {
			
			File createTempDirectory = FileUtils.createTempDirectory();
			File mediatorFile = new File(createTempDirectory, "temp.xml");
			
			EObject eObj = ctx.getTarget();
			EMFEventType eType = ctx.getEventType();
			
			if (eType == EMFEventType.NULL) {
				String name = null;
				if(eObj instanceof ModelObject){
					String sourceText = ((ModelObject)eObj).getSourceText();
					FileUtils.writeContent(mediatorFile, sourceText);
					if(xmlSchemaValidate(mediatorFile)){
						return ctx.createSuccessStatus();
					}else{
						return ctx.createFailureStatus(new Object[] {eObj.eClass().getName()});
					}
//					HeaderValueType valueType = ((HeaderMediator)eObj).getValueType();
//					NamespacedProperty headerName = ((HeaderMediator)eObj).getHeaderName();
//					if(valueType.equals(HeaderValueType.LITERAL)){
//						String valueLiteral = ((HeaderMediator)eObj).getValueLiteral();
//					}else{
//						NamespacedProperty valueExpression = ((HeaderMediator)eObj).getValueExpression();
//					}
				}
				
			}else{
				List<Notification> notifications = ctx.getAllEvents();

				// We are only interested in live validations triggered by 'set'
				// operations which cause only one notification to be sent. 
				if (notifications.size() == 1) {
					Notification notification = notifications.get(0);
					String newValue = notification.getNewStringValue();
					String oldValue = notification.getOldStringValue();

					// If the original value is also invalid, there is no point in
					// triggering a failure. 
					if (StringUtils.isBlank(newValue) && !StringUtils.isBlank(oldValue)) {
						return ctx.createFailureStatus();
					}
				}
				
				return ctx.createSuccessStatus();
			}
		} catch (IOException e) {
			return ctx.createFailureStatus();
		}
		return ctx.createFailureStatus();
		
		
		
	}	
	
	public boolean xmlSchemaValidate(File sourceFile){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setValidating(true);
		factory.setAttribute(
		          "http://java.sun.com/xml/jaxp/properties/schemaLanguage", 
		          "http://www.w3.org/2001/XMLSchema");
		factory.setAttribute(
			      "http://java.sun.com/xml/jaxp/properties/schemaSource",
			      "http://synapse.apache.org/ns/2010/04/configuration/synapse_config.xsd");
		 Document doc = null;
		    try{        
		         DocumentBuilder parser = factory.newDocumentBuilder();
		         doc = parser.parse(sourceFile);
		       }
		    catch (ParserConfigurationException e){
		         System.out.println("Parser not configured: " + e.getMessage());
		         return false;
		       }
		    catch (SAXException e){
		         System.out.print("Parsing XML failed due to a " + e.getClass().getName() + ":");
		         System.out.println(e.getMessage());
		         return false;
		       }
		    catch (IOException e){
		         e.printStackTrace();
		         return false;
		       }
		    return true;
		    }

}
