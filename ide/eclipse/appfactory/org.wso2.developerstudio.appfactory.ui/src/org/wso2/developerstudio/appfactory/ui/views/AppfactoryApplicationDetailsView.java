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

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;
import org.wso2.developerstudio.appfactory.ui.Activator;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;


public class AppfactoryApplicationDetailsView extends ViewPart {
	
	public static final String ID = "org.wso2.developerstudio.appfactory.ui.views.AppfactoryView";
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	
	private Label lblValue1;
	private Label lblValue2;
	private Label lblValue3;
	private Label lblValue4;
	private Label lblValue5;
	
	public AppfactoryApplicationDetailsView() {
	}
	
	public static Label createLabel(Composite parent, 
									int style, 
									String text,
									Object layoutData, 
									Color backColor, 
									Font font) {
		Label lbl = new Label(parent, style);
		if (font != null){
			lbl.setFont(font);
		}
		if (backColor != null){
			lbl.setBackground(backColor);
		}
		lbl.setText(text);
		if (layoutData != null){
			lbl.setLayoutData(layoutData);
		}
		return lbl;
	}
	
	private GridData getGridData(){
		GridData gd=new GridData();
		gd.minimumWidth=50;
		gd.widthHint=GridData.FILL_HORIZONTAL;
		gd.grabExcessHorizontalSpace=true;
		return gd;
	}

	public void createPartControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout gridLayout = new GridLayout(2, false);
		gridLayout.marginWidth = 20;
		composite.setLayout(gridLayout);
		
		String[] names = new String[] { "Application Type: ", "Repository Type: ","Application Owner: ","Description: ","Version: "};
		
		generateControls(composite, names);
		
	}
	
	protected void generateControls(Composite composite, String[] names) {
	    createLabel(composite, SWT.NONE, names[0],
		        					new GridData(), composite.getBackground(), new Font(null,
		        							"", 8, SWT.BOLD));
		lblValue1=createLabel(composite, SWT.NONE, "",
		                  					getGridData(), composite.getBackground(), null);
		
	    createLabel(composite, SWT.NONE, names[1],
		        					new GridData(), composite.getBackground(), new Font(null,
		        							"", 8, SWT.BOLD));
		lblValue2=createLabel(composite, SWT.NONE, "",
		                                      getGridData(), composite.getBackground(), null);
		
	    createLabel(composite, SWT.NONE, names[2],
		        					new GridData(), composite.getBackground(), new Font(null,
		        							"", 8, SWT.BOLD));
		lblValue3=createLabel(composite, SWT.NONE, "",
		                                      getGridData(), composite.getBackground(), null);
		
	    createLabel(composite, SWT.NONE, names[3],
		        					new GridData(), composite.getBackground(), new Font(null,
		        							"", 8, SWT.BOLD));
		lblValue4=createLabel(composite, SWT.NONE, "",
		                                      getGridData(), composite.getBackground(), null);
		
		createLabel(composite,SWT.NONE, "Current Status",
		        					new GridData(), composite.getBackground(), new Font(null,
		        							"", 14, SWT.BOLD));
		createLabel(composite,SWT.NONE, "",
					new GridData(), composite.getBackground(), new Font(null,
							"", 8, SWT.BOLD));
		createLabel(composite, SWT.NONE, names[4],
					new GridData(), composite.getBackground(), new Font(null,
							"", 8, SWT.BOLD));
		lblValue5=createLabel(composite, SWT.NONE, "",
                              getGridData(), composite.getBackground(), null);
	}
 
	@Override
	public void setFocus() {
		//tblApplication.forceFocus();
		
	}
	
}