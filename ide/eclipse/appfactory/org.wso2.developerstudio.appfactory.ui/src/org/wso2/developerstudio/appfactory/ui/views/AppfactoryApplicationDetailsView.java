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
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.internal.cde.DtActionArg;
import org.eclipse.swt.layout.FillLayout;
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
	
	private Label lblApplicationType;
	private Label lblRepositoryType;
	private Label lblApplicationOwner;
	private Label lblDescription;
	private Label lblVersion;
	private Label lblRepoType;
	private Label lblRepoURL;
	private Composite ownerComposite;
	private Composite developercomposite;
	private Composite datasourcescomposite;
	private Composite databasescomposite;
	private Composite apicomposite;
	private Composite propertiescomposite;
	
	
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
		ScrolledComposite sc=new ScrolledComposite(parent, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		sc.setExpandVertical(true);
//		sc.setExpandHorizontal(true);
//		sc.setLayoutData(new GridData(GridData.FILL_BOTH));
		Composite composite = new Composite(sc, SWT.NONE);
		
		 GridLayout gridLayout = new GridLayout(2, false);
		 gridLayout.marginWidth=20;
		composite.setLayout(gridLayout);
		         composite.setSize(1200,1200);
		         sc.setContent(composite);
//		     sc.setExpandHorizontal(true);
//		     sc.setExpandVertical(true);
		      sc.setMinSize(composite.computeSize(200, 200));
		
//		sc.setContent(composite);
//		sc.setMinHeight(5);
//		GridLayout gridLayout = new GridLayout(2, false);
//		gridLayout.marginWidth = 20;
//		composite.setLayout(gridLayout);
		
		String[] names = new String[] { "Application Type: ", "Repository Type: ","Application Owner: ","Description: ","Version: ",
		                                "Repository URL: "};
		
		generateControls(composite, names);
		
	}
	
	protected void generateControls(Composite composite, String[] names) {
		createLabel(composite, SWT.NONE, names[0],
		            new GridData(), composite.getBackground(), new Font(null,
		                                                                "", 8, SWT.BOLD));
		lblApplicationType=createLabel(composite, SWT.NONE, "bbbbbbbbbbbbbbbbbbbbbb",
		                               new GridData(), composite.getBackground(),new Font(null,
		                                                                                  "", 8, SWT.BOLD));
		
	    createLabel(composite, SWT.NONE, names[1],
		        					new GridData(), composite.getBackground(), new Font(null,
		        							"", 8, SWT.BOLD));
		lblRepositoryType=createLabel(composite, SWT.NONE, "admin@admin.com",
		                                      getGridData(), composite.getBackground(), null);
		
	    createLabel(composite, SWT.NONE, names[2],
		        					new GridData(), composite.getBackground(), new Font(null,
		        							"", 8, SWT.BOLD));
		lblApplicationOwner=createLabel(composite, SWT.NONE, "",
		                                      getGridData(), composite.getBackground(), null);
		
	    createLabel(composite, SWT.NONE, names[3],
		        					new GridData(), composite.getBackground(), new Font(null,
		        							"", 8, SWT.BOLD));
		lblDescription=createLabel(composite, SWT.NONE, "",
		                                      getGridData(), composite.getBackground(), null);
		
		//Current Status Header
		createLabel(composite,SWT.NONE, "Current Status",
		        					new GridData(), composite.getBackground(), new Font(null,
		        							"", 14, SWT.BOLD));
		createLabel(composite,SWT.NONE, "",
					new GridData(), composite.getBackground(), new Font(null,
							"", 8, SWT.BOLD));
		createLabel(composite, SWT.NONE, names[4],
					new GridData(), composite.getBackground(), new Font(null,
							"", 8, SWT.BOLD));
		lblVersion=createLabel(composite, SWT.NONE, "",
                              getGridData(), composite.getBackground(), null);
		
		// Repository Header
		createLabel(composite, SWT.NONE, "Repository", new GridData(),
		            composite.getBackground(), new Font(null, "", 14, SWT.BOLD));
		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
		            new Font(null, "", 8, SWT.BOLD));
		
		
		createLabel(composite, SWT.NONE, names[5],
					new GridData(), composite.getBackground(), new Font(null,
							"", 8, SWT.BOLD));
		lblRepoURL=createLabel(composite, SWT.NONE, "https://appfactorypreview.wso2.com:8443/git/testApplication.git",
		                       new GridData(), composite.getBackground(), null);
		
		// Team Header
		createLabel(composite, SWT.NONE, "Team", new GridData(), composite.getBackground(),
		            new Font(null, "", 14, SWT.BOLD));
		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
		            new Font(null, "", 8, SWT.BOLD));
		
		// App owner Header
		createLabel(composite, SWT.NONE, "App Owner", new GridData(), composite.getBackground(),
		            new Font(null, "", 11, SWT.BOLD));
		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
		            new Font(null, "", 8, SWT.BOLD));
		
		//Get app owner list here and iteratively show them
		ownerComposite = new Composite(composite, SWT.NONE);
		GridLayout gridLayout1 = new GridLayout(1, false);
		gridLayout1.marginWidth = 20;
		ownerComposite.setLayout(gridLayout1);
		
		//test owners
		createLabel(ownerComposite, SWT.NONE, "harshana@wso2.com",
                    getGridData(), composite.getBackground(), null);
		createLabel(ownerComposite, SWT.NONE, "harshana05@gmail.com",
                    getGridData(), composite.getBackground(), null);
		
		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
		            new Font(null, "", 8, SWT.BOLD));
		 
		// App Developer Header
		createLabel(composite, SWT.NONE, "App Developer", new GridData(),
		            composite.getBackground(), new Font(null, "", 11, SWT.BOLD));
		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
		            new Font(null, "", 8, SWT.BOLD));
		
		// Get app developer list here and iteratively show them
		developercomposite = new Composite(composite, SWT.NONE);
		GridLayout gridLayout2 = new GridLayout(1, false);
		gridLayout2.marginWidth = 20;
		developercomposite.setLayout(gridLayout2);
		
		// test developers
		createLabel(developercomposite, SWT.NONE, "harshana@wso2.com",
                    getGridData(), composite.getBackground(), null);
		createLabel(developercomposite, SWT.NONE, "harshana05@gmail.com",
                    getGridData(), composite.getBackground(), null);

		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
		            new Font(null, "", 8, SWT.BOLD));
		
		// Resources Header
		createLabel(composite, SWT.NONE, "Resources", new GridData(), composite.getBackground(),
		            new Font(null, "", 14, SWT.BOLD));
		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
		            new Font(null, "", 8, SWT.BOLD));
		
		// Data Sources Header
		createLabel(composite, SWT.NONE, "Data Sources", new GridData(), composite.getBackground(),
		            new Font(null, "", 11, SWT.BOLD));
		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
		            new Font(null, "", 8, SWT.BOLD));

		// Get Data Sources list here and iteratively show them
		datasourcescomposite = new Composite(composite, SWT.NONE);
		GridLayout gridLayout3 = new GridLayout(1, false);
		gridLayout3.marginWidth = 20;
		datasourcescomposite.setLayout(gridLayout3);
		
		// test datasources
		createLabel(datasourcescomposite, SWT.NONE, "SimpleDatasource 1", getGridData(),
		            composite.getBackground(), null);
		createLabel(datasourcescomposite, SWT.NONE, "SimpleDatasource 2", getGridData(),
		            composite.getBackground(), null);
		
		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
		            new Font(null, "", 8, SWT.BOLD));
		
		// Data bases Header
		createLabel(composite, SWT.NONE, "Databases", new GridData(), composite.getBackground(),
		            new Font(null, "", 11, SWT.BOLD));
		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
		            new Font(null, "", 8, SWT.BOLD));

		// Get Data Sources list here and iteratively show them
		databasescomposite = new Composite(composite, SWT.NONE);
		GridLayout gridLayout4 = new GridLayout(1, false);
		gridLayout4.marginWidth = 20;
		databasescomposite.setLayout(gridLayout4);

		// test datasources
		createLabel(databasescomposite, SWT.NONE, "Simplebase 1", getGridData(),
		            composite.getBackground(), null);
		createLabel(databasescomposite, SWT.NONE, "Simplebase 2", getGridData(),
		            composite.getBackground(), null);
		
		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
		            new Font(null, "", 8, SWT.BOLD));
		
		// APIs Header
		createLabel(composite, SWT.NONE, "APIs", new GridData(), composite.getBackground(),
		            new Font(null, "", 11, SWT.BOLD));
		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
		            new Font(null, "", 8, SWT.BOLD));

		// Get Data Sources list here and iteratively show them
		apicomposite = new Composite(composite, SWT.NONE);
		GridLayout gridLayout5 = new GridLayout(1, false);
		gridLayout5.marginWidth = 20;
		apicomposite.setLayout(gridLayout5);

		// test datasources
		createLabel(apicomposite, SWT.NONE, "API 1", getGridData(), composite.getBackground(), null);
		createLabel(apicomposite, SWT.NONE, "API 2", getGridData(), composite.getBackground(), null);
		
		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
		            new Font(null, "", 8, SWT.BOLD));
		
		// Properties Header
		createLabel(composite, SWT.NONE, "Properties", new GridData(), composite.getBackground(),
		            new Font(null, "", 11, SWT.BOLD));
		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
		            new Font(null, "", 8, SWT.BOLD));

		// Get Data Sources list here and iteratively show them
		propertiescomposite = new Composite(composite, SWT.NONE);
		GridLayout gridLayout6 = new GridLayout(1, false);
		gridLayout6.marginWidth = 20;
		propertiescomposite.setLayout(gridLayout6);

		// test datasources
		createLabel(propertiescomposite, SWT.NONE, "Property 1", getGridData(), composite.getBackground(), null);
		createLabel(propertiescomposite, SWT.NONE, "Property 2", getGridData(), composite.getBackground(), null);
		
		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
		            new Font(null, "", 8, SWT.BOLD));
	}
 
	@Override
	public void setFocus() {
		//tblApplication.forceFocus();
		
	}
	
}