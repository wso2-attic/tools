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

import java.util.Iterator;
import java.util.List;

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
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.part.ViewPart;
import org.wso2.developerstudio.appfactory.core.model.AppVersionInfo;
import org.wso2.developerstudio.appfactory.core.model.ApplicationInfo;
import org.wso2.developerstudio.appfactory.ui.Activator;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;


public class AppfactoryApplicationDetailsView extends ViewPart {
	
	public static final String ID = "org.wso2.developerstudio.appfactory.ui.views.AppfactoryView";
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	
	private Composite composite;
	
	private Label lblApplicationType;
	private Label lblRepositoryType;
	private Label lblApplicationOwner;
	private Label lblDescription;
	private Label lblVersion;
	private Label lblRepoURL;
	private Table table;
	private Composite ownerComposite;
	private Composite developercomposite;
	private Composite datasourcescomposite;
	private Composite databasescomposite;
	private Composite apicomposite;
	private Composite propertiescomposite;
	
	
	public AppfactoryApplicationDetailsView() {
		AppfactoryApplicationListView.setAppDetailView(this);
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
//			lbl.setLayoutData(layoutData);
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
		ScrolledComposite sc =
		                       new ScrolledComposite(parent, SWT.H_SCROLL | SWT.V_SCROLL |
		                                                     SWT.BORDER);
		sc.setExpandVertical(true);
		composite = new Composite(sc, SWT.NONE);

		GridLayout gridLayout = new GridLayout(2, false);
		composite.setLayout(gridLayout);
		composite.setSize(750, 1500);
		sc.setContent(composite);
		sc.setMinSize(composite.computeSize(750, 1500));

		String[] names =
		                 new String[] { "Application Type: ", "Repository Type: ",
		                               "Application Owner: ", "Description: ", "Version: ",
		                               "Repository URL: " };

		generateControls(composite, names);
		
	}
	
	protected void generateControls(Composite composite, String[] names) {
		createLabel(composite, SWT.NONE, names[0],
		            new GridData(), composite.getBackground(), new Font(null,
		                                                                "", 8, SWT.BOLD));
		lblApplicationType=createLabel(composite, SWT.NONE, "",
		                               new GridData(), composite.getBackground(),null);
		
	    createLabel(composite, SWT.NONE, names[1],
		        					new GridData(), composite.getBackground(), new Font(null,
		        							"", 8, SWT.BOLD));
		lblRepositoryType=createLabel(composite, SWT.NONE, "",
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
		
		//Adding a table for versions and reposiroty urls
		createLabel(composite, SWT.NONE, "",
					new GridData(SWT.None), composite.getBackground(), new Font(null,
							"", 8, SWT.BOLD));
		
		table = new Table (composite, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		table.setLinesVisible (true);
		table.setHeaderVisible (true);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, false);
		table.setLayoutData(data);
		
		String[] titles = {"Version","Last Build Status", "Repository"};
		for (int i=0; i<titles.length; i++) {
			TableColumn column = new TableColumn (table, SWT.BOLD);
			column.setText (titles [i]);
			column.pack();
		}	
		
		
		//End of table
		
//		createLabel(composite, SWT.NONE, names[4],
//					new GridData(), composite.getBackground(), new Font(null,
//							"", 8, SWT.BOLD));
//		lblVersion=createLabel(composite, SWT.NONE, "",
//                              getGridData(), composite.getBackground(), null);
//		
//		// Repository Header
//		createLabel(composite, SWT.NONE, "Repository", new GridData(),
//		            composite.getBackground(), new Font(null, "", 14, SWT.BOLD));
//		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
//		            new Font(null, "", 8, SWT.BOLD));
//		
//		
//		createLabel(composite, SWT.NONE, names[5],
//					new GridData(), composite.getBackground(), new Font(null,
//							"", 8, SWT.BOLD));
//		lblRepoURL=createLabel(composite, SWT.NONE, "jjjjjjjjjjjjjjjjjjjjjjjj",
//		                       new GridData(), composite.getBackground(), null);
		
		// Team Header
		createCompositeLabel(composite, "Team");
		
		// App owner Header
		createCompositeLabel(composite, "App Owner");
		
		//Get app owner list here and iteratively show them
		ownerComposite = new Composite(composite, SWT.NONE);
		GridLayout gridLayout1 = new GridLayout(1, false);
		gridLayout1.marginWidth = 20;
		ownerComposite.setLayout(gridLayout1);
		
		
		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
		            new Font(null, "", 8, SWT.BOLD));
		 
		// App Developer Header
		createCompositeLabel(composite, "App Developer");
		
		// Get app developer list here and iteratively show them
		developercomposite = new Composite(composite, SWT.NONE);
		GridLayout gridLayout2 = new GridLayout(1, false);
		gridLayout2.marginWidth = 20;
		developercomposite.setLayout(gridLayout2);
		
		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
		            new Font(null, "", 8, SWT.BOLD));
		
