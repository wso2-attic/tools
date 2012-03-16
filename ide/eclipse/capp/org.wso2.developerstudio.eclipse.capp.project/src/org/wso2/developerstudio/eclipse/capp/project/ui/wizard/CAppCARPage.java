/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.capp.project.ui.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class CAppCARPage extends WizardPage {
	private Text txtCARId;
	private Text txtCARTitle;
	private Text txtCARVersion;
	WizardNewProjectCreationPage projectCreationPage;
	boolean firstTimeFocusGained=true;
	private String carId;
	private String carTitle;
	private String carVersion;
	private String carProvider;
	
	private Text txtCARProvider;
	
	/**
     * @return the carId
     */
    public String getCarId() {
    	return carId;
    }

	/**
     * @param carId the carId to set
     */
    public void setCarId(String carId) {
    	this.carId = carId;
    }

	/**
     * @return the carTitle
     */
    public String getCarTitle() {
    	return carTitle;
    }

	/**
     * @param carTitle the carTitle to set
     */
    public void setCarTitle(String carTitle) {
    	this.carTitle = carTitle;
    }

	/**
     * @return the carVersion
     */
    public String getCarVersion() {
    	return carVersion;
    }

	/**
     * @param carVersion the carVersion to set
     */
    public void setCarVersion(String carVersion) {
    	this.carVersion = carVersion;
    }

	protected CAppCARPage(String pageName, WizardNewProjectCreationPage prjCreationPage) {
	    super(pageName);
	    this.projectCreationPage=prjCreationPage;
	    setDescription("Specify Carbon Archive details");
    }

	public void createControl(Composite parent) {
		Composite carMetaInfoGroup= new Composite(parent, SWT.NONE);
		carMetaInfoGroup.setLayout(new GridLayout(2, false));
		
		Label lblId = new Label(carMetaInfoGroup, SWT.NONE);
        lblId.setText("Id");
        lblId.setFont(parent.getFont());

        txtCARId = new Text(carMetaInfoGroup, SWT.BORDER);
        GridData data = new GridData(GridData.FILL_HORIZONTAL);
        txtCARId.setLayoutData(data);
        txtCARId.setFont(parent.getFont());

        Label lblTitle = new Label(carMetaInfoGroup, SWT.NONE);
        lblTitle.setText("Title");
        lblTitle.setFont(parent.getFont());

        txtCARTitle = new Text(carMetaInfoGroup, SWT.BORDER);
        data = new GridData(GridData.FILL_HORIZONTAL);
        txtCARTitle.setLayoutData(data);
        txtCARTitle.setFont(parent.getFont());
        
        Label lblVersion = new Label(carMetaInfoGroup, SWT.NONE);
        lblVersion.setText("Version");
        lblVersion.setFont(parent.getFont());

        txtCARVersion = new Text(carMetaInfoGroup, SWT.BORDER);
        data = new GridData(GridData.FILL_HORIZONTAL);
        txtCARVersion.setLayoutData(data);
        txtCARVersion.setFont(parent.getFont());

        Label lblProvider = new Label(carMetaInfoGroup, SWT.NONE);
        lblProvider.setText("Provider");
		
		txtCARProvider = new Text(carMetaInfoGroup, SWT.BORDER);
        data = new GridData(GridData.FILL_HORIZONTAL);
        txtCARProvider.setLayoutData(data);
		
        
        txtCARId.addModifyListener(new ModifyListener(){
            public void modifyText(ModifyEvent arg0) {
            	updateValuesId();
            }});
        txtCARTitle.addModifyListener(new ModifyListener(){
            public void modifyText(ModifyEvent arg0) {
            	updateValuesTitle();
            }});
        txtCARVersion.addModifyListener(new ModifyListener(){
            public void modifyText(ModifyEvent arg0) {
            	updateValuesVersion();
            }});        

		txtCARProvider.addModifyListener(new ModifyListener(){
            public void modifyText(ModifyEvent arg0) {
            	updateCARProvider();
            }
        });
		setControl(carMetaInfoGroup);
//		setPageComplete(true);
	}

	public void initValues() {
        if (firstTimeFocusGained){
        	firstTimeFocusGained=false;
            setCarId(projectCreationPage.getProjectName());
            String[] split = projectCreationPage.getProjectName().split(".");
            String name=split.length==0? projectCreationPage.getProjectName():split[split.length-1];
            setCarTitle(name+" Archive");
            setCarVersion("1.0.0.vtimestamp");
            updateControlValues();
        }
    }
	
	public void setVisible(boolean visible) {
		if (visible){
			initValues();
		}
		super.setVisible(visible);
	}

	
	private void updateControlValues(){
		txtCARId.setText(getCarId());
		txtCARTitle.setText(getCarTitle());
		txtCARVersion.setText(getCarVersion());
	}
	
	private void updateValuesId() {
		setCarId(txtCARId.getText());
		
		validate();
    }

	private void updateValuesTitle() {
		setCarTitle(txtCARTitle.getText());
		
		validate();
    }
	
	private void updateValuesVersion() {
		setCarVersion(txtCARVersion.getText());
		
		validate();
    }
	
	private void updateCARProvider() {
		setCarProvider(txtCARProvider.getText());
		validate();
    }
	
	private void validate() {
		if (getCarId().equals("")){
			setErrorMessage("The id cannot be empty");
			setPageComplete(false);
			return;
		}
		if (getCarTitle().equals("")){
			setErrorMessage("The title cannot be empty");
			setPageComplete(false);
			return;
		}
		if (getCarVersion().equals("")){
			setErrorMessage("The version cannot be empty");
			setPageComplete(false);
			return;
		}
		if (getCarProvider().equals("")){
			setErrorMessage("The provider cannot be empty");
			setPageComplete(false);
			return;
		}
		setErrorMessage(null);
		setPageComplete(true);
	}

	public void setCarProvider(String carProvider) {
	    this.carProvider = carProvider;
    }

	public String getCarProvider() {
	    return carProvider;
    }
}
