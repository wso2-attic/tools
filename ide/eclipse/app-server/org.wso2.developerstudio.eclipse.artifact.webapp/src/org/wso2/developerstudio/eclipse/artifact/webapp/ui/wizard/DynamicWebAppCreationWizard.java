/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.eclipse.artifact.webapp.ui.wizard;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jst.servlet.ui.project.facet.WebProjectWizard;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetProjectCreationDataModelProperties;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.project.facet.core.IFacetedProject;
import org.wso2.developerstudio.eclipse.artifact.webapp.Activator;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.core.exception.ObserverFailedException;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.pages.MavenDetailsPage;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;


public class DynamicWebAppCreationWizard extends WebProjectWizard {

	private IWizardPage[] endingPages;
	private WebAppCreationWizard webApp;
	MavenDetailsPage endPage;
	boolean canfinish;
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	 
	public DynamicWebAppCreationWizard() {
		 setWindowTitle("Web Application project");
 
		 webApp = new WebAppCreationWizard();
		 endingPages = new IWizardPage[1];
		 endPage = new MavenDetailsPage(webApp.getModel());
	}  
 
	@Override
	public void addPages() {
		super.addPages();
		endingPages[0]=endPage;
		addPage(endingPages[0]);
	}
	
	
	 @Override
	public IWizardPage[] getPages() {
			 final IWizardPage[] base = super.getPages();
			 if(base.length>1){
				 int lenth = base.length-1;//since removing a page;
			 final IWizardPage[] pages = new IWizardPage[lenth+endingPages.length];
                   int i=0,j=0;
				while (i < base.length) {
					if(!"java.facet.install.page".equals(base[i].getName())){
						pages[j] = base[i];
						pages[j].setTitle("Create New Web Application");
						pages[j].setDescription("Give a project name for the new Web application");
						j++;
					}
					i++;
				}
				System.arraycopy(endingPages, 0, pages, j, endingPages.length); 		
			return pages;}	 
		else{
				
				return base;
			}
	}
		 
	 @Override
	public boolean canFinish() {
		 IWizardPage currentPage = getContainer().getCurrentPage();
		 if("Maven Information".equals(currentPage.getTitle())){
			 IDataModel dataModel = getDataModel();
			try {
				Object property = dataModel.getProperty(IFacetProjectCreationDataModelProperties.FACET_PROJECT_NAME);
				webApp.getModel().setProjectName(property.toString());
			} catch (ObserverFailedException e) {
				e.printStackTrace();
			}
			 return super.canFinish(); 
		 }
		return false;
	}
	
	public boolean performFinish() {
		boolean val = super.performFinish();
		 IFacetedProject facetedProject = getFacetedProject();	 
		try {
			IProject project = facetedProject.getProject();
			File pomfile = project.getFile("pom.xml").getLocation().toFile();
			webApp.getModel().getMavenInfo().setPackageName("war");
			webApp.createPOM(pomfile);
			ProjectUtils.addNatureToProject(project,false,
			"org.wso2.developerstudio.eclipse.webapp.project.nature");
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (JavaModelException e) {
			log.error(e.getMessage(), e);
		} catch(Exception e){
			log.error(e.getMessage(), e);
		}
		 return val;
	} 
}