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

package org.wso2.developerstudio.eclipse.artifact.proxyservice.ui.wizard;

import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.wso2.developernstudio.eclipse.greg.base.ui.dialog.RegistryTreeBrowserDialog;
import org.wso2.developerstudio.eclipse.artifact.proxyservice.model.ProxyServiceModel;
import org.wso2.developerstudio.eclipse.artifact.proxyservice.model.ProxyServiceModel.TargetEPType;
import org.wso2.developerstudio.eclipse.artifact.proxyservice.utils.PsArtifactConstants;
import org.wso2.developerstudio.eclipse.artifact.proxyservice.validators.EndPointsList;
import org.wso2.developerstudio.eclipse.greg.base.model.RegistryResourceNode;
import org.wso2.developerstudio.eclipse.greg.base.persistent.RegistryURLInfo;
import org.wso2.developerstudio.eclipse.greg.base.persistent.RegistryUrlStore;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractComposite;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractListDataProvider.ListData;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectOptionData;
import org.wso2.developerstudio.eclipse.platform.core.templates.ArtifactTemplate;
import org.wso2.developerstudio.eclipse.platform.core.utils.ResourceManager;

public class AdvancedConfigComposite extends AbstractComposite {

	private static final String SYMBOLIC_NAME = "org.wso2.developerstudio.eclipse.artifact.proxyservice";
	private ProxyServiceModel model;

	/* common */
	private Label lblTargetEndpoint;
	private Text txtEndPointUrl;
	private Text txtEndPointkey;
	private Label lbltxtEndPointUrl;
	private Label lblEndpoint;
	private Combo cmbPredefinedEP;
	private Label lblEndPointkey;
	private Button cmdEndPointGovRegBrowse;
	private Button cmdEndPointConRegBrowse;
	private Button optPredefinedEndpoint;
	private Button optfromRegistry;
	private Button optEnterURL;

	private SelectionListener optListener;

	/* Transformer Proxy */
	private Label lblReqXSLT;
	private Text txtReqXSLT;

	private Button chkTransformResponses;

	private Label lblResponseXSLT;
	private Text txtResponseXSLT;

	private Button cmdReqXSLTConRegBrowse;
	private Button cmdReqXSLTGovRegBrowse;

	private Button cmdResXSLTConRegBrowse;
	private Button cmdResXSLTGovRegBrowse;

	/* Logging proxy */
	private Label lblReqLogLevel;
	private Combo cmbReqLogLevel;
	private Label lblResLogLevel;
	private Combo cmbResLogLevel;

	private String[] logLevelList = { "None", "Full", "Simple" };

	/* wsdl based proxy */

	private Label lblWsdlUri;
	private Text txtWsdlUri;
	private Label lblWsdlPort;
	private Text txtWsdlPort;
	private Label lblWsdlService;
	private Text txtWsdlService;
	private Button publishSameServiceContract;
	private Button cmdTestUri;

