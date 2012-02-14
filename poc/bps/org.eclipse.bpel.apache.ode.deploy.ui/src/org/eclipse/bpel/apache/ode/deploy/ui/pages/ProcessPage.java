/*******************************************************************************
 * Copyright (c) 2008 IBM Corporation, University of Stuttgart (IAAS) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation, University of Stuttgart (IAAS) - initial API and implementation
 *******************************************************************************/

package org.eclipse.bpel.apache.ode.deploy.ui.pages;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.wsdl.Binding;
import javax.xml.namespace.QName;

import org.eclipse.bpel.apache.ode.deploy.model.dd.CategoryType;
import org.eclipse.bpel.apache.ode.deploy.model.dd.GenerateType;
import org.eclipse.bpel.apache.ode.deploy.model.dd.OnType;
import org.eclipse.bpel.apache.ode.deploy.model.dd.ProcessType;
import org.eclipse.bpel.apache.ode.deploy.model.dd.TCleanup;
import org.eclipse.bpel.apache.ode.deploy.model.dd.TInvoke;
import org.eclipse.bpel.apache.ode.deploy.model.dd.TProcessEvents;
import org.eclipse.bpel.apache.ode.deploy.model.dd.TProvide;
import org.eclipse.bpel.apache.ode.deploy.model.dd.TScopeEvents;
import org.eclipse.bpel.apache.ode.deploy.model.dd.TService;
import org.eclipse.bpel.apache.ode.deploy.model.dd.ddFactory;
import org.eclipse.bpel.apache.ode.deploy.model.dd.ddPackage;
import org.eclipse.bpel.apache.ode.deploy.ui.Activator;
import org.eclipse.bpel.apache.ode.deploy.ui.editors.ODEDeployMultiPageEditor;
import org.eclipse.bpel.apache.ode.deploy.ui.util.DeployUtils;
import org.eclipse.bpel.model.PartnerLink;
import org.eclipse.bpel.model.PartnerLinks;
import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.model.Scope;
import org.eclipse.bpel.model.impl.ProcessImpl;
import org.eclipse.bpel.ui.BPELUIPlugin;
import org.eclipse.bpel.ui.IBPELUIConstants;
import org.eclipse.bpel.ui.util.BPELUtil;
import org.eclipse.bpel.ui.util.IModelVisitor;
import org.eclipse.core.internal.resources.ModelObject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.OwnerDrawLabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TableViewerRow;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wst.wsdl.Port;
import org.eclipse.wst.wsdl.Service;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Main process page, renders UI for all relevant deployment settings.
 * 
 * @author Simon Moser (IBM)
 * @author Tammo van Lessen (IAAS)
 */
public class ProcessPage extends FormPage implements IResourceChangeListener {
	public static final int PARTNER_LINK_COLUMN = 0;
	public static final int PORT_COLUMN = 1;
	public static final int SERVICE_COLUMN = 2;
	public static final int BINDING_COLUMN = 3;
	public static final int ENDPOINT_COLUMN = 4;
	public static final int N_ONTYPES = 3;
	public static final int N_CATEGORY_TYPES = 6;

	public static final String INSTANCE_LIFECYCLE_NAME = "instanceLifecycle"; //$NON-NLS-1$
	public static final String ACTIVITY_LIFECYCLE_NAME = "activityLifecycle"; //$NON-NLS-1$
	public static final String DATA_HANDLING_NAME = "dataHandling"; //$NON-NLS-1$
	public static final String SCOPE_HANDLING_NAME = "scopeHandling"; //$NON-NLS-1$
	public static final String CORRELATION_NAME = "correlation"; //$NON-NLS-1$

	public static final String ALL_NAME = "all"; //$NON-NLS-1$
	public static final String INSTANCE_NAME = "instance"; //$NON-NLS-1$
	public static final String VARIABLES_NAME = "variables"; //$NON-NLS-1$
	public static final String MESSAGES_NAME = "messages"; //$NON-NLS-1$
	public static final String CORRELATIONS_NAME = "correlation"; //$NON-NLS-1$

	public static final String[] PROCESS_STATUS = new String[] { "activated",
			"deactivated", "retired" };
	public static final int STATUS_ACTIVATED = 0;
	public static final int STATUS_DEACTIVATED = 1;
	public static final int STATUS_RETIRED = 2;

	public static final Map<String, String> eventNameById = new HashMap<String, String>();
	static {
		eventNameById.put(INSTANCE_LIFECYCLE_NAME, "Instance life cycle");
		eventNameById.put(ACTIVITY_LIFECYCLE_NAME, "Activity life cycle");
		eventNameById.put(DATA_HANDLING_NAME, "Data handling");
		eventNameById.put(SCOPE_HANDLING_NAME, "Scope handling");
		eventNameById.put(CORRELATION_NAME, "Correlation");
	}
	public static final Map<String, String> cleanupTypeById = new HashMap<String, String>();
	static {
		cleanupTypeById.put(ALL_NAME, "All");
		cleanupTypeById.put(INSTANCE_NAME, "Instance");
		cleanupTypeById.put(VARIABLES_NAME, "Variables");
		cleanupTypeById.put(MESSAGES_NAME, "Messages");
		cleanupTypeById.put(CORRELATIONS_NAME, "Correlations");
	}

