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

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
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
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.handler.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.handler.utils.HandlerInfo.DataType;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.handler.utils.HandlerInfo.PropertyData;
import org.wso2.carbonstudio.eclipse.greg.registry.filter.ui.wizard.NewRegistryFilterWizard;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.constants.ProjectConstants;
import org.wso2.carbonstudio.eclipse.utils.jdt.JavaUtils;


public class NewRegistryFilterWizardPage extends WizardPage {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	WizardNewFileCreationPage wizard;
//	private FromWS fromWSComposite;
	private IProject selectedProject;
//	private Composite fromWorkspaceComp;
//	private Button fromFS; 
//	private Button fsBrowseButton;
	private Button fromServerRadioButton;
//	private Text fsPath;
	private Text fromServerPathText;
	private Text pathText;
	private String jarLocation;
	private NewRegistryFilterWizard regFilterWizard;
	private IStructuredSelection selection;
//	private ArrayList<String> filterClassesList;
	private Map<String,List<String>> filterClassesList=new HashMap<String, List<String>>();
	
	private String className;
	private String projectName;
	private Combo projectListCombo;
	private final static String[] titles = { "Property Name", "Value", "Type" };

	private static final String FILTER_SUPER_CLASSNAME = "org.wso2.carbon.registry.core.jdbc.handlers.filters.Filter";
	private Table filterCriteriaTable;
	private TableViewer viewer;
	private HashMap<String, PropertyData> filterMap;
	private Combo serverClassesCombo;
	private ArrayList<String> defaultFilterClassesList; 
	private String[] filterDataTypeNames = {DataType.STRING.name(), DataType.XML.name()};

	public Map<String, PropertyData> getFilterMap() {
		return filterMap;
	}