	/* secure proxy */
	private Label lblSecPolicy;
	private Text txtSecPolicy;
	private Button cmdSecPolicyConRegBrowse;
	private Button cmdSecPolicyGovRegBrowse;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 * @param model
	 */
	public AdvancedConfigComposite(Composite parent, int style,
			ProjectDataModel model, ProjectOptionData optionData,
			WizardPage wizardPage) {
		super(parent, style, model, optionData, wizardPage);
		setLayout(new GridLayout(5, false));
		setModel((ProxyServiceModel) getProjectModel());

		/* common */
		lblTargetEndpoint = new Label(this, SWT.NONE);
		lblTargetEndpoint.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				false, false, 1, 1));
		lblTargetEndpoint.setText("Target Endpoint");

		optEnterURL = new Button(this, SWT.RADIO);
		optEnterURL.setSelection(true);

		optListener = new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (optEnterURL.getSelection()) {
					hideControls(lblEndPointkey, txtEndPointkey,
							cmdEndPointConRegBrowse, cmdEndPointGovRegBrowse);
					hideControls(lblEndpoint, cmbPredefinedEP);
					showControls(lbltxtEndPointUrl, txtEndPointUrl);
					setModelPropertyValue("proxy.target.ep.type",
							TargetEPType.URL);
				} else if (optPredefinedEndpoint.getSelection()) {
					hideControls(lblEndPointkey, txtEndPointkey,
							cmdEndPointConRegBrowse, cmdEndPointGovRegBrowse);
					hideControls(lbltxtEndPointUrl, txtEndPointUrl);
					showControls(lblEndpoint, cmbPredefinedEP);
					setModelPropertyValue("proxy.target.ep.type",
							TargetEPType.PREDEFINED);
				} else if (optfromRegistry.getSelection()) {
					hideControls(lblEndpoint, cmbPredefinedEP);
					hideControls(lbltxtEndPointUrl, txtEndPointUrl);
					showControls(lblEndPointkey, txtEndPointkey,
							cmdEndPointConRegBrowse, cmdEndPointGovRegBrowse);
					setModelPropertyValue("proxy.target.ep.type",
							TargetEPType.REGISTRY);
				}
				AdvancedConfigComposite.this.layout();
			}
		};

		optEnterURL.setText("Enter URL");

		optPredefinedEndpoint = new Button(this, SWT.RADIO);
		optPredefinedEndpoint.setText("Predefined Endpoint");

		optfromRegistry = new Button(this, SWT.RADIO);

		optfromRegistry.addSelectionListener(optListener);
		optEnterURL.addSelectionListener(optListener);
		optPredefinedEndpoint.addSelectionListener(optListener);

		optfromRegistry.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 2, 1));
		optfromRegistry.setText("Pick from Registry");

		lbltxtEndPointUrl = new Label(this, SWT.NONE);
		lbltxtEndPointUrl.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				false, false, 1, 1));
		lbltxtEndPointUrl.setText("EndPoint URL");

		txtEndPointUrl = new Text(this, SWT.BORDER);
		txtEndPointUrl.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 4, 1));
		txtEndPointUrl.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent evt) {
				setModelPropertyValue(
						PsArtifactConstants.WIZARD_OPTION_TEMPL_COMMON_PS_EPURL,
						txtEndPointUrl.getText());
			}
		});

		lblEndpoint = new Label(this, SWT.NONE);
		lblEndpoint.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));
		lblEndpoint.setText("EndPoint");
		hideControls(lblEndpoint);

		cmbPredefinedEP = new Combo(this, SWT.DROP_DOWN | SWT.READ_ONLY);
		GridData gd_cmbPredefinedEP = new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 4, 1);
		gd_cmbPredefinedEP.widthHint = 100;
		cmbPredefinedEP.setLayoutData(gd_cmbPredefinedEP);
		
		EndPointsList epListProvider = new EndPointsList();
		List<ListData> epList = epListProvider.getListData(null,null);
		
		for(ListData listData: epList){
			if(null!=listData.getData()){
			cmbPredefinedEP.add((String) listData.getData());
			}
		}
		cmbPredefinedEP.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent evt) {
				setModelPropertyValue(
						PsArtifactConstants.WIZARD_OPTION_TEMPL_COMMON_PS_EPLIST,
						cmbPredefinedEP.getText());

			}

			public void widgetDefaultSelected(SelectionEvent evt) {
				widgetSelected(evt);

			}
		});
		hideControls(cmbPredefinedEP);

		// EndPoint key

		lblEndPointkey = new Label(this, SWT.NONE);
		lblEndPointkey.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));
		lblEndPointkey.setText("EndPoint key");
		hideControls(lblEndPointkey);

		txtEndPointkey = new Text(this, SWT.BORDER);
		GridData gd_txtEndPointkey = new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 2, 1);
		gd_txtEndPointkey.widthHint = 200;
		txtEndPointkey.setLayoutData(gd_txtEndPointkey);
		txtEndPointkey.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent evt) {
				setModelPropertyValue(
						PsArtifactConstants.WIZARD_OPTION_TEMPL_COMMON_PS_EPKEY,
						txtEndPointkey.getText());

			}
		});
		hideControls(txtEndPointkey);

		cmdEndPointConRegBrowse = new Button(this, SWT.NONE);
		cmdEndPointConRegBrowse.setLayoutData(new GridData(SWT.CENTER,
				SWT.CENTER, false, false, 1, 1));
		cmdEndPointConRegBrowse.setImage(ResourceManager.getPluginImage(SYMBOLIC_NAME, "icons/registry-16x16.png"));
		cmdEndPointConRegBrowse.setToolTipText("Configuration registry");
		cmdEndPointConRegBrowse.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent evt) {
				selectRegistryResource(txtEndPointkey, 2);
			}

			public void widgetDefaultSelected(SelectionEvent evt) {
				widgetSelected(evt);
			}
		});

		hideControls(cmdEndPointConRegBrowse);

		cmdEndPointGovRegBrowse = new Button(this, SWT.NONE);
		cmdEndPointGovRegBrowse.setLayoutData(new GridData(SWT.LEFT,
				SWT.CENTER, false, false, 1, 1));
		cmdEndPointGovRegBrowse.setImage(ResourceManager.getPluginImage(SYMBOLIC_NAME, "icons/registry_picker.gif"));
		cmdEndPointGovRegBrowse.setToolTipText("Governance registry");
		cmdEndPointGovRegBrowse.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent evt) {
				selectRegistryResource(txtEndPointkey, 3);
			}

			public void widgetDefaultSelected(SelectionEvent evt) {
				widgetSelected(evt);
			}
		});
		hideControls(cmdEndPointGovRegBrowse);

		/* Transformer Proxy */
		lblReqXSLT = new Label(this, SWT.NONE);
		lblReqXSLT.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));
		lblReqXSLT.setText("Request XSLT");

		txtReqXSLT = new Text(this, SWT.BORDER);
		GridData gd_txtReqXSLT = new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 2, 1);
		gd_txtReqXSLT.widthHint = 200;
		txtReqXSLT.setLayoutData(gd_txtReqXSLT);
		txtReqXSLT.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent evt) {
				setModelPropertyValue(
						PsArtifactConstants.WIZARD_OPTION_TEMPL_TRANSFORMER_PS_XSLT,
						txtReqXSLT.getText());

			}
		});

		cmdReqXSLTConRegBrowse = new Button(this, SWT.NONE);
		cmdReqXSLTConRegBrowse.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER,
				false, false, 1, 1));
		cmdReqXSLTConRegBrowse.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent evt) {
				selectRegistryResource(txtReqXSLT, 2);
			}

			public void widgetDefaultSelected(SelectionEvent evt) {
				widgetSelected(evt);
			}
		});
		cmdReqXSLTConRegBrowse.setImage(ResourceManager.getPluginImage(SYMBOLIC_NAME, "icons/registry-16x16.png"));
		cmdReqXSLTConRegBrowse.setToolTipText("Configuration registry");
		
		cmdReqXSLTGovRegBrowse = new Button(this, SWT.NONE);
		cmdReqXSLTGovRegBrowse.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER,
				false, false, 1, 1));
		cmdReqXSLTGovRegBrowse.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent evt) {
				selectRegistryResource(txtReqXSLT, 3);
			}

			public void widgetDefaultSelected(SelectionEvent evt) {
				widgetSelected(evt);
			}
		});
		cmdReqXSLTGovRegBrowse.setImage(ResourceManager.getPluginImage(SYMBOLIC_NAME, "icons/registry_picker.gif"));
		cmdReqXSLTGovRegBrowse.setToolTipText("Governance registry");
		

		chkTransformResponses = new Button(this, SWT.CHECK);
		chkTransformResponses.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				false, false, 5, 1));
		chkTransformResponses.setText("Transform Responses");
		chkTransformResponses.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				setModelPropertyValue(
						PsArtifactConstants.WIZARD_OPTION_TEMPL_TRANSFORMER_PS_TRANSFORMRESPONSES,
						((Button) e.widget).getSelection());
				if (((Button) e.widget).getSelection()) {
					showControls(lblResponseXSLT, txtResponseXSLT,
							cmdResXSLTConRegBrowse, cmdResXSLTGovRegBrowse);
				} else {
					hideControls(lblResponseXSLT, txtResponseXSLT,
							cmdResXSLTConRegBrowse, cmdResXSLTGovRegBrowse);
				}
				AdvancedConfigComposite.this.layout();
			}
		});

		lblResponseXSLT = new Label(this, SWT.NONE);
		lblResponseXSLT.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));
		lblResponseXSLT.setText("Response XSLT");
		hideControls(lblResponseXSLT);

		txtResponseXSLT = new Text(this, SWT.BORDER);
		GridData gd_txtResponseXSLT = new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 2, 1);
		gd_txtResponseXSLT.widthHint = 200;
		txtResponseXSLT.setLayoutData(gd_txtResponseXSLT);
		txtResponseXSLT.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent evt) {
				// TODO

			}
		});
		hideControls(txtResponseXSLT);

		cmdResXSLTConRegBrowse = new Button(this, SWT.NONE);
		cmdResXSLTConRegBrowse.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER,
				false, false, 1, 1));
		cmdResXSLTConRegBrowse.setImage(ResourceManager.getPluginImage(SYMBOLIC_NAME, "icons/registry-16x16.png"));
		cmdResXSLTConRegBrowse.setToolTipText("Configuration registry");
		cmdResXSLTConRegBrowse.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent evt) {
				selectRegistryResource(txtResponseXSLT, 2);
			}

			public void widgetDefaultSelected(SelectionEvent evt) {
				widgetSelected(evt);
			}
		});
		hideControls(cmdResXSLTConRegBrowse);

		cmdResXSLTGovRegBrowse = new Button(this, SWT.NONE);
		cmdResXSLTGovRegBrowse.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER,
				false, false, 1, 1));
		cmdResXSLTGovRegBrowse.setImage(ResourceManager.getPluginImage(SYMBOLIC_NAME, "icons/registry_picker.gif"));
		cmdResXSLTGovRegBrowse.setToolTipText("Governance registry");
		cmdResXSLTGovRegBrowse.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent evt) {
				selectRegistryResource(txtResponseXSLT, 3);
			}

			public void widgetDefaultSelected(SelectionEvent evt) {
				widgetSelected(evt);
			}
		});
		hideControls(cmdResXSLTGovRegBrowse);

		/* logging proxy */
		lblReqLogLevel = new Label(this, SWT.NONE);
		lblReqLogLevel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));
		lblReqLogLevel.setText("Request Log Level");
		hideControls(lblReqLogLevel);

		cmbReqLogLevel = new Combo(this, SWT.DROP_DOWN | SWT.READ_ONLY);
		cmbReqLogLevel.setItems(logLevelList);
		cmbReqLogLevel.select(0);
		GridData gd_ReqLogLevel = new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 4, 1);
		gd_ReqLogLevel.widthHint = 100;
		cmbReqLogLevel.setLayoutData(gd_ReqLogLevel);
		cmbReqLogLevel.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent evt) {
				setModelPropertyValue(
						PsArtifactConstants.WIZARD_OPTION_TEMPL_LOGGING_PS_REQLOGLEVEL,
						cmbReqLogLevel.getText());

			}

			public void widgetDefaultSelected(SelectionEvent evt) {
				widgetSelected(evt);
			}
		});
		hideControls(cmbReqLogLevel);

		lblResLogLevel = new Label(this, SWT.NONE);
		lblResLogLevel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));
		lblResLogLevel.setText("Response Log Level");
		hideControls(lblResLogLevel);

		cmbResLogLevel = new Combo(this, SWT.DROP_DOWN | SWT.READ_ONLY);
		cmbResLogLevel.setItems(logLevelList);
		cmbResLogLevel.select(0);
		GridData gd_ResLogLevel = new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 4, 1);
		gd_ResLogLevel.widthHint = 100;
		cmbResLogLevel.setLayoutData(gd_ResLogLevel);
		cmbResLogLevel.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent evt) {
				setModelPropertyValue(
						PsArtifactConstants.WIZARD_OPTION_TEMPL_LOGGING_PS_RESLOGLEVEL,
						cmbResLogLevel.getText());

			}

			public void widgetDefaultSelected(SelectionEvent evt) {
				widgetSelected(evt);

			}
		});
		hideControls(cmbResLogLevel);

		/* WSDL based */

		lblWsdlUri = new Label(this, SWT.NONE);
		lblWsdlUri.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));
		lblWsdlUri.setText("WSDL URI");

		txtWsdlUri = new Text(this, SWT.BORDER);
		GridData gd_txtWsdlUri = new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 3, 1);
		gd_txtWsdlUri.widthHint = 250;
		txtWsdlUri.setLayoutData(gd_txtWsdlUri);
		txtWsdlUri.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent evt) {
				setModelPropertyValue(
						PsArtifactConstants.WIZARD_OPTION_TEMPL_WSDL_PS_WSDLURL,
						txtWsdlUri.getText());

			}
		});

		cmdTestUri = new Button(this, SWT.NONE);
		cmdTestUri.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));
		cmdTestUri.setText("Test URI");
		cmdTestUri.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent evt) {
				MessageBox msgBox = new MessageBox(getShell(),
						SWT.ICON_INFORMATION);
				try {
					URL url = new URL(txtWsdlUri.getText());
					URLConnection conn = url.openConnection();
					conn.connect();
					msgBox.setMessage("Successfully connected to the WSDL URI.");
					msgBox.open();
				} catch (Exception e) {
					msgBox.setMessage("Invalid WSDL URI.");
					msgBox.open();
				}

			}

			public void widgetDefaultSelected(SelectionEvent evt) {
				widgetSelected(evt);
			}
		});

		lblWsdlService = new Label(this, SWT.NONE);
		lblWsdlService.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));
		lblWsdlService.setText("WSDL Service");

		txtWsdlService = new Text(this, SWT.BORDER);
		GridData gd_txtWsdlService = new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 4, 1);
		gd_txtWsdlService.widthHint = 150;
		txtWsdlService.setLayoutData(gd_txtWsdlService);
		txtWsdlService.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent evt) {
				setModelPropertyValue(
						PsArtifactConstants.WIZARD_OPTION_TEMPL_WSDL_PS_WSDLSERVICE,
						txtWsdlService.getText());

			}
		});

		lblWsdlPort = new Label(this, SWT.NONE);
		lblWsdlPort.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));
		lblWsdlPort.setText("WSDL Port");

		txtWsdlPort = new Text(this, SWT.BORDER);
		GridData gd_txtWsdlPort = new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 4, 1);
		gd_txtWsdlPort.widthHint = 150;
		txtWsdlPort.setLayoutData(gd_txtWsdlPort);
		txtWsdlPort.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent evt) {
				setModelPropertyValue(
						PsArtifactConstants.WIZARD_OPTION_TEMPL_WSDL_PS_WSDLPORT,
						txtWsdlPort.getText());

			}
		});

		publishSameServiceContract = new Button(this, SWT.CHECK);
		publishSameServiceContract.setLayoutData(new GridData(SWT.FILL,
				SWT.CENTER, false, false, 5, 1));
		publishSameServiceContract.setText("Publish Same Service Contract");
		publishSameServiceContract
				.addSelectionListener(new SelectionListener() {

					public void widgetSelected(SelectionEvent evt) {
						setModelPropertyValue(
								PsArtifactConstants.WIZARD_OPTION_TEMPL_WSDL_PS_PUBLISHSAME,
								publishSameServiceContract.getSelection());

					}

					public void widgetDefaultSelected(SelectionEvent evt) {
						widgetSelected(evt);
					}
				});

		hideControls(lblWsdlUri, txtWsdlUri, lblWsdlPort, txtWsdlPort,
				lblWsdlService, txtWsdlService, publishSameServiceContract,
				cmdTestUri);

		/* Secure */

		lblSecPolicy = new Label(this, SWT.NONE);
		lblSecPolicy.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));
		lblSecPolicy.setText("Security Policy");
		hideControls(lblSecPolicy);

		txtSecPolicy = new Text(this, SWT.BORDER);
		GridData gd_txtSecPolicy = new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 2, 1);
		gd_txtSecPolicy.widthHint = 200;
		txtSecPolicy.setLayoutData(gd_txtSecPolicy);
		hideControls(txtSecPolicy);
		txtSecPolicy.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent evt) {
				setModelPropertyValue(
						PsArtifactConstants.WIZARD_OPTION_TEMPL_SECURE_PS_SECPOLICY,
						txtSecPolicy.getText());

			}
		});

		cmdSecPolicyConRegBrowse = new Button(this, SWT.NONE);
		cmdSecPolicyConRegBrowse.setLayoutData(new GridData(SWT.CENTER,
				SWT.CENTER, false, false, 1, 1));
		cmdSecPolicyConRegBrowse.setImage(ResourceManager.getPluginImage(SYMBOLIC_NAME, "icons/registry-16x16.png"));
		cmdSecPolicyConRegBrowse.setToolTipText("Configuration registry");
		cmdSecPolicyConRegBrowse.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent evt) {
				selectRegistryResource(txtSecPolicy, 2);
			}

			public void widgetDefaultSelected(SelectionEvent evt) {
				widgetSelected(evt);
			}
		});
		hideControls(cmdSecPolicyConRegBrowse);

		cmdSecPolicyGovRegBrowse = new Button(this, SWT.NONE);
		cmdSecPolicyGovRegBrowse.setLayoutData(new GridData(SWT.LEFT,
				SWT.CENTER, false, false, 1, 1));
		cmdSecPolicyGovRegBrowse.setImage(ResourceManager.getPluginImage(SYMBOLIC_NAME, "icons/registry_picker.gif"));
		cmdSecPolicyGovRegBrowse.setToolTipText("Governance registry");
		cmdSecPolicyGovRegBrowse.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent evt) {
				selectRegistryResource(txtSecPolicy, 3);
			}

			public void widgetDefaultSelected(SelectionEvent evt) {
				widgetSelected(evt);
			}
		});
		hideControls(cmdSecPolicyGovRegBrowse);

	}

	/**
	 * 
	 * @param ctrls
	 */
	void hideControls(Control... ctrls) {
		for (Control ctrl : ctrls) {
			ctrl.setVisible(false);
			if (ctrl.getLayoutData() instanceof GridData) {
				((GridData) ctrl.getLayoutData()).exclude = true;
			}
		}
	}

	/**
	 * 
	 * @param ctrls
	 */
	void showControls(Control... ctrls) {
		for (Control ctrl : ctrls) {
			ctrl.setVisible(true);
			if (ctrl.getLayoutData() instanceof GridData) {
				((GridData) ctrl.getLayoutData()).exclude = false;
			}
		}
	}

	Label createEmptyLabel(Composite parent) {
		Label EmptyLabel = new Label(parent, SWT.NONE);
		EmptyLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));
		return EmptyLabel;
	}

	public void update(Observable o, Object arg) {
		ArtifactTemplate selectedTemplate = AdvancedConfigComposite.this
				.getModel().getSelectedTemplate();

		if("new.proxyservice".equalsIgnoreCase(getModel().getSelectedOption())){
		
		String templateId = selectedTemplate.getId();

		if (templateId.equals(PsArtifactConstants.TRANSFORMER_PROXY_TEMPL_ID)) {
			hideControls(lblReqLogLevel, cmbReqLogLevel, lblResLogLevel,
					cmbResLogLevel); // logging
			showControls(lblTargetEndpoint, optPredefinedEndpoint,
					optfromRegistry, optEnterURL);
			hideControls(lblWsdlUri, txtWsdlUri, lblWsdlPort, txtWsdlPort,
					lblWsdlService, txtWsdlService, publishSameServiceContract,
					cmdTestUri);
			hideControls(lblSecPolicy, txtSecPolicy, cmdSecPolicyConRegBrowse,
					cmdSecPolicyGovRegBrowse);
			optListener.widgetSelected(null);
			showControls(cmdReqXSLTGovRegBrowse, cmdReqXSLTConRegBrowse,
					lblReqXSLT, txtReqXSLT, chkTransformResponses);
		} else if (templateId
				.equals(PsArtifactConstants.LOGGING_PROXY_TEMPL_ID)) {
			hideControls(lblSecPolicy, txtSecPolicy, cmdSecPolicyConRegBrowse,
					cmdSecPolicyGovRegBrowse);
			showControls(lblTargetEndpoint, optPredefinedEndpoint,
					optfromRegistry, optEnterURL);
			hideControls(cmdResXSLTGovRegBrowse, cmdResXSLTConRegBrowse,
					txtResponseXSLT, lblResponseXSLT, cmdReqXSLTGovRegBrowse,
					cmdReqXSLTConRegBrowse, lblReqXSLT, txtReqXSLT,
					chkTransformResponses);
			hideControls(lblWsdlUri, txtWsdlUri, lblWsdlPort, txtWsdlPort,
					lblWsdlService, txtWsdlService, publishSameServiceContract,
					cmdTestUri);
			optListener.widgetSelected(null);
			showControls(lblReqLogLevel, cmbReqLogLevel, lblResLogLevel,
					cmbResLogLevel);
		} else if (templateId
				.equals(PsArtifactConstants.PASS_THROUGH_PROXY_TEMPL_ID)) {
			hideControls(lblSecPolicy, txtSecPolicy, cmdSecPolicyConRegBrowse,
					cmdSecPolicyGovRegBrowse);
			hideControls(lblReqLogLevel, cmbReqLogLevel, lblResLogLevel,
					cmbResLogLevel);
			hideControls(lblWsdlUri, txtWsdlUri, lblWsdlPort, txtWsdlPort,
					lblWsdlService, txtWsdlService, publishSameServiceContract,
					cmdTestUri);
			hideControls(cmdResXSLTGovRegBrowse, cmdResXSLTConRegBrowse,
					txtResponseXSLT, lblResponseXSLT, cmdReqXSLTGovRegBrowse,
					cmdReqXSLTConRegBrowse, lblReqXSLT, txtReqXSLT,
					chkTransformResponses);
			showControls(lblTargetEndpoint, optPredefinedEndpoint,
					optfromRegistry, optEnterURL);
			optListener.widgetSelected(null);
		} else if (templateId
				.equals(PsArtifactConstants.WSDL_BASED_PROXY_TEMPL_ID)) {
			hideControls(lblSecPolicy, txtSecPolicy, cmdSecPolicyConRegBrowse,
					cmdSecPolicyGovRegBrowse);
			hideControls(cmdResXSLTGovRegBrowse, cmdResXSLTConRegBrowse,
					txtResponseXSLT, lblResponseXSLT, cmdReqXSLTGovRegBrowse,
					cmdReqXSLTConRegBrowse, lblReqXSLT, txtReqXSLT,
					chkTransformResponses);
			hideControls(lblTargetEndpoint, txtEndPointUrl, txtEndPointkey,
					lbltxtEndPointUrl, lblEndpoint, cmbPredefinedEP,
					lblEndPointkey, cmdEndPointGovRegBrowse,
					cmdEndPointConRegBrowse, optPredefinedEndpoint,
					optfromRegistry, optEnterURL);
			hideControls(lblReqLogLevel, cmbReqLogLevel, lblResLogLevel,
					cmbResLogLevel);
			showControls(lblWsdlUri, txtWsdlUri, lblWsdlPort, txtWsdlPort,
					lblWsdlService, txtWsdlService, publishSameServiceContract,
					cmdTestUri);
		} else if (templateId.equals(PsArtifactConstants.SECURE_PROXY_TEMPL_ID)) {
			hideControls(lblReqLogLevel, cmbReqLogLevel, lblResLogLevel,
					cmbResLogLevel);
			hideControls(cmdResXSLTGovRegBrowse, cmdResXSLTConRegBrowse,
					txtResponseXSLT, lblResponseXSLT, cmdReqXSLTGovRegBrowse,
					cmdReqXSLTConRegBrowse, lblReqXSLT, txtReqXSLT,
					chkTransformResponses);
			hideControls(lblWsdlUri, txtWsdlUri, lblWsdlPort, txtWsdlPort,
					lblWsdlService, txtWsdlService, publishSameServiceContract,
					cmdTestUri);
			showControls(lblTargetEndpoint, optPredefinedEndpoint,
					optfromRegistry, optEnterURL);
			showControls(lblSecPolicy, txtSecPolicy, cmdSecPolicyConRegBrowse,
					cmdSecPolicyGovRegBrowse);
			optListener.widgetSelected(null);
		} else if (templateId.equals(PsArtifactConstants.CUSTOM_PROXY_TEMPL_ID)) {
			hideControls(lblSecPolicy, txtSecPolicy, cmdSecPolicyConRegBrowse,
					cmdSecPolicyGovRegBrowse);
			hideControls(lblReqLogLevel, cmbReqLogLevel, lblResLogLevel,
					cmbResLogLevel);
			hideControls(cmdResXSLTGovRegBrowse, cmdResXSLTConRegBrowse,
					txtResponseXSLT, lblResponseXSLT, cmdReqXSLTGovRegBrowse,
					cmdReqXSLTConRegBrowse, lblReqXSLT, txtReqXSLT,
					chkTransformResponses);
			hideControls(lblWsdlUri, txtWsdlUri, lblWsdlPort, txtWsdlPort,
					lblWsdlService, txtWsdlService, publishSameServiceContract,
					cmdTestUri);
			hideControls(lblTargetEndpoint, txtEndPointUrl, txtEndPointkey,
					lbltxtEndPointUrl, lblEndpoint, cmbPredefinedEP,
					lblEndPointkey, cmdEndPointGovRegBrowse,
					cmdEndPointConRegBrowse, optPredefinedEndpoint,
					optfromRegistry, optEnterURL);
		}
		AdvancedConfigComposite.this.layout();
		}
	}

	/**
	 * Select registry resource path form configuration registry or governance
	 * registry
	 * 
	 * @param textBox
	 * @param defaultPathId
	 *            Conf.Reg=2 and Gov.Reg=3
	 */
	private void selectRegistryResource(Text textBox, int defaultPathId) {
		RegistryResourceNode selectedRegistryResourceNode = null;
		RegistryTreeBrowserDialog r = new RegistryTreeBrowserDialog(getShell(),
				RegistryTreeBrowserDialog.SELECT_REGISTRY_RESOURCE,
				defaultPathId);
		r.create();
		List<RegistryURLInfo> allRegistryUrls = RegistryUrlStore.getInstance()
				.getAllRegistryUrls();
		for (RegistryURLInfo registryURLInfo : allRegistryUrls) {
			r.addRegistryNode(registryURLInfo, null);
		}
		if (r.open() == Window.OK) {
			selectedRegistryResourceNode = r
					.getSelectedRegistryResourceNodeResource();
			String ResourcePath = selectedRegistryResourceNode
					.getRegistryResourcePath();
			if (ResourcePath.startsWith("/_system/config")) {
				textBox.setText(ResourcePath.replaceFirst("/_system/config",
						"conf:"));
			} else if (ResourcePath.startsWith("/_system/governance")) {
				textBox.setText(ResourcePath.replaceFirst(
						"/_system/governance", "gov:"));
			} else {
				MessageBox msgBox = new MessageBox(getShell(),
						SWT.ICON_INFORMATION);
				msgBox.setMessage("invalid selection.");
				msgBox.open();
			}
		}
	}

	public void setModel(ProxyServiceModel model) {
		this.model = model;
	}

	public ProxyServiceModel getModel() {
		return model;
	}

	public List<String> getCustomFields() {
		List<String> customFields = new ArrayList<String>();
		customFields.add("templ.common.ps.epurl");
		customFields.add("templ.common.ps.epkey");
		customFields.add("templ.secure.ps.secpolicy");
		customFields.add("templ.wsdl.ps.wsdlurl");
		customFields.add("templ.wsdl.ps.wsdlservice");
		customFields.add("templ.wsdl.ps.wsdlport");
		customFields.add("templ.wsdl.ps.publishsame");
		customFields.add("templ.logging.ps.reqloglevel");
		customFields.add("templ.logging.ps.resloglevel");
		customFields.add("templ.transformer.ps.xslt");
		customFields.add("templ.common.ps.eplist");
		return customFields;
	}

}
