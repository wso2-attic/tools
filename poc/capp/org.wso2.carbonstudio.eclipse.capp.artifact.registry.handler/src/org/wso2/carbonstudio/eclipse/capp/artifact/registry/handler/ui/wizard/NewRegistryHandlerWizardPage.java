/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbonstudio.eclipse.capp.artifact.registry.handler.ui.wizard;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.handler.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.handler.utils.HandlerInfo.DataType;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.handler.utils.HandlerInfo.PropertyData;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.greg.registry.handler.ui.wizard.NewRegistryHandlerWizard;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.constants.ProjectConstants;
import org.wso2.carbonstudio.eclipse.utils.jdt.JavaUtils;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

public class NewRegistryHandlerWizardPage extends WizardPage {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private static final String HANDLER_SUPER_CLASSNAME = "org.wso2.carbon.registry.core.jdbc.handlers.Handler";
	WizardNewFileCreationPage wizard;
	private IProject selectedProject;
	private NewRegistryHandlerWizard regHandlerWizard;
	private IStructuredSelection selection;
	private Map<String,List<String>> handlerClassesList=new HashMap<String, List<String>>();
	private String className;
	private String projectName;
	private Combo projectListCombo;
	private String[] methodTypes;
	private Button check;
	private ArrayList<String> selectedMethods;
	private String type;
	private Table handlerMethodsTable;
	private Button selectAllButton;
	private Button deSelectAllButton;
	private String fullyQualifiedClassName;
	private Table handlerPropertiesTable;
	private TableViewer viewer;
	private final static String[] titles = { "Property Name", "Value", "Type" };
	private HashMap<String, PropertyData> handlerPropertyMap;
	private String[] handlerTypes = {DataType.STRING.name(), DataType.XML.name()};

	public HashMap<String, PropertyData> getHandlerPropertyMap() {
		return handlerPropertyMap;
	}

	public void setHandlerPropertyMap(HashMap<String, PropertyData> handlerPropertyMap) {
		this.handlerPropertyMap = handlerPropertyMap;
	}

	public String getFullyQualifiedClassName() {
		return fullyQualifiedClassName;
	}

	public void setFullyQualifiedClassName(String fullyQualifiedClassName) {
		this.fullyQualifiedClassName = fullyQualifiedClassName;
	}

	public ArrayList<String> getSelectedMethods() {
		return selectedMethods;
	}

	public void setSelectedMethods(ArrayList<String> selectedMethods) {
		this.selectedMethods = selectedMethods;
	}
	
	public DataType getType() {
		return type.equalsIgnoreCase("xml")? DataType.XML:DataType.STRING;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		setFullyQualifiedClassName(className);
		String[] fqnSplit = className.split("\\.");
		this.className = fqnSplit[fqnSplit.length -1];
	}

	private Combo serverClassesCombo;

	private String fileName;
	
	public NewRegistryHandlerWizardPage(WizardNewFileCreationPage wizardNewFileCreationPage, IProject p, IStructuredSelection cselection) {
		super("wizardPage");
		setDescription("Create Registry Handler Artifact");
        this.wizard=wizardNewFileCreationPage;
        this.selectedProject = p;
        this.selection = cselection;
	}

