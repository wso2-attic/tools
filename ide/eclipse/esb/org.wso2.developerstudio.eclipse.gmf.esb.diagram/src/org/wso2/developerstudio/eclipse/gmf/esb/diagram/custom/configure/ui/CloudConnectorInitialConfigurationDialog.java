package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.configure.ui;

import java.util.Collection;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PlatformUI;
import org.wso2.developerstudio.eclipse.gmf.esb.CallTemplateMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.CallTemplateParameter;
import org.wso2.developerstudio.eclipse.gmf.esb.CloudConnectorOperation;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.Mediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.EditorUtils;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbMultiPageEditor;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbPaletteFactory;

public class CloudConnectorInitialConfigurationDialog extends Dialog {
    /**
     * Value type constant.
     */
	private static final String VALUE_TYPE = "Value";
	/**
	 * Expression type constant.
	 */
	private static final String EXPRESSION_TYPE = "Expression";
	/**
	 * Table for add/edit/remove parameters.
	 */
	private Table paramTable;
	/**
	 * Table Editors
	 */
	private TableEditor paramTypeEditor;
	private TableEditor paramNameEditor;
	private TableEditor paramValueEditor;
	/**
	 * Table widgets
	 */
	private Combo cmbParamType;
	private Text txtParamName;
	private PropertyText paramValue;
	/**
	 * Button for add new parameter.
	 */
	private Button newParamButton;
	
	private Text nameText;
	private Label configurationNameLabel;
	private String configName;
	/**
	 * Button for remove parameter.
	 */
	private Button removeParamButton;
	/**
	 * Editing domain.
	 */
	private TransactionalEditingDomain editingDomain;
	/**
	 * {@link CallTemplateMediator} domain object.
	 */
	private Mediator mediator;
	/**
	 * Command for recording user operations.
	 */
	private CompoundCommand resultCommand;
	private Collection<String> parameters;
	
	public CloudConnectorInitialConfigurationDialog(Shell parent,Collection<String> parameters) {
		super(parent);
		this.parameters=parameters;
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		FormLayout mainLayout = new FormLayout();
		mainLayout.marginHeight = 5;
		mainLayout.marginWidth = 5;
		container.setLayout(mainLayout);

		
		configurationNameLabel = new Label(container, SWT.NONE);
		{
			configurationNameLabel.setText("Name: ");
			FormData logCategoryLabelLayoutData = new FormData(80,SWT.DEFAULT);
			logCategoryLabelLayoutData.top = new FormAttachment(0, 5);
			logCategoryLabelLayoutData.left = new FormAttachment(0);
			configurationNameLabel.setLayoutData(logCategoryLabelLayoutData);
		}
		
		
		// Button for add new parameter.
		nameText = new Text(container, SWT.NONE);
		{
			FormData logCategoryLabelLayoutData = new FormData(160,SWT.DEFAULT);
			logCategoryLabelLayoutData.top = new FormAttachment(
					configurationNameLabel, 0, SWT.CENTER);
			logCategoryLabelLayoutData.left = new FormAttachment(
					configurationNameLabel, 5);
			nameText.setLayoutData(logCategoryLabelLayoutData);
		}
		nameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				configName=nameText.getText();
			}
		});
		
		
		// Button for add new parameter.
		newParamButton = new Button(container, SWT.NONE);
		{
			newParamButton.setText("New...");
			FormData logCategoryComboLayoutData = new FormData(80,SWT.DEFAULT);
			logCategoryComboLayoutData.top = new FormAttachment(
					nameText, 10);
			logCategoryComboLayoutData.right = new FormAttachment(100);
			newParamButton.setLayoutData(logCategoryComboLayoutData);
		}

		newParamButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
