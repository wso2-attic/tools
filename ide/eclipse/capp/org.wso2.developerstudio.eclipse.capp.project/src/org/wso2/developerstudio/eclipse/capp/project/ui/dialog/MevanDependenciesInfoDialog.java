package org.wso2.developerstudio.eclipse.capp.project.ui.dialog;


import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class MevanDependenciesInfoDialog extends Dialog{
	private Table table;
	private TableViewer viewer;

	private final static String[] titles = { "Dependency", "Attribute", "Value"};
	
	public MevanDependenciesInfoDialog(Shell parentShell) {
		super(parentShell);
	}
	
	protected Control createDialogArea(final Composite parent) {
		parent.getShell().setText("Maven Project Info");
		Composite container = (Composite) super.createDialogArea(parent);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		
		Group group = new Group(container, SWT.NONE);
		group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		group.setLayout(new GridLayout(1, false));
		
		table = new Table(group, SWT.BORDER | SWT.FULL_SELECTION);
		GridData gd_table = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_table.heightHint = 95;
		table.setLayoutData(gd_table);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableLayout tableLayout = new TableLayout();
		table.setLayout(tableLayout);

		tableLayout.addColumnData(new ColumnWeightData(10, 100, true));
		TableColumn column = new TableColumn(table, SWT.NONE);
		column.setText(titles[0]);
		column.setAlignment(SWT.LEFT);

		tableLayout.addColumnData(new ColumnWeightData(15, 200, true));
		column = new TableColumn(table, SWT.NONE);
		column.setText(titles[1]);
		column.setAlignment(SWT.LEFT);
		
		tableLayout.addColumnData(new ColumnWeightData(15, 200, true));
		column = new TableColumn(table, SWT.NONE);
		column.setText(titles[2]);
		column.setAlignment(SWT.LEFT);
		
		viewer = new TableViewer(table);
		viewer.setColumnProperties(titles);
		
		
		
//		TableItem tableItem_1 = new TableItem(table, SWT.NONE);
//		tableItem_1.setText("New TableItem");
//		
//		TableItem tableItem = new TableItem(table, SWT.NONE);
//		tableItem.setText("Dependency");

		return super.createDialogArea(parent);
	}
	

}
