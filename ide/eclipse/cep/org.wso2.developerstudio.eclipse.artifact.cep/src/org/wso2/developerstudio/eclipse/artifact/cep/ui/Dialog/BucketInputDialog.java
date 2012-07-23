package org.wso2.developerstudio.eclipse.artifact.cep.ui.Dialog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.wso2.carbon.cep.core.XpathDefinition;
import org.wso2.carbon.cep.core.mapping.input.Input;
import org.wso2.carbon.cep.core.mapping.input.mapping.XMLInputMapping;
import org.wso2.carbon.cep.core.mapping.property.XMLProperty;

public class BucketInputDialog extends TitleAreaDialog {
	private String selectedBrokerName = "";
	private String xpathType;
	private String propertyName;
	private String xpath;
	private String type;
	private String prifix;
	private String sNamespace;
	private String iTopic = "";
	private String iStream = "";
	private Map<String, String> xpathPrefixes = new HashMap<String, String>();
	private Map<String, String> properties = new HashMap<String, String>();
	private Text topic;
	private Text txtStream;
	private Text cmbBroker;
	private Button add;
	private Button delete;
	private Button edit;
	private Button addproperty;
	private Button editproperty;
	private Button deleteproperty;
    private boolean editPage = false;
	
	private TableViewer viewer;
	private Table table;
	private Table tableProperty;
	private TableViewer viewerProperty;

	private List<XpathDefinition> xpathList = new ArrayList<XpathDefinition>();
	private List<XMLProperty> propertyList = new ArrayList<XMLProperty>();
	private boolean isPageCanceled = false;
	private Input input;

	public BucketInputDialog(Shell shell, boolean edit) {
		super((Shell) shell);
		editPage = edit;
		XpathDefinition initXpathDefinition = new XpathDefinition();
		XMLProperty initXMLProperty = new XMLProperty();
		initXpathDefinition.setPrefix("");
		initXpathDefinition.setNamespace("");
		initXMLProperty.setName("");
		initXMLProperty.setXpath("");
		initXMLProperty.setType("");
	    xpathList.add(initXpathDefinition);
		xpathList.add(initXpathDefinition);
		xpathList.add(initXpathDefinition);
		xpathList.add(initXpathDefinition);
		propertyList.add(initXMLProperty);
		propertyList.add(initXMLProperty);
		propertyList.add(initXMLProperty);
		propertyList.add(initXMLProperty);

	}

	@Override
	public void create() {
		super.create();
		setTitle("Input Configuration");
		setMessage("");

	}

	@Override
	protected Control createDialogArea(Composite parent) {
		GridData grData  = null;
		final ScrolledComposite scrolleContainer = new ScrolledComposite(parent,
				SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		scrolleContainer.setMinSize(800, 500);
		scrolleContainer.setExpandHorizontal(true);
		scrolleContainer.setExpandVertical(true);
		scrolleContainer.setAlwaysShowScrollBars(true);
		final Composite container = new Composite(scrolleContainer, SWT.NONE);
		scrolleContainer.setContent(container);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.marginHeight = 10;

		Label lbTopic = new Label(container, SWT.NULL);
		lbTopic.setText("Topic*");
		topic = new Text(container, SWT.BORDER | SWT.SINGLE);
		grData = new GridData(GridData.FILL_HORIZONTAL);
		grData.horizontalSpan = 2;
		topic.setLayoutData(grData);
		topic.setText(iTopic);
		topic.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				
				if (topic.getText().trim().equals("")||txtStream.getText().trim().equals("")) {
					
                    getButton(OK).setEnabled(false);
				}else{
					getButton(OK).setEnabled(true);
				}

			}
		});
		Label lbBrokerName = new Label(container, SWT.NULL);
		lbBrokerName.setText("Broker Name");
		cmbBroker = new Text(container, SWT.BORDER | SWT.SINGLE);
		 grData = new GridData(GridData.FILL_HORIZONTAL);
		grData.horizontalSpan = 2;
		cmbBroker.setLayoutData(grData);
		cmbBroker.setText(selectedBrokerName);
		Label lbStream = new Label(container, SWT.NULL);
		lbStream.setText("Stream*");
		txtStream = new Text(container, SWT.BORDER | SWT.SINGLE);
		grData = new GridData(GridData.FILL_HORIZONTAL);
		grData.horizontalSpan = 2;
		txtStream.setLayoutData(grData);
        txtStream.setText(iStream);
        txtStream.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				// TODO Auto-generated method stub
				
