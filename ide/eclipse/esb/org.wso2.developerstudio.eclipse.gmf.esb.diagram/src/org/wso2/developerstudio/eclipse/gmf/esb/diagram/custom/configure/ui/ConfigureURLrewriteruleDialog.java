package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.configure.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.EvaluatorExpressionProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleActionType;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleFragmentType;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleOptionType;
import org.wso2.developerstudio.eclipse.gmf.esb.URLRewriteMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.URLRewriteRule;
import org.wso2.developerstudio.eclipse.gmf.esb.URLRewriteRuleAction;


public class ConfigureURLrewriteruleDialog extends Dialog {
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text txtRuleEditor;
	private Table tableRules;
	private Button btnAdd;
	private URLRewriteMediator urlMediator;
	private TransactionalEditingDomain editingDomain;
	private CompoundCommand resultCommand;
	private Table tableActions;

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

	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new FormLayout());
		final Shell newshell = parent.getShell();
		
		txtRuleEditor = formToolkit.createText(container,null,SWT.BORDER | SWT.MULTI);
		txtRuleEditor.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent arg0) {
				String rule = txtRuleEditor.getText();
				if(rule!=null){
					int selectionIndex = tableRules.getSelectionIndex();
				if(selectionIndex>-1){
				TableItem item = tableRules.getItem(selectionIndex);
				item.setText(txtRuleEditor.getText());
				EvaluatorExpressionProperty property = EsbFactory.eINSTANCE.createEvaluatorExpressionProperty();
        		property.setEvaluatorName("Condition");
        		property.setEvaluatorValue(rule);
			    UrlRewriteRulesWrapper wraprule =  (UrlRewriteRulesWrapper) item.getData();
			    wraprule.setCondition(property);
				}
				}
			}
		});
		//txtRuleEditor.setText("");
		FormData fd_txtRuleEditor = new FormData();
		fd_txtRuleEditor.right = new FormAttachment(100, -168);
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
	        	String rule ="<equal/>";
	        	if(rule!=null && !"".equals(rule)){
	        		EvaluatorExpressionProperty property = EsbFactory.eINSTANCE.createEvaluatorExpressionProperty();
	        		property.setEvaluatorName("Condition");
	        		property.setEvaluatorValue(rule);
	        		UrlRewriteRulesWrapper rulesWrapper = new UrlRewriteRulesWrapper();
	        		rulesWrapper.setCondition(property);
	        		rulesWrapper.setActions(new ArrayList<UrlActionWrapper>());
	        		rulesWrapper.setUrlRule(EsbFactory.eINSTANCE.createURLRewriteRule());
	        		TableItem item = bindRules(rulesWrapper);
	        		item.setText(rule);
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
	           tableRules.remove(tableRules.getSelectionIndices());
	           int selectedIndex = tableRules.getSelectionIndex();
				if (-1 != selectedIndex) {
					unbindRules(selectedIndex);
					if (selectedIndex < tableRules.getItemCount()) {
						tableRules.select(selectedIndex);
					} else {
						tableRules.select(selectedIndex - 1);
					}
				}
	        }
	    });
		
		tableRules = new Table(container, SWT.BORDER | SWT.FULL_SELECTION);
		fd_txtRuleEditor.top = new FormAttachment(tableRules, 17);
		fd_btnRemove.left = new FormAttachment(tableRules, 30);
		FormData fd_tableRules = new FormData();
		fd_tableRules.bottom = new FormAttachment(100, -364);
		fd_tableRules.top = new FormAttachment(0, 10);
		fd_tableRules.right = new FormAttachment(100, -168);
		fd_tableRules.left = new FormAttachment(0, 10);
		tableRules.setLayoutData(fd_tableRules);
		formToolkit.adapt(tableRules);
		formToolkit.paintBordersFor(tableRules);
		tableRules.setHeaderVisible(true);
		tableRules.setLinesVisible(true);
		
		TableColumn tblclmnNewColumn = new TableColumn(tableRules, SWT.NONE);
		tblclmnNewColumn.setWidth(100);
		tblclmnNewColumn.setText("Rules");
		
		tableActions = new Table(container, SWT.BORDER | SWT.FULL_SELECTION);
		fd_txtRuleEditor.bottom = new FormAttachment(tableActions, -35);
		FormData fd_tableActions = new FormData();
		fd_tableActions.top = new FormAttachment(0, 295);
		fd_tableActions.left = new FormAttachment(0, 10);
		fd_tableActions.right = new FormAttachment(100, -10);
		tableActions.setLayoutData(fd_tableActions);
		formToolkit.adapt(tableActions);
		formToolkit.paintBordersFor(tableActions);
		tableActions.setHeaderVisible(true);
		tableActions.setLinesVisible(true);
		
		Button btnAddAction = new Button(container, SWT.NONE);
		fd_tableActions.bottom = new FormAttachment(100, -38);
		btnAddAction.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				   final URLRewriteRuleAction action = EsbFactory.eINSTANCE.createURLRewriteRuleAction();
				   TableItem item = tableRules.getItem(tableRules.getSelectionIndex());
				   UrlRewriteRulesWrapper wraprule =  (UrlRewriteRulesWrapper) item.getData();
				   UrlActionWrapper urlActionWrapper = new UrlActionWrapper();
				   createActionContorls(urlActionWrapper,newshell,true);
				   wraprule.getActions().add(urlActionWrapper);
		     }
		});
		
		FormData fd_btnAddAction = new FormData();
		fd_btnAddAction.left = new FormAttachment(0, 10);
		fd_btnAddAction.top = new FormAttachment(tableActions, 6);
		btnAddAction.setLayoutData(fd_btnAddAction);
		formToolkit.adapt(btnAddAction, true, true);
		btnAddAction.setText("Add Action");
		
		Button btnRemoveAction = new Button(container, SWT.NONE);
		btnRemoveAction.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				tableActions.remove(tableActions.getSelectionIndices());
		           int selectedIndex = tableActions.getSelectionIndex();
					if (-1 != selectedIndex) {
						if (selectedIndex < tableActions.getItemCount()) {
							tableActions.select(selectedIndex);
						} else {
							tableActions.select(selectedIndex - 1);
						}
				  }
			 }
		});
		FormData fd_btnRemoveAction = new FormData();
		fd_btnRemoveAction.top = new FormAttachment(tableActions, 6);
		fd_btnRemoveAction.left = new FormAttachment(btnAddAction, 21);
		btnRemoveAction.setLayoutData(fd_btnRemoveAction);
		formToolkit.adapt(btnRemoveAction, true, true);
		btnRemoveAction.setText("Remove Action");
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		FormData fd_lblNewLabel = new FormData();
		fd_lblNewLabel.bottom = new FormAttachment(tableActions, -6);
		
		TableColumn tblclmnNewColumn_1 = new TableColumn(tableActions, SWT.NONE);
		tblclmnNewColumn_1.setWidth(100);
		tblclmnNewColumn_1.setText("Action");
		
		TableColumn tblclmnNewColumn_2 = new TableColumn(tableActions, SWT.NONE);
		tblclmnNewColumn_2.setWidth(100);
		tblclmnNewColumn_2.setText("Fragment");
		
		TableColumn tblclmnNewColumn_3 = new TableColumn(tableActions, SWT.NONE);
		tblclmnNewColumn_3.setWidth(83);
		tblclmnNewColumn_3.setText("Option");
		
		TableColumn tblclmnNewColumn_4 = new TableColumn(tableActions, SWT.NONE);
		tblclmnNewColumn_4.setWidth(139);
		tblclmnNewColumn_4.setText("Value/Expression");
		
		TableColumn tblclmnNewColumn_5 = new TableColumn(tableActions, SWT.NONE);
		tblclmnNewColumn_5.setWidth(92);
		tblclmnNewColumn_5.setText("Editor");
		
		TableColumn tblclmnNewColumn_6 = new TableColumn(tableActions, SWT.NONE);
		tblclmnNewColumn_6.setWidth(100);
		tblclmnNewColumn_6.setText("Regex");
		fd_lblNewLabel.left = new FormAttachment(0, 10);
		lblNewLabel.setLayoutData(fd_lblNewLabel);
		formToolkit.adapt(lblNewLabel, true, true);
		lblNewLabel.setText("Actions");
		
		tableRules.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
		           int selectedIndex = tableRules.getSelectionIndex();
		            TableItem item = tableRules.getItem(selectedIndex);
		            UrlRewriteRulesWrapper wraprule =  (UrlRewriteRulesWrapper)item.getData();
		            txtRuleEditor.setText(wraprule.getCondition().getEvaluatorValue());
		            List<UrlActionWrapper> actions = wraprule.getActions();
		            for (UrlActionWrapper urlActionWrapper : actions) {
		            	createActionContorls(urlActionWrapper, newshell, false);
					}
		        }	
		});
		
		EList<URLRewriteRule> urlRewriteRules = urlMediator.getUrlRewriteRules();
		for (URLRewriteRule urlRewriteRule : urlRewriteRules) {
			
			 UrlRewriteRulesWrapper rulesWrapper = new UrlRewriteRulesWrapper();
			 rulesWrapper.setCondition(EsbFactory.eINSTANCE.copyEvaluatorExpressionProperty(urlRewriteRule.getUrlRewriteRuleCondition()));
			 List<UrlActionWrapper> actionWrapperslist = new  ArrayList<UrlActionWrapper>();
			 EList<URLRewriteRuleAction> rewriteRuleAction = urlRewriteRule.getRewriteRuleAction();
			 for (URLRewriteRuleAction urlRewriteRuleAction : rewriteRuleAction) {
				 UrlActionWrapper actionWrapper = new UrlActionWrapper();
				 actionWrapper.setAction(urlRewriteRuleAction.getRuleAction().getValue());
				 actionWrapper.setFragment(urlRewriteRuleAction.getRuleFragment().getValue());
				 actionWrapper.setOption(urlRewriteRuleAction.getRuleOption().getValue());
				 actionWrapper.setRegex(urlRewriteRuleAction.getActionRegex());
				 actionWrapper.setValue(urlRewriteRuleAction.getActionValue());
				 actionWrapperslist.add(actionWrapper);
			}
			 rulesWrapper.setActions(actionWrapperslist);
			 rulesWrapper.setUrlRule(urlRewriteRule);
			 TableItem bindRules = bindRules(rulesWrapper);
			 bindRules.setText(urlRewriteRule.getUrlRewriteRuleCondition().getEvaluatorValue());
		}
		return container;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */

	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,true);
		createButton(parent, IDialogConstants.CANCEL_ID,IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */

	protected Point getInitialSize() {
		return new Point(687, 593);
	}
	
	
	
   private void createActionContorls(final UrlActionWrapper action,final Shell newshell,final boolean newAction){
		

	 	  final TableItem item = new TableItem(tableActions, SWT.NONE);
		  TableEditor editor = new TableEditor(tableActions);
	      editor.grabHorizontal = true;
	     final Combo  comboAction = createCombo(new String[]{"Replace","Remove","Append","Prepend","Set"});
	      editor.setEditor(comboAction, item, 0);
	      if(newAction){
	    	  comboAction.select(0);
	      }else{
	    	  comboAction.select(action.getAction());
	      }
	     
	      comboAction.addSelectionListener(new SelectionAdapter() {
	          public void widgetSelected(SelectionEvent e) {
	            item.setText(0, comboAction.getText());
	            action.setAction(comboAction.getSelectionIndex());
	            }
	        });
	      
	      editor = new TableEditor(tableActions);
	      editor.grabHorizontal = true;
	      final Combo   comboFragment = createCombo(new String[]{"protocol","host","port","path","query","ref","user","full"});
	      editor.setEditor(comboFragment, item, 1);
	      if(newAction){
	    	  comboFragment.select(0);
		   }else{
			   comboFragment.select(action.getFragment());
		   }
	      comboFragment.addSelectionListener(new SelectionAdapter() {
	          public void widgetSelected(SelectionEvent e) {
	            item.setText(1, comboFragment.getText());
	            action.setFragment(comboFragment.getSelectionIndex());
	            
	             System.out.println("getSelection index"+comboFragment.getSelectionIndex()+" text "+comboFragment.getText());
	            
	            }
	        });
	      
	      editor = new TableEditor(tableActions);
	      editor.grabHorizontal = true;
	      final Combo  comboOption = createCombo(new String[]{"value","Expression"});
	      editor.setEditor(comboOption, item, 2);
	      if(newAction){
	    	  comboOption.select(0);
		   }else{
			   comboOption.select(action.getOption());
		    }
	      comboOption.addSelectionListener(new SelectionAdapter() {
	          public void widgetSelected(SelectionEvent e) {
	            item.setText(2, comboOption.getText());
	            action.setOption(comboOption.getSelectionIndex());
	            }
	        });
	      
	      editor = new TableEditor(tableActions);
	      final Text text;
	      if("value".equals(comboOption.getText())){
           text = new Text(tableActions, SWT.NONE);  
           if(!newAction){
        	   text.setText(action.getValue());
           }
           text.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent arg0) {
				action.setValue(text.getText());
		        item.setText(3, text.getText());
			}
		});
	      }else{
	       text = new Text(tableActions, SWT.READ_ONLY);
	       if(!newAction){
	    	 text.setText(action.getNsproperty().getPropertyValue());
	        }
	      }
	      
	      editor.grabHorizontal = true;
	      editor.setEditor(text, item, 3);
	      editor.horizontalAlignment = SWT.LEFT;
	      
	      editor = new TableEditor(tableActions);
	      Button button = new Button(tableActions, SWT.PUSH);
	      if("Expression".equals(comboOption.getText())){
	         button.setEnabled(false);
		   } 			      
	      button.setText("ns editor");
	      button.pack();
	      button.addSelectionListener(new SelectionAdapter() {
	     public void widgetSelected(SelectionEvent e) {  
	    	 NamespacedProperty namespacedProperty=null;
	    	 if(!newAction){
	    		 namespacedProperty= action.getNsproperty();
	 	       }else{
	 	        namespacedProperty = EsbFactory.eINSTANCE.createNamespacedProperty();
	 	       }
	    	 	NamespacedPropertyEditorDialog dialog = new NamespacedPropertyEditorDialog(newshell, namespacedProperty);
	    	 	dialog.open(); 
	    	 	item.setText(3, namespacedProperty.getPropertyValue());
	    	 	action.setNsproperty(namespacedProperty);
	     	  }
		   });

	      editor.minimumWidth = button.getSize().x;
	      editor.horizontalAlignment = SWT.LEFT;
	      editor.setEditor(button, item, 4);

	      editor = new TableEditor(tableActions);
	      final Text text2 = new Text(tableActions, SWT.NONE);
	      if(!newAction){
	    	  text2.setText(action.getRegex());
	      }
	      text2.addModifyListener(new ModifyListener() {
			
		 
			public void modifyText(ModifyEvent arg0) {
				item.setText(5, text2.getText());
		        action.setRegex(text2.getText());
			}
		 });
      
          editor.grabHorizontal = true;
 	      editor.setEditor(text2, item, 5);
	      tableActions.redraw();
	      //item.setData(action);
	}
	
	private Combo createCombo(String[] values) {
		Combo combo = new Combo(tableActions, SWT.NONE);
		int i=0;
		for (String value : values) {
			combo.add(value,i);
			i++;
		}
	      combo.select(0);
		return combo;
	}
	
	private TableItem bindRules(UrlRewriteRulesWrapper rule) {
		TableItem item = new TableItem(tableRules, SWT.NONE);
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
		TableItem item =tableRules.getItem(itemIndex);
		UrlRewriteRulesWrapper wraprule = (UrlRewriteRulesWrapper) item.getData();
		wraprule.setremove(true);
		tableRules.remove(tableRules.indexOf(item));
	} 

	private CompoundCommand getResultCommand() {
		if (null == resultCommand) {
			resultCommand = new CompoundCommand();
		}
		return resultCommand;
	}
	
	protected void okPressed() {
		
		 TableItem[] items = tableRules.getItems();
		 for (TableItem tableItem : items) {
			 UrlRewriteRulesWrapper wraprule = (UrlRewriteRulesWrapper) tableItem.getData();
			 URLRewriteRule rule = wraprule.getUrlRule();
			 EList<URLRewriteRuleAction> rewriteRuleAction = rule.getRewriteRuleAction();
			 
			 if(null != rule.eContainer()){
				 
	             SetCommand command = new SetCommand(editingDomain, rule, EsbPackage.Literals.URL_REWRITE_RULE__URL_REWRITE_RULE_CONDITION, wraprule.getCondition());
	             getResultCommand().append(command);	 
	             for (URLRewriteRuleAction urlRewriteRuleAction : rewriteRuleAction) {
					   RemoveCommand removeCmd = new RemoveCommand(editingDomain,
					   rule, EsbPackage.Literals.URL_REWRITE_RULE__REWRITE_RULE_ACTION,urlRewriteRuleAction);
						getResultCommand().append(removeCmd); 
						System.out.println(removeCmd.canExecute());
				} 
	             List<UrlActionWrapper> actions = wraprule.getActions();
				 for (UrlActionWrapper urlActionWrapper : actions) {
					 URLRewriteRuleAction ruleAction = EsbFactory.eINSTANCE.createURLRewriteRuleAction();
					 if(urlActionWrapper.getNsproperty()!=null){
					 NamespacedProperty  property = EsbFactory.eINSTANCE.createNamespacedProperty();
					 property.setNamespaces(urlActionWrapper.getNsproperty().getNamespaces());
					 property.setPrettyName("ns");
					 property.setPropertyName("ns");
					 property.setPropertyValue(urlActionWrapper.getNsproperty().getPropertyValue());
					 ruleAction.setActionExpression(property);
					 }
					 ruleAction.setActionRegex(urlActionWrapper.getRegex());
					 ruleAction.setActionValue(urlActionWrapper.getValue());
					 ruleAction.setRuleAction(RuleActionType.get(urlActionWrapper.getAction()));
					 ruleAction.setRuleFragment(RuleFragmentType.get(urlActionWrapper.getFragment()));
					 ruleAction.setRuleOption(RuleOptionType.get(urlActionWrapper.getOption()));

					 if(null != rule.eContainer()){
						  AddCommand addCmd = new AddCommand(editingDomain,rule,
								 EsbPackage.Literals.URL_REWRITE_RULE__REWRITE_RULE_ACTION,ruleAction);
							     getResultCommand().append(addCmd);	
							     System.out.println(addCmd.canExecute()); 
					 }else{
						 rewriteRuleAction.add(ruleAction); 
					 }
				   } 
 
		 	        SetCommand command2 = new SetCommand(editingDomain,
					urlMediator, EsbPackage.Literals.URL_REWRITE_MEDIATOR__URL_REWRITE_RULES,rule);
					getResultCommand().append(command2);  
					System.out.println(command2.canExecute()); 
					
			 } else{
				 rule.setUrlRewriteRuleCondition(EsbFactory.eINSTANCE.copyEvaluatorExpressionProperty(wraprule.getCondition()));
				 List<UrlActionWrapper> actions = wraprule.getActions();
				 for (UrlActionWrapper urlActionWrapper : actions) {
					 URLRewriteRuleAction ruleAction = EsbFactory.eINSTANCE.createURLRewriteRuleAction();
					 if(urlActionWrapper.getNsproperty()!=null){
					 NamespacedProperty  property = EsbFactory.eINSTANCE.createNamespacedProperty();
					 property.setNamespaces(urlActionWrapper.getNsproperty().getNamespaces());
					 property.setPrettyName("ns");
					 property.setPropertyName("ns");
					 property.setPropertyValue(urlActionWrapper.getNsproperty().getPropertyValue());
					 ruleAction.setActionExpression(property);
					 }
					 ruleAction.setActionRegex(urlActionWrapper.getRegex());
					 ruleAction.setActionValue(urlActionWrapper.getValue());
					 ruleAction.setRuleAction(RuleActionType.get(urlActionWrapper.getAction()));
					 ruleAction.setRuleFragment(RuleFragmentType.get(urlActionWrapper.getFragment()));
					 ruleAction.setRuleOption(RuleOptionType.get(urlActionWrapper.getOption()));
 
				       rewriteRuleAction.add(ruleAction); 
					 }
			 
				 AddCommand addCmd = new AddCommand(editingDomain,urlMediator,
				 EsbPackage.Literals.URL_REWRITE_MEDIATOR__URL_REWRITE_RULES,rule);
				 getResultCommand().append(addCmd);	
				 System.out.println(addCmd.canExecute());
			 }
				     
		 	}
			// Apply changes.
			if (getResultCommand().canExecute()) {
				editingDomain.getCommandStack().execute(getResultCommand());
			} 

			super.okPressed();
	}
}

