package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.configure.ui;

import java.io.File;
import java.util.Collection;

import org.eclipse.core.resources.IContainer;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
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
import org.wso2.developerstudio.eclipse.artifact.sequence.model.SequenceModel;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.Activator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.EditorUtils;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.factory.SequenceFileCreator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbMultiPageEditor;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbPaletteFactory;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

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
	
	private Text nameText;
	private Label configurationNameLabel;
	private String configName;
	private Collection<String> parameters;
	private Label saveOptionLabel;
	private Combo saveOptionCombo;
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	
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
			logCategoryLabelLayoutData.top = new FormAttachment(0, 10);
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
		
		
		saveOptionLabel = new Label(container, SWT.NONE);
		{
			saveOptionLabel.setText("Save as : ");
			FormData logCategoryLabelLayoutData1 = new FormData(80,SWT.DEFAULT);
			logCategoryLabelLayoutData1.top = new FormAttachment(configurationNameLabel, 20);
			logCategoryLabelLayoutData1.left = new FormAttachment(0);
			saveOptionLabel.setLayoutData(logCategoryLabelLayoutData1);
		}
		
		saveOptionCombo = new Combo(container, SWT.DROP_DOWN | SWT.READ_ONLY);
		{
			saveOptionCombo.add("Inline Config");
			saveOptionCombo.add("Sequence Config");
			saveOptionCombo.select(0);
			FormData logCategoryComboLayoutData = new FormData(160,SWT.DEFAULT);
			logCategoryComboLayoutData.top = new FormAttachment(
					saveOptionLabel, 0, SWT.CENTER);
			logCategoryComboLayoutData.left = new FormAttachment(
					saveOptionLabel, 5);
			saveOptionCombo.setLayoutData(logCategoryComboLayoutData);
		}

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

		for (String param : parameters) {
			bindPram(param);
		}

		//setupTableEditor(paramTable);

		FormData logPropertiesTableLayoutData = new FormData(SWT.DEFAULT, 150);
		logPropertiesTableLayoutData.top = new FormAttachment(saveOptionLabel, 20);
		logPropertiesTableLayoutData.left = new FormAttachment(0);
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
		super.okPressed();
		SequenceModel sequenceModel=new SequenceModel();
        IContainer location = EditorUtils.getActiveProject().getFolder("src" + File.separator + "main"
				+ File.separator + "synapse-config" + File.separator
				+ "sequences");
		sequenceModel.setSequenceSaveLocation(location);
		sequenceModel.setSequenceName(configName);
		try {
			sequenceModel.setSelectedOption("");
			SequenceFileCreator sequenceFileCreator=new SequenceFileCreator(sequenceModel);
			sequenceFileCreator.createSequenceFile();
		} catch (Exception e) {
			log.error("Error occured while creating the sequence file", e);
		}
		
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
