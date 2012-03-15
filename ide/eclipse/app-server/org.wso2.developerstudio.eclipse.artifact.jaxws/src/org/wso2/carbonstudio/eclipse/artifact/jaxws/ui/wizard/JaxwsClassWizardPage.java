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

package org.wso2.carbonstudio.eclipse.artifact.jaxws.ui.wizard;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.ui.wizards.NewTypeWizardPage;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;

public class JaxwsClassWizardPage extends NewTypeWizardPage {
	
	  public JaxwsClassWizardPage(IWorkbench workbench,IStructuredSelection selection) {
		super(true, "Create new JAX-WS class");
	}

	private Button fCreateStubs;

	    public void init(IStructuredSelection selection) {
	    	setTitle("Create new JAX-WS class");
	        IJavaElement jelem= getInitialJavaElement(selection);
	        initContainerPage(jelem);
	        initTypePage(jelem);
	        doStatusUpdate();
	    }

	    private void doStatusUpdate() {
	    	final String pkgName = getPackageText();
	    	IStatus pkgStatus = new IStatus() {
				
				public boolean matches(int arg) {
					if(pkgName.trim().isEmpty()) {
						return true;
					}
					return fPackageStatus.matches(arg);
				}
				
				public boolean isOK() {
					if(pkgName.trim().isEmpty()) {
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

	        // Create the standard input fields
	        createContainerControls(composite, nColumns);
	        createPackageControls(composite, nColumns);
	        createSeparator(composite, nColumns);
	        createTypeNameControls(composite, nColumns);
	        createSuperClassControls(composite, nColumns);
	        createSuperInterfacesControls(composite, nColumns);
	        createSeparator(composite, nColumns);

	        // Create the checkbox controlling whether we want stubs
	        fCreateStubs= new Button(composite, SWT.CHECK);
	        fCreateStubs.setText("Add sample webservice method to new class");
	        fCreateStubs.setSelection(true);
	        GridData gd= new GridData();
	        gd.horizontalSpan= nColumns;
	        fCreateStubs.setLayoutData(gd);

	        setControl(composite);
	        setSuperClass("java.lang.Object", true);
			
	    }

	    protected void createTypeMembers(IType newType, ImportsManager imports, IProgressMonitor monitor) throws CoreException {
	    	if (fCreateStubs.getSelection()) {
	    		StringBuffer buffer = new StringBuffer();
	    		buffer.append("/** This is a sample web service operation */\n");
	    		buffer.append("@" + imports.addImport("javax.jws.WebMethod") + "(operationName = \"hello\")\n");
	    		buffer.append("public String hello(@" + imports.addImport("javax.jws.WebParam") + "(name = \"name\") String txt) {\n");
	    		buffer.append("return \"Hello \" + txt + \" !\";\n");
	    		buffer.append("}");
	            newType.createMethod(buffer.toString(), null, false, null);

	        }
	   }
	   

	
}
