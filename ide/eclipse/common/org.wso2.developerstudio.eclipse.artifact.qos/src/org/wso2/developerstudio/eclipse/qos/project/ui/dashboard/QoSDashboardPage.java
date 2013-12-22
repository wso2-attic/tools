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

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ToolTip;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IExpansionListener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.wizards.IWizardDescriptor;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.core.utils.SWTResourceManager;
import org.wso2.developerstudio.eclipse.platform.ui.preferences.ClientTrustStorePreferencePage;
import org.wso2.developerstudio.eclipse.qos.Activator;
import org.wso2.developerstudio.eclipse.qos.handlers.OpenQoSDashboardCommandHandler;
import org.wso2.developerstudio.eclipse.qos.project.model.Association;
import org.wso2.developerstudio.eclipse.qos.project.model.Binding;
import org.wso2.developerstudio.eclipse.qos.project.model.Bindings;
import org.wso2.developerstudio.eclipse.qos.project.model.Module;
import org.wso2.developerstudio.eclipse.qos.project.model.Operation;
import org.wso2.developerstudio.eclipse.qos.project.model.Parameter;
import org.wso2.developerstudio.eclipse.qos.project.model.Policies;
import org.wso2.developerstudio.eclipse.qos.project.model.Policy;
import org.wso2.developerstudio.eclipse.qos.project.model.Policy2;
import org.wso2.developerstudio.eclipse.qos.project.model.Service;
import org.wso2.developerstudio.eclipse.qos.project.model.ServiceGroup;
import org.wso2.developerstudio.eclipse.qos.project.ui.wizard.QOSProjectWizard;
import org.wso2.developerstudio.eclipse.qos.project.utils.QoSTemplateUtil;


public class QoSDashboardPage extends FormPage {
	
	private static final String QOS_WIZARD_ID = "org.wso2.developerstudio.eclipse.artifact.newqosproject";

	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	private static final String PROJECT_EXPLORER_PARTID = "org.eclipse.ui.navigator.ProjectExplorer";
	private static final String PACKAGE_EXPLORER_PARTID = "org.eclipse.jdt.ui.PackageExplorer";
	private ISelectionListener selectionListener = null;
	private ISelection selection = null;
	public static String serviceName;
	//private Map<String, Service> serviceList;
	public static IProject metaProject;
	public static String metaFileName;
	private String policyFileName;
	private String aliase;
	/**
	 * Create the form page.
	 * @param id
	 * @param title
	 */
	public QoSDashboardPage(String id, String title) {
		super(id, title);
	}

	/**
	 * 
	 * @param editor
	 * @param id
	 * @param title
	 * @param project
	 */

	public QoSDashboardPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
		//serviceList = getServiceList();
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

		FormToolkit toolkit = managedForm.getToolkit();
		ScrolledForm form = managedForm.getForm();
		form.setText("Quality of Service (QoS)");
		final Composite body = form.getBody();
		GridLayout gridParentLayout = new GridLayout(1,true);
		 
		body.setLayout(gridParentLayout);
		toolkit.decorateFormHeading(form.getForm());
		toolkit.paintBordersFor(body);
		
		Object[] result = CreateMainSection(managedForm, body,"Service Info",10, 10, 600, 30, true);
		Composite serviceInfoComposite = (Composite)result[1];
		GridLayout gridserviceLayout = new GridLayout(3,false);
		serviceInfoComposite.setLayout(gridserviceLayout);
		managedForm.getToolkit().createLabel(serviceInfoComposite, "Services List");
		final Combo serviceName = new Combo(serviceInfoComposite, SWT.READ_ONLY);
		// Set<String> keySet = serviceList.keySet();
		/* String[] array = keySet.toArray(new String[0]);
		 serviceName.setItems(array);
		 serviceName.select(0);
		 QoSDashboardPage.serviceName =serviceName.getItem(serviceName.getSelectionIndex());
		 serviceName.addSelectionListener(new SelectionAdapter() {
		        @Override
		   public void widgetSelected(SelectionEvent e) {
		        	QoSDashboardPage.serviceName =serviceName.getItem(serviceName.getSelectionIndex());
	 	   }
		 });*/
		String[] array = new String[1];
		array[0] = QoSDashboardPage.serviceName;
		serviceName.setItems(array);
		 