if (topic.getText().trim().equals("")||txtStream.getText().trim().equals("")) {
					
                    getButton(OK).setEnabled(false);
				}else{
					getButton(OK).setEnabled(true);
				}

			}
		});
		Label lbXpathPrefix = new Label(container, SWT.NULL);
		lbXpathPrefix.setText("XpathPrefixes");

		Label lbEmpty = new Label(container, SWT.NULL);
		lbEmpty.setText("");
		grData = new GridData(GridData.FILL_HORIZONTAL);
		grData.horizontalSpan = 2;
		lbEmpty.setLayoutData(grData);
		setInputTable(container, xpathList);
		add = new Button(container, SWT.NONE);
		 grData = new GridData(GridData.FILL_HORIZONTAL);
		grData.horizontalSpan = 1;
		add.setLayoutData(grData);
		add.setText("Add...");
		add.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				boolean already = false;
				boolean allfilled = false;
				XpathPrefixeDialog xpathPrefix = new XpathPrefixeDialog(
						getParentShell(), false);
				xpathPrefix.create();
				XpathDefinition definition = null;
				if (xpathPrefix.open() == Window.OK) {
					definition = xpathPrefix.getXpathPrefix();

					for (XpathDefinition xpathDefinition : xpathList) {
						if (xpathDefinition.getPrefix()
								.equals(definition.getPrefix())) {
							already = true;

						}

					}

					if (!already) {
						setPrifix(definition.getPrefix());
						setSnameSpace(definition.getNamespace());
						xpathPrefixes.put(getPrifix(), getSnameSpace());
						int count = 0;
						for (XpathDefinition xdef : xpathList) {

							count++;
							if (xdef.getPrefix().equals("")) {
								int index = xpathList.indexOf(xdef);
								xpathList.remove(index);
								xpathList.add(index, definition);
								allfilled = false;
								break;
							}
							if (count == xpathList.size()) {
								allfilled = true;
							}
						}
						if (allfilled) {
							xpathList.add(definition);
						}
					}

					viewer.setContentProvider(ArrayContentProvider
							.getInstance());
					viewer.setInput(xpathList.toArray());
					viewer.refresh();
					table.redraw();
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {

			}
		});

		edit = new Button(container, SWT.NONE);
		 grData = new GridData(GridData.FILL_HORIZONTAL);
		grData.horizontalSpan = 1;
		edit.setLayoutData(grData);
		edit.setText("Edit...");
		edit.setEnabled(false);
		edit.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {

				int selectedIndex = table.getSelectionIndex();
				XpathDefinition xpathDefinitionEdit = xpathList.get(selectedIndex);
				XpathPrefixeDialog xpath = new XpathPrefixeDialog(getShell(),
						true);
				xpath.initializePage(xpathDefinitionEdit);
				xpath.create();
				if (xpath.open() == Window.OK) {
					xpathPrefixes.remove(xpathDefinitionEdit.getPrefix());
					xpathList.remove(selectedIndex);
					XpathDefinition definiton = xpath.getXpathPrefix();
					xpathList.add(selectedIndex, definiton);
					xpathPrefixes.put(definiton.getPrefix(),
							definiton.getNamespace());
				}

				edit.setEnabled(false);
				delete.setEnabled(false);

				viewer.setContentProvider(ArrayContentProvider.getInstance());
				viewer.setInput(xpathList.toArray());
				viewer.refresh();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		delete = new Button(container, SWT.NONE);
		 grData = new GridData(GridData.FILL_HORIZONTAL);
		grData.horizontalSpan = 1;
		delete.setLayoutData(grData);
		delete.setText("Delete");
		delete.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				xpathPrefixes.remove(xpathList.get(table.getSelectionIndex())
						.getPrefix());
				xpathList.remove(table.getSelectionIndex());
				delete.setEnabled(false);
				viewer.setContentProvider(ArrayContentProvider.getInstance());
				viewer.setInput(xpathList.toArray());
				viewer.refresh();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
			}
		});
		delete.setEnabled(false);
		table.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				delete.setEnabled(true);
				edit.setEnabled(true);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		Label lbProperties = new Label(container, SWT.NULL);
		lbProperties.setText("Properties");
		Label lbempty = new Label(container, SWT.NULL);
		lbempty.setText("");
		setPropertyTable(container, propertyList);
		addproperty = new Button(container, SWT.NONE);
		 grData = new GridData(GridData.FILL_HORIZONTAL);
		addproperty.setLayoutData(grData);
		addproperty.setText("Add...");
		addproperty.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				boolean already = false;
				boolean allfilled = false;
				InputPropertyDialog inputProperty = new InputPropertyDialog(
						getParentShell(), false);
				inputProperty.create();
				if (inputProperty.open() == Window.OK) {
					XMLProperty xmlProperty = inputProperty.getProperties();

					for (int k = 0; k < propertyList.size(); k++) {
						if (propertyList.get(k).getName().equals(xmlProperty.getName())) {
							already = true;

						}

					}

					if (!already) {
						setPropertyName(xmlProperty.getName());
						setXpath(xmlProperty.getXpath());
						setType(xmlProperty.getType());

						String value = getXpath() + "|" + getType();
						properties.put(getPropertyName(), value);

						int count = 0;
						for (XMLProperty xProperty : propertyList) {

							count++;
							if (xProperty.getName().equals("")) {
								int index = propertyList.indexOf(xProperty);
								propertyList.remove(index);
								propertyList.add(index, xmlProperty);
								allfilled = false;
								break;
							}
							if (count == xpathList.size()) {
								allfilled = true;
							}
						}
						if (allfilled) {
							propertyList.add(xmlProperty);
						}
					}

				}
				viewerProperty.setContentProvider(ArrayContentProvider.getInstance());
				viewerProperty.setInput(propertyList.toArray());
				viewerProperty.refresh();
				

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {

			}
		});
		editproperty = new Button(container, SWT.NONE);
		editproperty.setText("Edit...");
		editproperty.setEnabled(false);
		 grData = new GridData(GridData.FILL_HORIZONTAL);
		editproperty.setLayoutData(grData);
		editproperty.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {

				int selectedIndex = tableProperty.getSelectionIndex();
				XMLProperty property = propertyList.get(selectedIndex);
				InputPropertyDialog dialog = new InputPropertyDialog(
						getParentShell(), true);
				dialog.initialize(property);
				dialog.create();
				if (dialog.open() == Window.OK) {

					properties.remove(property.getName());
					propertyList.remove(tableProperty.getSelectionIndex());

					XMLProperty newProperty = dialog.getProperties();
					propertyList.add(selectedIndex, newProperty);
					properties.put(
							newProperty.getName(),
							newProperty.getXpath() + "|"
									+ newProperty.getType());
					editproperty.setEnabled(false);
					deleteproperty.setEnabled(false);
					viewerProperty.setContentProvider(ArrayContentProvider
							.getInstance());
					viewerProperty.setInput(propertyList.toArray());
					viewerProperty.refresh();

				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {

			}
		});

		deleteproperty = new Button(container, SWT.NONE);
		deleteproperty.setText("Delete");
		 grData = new GridData(GridData.FILL_HORIZONTAL);
		deleteproperty.setLayoutData(grData);
		deleteproperty.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				properties.remove(propertyList
						.get(tableProperty.getSelectionIndex()).getName());
				propertyList.remove(tableProperty.getSelectionIndex());
				deleteproperty.setEnabled(false);
				viewerProperty.setContentProvider(ArrayContentProvider.getInstance());
				viewerProperty.setInput(propertyList.toArray());
				viewerProperty.refresh();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {

			}
		});

		deleteproperty.setEnabled(false);
		tableProperty.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				deleteproperty.setEnabled(true);
				editproperty.setEnabled(true);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		scrolleContainer
				.setMinSize(container.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		container.layout();
      return super.createDialogArea(scrolleContainer);
		
	}

	public boolean finalizePage() {
		boolean ok = true;
		input = new Input();
		input.setTopic(topic.getText().trim());
		input.setBrokerName(cmbBroker.getText().trim());
		XMLInputMapping xmlMap = new XMLInputMapping();
		xmlMap.setStream(txtStream.getText().trim());
		List<XpathDefinition> xpathDefinitionList = new ArrayList<XpathDefinition>();
		for (String prefix : xpathPrefixes.keySet()) {
			XpathDefinition definition = new XpathDefinition();
			definition.setPrefix( prefix);
			definition.setNamespace(xpathPrefixes.get(prefix));
			xpathDefinitionList.add(definition);
		}
		List<XMLProperty> xmlProperty = new ArrayList<XMLProperty>();
		for (String pName : properties.keySet()) {
			XMLProperty property = new XMLProperty();
			property.setName( pName);
			String xpath, type;
			xpath = properties.get(pName)// TODO chnage name
					.substring(0, properties.get(pName).indexOf("|"));
			type = properties.get(pName).substring(
					properties.get(pName).indexOf("|") + 1);
			property.setXpath(xpath);
			property.setType(type);
			xmlProperty.add(property);
		}

		xmlMap.setXpathDefinitionList(xpathDefinitionList);
		xmlMap.setProperties(xmlProperty);

		input.setInputMapping(xmlMap);
          if(topic.getText().trim().equals("")||txtStream.getText().trim().equals("")){
        	  ok =false;
          }
          return ok;
	}

	public void initiatePage(Input input) {

		setItopic(input.getTopic());
		setSelectedBrokerName(input.getBrokerName());
		if (input.getInputMapping() instanceof XMLInputMapping) {
			setIstream(((XMLInputMapping) input.getInputMapping()).getStream());
		}
		if (((XMLInputMapping) input.getInputMapping())
				.getXpathDefinitionList() != null) {
			xpathList = ((XMLInputMapping) input.getInputMapping())
					.getXpathDefinitionList();
			for (XpathDefinition xpathdefinition : xpathList) {
				xpathPrefixes.put(xpathdefinition.getPrefix(),
						xpathdefinition.getNamespace());

			}
		}
		if (((XMLInputMapping) input.getInputMapping()).getProperties() != null) {
			propertyList = ((XMLInputMapping) input.getInputMapping())
					.getProperties();
			for (XMLProperty xmlProperty : propertyList) {
				this.properties.put(xmlProperty.getName(),
						xmlProperty.getXpath() + "|" + xmlProperty.getType());

			}

		}

	}

	public void setPageCanceld(boolean value) {
		isPageCanceled = value;
	}

	public boolean getPageCanceled() {
		return isPageCanceled;
	}

	public void setStream(String stream) {
		txtStream.setText(stream);
	}

	public Text getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic.setText(topic);
	}

	private void setInputTable(Composite container, List<XpathDefinition> xpathlist) {
		viewer = new TableViewer(container, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		GridData grTable = new GridData(GridData.FILL_HORIZONTAL);
		grTable.horizontalSpan = 2;
		grTable.verticalSpan=3;
		table.setLayoutData(grTable);
		TableViewerColumn viewerColumn = new TableViewerColumn(viewer,
				SWT.NONE, 0);
		viewerColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof XpathDefinition) {
					XpathDefinition p = (XpathDefinition) element;

					return p.getPrefix();
				} else
					return "";
			}
		});
		viewerColumn.getColumn().setWidth(200);
		viewerColumn.getColumn().setText("prefix");

		TableViewerColumn viewerColumn1 = new TableViewerColumn(viewer,
				SWT.NONE, 1);
		viewerColumn1.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof XpathDefinition) {
					XpathDefinition p = (XpathDefinition) element;
					return p.getNamespace();
				} else
					return "";
			}
		});
		viewerColumn1.getColumn().setWidth(200);
		viewerColumn1.getColumn().setText("Namespace");

		viewer.setContentProvider(ArrayContentProvider.getInstance());
		viewer.setInput(xpathlist.toArray());

	}

	private void setPropertyTable(Composite container, List<XMLProperty> propertylist) {
		viewerProperty = new TableViewer(container, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		tableProperty = viewerProperty.getTable();
		tableProperty.setHeaderVisible(true);
		tableProperty.setLinesVisible(true);
		GridData grtab = new GridData(GridData.FILL_HORIZONTAL);
		grtab.horizontalSpan = 2;
		grtab.verticalSpan=3;
		tableProperty.setLayoutData(grtab);
		TableViewerColumn viewerColumn = new TableViewerColumn(viewerProperty,
				SWT.NONE, 0);
		viewerColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof XMLProperty) {
					return ((XMLProperty) element).getName();
				} else
					return "";
			}
		});
		viewerColumn.getColumn().setWidth(200);
		viewerColumn.getColumn().setText("Name");

		TableViewerColumn viewerColumnXpath = new TableViewerColumn(viewerProperty,
				SWT.NONE, 1);
		viewerColumnXpath.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof XMLProperty) {
					return ((XMLProperty) element).getXpath();
				} else
					return "";
			}
		});
		viewerColumnXpath.getColumn().setWidth(200);
		viewerColumnXpath.getColumn().setText("Xpath");
		TableViewerColumn viewerColumnFieldName = new TableViewerColumn(viewerProperty,
				SWT.NONE, 2);
		viewerColumnFieldName.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof XMLProperty) {
					return ((XMLProperty) element).getType();
				} else
					return "";
			}
		});
		viewerColumnFieldName.getColumn().setWidth(200);
		viewerColumnFieldName.getColumn().setText("Type");

		viewerProperty.setContentProvider(ArrayContentProvider.getInstance());
		viewerProperty.setInput(propertylist.toArray());

	}

	@Override
	protected void okPressed() {
		// TODO Auto-generated method stub
		if(finalizePage()){
			super.okPressed();
		}else{
			getButton(OK).setEnabled(false);
		}
		

	}

	public String getPrifix() {
		return prifix;
	}

	public void setPrifix(String prifix) {
		this.prifix = prifix;
	}

	public String getSnameSpace() {
		return sNamespace;
	}

	public void setSnameSpace(String snameSpace) {
		sNamespace = snameSpace;
	}

	public String getItopic() {
		return iTopic;
	}

	public void setItopic(String itopic) {
		this.iTopic = itopic;
	}

	public String getIstream() {
		return iStream;
	}

	public void setIstream(String istream) {
		this.iStream = istream;
	}

	public String getSelectedBrokerName() {
		return selectedBrokerName;
	}

	public void setSelectedBrokerName(String selectedBrokerName) {
		this.selectedBrokerName = selectedBrokerName;
	}

	public String getXpathtype() {
		return xpathType;
	}

	public void setXpathtype(String xpathtype) {
		this.xpathType = xpathtype;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getXpath() {
		return xpath;
	}

	public void setXpath(String xpath) {
		this.xpath = xpath;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Map<String, String> getXpathPrefixes() {
		return xpathPrefixes;
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public Input getInput() {
		return input;
	}

}