	public void createControl(Composite parent) {
		determineHandlerClassProjects();
		handlerPropertyMap = new HashMap<String, PropertyData>();
		selectedMethods = new ArrayList<String>();
		methodTypes = CAppEnvironment.getRegistryHandler().getFilterMethods();
		final Group group = new Group(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		group.setLayout(layout);	
		
		GridData gd = new GridData();
		
		gd = new GridData(GridData.FILL_HORIZONTAL);
		Label FromWSLabel = new Label(group, SWT.NULL);
		FromWSLabel.setText("From workspace");
		FromWSLabel.setLayoutData(gd);
		
		projectListCombo = new Combo(group, SWT.DROP_DOWN | SWT.READ_ONLY);
		gd = new GridData();
		gd.widthHint = 300;
		projectListCombo.setLayoutData(gd);
		
		Label lblName ; 
		Label hidLab = new Label(group, SWT.NULL);
		
		gd = new GridData();
		Label classNameLabel = new Label(group, SWT.NULL);
		classNameLabel.setText("Handler Class Name");
		classNameLabel.setLayoutData(gd);
		
		serverClassesCombo = new Combo(group, SWT.DROP_DOWN | SWT.READ_ONLY);
		gd = new GridData();
		gd.widthHint = 300;
		serverClassesCombo.setLayoutData(gd);
		
		setClassName(serverClassesCombo.getText());
		
		
		final Button newHandlerClassButton = new Button(group, SWT.PUSH);
		newHandlerClassButton.setText("New...");
		gd = new GridData();
		gd.widthHint = 100; 
		newHandlerClassButton.setLayoutData(gd);
		
		newHandlerClassButton.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				regHandlerWizard = new NewRegistryHandlerWizard();
				regHandlerWizard.init(PlatformUI.getWorkbench(), selection);
				WizardDialog wizardDialog = new WizardDialog(group.getShell(), regHandlerWizard);
				if (wizardDialog.open()==Window.OK){
					addHandlerClassProject(regHandlerWizard.getProjectName(), regHandlerWizard.getClassName());
					projectListCombo.add(regHandlerWizard.getProjectName());
					projectListCombo.setText(regHandlerWizard.getProjectName());
					fillComboBoxInfo(getHandlerClassesForProject(regHandlerWizard.getProjectName()));
					serverClassesCombo.setText(regHandlerWizard.getClassName());
					setProjectName(projectListCombo.getText());
					setClassName(regHandlerWizard.getClassName());
					setFileName(getClassName());
					updateStatus(null);
					handlerMethodsTable.setEnabled(true);
					selectAllButton.setEnabled(true);
					deSelectAllButton.setEnabled(true);
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
		serverClassesCombo.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				if(serverClassesCombo.getText() != null && !serverClassesCombo.getText().equals("")){
					setProjectName(projectListCombo.getText());
					setClassName(serverClassesCombo.getText());
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
		
		projectListCombo.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				setProjectName(projectListCombo.getText());
				fillComboBoxInfo(getHandlerClassesForProject(projectListCombo.getText()));
				setFileName(getClassName());
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
		fillProjectListCombo();

		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan=3;
		lblName = new Label(group, SWT.SEPARATOR | SWT.HORIZONTAL);
		lblName.setLayoutData(gd);
		
		Label handlerPropertyLabel = new Label(group, SWT.NULL);
		handlerPropertyLabel.setText("Handler Properties Info");
		gd = new GridData();
		gd.horizontalSpan = 3;
		handlerPropertyLabel.setLayoutData(gd);

		//add table add multiple properties
		handlerPropertiesTable = new Table(group,  SWT.BORDER | 
												   SWT.V_SCROLL | 
												   SWT.MULTI | 
												   SWT.FULL_SELECTION);
		handlerPropertiesTable.setHeaderVisible(true);
		handlerPropertiesTable.setLinesVisible(true);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, false);
		data.heightHint = 100;
		data.horizontalSpan = 3;
		handlerPropertiesTable.setLayoutData(data);
		
		TableLayout handlerProptableLayout = new TableLayout();
		handlerPropertiesTable.setLayout(handlerProptableLayout);
		
		handlerProptableLayout.addColumnData(new ColumnWeightData(10, 150, true));
		TableColumn column = new TableColumn(handlerPropertiesTable, SWT.NONE);
		column.setText(titles[0]);
		column.setAlignment(SWT.LEFT);
		
		handlerProptableLayout.addColumnData(new ColumnWeightData(15, 150, true));
		column = new TableColumn(handlerPropertiesTable, SWT.NONE);
		column.setText(titles[1]);
		column.setAlignment(SWT.LEFT);
		
		handlerProptableLayout.addColumnData(new ColumnWeightData(20, 50, true));
		column = new TableColumn(handlerPropertiesTable, SWT.NONE);
		column.setText(titles[2]);
		column.setAlignment(SWT.LEFT);
		
		column.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent event) {
//				System.out.println(event.toString());
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
		
		viewer = new TableViewer(handlerPropertiesTable);
		viewer.setColumnProperties(titles);
		viewer.setContentProvider(new HandlerPropertyContentProvider());
		viewer.setLabelProvider(new HandlerPropertyLabelProvider());
		
		CellEditor[] editors = new CellEditor[3];
		editors[0] = new TextCellEditor(handlerPropertiesTable);
		editors[1] = new TextCellEditor(handlerPropertiesTable);
		editors[2] = new ComboBoxCellEditor(handlerPropertiesTable, handlerTypes, SWT.READ_ONLY);
		viewer.setCellEditors(editors);
		viewer.setCellModifier(new HandlerPropertyTableCellModifier());
		
		
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan=3;
		lblName = new Label(group, SWT.SEPARATOR | SWT.HORIZONTAL);
		lblName.setLayoutData(gd);
		
		Label methodsLabel = new Label(group, SWT.NULL);
		methodsLabel.setText("Handler Methods");
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 3;
		methodsLabel.setLayoutData(gd);
		
		handlerMethodsTable = new Table(group, 
										SWT.BORDER | 
										SWT.V_SCROLL | 
										SWT.MULTI | 
										SWT.FULL_SELECTION|
										SWT.CHECK);
		
		handlerMethodsTable.setLinesVisible(true);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.heightHint = 100;
		gd.horizontalSpan=3;
		handlerMethodsTable.setLayoutData(gd);
		handlerMethodsTable.setEnabled(false);
		
		TableLayout tableLayout = new TableLayout();
		handlerMethodsTable.setLayout(tableLayout);
		
		loadData();
		
		selectAllButton = new Button(group, SWT.PUSH);
		selectAllButton.setText("Select All");
		gd = new GridData();
		gd.widthHint = 150;
		gd.heightHint = 27;
		selectAllButton.setLayoutData(gd);
		selectAllButton.setEnabled(false);
		
		deSelectAllButton  = new Button(group, SWT.PUSH);
		deSelectAllButton.setText("Deselect All");
		gd = new GridData();
		gd.widthHint = 150;
		gd.heightHint = 27;
		deSelectAllButton.setLayoutData(gd);
		deSelectAllButton.setEnabled(false);
		
		selectAllButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				ArrayList<String> tempMethodList = new ArrayList<String>();
				for (int i = 0; i < methodTypes.length; i++) {
					TableItem item = handlerMethodsTable.getItem(i);
					item.setChecked(true);
				}
				for(String method: methodTypes){
					if(!tempMethodList.contains(method)){
						tempMethodList.add(method);
					}
					
				}
				setSelectedMethods(tempMethodList);
			}
		});
		
		deSelectAllButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				for (int i = 0; i < methodTypes.length; i++) {
					TableItem item = handlerMethodsTable.getItem(i);
					item.setChecked(false);
				}
				ArrayList<String> tempMethodList = new ArrayList<String>();
				setSelectedMethods(tempMethodList);
				
			}
		});
		
		handlerMethodsTable.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {

				if (event.detail == SWT.CHECK) {
					if (((org.eclipse.swt.widgets.TableItem) event.item)
							.getChecked() == true) {
						String name = ((org.eclipse.swt.widgets.TableItem) event.item)
								.getText();
						
						if(!selectedMethods.contains(name)){
							selectedMethods.add(name);
						}
						
					}else{
						String name = ((org.eclipse.swt.widgets.TableItem) event.item)
										.getText();
						if(!selectedMethods.contains(name)){
							selectedMethods.remove(name);
						}
					}
						
				}
				setSelectedMethods(selectedMethods);
			}
		});
		
		if(projectListCombo.getText().equals("") || projectListCombo.getText()==null || 
				serverClassesCombo.getText().equals("") || serverClassesCombo.getText() == null){
			setPageComplete(false);
		}
		
		if(serverClassesCombo.getText() != null && !serverClassesCombo.getText().equals("")){
			setClassName(serverClassesCombo.getText());
			setProjectName(projectListCombo.getText());
			setFileName(getClassName());
//			propertyNameText.setEnabled(true);
			handlerMethodsTable.setEnabled(true);
			selectAllButton.setEnabled(true);
			deSelectAllButton.setEnabled(true);
		}
		loadHandlerMethodTaleData();
		setControl(group);
		
	}
	
	private void loadHandlerMethodTaleData(){
		handlerPropertiesTable.removeAll();
		for (String property : handlerPropertyMap.keySet()) {
			TableItem item = new TableItem(handlerPropertiesTable, SWT.NONE);
			PropertyData propDate = handlerPropertyMap.get(property);
			HandlerPropertyData handlerData = HandlerPropertyData.getHandlerData(property,propDate.data, propDate.type.name());
			item.setText(new String[] { handlerData.propertyName, handlerData.propertyValue });
			item.setData(handlerData);
		}
		addHandlerProperty();
	}
	
	
	public void loadData(){
		handlerMethodsTable.removeAll();
		handlerMethodsTable.setVisible(true);
//		selectAllButton.setVisible(true);
//		deSelectAllButton.setVisible(true);

		for (int i = 0; i < methodTypes.length; i++) {
			TableItem item = new TableItem(handlerMethodsTable, SWT.NONE);
			item.setText(methodTypes[i]);
		}
	}
	
	public void createCheckBox(Group group, String method){
		check = new Button(group, SWT.CHECK);
		check.setText(method);
		check.setSelection(false);
		check.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent event) {
				boolean b = ((Button) (event.widget)).getSelection();
				String method = ((Button) (event.widget)).getText();
				if(b){
					if(!selectedMethods.contains(method)){
						selectedMethods.add(method);
					}
				}else{
					if(selectedMethods.contains(method)){
						selectedMethods.remove(method);
					}
				}
				setSelectedMethods(selectedMethods);
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
	}
	
	public List<String> getHandlerClassesForProject(String project){
		return handlerClassesList.get(project);
 	}
	
	public void fillComboBoxInfo(List<String> handlerClasses){
		serverClassesCombo.removeAll();
		for(int i=0; i< handlerClasses.size(); i++){
			serverClassesCombo.add(handlerClasses.get(i));
		}
//		serverClassesCombo.add("--Existing Class From Server--");
		if (serverClassesCombo.getSelectionIndex() == -1) {
			serverClassesCombo.select(0);
			setClassName(serverClassesCombo.getText());
			setFileName(getClassName());
		}
	}
	
	public void handlePathBrowseButton(Text filePathText) {
		String fileName = getSavePath();
		if (fileName != null)
			filePathText.setText(fileName);
	}

	private String getSavePath() {
		String fileName = null;
		// FileDialog
		FileDialog fld = new FileDialog(this.getShell(), SWT.OPEN);
		boolean done = false;
		while (!done) {
			// Open the File Dialog
			fileName = fld.open();
			if (fileName == null) {
				// User has cancelled, so quit and return
				done = true;
			} else {
				// User has selected a file; see if it already exists
				File file = new File(fileName);
				if (file.exists()) {
					// If they click Yes, we're done and we drop out. If
					// they click No, we redisplay the File Dialog
					done = true;
				} else {
					// File does not exist, so drop out
					done = false;
				}
			}
		}
		return fileName;
	}

	private boolean isClassExtendedFromHandlerClass(IProject project, String fullyQualifiedClassName) throws JavaModelException{
		return JavaUtils.isClassExtendedFrom(project, fullyQualifiedClassName, HANDLER_SUPER_CLASSNAME);
	}
	
	public void determineHandlerClassProjects(){
		
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject prj : projects) {
			try {
	            if (!prj.isOpen() || !prj.hasNature(ProjectConstants.JAVA_NATURE_ID) ){
	            	continue;
	            }
            } catch (CoreException e1) {
	            e1.printStackTrace();
	            continue;
            }
			IJavaProject jp = JavaCore.create(prj);
			try {
				IPackageFragment[] packageFragments = jp.getPackageFragments();
				for (IPackageFragment fragment : packageFragments) {
					IJavaElement[] children = fragment.getChildren();
					for (IJavaElement element : children) {
							ICompilationUnit[] compilationUnits = fragment.getCompilationUnits();
							for (ICompilationUnit unit : compilationUnits) {
								String a = unit.getElementName();
								IType[] types = unit.getTypes();
								for (IType type : types) {
									if(type.getSuperclassName() != null){
										String[][] resolveType = type.resolveType(type.getSuperclassName());
										if(resolveType != null){
											String fullyQualifiedSuperClassName=(resolveType[0][0]).toString()+"."+(resolveType[0][1]).toString();
											if (isClassExtendedFromHandlerClass(prj, fullyQualifiedSuperClassName)){
												String fullyQualifiedName = type.getFullyQualifiedName();
												addHandlerClassProject(prj.getName(), fullyQualifiedName);
											}
										}
									}
								}
							}
//						}
					}
				}
			} catch (JavaModelException e) {
				log.error(e);
			}
		}
	}
	
	private void addHandlerClassProject(String projectName, String className){
		if (!handlerClassesList.containsKey(projectName)){
			handlerClassesList.put(projectName, new ArrayList<String>());
		}
		List<String> list=handlerClassesList.get(projectName);
		if(!list.contains(className)){
			list.add(className);
		}
	}
	
	public void fillProjectListCombo(){
		List<String> relevantProjects = new ArrayList<String>();
		for(String projectName:handlerClassesList.keySet()){
			relevantProjects.add(projectName);
		}
		for (String name: relevantProjects) {
			projectListCombo.add(name);
		}
		
		if (projectListCombo.getItemCount()>0 && projectListCombo.getSelectionIndex() == -1) {
			projectListCombo.select(0);
			fillComboBoxInfo(getHandlerClassesForProject(projectListCombo.getText()));
		}
		
	}
	
	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		String f = wizard.getFileName();
		if (f==null || f.equals("") || f.equals(this.fileName)){
			wizard.setFileName(fileName);
		}
	    this.fileName = fileName;
    }
	
	public class HandlerPropertyContentProvider implements IStructuredContentProvider {

		public Object[] getElements(Object parent) {
			handlerPropertyMap = new HashMap<String, PropertyData>();
			loadData();
			
			ArrayList results = new ArrayList();
			if (parent instanceof HandlerPropertyData) {
				results = (ArrayList) parent;
			}
			return results.toArray();
		}

		public void dispose() {
			
		}

		public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
			
		}
		
	}
	
	public class HandlerPropertyLabelProvider extends LabelProvider implements ITableLabelProvider {

		public Image getColumnImage(Object arg0, int arg1) {
			return null;
		}

		public String getColumnText(Object element, int columnIndex) {
			HandlerPropertyData row = (HandlerPropertyData) element;
			switch (columnIndex) {
			case 0:
				return row.propertyName;
			case 1:
				return row.propertyValue;
			case 2:
				return row.type;
			}
			return null;
		}
		
	}
	
	class HandlerPropertyTableCellModifier implements ICellModifier {

		public boolean canModify(Object arg0, String arg1) {
			return true;
		}

		public Object getValue(Object element, String property) {
			Object result = null;
			HandlerPropertyData row = (HandlerPropertyData) element;
			ArrayList<String> list = new ArrayList<String>();
			for (int i = 0; i < titles.length; i++) {
				list.add(titles[i]);
			}
			int columnIndex = list.indexOf(property);
			switch (columnIndex) {
			case 0:
				result = row.propertyName;
				break;
			case 1:
				result = row.propertyValue;
				break;
			case 2:
				result = row.type;
				String[] choices = handlerTypes;
				int i = choices.length - 1;
				while (!result.equals(choices[i]) && i > 0){
					--i;
				}
				result = new Integer(i);	
				break;
			}
			return result;
		}

		public void modify(Object element, String property, Object value) {
			ArrayList<String> list = new ArrayList<String>();
			for (int i = 0; i < titles.length; i++) {
				list.add(titles[i]);
			}
			int columnIndex = list.indexOf(property);

			TableItem tableItem = (TableItem) element;
			HandlerPropertyData row = (HandlerPropertyData) tableItem.getData();

			switch (columnIndex) {
			case 0:
				String key = (String) value;
				if (key.length() > 0) {
					row.propertyName = key;
				}
				break;

			case 1:
				String v = (String) value;
				if (v.length() > 0) {
					row.propertyValue = v;
				}
				break;
				
			case 2:
				String ctype = handlerTypes[((Integer) value).intValue()].trim();
				if (!row.type.equals(ctype)) {
					row.type = ctype;
				}
				break;
//				String ctype = (String) value;
//				if (ctype.length() > 0) {
//					row.type = ctype;
//				}
//				break;
			}
			if (row.isBlank()) {
				if (tableItem != handlerMethodsTable.getItem(handlerMethodsTable.getItemCount() - 1)) {
				}
			} else {
				TableItem item = handlerMethodsTable.getItem(handlerMethodsTable.getItemCount() - 1);
				HandlerPropertyData lastFilterData = (HandlerPropertyData) item.getData();
				if (!lastFilterData.isBlank()){
					addHandlerProperty();
				}
			}
			viewer.update(row, null);
			if(row.propertyName != null && !row.propertyName.equals("") && row.propertyValue != null && !row.propertyValue.equals("")){
				PropertyData prpData = new PropertyData(row.type.equalsIgnoreCase("xml")?DataType.XML:DataType.STRING, row.propertyValue);
				if(prpData.type.name().equals(DataType.XML.name())){
					if(validateXML(prpData.data)){
						handlerPropertyMap.put(row.propertyName, prpData);
						setHandlerPropertyMap(handlerPropertyMap);
					}
					
				}else{
					handlerPropertyMap.put(row.propertyName, prpData);
					setHandlerPropertyMap(handlerPropertyMap);
				}
				
			}
			
		}
	}
	
	private boolean validateXML(String xmlString){
		try{
			OMElement element = AXIOMUtil.stringToOM(xmlString);
		}catch (Exception e) {
			MessageDialog.openError(getShell(), "Registry Handler Artifact", "Property value should be well formatted XML string for Type XML");
			return false;
		}
		return true;
	}
	
	public void addHandlerProperty() {
		HandlerPropertyData handlerPropertyData = HandlerPropertyData.getHandlerData("", "", "");
		viewer.add(handlerPropertyData);
		TableItem item = handlerMethodsTable.getItem(handlerMethodsTable.getItemCount() - 1);
		item.setData(handlerPropertyData);
		handlerMethodsTable.setTopIndex(handlerMethodsTable.getItemCount());
		viewer.editElement(handlerPropertyData, 0);
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectName() {
		return projectName;
	}

	public static class HandlerPropertyData {
		String propertyName; 
		String propertyValue;
		String type;
		String currentName;
		String currentValue;
		String cType;
		
		public static HandlerPropertyData getHandlerData(String cPropertyName, String cPropertyValue, String currentType){
			HandlerPropertyData handlerPropertyData = new HandlerPropertyData();
			handlerPropertyData.propertyName = cPropertyName;
			handlerPropertyData.propertyValue = cPropertyValue;
			handlerPropertyData.type = currentType;
			return handlerPropertyData;
		}
		
		public boolean isChanged() {
			return currentName == null || currentValue == null
					                   || !currentName.equals(propertyName) 
					                   || !currentValue.equals(propertyValue)
					                   || !cType.equals(type);
		}
		
		public boolean isBlank() {
			return propertyName.equals("") && propertyValue.equals("") && type.equals("");
		}
	}

}