/*				TableItem item = bindPram(EsbFactory.eINSTANCE
						.createCallTemplateParameter());
				paramTable.select(paramTable.indexOf(item));*/
			}
		});

		// Button for remove parameter.
		removeParamButton = new Button(container, SWT.NONE);
		removeParamButton.setText("Remove");
		FormData removeLogPropertyButtonLayoutData = new FormData(80,SWT.DEFAULT);
		removeLogPropertyButtonLayoutData.top = new FormAttachment(
				newParamButton, 5);
		removeLogPropertyButtonLayoutData.right = new FormAttachment(100);
		removeLogPropertyButtonLayoutData.left = new FormAttachment(
				newParamButton, 0, SWT.LEFT);
		removeParamButton.setLayoutData(removeLogPropertyButtonLayoutData);

		removeParamButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				int selectedIndex = paramTable.getSelectionIndex();
				if (-1 != selectedIndex) {
/*					initTableEditor(paramNameEditor, paramTable);
					initTableEditor(paramTypeEditor, paramTable);
					initTableEditor(paramValueEditor, paramTable);
					unbindParam(selectedIndex);*/

					// Select the next available candidate for deletion.
					if (selectedIndex < paramTable.getItemCount()) {
						paramTable.select(selectedIndex);
					} else {
						paramTable.select(selectedIndex - 1);
					}
				}
			}
		});

		// Table for show the parameters.
		paramTable = new Table(container, SWT.BORDER | SWT.FULL_SELECTION
				| SWT.HIDE_SELECTION);

		TableColumn nameColumn = new TableColumn(paramTable, SWT.LEFT);
		TableColumn valueColumn = new TableColumn(paramTable, SWT.LEFT);
		TableColumn typeColumn = new TableColumn(paramTable, SWT.LEFT);
		nameColumn.setText("Parameter Name");
		nameColumn.setWidth(150);
		valueColumn.setText("Value/Expression");
		valueColumn.setWidth(200);
		typeColumn.setText("Parameter Type");
		typeColumn.setWidth(150);

		paramTable.setHeaderVisible(true);
		paramTable.setLinesVisible(true);

		Listener tblPropertiesListener = new Listener() {

			public void handleEvent(Event evt) {
				if (null != evt.item) {
					if (evt.item instanceof TableItem) {
						TableItem item = (TableItem) evt.item;
						//editItem(item);
					}
				}
			}
		};

		paramTable.addListener(SWT.Selection, tblPropertiesListener);

		// Populate params
/*		EList<CallTemplateParameter> parameters = null;
		if(mediator instanceof CallTemplateMediator){
			parameters=((CallTemplateMediator)mediator).getTemplateParameters();
		}else if(mediator instanceof CloudConnectorOperation){
			parameters=((CloudConnectorOperation)mediator).getConnectorParameters();
		}*/
		for (String param : parameters) {
			bindPram(param);
		}

		//setupTableEditor(paramTable);

		FormData logPropertiesTableLayoutData = new FormData(SWT.DEFAULT, 150);
		logPropertiesTableLayoutData.top = new FormAttachment(newParamButton,
				0, SWT.TOP);
		logPropertiesTableLayoutData.left = new FormAttachment(0);
		logPropertiesTableLayoutData.right = new FormAttachment(newParamButton,
				-5);
		logPropertiesTableLayoutData.bottom = new FormAttachment(100);
		paramTable.setLayoutData(logPropertiesTableLayoutData);

		return parent;
	}
	
	private TableItem bindPram(String param) {
		TableItem item = new TableItem(paramTable, SWT.NONE);
			item.setText(new String[] { param,
					"",VALUE_TYPE });
		

		item.setData(param);
		return item;
	}
	
	@Override
	protected void okPressed() {
		// TODO Auto-generated method stub
		super.okPressed();
		Display.getCurrent().asyncExec(new Runnable() {			
			public void run() {
				IEditorReference editorReferences[] = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
						.getActivePage().getEditorReferences();
				IEditorPart activeEditor=PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage().getActiveEditor();
				for (int i = 0; i < editorReferences.length; i++) {
					IEditorPart editor = editorReferences[i].getEditor(false);
					if ((editor instanceof EsbMultiPageEditor)) {
				        /*
				         * This must be altered. 'addDefinedSequences' and 'addDefinedEndpoints' methods should not exist inside EsbPaletteFactory class. 
				         * Creating new instance of 'EsbPaletteFactory' must be avoided.
				         */
						EsbPaletteFactory esbPaletteFactory=new EsbPaletteFactory();
						if(!editor.equals(activeEditor)){					        
					        //esbPaletteFactory.addDefinedSequences(((EsbMultiPageEditor) editor).getGraphicalEditor());
					        //esbPaletteFactory.addDefinedEndpoints(((EsbMultiPageEditor) editor).getGraphicalEditor());					        
						}else{
							esbPaletteFactory.addCloudConnectorOperations(((EsbMultiPageEditor) editor).getGraphicalEditor(),configName);
						}
					}
				}
			}
		});
	}
	
}