		 new Label(serviceInfoComposite, SWT.None);
	
		 managedForm.getToolkit().createLabel(serviceInfoComposite, "Project name");
		 managedForm.getToolkit().createText(serviceInfoComposite, "");
         managedForm.getToolkit().createButton(serviceInfoComposite, "browser",SWT.NONE);
		 
		new Label(serviceInfoComposite, SWT.None);
		new Label(serviceInfoComposite, SWT.None);
		
	    Hyperlink createHyperlink = managedForm.getToolkit().createHyperlink(serviceInfoComposite, "Create Project", SWT.NONE);
		createHyperlink.addHyperlinkListener(new HyperlinkAdapter(){
			  @Override
			public void linkActivated(HyperlinkEvent e) {
				   IWizard openWizard = openWizard(QOS_WIZARD_ID);
				   QOSProjectWizard qosProjectWizard = (QOSProjectWizard) openWizard; 
				    
			}		  
		  });
		
		managedForm.getToolkit().createLabel(serviceInfoComposite, "Project name");
		final Combo keyStors = new Combo(serviceInfoComposite, SWT.READ_ONLY);
		try {
			KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
		    IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
		    String filePath = preferenceStore.getString(ClientTrustStorePreferencePage.TRUST_STORE_LOCATION);
		    String passwod = preferenceStore.getString(ClientTrustStorePreferencePage.TRUST_STORE_PASSWORD);
			keyStore.load(new FileInputStream(new File(filePath)), passwod.toCharArray());
			Enumeration<String> aliases = keyStore.aliases();
		      while(aliases.hasMoreElements()){
			  setAliase((String) aliases.nextElement());
			  break;
			}
		    //  keyStore.get
		      
		      
		} catch (Exception ex) {
			log.error("preferenceStore reading error", ex);
		}
		
		
		
		result = CreateMainSection(managedForm, body,
				"Security for the service", 10, 20, 600, 30, false);
		final Composite seccomposite = (Composite) result[1];
		GridLayout gridSecLayout = new GridLayout(2, false);
		seccomposite.setLayout(gridSecLayout);

		String[] names = new String[] { "UsernameToken", "Non-repudiation",
				"Integrity", "Confidentiality" };
		createCategory(managedForm, seccomposite, "Basic Scenarios");
		createSecurityItems(seccomposite, names, managedForm,0);

		names = new String[] {
				"Sign and Encrypt - X509 Authentication",
				"Sign and Encrypt - Anonymous clients",
				"Encrypt only - Username Token Authentication",
				"Sign and Encrypt - Username Token Authentication",
				"SecureConversation - Sign only - Service as STS - Bootstrap policy - Sign and Encrypt , X509 Authentication",
				"SecureConversation - Encrypt only - Service as STS - Bootstrap policy - Sign and Encrypt , X509 Authentication",
				"SecureConversation - Sign and Encrypt - Service as STS - Bootstrap policy - Sign and Encrypt , X509 Authentication",
				"SecureConversation - Sign Only - Service as STS - Bootstrap policy - Sign and Encrypt , Anonymous clients",
				"SecureConversation - Sign and Encrypt - Service as STS - Bootstrap policy - Sign and Encrypt , Anonymous clients",
				"SecureConversation - Encrypt Only - Service as STS - Bootstrap policy - Sign and Encrypt , Username Token Authentication",
				"SecureConversation - Sign and Encrypt - Service as STS - Bootstrap policy - Sign and Encrypt , Username Token Authentication",
				"Kerberos Authentication - Sign - Sign based on a Kerberos Token.",
				"Sign and Encrypt - X509 Authentication - SAML 2.0 Token Required",
				"Sign and Encrypt - Anonymous clients - SAML 2.0 Token Required" };