		// Resources Header
		createCompositeLabel(composite, "Resources");
		
		// Data Sources Header
		createCompositeLabel(composite, "Data Sources");

		// Get Data Sources list here and iteratively show them
		datasourcescomposite = new Composite(composite, SWT.NONE);
		GridLayout gridLayout3 = new GridLayout(1, false);
		gridLayout3.marginWidth = 20;
		datasourcescomposite.setLayout(gridLayout3);
		
		
		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
		            new Font(null, "", 8, SWT.BOLD));
		
		// Data bases Header
		createCompositeLabel(composite, "Databases");

		// Get Data Sources list here and iteratively show them
		databasescomposite = new Composite(composite, SWT.NONE);
		GridLayout gridLayout4 = new GridLayout(1, false);
		gridLayout4.marginWidth = 20;
		databasescomposite.setLayout(gridLayout4);

		
		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
		            new Font(null, "", 8, SWT.BOLD));
		
		// APIs Header
		createCompositeLabel(composite, "APIs");

		// Get Data Sources list here and iteratively show them
		apicomposite = new Composite(composite, SWT.NONE);
		GridLayout gridLayout5 = new GridLayout(1, false);
		gridLayout5.marginWidth = 20;
		apicomposite.setLayout(gridLayout5);

		
		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
		            new Font(null, "", 8, SWT.BOLD));
		
		// Properties Header
		createCompositeLabel(composite,"Properties");

		// Get Data Sources list here and iteratively show them
		propertiescomposite = new Composite(composite, SWT.NONE);
		GridLayout gridLayout6 = new GridLayout(1, false);
		gridLayout6.marginWidth = 20;
		propertiescomposite.setLayout(gridLayout6);

		
		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
		            new Font(null, "", 8, SWT.BOLD));
	}

	/**
	 * @param composite
	 */
    private void createCompositeLabel(Composite composite, String label) {
	    createLabel(composite, SWT.NONE,label , new GridData(), composite.getBackground(),
		            new Font(null, "", 11, SWT.BOLD));
		createLabel(composite, SWT.NONE, "", new GridData(), composite.getBackground(),
		            new Font(null, "", 8, SWT.BOLD));
    }
	
	public void updateView(ApplicationInfo applicationInfo){
		lblApplicationType.setText(applicationInfo.getType());
		lblRepositoryType.setText(applicationInfo.getRepositoryType());
		lblApplicationOwner.setText(applicationInfo.getApplicationOwner());
		lblDescription.setText(applicationInfo.getDescription());
		
		//Updating the version info table
		
		//Remove existing
		table.removeAll();
		
		//Add new
		List<AppVersionInfo> version = applicationInfo.getVersion();
		for (AppVersionInfo appVersionInfo : version) {
			TableItem item = new TableItem (table, SWT.NONE);
			item.setText(0, appVersionInfo.getVersion());
			item.setText(1, appVersionInfo.getLastBuildResult());
			item.setText(2, appVersionInfo.getRepoURL());
        }
		
		//Pack the new one to table
		for (int i=0; i<table.getItemCount(); i++) {
			table.getColumn(i).pack ();
		}	

		// test owners
		removeChildControls(ownerComposite);

		createLabel(ownerComposite, SWT.NONE, applicationInfo.getApplicationOwner(), getGridData(),
		            composite.getBackground(), null);

		ownerComposite.layout(true);

		// test developers
		removeChildControls(developercomposite);

		for (String string : applicationInfo.getApplicationDevelopers()) {
			createLabel(developercomposite, SWT.NONE, string, getGridData(),
			            composite.getBackground(), null);
		}
		developercomposite.layout(true);

		// test data sources
		removeChildControls(datasourcescomposite);

		for (String string : applicationInfo.getDatasources()) {
			createLabel(datasourcescomposite, SWT.NONE, string, getGridData(),
			            composite.getBackground(), null);
		}
		datasourcescomposite.layout(true);

		// test data bases
		removeChildControls(databasescomposite);

		for (String string : applicationInfo.getDatabases()) {
			createLabel(databasescomposite, SWT.NONE, string, getGridData(),
			            composite.getBackground(), null);
		}
		databasescomposite.layout(true);

		// test apis
		removeChildControls(apicomposite);
		for (String string : applicationInfo.getApis()) {
			createLabel(apicomposite, SWT.NONE, string, getGridData(), composite.getBackground(),
			            null);
		}
		apicomposite.layout(true);

		// test properties
		removeChildControls(propertiescomposite);

		for (String string : applicationInfo.getProperties()) {
			createLabel(propertiescomposite, SWT.NONE, string, getGridData(),
			            composite.getBackground(), null);
		}
		propertiescomposite.layout(true);

		composite.layout(true);
	}

	private void removeChildControls(Composite composite) {
	    Control[] children = composite.getChildren();
		
		for (Control control : children) {
	        control.dispose();
        }
    }
 
	@Override
	public void setFocus() {
		//Testing only
//		updateView();
	}
	
}