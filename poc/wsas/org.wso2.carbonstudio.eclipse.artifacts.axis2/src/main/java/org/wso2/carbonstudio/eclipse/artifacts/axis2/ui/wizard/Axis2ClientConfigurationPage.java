package org.wso2.carbonstudio.eclipse.artifacts.axis2.ui.wizard;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import javax.xml.namespace.QName;

import org.apache.axis2.util.URLProcessor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wst.command.internal.env.core.common.StatusUtils;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.wsf.ide.consumption.core.messages.WSASConsumptionUIMessages;
import org.wso2.wsf.ide.consumption.core.utils.WSDLPropertyReader;
import org.wso2.wsf.ide.consumption.ui.plugin.WebServiceWSASConsumptionUIPlugin;
import org.wso2.wsf.ide.core.context.WSASEmitterContext;
import org.wso2.wsf.ide.core.plugin.WebServiceWSASCorePlugin;
import org.wso2.wsf.ide.core.plugin.messages.WSASCoreUIMessages;

public class Axis2ClientConfigurationPage extends WizardPage {
	private Text clientLabel;
	private Table namespace2packageTable;
	private Combo serviceNameCombo;
	private Combo portNameCombo;
	private Combo databindingTypeCombo;
	private Text packageText;
	private Button syncAndAsyncRadioButton;
	private Button syncOnlyRadioButton;
	private Button asyncOnlyRadioButton;
	private Button unpackClassesCheckBoxButton;
	private Button unwrapClassesCheckBoxButton;
	private Button testCaseCheckBoxButton;
	private Button generateAllCheckBoxButton;
	private Button noBuildXmlCheckBoxButton;

	private WSASEmitterContext context;
	private WSDLPropertyReader reader;
	private List<QName> serviceQNameList = null;
	private IStatus status = Status.OK_STATUS;
	private DataModel model;
	private static ICarbonStudioLog log = Logger
			.getLog(WebServiceWSASConsumptionUIPlugin.PLUGIN_ID);
	private boolean isDataPopulated = false;

	public boolean isDataPopulated() {
		return isDataPopulated;
	}

	protected Axis2ClientConfigurationPage(String pageName, DataModel model) {
		// Client Configuration
		super(pageName);
		setTitle(pageName);
		this.model = model;
	}

	@Override
	public void createControl(Composite parent) {

		context = WebServiceWSASCorePlugin.getDefault().getWSASEmitterContext();

		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);

		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setBounds(10, 10, 102, 17);
		lblNewLabel.setText("Service Name");

		Label lblPortName = new Label(container, SWT.NONE);
		lblPortName.setText("Port Name");
		lblPortName.setBounds(10, 43, 102, 17);

		Label lblDatabindingName = new Label(container, SWT.NONE);
		lblDatabindingName.setText("Databinding Name");
		lblDatabindingName.setBounds(10, 76, 152, 17);

		Label lblCustomPackageName = new Label(container, SWT.NONE);
		lblCustomPackageName.setText("Custom Package Name");
		lblCustomPackageName.setBounds(10, 112, 170, 17);

		clientLabel = new Text(container, SWT.BORDER);
		clientLabel.setBounds(10, 151, 645, 27);
		// clientLabel.setText(WSASConsumptionUIMessages.LABEL_CLIENT_SIDE);
		clientLabel.setText("Client Mode");

