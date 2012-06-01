/*
 * Copyright 2011 WSO2, Inc. (http://wso2.com)
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

package org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.custom.configure.ui;


import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.XSLTFeature;
import org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.XSLTProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.XSLTResource;

public class ConfigureXSLTMediatorDialog extends Dialog {

	public static final int TAB_BASIC = 0;
	public static final int TAB_FEATURES = 1;
	public static final int TAB_PROPERTIES = 2;
	public static final int TAB_RESOURCES = 3;
	private Table tblFeatures;
	private Table tblProperties;
	private Table tableResources;
	private Text txtSourceXPath;
	private Text txtXsltKey;
	private int activeTab;
	TabFolder tabFolder;
	TabItem tbtmBasic;
	TabItem tbtmFeatures;
	TabItem tbtmProperties;
	TabItem tbtmResources;
	XSLTMediator mediator;
	TransactionalEditingDomain domain;
	private CompoundCommand resultCommand;
	/**
	 * Dialog shell.
	 */
	private Shell dialogShell;
	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public ConfigureXSLTMediatorDialog(Shell parentShell, XSLTMediator med,
			int activeTab) {
		super(parentShell);
		dialogShell = new Shell(parentShell, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
		
		this.mediator = med;
		this.activeTab = activeTab;
		domain = TransactionUtil.getEditingDomain(mediator);
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(null);

		tabFolder = new TabFolder(container, SWT.NONE);
		tabFolder.setBounds(0, 0, 444, 221);

		tbtmBasic = new TabItem(tabFolder, SWT.NONE);
		tbtmBasic.setText("Basic");

		Composite cBasic = new Composite(tabFolder, SWT.NONE);
		tbtmBasic.setControl(cBasic);

		Label lblSourceXPath = new Label(cBasic, SWT.NONE);
		lblSourceXPath.setBounds(10, 24, 76, 15);
		lblSourceXPath.setText("Source XPath");

		Label lblXsltKey = new Label(cBasic, SWT.NONE);
		lblXsltKey.setBounds(10, 57, 55, 15);
		lblXsltKey.setText("XSLT Key");

		txtSourceXPath = new Text(cBasic, SWT.BORDER);
		txtSourceXPath.setBounds(87, 21, 256, 21);

		txtXsltKey = new Text(cBasic, SWT.BORDER);
		txtXsltKey.setBounds(87, 54, 256, 21);

		Button cmdBrowseSourceXPath = new Button(cBasic, SWT.NONE);
		cmdBrowseSourceXPath.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				XPathSelectorDialog sourceXPathDialog = new XPathSelectorDialog(
						dialogShell);
				sourceXPathDialog.open();
				if (sourceXPathDialog.getSelectedXpath() != null) {
					txtSourceXPath.setText(sourceXPathDialog.getSelectedXpath());
				}
			}
		});
		cmdBrowseSourceXPath.setText("...");
		cmdBrowseSourceXPath.setBounds(345, 21, 20, 20);

		Button cmdXsltKey = new Button(cBasic, SWT.NONE);
		cmdXsltKey.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
			}
		});
		cmdXsltKey.setText("...");
		cmdXsltKey.setBounds(345, 54, 20, 20);
		
		//TODO: add registry browser support
		cmdXsltKey.setVisible(false);

		tbtmFeatures = new TabItem(tabFolder, SWT.NONE);
		tbtmFeatures.setText("Features");

		Composite cFeatures = new Composite(tabFolder, SWT.NONE);
		tbtmFeatures.setControl(cFeatures);

		tblFeatures = new Table(cFeatures, SWT.BORDER | SWT.CHECK
				| SWT.FULL_SELECTION);
		tblFeatures.setBounds(10, 10, 335, 162);
		tblFeatures.setHeaderVisible(true);
		tblFeatures.setLinesVisible(true);

		TableColumn colFeatureName = new TableColumn(tblFeatures, SWT.NONE);
		colFeatureName.setWidth(284);
		colFeatureName.setText("Name\t\t\t\t\t");
		
		colFeatureName.pack();
		Button cmdNewFeature = new Button(cFeatures, SWT.NONE);
		cmdNewFeature.setBounds(351, 10, 75, 25);
		cmdNewFeature.setText("New");
		cmdNewFeature.addSelectionListener( new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				TableItem item = new TableItem(tblFeatures, SWT.NONE);
				tblFeatures.select(tblFeatures.indexOf(item));	
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {}
		});

		Button cmdRemoveFeature = new Button(cFeatures, SWT.NONE);
		cmdRemoveFeature.setBounds(351, 41, 75, 25);
		cmdRemoveFeature.setText("Remove");
		cmdRemoveFeature.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				if(tblFeatures.getSelectionIndex()!=-1)
					tblFeatures.remove(tblFeatures.getSelectionIndex());
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {}
		});

		Button btnCheckButton = new Button(cFeatures, SWT.CHECK);
		btnCheckButton.setBounds(162, 41, 93, 16);
		btnCheckButton.setText("Check Button");

		tbtmProperties = new TabItem(tabFolder, SWT.NONE);
		tbtmProperties.setText("Properties");

		Composite cProperties = new Composite(tabFolder, SWT.NONE);
		tbtmProperties.setControl(cProperties);

		tblProperties = new Table(cProperties, SWT.BORDER | SWT.FULL_SELECTION);
		tblProperties.setLinesVisible(true);
		tblProperties.setHeaderVisible(true);
		tblProperties.setBounds(10, 10, 335, 162);

		TableColumn colPropertyName = new TableColumn(tblProperties, SWT.NONE);
		colPropertyName.setWidth(142);
		colPropertyName.setText("Name");

		TableColumn colPropertyValue = new TableColumn(tblProperties, SWT.NONE);
		colPropertyValue.setWidth(167);
		colPropertyValue.setText("Value");

		Button cmdNewProperty = new Button(cProperties, SWT.NONE);
		cmdNewProperty.setText("New");
		cmdNewProperty.setBounds(351, 10, 75, 25);
		cmdNewProperty.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				TableItem item = new TableItem(tblProperties, SWT.NONE);
				tblProperties.select(tblProperties.indexOf(item));
				
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {}
		});

		Button cmdRemoveProperty = new Button(cProperties, SWT.NONE);
		cmdRemoveProperty.setText("Remove");
		cmdRemoveProperty.setBounds(351, 41, 75, 25);
		cmdRemoveProperty.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				if(tblProperties.getSelectionIndex()!=-1)
					tblProperties.remove(tblProperties.getSelectionIndex());
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {}
		});

		tbtmResources = new TabItem(tabFolder, SWT.NONE);
		tbtmResources.setText("Resources");

		Composite cResources = new Composite(tabFolder, SWT.NONE);
		tbtmResources.setControl(cResources);

		tableResources = new Table(cResources, SWT.BORDER | SWT.FULL_SELECTION);
		tableResources.setLinesVisible(true);
		tableResources.setHeaderVisible(true);
		tableResources.setBounds(10, 10, 335, 162);

		TableColumn colResourceKey = new TableColumn(tableResources, SWT.NONE);
		colResourceKey.setWidth(100);
		colResourceKey.setText("Key");

		TableColumn colResourceLocation = new TableColumn(tableResources,
				SWT.NONE);
		colResourceLocation.setWidth(211);
		colResourceLocation.setText("Location");

		Button cmdNewResource = new Button(cResources, SWT.NONE);
		cmdNewResource.setText("New");
		cmdNewResource.setBounds(351, 10, 75, 25);
		cmdNewResource.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				TableItem item = new TableItem(tableResources, SWT.NONE);
				tableResources.select(tableResources.indexOf(item));
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {}
		});

		Button cmdRemoveResource = new Button(cResources, SWT.NONE);
		cmdRemoveResource.setText("Remove");
		cmdRemoveResource.setBounds(351, 41, 75, 25);
		cmdRemoveResource.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				if(tableResources.getSelectionIndex()!=-1)
					tableResources.remove(tableResources.getSelectionIndex());
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {}
		});
		
		NamespacedProperty sourceXPath = mediator.getSourceXPath();
		if(sourceXPath.getPropertyValue()!=null){
			txtSourceXPath.setText(sourceXPath.getPropertyValue());
		}
		
		RegistryKeyProperty registryKey = mediator.getXsltKey();
		if(registryKey.getKeyValue()!=null){
			txtXsltKey.setText(registryKey.getKeyValue());
		}


		switch (activeTab) {
		case TAB_FEATURES:
			tabFolder.setSelection(tbtmFeatures);
			break;
		case TAB_PROPERTIES:
			tabFolder.setSelection(tbtmProperties);
			break;
		case TAB_RESOURCES:
			tabFolder.setSelection(tbtmResources);
			break;
		default:
			tabFolder.setSelection(tbtmBasic);
			break;
		}
		
		 setupTableEditor(tblFeatures);
		 setupTableEditor(tblProperties);
		 setupTableEditor(tableResources);
		 
		for (XSLTFeature feature : mediator.getFeatures()) {
			TableItem item = new TableItem(tblFeatures, SWT.NONE);
			item.setText(feature.getFeatureName());
			item.setChecked(feature.isFeatureEnabled());
		}
			
		for (XSLTProperty property : mediator.getProperties()) {
			TableItem item = new TableItem(tblProperties, SWT.NONE);
			item.setText(0, property.getPropertyName());
			item.setText(1, property.getPropertyValue());
		}

		for (XSLTResource resource : mediator.getResources()) {
			TableItem item = new TableItem(tableResources, SWT.NONE);
			item.setText(0, resource.getKey().getKeyValue());
			item.setText(1, resource.getLocation());
		}
			
		return container;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 * 
	 */
	
	protected void okPressed() {
		
		for (XSLTFeature feature: mediator.getFeatures()){
			RemoveCommand removeCmd = new RemoveCommand(domain, mediator,EsbPackage.Literals.XSLT_MEDIATOR__FEATURES, feature) ;
			getResultCommand().append(removeCmd);
		}
		
		for (XSLTProperty property:mediator.getProperties()){
			RemoveCommand removeCmd = new RemoveCommand(domain, mediator,EsbPackage.Literals.XSLT_MEDIATOR__PROPERTIES,property) ;
			getResultCommand().append(removeCmd);
		}

		for(XSLTResource resource:mediator.getResources()){
			RemoveCommand removeCmd = new RemoveCommand(domain, mediator,EsbPackage.Literals.XSLT_MEDIATOR__RESOURCES, resource) ;
			getResultCommand().append(removeCmd);
		}
		
		NamespacedProperty sourceXPath= EsbFactory.eINSTANCE.createNamespacedProperty();
		sourceXPath.setPropertyName(txtSourceXPath.getText());
		sourceXPath.setPropertyValue(txtSourceXPath.getText());
		SetCommand setCmd = new SetCommand(domain, mediator,EsbPackage.Literals.XSLT_MEDIATOR__SOURCE_XPATH, sourceXPath);
		getResultCommand().append(setCmd);
		
		RegistryKeyProperty registryKey = EsbFactory.eINSTANCE.createRegistryKeyProperty();
		registryKey.setKeyName(txtXsltKey.getText());
		registryKey.setKeyValue(txtXsltKey.getText());
		SetCommand setRegKeyCmd = new SetCommand(domain, mediator,EsbPackage.Literals.XSLT_MEDIATOR__XSLT_KEY, registryKey);
		getResultCommand().append(setRegKeyCmd);
		
		for(TableItem item:tblFeatures.getItems()){
			XSLTFeature feature = EsbFactory.eINSTANCE.createXSLTFeature(); 
			feature.setFeatureName(item.getText());
			feature.setFeatureEnabled(item.getChecked());

			AddCommand addCmd = new AddCommand(domain, mediator,EsbPackage.Literals.XSLT_MEDIATOR__FEATURES, feature);
			getResultCommand().append(addCmd);
		}
		for(TableItem item:tblProperties.getItems()){
			XSLTProperty property = EsbFactory.eINSTANCE.createXSLTProperty();
			property.setPropertyName(item.getText(0));
			property.setPropertyValue(item.getText(1));

			AddCommand addCmd = new AddCommand(domain, mediator,EsbPackage.Literals.XSLT_MEDIATOR__PROPERTIES,property);
			getResultCommand().append(addCmd);
		}
		for(TableItem item:tableResources.getItems()){
			XSLTResource resource = EsbFactory.eINSTANCE.createXSLTResource();
			RegistryKeyProperty key = EsbFactory.eINSTANCE.createRegistryKeyProperty();
			key.setKeyName(item.getText(1));
			key.setKeyValue(item.getText(1));
			resource.setKey(key);
			resource.setLocation(item.getText(1));

			AddCommand addCmd = new AddCommand(domain, mediator,EsbPackage.Literals.XSLT_MEDIATOR__RESOURCES, resource);
			getResultCommand().append(addCmd);
		}
		
		if (getResultCommand().canExecute()) {
			domain.getCommandStack().execute(getResultCommand());
		}
		
		super.okPressed();
	}
	
	private CompoundCommand getResultCommand() {
		if (null == resultCommand) {
			resultCommand = new CompoundCommand();
		}
		return resultCommand;
	}
	
	protected void cancelPressed() {
		
		super.cancelPressed();
	}

	/**
	 * Return the initial size of the dialog.
	 */
	protected Point getInitialSize() {
		return new Point(450, 300);
	}
	
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText("XSLT Mediator Configuration");
	}
	
	/**
	 * Sets up a table editor that allows users to edit cell values inline.
	 * 
	 * @param table table against which a table editor is setup.
	 */
	private void setupTableEditor(final Table table) {
		final TableEditor cellEditor = new TableEditor(table);
		cellEditor.grabHorizontal = true;
		cellEditor.minimumWidth = 50;			
		table.addMouseListener(new MouseAdapter() {
			/**
			 * Setup a new cell editor control at double click event.
			 */
			public void mouseDoubleClick(MouseEvent e) {
				// Dispose the old editor control (if one is setup).
				Control oldEditorControl = cellEditor.getEditor();
				if (null != oldEditorControl) oldEditorControl.dispose();					
				
				// Mouse location.
				Point mouseLocation = new Point(e.x, e.y);
				
				// Grab the selected row.					
				TableItem item = (TableItem) table.getItem(mouseLocation);
				if (null == item) return;
				
				// Determine which column was selected.					
				int selectedColumn = -1;					
				for (int i = 0, n = table.getColumnCount(); i < n; i++) {
					if (item.getBounds(i).contains(mouseLocation)) {
						selectedColumn = i;
						break;
					}
				}
				
				// Setup a new editor control.
				if (-1 != selectedColumn) {
					Text editorControl = new Text(table, SWT.NONE);
					final int editorControlColumn = selectedColumn;
					editorControl.setText(item.getText(selectedColumn));
					editorControl.addModifyListener(new ModifyListener() {							
						public void modifyText(ModifyEvent e) {
							Text text = (Text) cellEditor.getEditor();
							cellEditor.getItem().setText(editorControlColumn, text.getText());
						}
					});
					editorControl.selectAll();
					editorControl.setFocus();
					cellEditor.setEditor(editorControl, item, selectedColumn);
				}										
			}	
			
			/**
			 * Dispose cell editor control at mouse down (otherwise the control keep showing).
			 */
			public void mouseDown(MouseEvent e) {
				Control oldEditorControl = cellEditor.getEditor();
				if (null != oldEditorControl) oldEditorControl.dispose();		
			}
		});
	}		

}