		createCategory(managedForm, seccomposite, "Advanced Scenarios");
		createSecurityItems(seccomposite, names, managedForm,4);

		createCategory(managedForm, seccomposite, "Policy From Registry");
		names = new String[] { "registry" };
		createSecurityItems(seccomposite, names, managedForm,20);
        
	    Button aApplySecBtn = managedForm.getToolkit().createButton(seccomposite, "Apply", SWT.NONE);
	    aApplySecBtn.addSelectionListener(new SelectionAdapter() {
	

			@Override
			public void widgetSelected(SelectionEvent e) { 
			    try {
					addPolicy();
				} catch (Exception e1) {
					 log.error("cannot load service meta file", e1);
				}
			}

			private void addPolicy() throws JAXBException, IOException,
					PropertyException, CoreException {
				File serviceMeta = QoSDashboardPage.metaProject.getFile("src/main/resources/"+QoSDashboardPage.metaFileName).getLocation().toFile();
				
				JAXBContext jaxbContext = JAXBContext.newInstance(ServiceGroup.class);
				Unmarshaller uUnmarshaller = jaxbContext.createUnmarshaller();
				ServiceGroup serviceGroup =  (ServiceGroup) uUnmarshaller.unmarshal(serviceMeta);
				
				List<Service> services = serviceGroup.getService();
				Service service=null;
				for (Service sService : services) {
					if(QoSDashboardPage.serviceName.equals(sService.getName())){
						service =sService;
						break;
					}
				}
				
				if(service!=null){
				QoSTemplateUtil qoSTemplateUtil = new QoSTemplateUtil();
				String filename = "policies/"+getPolicyFileName();
				File resourceFile =qoSTemplateUtil.getResourceFile(filename);
				 if(resourceFile!=null){
					 JAXBContext pjaxbContext = JAXBContext.newInstance(Policy2.class);
					 Unmarshaller pUnmarshaller = pjaxbContext.createUnmarshaller();
					 Policy2 policy2 =  (Policy2) pUnmarshaller.unmarshal(resourceFile);
					 
					 Policy policy = new Policy();
					 policy.setPolicy(policy2);
					 policy.setPolicyType(BigInteger.valueOf(9l));
					 policy.setPolicyUUID(policy2.getId());
					 Policies policies = new Policies();
					 policies.getPolicy().add(policy);
					 service.setPolicies(policies);
					 Bindings bindings = service.getBindings();
					 if(bindings!=null){
						 List<Binding> bindingList = bindings.getBinding();
						 for (Binding binding : bindingList) {
							 if(binding.getName().contains("Soap")){
								 binding.setPolicyUUID(policy2.getId());
							 }
						}
					 }
					 service.setBindings(bindings);
					 Module module = new Module();
					 module.setName("rampart");
					 module.setVersion("1.61-wso2v10");
					 module.setType("engagedModules");
					 service.getModuleOrParameterOrPolicyUUID().add(module);
					 Association associationKeyStore = new Association();
					 associationKeyStore.setDestinationPath("/_system/governance/repository/security/key-stores/carbon-primary-ks");
					 associationKeyStore.setType("service-keystore");
					 Association associationTrustStore = new Association();
					 associationTrustStore.setDestinationPath("/_system/governance/repository/security/key-stores/carbon-primary-ks");
					 associationTrustStore.setType("trusted-keystore");
					 service.getModuleOrParameterOrPolicyUUID().add(associationKeyStore);
					 service.getModuleOrParameterOrPolicyUUID().add(associationTrustStore);
				  }	
				} 

				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
				jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				jaxbMarshaller.marshal(serviceGroup, serviceMeta); 
				QoSDashboardPage.metaProject.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			}
		});
			 
