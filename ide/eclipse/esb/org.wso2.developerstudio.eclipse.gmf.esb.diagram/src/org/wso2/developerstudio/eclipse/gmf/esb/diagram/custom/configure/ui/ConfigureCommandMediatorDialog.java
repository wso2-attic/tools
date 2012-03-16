package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.configure.ui;
/*package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.configure.ui;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.wso2.developerstudio.eclipse.gmf.esb.CommandMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.CommandProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.XQueryMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.XQueryVariable;

public class ConfigureCommandMediatorDialog extends Dialog{

	private CommandMediator commandMediator;
	private TransactionalEditingDomain editingDomain;
	private Button newCommandPropertyButton;
	private Label commandPropertyLabel;
	private Table commandPropertyTable;
	private Button removeCommandPropertyButton;
	
	protected ConfigureCommandMediatorDialog(Shell parentShell,
			CommandMediator commandMediator, TransactionalEditingDomain editingDomain) {
		super(parentShell);
		this.commandMediator = commandMediator;
		this.editingDomain = editingDomain;
	}
	
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);

		// Set title.
		newShell.setText("Command Mediator Configuration");
	}
	
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		FormLayout mainLayout = new FormLayout();
		mainLayout.marginHeight = 5;
		mainLayout.marginWidth = 5;
		container.setLayout(mainLayout);
		
		newCommandPropertyButton = new Button(container, SWT.NONE);
		{
			newCommandPropertyButton.setText("New...");
			FormData newCommandPropertyButtonLayoutData = new FormData(80,
					SWT.DEFAULT);
			newCommandPropertyButtonLayoutData.top = new FormAttachment(
					commandPropertyLabel, 10);
			newCommandPropertyButtonLayoutData.right = new FormAttachment(100);
			newCommandPropertyButton.setLayoutData(newCommandPropertyButtonLayoutData);

			newCommandPropertyButton.addListener(SWT.Selection, new Listener() {
				public void handleEvent(Event event) {
					TableItem item = bindCommandProperty(EsbFactory.eINSTANCE
							.createCommandProperty());
					commandPropertyTable.select(commandPropertyTable.indexOf(item));
				}
			});
		}
		
		removeCommandPropertyButton = new Button(container, SWT.NONE);
		{
			removeCommandPropertyButton.setText("Remove");
			FormData removeCommandPropertyButtonLayoutData = new FormData();
			removeCommandPropertyButtonLayoutData.top = new FormAttachment(
					newCommandPropertyButton, 5);
			removeCommandPropertyButtonLayoutData.right = new FormAttachment(100);
			removeCommandPropertyButtonLayoutData.left = new FormAttachment(
					newCommandPropertyButton, 0, SWT.LEFT);
			removeCommandPropertyButton
					.setLayoutData(removeCommandPropertyButtonLayoutData);

			removeCommandPropertyButton.addListener(SWT.Selection, new Listener() {
				public void handleEvent(Event event) {
					int selectedIndex = commandPropertyTable.getSelectionIndex();
					if (-1 != selectedIndex) {
						unbindCommandProperty(selectedIndex);

						// Select the next available candidate for deletion.
						if (selectedIndex < commandPropertyTable.getItemCount()) {
							commandPropertyTable.select(selectedIndex);
						} else {
							commandPropertyTable.select(selectedIndex - 1);
						}
					}
				}
			});
		}
		
		commandPropertyTable = new Table(container, SWT.BORDER
				| SWT.FULL_SELECTION | SWT.HIDE_SELECTION);
		{
			TableColumn nameColumn = new TableColumn(commandPropertyTable,
					SWT.LEFT);		
			TableColumn typeColumn = new TableColumn(commandPropertyTable,
					SWT.LEFT);
			TableColumn valueColumn = new TableColumn(commandPropertyTable,
					SWT.LEFT);
			
			nameColumn.setText("Name");
			nameColumn.setWidth(150);
			valueColumn.setText("Value Type");
			valueColumn.setWidth(200);
			typeColumn.setText("Value");
			typeColumn.setWidth(150);

			commandPropertyTable.setHeaderVisible(true);
			commandPropertyTable.setLinesVisible(true);

			Listener tblPropertiesListener = new Listener() {
				
				public void handleEvent(Event evt) {
					if (null != evt.item) {
						if (evt.item instanceof TableItem) {
							TableItem item = (TableItem) evt.item;
							editItem(item);
						}
					} 
				}
			};

			commandPropertyTable
					.addListener(SWT.Selection, tblPropertiesListener);

			// Populate properties.
			for (CommandProperty property : commandMediator.getProperties()) {
				bindCommandProperty(property);
			}

			// In-line editing of properties.
			setupTableEditor(commandPropertyTable);

			// Layout.
			FormData commandPropertyTableLayoutData = new FormData(SWT.DEFAULT,
					150);
			commandPropertyTableLayoutData.top = new FormAttachment(
					newCommandPropertyButton, 0, SWT.TOP);
			commandPropertyTableLayoutData.left = new FormAttachment(0);
			commandPropertyTableLayoutData.right = new FormAttachment(
					newCommandPropertyButton, -5);
			commandPropertyTableLayoutData.bottom = new FormAttachment(100);
			commandPropertyTable.setLayoutData(commandPropertyTableLayoutData);
		}

		return container;
	}
	
	private TableItem bindCommandProperty(CommandProperty property) {
		TableItem item = new TableItem(commandPropertyTable, SWT.NONE);
		if (property.getValueType().getLiteral().equals("LITERAL")) {
			item.setText(new String[] { property.getPropertyName(),
					property.getValueType().getLiteral(),
					property.getValueLiteral()});
		}
		if (property.getValueType().getLiteral().equals("EXPRESSION")) {
			if(property.getValueKey()==null){
				
			}else{
				
			}
			item.setText(new String[] { variable.getVariableName(),
					property.getVariableType().getLiteral(),
					property.getValueExpression().getPropertyValue(),
					property.getValueType().getLiteral(),
					property.getValueKey().getKeyValue()});
		}

		item.setData(property);
		return item;
	}
	
	private void unbindCommandProperty(int itemIndex) {
		TableItem item = commandPropertyTable.getItem(itemIndex);
		XQueryVariable variable = (XQueryVariable) item.getData();
		if (null != variable.eContainer()) {
			RemoveCommand removeCmd = new RemoveCommand(editingDomain,
					commandMediator, EsbPackage.Literals.COMMAND_MEDIATOR__PROPERTIES,
					variable);
			getResultCommand().append(removeCmd);
		}
		commandPropertyTable.remove(commandPropertyTable.indexOf(item));
	}
	
	private void editItem(final TableItem item) {
		valueTypeEditor = initTableEditor(valueTypeEditor,
				item.getParent());
		cmbValueType = new Combo(item.getParent(), SWT.READ_ONLY);
		cmbValueType.setItems(new String[] { "LITERAL", "EXPRESSION" });
		cmbValueType.setText(item.getText(3));
		valueTypeEditor.setEditor(cmbValueType, item, 3);
		
		variableTypeEditor = initTableEditor(variableTypeEditor,
				item.getParent());
		cmbVariableType=new Combo(item.getParent(), SWT.READ_ONLY);
		cmbVariableType.setItems(new String[]{"DOCUMENT","DOCUMENT_ELEMENT","ELEMENT","INT","INTEGER","BOOLEAN","BYTE","DOUBLE","SHORT","LONG","FLOAT","STRING"});		
		cmbVariableType.setText(item.getText(1));
		variableTypeEditor.setEditor(cmbVariableType, item, 1);
		item.getParent().redraw();
		item.getParent().layout();
		cmbValueType.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event evt) {
				item.setText(3, cmbValueType.getText());
			}
		});
		cmbVariableType.addListener(SWT.Selection, new Listener() {			
			public void handleEvent(Event evt) {
				item.setText(1, cmbVariableType.getText());
			}
		});
	}
	
	private void setupTableEditor(final Table table) {
		final TableEditor cellEditor = new TableEditor(table);
		cellEditor.grabHorizontal = true;
		cellEditor.minimumWidth = 50;
		table.addMouseListener(new MouseAdapter() {
			*//**
			 * Setup a new cell editor control at double click event.
			 *//*
			public void mouseDoubleClick(MouseEvent e) {
				// Dispose the old editor control (if one is setup).
				Control oldEditorControl = cellEditor.getEditor();
				if (null != oldEditorControl)
					oldEditorControl.dispose();

				// Mouse location.
				Point mouseLocation = new Point(e.x, e.y);

				// Grab the selected row.
				TableItem item = (TableItem) table.getItem(mouseLocation);
				if (null == item)
					return;

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
							cellEditor.getItem().setText(editorControlColumn,
									text.getText());
						}
					});
					editorControl.selectAll();
					editorControl.setFocus();
					cellEditor.setEditor(editorControl, item, selectedColumn);
				}
			}

			*//**
			 * Dispose cell editor control at mouse down (otherwise the control
			 * keep showing).
			 *//*
			public void mouseDown(MouseEvent e) {
				Control oldEditorControl = cellEditor.getEditor();
				if (null != oldEditorControl)
					oldEditorControl.dispose();
			}
		});
	}
	
	private CompoundCommand getResultCommand() {
		if (null == resultCommand) {
			resultCommand = new CompoundCommand();
		}
		return resultCommand;
	}

	


}
*/