		serviceNameCombo = new Combo(container, SWT.NONE);
		serviceNameCombo.setBounds(194, 5, 461, 27);
		serviceNameCombo.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				// loadPortNames();
				model.setServiceName(serviceNameCombo.getText());
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		portNameCombo = new Combo(container, SWT.NONE);
		portNameCombo.setBounds(194, 38, 461, 27);
		portNameCombo.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				if (portNameCombo.getSelectionIndex() == 0)
					model.setPortName(null);
				else
					model.setPortName(portNameCombo.getText());
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		databindingTypeCombo = new Combo(container, SWT.NONE);
		databindingTypeCombo.setBounds(194, 71, 461, 27);
		fillDatabinderCombo();
		databindingTypeCombo.select(0);
		databindingTypeCombo.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				model.setDatabindingType(databindingTypeCombo.getText());
			};

			public void widgetDefaultSelected(SelectionEvent e) {
			};
		});

		packageText = new Text(container, SWT.BORDER);
		packageText.setBounds(195, 107, 460, 27);
		packageText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				model.setPackageName(packageText.getText());
			}
		});

		syncAndAsyncRadioButton = new Button(container, SWT.RADIO);
		syncAndAsyncRadioButton.setBounds(10, 201, 226, 20);
		syncAndAsyncRadioButton.setText("Generate both sync and async");
		syncAndAsyncRadioButton.setSelection(((context.isAsync() || context
				.isSync()) == false) ? true : (context.isAsync() && context
				.isSync()));
		syncAndAsyncRadioButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				// Because default setting in Axis2 to be both false in thie
				// case
				// File a JIRA to fix this.
				model.setGenerateSyncCode(!syncAndAsyncRadioButton.getSelection());
				model.setGenerateAsyncCode(!syncAndAsyncRadioButton.getSelection());
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		syncOnlyRadioButton = new Button(container, SWT.RADIO);
		syncOnlyRadioButton.setText("Generate sync style only");
		syncOnlyRadioButton.setBounds(242, 201, 192, 20);
		syncOnlyRadioButton
				.setSelection(context.isSync() && !context.isAsync());
		syncOnlyRadioButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				model.setGenerateSyncCode(syncOnlyRadioButton.getSelection());
				model.setGenerateAsyncCode(!syncOnlyRadioButton.getSelection());
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		asyncOnlyRadioButton = new Button(container, SWT.RADIO);
		asyncOnlyRadioButton.setText("Generate async style only");
		asyncOnlyRadioButton.setBounds(440, 201, 192, 20);
		asyncOnlyRadioButton.setSelection(context.isAsync()
				&& !context.isSync());
		asyncOnlyRadioButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				model.setGenerateAsyncCode(asyncOnlyRadioButton.getSelection());
				model.setGenerateSyncCode(!asyncOnlyRadioButton.getSelection());
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		// Set the sync async to default
		model.setGenerateSyncCode(context.isSync());
		model.setGenerateAsyncCode(context.isAsync());

		// unpack classes
		unpackClassesCheckBoxButton = new Button(container, SWT.CHECK);
		unpackClassesCheckBoxButton.setBounds(10, 234, 501, 20);
		unpackClassesCheckBoxButton
				.setText("Unpack classes and generate seperate classes for the databinders");
		unpackClassesCheckBoxButton.setSelection(context
				.isClientUnpackClasses());
		unpackClassesCheckBoxButton
				.addSelectionListener(new SelectionListener() {
					public void widgetSelected(SelectionEvent e) {
						model.setUnpack(unpackClassesCheckBoxButton
								.getSelection());
					}

					public void widgetDefaultSelected(SelectionEvent e) {
					}
				});

		// unwrap classes
		unwrapClassesCheckBoxButton = new Button(container, SWT.CHECK);
		unwrapClassesCheckBoxButton.setText("Switch on un-wrapping");
		unwrapClassesCheckBoxButton.setBounds(10, 260, 254, 20);
		unwrapClassesCheckBoxButton.setSelection(context
				.isClientUnpackClasses());
		unwrapClassesCheckBoxButton
				.addSelectionListener(new SelectionListener() {
					public void widgetSelected(SelectionEvent e) {
						model.setUnwrap(unwrapClassesCheckBoxButton
								.getSelection());
					}

					public void widgetDefaultSelected(SelectionEvent e) {
					}
				});

		// generate test case option
		testCaseCheckBoxButton = new Button(container, SWT.CHECK);
		testCaseCheckBoxButton
				.setText("Generate test case to test the service");
		testCaseCheckBoxButton.setBounds(10, 286, 275, 20);
		testCaseCheckBoxButton.setSelection(context.isClientTestCase());
		model.setGenerateTestCase(context.isClientTestCase());
		testCaseCheckBoxButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				model.setGenerateTestCase(testCaseCheckBoxButton.getSelection());
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		// generate all
		generateAllCheckBoxButton = new Button(container, SWT.CHECK);
		generateAllCheckBoxButton
				.setText("Generate all types for all elements referred by schemas");
		generateAllCheckBoxButton.setBounds(10, 312, 399, 20);
		generateAllCheckBoxButton.setSelection(context.isClientGenerateAll());
		generateAllCheckBoxButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				model.setGenerateAllCode(generateAllCheckBoxButton
						.getSelection());
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		// no build xml
		noBuildXmlCheckBoxButton = new Button(container, SWT.CHECK);
		noBuildXmlCheckBoxButton
				.setText("Don't generate the build.xml in the output directory");
		noBuildXmlCheckBoxButton.setBounds(10, 338, 371, 20);
		noBuildXmlCheckBoxButton.setSelection(context.isClientGenerateAll());
		noBuildXmlCheckBoxButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				model.setNoBuildXml(noBuildXmlCheckBoxButton.getSelection());
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		namespace2packageTable = new Table(container, SWT.BORDER
				| SWT.FULL_SELECTION | SWT.V_SCROLL);
		namespace2packageTable.setBounds(10, 364, 645, 106);
		namespace2packageTable.setHeaderVisible(true);
		namespace2packageTable.setLinesVisible(true);

		TableColumn tblclmnNewColumn = new TableColumn(namespace2packageTable,
				SWT.NONE);
		tblclmnNewColumn.setWidth(380);
		tblclmnNewColumn.setText("Namespace");

		TableColumn tblclmnNewColumn_1 = new TableColumn(
				namespace2packageTable, SWT.NONE);
		tblclmnNewColumn_1.setWidth(100);
		tblclmnNewColumn_1.setText("Package");

		// add the table editor
		final TableEditor editor = new TableEditor(namespace2packageTable);
		editor.setColumn(1);
		editor.horizontalAlignment = SWT.LEFT;
		editor.grabHorizontal = true;

		namespace2packageTable.addListener(SWT.MouseDown, new Listener() {
			public void handleEvent(Event event) {
				Rectangle clientArea = namespace2packageTable.getClientArea();
				Point pt = new Point(event.x, event.y);
				int index = namespace2packageTable.getTopIndex();
				while (index < namespace2packageTable.getItemCount()) {
					boolean visible = false;
					final TableItem item = namespace2packageTable
							.getItem(index);
					for (int i = 0; i < namespace2packageTable.getColumnCount(); i++) {
						Rectangle rect = item.getBounds(i);
						if (rect.contains(pt)) {
							final int column = i;
							final Text text = new Text(namespace2packageTable,
									SWT.NONE);
							Listener textListener = new Listener() {
								public void handleEvent(final Event e) {
									switch (e.type) {
									case SWT.FocusOut:
										item.setText(column, text.getText());
										text.dispose();
										break;
									case SWT.Traverse:
										switch (e.detail) {
										case SWT.TRAVERSE_RETURN:
											item.setText(column, text.getText());
											// FALL THROUGH
										case SWT.TRAVERSE_ESCAPE:
											text.dispose();
											e.doit = false;
										}
										break;
									}
								}
							};
							text.addListener(SWT.FocusOut, textListener);
							text.addListener(SWT.Traverse, textListener);
							editor.setEditor(text, item, i);
							text.setText(item.getText(i));
							text.selectAll();
							text.setFocus();
							return;
						}
						if (!visible && rect.intersects(clientArea)) {
							visible = true;
						}
					}
					if (!visible)
						return;
					index++;
				}
				model.setNamespaseToPackageMapping(getNs2PkgMapping());
			}
		});

		namespace2packageTable.addListener(SWT.MouseExit, new Listener() {
			public void handleEvent(Event event) {
				model.setNamespaseToPackageMapping(getNs2PkgMapping());
			}
		});

		// ***********************************************************************************************************************
		// Moved this to observable method
		// populateParamsFromWSDL();
		// populateModel();
	}

	// /**
	// * A util method to create a new column
	// *
	// * @param table
	// * @param width
	// * @param colName
	// */
	// private void declareColumn(Table table, int width, String colName) {
	// TableColumn column = new TableColumn(table, SWT.NONE);
	// column.setWidth(width);
	// column.setText(colName);
	// }

	/**
	 * get the package to namespace mappings
	 *
	 * @return
	 */
	public String getNs2PkgMapping() {
		String returnList = "";
		TableItem[] items = namespace2packageTable.getItems();
		String packageValue;
		for (int i = 0; i < items.length; i++) {
			packageValue = items[i].getText(1);
			if (packageValue != null && !"".equals(packageValue)) {
				returnList = returnList + ("".equals(returnList) ? "" : ",")
						+ items[i].getText(0) + "=" + packageValue;
			}

		}
		return "".equals(returnList) ? null : returnList;
	}

	private void populateModel() {
		model.setServiceName(serviceNameCombo.getText());
		if (portNameCombo.getSelectionIndex() == 0)
			model.setPortName(null);
		else
			model.setPortName(portNameCombo.getText());
		model.setPackageName(packageText.getText());
		model.setDatabindingType(databindingTypeCombo.getText());
		// model.setASync(asyncOnlyRadioButton.getSelection());
		// model.setSync(syncOnlyRadioButton.getSelection());
		if (syncAndAsyncRadioButton.getSelection()) {
			model.setGenerateAsyncCode(!syncAndAsyncRadioButton.getSelection());
			model.setGenerateSyncCode(!syncAndAsyncRadioButton.getSelection());
		}
		model.setGenerateAllCode(generateAllCheckBoxButton.getSelection());
		model.setGenerateTestCase(testCaseCheckBoxButton.getSelection());
		model.setNamespaseToPackageMapping(getNs2PkgMapping());
		model.setUnpack(unpackClassesCheckBoxButton.getSelection());
	}

	/**
	 * Fill the combo with proper databinding names
	 */
	private void fillDatabinderCombo() {
		databindingTypeCombo.add(WSASCoreUIMessages.DATA_BINDING_ADB.toLowerCase());
		databindingTypeCombo.add(WSASCoreUIMessages.DATA_BINDING_XMLBEANS.toLowerCase());
		databindingTypeCombo.add(WSASCoreUIMessages.DATA_BINDING_JIBX.toLowerCase());
		databindingTypeCombo.add(WSASCoreUIMessages.DATA_BINDING_NONE.toLowerCase());
		databindingTypeCombo.select(0);
	}

	/**
	 * populate the service and the port from the WSDL this needs to be public
	 * since the WSDLselection page may call this
	 */
	public void populateParamsFromWSDL() {
		if (reader == null)
			reader = new WSDLPropertyReader();
		try {
			String lname = model.getWsdlURI();
			if (!"".equals(lname.trim())) {

				reader.readWSDL(model.getGeneratedCodeLocation(), lname);

				this.serviceQNameList = reader.getServiceList();
				if (!serviceQNameList.isEmpty()) {
					serviceNameCombo.removeAll();
					for (int i = 0; i < serviceQNameList.size(); i++) {
						// add the local part of the
						QName serviceQnameInstance = serviceQNameList.get(0);
						serviceNameCombo.add(serviceQnameInstance
								.getLocalPart());
					}
					;
					// select the first one as the default
					serviceNameCombo.select(0);

					// load the ports
					loadPortNames();

				} else {
					// service name list being empty means we are switching to
					// the interface mode
					if (serviceNameCombo != null)
						serviceNameCombo.removeAll();
					if (portNameCombo != null)
						portNameCombo.removeAll();

				}

				populatePackageName();

				// populate the namespacess
				loadNamespaces(reader.getDefinitionNamespaceMap());
			}
		} catch (Exception e) {
			status = StatusUtils
					.errorStatus(
							NLS.bind(
									WSASConsumptionUIMessages.ERROR_INVALID_WSDL_FILE_READ_WRITEL,
									new String[] { e.getLocalizedMessage() }),
							e);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.wst.command.env.ui.widgets.WidgetContributor#getStatus()
	 */
	public IStatus getStatus() {
		IStatus result = null;
		return result;
	}

	private void populatePackageName() {
		this.packageText.setText(reader.packageFromTargetNamespace());
	}

	private void loadPortNames() {
		int selectionIndex = serviceNameCombo.getSelectionIndex();
		if (selectionIndex != -1) {
			java.util.List ports = reader.getPortNameList(serviceQNameList
					.get(selectionIndex));
			if (!ports.isEmpty()) {
				portNameCombo.removeAll();
				portNameCombo.add(WSASCoreUIMessages.PORT_GENERATE_ALL);
				for (int i = 0; i < ports.size(); i++) {
					// add the local part of the
					portNameCombo.add(ports.get(i).toString());
				}
				portNameCombo.select(0);
			} else {
				// error no ports found
			}
		}
	}

	/**
	 * Loads the namespaces
	 *
	 * @param namespaceMap
	 */
	private void loadNamespaces(Map namespaceMap) {
		Iterator namespaces = namespaceMap.values().iterator();
		namespace2packageTable.removeAll();
		TableItem[] items = new TableItem[namespaceMap.size()]; // An item for
																// each field

		int i = 0;
		while (namespaces.hasNext()) {

			items[i] = new TableItem(namespace2packageTable, SWT.NULL);
			String namespace = (String) namespaces.next();
			items[i].setText(0, namespace);
			items[i].setText(1, getPackageFromNamespace(namespace));
			i++;
		}

		namespace2packageTable.setVisible(true);

	}

	/**
	 * get the package derived by Namespace
	 */
	public String getPackageFromNamespace(String namespace) {
		// Use reflection to invoke org.apache.axis2.util.URLProcessor
		// makePackageName(namespace) statically
		String stringReturn = null;
		try {
			// Class URLProcessorClass = ClassLoadingUtil
			// .loadClassFromAntClassLoader("org.apache.axis2.util.URLProcessor");
			// Method makePackageNameMethod = URLProcessorClass
			// .getMethod("makePackageName", new Class[]{String.class});
			stringReturn = URLProcessor.makePackageName(namespace);
		} catch (SecurityException e) {
			log.error(e);
			// } catch (NoSuchMethodException e) {
			// log.error(e);
			// } catch (IllegalArgumentException e) {
			// log.error(e);
			// } catch (IllegalAccessException e) {
			// log.error(e);
			// } catch (InvocationTargetException e) {
			// log.error(e);
		}
		return stringReturn;

	}

	public void update() {
			populateParamsFromWSDL();
			populateModel();
			isDataPopulated = true;
	}
}