     /*  CreateMainSection(managedForm, body,"Policies",10, 30, 600, 30, false);
		 CreateMainSection(managedForm, body,"Response Caching",10, 50, 600, 30, false);
		 CreateMainSection(managedForm, body,"Access Throttling",10, 60, 600, 30, false);
		 CreateMainSection(managedForm, body,"MTOM",10, 70, 600, 30, false);
		 CreateMainSection(managedForm, body,"Transports",10, 80, 600, 30, false);
		 CreateMainSection(managedForm, body,"Modules",10, 90, 600, 30, false);
		 CreateMainSection(managedForm, body,"Operations",10, 100, 600, 30, false);
		 CreateMainSection(managedForm, body,"Parameters",10, 110, 600, 30, false);
		 
		 */
		
	}

	/*
	private Map<String,Service> getServiceList(){
		Map<String,Service> serviceMap = new HashMap<String,Service>();
		IProject project = OpenQoSDashboardCommandHandler.project;
		if(project!=null){
			try {
				File fXmlFile = project.getFile("/src/main/resources/META-INF/services.xml").getLocation().toFile();
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(fXmlFile);
				doc.getDocumentElement().normalize();
				String nodeName = doc.getDocumentElement().getNodeName();
				Node firstChild = doc.getFirstChild();
				if("service".equals(nodeName)){
					cretaeService(serviceMap, firstChild,project);
				}else if("serviceGroup".equals(nodeName)){
				   NodeList childNodes = firstChild.getChildNodes();
				  for(int i=0; i<childNodes.getLength(); i++){
					  Node tempNode = childNodes.item(i);
					   cretaeService(serviceMap, tempNode,project);
				  }
				}
			} catch (Exception e) {
			 log.error("Cannot parse service.xml", e);
			}
		}
		return serviceMap;
	}*/

	/*private void cretaeService(Map<String, Service> serviceMap, Node firstChild,IProject project) throws JavaModelException {
		if(firstChild.getNodeType()==Node.ELEMENT_NODE){
			Element eElement = (Element) firstChild;
			String name = eElement.getAttribute("name");
			Service service = new Service();
			service.setName(name);
			service.setServiceDocumentation(name);
			service.setExposedAllTransports(true);
			long time = new Date().getTime();
			service.setServiceDeployedTime(BigInteger.valueOf(time));
			service.setSuccessfullyAdded(true);
			service.setServiceActive(true);
            Bindings bindings = new Bindings();
			
			String serviceHttpBinding = name+"HttpBinding";
			String serviceSoap12Binding = name+"Soap12Binding";
			String serviceSoap11Binding = name+"Soap11Binding";
			
			Binding hHttpBinding = new Binding();
			hHttpBinding.setName(serviceHttpBinding);
			Binding sSoap12Binding = new Binding();
			sSoap12Binding.setName(serviceSoap12Binding);
			Binding sSoap11Binding = new Binding();
			sSoap11Binding.setName(serviceSoap11Binding);
			
			Parameter parameter = new Parameter();
			parameter.setName("ServiceClass");
			parameter.setLocked(false);
			parameter.setValue(eElement.getElementsByTagName("parameter").item(0).getTextContent());
			service.getModuleOrParameterOrPolicyUUID().add(parameter);
			serviceMap.put(name, service);
			Map<String, List<MethodDeclaration>> compliationUnitsMap = getCompliatiosnUnits(project);
			List<MethodDeclaration> oplist = compliationUnitsMap.get(name);
			List<String> operations = getOperations(oplist);
			for (String opName : operations) {
				Operation operation = new Operation();
				operation.setName(opName);
				service.getOperation().add(operation);
				hHttpBinding.getOperation().add(operation);
				sSoap12Binding.getOperation().add(operation);
				sSoap11Binding.getOperation().add(operation);
			}
			bindings.getBinding().add(hHttpBinding);
			bindings.getBinding().add(sSoap11Binding);
			bindings.getBinding().add(sSoap12Binding);
			service.setBindings(bindings);
		}
	}*/

	/*private Map<String,List<MethodDeclaration>> getCompliatiosnUnits(IProject project)
			throws JavaModelException {
		Map<String,List<MethodDeclaration>> units = new HashMap<String,List<MethodDeclaration>>();
 		IJavaProject ijavaProject = JavaCore.create(project);
		IPackageFragment[] packageFragments = ijavaProject.getPackageFragments();
		for (IPackageFragment iPackageFragment : packageFragments) {
			   ICompilationUnit[] compilationUnits = iPackageFragment.getCompilationUnits();
			   for (ICompilationUnit iCompilationUnit : compilationUnits) {
						  ASTParser parser = ASTParser.newParser(AST.JLS4);
						  parser.setSource(iCompilationUnit);
						  CompilationUnit  tempUnit = (CompilationUnit)parser.createAST(null);
						  MethodVisitor methodVisitor = new MethodVisitor();
						  tempUnit.accept(methodVisitor);
						  List<MethodDeclaration> methods = methodVisitor.getMethods();
						  String elementName = tempUnit.getJavaElement().getElementName();
						  String[] name = elementName.split("\\.");
						  units.put(name[0],methods);
			    }
		 }
		return  units;
	}

  private List<String> getOperations(List<MethodDeclaration> methods) {
		 List<String> oplist = new ArrayList<String>();
		for (MethodDeclaration methodDeclaration : methods) {
			    List<Modifier> modifiers = methodDeclaration.modifiers();
			      for (Modifier modifier : modifiers) {
					 if(modifier.isPublic()){
						 oplist.add(methodDeclaration.getName().toString());
					 }
				}
		}
		return oplist;
	} */
	
	
	private void createSecurityItems(Composite seccomposite ,String[] names,IManagedForm managedForm,int i) {
		
		for (String name : names) {
			i++;
			final Button secBtn = new Button(seccomposite, SWT.RADIO);
			 secBtn.setText("");
			 String fileName ="scenario"+i+"-policy.xml";
			 secBtn.setData(fileName);
			 secBtn.addSelectionListener(new SelectionAdapter() {
				 @Override
				public void widgetSelected(SelectionEvent e) {
					 String pfile = (String) secBtn.getData();
					 setPolicyFileName(pfile);				
					 }
			});
			 
			 final ToolTip tip = new ToolTip(seccomposite.getShell(), SWT.BALLOON | SWT.ICON_INFORMATION);
			 tip.setMessage("Here is a message for the user. When the message is too long it wraps. I should say something cool but nothing comes to my mind.");

			  Hyperlink createHyperlink = managedForm.getToolkit().createHyperlink(seccomposite, name, SWT.RADIO);
			  createHyperlink.addHyperlinkListener(new HyperlinkAdapter(){
				  @Override
				public void linkActivated(HyperlinkEvent e) {
					 tip.setVisible(true);
				}
				  
			  });
			  
		   } 
	}

	private Object[] CreateMainSection(IManagedForm managedForm,final Composite body,
			String sectionName,final int x, final int y, final int width, final int height, boolean expand) {
		 Object[] comp = new Object[2];
		final Section sctnCreate = managedForm.getToolkit().createSection(body, Section.TWISTIE | Section.TITLE_BAR);
		sctnCreate.setBounds(x, y, width, height);
		managedForm.getToolkit().paintBordersFor(sctnCreate);
		sctnCreate.setText(sectionName);
		sctnCreate.setExpanded(expand);
		GridData layoutData = new GridData();
		layoutData.minimumWidth = 600;
		layoutData.horizontalAlignment = SWT.FILL;
		layoutData.grabExcessHorizontalSpace = true;
		sctnCreate.setLayoutData(layoutData);
		sctnCreate.addExpansionListener(new IExpansionListener() {
			
			@Override
			public void expansionStateChanging(ExpansionEvent e) {
			}		
			@Override
			public void expansionStateChanged(ExpansionEvent e) {
				if(!e.getState()){
				sctnCreate.setBounds(x, y, width, height);	 
				GridData layoutData = (GridData)sctnCreate.getLayoutData();
				layoutData.minimumWidth = 600;
				layoutData.horizontalAlignment = SWT.FILL;
				layoutData.grabExcessHorizontalSpace = true;
				layoutData.heightHint = sctnCreate.getBounds().height;
				body.layout();
				 
				}else{
			    sctnCreate.setBounds(x, y, width, height*10);
			    GridData layoutData = (GridData)sctnCreate.getLayoutData();
			    layoutData.minimumWidth = 600;
			    layoutData.horizontalAlignment = SWT.FILL;
				layoutData.grabExcessHorizontalSpace = true;
				layoutData.heightHint = sctnCreate.getBounds().height;
			    body.layout();
				}
			}
		});	
		comp[0]=sctnCreate;
		Composite composite = managedForm.getToolkit().createComposite(sctnCreate, SWT.NULL);
		managedForm.getToolkit().paintBordersFor(composite);
		sctnCreate.setClient(composite);
		composite.setLayout(new GridLayout(1, false));
		comp[1] = composite;
		
		return comp;
	}
	
	
	/**
	 * Create contents of category
	 * @param managedForm
	 * @param composite
	 * @param category
	 */
	private void createCategory(IManagedForm managedForm,Composite composite, String category){
		Label lblcategory = managedForm.getToolkit().createLabel(composite, category, SWT.NONE);
		lblcategory.setFont(SWTResourceManager.getFont("Sans", 10, SWT.BOLD));
		GridData gd_category = new GridData(SWT.FILL, SWT.CENTER, true, false,2, 1);
		gd_category.verticalIndent=10;
		lblcategory.setLayoutData(gd_category);
		 
	}
 
	/**
	 * Open a project wizard
	 * @param id 
	 */
	private IWizard openWizard(String id) {
		 IWizardDescriptor descriptor = PlatformUI.getWorkbench()
		   .getNewWizardRegistry().findWizard(id);
		 
		 try {
		   if (null != descriptor) {
			 IWorkbenchWizard wizard = descriptor.createWizard();
			 wizard.init(PlatformUI.getWorkbench(), getCurrentSelection());
		     WizardDialog wd = new WizardDialog(PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getShell(), wizard);
		     wd.setTitle(wizard.getWindowTitle());
		     QOSProjectWizard qosProjectWizard = (QOSProjectWizard) wizard; 
		    // qosProjectWizard.setServiceName(QoSDashboardPage.serviceName);
           //  Service service = serviceList.get(QoSDashboardPage.serviceName);
             //qosProjectWizard.setService(service);
		     wd.open();
		///     metaProject = (IProject) qosProjectWizard.getCreatedResource();
		  //   metaFileName = qosProjectWizard.getMetaFileName();
		     return wizard;
		   }
 
		 } catch (CoreException e) {
					   log.error("Cannot open wizard",e);
		 }
		 return null;
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

 
	public String getAliase() {
		return aliase;
	}

	public void setAliase(String aliase) {
		this.aliase = aliase;
	}

	public String getPolicyFileName() {
		return policyFileName;
	}

	public void setPolicyFileName(String policyFileName) {
		this.policyFileName = policyFileName;
	}

	private class MethodVisitor extends ASTVisitor {
	    List<MethodDeclaration> methods = new ArrayList<MethodDeclaration>();

	    @Override
	    public boolean visit(MethodDeclaration node) {
	            methods.add(node);
	            return super.visit(node);
	    }
	   
	    /**
	     *
	     * @return
	     */
	    public List<MethodDeclaration> getMethods() {
	            return methods;
	    }
	   
	}
	
}




