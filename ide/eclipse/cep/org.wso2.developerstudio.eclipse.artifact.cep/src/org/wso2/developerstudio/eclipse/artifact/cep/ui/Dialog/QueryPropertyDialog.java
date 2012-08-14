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

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.wso2.carbon.cep.core.internal.util.CEPConstants;
import org.wso2.carbon.cep.core.mapping.property.XMLProperty;

public class QueryPropertyDialog extends TitleAreaDialog {

	private String propertyName = "";
	private String xmlFieldName = "";
	private String selectedXMLFieldType = CEPConstants.CEP_CONF_XML_FIELD_TYPE_ELEMENT;
	private Text proName;
	private Text xmlproField;
	private Combo xmlFieldType;
	private String[] xmlFieldTypes = {
			CEPConstants.CEP_CONF_XML_FIELD_TYPE_ELEMENT,
			CEPConstants.CEP_CONF_XML_FIELD_TYPE_ATTRIBUTE };
	private XMLProperty property;

	public QueryPropertyDialog(Shell parentShell, boolean edit) {
		super(parentShell);

	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		super.create();
		setTitle("Query Property Configuration");
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		GridData grData = null;
		final ScrolledComposite scrolledContainer = new ScrolledComposite(
				parent, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER | SWT.FILL);

		scrolledContainer.setExpandHorizontal(true);
		scrolledContainer.setExpandVertical(true);
		scrolledContainer.setAlwaysShowScrollBars(true);
		scrolledContainer.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		final Composite container = new Composite(scrolledContainer, SWT.NONE);
		scrolledContainer.setContent(container);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		container.setLayout(layout);
		final Label lbName = new Label(container, SWT.NULL);
		lbName.setText("Name");

		proName = new Text(container, SWT.BORDER | SWT.SINGLE);
		grData = new GridData(GridData.FILL_HORIZONTAL);
		grData.horizontalSpan = 2;
		proName.setLayoutData(grData);
		proName.setText(propertyName);

		final Label lbFieldName = new Label(container, SWT.NULL);
		lbFieldName.setText("XML Field Name");

		xmlproField = new Text(container, SWT.BORDER | SWT.SINGLE);
		grData = new GridData(GridData.FILL_HORIZONTAL);
		grData.horizontalSpan = 2;

		xmlproField.setLayoutData(grData);
		xmlproField.setText(xmlFieldName);

		final Label lbFieldType = new Label(container, SWT.NULL);
		lbFieldType.setText("XML Field Type");

		xmlFieldType = new Combo(container, SWT.READ_ONLY);
		grData = new GridData();

		xmlFieldType.setItems(xmlFieldTypes);
		xmlFieldType.setText(selectedXMLFieldType);
		xmlFieldType.setLayoutData(grData);

		scrolledContainer.setMinSize(container.computeSize(SWT.DEFAULT,
				SWT.DEFAULT));
		container.layout();

		return super.createDialogArea(scrolledContainer);
	}

	private boolean finalizePage() {
		boolean ok = true;
		property = new XMLProperty();
		propertyName = proName.getText().trim();
		xmlFieldName = xmlproField.getText().trim();
		selectedXMLFieldType = xmlFieldType.getText().trim();
		property.setName(propertyName);
		property.setXmlFieldName(xmlFieldName);
		property.setXmlFieldType(selectedXMLFieldType);
		if (proName.getText().trim().equals("")) {
			ok = false;
		}
		return ok;
	}

	public void initializePage(XMLProperty property) {
		propertyName = property.getName();
		xmlFieldName = property.getXmlFieldName();
		selectedXMLFieldType = property.getXmlFieldType();
	}

	public XMLProperty getProperty() {
		return property;
	}

	@Override
	protected void okPressed() {
		// TODO Auto-generated method stub
		if (finalizePage()) {
			super.okPressed();
		} else {
			super.cancelPressed();
		}
	}
}
