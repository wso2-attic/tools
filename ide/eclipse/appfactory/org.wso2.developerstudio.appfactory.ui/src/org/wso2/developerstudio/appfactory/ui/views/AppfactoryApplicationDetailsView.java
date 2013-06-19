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

import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
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
	private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);
	private static final String APPINFO_TAB_ITEM_NAME = "Application Info";
	private static final String CURRENT_STATUS_TAB_ITEM_NAME = "Current Status";
	private static final String TEAM_TAB_ITEM_NAME = "Team Details";
	private static final String DEFAULT_VALUE = "Not Available";

	private Table table;
	private Composite ownerComposite;
	private Composite developercomposite;
	private Composite resourceComposite;
	private Composite datasourcescomposite;
	private Composite databasescomposite;
	private Composite apicomposite;
	private Composite propertiescomposite;
	private Composite appTypeComposite;
	private Composite repoTypeComposite;
	private Composite appOwnerComposite;
	private Composite descriptionComposite;
	private TabFolder tabFolder;
	private TabItem appInfoTabItem;
	private TabItem currentStatusTabItem;
	private TabItem teamTabItem;

	public AppfactoryApplicationDetailsView() {
		AppfactoryApplicationListView.setAppDetailView(this);
	}

	public static Label createLabel(Composite parent, int style, String text, Object layoutData,
			Color backColor, Font font) {
		Label lbl = new Label(parent, style);
		if (font != null) {
			lbl.setFont(font);
		}
		if (backColor != null) {
			lbl.setBackground(backColor);
		}
		lbl.setText(text);
		if (layoutData != null) {
			// lbl.setLayoutData(layoutData);
		}
		return lbl;
	}

	private GridData getGridData() {
		GridData gd = new GridData();
		gd.minimumWidth = 50;
		gd.widthHint = GridData.FILL_HORIZONTAL;
		gd.grabExcessHorizontalSpace = true;
		return gd;
	}

	public void createPartControl(Composite parent) {
		tabFolder = new TabFolder(parent, SWT.BORDER);
		tabFolder.setBackground(tabFolder.getDisplay().getSystemColor(SWT.COLOR_WHITE));

		createTabPages();

		 /*tabFolder.addSelectionListener(new SelectionListener() {
		 
		 public void widgetDefaultSelected(SelectionEvent arg0) {
		 updatePageContent(); }
		  
		 public void widgetSelected(SelectionEvent arg0) {
		 updatePageContent(); }
		 
		 });*/
	}

	/**
	 * @param composite
	 */
	private void createCompositeLabel(Composite composite, String label) {
		createLabel(composite, SWT.NONE, label, new GridData(), composite.getBackground(),
				new Font(null, "", 11, SWT.BOLD));
	}

	public void updateView(ApplicationInfo applicationInfo) {
		// Updating the Application info
		updateAppInfo(applicationInfo);

		// Updating the version info table
		updateCurrentStatus(applicationInfo);

		// Updating the team details
		updateTeamDetails(applicationInfo);
	}

	private void removeChildControls(Composite composite) {
		Control[] children = composite.getChildren();

		for (Control control : children) {
			control.dispose();
		}
	}

	@Override
	public void setFocus() {

		// Testing only
		// updateView();
	}

	/**
	 * Create tabs
	 */
	private void createTabPages() {
		appInfoTabItem = new TabItem(tabFolder, SWT.NULL);
		appInfoTabItem.setText(APPINFO_TAB_ITEM_NAME);

		currentStatusTabItem = new TabItem(tabFolder, SWT.NULL);
		currentStatusTabItem.setText(CURRENT_STATUS_TAB_ITEM_NAME);

		teamTabItem = new TabItem(tabFolder, SWT.NULL);
		teamTabItem.setText(TEAM_TAB_ITEM_NAME);

		createAppInfoPage();
		createCurrentStatusPage();
		createTeamDetailsPage();
	}

	/**
	 * Update page content on based on the selected tab
	 */
	private void updatePageContent() {
		int selectionIndex = tabFolder.getSelectionIndex();
		TabItem item = tabFolder.getItem(selectionIndex);

		if (item == appInfoTabItem) {
			// App Info tab
		} else if (item == currentStatusTabItem) {
			// Current Status tab
		} else if (item == teamTabItem) {
			// Team tab
		}
	}

	/**
	 * Create application information tab page
	 */
	private void createAppInfoPage() {
		ScrolledComposite scroller = new ScrolledComposite(tabFolder, SWT.BORDER | SWT.V_SCROLL
				| SWT.H_SCROLL);
		scroller.setBackground(tabFolder.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		//scroller.setExpandVertical(true);
		scroller.setExpandHorizontal(true);
		Composite composite = new Composite(scroller, SWT.NULL);
		composite.setLayout(new FillLayout(SWT.VERTICAL));
		composite.setBackground(tabFolder.getBackground());
		scroller.setContent(composite);
		scroller.setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		String[] names = new String[] { "Application Type", "Repository Type",
				"Application Owner", "Description", "Version", "Repository URL" };

		createLabel(composite, SWT.NONE, "", new GridData(), scroller.getBackground(), new Font(
				null, "", 15, SWT.BOLD));
		
		createCompositeLabel(composite, names[0]);
		appTypeComposite = new Composite(composite, SWT.NONE);
		appTypeComposite.setBackground(tabFolder.getBackground());
		GridLayout appTypeGridLayout = new GridLayout(1, false);
		appTypeGridLayout.marginWidth = 20;
		appTypeComposite.setLayout(appTypeGridLayout);
		
		createLabel(composite, SWT.NONE, "", new GridData(), scroller.getBackground(), new Font(
				null, "", 15, SWT.BOLD));

		createCompositeLabel(composite, names[1]);
		repoTypeComposite = new Composite(composite, SWT.NONE);
		repoTypeComposite.setBackground(tabFolder.getBackground());
		GridLayout repoTypeGridLayout = new GridLayout(1, false);
		repoTypeGridLayout.marginWidth = 20;
		repoTypeComposite.setLayout(repoTypeGridLayout);
		
		createLabel(composite, SWT.NONE, "", new GridData(), scroller.getBackground(), new Font(
				null, "", 15, SWT.BOLD));

		createCompositeLabel(composite, names[2]);
		appOwnerComposite = new Composite(composite, SWT.NONE);
		appOwnerComposite.setBackground(tabFolder.getBackground());
		GridLayout appOwnerGridLayout = new GridLayout(1, false);
		appOwnerGridLayout.marginWidth = 20;
		appOwnerComposite.setLayout(appOwnerGridLayout);
		
		createLabel(composite, SWT.NONE, "", new GridData(), scroller.getBackground(), new Font(
				null, "", 15, SWT.BOLD));
		
		createCompositeLabel(composite, names[3]);
		descriptionComposite = new Composite(composite, SWT.NONE);
		descriptionComposite.setBackground(tabFolder.getBackground());
		GridLayout descriptionGridLayout = new GridLayout(1, false);
		descriptionGridLayout.marginWidth = 20;
		descriptionComposite.setLayout(descriptionGridLayout);
		
		createLabel(composite, SWT.NONE, "", new GridData(), scroller.getBackground(), new Font(
				null, "", 15, SWT.BOLD));

		appInfoTabItem.setControl(scroller);
		composite.pack();
	}

	/**
	 * Create current status tab page
	 */
	private void createCurrentStatusPage() {
		ScrolledComposite scroller = new ScrolledComposite(tabFolder, SWT.BORDER | SWT.V_SCROLL
				| SWT.H_SCROLL);
		scroller.setBackground(tabFolder.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		scroller.setExpandVertical(true);
		scroller.setExpandHorizontal(true);
		Composite composite = new Composite(scroller, SWT.NULL);
		composite.setLayout(new FillLayout(SWT.VERTICAL));
		scroller.setContent(composite);
		scroller.setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		table = new Table(composite, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, false);
		table.setLayoutData(data);

		String[] titles = { "Version", "Last Build Status", "Repository" };
		for (int i = 0; i < titles.length; i++) {
			TableColumn column = new TableColumn(table, SWT.BOLD);
			column.setText(titles[i]);
			column.pack();
		}

		currentStatusTabItem.setControl(scroller);
		// composite.pack();
	}

	/**
	 * Create team details tab page
	 */
	private void createTeamDetailsPage() {
		ScrolledComposite scroller = new ScrolledComposite(tabFolder, SWT.BORDER | SWT.V_SCROLL
				| SWT.H_SCROLL);
		scroller.setBackground(tabFolder.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		//scroller.setExpandVertical(true);
		scroller.setExpandHorizontal(true);
		Composite composite = new Composite(scroller, SWT.NULL);
		composite.setLayout(new FillLayout(SWT.VERTICAL));
		composite.setBackground(tabFolder.getBackground());
		scroller.setContent(composite);
		scroller.setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		createLabel(composite, SWT.NONE, "", new GridData(), tabFolder.getBackground(), null);

		// Team Header
		// createCompositeLabel(composite, "Team");

		// App owner Header
		createCompositeLabel(composite, "App Owner");

		// Get app owner list here and iteratively show them
		ownerComposite = new Composite(composite, SWT.NONE);
		ownerComposite.setBackground(tabFolder.getBackground());
		GridLayout gridLayout1 = new GridLayout(1, false);
		gridLayout1.marginWidth = 20;
		ownerComposite.setLayout(gridLayout1);

		createLabel(composite, SWT.NONE, "", new GridData(), scroller.getBackground(), new Font(
				null, "", 12, SWT.BOLD));

		// App Developer Header
		createCompositeLabel(composite, "App Developer");

		// Get app developer list here and iteratively show them
		developercomposite = new Composite(composite, SWT.NONE);
		developercomposite.setBackground(tabFolder.getBackground());
		GridLayout gridLayout2 = new GridLayout(1, false);
		gridLayout2.marginWidth = 20;
		developercomposite.setLayout(gridLayout2);

		createLabel(composite, SWT.NONE, "", new GridData(), scroller.getBackground(), new Font(
				null, "", 12, SWT.BOLD));

		// Resources Header
		createCompositeLabel(composite, "Resources");

		// Get app resources and display them
		resourceComposite = new Composite(composite, SWT.NONE);
		resourceComposite.setBackground(tabFolder.getBackground());
		GridLayout resourceGridLayout = new GridLayout(1, false);
		resourceGridLayout.marginWidth = 20;
		resourceComposite.setLayout(resourceGridLayout);

		createLabel(composite, SWT.NONE, "", new GridData(), scroller.getBackground(), new Font(
				null, "", 12, SWT.BOLD));

		// Data Sources Header
		createCompositeLabel(composite, "Data Sources");

		// Get Data Sources list here and iteratively show them
		datasourcescomposite = new Composite(composite, SWT.NONE);
		datasourcescomposite.setBackground(tabFolder.getBackground());
		GridLayout gridLayout3 = new GridLayout(1, false);
		gridLayout3.marginWidth = 20;
		datasourcescomposite.setLayout(gridLayout3);

		createLabel(composite, SWT.NONE, "", new GridData(), scroller.getBackground(), new Font(
				null, "", 12, SWT.BOLD));

		// Data bases Header
		createCompositeLabel(composite, "Databases");

		// Get Data Sources list here and iteratively show them
		databasescomposite = new Composite(composite, SWT.NONE);
		databasescomposite.setBackground(tabFolder.getBackground());
		GridLayout gridLayout4 = new GridLayout(1, false);
		gridLayout4.marginWidth = 20;
		databasescomposite.setLayout(gridLayout4);

		createLabel(composite, SWT.NONE, "", new GridData(), scroller.getBackground(), new Font(
				null, "", 12, SWT.BOLD));

		// APIs Header
		createCompositeLabel(composite, "APIs");

		// Get Data Sources list here and iteratively show them
		apicomposite = new Composite(composite, SWT.NONE);
		apicomposite.setBackground(tabFolder.getBackground());
		GridLayout gridLayout5 = new GridLayout(1, false);
		gridLayout5.marginWidth = 20;
		apicomposite.setLayout(gridLayout5);

		createLabel(composite, SWT.NONE, "", new GridData(), scroller.getBackground(), new Font(
				null, "", 12, SWT.BOLD));

		// Properties Header
		createCompositeLabel(composite, "Properties");

		// Get Data Sources list here and iteratively show them
		propertiescomposite = new Composite(composite, SWT.NONE);
		propertiescomposite.setBackground(tabFolder.getBackground());
		GridLayout gridLayout6 = new GridLayout(1, false);
		gridLayout6.marginWidth = 20;
		propertiescomposite.setLayout(gridLayout6);

		createLabel(composite, SWT.NONE, "", new GridData(), scroller.getBackground(), new Font(
				null, "", 12, SWT.BOLD));

		teamTabItem.setControl(scroller);
		composite.pack();
	}

	/**
	 * Display application info of the selected application
	 * 
	 * @param applicationInfo
	 */
	private void updateAppInfo(ApplicationInfo applicationInfo) {
		removeChildControls(appTypeComposite);
		if(applicationInfo.getType() != null && !applicationInfo.getType().equals("")) {
			createLabel(appTypeComposite, SWT.NONE, applicationInfo.getType(), getGridData(),
					tabFolder.getBackground(), null);
		} else {
			createLabel(appTypeComposite, SWT.NONE, DEFAULT_VALUE, getGridData(),
					tabFolder.getBackground(), null);
		}
		appTypeComposite.pack();
		
		removeChildControls(repoTypeComposite);
		if(applicationInfo.getRepositoryType() != null && !applicationInfo.getRepositoryType().equals("")) {
			createLabel(repoTypeComposite, SWT.NONE, applicationInfo.getRepositoryType(), getGridData(),
					tabFolder.getBackground(), null);
		} else {
			createLabel(repoTypeComposite, SWT.NONE, DEFAULT_VALUE, getGridData(),
					tabFolder.getBackground(), null);
		}
		repoTypeComposite.pack();
		
		removeChildControls(appOwnerComposite);
		if(applicationInfo.getApplicationOwner() != null && !applicationInfo.getApplicationOwner().equals("")) {
			createLabel(appOwnerComposite, SWT.NONE, applicationInfo.getApplicationOwner(), getGridData(),
					tabFolder.getBackground(), null);
		} else {
			createLabel(appOwnerComposite, SWT.NONE, DEFAULT_VALUE, getGridData(),
					tabFolder.getBackground(), null);
		}
		appOwnerComposite.pack();
		
		removeChildControls(descriptionComposite);
		if(applicationInfo.getDescription() != null && !applicationInfo.getDescription().equals("")) {
			createLabel(descriptionComposite, SWT.NONE, applicationInfo.getDescription(), getGridData(),
					tabFolder.getBackground(), null);
		} else {
			createLabel(descriptionComposite, SWT.NONE, DEFAULT_VALUE, getGridData(),
					tabFolder.getBackground(), null);
		}
		descriptionComposite.pack();
	}

	/**
	 * Display current status of the selected application
	 * 
	 * @param applicationInfo
	 */
	private void updateCurrentStatus(ApplicationInfo applicationInfo) {
		// Remove existing
		table.removeAll();

		// Add new
		List<AppVersionInfo> version = applicationInfo.getVersion();
		for (AppVersionInfo appVersionInfo : version) {
			TableItem item = new TableItem(table, SWT.NONE);
			item.setText(0, appVersionInfo.getVersion());
			item.setText(1, appVersionInfo.getLastBuildResult());
			item.setText(2, appVersionInfo.getRepoURL());
		}

		// Pack the new one to table
		for (int i = 0; i < table.getColumnCount(); i++) {
			table.getColumn(i).pack();
		}
	}

	/**
	 * Display team details of the selected application
	 * 
	 * @param applicationInfo
	 */
	private void updateTeamDetails(ApplicationInfo applicationInfo) {
		// owners
		removeChildControls(ownerComposite);
		if(applicationInfo.getApplicationOwner() != null && !applicationInfo.getApplicationOwner().equals("")) {
			createLabel(ownerComposite, SWT.NONE, applicationInfo.getApplicationOwner(), getGridData(),
					tabFolder.getBackground(), null);
		} else {
			createLabel(ownerComposite, SWT.NONE, DEFAULT_VALUE, getGridData(),
					tabFolder.getBackground(), null);
		}
		ownerComposite.pack();

		// developers
		removeChildControls(developercomposite);
		if (applicationInfo.getApplicationDevelopers() != null
				&& applicationInfo.getApplicationDevelopers().size() > 0) {
			for (String string : applicationInfo.getApplicationDevelopers()) {
				createLabel(developercomposite, SWT.NONE, string, getGridData(),
						tabFolder.getBackground(), null);
			}
		} else {
			createLabel(developercomposite, SWT.NONE, DEFAULT_VALUE, getGridData(),
					tabFolder.getBackground(), null);
		}
		developercomposite.pack();

		// resources
		removeChildControls(resourceComposite);
		createLabel(resourceComposite, SWT.NONE, DEFAULT_VALUE, getGridData(),
				tabFolder.getBackground(), null);
		resourceComposite.pack();

		// data sources
		removeChildControls(datasourcescomposite);
		if (applicationInfo.getDatasources() != null && applicationInfo.getDatasources().size() > 0) {
			for (String string : applicationInfo.getDatasources()) {
				createLabel(datasourcescomposite, SWT.NONE, string, getGridData(),
						tabFolder.getBackground(), null);
			}
		} else {
			createLabel(datasourcescomposite, SWT.NONE, DEFAULT_VALUE, getGridData(),
					tabFolder.getBackground(), null);
		}
		datasourcescomposite.pack();

		// data bases
		removeChildControls(databasescomposite);
		if (applicationInfo.getDatabases() != null && applicationInfo.getDatabases().size() > 0) {
			for (String string : applicationInfo.getDatabases()) {
				createLabel(databasescomposite, SWT.NONE, string, getGridData(),
						tabFolder.getBackground(), null);
			}
		} else {
			createLabel(databasescomposite, SWT.NONE, DEFAULT_VALUE, getGridData(),
					tabFolder.getBackground(), null);
		}
		databasescomposite.pack();

		// apis
		removeChildControls(apicomposite);
		if (applicationInfo.getApis() != null && applicationInfo.getApis().size() > 0) {
			for (String string : applicationInfo.getApis()) {
				createLabel(apicomposite, SWT.NONE, string, getGridData(),
						tabFolder.getBackground(), null);
			}
		} else {
			createLabel(apicomposite, SWT.NONE, DEFAULT_VALUE, getGridData(),
					tabFolder.getBackground(), null);
		}
		apicomposite.pack();

		// properties
		removeChildControls(propertiescomposite);
		if (applicationInfo.getProperties() != null && applicationInfo.getProperties().size() > 0) {
			for (String string : applicationInfo.getProperties()) {
				createLabel(propertiescomposite, SWT.NONE, string, getGridData(),
						tabFolder.getBackground(), null);
			}
		} else {
			createLabel(propertiescomposite, SWT.NONE, DEFAULT_VALUE, getGridData(),
					tabFolder.getBackground(), null);
		}
		propertiescomposite.pack();
	}

}