 /* Copyright (c) 2011, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.platform.core.intro.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ImageHyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.wizards.IWizardCategory;
import org.eclipse.ui.wizards.IWizardDescriptor;
import org.eclipse.ui.wizards.IWizardRegistry;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.wso2.developerstudio.eclipse.platform.core.utils.SWTResourceManager;
import org.wso2.developerstudio.eclipse.samples.contributor.IDeveloperStudioSampleContributor;
import org.wso2.developerstudio.eclipse.samples.utils.ExtensionPointHandler;
import org.wso2.developerstudio.eclipse.samples.wizards.ProjectCreationWizard;

public class DashboardPage extends FormPage {
	private static Map<String, String[]> wizardCategoryMap=new HashMap<String, String[]>(); 
	private  Map<String, IWizardDescriptor> wizardDescriptor; 
	
	static{
		wizardCategoryMap.put("Application Server", new String[] {
				"org.wso2.developerstudio.eclipse.artifact.newaxis2artifact",
				"org.wso2.developerstudio.eclipse.artifact.newjaxwsartifact",
				"org.wso2.developerstudio.eclipse.artifact.newwarartifact"
				});
		
		wizardCategoryMap.put("Business Process Server", new String[] {
				"org.wso2.developerstudio.eclipse.artifact.newbpelartifact"
				});
		
		wizardCategoryMap.put("Carbon", new String[] {
				"org.wso2.developerstudio.eclipse.artifact.carbonUIartifact",
				"org.wso2.developerstudio.eclipse.artifact.newlibraryartifact"
				});
		
		wizardCategoryMap.put( "Data Services Server", new String[] {
				"org.wso2.developerstudio.eclipse.artifact.newdsartifact",
				"org.wso2.developerstudio.eclipse.artifact.newvalidiatorartifact"
				});
		
		wizardCategoryMap.put("Enterprise Service Bus", new String[]{
				"org.wso2.developerstudio.eclipse.artifact.newesbproject",
				"org.wso2.developerstudio.eclipse.artifact.newendpointartifact", 
				"org.wso2.developerstudio.eclipse.artifact.newlocalentry",
				"org.wso2.developerstudio.eclipse.artifact.newmediatorartifact",
				"org.wso2.developerstudio.eclipse.artifact.newproxyservice",
				"org.wso2.developerstudio.eclipse.artifact.newsequenceartifact",
				"org.wso2.developerstudio.eclipse.artifact.synapseartifact"
				});
		
		wizardCategoryMap.put("Governance Registry", new String[]{
				"org.wso2.developerstudio.eclipse.general.project",
				"org.wso2.developerstudio.eclipse.artifact.newregistryresource",
				"org.wso2.developerstudio.eclipse.artifact.newregistryfilter",
				"org.wso2.developerstudio.eclipse.artifact.newregistryhandler"
				});
		
		wizardCategoryMap.put("Gadget Server", new String[]{ 
				"org.wso2.developerstudio.eclipse.artifact.newgadgetartifact"
				});
		
		wizardCategoryMap.put("Distribution", new String[]{
				"org.wso2.developerstudio.eclipse.distribution.project",
				});
	}
	/**
	 * Create the form page.
	 * @param id
	 * @param title
	 */
	public DashboardPage(String id, String title) {
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
	public DashboardPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
	}

	/**
	 * Create contents of the form.
	 * @param managedForm
	 */
	protected void createFormContent(IManagedForm managedForm) {
		managedForm.getForm().setImage(resize(SWTResourceManager.getImage(this.getClass(), "/intro/css/graphics/cApp-wizard.png"),32,32));
		FormToolkit toolkit = managedForm.getToolkit();
		ScrolledForm form = managedForm.getForm();
		form.setText("WSO2 Developer Studio");
		Composite body = form.getBody();
		toolkit.decorateFormHeading(form.getForm());
		toolkit.paintBordersFor(body);
		
		Section sctnCreate = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
		sctnCreate.setBounds(10, 10, 600, 800);
		managedForm.getToolkit().paintBordersFor(sctnCreate);
		sctnCreate.setText("Create");
		sctnCreate.setExpanded(true);
		
		Composite composite = managedForm.getToolkit().createComposite(sctnCreate, SWT.NONE);
		managedForm.getToolkit().paintBordersFor(composite);
		sctnCreate.setClient(composite);
		composite.setLayout(new GridLayout(2, false));
		
		wizardDescriptor = getWizardDescriptors();

		createCategory(managedForm,composite,"Application Server");
		createCategory(managedForm,composite,"Enterprise Service Bus");
		createCategory(managedForm,composite,"Governance Registry");
		createCategory(managedForm,composite,"Data Services Server");
		createCategory(managedForm,composite,"Carbon");
		createCategory(managedForm,composite,"Business Process Server");
		createCategory(managedForm,composite,"Gadget Server");
		createCategory(managedForm,composite,"Distribution");

		sctnCreate.setExpanded(true);
		Section sctnSamples = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
		sctnSamples.setBounds(650, 10, 300, 800);
		managedForm.getToolkit().paintBordersFor(sctnSamples);
		sctnSamples.setText("Samples");
		
		Composite comSamples = managedForm.getToolkit().createComposite(sctnSamples, SWT.NONE);
		managedForm.getToolkit().paintBordersFor(comSamples);
		sctnSamples.setClient(comSamples);
		comSamples.setLayout(new GridLayout(1, false));
		createSamples(managedForm,comSamples);
		sctnSamples.setExpanded(true);
	}
	
	private Map<String, IWizardDescriptor> getWizardDescriptors() {
		Map<String, IWizardDescriptor> descriptorMap = new HashMap<String, IWizardDescriptor>();
		List<IWizardDescriptor> descriptors = getWizardDescriptor(
		        "org.wso2.developerstudio.eclipse.capp.distribution",
				"org.wso2.developerstudio.eclipse.web.apps",
				"org.wso2.developerstudio.eclipse.message.mediation",
				"org.wso2.developerstudio.eclipse.repository",
				"org.wso2.developerstudio.eclipse.business.processes",
				"org.wso2.developerstudio.eclipse.portal.services",
				"org.wso2.developerstudio.eclipse.carbon.ui",
				"org.wso2.developerstudio.eclipse.extensions",
				"org.wso2.developerstudio.eclipse.service.hosting.project.types",
				"org.wso2.developerstudio.eclipse.service.hosting.features",
				"org.wso2.developerstudio.eclipse.extensions.project.types",
				"org.wso2.developerstudio.eclipse.extensions.features",
				"org.wso2.developerstudio.eclipse.message.mediation.project.types",
				"org.wso2.developerstudio.eclipse.message.mediation.features");
		
		for (IWizardDescriptor descriptor : descriptors) {
			descriptorMap.put(descriptor.getId(), descriptor);
        }
		return descriptorMap;
	}
	
	private List<IWizardDescriptor> getWizardDescriptor(String... categories){
		List<IWizardDescriptor> descriptors = new ArrayList<IWizardDescriptor>();
		IWizardRegistry wizardRegistry = PlatformUI.getWorkbench().getNewWizardRegistry();
		for (String category : categories) {
			IWizardCategory wizardCategory = wizardRegistry.findCategory(category);
			if (wizardCategory != null) {
				IWizardDescriptor[] wizards = wizardCategory.getWizards();
				descriptors.addAll(Arrays.asList(wizards));
			}
        }
		return descriptors;
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
		}
		}
		if(itemCount %2 ==1){
			new Label(composite, SWT.NONE);
		}
	}
	
	/**
	 * Create contents of wizard link
	 * @param managedForm
	 * @param composite
	 * @param wizard
	 */
	private void createWizardLink(IManagedForm managedForm,Composite composite,IWizardDescriptor wizard){
		final String wizardId = wizard.getId();
		ImageHyperlink wizardLink = managedForm.getToolkit().createImageHyperlink(composite, SWT.NONE);
		ImageDescriptor descriptionImage = wizard.getImageDescriptor();
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
	
	private void createSamples(IManagedForm managedForm,Composite composite){
		List<IDeveloperStudioSampleContributor> samples = ExtensionPointHandler.getSamples();
		for (IDeveloperStudioSampleContributor contributor : samples) {
			createSampleLink(managedForm,composite,contributor);
        }
	}

	private void createSampleLink(IManagedForm managedForm,Composite composite,final IDeveloperStudioSampleContributor contributor){
		ImageHyperlink sampleLink = managedForm.getToolkit().createImageHyperlink(composite, SWT.NONE);
		ImageDescriptor descriptionImage = contributor.getWizardPageImage();
		if(descriptionImage!=null){
			sampleLink.setImage(resize(descriptionImage.createImage(),32,32));
		}
		managedForm.getToolkit().paintBordersFor(sampleLink);
		sampleLink.setText(contributor.getCaption());
		sampleLink.setToolTipText(contributor.getToolTip());
		GridData gd_sampleLink = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		sampleLink.setLayoutData(gd_sampleLink);
		sampleLink.addHyperlinkListener(new IHyperlinkListener() {
			
			public void linkActivated(HyperlinkEvent evt) {
				createProject(contributor);
			}
			
			public void linkEntered(HyperlinkEvent evt) {
				
			}

			public void linkExited(HyperlinkEvent evt) {
				
			}
		});
	}
	
	private Image resize(Image image, int width, int height) {
		Image scaled = new Image(Display.getDefault(), width, height);
		GC gc = new GC(scaled);
		gc.setAntialias(SWT.ON);
		gc.setInterpolation(SWT.HIGH);
		gc.drawImage(image, 0, 0, image.getBounds().width, image.getBounds().height, 0, 0, width,
		             height);
		gc.dispose();
		return scaled;
	}
	
	private void createProject(IDeveloperStudioSampleContributor contributor){
		Shell shell = Display.getCurrent().getActiveShell();
		String projectName = contributor.getProjectName();
		ImageDescriptor wizardImage = contributor.getWizardPageImage();
		String title = contributor.getCaption();
		
		ProjectCreationWizard wizard = new ProjectCreationWizard(projectName, title, wizardImage);
		wizard.setWindowTitle(contributor.getCaption());
		wizard.init(PlatformUI.getWorkbench(), null);
		WizardDialog wizardDialog = new WizardDialog(shell, wizard);

		wizardDialog.create();
		
		if (wizardDialog.open()==Dialog.OK){
			IProject createdProject = wizard.getCreatedProject();
			try {
				if (!createdProject.exists()) {
					createdProject.create(null);
				}
				if (!createdProject.isOpen()) {
					createdProject.open(null);
				}
	            contributor.addSampleTo(createdProject);
            } catch (Exception e) {
	            e.printStackTrace();
            }
		}
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
		     IWizard wizard = descriptor.createWizard();
		     WizardDialog wd = new WizardDialog(PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getShell(), wizard);
		     wd.setTitle(wizard.getWindowTitle());
		     wd.open();
		   }
		 } catch (CoreException e) {
		   e.printStackTrace();
		 }
		}

}