	protected ODEDeployMultiPageEditor editor;
	protected ProcessType processType;
	protected FormToolkit toolkit;
	private EditingDomain domain;
	private TableViewer scopeTableViewer;
	private TableViewer cleanupTableViewer;
	private Form mainform;

	public ProcessPage(FormEditor editor, ProcessType pt) {
		super(editor,
				"ODED" + pt.getName().toString(), pt.getName().getLocalPart()); //$NON-NLS-1$
		this.processType = pt;
		this.editor = (ODEDeployMultiPageEditor) editor;

		ResourcesPlugin.getWorkspace().addResourceChangeListener(this,
				IResourceChangeEvent.POST_CHANGE);

		this.domain = this.editor.getEditingDomain();
	}

	protected void createFormContent(IManagedForm managedForm) {
		toolkit = managedForm.getToolkit();
		ScrolledForm form = managedForm.getForm();
		form.setText(MessageFormat.format("Process {0} - {1}", processType
				.getName().getLocalPart(), processType.getName()
				.getNamespaceURI()));
		toolkit.decorateFormHeading(form.getForm());
		mainform = form.getForm();
		mainform.addMessageHyperlinkListener(new HyperlinkAdapter() {
			public void linkActivated(HyperlinkEvent e) {
				refreshModel();
			}

		});

		form.setImage(BPELUIPlugin.INSTANCE
				.getImage(IBPELUIConstants.ICON_PROCESS_32));

		RowLayout layout = new RowLayout();
		layout.wrap = false;
		layout.pack = true;
		layout.justify = false;
		layout.fill = true;
		layout.type = SWT.VERTICAL;
		layout.marginLeft = 5;
		layout.marginTop = 5;
		layout.marginRight = 5;
		layout.marginBottom = 5;
		layout.spacing = 5;

		form.getBody().setLayout(layout);
		Dialog.applyDialogFont(form.getBody());

		Composite client = createSection(form.getBody(), "General", null, 1);

		final Composite statusArea = new Composite(client, SWT.NONE);
		statusArea.setLayout(new GridLayout(2, false));
		toolkit.createLabel(statusArea, "This process is ");
		final Combo comboStatus = new Combo(statusArea, SWT.READ_ONLY);
		toolkit.adapt(comboStatus);
		comboStatus.setItems(PROCESS_STATUS);
		if (processType.isActive()) {
			comboStatus.select(STATUS_ACTIVATED);
		} else {
			if (processType.isRetired()) {
				comboStatus.select(STATUS_RETIRED);
			} else {
				comboStatus.select(STATUS_DEACTIVATED);
			}
		}
		comboStatus.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				Command setActiveCommand = SetCommand.create(domain,
						processType, ddPackage.eINSTANCE
								.getProcessType_Active(), comboStatus
								.getSelectionIndex() == STATUS_ACTIVATED);
				Command setRetiredCommand = SetCommand.create(domain,
						processType, ddPackage.eINSTANCE
								.getProcessType_Retired(), comboStatus
								.getSelectionIndex() == STATUS_RETIRED);
				CompoundCommand compoundCommand = new CompoundCommand();
				compoundCommand.append(setActiveCommand);
				compoundCommand.append(setRetiredCommand);
				domain.getCommandStack().execute(compoundCommand);
			}
		});

		final Button btnRunInMemory = toolkit.createButton(client,
				"Run this process in memory", SWT.CHECK);
		btnRunInMemory
				.setToolTipText("Define a process as being executed only in-memory. This gives better performance, but the processes cannot be queried by using the ODE Management API.");
		btnRunInMemory.setSelection(processType.isInMemory());
		btnRunInMemory.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				Command setInMemoryCommand = SetCommand.create(domain,
						processType, ddPackage.eINSTANCE
								.getProcessType_InMemory(), btnRunInMemory
								.getSelection());
				domain.getCommandStack().execute(setInMemoryCommand);
			}

		});

		String serviceDescription = "The table contains interfaces the process provides.  Specify the service, port and binding you want to use for each PartnerLink listed";
		createInterfaceWidget(form.getBody(), processType, managedForm,
				"Inbound Interfaces (Services)", serviceDescription, true);
		String invokeDescription = "The table contains interfaces the process invokes.  Specify the service, port and binding you want to use for each PartnerLink listed";
		createInterfaceWidget(form.getBody(), processType, managedForm,
				"Outbound Interfaces (Invokes)", invokeDescription, false);

		createProcessMonitoringSection(form.getBody());
		createScopeMonitoringSection(form.getBody());
		createCleanupSection(form.getBody());

		form.reflow(true);
	}

	private void createInterfaceWidget(Composite fClient, ProcessType current,
			final IManagedForm managedForm, String title, String description,
			boolean isInbound) {

		// Set column names
		String[] columnNames = new String[] {
				// "Partner Link (click on entry to open definition)",
				"Partner Link", "Associated Port", "Related Service",
				"Binding Used"};

		Section section = toolkit.createSection(fClient, Section.TWISTIE
				| Section.EXPANDED | Section.DESCRIPTION | Section.TITLE_BAR);
		section.setText(title);
		section.setDescription(description);
		section.marginHeight = 5;

		final Composite client = toolkit.createComposite(section, SWT.WRAP);
		GridLayout layout = new GridLayout();
		layout.marginWidth = 2;
		layout.marginHeight = 2;
		client.setLayout(layout);
		final Table t = toolkit.createTable(client, SWT.SINGLE | SWT.BORDER
				| SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION
				| SWT.HIDE_SELECTION);
		final TableViewer viewer = new TableViewer(t);
		
		
		TableColumn tc1 = new TableColumn(t, SWT.CENTER);
		tc1.setText(columnNames[0]);

		TableColumn tc2 = new TableColumn(t, SWT.CENTER);
		tc2.setText(columnNames[1]);

		TableColumn tc3 = new TableColumn(t, SWT.CENTER);
		tc3.setText(columnNames[2]);

		TableColumn tc4 = new TableColumn(t, SWT.CENTER);
		tc4.setText(columnNames[3]);
		
		final Button configureEndpoint = new Button(client, SWT.BUTTON4);
		configureEndpoint.setText("Configure Endpoint");
		configureEndpoint.setEnabled(false);
		configureEndpoint.setVisible(false);
		//new Shell(client.getDisplay(), SWT.APPLICATION_MODAL
		//        | SWT.DIALOG_TRIM);
		//cofingureEndpointDialog.setText("Configure Endpoint");
		//cofingureEndpointDialog.setSize(300, 300);
		t.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				if (viewer.getTable().getSelectionCount() == 1) {
					configureEndpoint.setEnabled(true);
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		configureEndpoint.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
				if (!viewer.getSelection().isEmpty() && viewer.getTable().getSelectionCount() == 1) {
					EndpointConfigurationWizard wizard = new EndpointConfigurationWizard(viewer.getTable().getSelection());
					WizardDialog dialog = new WizardDialog(client.getShell(), wizard);
					dialog.create();
					dialog.open();
				} else {
					System.out.println("Select a Partnerlink first");
				}
				/*
				final Display display = client.getDisplay();
				final Shell cofingureEndpointDialog = createCofingureEndpointDialog(display);
				cofingureEndpointDialog.open();
				// Set up the event loop.
			    while (!cofingureEndpointDialog.isDisposed()) {
			      if (!display.readAndDispatch()) {
			    	  display.sleep();
			      }
			    }*/
			}

			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("widgetDefaultSelected" + arg0.toString());
			}
		});

		t.setHeaderVisible(true);
		t.setLinesVisible(true);

		GridData gd = new GridData(GridData.FILL_BOTH);
		t.setLayoutData(gd);
		toolkit.paintBordersFor(client);

		section.setClient(client);
		final SectionPart spart = new SectionPart(section);
		managedForm.addPart(spart);

		URI deployDescriptorURI = current.eResource().getURI();
		IFile ddFile = DeployUtils.getIFileForURI(deployDescriptorURI);

		//TableViewer viewer = new TableViewer(t);
		viewer.setUseHashlookup(true);
		viewer.setColumnProperties(columnNames);
		viewer.setContentProvider(new PortTypeContentProvider(isInbound));
		viewer.setLabelProvider(new PortTypeLabelProvider(ddFile.getProject(),
				current.eResource().getResourceSet()));
		viewer.setInput(current);
		for (int i = 0, n = t.getColumnCount(); i < n; i++) {
			t.getColumn(i).pack();
		}
		// Create the cell editors
		CellEditor[] editors = new CellEditor[columnNames.length];

		// TODO: Column 1 : HyperLink Listener
		// final TableEditor editor = new TableEditor(t);
		// editor.horizontalAlignment = SWT.LEFT;
		// editor.grabHorizontal = true;
		// IWorkbenchPage wbPage= getEditor().getSite().getPage();
		// InterfaceTableListener tableListener = new
		// InterfaceTableListener(current, t, editor, toolkit, wbPage,
		// isInbound);
		// t.addListener(SWT.MouseDown, tableListener);

		// Column 2 : Associate Service (ComboBox)
		ServiceCellEditor sCellEditor = new ServiceCellEditor(t, ddFile
				.getProject(), current.eResource().getResourceSet());
		editors[1] = sCellEditor;

		
		// Assign the cell editors to the viewer
		viewer.setCellEditors(editors);

		// Set the cell modifier for the viewer
		viewer.setCellModifier(new InterfaceWidgetCellModifier(viewer,
				columnNames));
		
		
	}

	class InterfaceWidgetCellModifier implements ICellModifier {
		private Viewer viewer;
		private String[] columnNames;

		public InterfaceWidgetCellModifier(Viewer viewer, String[] columnNames) {
			this.viewer = viewer;
			this.columnNames = columnNames;
		}

		public boolean canModify(Object element, String property) {
			if (property.equals(columnNames[1])) {
				return true;
			}
			return false;
		}

		public Object getValue(Object element, String property) {
			if (!property.equals(columnNames[1])) {
				return null;
			}
			if (element instanceof TProvide) {
				TProvide provide = (TProvide) element;
				return provide.getService();
			} else if (element instanceof TInvoke) {
				TInvoke invoke = (TInvoke) element;
				return invoke.getService();
			} else {
				return null;
			}

		}

		public void modify(Object element, String property, Object value) {
			assert element instanceof Item;
			if (!property.equals(columnNames[1])) {
				return;
			}

			Item item = (Item) element;
			Object o = item.getData();
			if (o instanceof TProvide) {
				TProvide provide = (TProvide) o;

				TService service = provide.getService();
				if (service == null) {
					service = ddFactory.eINSTANCE.createTService();
					provide.setService(service);
				}

				if (value == null) {
					Command unsetServiceCommand = SetCommand.create(domain,
							service, ddPackage.eINSTANCE.getTService_Name(),
							SetCommand.UNSET_VALUE);
					Command unsetPortCommand = SetCommand.create(domain,
							service, ddPackage.eINSTANCE.getTService_Port(),
							SetCommand.UNSET_VALUE);
					CompoundCommand compoundCommand = new CompoundCommand();
					compoundCommand.append(unsetServiceCommand);
					compoundCommand.append(unsetPortCommand);
					domain.getCommandStack().execute(compoundCommand);
				} else {
					Port port = (Port) value;
					String portName = port.getName();

					Command setPortCommand = SetCommand.create(domain, service,
							ddPackage.eINSTANCE.getTService_Port(), portName);

					Service wsdlService = (Service) port.eContainer();
					QName qname = wsdlService.getQName();
					Command setServiceCommand = SetCommand.create(domain,
							service, ddPackage.eINSTANCE.getTService_Name(),
							qname);

					CompoundCommand compoundCommand = new CompoundCommand();
					compoundCommand.append(setServiceCommand);
					compoundCommand.append(setPortCommand);

					domain.getCommandStack().execute(compoundCommand);
				}
			} else if (o instanceof TInvoke) {
				TInvoke invoke = (TInvoke) o;

				TService service = invoke.getService();
				if (service == null) {
					service = ddFactory.eINSTANCE.createTService();
					invoke.setService(service);
				}

				if (value == null) {
					Command unsetServiceCommand = SetCommand.create(domain,
							service, ddPackage.eINSTANCE.getTService_Name(),
							SetCommand.UNSET_VALUE);
					Command unsetPortCommand = SetCommand.create(domain,
							service, ddPackage.eINSTANCE.getTService_Port(),
							SetCommand.UNSET_VALUE);
					CompoundCommand compoundCommand = new CompoundCommand();
					compoundCommand.append(unsetServiceCommand);
					compoundCommand.append(unsetPortCommand);
					domain.getCommandStack().execute(compoundCommand);
				} else {
					Port port = (Port) value;
					String portName = port.getName();

					Command setPortCommand = SetCommand.create(domain, service,
							ddPackage.eINSTANCE.getTService_Port(), portName);

					Service wsdlService = (Service) port.eContainer();
					QName qname = wsdlService.getQName();
					Command setServiceCommand = SetCommand.create(domain,
							service, ddPackage.eINSTANCE.getTService_Name(),
							qname);

					CompoundCommand compoundCommand = new CompoundCommand();
					compoundCommand.append(setServiceCommand);
					compoundCommand.append(setPortCommand);

					domain.getCommandStack().execute(compoundCommand);
				}
			}

			viewer.refresh();
		}

	}

	private Composite createSection(Composite parent, String title,
			String desc, int numColumns) {

		Section section = null;
		if (desc != null) {
			section = toolkit.createSection(parent, Section.TWISTIE
					| Section.TITLE_BAR | Section.DESCRIPTION
					| Section.EXPANDED);
			section.setDescription(desc);
			// section.marginHeight = 5;
		} else {
			section = toolkit.createSection(parent, Section.TWISTIE
					| Section.TITLE_BAR | Section.EXPANDED);
			// section.marginHeight = 5;
		}
		section.setText(title);

		Composite client = toolkit.createComposite(section);
		GridLayout layout = new GridLayout();
		layout.marginWidth = layout.marginHeight = 15;
		layout.numColumns = numColumns;
		client.setLayout(layout);
		section.setClient(client);

		return client;
	}

	private Shell createCofingureEndpointDialog(Display display) {
		final Shell cofingureEndpointDialog = new Shell(display, SWT.APPLICATION_MODAL
		        | SWT.DIALOG_TRIM);
		cofingureEndpointDialog.setText("Configure Endpoint");
		cofingureEndpointDialog.setSize(300, 300);
		return cofingureEndpointDialog;
	}
	private void createProcessMonitoringSection(Composite parent) {
		final Composite client = createSection(parent,
				"Process-level Monitoring Events", null, 2);
		final Composite group = toolkit.createComposite(client);
		group.setLayout(new RowLayout(SWT.VERTICAL));
		GridData gd = new GridData();
		gd.verticalAlignment = SWT.BEGINNING;
		gd.horizontalIndent = 5;
		group.setLayoutData(gd);

		final Button btnNone = toolkit.createButton(group, "None", SWT.RADIO);
		final Button btnAll = toolkit.createButton(group, "All", SWT.RADIO);
		final Button btnSelected = toolkit.createButton(group, "Selected",
				SWT.RADIO);

		Composite wrapper = toolkit.createComposite(client);
		wrapper.setLayout(new RowLayout());
		final CheckboxTableViewer ctv = CheckboxTableViewer.newCheckList(
				wrapper, SWT.NONE);
		wrapper.setLayoutData(gd);
		toolkit.paintBordersFor(wrapper);

		ctv.setContentProvider(new ArrayContentProvider());
		ctv.setLabelProvider(new LabelProvider() {

			public String getText(Object element) {
				return eventNameById.get(element);
			}

		});
		ctv.setInput(new String[] { INSTANCE_LIFECYCLE_NAME,
				ACTIVITY_LIFECYCLE_NAME, DATA_HANDLING_NAME,
				SCOPE_HANDLING_NAME, CORRELATION_NAME });

		// create defaulting process event settings
		if (processType.getProcessEvents() == null) {
			TProcessEvents pe = ddFactory.eINSTANCE.createTProcessEvents();
			pe.setGenerate(GenerateType.ALL);
			processType.setProcessEvents(pe);
		}

		if (processType.getProcessEvents().isSetGenerate()) {
			switch (processType.getProcessEvents().getGenerate()) {
			case ALL:
				btnAll.setSelection(true);
				ctv.getControl().setEnabled(false);
				break;
			case NONE:
				btnNone.setSelection(true);
				ctv.getControl().setEnabled(false);
				break;
			}
		} else {
			btnSelected.setSelection(true);
			ctv.getControl().setEnabled(true);
		}

		final SelectionAdapter sa = new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				if (btnAll == e.getSource()) {
					ctv.getControl().setEnabled(false);
					Command command = SetCommand.create(domain, processType
							.getProcessEvents(), ddPackage.eINSTANCE
							.getTProcessEvents_Generate(), GenerateType.ALL);
					domain.getCommandStack().execute(command);
				} else if (btnNone == e.getSource()) {
					ctv.getControl().setEnabled(false);
					Command command = SetCommand.create(domain, processType
							.getProcessEvents(), ddPackage.eINSTANCE
							.getTProcessEvents_Generate(), GenerateType.NONE);
					domain.getCommandStack().execute(command);
				} else {
					ctv.getControl().setEnabled(true);
					Command command = SetCommand.create(domain, processType
							.getProcessEvents(), ddPackage.eINSTANCE
							.getTProcessEvents_Generate(),
							SetCommand.UNSET_VALUE);
					domain.getCommandStack().execute(command);
				}
			}
		};

		btnAll.addSelectionListener(sa);
		btnNone.addSelectionListener(sa);
		btnSelected.addSelectionListener(sa);

		ctv.setCheckedElements(processType.getProcessEvents().getEnableEvent()
				.toArray());
		final ISelectionChangedListener scl = new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				Command command = SetCommand.create(domain, processType
						.getProcessEvents(), ddPackage.eINSTANCE
						.getTEnableEventList_EnableEvent(), Arrays.asList(ctv
						.getCheckedElements()));
				domain.getCommandStack().execute(command);
			}

		};

		ctv.addSelectionChangedListener(scl);
	}

	private void createScopeMonitoringSection(Composite parent) {
		Composite client = createSection(parent,
				"Scope-level Monitoring Events", null, 1);

		scopeTableViewer = new TableViewer(toolkit.createTable(client,
				SWT.SINGLE | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL
						| SWT.FULL_SELECTION | SWT.HIDE_SELECTION));
		Table table = scopeTableViewer.getTable();
		scopeTableViewer
				.setContentProvider(new ScopeMonitoringEventContentProvider());
		scopeTableViewer.setUseHashlookup(true);
		TableViewerColumn column = new TableViewerColumn(scopeTableViewer,
				SWT.NONE);
		column.getColumn().setText("Scope");
		column.setLabelProvider(new ColumnLabelProvider() {

			public String getText(Object element) {
				return ((Scope) element).getName();
			}

			public Image getImage(Object element) {
				return BPELUIPlugin.INSTANCE
						.getImage(IBPELUIConstants.ICON_SCOPE_16);
			}
		});

		String[] columns = new String[] { INSTANCE_LIFECYCLE_NAME,
				ACTIVITY_LIFECYCLE_NAME, DATA_HANDLING_NAME,
				SCOPE_HANDLING_NAME, CORRELATION_NAME };
		for (String columnId : columns) {
			column = new TableViewerColumn(scopeTableViewer, SWT.NONE);
			column.getColumn().setText(eventNameById.get(columnId));
			column.setLabelProvider(new ScopeEventCheckboxColumnLabelProvider(
					columnId));
			column.setEditingSupport(new ScopeEventEditingSupport(
					scopeTableViewer, columnId));
		}

		OwnerDrawLabelProvider.setUpOwnerDraw(scopeTableViewer);

		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		scopeTableViewer.setInput(processType);

		for (int i = 0, n = table.getColumnCount(); i < n; i++) {
			table.getColumn(i).pack();
		}
	}

	private void createCleanupSection(Composite parent) {
		Composite client = createSection(parent, "Process Cleanup", null, 1);
		cleanupTableViewer = new TableViewer(toolkit.createTable(client,
				SWT.SINGLE | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL
						| SWT.FULL_SELECTION | SWT.HIDE_SELECTION)); // )
		int columnWidth = 75;
		String[] col = new String[N_CATEGORY_TYPES + 1];
		int i = 0;
		col[i++] = "";
		for (; i < col.length; ++i) {
			col[i] = CategoryType.get(i - 1).getName(); // CategoryType 0
														// through 5
		}
		for (int j = 0; j < col.length; ++j) {
			TableViewerColumn column = new TableViewerColumn(
					cleanupTableViewer, SWT.NONE);
			column.getColumn().setText(col[j]);
			column.getColumn().setWidth(columnWidth);
			column.getColumn().setResizable(true);
			column.getColumn().setMoveable(true);
			column.setEditingSupport(new ProcessCleanupEditingSupport(
					cleanupTableViewer, j));
		}
		Table table = cleanupTableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		cleanupTableViewer
				.setContentProvider(new ProcessCleanupContentProvider());
		cleanupTableViewer.setUseHashlookup(true);
		cleanupTableViewer.setLabelProvider(new ProcessCleanupLabelProvider());
		cleanupTableViewer.setInput(ProcesssCleanupModelProvider.getInstance()
				.getAttributes());
	}

	class PortTypeLabelProvider extends LabelProvider implements
			ITableLabelProvider {

		protected IProject bpelProject = null;
		protected ResourceSet resourceSet = null;

		public PortTypeLabelProvider(IProject bpelProject,
				ResourceSet resourceSet) {
			this.bpelProject = bpelProject;
			this.resourceSet = resourceSet;
		}

		public String getColumnText(Object obj, int index) {

			if (obj instanceof TProvide && index == PARTNER_LINK_COLUMN) {
				TProvide current = (TProvide) obj;
				return current.getPartnerLink();
			} else if (obj instanceof TProvide && index == SERVICE_COLUMN) {
				TProvide current = (TProvide) obj;
				TService service = current.getService();
				if (service != null) {
					QName serviceQName = service.getName();
					if (serviceQName != null) {
						return serviceQName.toString();
					}
				}
			} else if (obj instanceof TProvide && index == PORT_COLUMN) {
				TProvide current = (TProvide) obj;
				TService service = current.getService();
				if (service != null) {
					String portName = service.getPort();
					if (portName != null) {
						return portName;
					}
				}
			} else if (obj instanceof TProvide && index == BINDING_COLUMN) {
				TProvide current = (TProvide) obj;
				TService service = current.getService();
				if (service != null) {
					String portName = service.getPort();
					if (portName != null) {
						Port port = DeployUtils.findPortByName(portName,
								this.bpelProject, this.resourceSet);
						if (port != null) {
							Binding binding = port.getBinding();
							QName bindingQName = binding.getQName();
							if (bindingQName != null) {
								return bindingQName.getLocalPart();
							}
						}
					}
				}
			} else if (obj instanceof TProvide && index == ENDPOINT_COLUMN) {
				System.out.println("this is the endpoint column");
			}

			if (obj instanceof TInvoke && index == PARTNER_LINK_COLUMN) {
				TInvoke current = (TInvoke) obj;
				return current.getPartnerLink();
			} else if (obj instanceof TInvoke && index == SERVICE_COLUMN) {
				TInvoke current = (TInvoke) obj;
				TService service = current.getService();
				if (service != null) {
					QName serviceQName = service.getName();
					if (serviceQName != null) {
						return serviceQName.toString();
					}
				}
			} else if (obj instanceof TInvoke && index == PORT_COLUMN) {
				TInvoke current = (TInvoke) obj;
				TService service = current.getService();
				if (service != null) {
					String portName = service.getPort();
					if (portName != null) {
						return portName;
					}
				}
			} else if (obj instanceof TInvoke && index == BINDING_COLUMN) {
				TInvoke current = (TInvoke) obj;
				TService service = current.getService();
				if (service != null) {
					String portName = service.getPort();
					if (portName != null) {
						Port port = DeployUtils.findPortByName(portName,
								this.bpelProject, this.resourceSet);
						if (port != null) {
							Binding binding = port.getBinding();
							QName bindingQName = binding.getQName();
							if (bindingQName != null) {
								return bindingQName.getLocalPart();
							}
						}
					}
				}
			}

			return DeployUtils.NONE_STRING;
		}

		public Image getColumnImage(Object obj, int index) {
			return null;
		}
	}

	class PortTypeContentProvider implements IStructuredContentProvider {

		protected boolean forInbound = false;

		public PortTypeContentProvider(boolean bForInbound) {
			forInbound = bForInbound;
		}

		public Object[] getElements(Object inputElement) {

			if (inputElement instanceof ProcessType) {
				ProcessType type = (ProcessType) inputElement;
				if (forInbound) {
					EList<TProvide> provide = type.getProvide();

					if (provide.isEmpty()) {
						Process process = type.getModel();
						PartnerLinks pls = process.getPartnerLinks();
						EList<PartnerLink> plList = pls.getChildren();
						for (Iterator<PartnerLink> iterator = plList.iterator(); iterator
								.hasNext();) {
							PartnerLink current = (PartnerLink) iterator.next();
							if (current.getMyRole() != null) {
								TProvide currentProvide = ddFactory.eINSTANCE
										.createTProvide();
								currentProvide
										.setPartnerLink(current.getName());
								provide.add(currentProvide);
							}
						}
					}

					return provide.toArray();
				} else {
					EList<TInvoke> invoke = type.getInvoke();

					if (invoke.isEmpty()) {
						Process process = type.getModel();
						PartnerLinks pls = process.getPartnerLinks();
						if (pls != null) {
							EList<PartnerLink> plList = pls.getChildren();
							for (Iterator<PartnerLink> iterator = plList
									.iterator(); iterator.hasNext();) {
								PartnerLink current = (PartnerLink) iterator
										.next();
								if (current.getPartnerRole() != null) {
									TInvoke currentInvoke = ddFactory.eINSTANCE
											.createTInvoke();
									currentInvoke.setPartnerLink(current
											.getName());
									invoke.add(currentInvoke);
								}
							}
						}
					}
					return invoke.toArray();
				}
			} else {
				return new String[1];
			}
		}

		public void dispose() {
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}
	}

	class ScopeMonitoringEventContentProvider implements
			IStructuredContentProvider {

		public Object[] getElements(Object inputElement) {
			final List<Object> scopes = new ArrayList<Object>();

			BPELUtil.visitModelDepthFirst(processType.getModel(),
					new IModelVisitor() {
						public boolean visit(Object modelObject) {
							if ((modelObject instanceof Scope)
									&& (((Scope) modelObject).getName() != null)) {
								scopes.add(modelObject);
							}
							return true;
						}
					});

			return scopes.toArray();
		}

		public void dispose() {
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

	}

	class ProcessCleanupContentProvider implements IStructuredContentProvider {
		// @SuppressWarnings("unchecked")
		public Object[] getElements(Object inputElement) {
			final List<TCleanup> cleanupObjects = new ArrayList<TCleanup>();
			List<Cleanup> cleanups = (List<Cleanup>) inputElement;

			BPELUtil.visitModelDepthFirst(processType.getCleanup(),
					new IModelVisitor() {
						public boolean visit(Object modelObject) {
							for (Object cl : ((EList<?>) modelObject)) {
								if ((cl instanceof TCleanup)
										&& (((TCleanup) cl).getOn().getName() != null)) {
									cleanupObjects.add((TCleanup) cl);
								}
							}
							return true;
						}
					});
			setOnAttribute(cleanups, cleanupObjects);
			return cleanups.toArray();

		}

		public void dispose() {
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}
	}

	private void setOnAttribute(List<Cleanup> cleanups,
			List<TCleanup> cleanupObjects) {
		if (cleanups.size() != N_ONTYPES || cleanupObjects.size() != N_ONTYPES) {
			return;
		}
		for (TCleanup cl : cleanupObjects) {
			for (Cleanup attrb : cleanups) {
				if (cl.getOn().getName().equals(attrb.getEnumerationValue())) {
					for (CategoryType category : cl.getCategory()) { // TODO
																		// will
																		// here
																		// be
																		// any
																		// duplicates?
						attrb.setValueByName(category.getName());
					}
					break;
				}
			}
		}
	}

	protected void refreshModel() {

		try {
			editor.populateModel();
			scopeTableViewer.refresh();
			mainform.setMessage(null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public void resourceChanged(IResourceChangeEvent event) {

		IResourceDeltaVisitor rdv = new IResourceDeltaVisitor() {
			public boolean visit(IResourceDelta delta) {
				IResource res = delta.getResource();
				if ("bpel".equalsIgnoreCase(res.getFileExtension())) { //$NON-NLS-1$
					Display.getDefault().syncExec(new Runnable() {
						public void run() {
							mainform
									.setMessage(
											"Associated BPEL and/or WSDL has been changed, click to update!",
											IMessageProvider.WARNING);
						}
					});
				}

				return true; // visit the children
			}
		};
		try {
			event.getDelta().accept(rdv);
		} catch (CoreException e) {
			// ignore
		}
	}

	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		super.dispose();
	}

	class ScopeEventEditingSupport extends EditingSupport {

		private String eventType;
		private CheckboxCellEditor checkboxCellEditor;

		public ScopeEventEditingSupport(TableViewer viewer, String eventType) {
			super(viewer);
			this.eventType = eventType;
			this.checkboxCellEditor = new CheckboxCellEditor(viewer.getTable());
		}

		protected boolean canEdit(Object element) {
			String scName = ((Scope) element).getName();
			return scName != null && !"".equals(scName); //$NON-NLS-1$
		}

		protected CellEditor getCellEditor(Object element) {
			return checkboxCellEditor;
		}

		protected Object getValue(Object element) {
			String scName = ((Scope) element).getName();
			for (TScopeEvents se : processType.getProcessEvents()
					.getScopeEvents()) {
				if (scName.equals(se.getName())
						&& se.getEnableEvent().contains(eventType)) {
					return true;
				}
			}
			return false;
		}

		protected void setValue(Object element, Object value) {
			String scName = ((Scope) element).getName();
			TScopeEvents match = null;
			for (TScopeEvents se : processType.getProcessEvents()
					.getScopeEvents()) {
				if (scName.equals(se.getName())) {
					match = se;
					break;
				}
			}

			if (match == null) {
				match = ddFactory.eINSTANCE.createTScopeEvents();
				match.setName(scName);
				processType.getProcessEvents().getScopeEvents().add(match);
			}

			System.out.println("match.getEnableEvent().toString(): "
					+ match.getEnableEvent().toString());
			if (((Boolean) value).booleanValue()) {
				if (!match.getEnableEvent().contains(eventType)) {
					Command command = AddCommand.create(domain, match,
							ddPackage.eINSTANCE
									.getTEnableEventList_EnableEvent(),
							eventType);
					domain.getCommandStack().execute(command);
				}
			} else {
				Command command = RemoveCommand.create(domain, match,
						ddPackage.eINSTANCE.getTEnableEventList_EnableEvent(),
						eventType);
				domain.getCommandStack().execute(command);
			}

			getViewer().refresh();
		}
	} // class ScopeEventEditingSupport

	class ProcessCleanupEditingSupport extends EditingSupport {
		private CheckboxCellEditor checkboxCellEditor;
		private int eventType;
		private CategoryType cat[] = new CategoryType[N_CATEGORY_TYPES]; // this
																			// is
																			// the
																			// number
																			// of
																			// category
																			// types

		public ProcessCleanupEditingSupport(ColumnViewer viewer, int column) {
			super(viewer);
			if (column != 0) {
				this.checkboxCellEditor = new CheckboxCellEditor(
						((TableViewer) viewer).getTable());
			}
			this.eventType = column;
			for (int i = 0; i < N_CATEGORY_TYPES; ++i) {
				cat[i] = CategoryType.get(i);
			}
		}

		protected boolean canEdit(Object element) {
			String s = ((Cleanup) element).getEnumerationValue();
			return s != null && !"".equals(s);
		}

		protected CellEditor getCellEditor(Object element) {
			return checkboxCellEditor;
		}

		protected Object getValue(Object element) {
			Cleanup attribute = (Cleanup) element;
			for (TCleanup tc : processType.getCleanup()) {
				if (attribute.getEnumerationValue()
						.equals(tc.getOn().getName())) {
					if (tc.getCategory().contains(cat[eventType - 1])) {
						return true;
					}
				}
			}
			return false;
		}

		protected void setValue(Object element, Object value) {
			Cleanup attribute = (Cleanup) element;
			attribute.set(eventType, ((Boolean) value).booleanValue());
			String attrbName = ((Cleanup) element).getEnumerationValue();

			TCleanup match = null;
			for (TCleanup cl : processType.getCleanup()) {
				String name = cl.getOn().getName();
				if (attrbName.equals(name)) {
					match = cl;
					break;
				}
			}
			if (match == null) {
				match = ddFactory.eINSTANCE.createTCleanup();
				if ("success".equals(attrbName)) {
					match.setOn(OnType.SUCCESS);
				} else if ("failure".equals(attrbName)) {
					match.setOn(OnType.FAILURE);
				} else if ("always".equals(attrbName)) {
					match.setOn(OnType.ALWAYS);
				}
				processType.getCleanup().add(match);
			}
			if (((Boolean) value).booleanValue()) {
				Command command = AddCommand.create(domain, match,
						ddPackage.eINSTANCE.getTCleanup_Category(),
						cat[eventType - 1]);
				domain.getCommandStack().execute(command);
			} else {
				Command command = RemoveCommand.create(domain, match,
						ddPackage.eINSTANCE.getTCleanup_Category(),
						cat[eventType - 1]);
				domain.getCommandStack().execute(command);

			}

			getViewer().refresh();
		}
	} // class ProcessCleanupEditingSupport

	class ScopeEventCheckboxColumnLabelProvider extends OwnerDrawLabelProvider {

		private String eventType;

		public ScopeEventCheckboxColumnLabelProvider(String eventType) {
			this.eventType = eventType;
		}

		protected void measure(Event event, Object element) {
			Image img = getImage(element);
			event.setBounds(new Rectangle(event.x, event.y,
					img.getBounds().width, img.getBounds().height));

		}

		protected void paint(Event event, Object element) {

			Image img = getImage(element);

			if (img != null) {
				Rectangle bounds = ((TableItem) event.item)
						.getBounds(event.index);
				Rectangle imgBounds = img.getBounds();
				bounds.width /= 2;
				bounds.width -= imgBounds.width / 2;
				bounds.height /= 2;
				bounds.height -= imgBounds.height / 2;

				int x = bounds.width > 0 ? bounds.x + bounds.width : bounds.x;
				int y = bounds.height > 0 ? bounds.y + bounds.height : bounds.y;

				event.gc.drawImage(img, x, y);
			}
		}

		public Image getImage(Object element) {
			if (isChecked(element)) {
				return Activator.getDefault().getImageRegistry().get(
						Activator.IMG_CHECKED);
			} else {
				return Activator.getDefault().getImageRegistry().get(
						Activator.IMG_UNCHECKED);
			}
		}

		public boolean isChecked(Object element) {
			String scName = ((Scope) element).getName();
			for (TScopeEvents se : processType.getProcessEvents()
					.getScopeEvents()) {
				if (se.getName().equals(scName)
						&& se.getEnableEvent().contains(eventType)) {
					return true;
				}
			}
			return false;
		}
	} // class ScopeEventCheckboxColumnLabelProvider

	public class ProcessCleanupLabelProvider extends LabelProvider implements
			ITableLabelProvider {
		private final Image CHECKED = Activator.getDefault().getImageRegistry()
				.get(Activator.IMG_CHECKED);
		private final Image UNCHECKED = Activator.getDefault()
				.getImageRegistry().get(Activator.IMG_UNCHECKED);

		public Image getColumnImage(Object element, int columnIndex) {
			if (columnIndex != 0) {
				if (((Cleanup) element).isChecked(columnIndex)) { //
					return CHECKED;
				} else {
					return UNCHECKED;
				}
			}
			return null;
		}

		public String getColumnText(Object element, int columnIndex) {
			Cleanup cleanup = (Cleanup) element;
			if (columnIndex == 0) {
				return cleanup.getEnumerationValue();
			} else {
				return "";
			}
		}
	} // class ProcessCleanupLabelProvider

}