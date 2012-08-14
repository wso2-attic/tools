/*
 * Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.wso2.carbon.cep.core.Expression;
import org.wso2.carbon.cep.core.Query;
import org.wso2.carbon.cep.core.internal.util.CEPConstants;
import org.wso2.carbon.cep.core.mapping.output.Output;
import org.wso2.carbon.cep.core.mapping.output.mapping.ElementOutputMapping;
import org.wso2.carbon.cep.core.mapping.output.mapping.XMLOutputMapping;
import org.wso2.carbon.cep.core.mapping.property.XMLProperty;
import org.wso2.developerstudio.eclipse.artifact.cep.utils.CEPArtifactConstants;

public class QueryDialog extends TitleAreaDialog {
	private String qname = "";
	private String qExpressionType = CEPConstants.CEP_CONF_EXPRESSION_INLINE;
	private String queryBroker = "";
	private String selectedMethod = CEPConstants.CEP_CONF_ELE_XML_MAPPING;
	private String qExpression = "";
	private String qExpressionLookUpKey = "";
	private String oDocumentElement = "";
	private String oNamespace = "";
	private String oTopic = "";
	private String sXMLMapping = "";
	private String propertyName = "";
	private String selectedXMLFieldType = CEPConstants.CEP_CONF_XML_FIELD_TYPE_ELEMENT;
	private String xmlFieldName = "";
	private String hashMapProperty = "";
	private String[] expressionTypes = {
			CEPConstants.CEP_CONF_EXPRESSION_INLINE,
			CEPConstants.CEP_REGISTRY_KEY };
	private String[] methods = { CEPConstants.CEP_CONF_ELE_XML_MAPPING,
			CEPConstants.CEP_CONF_ELE_EMAPPING };
	private String[] xmlFieldTypes = {
			CEPConstants.CEP_CONF_XML_FIELD_TYPE_ELEMENT,
			CEPConstants.CEP_CONF_XML_FIELD_TYPE_ATTRIBUTE };
	private boolean editPage = false;
	private boolean exceedCount = false;

	private boolean isPageCanceled = false;

	private int count;//
	private List<XMLProperty> queryProperty = new ArrayList<XMLProperty>();
	private Map<String, String> proQuery = new HashMap<String, String>();
	private Text name;
	private Text expression;
	private Text expressionLookUpKey;
	private Text topic;
	private Text documentElement;
	private Text namespace;
	private Text xmlMapping;
	private Text brokerName;

	private Combo expressionAs;

	private CTabFolder tabFolder;
	private CTabItem tXMLMap;
	private CTabItem tEleMap;
	private TableViewer tableQuery;
	private Table table;

	private Button edit;
	private Button add;
	private Button delete;
	private Query query;

	@Override
	public void create() {

		super.create();
		setTitle("Query Configuration");
		setMessage("");
	}

	public QueryDialog(Shell parentShell, boolean edit) {
		super(parentShell);
		editPage = edit;
		XMLProperty empty = new XMLProperty();
		empty.setName("");
		empty.setXmlFieldName("");
		empty.setXmlFieldType("");
		queryProperty.add(empty);
		queryProperty.add(empty);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		GridData grData = null;
		final ScrolledComposite scrolledContainer = new ScrolledComposite(
				parent, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		scrolledContainer.setMinSize(800, 500);
		scrolledContainer.setExpandHorizontal(true);
		scrolledContainer.setExpandVertical(true);
		scrolledContainer.setAlwaysShowScrollBars(true);
		final Composite container = new Composite(scrolledContainer, SWT.NONE
				| SWT.V_SCROLL);
		scrolledContainer.setContent(container);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		layout.marginHeight = 10;
		Label lbName = new Label(container, SWT.NULL);
		lbName.setText("Name*");
		name = new Text(container, SWT.BORDER | SWT.SINGLE);
		name.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		name.setText(qname);
		name.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				if (name.getText().trim().equals("")) {
					getButton(OK).setEnabled(false);
				} else {
					getButton(OK).setEnabled(true);
				}
			}
		});
		Label lbExpression = new Label(container, SWT.NULL);
		lbExpression.setText("Expression as ");

		expressionAs = new Combo(container, SWT.READ_ONLY);
		expressionAs.setItems(expressionTypes);
		expressionAs.setText(qExpressionType);
		expressionAs.setBounds(150, 44, 152, 23);
		final Label lbExpressionLookup = new Label(container, SWT.NULL);
		lbExpressionLookup.setText("Expresion Look Up Key");
		lbExpressionLookup.setVisible(false);
		expressionLookUpKey = new Text(container, SWT.BORDER | SWT.SINGLE);
		expressionLookUpKey
				.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		expressionLookUpKey.setVisible(false);
		expressionLookUpKey.setText(qExpressionLookUpKey);
		final Label lblExpression = new Label(container, SWT.NULL);
		lblExpression.setText("Expression");
		expression = new Text(container, SWT.BORDER | SWT.MULTI);
		expression.setLayoutData(new GridData(GridData.FILL_HORIZONTAL, 100));
		expression.setText(qExpression);
		expressionAs.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				if (expressionAs.getSelectionIndex() == 1) {
					lbExpressionLookup.setVisible(true);

					expressionLookUpKey.setVisible(true);
					lblExpression.setVisible(false);
					expression.setVisible(false);

				} else if (expressionAs.getSelectionIndex() == 0) {
					lbExpressionLookup.setVisible(false);
					;
					expressionLookUpKey.setVisible(false);
					lblExpression.setVisible(true);
					expression.setVisible(true);
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {

			}
		});
		Label lbOutput = new Label(container, SWT.NULL);
		lbOutput.setText("Output");
		Label lbEmpty = new Label(container, SWT.NULL);
		lbEmpty.setText("");
		Label lbTopic = new Label(container, SWT.NULL);
		lbTopic.setText("Topic");
		topic = new Text(container, SWT.BORDER | SWT.SINGLE);
		topic.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		topic.setText(oTopic);
		Label lbBrokerName = new Label(container, SWT.NULL);
		lbBrokerName.setText("Broker Name");
		brokerName = new Text(container, SWT.BORDER | SWT.SINGLE);
		brokerName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		brokerName.setText(queryBroker);
		Label lbMethod = new Label(container, SWT.NULL);
		lbMethod.setText("Method");

		tabFolder = new CTabFolder(container, SWT.NULL);
		tabFolder.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		tXMLMap = new CTabItem(tabFolder, SWT.NULL);
		tXMLMap.setText("XML Mapping");
		xmlMapping = new Text(tabFolder, SWT.BORDER | SWT.MULTI);
		tXMLMap.setControl(xmlMapping);
		xmlMapping.setLayoutData(new GridData(GridData.FILL_HORIZONTAL, 200));
		xmlMapping.setText(sXMLMapping);
		tEleMap = new CTabItem(tabFolder, SWT.NULL);
		tEleMap.setText("Element Mapping");
		if (getSelectedMethod().equals(CEPConstants.CEP_CONF_ELE_XML_MAPPING)) {
			tabFolder.setSelection(tXMLMap);
		} else if (getSelectedMethod().equals(
				CEPConstants.CEP_CONF_ELE_EMAPPING)) {
			tabFolder.setSelection(tEleMap);
		}
		GridLayout tabLayout = new GridLayout();
		tabLayout.numColumns = 3;
		Composite tabComposite = new Composite(tabFolder, SWT.BORDER);
		tabComposite.setLayout(tabLayout);
		final Label lbDocElement = new Label(tabComposite, SWT.NULL);
		lbDocElement.setText("Document Element");
		documentElement = new Text(tabComposite, SWT.BORDER | SWT.SINGLE);
		grData = new GridData(GridData.FILL_HORIZONTAL);
		grData.horizontalSpan = 2;
		documentElement.setLayoutData(grData);
		documentElement.setText(oDocumentElement);
		documentElement.setLayoutData(grData);
		final Label lbNamespace = new Label(tabComposite, SWT.NULL);
		lbNamespace.setText("Namespace");
		namespace = new Text(tabComposite, SWT.BORDER | SWT.SINGLE);
		namespace.setText(oNamespace);
		grData = new GridData(GridData.FILL_HORIZONTAL);
		grData.horizontalSpan = 2;
		namespace.setLayoutData(grData);
		final Label lbProperties = new Label(tabComposite, SWT.NULL);
		lbProperties.setText("Properties");
		lbEmpty = new Label(tabComposite, SWT.NULL);
		lbEmpty.setText("");
		lbEmpty.setLayoutData(grData);
		tableQuery = new TableViewer(tabComposite, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		table = tableQuery.getTable();
		grData = new GridData(GridData.FILL_HORIZONTAL);
		grData.horizontalSpan = 2;
		grData.verticalSpan = 3;
		table.setLayoutData(grData);

		add = new Button(tabComposite, SWT.NONE);
		grData = new GridData(GridData.FILL_HORIZONTAL);
		add.setLayoutData(grData);
		edit = new Button(tabComposite, SWT.NONE);
		edit.setLayoutData(grData);
		delete = new Button(tabComposite, SWT.NONE);
		delete.setLayoutData(grData);

		if (qExpressionType.equals(CEPConstants.CEP_CONF_EXPRESSION_INLINE)) {
			lbExpressionLookup.setVisible(false);
			expressionLookUpKey.setVisible(false);
			lblExpression.setVisible(true);
			expression.setVisible(true);
		} else if (qExpressionType.equals(CEPConstants.CEP_REGISTRY_KEY)) {
			lbExpressionLookup.setVisible(true);
			expressionLookUpKey.setVisible(true);
			lblExpression.setVisible(false);
			expression.setVisible(false);
		}

		add.setText("Add...");
		add.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				boolean already = false;
				QueryPropertyDialog dialog = new QueryPropertyDialog(
						getParentShell(), false);
				dialog.create();
				if (dialog.open() == Window.OK) {
					XMLProperty pro = dialog.getProperty();
					setPropertyName(pro.getName());

					for (int k = 0; k < queryProperty.size(); k++) {
						if (queryProperty.get(k).getName()
								.equals(getPropertyName())) {
							already = true;
						}
					}
					setXmlFieldName(pro.getXmlFieldName());
					setSelectedXMLFieldType(pro.getXmlFieldType());
					hashMapProperty = getXmlFieldName() + "|"
							+ getSelectedXMLFieldType();
					if (!editPage && !already) {
						if (count < 2 && !exceedCount) {
							queryProperty.remove(count);

							queryProperty.add(count, pro);
							proQuery.put(getPropertyName(), hashMapProperty);
							count++;
						} else {

							queryProperty.add(pro);
							proQuery.put(getPropertyName(), hashMapProperty);

						}
					} else if (editPage && !already) {
						int counting = 0;
						if (queryProperty.size() > 0) {
							while (queryProperty.get(0).getName().equals("")) {
								counting++;
								queryProperty.remove(0);
								if (counting == 2) {
									break;
								}
							}

						}

						queryProperty.add(pro);
						proQuery.put(getPropertyName(), hashMapProperty);

					}

					tableQuery.setContentProvider(ArrayContentProvider
							.getInstance());
					tableQuery.setInput(queryProperty.toArray());
					tableQuery.refresh();

				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {

			}
		});

		setQueryTable(tabComposite, queryProperty);
		tEleMap.setControl(tabComposite);
		table.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				delete.setEnabled(true);
				edit.setEnabled(true);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		edit.setText("Edit...");
		edit.setEnabled(false);
		edit.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {

				int selectedIndex = table.getSelectionIndex();
				XMLProperty property = queryProperty.get(selectedIndex);
				QueryPropertyDialog dialog = new QueryPropertyDialog(
						getParentShell(), true);
				dialog.initializePage(property);
				dialog.create();
				if (dialog.open() == Window.OK) {
					XMLProperty newProperty = dialog.getProperty();
					hashMapProperty = newProperty.getXmlFieldName() + "|"
							+ newProperty.getXmlFieldType();
					proQuery.remove(queryProperty
							.get(table.getSelectionIndex()).getName());
					queryProperty.remove(selectedIndex);
					proQuery.put(newProperty.getName(), hashMapProperty);
					queryProperty.add(selectedIndex, newProperty);
					tableQuery.setContentProvider(ArrayContentProvider
							.getInstance());
					tableQuery.setInput(queryProperty.toArray());
					tableQuery.refresh();
					edit.setEnabled(false);
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		delete.setText("Delete");
		delete.setEnabled(false);
		delete.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (count < 2 && !exceedCount && !editPage) {
					queryProperty.remove(0);
				}
				exceedCount = true;

				proQuery.remove(queryProperty.get(table.getSelectionIndex())
						.getName());
				queryProperty.remove(table.getSelectionIndex());
				tableQuery.setContentProvider(ArrayContentProvider
						.getInstance());
				tableQuery.setInput(queryProperty.toArray());
				tableQuery.refresh();

				delete.setEnabled(false);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {

			}
		});

		scrolledContainer.setMinSize(container.computeSize(SWT.DEFAULT,
				SWT.DEFAULT));
		container.layout();

		return super.createDialogArea(scrolledContainer);
	}

	private void setQueryTable(Composite container,
			List<XMLProperty> propertylist) {

		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableViewerColumn viewerColumn = new TableViewerColumn(tableQuery,
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

		TableViewerColumn viewerColumnFieldName = new TableViewerColumn(
				tableQuery, SWT.NONE, 1);
		viewerColumnFieldName.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof XMLProperty) {
					return ((XMLProperty) element).getXmlFieldName();
				} else
					return "";
			}
		});
		viewerColumnFieldName.getColumn().setWidth(200);
		viewerColumnFieldName.getColumn().setText("Xml Field Name");
		TableViewerColumn viewerColumnXMLType = new TableViewerColumn(
				tableQuery, SWT.NONE, 2);
		viewerColumnXMLType.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof XMLProperty) {
					return ((XMLProperty) element).getXmlFieldType();
				} else
					return "";
			}
		});
		viewerColumnXMLType.getColumn().setWidth(200);
		viewerColumnXMLType.getColumn().setText("Xml Field Type");
		tableQuery.setContentProvider(ArrayContentProvider.getInstance());
		tableQuery.setInput(propertylist.toArray());
		tableQuery.refresh();
	}

	@Override
	protected boolean isResizable() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean finalizePage() {
		boolean ok = true;
		query = new Query();
		query.setName(name.getText().trim());
		Expression expressionObject = new Expression();
		expressionObject.setType(expressionTypes[expressionAs
				.getSelectionIndex()]);

		if (expressionTypes[expressionAs.getSelectionIndex()]
				.equals(CEPConstants.CEP_CONF_EXPRESSION_INLINE)) {
			expressionObject.setText(expression.getText().trim());
		} else if (expressionTypes[expressionAs.getSelectionIndex()]
				.equals(CEPConstants.CEP_REGISTRY_KEY)) {
			expressionObject.setText(expressionLookUpKey.getText().trim());
		}
		Output out = new Output();
		out.setTopic(topic.getText().trim());

		out.setBrokerName(brokerName.getText().trim());

		if (tabFolder.getSelection() == tXMLMap) {
			XMLOutputMapping xmlout = new XMLOutputMapping();
			xmlout.setMappingXMLText(xmlMapping.getText().trim());
			out.setOutputMapping(xmlout);
		} else if (tabFolder.getSelection() == tEleMap) {
			ElementOutputMapping eleMap = new ElementOutputMapping();
			eleMap.setDocumentElement(documentElement.getText().trim());
			eleMap.setNamespace(namespace.getText().trim());
			List<XMLProperty> xmlPropertList = new ArrayList<XMLProperty>();
			for (String key : proQuery.keySet()) {
				XMLProperty xmlpop = new XMLProperty();
				xmlpop.setName(key);

				String name = proQuery.get(key).substring(0,
						proQuery.get(key).indexOf("|"));
				xmlpop.setXmlFieldName(name);
				String type = proQuery.get(key).substring(
						proQuery.get(key).indexOf("|") + 1);
				xmlpop.setXmlFieldType(type);
				xmlPropertList.add(xmlpop);
			}
			eleMap.setProperties(xmlPropertList);
			out.setOutputMapping(eleMap);
		}

		query.setOutput(out);
		query.setExpression(expressionObject);
		if (name.getText().trim().equals("")) {
			ok = false;
		}
		return ok;
	}

	public void initializePage(Query query) {

		setQname(query.getName());
		if (query.getExpression().getType()
				.equals(CEPConstants.CEP_CONF_EXPRESSION_INLINE)) {
			setqExpressionType(CEPConstants.CEP_CONF_EXPRESSION_INLINE);
			setQexpression(query.getExpression().getText());
		} else if (query.getExpression().getType()
				.equals(CEPConstants.CEP_REGISTRY_KEY)) {
			setqExpressionType(CEPConstants.CEP_REGISTRY_KEY);
			setQexpressionLookUpKey(query.getExpression().getText());
		}
		setOtopic(query.getOutput().getTopic());
		setQueryBroker(query.getOutput().getBrokerName());
		if (query.getOutput().getOutputMapping() instanceof XMLOutputMapping) {
			setSelectedMethod(CEPConstants.CEP_CONF_ELE_XML_MAPPING);
			setSXMLMapping(((XMLOutputMapping) query.getOutput()
					.getOutputMapping()).getMappingXMLText());
		} else if (query.getOutput().getOutputMapping() instanceof ElementOutputMapping) {
			setSelectedMethod(CEPConstants.CEP_CONF_ELE_EMAPPING);
			setOdocumentElement(((ElementOutputMapping) query.getOutput()
					.getOutputMapping()).getDocumentElement());
			setOnameSpace(((ElementOutputMapping) query.getOutput()
					.getOutputMapping()).getNamespace());

			if (((ElementOutputMapping) query.getOutput().getOutputMapping())
					.getProperties() != null) {
				queryProperty.remove(0);
				queryProperty.remove(0);
			}
			List<XMLProperty> xmlProperty = ((ElementOutputMapping) query
					.getOutput().getOutputMapping()).getProperties();
			for (XMLProperty xmlproperty : xmlProperty) {

				queryProperty.add(xmlproperty);
				proQuery.put(
						xmlproperty.getName(),
						xmlproperty.getXmlFieldName() + "|"
								+ xmlproperty.getXmlFieldType());
			}

		}

	}

	public String getQueryBroker() {
		return queryBroker;
	}

	public void setQueryBroker(String queryBroker) {
		this.queryBroker = queryBroker;
	}

	@Override
	protected void okPressed() {
		// TODO Auto-generated method stub
		if (finalizePage()) {
			super.okPressed();
		} else {
			getButton(OK).setEnabled(false);

		}
	}

	public boolean isPageCanceled() {
		return isPageCanceled;
	}

	public void setPageCanceled(boolean isPageCanceled) {
		this.isPageCanceled = isPageCanceled;
	}

	public String getSelectedMethod() {
		return selectedMethod;
	}

	public void setSelectedMethod(String selectedMethod) {
		this.selectedMethod = selectedMethod;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public String getqExpressionType() {
		return qExpressionType;
	}

	public void setqExpressionType(String qExpressionType) {
		this.qExpressionType = qExpressionType;
	}

	public String getQexpression() {
		return qExpression;
	}

	public void setQexpression(String qexpression) {
		this.qExpression = qexpression;
	}

	public String getQexpressionLookUpKey() {
		return qExpressionLookUpKey;
	}

	public void setQexpressionLookUpKey(String qexpressionLookUpKey) {
		this.qExpressionLookUpKey = qexpressionLookUpKey;
	}

	public String getOdocumentElement() {
		return oDocumentElement;
	}

	public void setOdocumentElement(String odocumentElement) {
		this.oDocumentElement = odocumentElement;
	}

	public String getOnameSpace() {
		return oNamespace;
	}

	public void setOnameSpace(String onameSpace) {
		this.oNamespace = onameSpace;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getSelectedXMLFieldType() {
		return selectedXMLFieldType;
	}

	public void setSelectedXMLFieldType(String selectedXMLFieldType) {
		this.selectedXMLFieldType = selectedXMLFieldType;
	}

	public String getXmlFieldName() {
		return xmlFieldName;
	}

	public void setXmlFieldName(String xmlFieldName) {
		this.xmlFieldName = xmlFieldName;
	}

	public String[] getExpressionTypes() {
		return expressionTypes;
	}

	public void setExpressionTypes(String[] expressionTypes) {
		this.expressionTypes = expressionTypes;
	}

	public String[] getMethods() {
		return methods;
	}

	public void setMethods(String[] methods) {
		this.methods = methods;
	}

	public String[] getXmlFieldTypes() {
		return xmlFieldTypes;
	}

	public void setXmlFieldTypes(String[] xmlFieldTypes) {
		this.xmlFieldTypes = xmlFieldTypes;
	}

	public String getOtopic() {
		return oTopic;
	}

	public void setOtopic(String otopic) {
		this.oTopic = otopic;
	}

	public String getSXMLMapping() {
		return sXMLMapping;
	}

	public void setSXMLMapping(String sXMLMapping) {
		this.sXMLMapping = sXMLMapping;
	}

	public Query getQueryObject() {
		return query;
	}
}