	public void setFilterMap(HashMap<String, PropertyData> filterMap) {
		this.filterMap = filterMap;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public NewRegistryFilterWizardPage(WizardNewFileCreationPage wizardNewFileCreationPage, IProject p, IStructuredSelection cselection) {
		super("wizardPage");
		filterMap = new HashMap<String, PropertyData>();
		setDescription("Define registry filter details");
        this.wizard=wizardNewFileCreationPage;
        this.selectedProject = p;
        this.selection = cselection;
	}

	public void createControl(Composite parent) {
		defaultFilterClassesList = new ArrayList<String>();
		defaultFilterClassesList.add("org.wso2.carbon.registry.core.jdbc.handlers.filters.MediaTypeMatcher");
		defaultFilterClassesList.add("org.wso2.carbon.registry.core.jdbc.handlers.filters.URLMatcher");

		final Group group = new Group(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		group.setLayout(layout);	
		
		GridData gd = new GridData();
		
		Label classNameLabel = new Label(group, SWT.NULL);
		classNameLabel.setText("Filter Class Name");
		classNameLabel.setLayoutData(gd);
		
		serverClassesCombo = new Combo(group, SWT.DROP_DOWN | SWT.READ_ONLY);
		gd = new GridData();
		gd.widthHint = 310;
		serverClassesCombo.setLayoutData(gd);
		
//		fillComboBoxInfo(filterClassesList);
		
//		setClassName(serverClassesCombo.getText());
		
		final Button newFilterClassButton = new Button(group, SWT.PUSH);
		newFilterClassButton.setText("New...");
		gd = new GridData();
		gd.widthHint = 100; 
		newFilterClassButton.setLayoutData(gd);
//		newHandlerClassButton.setEnabled(false);
		
		Label lblName ; 
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan=3;
		
		lblName = new Label(group, SWT.SEPARATOR | SWT.HORIZONTAL);
		lblName.setLayoutData(gd);
		
		
		gd = new GridData(GridData.FILL_HORIZONTAL);
		Button FromWSButton = new Button(group, SWT.RADIO);
		FromWSButton.setText("From workspace");
		FromWSButton.setLayoutData(gd);
		FromWSButton.setEnabled(true);
		FromWSButton.setSelection(true);
		
		projectListCombo = new Combo(group, SWT.DROP_DOWN | SWT.READ_ONLY);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		projectListCombo.setLayoutData(gd);
//		projectListCombo.setEnabled(false);
		
		Label hidLab = new Label(group, SWT.NULL);
		
		serverClassesCombo.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				setClassName(serverClassesCombo.getText());
				setProjectName(projectListCombo.getText());
				if(serverClassesCombo.getText().equals("org.wso2.carbon.registry.core.jdbc.handlers.filters.MediaTypeMatcher")){
					getMediaTypeMatcherFilterMap();
				}else if(serverClassesCombo.getText().equals("org.wso2.carbon.registry.core.jdbc.handlers.filters.URLMatcher")){
					getURLMatcherFilterMap();
				}else{
					getFilterMapForClass(serverClassesCombo.getText());
				}
				loadData();
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		newFilterClassButton.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				regFilterWizard = new NewRegistryFilterWizard();
				regFilterWizard.init(PlatformUI.getWorkbench(), selection);
				WizardDialog wizardDialog = new WizardDialog(group.getShell(), regFilterWizard);
				if (wizardDialog.open()==Window.OK){
					addFilterClassProject(regFilterWizard.getProjectName(), regFilterWizard.getClassName());
					projectListCombo.add(regFilterWizard.getProjectName());
					projectListCombo.setText(regFilterWizard.getProjectName());
					fillComboBoxInfo(getFillterClassesForProject(regFilterWizard.getProjectName()));
					serverClassesCombo.setText(regFilterWizard.getClassName());
					setProjectName(projectListCombo.getText());
					setClassName(serverClassesCombo.getText());
					updateStatus(null);
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
		
		fromServerRadioButton = new Button(group, SWT.RADIO);
		fromServerRadioButton.setText("From already existing Filter");
		gd = new GridData();
		gd.horizontalSpan = 3;
		fromServerRadioButton.setLayoutData(gd);
		fromServerRadioButton.setSelection(false);
		
		Label lblFrom ; 
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan=3;
		
		lblFrom = new Label(group, SWT.SEPARATOR | SWT.HORIZONTAL);
		lblFrom.setLayoutData(gd);
		
	
		FromWSButton.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent event) {
				boolean b = ((Button) (event.widget)).getSelection();
				if(b){
//					filterCriteriaTable.removeAll();
					setProjectName(projectListCombo.getText());
					filterMap = new HashMap<String, PropertyData>();
					loadData();
//					newHandlerClassButton.setEnabled(true);
					projectListCombo.setEnabled(true);
					serverClassesCombo.removeAll();
					
//					fsPath.setEnabled(false);
//					fsBrowseButton.setEnabled(false);
					if(projectListCombo.getText() != null && !projectListCombo.getText().equals("")){
						fillComboBoxInfo(getFillterClassesForProject(projectListCombo.getText()));
						loadData();
					}
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
		

		fromServerRadioButton.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent event) {
				boolean b = ((Button) (event.widget)).getSelection();
				if(b){
					fillComboBoxInfo(defaultFilterClassesList);
					projectListCombo.setEnabled(false);
					setProjectName(null);
					loadData();
					updateStatus(null);
				}else{
					
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
		
		projectListCombo.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				fillComboBoxInfo(getFillterClassesForProject(projectListCombo.getText()));
				setProjectName(projectListCombo.getText());
				filterCriteriaTable.removeAll();
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
		determineFilterClassProjects();
		
		fillProjectListCombo();
		
		Label filterCriteriaLablr =  new Label(group, SWT.NULL);
		filterCriteriaLablr.setText("Filter Criteria");
		gd = new GridData();
		gd.horizontalSpan = 3;
		filterCriteriaLablr.setLayoutData(gd);
		filterCriteriaLablr.setEnabled(true);

		filterCriteriaTable = new Table(group,  SWT.BORDER | 
												SWT.V_SCROLL | 
												SWT.MULTI | 
												SWT.FULL_SELECTION);
		filterCriteriaTable.setHeaderVisible(true);
		filterCriteriaTable.setLinesVisible(true);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, false);
		data.heightHint = 300;
		data.horizontalSpan = 3;
		filterCriteriaTable.setLayoutData(data);
		
		TableLayout tableLayout = new TableLayout();
		filterCriteriaTable.setLayout(tableLayout);

		tableLayout.addColumnData(new ColumnWeightData(10, 150, true));
		TableColumn column = new TableColumn(filterCriteriaTable, SWT.NONE);
		column.setText(titles[0]);
		column.setAlignment(SWT.LEFT);

		tableLayout.addColumnData(new ColumnWeightData(15, 150, true));
		column = new TableColumn(filterCriteriaTable, SWT.NONE);
		column.setText(titles[1]);
		column.setAlignment(SWT.LEFT);
		
		tableLayout.addColumnData(new ColumnWeightData(20, 50, true));
		column = new TableColumn(filterCriteriaTable, SWT.NONE);
		column.setText(titles[2]);
		column.setAlignment(SWT.LEFT);

		viewer = new TableViewer(filterCriteriaTable);
		viewer.setColumnProperties(titles);
		viewer.setContentProvider(new TableContentProvider());
		viewer.setLabelProvider(new TableLabelProvider());

		CellEditor[] editors = new CellEditor[3];
		editors[0] = new TextCellEditor(filterCriteriaTable);
		editors[1] = new TextCellEditor(filterCriteriaTable);
		editors[2] = new ComboBoxCellEditor(filterCriteriaTable, filterDataTypeNames, SWT.READ_ONLY);
		viewer.setCellEditors(editors);
		viewer.setCellModifier(new TableCellModifier());
		
		
		if((projectListCombo.getText() == null || projectListCombo.getText().equals("")) &&
				(serverClassesCombo.getText() == null  || serverClassesCombo.getText().equals("")) &&
				fromServerRadioButton.getSelection()==false){
			setPageComplete(false);
			
		}
		setProjectName(projectListCombo.getText());
		loadData();
		setControl(group);
		
	}
	
	public List<String> getFillterClassesForProject(String project){
		return filterClassesList.get(project);
	}
	
	
	public void fillComboBoxInfo(List<String> filterClasses){
		serverClassesCombo.removeAll();
		for(int i=0; i< filterClasses.size(); i++){
			serverClassesCombo.add(filterClasses.get(i));
		}
//		serverClassesCombo.add("--Existing Class From Server--");
		if (serverClassesCombo.getItemCount()>0 && serverClassesCombo.getSelectionIndex() == -1) {
			serverClassesCombo.select(0);
			setClassName(serverClassesCombo.getText());
		}
		
		if(serverClassesCombo.getText().equals("org.wso2.carbon.registry.core.jdbc.handlers.filters.MediaTypeMatcher")){
			getMediaTypeMatcherFilterMap();
		}else if(serverClassesCombo.getText().equals("org.wso2.carbon.registry.core.jdbc.handlers.filters.URLMatcher")){
			getURLMatcherFilterMap();
		}else{
			getFilterMapForClass(serverClassesCombo.getText());
		}
		
		setClassName(serverClassesCombo.getText());
//		loadData();
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
		fld.setFilterExtensions(new String[]{"*.jar"});
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
	
	private void addFilterClassProject(String projectName, String className){
		if (!filterClassesList.containsKey(projectName)){
			filterClassesList.put(projectName, new ArrayList<String>());
		}
		List<String> list=filterClassesList.get(projectName);
		if(!list.contains(className)){
			list.add(className);
		}
	}
	
	public void determineFilterClassProjects(){
		
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		ArrayList<IProject> filterProjectList = new ArrayList<IProject>();
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
											if (isClassExtendedFromFilterClass(prj, fullyQualifiedSuperClassName)){
												String fullyQualifiedName = type.getFullyQualifiedName();
												addFilterClassProject(prj.getName(), fullyQualifiedName);
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
	
	private boolean isClassExtendedFromFilterClass(IProject project, String fullyQualifiedClassName) throws JavaModelException{
		return JavaUtils.isClassExtendedFrom(project, fullyQualifiedClassName, FILTER_SUPER_CLASSNAME);
	}
	
	public void fillProjectListCombo(){
		for (String projectName : filterClassesList.keySet()) {
			projectListCombo.add(projectName);

		}
		
		if (projectListCombo.getItemCount() >0 && projectListCombo.getSelectionIndex() == -1) {
			projectListCombo.select(0);
			fillComboBoxInfo(getFillterClassesForProject(projectListCombo.getText()));

		}
		
	}
	
	public class TableContentProvider implements IStructuredContentProvider {

		public Object[] getElements(Object parent) {
			filterMap = new HashMap<String, PropertyData>();
			loadData();
			
			ArrayList results = new ArrayList();
			if (parent instanceof FilterData) {
				results = (ArrayList) parent;
			}
			return results.toArray();
		}

		public void dispose() {
			
		}

		public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
			
		}
		
	}
	
	public class TableLabelProvider extends LabelProvider implements ITableLabelProvider {

		public Image getColumnImage(Object arg0, int arg1) {
			return null;
		}

		public String getColumnText(Object element, int columnIndex) {
			FilterData row = (FilterData) element;
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
	
	class TableCellModifier implements ICellModifier {

		public boolean canModify(Object arg0, String arg1) {
			return true;
		}

		public Object getValue(Object element, String property) {
			Object result = null;
			FilterData row = (FilterData) element;
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
				String[] choices = filterDataTypeNames;
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
			FilterData row = (FilterData) tableItem.getData();

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
				String ctype = filterDataTypeNames[((Integer) value).intValue()].trim();
				if (!row.type.equals(ctype)) {
					row.type = ctype;
				}
			}
			if (row.isBlank()) {
				if (tableItem != filterCriteriaTable.getItem(filterCriteriaTable.getItemCount() - 1)) {
				}
			} else {
				TableItem item = filterCriteriaTable.getItem(filterCriteriaTable.getItemCount() - 1);
				FilterData lastFilterData = (FilterData) item.getData();
				if (!lastFilterData.isBlank()){
					addFilter();
				}
			}
			viewer.update(row, null);
			if(row.propertyName != null && !row.propertyName.equals("") && row.propertyValue != null && !row.propertyValue.equals("")){
				PropertyData prpData = new PropertyData(row.type.equalsIgnoreCase("xml")?DataType.XML:DataType.STRING, row.propertyValue);
				if(prpData.type.name().equals(DataType.XML.name())){
					if(validateXML(prpData.data)){
						filterMap.put(row.propertyName, prpData);
						setFilterMap(filterMap);
					}
					
				}else{
					filterMap.put(row.propertyName, prpData);
					setFilterMap(filterMap);
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
	
	public void addFilter() {
		FilterData filterData = FilterData.getFilterData("", "","");
		viewer.add(filterData);
		TableItem item = filterCriteriaTable.getItem(filterCriteriaTable.getItemCount() - 1);
		item.setData(filterData);
		filterCriteriaTable.setTopIndex(filterCriteriaTable.getItemCount());
		viewer.editElement(filterData, 0);
	}
	
	public static class FilterData {
		String propertyName; 
		String propertyValue;
		String type;
		String currentName;
		String currentValue;
		String cType;
		
		public static FilterData getFilterData(String cPropertyName, String cPropertyValue, String currentType){
			FilterData filterData = new FilterData();
			filterData.propertyName = cPropertyName;
			filterData.propertyValue = cPropertyValue;
			filterData.type = currentType;
			return filterData;
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
	
//	public void getDefaultFilterMap(){
//		String[] properties = {"mediaType", "getPattern", "putPattern", "importPattern", "deletePattern", "putChildPattern",
//				"importChildPattern", "invokeAspectPattern", "movePattern", "copyPattern", "renamePattern", 
//				"createLinkPattern", "removeLinkPattern", "resourceExistsPattern", "addAssociationPattern",
//				"removeAssociationPattern", "getAllAssociationsPattern", "getAssociationsPattern", "applyTagPattern", 
//				"getTagsPattern", "removeTagPattern", "addCommentPattern", "editCommentPattern", "removeCommentPattern",
//				"getCommentsPattern", "rateResourcePattern", "getAverageRatingPattern",
//				"getRatingPattern", "createVersionPattern", "getVersionsPattern", "restoreVersionPattern", "dumpPattern",
//				"restorePattern"};
//
//		for (String string : properties) {
//				filterMap.put(string, "");
//		}
//	}
	
	public void getURLMatcherFilterMap(){
		filterMap = new HashMap<String, PropertyData>();
		String[] properties = {"getPattern", "putPattern", "importPattern", "deletePattern", "putChildPattern",
				"importChildPattern", "invokeAspectPattern", "movePattern", "copyPattern", "renamePattern", 
				"createLinkPattern", "removeLinkPattern", "resourceExistsPattern", "addAssociationPattern",
				"removeAssociationPattern", "getAllAssociationsPattern", "getAssociationsPattern", "applyTagPattern", 
				"getTagsPattern", "removeTagPattern", "addCommentPattern", "editCommentPattern", "removeCommentPattern",
				"getCommentsPattern", "rateResourcePattern", "getAverageRatingPattern",
				"getRatingPattern", "createVersionPattern", "getVersionsPattern", "restoreVersionPattern", "dumpPattern",
				"restorePattern"};

		for (String string : properties) {
				filterMap.put(string, new PropertyData(DataType.STRING, ""));
		}
	}
	
	public void getMediaTypeMatcherFilterMap(){
		filterMap = new HashMap<String, PropertyData>();
		String[] properties = {"mediaType"};

		for (String string : properties) {
				filterMap.put(string, new PropertyData(DataType.STRING,""));
		}
	}
	
	public void getFilterMapForClass(String classname){
		filterMap = new HashMap<String, PropertyData>();
		String selectedPrj = projectListCombo.getText();
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectListCombo.getText());
		IJavaProject javaProject = JavaCore.create(project);
		try {
			IType classType = javaProject.findType(classname);
			IMethod[] methods = classType.getMethods();
			for (IMethod iMethod : methods) {
				if(iMethod.getElementName().startsWith("set")){
					filterMap.put(getFilterPropertyName(iMethod.getElementName()), new PropertyData(DataType.STRING,""));
				}
			}
		} catch (JavaModelException e1) {
			e1.printStackTrace();
		}

		
	}
	
	public String getFilterPropertyName(String methodName){
		String propertyName =  methodName.substring(3);
		Character.toUpperCase(propertyName.toCharArray()[0]);
		return propertyName;
	}
	
	public void loadData(){
		filterCriteriaTable.removeAll();
		for (String property : filterMap.keySet()) {
			TableItem item = new TableItem(filterCriteriaTable, SWT.NONE);
			PropertyData propDate = filterMap.get(property);
			FilterData filterData = FilterData.getFilterData(property, propDate.data, propDate.type.name());
			item.setText(new String[] { filterData.propertyName, filterData.propertyValue });
			item.setData(filterData);
		}
		addFilter();
		
	}
	
	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectName() {
		return projectName;
	}
}