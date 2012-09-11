package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.configure.ui;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.EvaluatorExpressionProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.LogProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.URLRewriteMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.URLRewriteRule;
import org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbFactoryImpl;
import org.eclipse.swt.widgets.Label;


public class ConfigureURLrewriteruleDialog extends Dialog {
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text txtRuleEditor;
	private Table table;
	private Button btnAdd;
	private URLRewriteMediator urlMediator;
	private TransactionalEditingDomain editingDomain;
	private CompoundCommand resultCommand;
	private Table table_1;
	private FormData fd_btnsave_1;
	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public ConfigureURLrewriteruleDialog(Shell parentShell,
			URLRewriteMediator urlMediator,
			TransactionalEditingDomain editingDomain) {
		super(parentShell);
		this.urlMediator = urlMediator;
		this.editingDomain = editingDomain;
	}

	
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
 
		newShell.setText("URLRewirte Mediator Configuration");
	}
	
	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new FormLayout());
		
		txtRuleEditor = formToolkit.createText(container, "New Text", SWT.BORDER | SWT.MULTI);
		txtRuleEditor.setText("");
		FormData fd_txtRuleEditor = new FormData();
		fd_txtRuleEditor.left = new FormAttachment(0, 10);
		txtRuleEditor.setLayoutData(fd_txtRuleEditor);
		
		btnAdd = new Button(container, SWT.NONE);
		FormData fd_btnsave = new FormData();
		fd_btnsave.right = new FormAttachment(100, -32);
		fd_btnsave.top = new FormAttachment(0, 34);
		btnAdd.setLayoutData(fd_btnsave);
		formToolkit.adapt(btnAdd, true, true);
		btnAdd.setText("Add");
		
		btnAdd.addSelectionListener(new SelectionAdapter() {
	        @Override
	        public void widgetSelected(SelectionEvent e) {
	        	String rule ="<equal></equal>";
	        	if(rule!=null && !"".equals(rule)){
	        		EvaluatorExpressionProperty property = EsbFactory.eINSTANCE.createEvaluatorExpressionProperty();
	        		property.setEvaluatorName("Condition");
	        		property.setEvaluatorValue(rule);
	        		URLRewriteRule urlRule = EsbFactory.eINSTANCE.createURLRewriteRule();
	        		urlRule.setUrlRewriteRuleCondition(property);
	        		TableItem item = bindRules(urlRule);
	        	}
	        }
	    });
		
		Button btnRemove = new Button(container, SWT.NONE);
		fd_btnsave.left = new FormAttachment(btnRemove, 0, SWT.LEFT);
		FormData fd_btnRemove = new FormData();
		fd_btnRemove.top = new FormAttachment(btnAdd, 6);
		fd_btnRemove.right = new FormAttachment(100, -32);
		btnRemove.setLayoutData(fd_btnRemove);
		formToolkit.adapt(btnRemove, true, true);
		btnRemove.setText("Remove");

		btnRemove.addSelectionListener(new SelectionAdapter() {
	        @Override
	        public void widgetSelected(SelectionEvent e) {
	           table.remove(table.getSelectionIndices());
	           int selectedIndex = table.getSelectionIndex();
				if (-1 != selectedIndex) {
					unbindRules(selectedIndex);
					if (selectedIndex < table.getItemCount()) {
						table.select(selectedIndex);
					} else {
						table.select(selectedIndex - 1);
					}
				}
	        }
	    });
		
		table = new Table(container, SWT.BORDER | SWT.FULL_SELECTION);
		fd_txtRuleEditor.top = new FormAttachment(table, 17);
		fd_btnRemove.left = new FormAttachment(table, 30);
		FormData fd_table = new FormData();
		fd_table.bottom = new FormAttachment(100, -364);
		fd_table.top = new FormAttachment(0, 10);
		fd_table.right = new FormAttachment(100, -168);
		fd_table.left = new FormAttachment(0, 10);
		table.setLayoutData(fd_table);
		formToolkit.adapt(table);
		formToolkit.paintBordersFor(table);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(100);
		tblclmnNewColumn.setText("Rules");
		
		Button btnsave = new Button(container, SWT.NONE);
		fd_txtRuleEditor.right = new FormAttachment(btnsave, -30);
	    fd_btnsave_1 = new FormData();
	    fd_btnsave_1.right = new FormAttachment(btnAdd, 0, SWT.RIGHT);
	    fd_btnsave_1.top = new FormAttachment(btnRemove, 78);
	    fd_btnsave_1.left = new FormAttachment(btnAdd, 0, SWT.LEFT);
		btnsave.setLayoutData(fd_btnsave_1);
		formToolkit.adapt(btnsave, true, true);
		btnsave.setText("update");
		
		table_1 = new Table(container, SWT.BORDER | SWT.FULL_SELECTION);
		fd_txtRuleEditor.bottom = new FormAttachment(table_1, -35);
		FormData fd_table_1 = new FormData();
		fd_table_1.top = new FormAttachment(0, 295);
		fd_table_1.left = new FormAttachment(0, 10);
		fd_table_1.right = new FormAttachment(100, -10);
		table_1.setLayoutData(fd_table_1);
		formToolkit.adapt(table_1);
		formToolkit.paintBordersFor(table_1);
		table_1.setHeaderVisible(true);
		table_1.setLinesVisible(true);
		
		Button btnNewButton = new Button(container, SWT.NONE);
		fd_table_1.bottom = new FormAttachment(100, -38);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				TableItem item = new TableItem(table_1, SWT.NONE);
				 TableEditor editor = new TableEditor(table_1);
				 
			      CCombo combo = createCombo(new String[]{});
			      editor.grabHorizontal = true;
			      editor.setEditor(combo, item, 0);
			      editor = new TableEditor(table_1);
				
			      
			      
			      
			}

			private CCombo createCombo(String[] values) {
				CCombo combo = new CCombo(table_1, SWT.NONE);
				for (String value : values) {
					combo.add(value);
				}
			      combo.add("Replace");
			      combo.add("Remove");
			      combo.add("Append");
			      combo.add("Prepend");
			      combo.add("Set");
			      combo.select(0);
			      combo.setEditable(false);
				return combo;
			}
		});
		FormData fd_btnNewButton = new FormData();
		fd_btnNewButton.left = new FormAttachment(0, 10);
		fd_btnNewButton.top = new FormAttachment(table_1, 6);
		btnNewButton.setLayoutData(fd_btnNewButton);
		formToolkit.adapt(btnNewButton, true, true);
		btnNewButton.setText("Add Action");
		
		Button btnNewButton_1 = new Button(container, SWT.NONE);
		FormData fd_btnNewButton_1 = new FormData();
		fd_btnNewButton_1.top = new FormAttachment(table_1, 6);
		fd_btnNewButton_1.left = new FormAttachment(btnNewButton, 21);
		btnNewButton_1.setLayoutData(fd_btnNewButton_1);
		formToolkit.adapt(btnNewButton_1, true, true);
		btnNewButton_1.setText("Remove Action");
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		FormData fd_lblNewLabel = new FormData();
		fd_lblNewLabel.bottom = new FormAttachment(table_1, -6);
		
		TableColumn tblclmnNewColumn_1 = new TableColumn(table_1, SWT.NONE);
		tblclmnNewColumn_1.setWidth(100);
		tblclmnNewColumn_1.setText("Action");
		
		TableColumn tblclmnNewColumn_2 = new TableColumn(table_1, SWT.NONE);
		tblclmnNewColumn_2.setWidth(100);
		tblclmnNewColumn_2.setText("Fragment");
		
		TableColumn tblclmnNewColumn_3 = new TableColumn(table_1, SWT.NONE);
		tblclmnNewColumn_3.setWidth(83);
		tblclmnNewColumn_3.setText("Option");
		
		TableColumn tblclmnNewColumn_4 = new TableColumn(table_1, SWT.NONE);
		tblclmnNewColumn_4.setWidth(100);
		tblclmnNewColumn_4.setText("Value/Expression");
		
		TableColumn tblclmnNewColumn_5 = new TableColumn(table_1, SWT.NONE);
		tblclmnNewColumn_5.setWidth(145);
		tblclmnNewColumn_5.setText("Namespace Editor");
		
		TableColumn tblclmnNewColumn_6 = new TableColumn(table_1, SWT.NONE);
		tblclmnNewColumn_6.setWidth(100);
		tblclmnNewColumn_6.setText("Regex");
		fd_lblNewLabel.left = new FormAttachment(0, 10);
		lblNewLabel.setLayoutData(fd_lblNewLabel);
		formToolkit.adapt(lblNewLabel, true, true);
		lblNewLabel.setText("Actions");
		btnsave.addSelectionListener(new SelectionAdapter() {
	        @Override
	        public void widgetSelected(SelectionEvent e) {
	        	String rule =txtRuleEditor.getText();
	        	if(rule!=null && !"".equals(rule)){
	        		TableItem item = table.getItem(table.getSelectionIndex());
	        		URLRewriteRule urlRule =(URLRewriteRule)item.getData();
	        		EvaluatorExpressionProperty urlRewriteRuleCondition = urlRule.getUrlRewriteRuleCondition();
	        		urlRewriteRuleCondition.setEvaluatorValue(rule);
	        		item.setText(urlRule.getUrlRewriteRuleCondition().getEvaluatorValue());	
	        	}
	        }
	    });
		
		table.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
		           int selectedIndex = table.getSelectionIndex();
		            TableItem item = table.getItem(selectedIndex);
		            txtRuleEditor.setText(item.getText());
		        }	
		});
		EList<URLRewriteRule> urlRewriteRules = urlMediator.getUrlRewriteRules();
		for (URLRewriteRule urlRewriteRule : urlRewriteRules) {
			bindRules(urlRewriteRule);
		}
		return container;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(620, 552);
	}
	
	
	
	private TableItem bindRules(URLRewriteRule rule) {
		TableItem item = new TableItem(table, SWT.NONE);
	    item.setText(rule.getUrlRewriteRuleCondition().getEvaluatorValue());
		item.setData(rule);
		return item;
	}

	/**
	 * Removes the corresponding table item from the table and records a command
	 * for detaching the corresponding log property from the model.
	 * 
	 * @param itemIndex
	 *            index of the row which is to be removed.
	 */
   private void unbindRules(int itemIndex) {
		TableItem item =table.getItem(itemIndex);
		URLRewriteRule rule = (URLRewriteRule) item.getData();
		if (null != rule.eContainer()) {
			RemoveCommand removeCmd = new RemoveCommand(editingDomain,
					urlMediator, EsbPackage.Literals.URL_REWRITE_MEDIATOR__URL_REWRITE_RULES,rule);
			getResultCommand().append(removeCmd);
		}
		table.remove(table.indexOf(item));
	} 

	private CompoundCommand getResultCommand() {
		if (null == resultCommand) {
			resultCommand = new CompoundCommand();
		}
		return resultCommand;
	}
	
	protected void okPressed() {
		
		 TableItem[] items = table.getItems();
		 for (TableItem tableItem : items) {
			 URLRewriteRule rule = (URLRewriteRule) tableItem.getData();

		AddCommand addCmd = new AddCommand(
				editingDomain,
				urlMediator,
				EsbPackage.Literals.URL_REWRITE_MEDIATOR__URL_REWRITE_RULES,
				rule);
		     getResultCommand().append(addCmd);			 
		}

			// Apply changes.
			if (getResultCommand().canExecute()) {
				editingDomain.getCommandStack().execute(getResultCommand());
			} 

			super.okPressed();
	}
}
