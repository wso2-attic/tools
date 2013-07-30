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

package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.provider;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.synapse.config.xml.TemplateMediatorFactory;
import org.apache.synapse.mediators.template.TemplateMediator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.ui.celleditor.ExtendedComboBoxCellEditor;
import org.eclipse.emf.ecore.xml.type.internal.QName;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBArtifact;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBProjectArtifact;
import org.wso2.developerstudio.eclipse.gmf.esb.CallTemplateMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.CallTemplateParameter;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.Activator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbMultiPageEditor;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;
import org.eclipse.ui.internal.WorkbenchWindow;

public class CallTemplateTargetTemplateCustomPropertyDescriptor extends PropertyDescriptor{
	private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);
	private static final String synapseNS = "http://ws.apache.org/ns/synapse";
	private Properties properties = new Properties();
	private final String TYPE_TEMPLATE="synapse/sequenceTemplate";
	
	public CallTemplateTargetTemplateCustomPropertyDescriptor(Object object,
			IItemPropertyDescriptor itemPropertyDescriptor) {
		super(object, itemPropertyDescriptor);
	}
	
	public CellEditor createPropertyEditor(Composite parent) {		
		ArrayList<String> definedTemplates = new ArrayList<String>();	
		File projectPath = null;
		final Object object_=this.object;
		final Shell shell=(Shell)parent.getShell();
		final IEditorPart editor=(IEditorPart) ((WorkbenchWindow)shell.getDisplay().getActiveShell().getData()).getActivePage().getActiveEditor();
		if (editor != null) {
			IFileEditorInput input = (IFileEditorInput) editor.getEditorInput();
			IFile file = input.getFile();
			IProject activeProject = file.getProject();
			//FIXME: scan whole workspace
			try {
				if (activeProject.hasNature("org.wso2.developerstudio.eclipse.esb.project.nature")) {
					ESBProjectArtifact esbProjectArtifact = new ESBProjectArtifact();
					projectPath = activeProject.getLocation().toFile();
					try {
						esbProjectArtifact.fromFile(activeProject.getFile("artifact.xml").getLocation().toFile());
						List<ESBArtifact> allESBArtifacts = esbProjectArtifact.getAllESBArtifacts();
						for (ESBArtifact esbArtifact : allESBArtifacts) {
							if (TYPE_TEMPLATE.equals(esbArtifact.getType())) {
								File artifact = new File(projectPath, esbArtifact.getFile());
								definedTemplates.add(artifact.getName().replaceAll("[.]xml$", ""));
							}
						}
					} catch (Exception e) {
						log.error("Error occured while scanning the project for " + TYPE_TEMPLATE+ " artifacts", e);
						ErrorDialog.openError(shell,"Error occured while scanning the project for " + TYPE_TEMPLATE+ " artifacts", e.getMessage(), null);
					}
				}
			} catch (CoreException e) {
				log.error("Error occured while scanning the project", e);
				ErrorDialog.openError(shell,"Error occured while scanning the project", e.getMessage(), null);
			}
		}
		final File projectPath_ =projectPath;
		
		/*
		 * A custom comboBox control which has available templates in its list will be returned.   
		 */
		return new ExtendedComboBoxCellEditor(parent,definedTemplates,getLabelProvider()){	
			/*
			 * The purpose of overriding this 'focusLost' method is to fill the parameters dialog of the callTemplate mediator
			 * with parameters of the selected template.  
			 */
			protected void focusLost() {
				super.focusLost();
				String path = projectPath_ + "/src/main/synapse-config/templates/" + getValue()	+ ".xml";
				try {
					String source = FileUtils.getContentAsString(new File(path));
					System.out.println(source);
					OMElement element = AXIOMUtil.stringToOM(source);

					if (element.getFirstChildWithName(new QName(synapseNS, "sequence", null)) != null) {
						TemplateMediatorFactory templateMediatorFactory = new TemplateMediatorFactory();
						TemplateMediator templateMediator = (TemplateMediator) templateMediatorFactory.createMediator(element, properties);						
						TransactionalEditingDomain editingDomain =((EsbMultiPageEditor)editor).getGraphicalEditor().getEditingDomain();						
						DeleteCommand modelDeleteCommand = new DeleteCommand(editingDomain, ((CallTemplateMediator)object_).getTemplateParameters());
						if (modelDeleteCommand.canExecute()) {
							editingDomain.getCommandStack().execute(modelDeleteCommand);
						}						
						for (String parameter : templateMediator.getParameters()) {
							final CallTemplateParameter callTemplateParameter = EsbFactory.eINSTANCE.createCallTemplateParameter();
							callTemplateParameter.setParameterName(parameter);							
							if(editor instanceof EsbMultiPageEditor){
								RecordingCommand command = new RecordingCommand(editingDomain) {
									protected void doExecute() {
										((CallTemplateMediator)object_).getTemplateParameters().add(callTemplateParameter);
									}
								};
								if (command.canExecute()) {
									editingDomain.getCommandStack().execute(command);
								}
							}	
						}
					}
				} catch (XMLStreamException e) {
					log.error("Error occured while parsing selected template file", e);
				    ErrorDialog.openError(shell,"Error occured while parsing selected template file", e.getMessage(), null);
				}  catch (IOException e) {
					log.error("Error occured while reading selected template file", e);
					ErrorDialog.openError(shell,"Error occured while reading selected template file", e.getMessage(), null);
				}				
			}
		};
	}
}
