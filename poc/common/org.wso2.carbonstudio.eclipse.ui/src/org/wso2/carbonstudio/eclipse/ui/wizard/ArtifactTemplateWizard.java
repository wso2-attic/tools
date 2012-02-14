package org.wso2.carbonstudio.eclipse.ui.wizard;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.TableItem;

public class ArtifactTemplateWizard extends WizardPage {
	private Table table;
	private String archetypeId;
	private Map<String,String> selectedTemplates;
	
	/**
	 * Create the wizard.
	 */
	public ArtifactTemplateWizard() {
		super("wizardPage");
		setTitle("Wizard Page title");
		setDescription("Wizard Page description");
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new GridLayout(1, false));
		
		CheckboxTableViewer checkboxTableViewer = CheckboxTableViewer.newCheckList(container, SWT.BORDER | SWT.FULL_SELECTION);
		table = checkboxTableViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText("New TableItem");
	}

	public void setArchetypeId(String archetypeId) {
		this.archetypeId = archetypeId;
	}

	public String getArchetypeId() {
		return archetypeId;
	}

	public Map<String,String> getSelectedTemplates() {
		if (selectedTemplates==null){
			selectedTemplates=new HashMap<String, String>();
		}
		return selectedTemplates;
	}
}
