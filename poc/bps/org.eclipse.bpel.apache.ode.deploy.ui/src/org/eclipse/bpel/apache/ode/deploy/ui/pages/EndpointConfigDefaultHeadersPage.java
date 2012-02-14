/**
 * 
 */
package org.eclipse.bpel.apache.ode.deploy.ui.pages;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

/**
 * @author ishan
 *
 */
public class EndpointConfigDefaultHeadersPage extends WizardPage {

	private TableViewer tableViewer;
	private Table table;
	public EndpointConfigDefaultHeadersPage(String pageName) {
		super(pageName);
		//setTitle("Endpoint Configuration");
        setDescription("Endpoint Options -> Http Options -> Default Headers");
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		composite.setLayout(layout);
		
		
		new Label(composite, SWT.NONE).setText("Add Headers");
		
		String[] columnNames = new String[] {
				"Name", "Value" };
		table = new Table(composite, SWT.SINGLE | SWT.BORDER
				| SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION
				| SWT.HIDE_SELECTION);
		
		GridData gridData = new GridData(GridData.FILL_BOTH);
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalSpan = 3;
		table.setLayoutData(gridData);
		
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn c0 = new TableColumn(table, SWT.CENTER);
		c0.setText(columnNames[0]);
		c0.setWidth(100);
		
		TableColumn c1 = new TableColumn(table, SWT.CENTER);
		c1.setText(columnNames[1]);
		c1.setWidth(100);
		
		tableViewer = new TableViewer(table);
		tableViewer.setUseHashlookup(true);
		tableViewer.setColumnProperties(columnNames);
		
		// Create the cell editors
		CellEditor[] editors = new CellEditor[columnNames.length];
		
		// Column 1 : Description (Free text)
		TextCellEditor name = new TextCellEditor(table);
		((Text) name.getControl()).setTextLimit(40);
		editors[0] = name;
		// Column 2 : Description (Free text)
		TextCellEditor value = new TextCellEditor(table);
		((Text) value.getControl()).setTextLimit(60);
		editors[1] = value;
		
		tableViewer.setCellEditors(editors);
		
		GridData gd = new GridData();
        //gd.horizontalSpan= 1;
		Button add = new Button(composite, SWT.BUTTON1);
		add.setText("Add");
		add.setLayoutData(gd);
		
		gd = new GridData();
		//gd.horizontalSpan= 1;
		Button remove = new Button(composite, SWT.BUTTON1);
		remove.setText("Remove");
		remove.setLayoutData(gd);
		
		gd = new GridData();
		//gd.horizontalSpan= 1;
		Button edit = new Button(composite, SWT.BUTTON1);
		edit.setText("Edit");
		edit.setLayoutData(gd);

		setControl(composite);
	}

}
