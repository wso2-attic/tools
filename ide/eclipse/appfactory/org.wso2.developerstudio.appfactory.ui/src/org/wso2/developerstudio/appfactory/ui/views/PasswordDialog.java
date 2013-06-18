/*
 * Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.appfactory.ui.views;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;

public class PasswordDialog extends Dialog {
  private Text userText;
  private Text passwordText;
  private Text hostText;
  private String user;
  private String password;
  private String host;

  
/** * Create the dialog. * * @param parentShell */

  public PasswordDialog(Shell parentShell) {
    super(parentShell);
  }

  
/** * Create contents of the dialog. * * @param parent */

  @Override
  protected Control createDialogArea(Composite parent) {
    Composite container = (Composite) super.createDialogArea(parent);
    GridLayout gl_container = new GridLayout(2, false);
    gl_container.marginRight = 5;
    gl_container.marginLeft = 10;
    container.setLayout(gl_container);

    Label lblHost = new Label(container, SWT.NONE);
    lblHost.setText("AppFactory Url:");

    hostText = new Text(container, SWT.BORDER);
    hostText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
        1, 1));
    hostText.setText(host);
    
    Label lblUser = new Label(container, SWT.NONE);
    lblUser.setText("User:");

    userText = new Text(container, SWT.BORDER);
    userText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
        1, 1));
    userText.setText(user);

    Label lblNewLabel = new Label(container, SWT.NONE);
    GridData gd_lblNewLabel = new GridData(SWT.LEFT, SWT.CENTER, false,
        false, 1, 1);
    gd_lblNewLabel.horizontalIndent = 1;
    lblNewLabel.setLayoutData(gd_lblNewLabel);
    lblNewLabel.setText("Password:");

    passwordText = new Text(container, SWT.PASSWORD);
    passwordText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
        false, 1, 1));
    passwordText.setText(password);
    return container;
  }

  
/** * Create contents of the button bar. * * @param parent */

  @Override
  protected void createButtonsForButtonBar(Composite parent) {
    createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
        true);
    createButton(parent, IDialogConstants.CANCEL_ID,
        IDialogConstants.CANCEL_LABEL, false);
  }

  
/** * Return the initial size of the dialog. */

  @Override
  protected Point getInitialSize() {
    return new Point(450, 250);
  }

  @Override
  protected void okPressed() {
    user = userText.getText();
    password = passwordText.getText();
    host =hostText.getText().trim();
    if(!host.contains("https://")){
    	host = "https://"+host;
    }
    super.okPressed();
  }

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


public String getHost() {
	return host;
}


public void setHost(String host) {
	this.host = host;
}
}