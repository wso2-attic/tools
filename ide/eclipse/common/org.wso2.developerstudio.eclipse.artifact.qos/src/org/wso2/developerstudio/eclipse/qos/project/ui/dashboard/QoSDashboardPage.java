 /* Copyright (c) 2013, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
package org.wso2.developerstudio.eclipse.qos.project.ui.dashboard;

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.ImageHyperlink;
import org.eclipse.ui.wizards.IWizardDescriptor;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.core.utils.SWTResourceManager;
import org.wso2.developerstudio.eclipse.qos.Activator;


public class QoSDashboardPage extends FormPage {
	
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	
	private static Map<String, String[]> wizardCategoryMap=new LinkedHashMap<String, String[]>(); 
	private  Map<String, IWizardDescriptor> wizardDescriptor; 
	private  Map<String, Action> customActions = new LinkedHashMap<String, Action>(); 
	private static final String PROJECT_EXPLORER_PARTID = "org.eclipse.ui.navigator.ProjectExplorer";
	private static final String PACKAGE_EXPLORER_PARTID = "org.eclipse.jdt.ui.PackageExplorer";
	private ISelectionListener selectionListener = null;
	private ISelection selection = null;
	
		

	/**
	 * Create the form page.
	 * @param id
	 * @param title
	 */
	public QoSDashboardPage(String id, String title) {
		super(id, title);
	}

	/**
	 * Create the form page.
	 * @param editor
	 * @param id
	 * @param title
	 * @wbp.parser.constructor
	 * @wbp.eval.method.parameter id "Some id"
	 * @wbp.eval.method.parameter title "Some title"
	 */
	public QoSDashboardPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
	}

	/**
	 * Create contents of the form.
	 * @param managedForm
	 */
	protected void createFormContent(IManagedForm managedForm) {
		
		//setting initial selection
		ISelection initialSelection = getSite().getWorkbenchWindow().getSelectionService()
				.getSelection(PROJECT_EXPLORER_PARTID);
		if (initialSelection != null) {
			selection = initialSelection;
		} else {
			initialSelection = getSite().getWorkbenchWindow().getSelectionService()
					.getSelection(PACKAGE_EXPLORER_PARTID);
			if (initialSelection != null) {
				selection = initialSelection;
			}
		}
		
		selectionListener = new ISelectionListener() {
			public void selectionChanged(IWorkbenchPart workbenchPart, ISelection sel) {
				selection = sel;
			}
		};
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(PROJECT_EXPLORER_PARTID,selectionListener);
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(PACKAGE_EXPLORER_PARTID,selectionListener);

	}
	
	
	/**
	 * Create contents of category
	 * @param managedForm
	 * @param composite
	 * @param category
	 */
	private void createCategory(IManagedForm managedForm,Composite composite, String category){
		int itemCount=0;
		Label lblcategory = managedForm.getToolkit().createLabel(composite, category, SWT.NONE);
		lblcategory.setFont(SWTResourceManager.getFont("Sans", 10, SWT.BOLD));
		GridData gd_category = new GridData(SWT.FILL, SWT.CENTER, true, false,2, 1);
		gd_category.verticalIndent=10;
		lblcategory.setLayoutData(gd_category);
		
		for (String  id : wizardCategoryMap.get(category)){
		if(wizardDescriptor.containsKey(id)){
			itemCount++;
			createWizardLink(managedForm, composite,wizardDescriptor.get(id));
		} else if (customActions.containsKey(id)){
			itemCount++;
			createLink(managedForm, composite,customActions.get(id));
		}
		}
		if(itemCount %2 ==1){
			new Label(composite, SWT.NONE);
		}
	}
	
	/**
	 * Create contents of category with title
	 * @param managedForm
	 * @param composite
	 * @param category
	 */
	private void createTitlelessCategory(IManagedForm managedForm,Composite composite, String category,ImageDescriptor customImage){
		int itemCount=0;
		
		for (String  id : wizardCategoryMap.get(category)){
		if(wizardDescriptor.containsKey(id)){
			itemCount++;
			createWizardLink(managedForm, composite,wizardDescriptor.get(id),customImage);
		}
		}
		if(itemCount %2 ==1){
			new Label(composite, SWT.NONE);
		}
	}
	
	/**
	 * Create contents of wizard link with custom image
	 * @param managedForm
	 * @param composite
	 * @param wizard
	 * @param customImage
	 */
	private void createWizardLink(IManagedForm managedForm,Composite composite,IWizardDescriptor wizard,ImageDescriptor customImage){
		final String wizardId = wizard.getId();
		ImageHyperlink wizardLink = managedForm.getToolkit().createImageHyperlink(composite, SWT.NONE);
		ImageDescriptor descriptionImage = (customImage != null) ? customImage : wizard
				.getImageDescriptor();
		if(descriptionImage!=null){
			wizardLink.setImage(descriptionImage.createImage());
		}
		managedForm.getToolkit().paintBordersFor(wizardLink);
		wizardLink.setText(wizard.getLabel());
		wizardLink.setToolTipText(wizard.getDescription());
		GridData gd_wizardLink = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		wizardLink.setLayoutData(gd_wizardLink);
		wizardLink.addHyperlinkListener(new IHyperlinkListener() {
			
			public void linkActivated(HyperlinkEvent evt) {
				openWizard(wizardId);
			}
			
			public void linkEntered(HyperlinkEvent evt) {
				
			}

			public void linkExited(HyperlinkEvent evt) {
				
			}
		});
	}
	
	
	/**
	 * Create contents of link with custom action
	 * @param managedForm
	 * @param composite
	 * @param action
	 */
	private void createLink(IManagedForm managedForm,Composite composite,final Action action){
		ImageHyperlink wizardLink = managedForm.getToolkit().createImageHyperlink(composite, SWT.NONE);
		ImageDescriptor descriptionImage = action.getImageDescriptor();
		if(descriptionImage!=null){
			wizardLink.setImage(descriptionImage.createImage());
		}
		managedForm.getToolkit().paintBordersFor(wizardLink);
		wizardLink.setText(action.getText());
		wizardLink.setToolTipText(action.getDescription());
		GridData gd_wizardLink = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		wizardLink.setLayoutData(gd_wizardLink);
		wizardLink.addHyperlinkListener(new IHyperlinkListener() {
			
			public void linkActivated(HyperlinkEvent evt) {
				action.run();
			}
			
			public void linkEntered(HyperlinkEvent evt) {
				
			}

			public void linkExited(HyperlinkEvent evt) {
				
			}
		});
	}
	
	/**
	 * Create contents of wizard link
	 * @param managedForm
	 * @param composite
	 * @param wizard
	 */
	private void createWizardLink(IManagedForm managedForm,Composite composite,IWizardDescriptor wizard){
		createWizardLink(managedForm,composite,wizard,null);
	}
 
	/**
	 * Open a project wizard
	 * @param id 
	 */
	private void openWizard(String id) {
		 IWizardDescriptor descriptor = PlatformUI.getWorkbench()
		   .getNewWizardRegistry().findWizard(id);
		 try {
		   if (null != descriptor) {
			 IWorkbenchWizard wizard = descriptor.createWizard();
			 wizard.init(PlatformUI.getWorkbench(), getCurrentSelection());
		     WizardDialog wd = new WizardDialog(PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getShell(), wizard);
		     wd.setTitle(wizard.getWindowTitle());
		     wd.open();
		   }
		 } catch (CoreException e) {
		   log.error("Cannot open wizard",e);
		 }
		}
	
	/**
	 * Get current selection
	 * @return
	 */
	private IStructuredSelection getCurrentSelection() {
		if (selection instanceof IStructuredSelection) {
			return (IStructuredSelection) selection;
		}
		return new StructuredSelection();
	}
	
	public void dispose() {
		ISelectionService selectionService = getSite().getWorkbenchWindow()
				.getSelectionService();
		selectionService.removeSelectionListener(selectionListener);
		super.dispose();
	}
}
