/*
 * Copyright (c) 2013, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.security.ui.dialog;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;


/**
 *
 */
public class ApplyServiceSecurityDialog extends org.eclipse.jface.dialogs.Dialog{

	/**
	 * @param parentShell
	 */
    public ApplyServiceSecurityDialog(Shell parentShell) {
	    super(parentShell);
    }
    
    /* (non-Javadoc)
     * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets.Composite)
     */
    @Override
    protected Control createDialogArea(Composite parent) {
    	Composite container = (Composite) super.createDialogArea(parent);
    	
    	
    	 Composite composite = new Composite(container, SWT.BORDER);
    	  GridData  gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
    	    gridData.horizontalSpan = 2;
    	    composite.setLayoutData(gridData);
    	    composite.setLayout(new GridLayout(1, false));
    	
        Button button = new Button(composite, SWT.PUSH);
        button.setLayoutData(gridData);
        button.setText("Press me");
        button.addSelectionListener(new SelectionAdapter() {
          @Override
          public void widgetSelected(SelectionEvent e) {
            System.out.println("Pressed Top");
          }
        });
        
     	 Composite composite1 = new Composite(container, SWT.BORDER);
   	  GridData  gridData1 = new GridData(SWT.FILL, SWT.FILL, true, false);
   	    gridData1.horizontalSpan = 2;
   	    composite1.setLayoutData(gridData1);
   	    composite1.setLayout(new GridLayout(1, false));
   	
       Button button1 = new Button(composite1, SWT.PUSH);
       button1.setLayoutData(gridData1);
       button1.setText("Press me");
       button1.addSelectionListener(new SelectionAdapter() {
         @Override
         public void widgetSelected(SelectionEvent e) {
           System.out.println("Pressed Bottom");
         }
       });

        return container;
    }

}
