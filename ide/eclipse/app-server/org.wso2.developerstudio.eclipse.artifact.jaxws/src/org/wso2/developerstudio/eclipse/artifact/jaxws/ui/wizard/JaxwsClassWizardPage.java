/*
 * Copyright (c) 2011, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.artifact.jaxws.ui.wizard;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.ui.wizards.NewTypeWizardPage;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.wso2.developerstudio.eclipse.platform.ui.validator.CommonFieldValidator;
import org.eclipse.jdt.internal.ui.dialogs.StatusInfo;


public class JaxwsClassWizardPage extends NewTypeWizardPage implements Listener {
	
	  public JaxwsClassWizardPage(IWorkbench workbench,IStructuredSelection selection) {
		super(true, "Create new JAX-WS class");
	}

	private Button fCreateStubs;
	private Label lblServiceInterfacePkg;
	private Text txtServiceInterfacePkg;
	private Label lblServiceInterfaceClass;
	private Text txtServiceInterfaceClass;
	private Button btnServiceInterfacePkg; 
	private Label lblServiceInterface;
	private String ifClass;
	private String ifPkg;

	    public void init(IStructuredSelection selection) {
	    	setTitle("Create new JAX-WS class");
	        IJavaElement jelem= getInitialJavaElement(selection);
	        initContainerPage(jelem);
	        initTypePage(jelem);
	        doStatusUpdate();
	    } 

	    private void doStatusUpdate() {
	    	final String pkgName = getPackageText();
	    	final String ifPkgName = (txtServiceInterfacePkg!=null)?txtServiceInterfacePkg.getText():"";
	    	final String ifClassName = (txtServiceInterfaceClass!=null)?txtServiceInterfaceClass.getText():"";
	    	
	    	IStatus ifClassStatus = new StatusInfo(IStatus.ERROR, "Service interface class name is invalid");
	    	IStatus ifpkgStatus = new StatusInfo(IStatus.ERROR, "Service interface package name is invalid");
	    	IStatus okStatus = new StatusInfo(IStatus.OK, "");
	    	
	    	
	    	IStatus pkgStatus = new IStatus() {
				
				public boolean matches(int arg) {
					if(ifPkgName.trim().isEmpty()) {
						return true;
					}
					return fPackageStatus.matches(arg);
				}
				
				public boolean isOK() {
					if(ifPkgName.trim().isEmpty()) {
						return false;
					}
					return fPackageStatus.isOK();
				}
				
				public boolean isMultiStatus() {
					return fPackageStatus.isMultiStatus();
				}
				
				public int getSeverity() { 
					if(pkgName.trim().isEmpty()) {
						return 4;
					}
					return fPackageStatus.getSeverity();
				}
				
				public String getPlugin() {
					return fPackageStatus.getPlugin();
				}
				
				public String getMessage() {
					return fPackageStatus.getMessage();
				}
				
				public Throwable getException() {
					return fPackageStatus.getException();
				}
				
				public int getCode() {
					return fPackageStatus.getCode();
				}
				
				public IStatus[] getChildren() {
					return fPackageStatus.getChildren();
				}
			};
			
	    	
	        IStatus[] status= new IStatus[] {
	            fContainerStatus,
	            isEnclosingTypeSelected() ? fEnclosingTypeStatus : pkgStatus,
	            fTypeNameStatus,
	            CommonFieldValidator.isJavaClassName(ifClassName) ? okStatus : ifClassStatus,
	            CommonFieldValidator.isJavaPackageName(ifPkgName) ? okStatus : ifpkgStatus
	        };
	        updateStatus(status);
	    }


	    protected void handleFieldChanged(String fieldName) {
	        super.handleFieldChanged(fieldName);

	        doStatusUpdate();
	    }
	 
	    public void createControl(Composite parent) {
	        initializeDialogUnits(parent);
	        Composite composite= new Composite(parent, SWT.NONE);
	        int nColumns= 4;
	        GridLayout layout= new GridLayout();
	        layout.numColumns= nColumns;
	        composite.setLayout(layout);
	        
	        GridData gd= new GridData();
	        gd.horizontalSpan= nColumns;

	        // Create the standard input fields
	        createContainerControls(composite, nColumns);
	        createPackageControls(composite, nColumns);
	        
	        createSeparator(composite, nColumns);

	        createTypeNameControls(composite, nColumns);
	        createSuperClassControls(composite, nColumns);
	        
	        createSeparator(composite, nColumns);
	        
	        lblServiceInterface = new Label(composite, SWT.NONE);
	        lblServiceInterface.setLayoutData(gd);
	        lblServiceInterface.setText("Service Interface");
	        
	    	lblServiceInterfacePkg = new Label(composite, SWT.NONE);
	    	lblServiceInterfacePkg.setText("Package");
	    	txtServiceInterfacePkg = new Text(composite, SWT.BORDER);
	    	GridData gridData= new GridData(GridData.FILL_HORIZONTAL);
	    	gridData.horizontalSpan= 2;
	    	txtServiceInterfacePkg.setLayoutData(gridData);
	    	txtServiceInterfacePkg.addListener(SWT.CHANGED, this);
	    	
	    	btnServiceInterfacePkg = new Button(composite, SWT.NONE);
	    	btnServiceInterfacePkg.setText("B&rowse...");
	    	btnServiceInterfacePkg.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    	btnServiceInterfacePkg.addListener(SWT.MouseDown, this);

	    	lblServiceInterfaceClass = new Label(composite, SWT.NONE);
	    	lblServiceInterfaceClass.setText("Class");
	    	txtServiceInterfaceClass = new Text(composite, SWT.BORDER);
	    	txtServiceInterfaceClass.setLayoutData(gridData);
	    	txtServiceInterfaceClass.addListener(SWT.CHANGED, this);
	    	new Label(composite, SWT.NONE);
	        createSeparator(composite, nColumns);
	        
	        createSuperInterfacesControls(composite, nColumns);
	        createSeparator(composite, nColumns);

	        // Create the checkbox controlling whether we want stubs
	        fCreateStubs= new Button(composite, SWT.CHECK);
	        fCreateStubs.setText("Add sample webservice method to new class");
	        fCreateStubs.setSelection(true);
	       
	        fCreateStubs.setLayoutData(gd);

	        setControl(composite);
	        setSuperClass("java.lang.Object", true);
			
	    }

	    protected void createTypeMembers(IType newType, ImportsManager imports, IProgressMonitor monitor) throws CoreException {
	    
	    	createInheritedMethods(newType, true,true, imports, monitor);
	    	if (fCreateStubs.getSelection()) {
//	    		StringBuffer buffer = new StringBuffer();
//	    		buffer.append("/** This is a sample web service operation */\n");
//	    		buffer.append("@" + imports.addImport("javax.jws.WebMethod") + "(operationName = \"hello\")\n");
//	    		buffer.append("@override\npublic String hello(@" + imports.addImport("javax.jws.WebParam") + "(name = \"name\") String txt) {\n");
//	    		buffer.append("return \"Hello \" + txt + \" !\";\n");
//	    		buffer.append("}");
//	            newType.createMethod(buffer.toString(), null, false, null);

	        }
	   }
	    
	    public boolean isCreateStubs(){
	    	return fCreateStubs.getSelection();
	    }

		@Override
		public void handleEvent(Event event) {
			if(btnServiceInterfacePkg== event.widget){
				IPackageFragment choosePackage = choosePackage();
				txtServiceInterfacePkg.setText(choosePackage.getElementName());
			} else if(txtServiceInterfaceClass== event.widget || txtServiceInterfacePkg== event.widget){
				setIfClass(txtServiceInterfaceClass.getText());
				setIfPkg(txtServiceInterfacePkg.getText());
				doStatusUpdate();
			} 
		}

		public void setIfClass(String ifClass) {
			this.ifClass = ifClass;
		}

		public String getIfClass() {
			return ifClass;
		}

		public void setIfPkg(String ifPkg) {
			this.ifPkg = ifPkg;
		}

		public String getIfPkg() {
			return ifPkg;
		}
	   
}