class UrlRewriteRulesWrapper{
	

	public List<UrlActionWrapper> getActions() {
		return actions;
	}
	public void setActions(List<UrlActionWrapper> actions) {
		this.actions = actions;
	}
	public EvaluatorExpressionProperty getCondition() {
		return condition;
	}
	public void setCondition(EvaluatorExpressionProperty condition) {
		this.condition = condition;
	}
	public URLRewriteRule getUrlRule() {
		return urlRule;
	}
	public void setUrlRule(URLRewriteRule urlRule) {
		this.urlRule = urlRule;
	}
	public void setremove(boolean isremove) {
		this.remove = isremove;
	}
	public boolean isremove() {
		return remove;
	}
	private List<UrlActionWrapper> actions;
	private EvaluatorExpressionProperty condition;
	private URLRewriteRule urlRule;
	private boolean  remove;
  
}

class UrlActionWrapper{

   public NamespacedProperty getNsproperty() {
		return nsproperty;
	}
	public void setNsproperty(NamespacedProperty nsproperty) {
		this.nsproperty = nsproperty;
	}

  public int getAction() {
	return action;
}
public void setAction(int action) {
	this.action = action;
}
public int getOption() {
	return option;
}
public void setOption(int option) {
	this.option = option;
}
public int getFragment() {
	return fragment;
}
public void setFragment(int fragment) {
	this.fragment = fragment;
}
public String getRegex() {
	return regex;
}
public void setRegex(String regex) {
	this.regex = regex;
}
public String getValue() {
	return value;
}
public void setValue(String value) {
	this.value = value;
}
private NamespacedProperty nsproperty;
private int action;
  private int option;
  private int fragment;
  private String regex;
  private String value;

 
}


