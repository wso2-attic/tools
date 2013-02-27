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

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jst.servlet.ui.project.facet.WebProjectWizard;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetProjectCreationDataModelProperties;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.project.facet.core.IFacetedProject;
import org.eclipse.wst.common.project.facet.core.events.IFacetedProjectEvent;
import org.eclipse.wst.common.project.facet.core.events.IFacetedProjectListener;
import org.wso2.developerstudio.eclipse.artifact.webapp.Activator;
import org.wso2.developerstudio.eclipse.artifact.webapp.model.WebAppModel;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.core.exception.ObserverFailedException;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.pages.MavenDetailsPage;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;
import org.wso2.developerstudio.eclipse.utils.wst.WebUtils;


public class DynamicWebAppCreationWizard extends WebProjectWizard {

	private IWizardPage[] endingPages;
	private IWizardPage[] beginPages;
	private IWizardPage[] importPages;
	private WebAppCreationWizard webApp;
	MavenDetailsPage endPage;
	WebAppFirstPage firstPage;
	WebAppImportPage importPage;
	WebAppModel appModel;
	IWizardPage newWebAppPage;
	IWizardPage webModulePage;
	boolean canfinish;
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	 
	public DynamicWebAppCreationWizard() {
		 setWindowTitle("Web Application project");
		 webApp = new WebAppCreationWizard();
		 endingPages = new IWizardPage[1];
		 beginPages = new IWizardPage[1];
		 importPages = new IWizardPage[1];
		 appModel =(WebAppModel)webApp.getModel();
		 firstPage = new WebAppFirstPage("First page of webApp", appModel,this);
		 endPage = new MavenDetailsPage(webApp.getModel());
		 importPage = new WebAppImportPage(appModel); 
	}  
 
	@Override
	public void addPages() {
		beginPages[0]=firstPage;
		addPage(beginPages[0]);
		super.addPages();
		if (appModel!=null && !appModel.isNewWebApp()) {
			importPages[0]=importPage;
			addPage(importPages[0]);  
		} 
		endingPages[0]=endPage;
		addPage(endingPages[0]);
		getFacetedProjectWorkingCopy().addListener
        (
            new IFacetedProjectListener()
            {
                public void handleEvent( final IFacetedProjectEvent event )
                {
                    facetSelectionChangedEvent();
                }
            },
            IFacetedProjectEvent.Type.PROJECT_FACETS_CHANGED
        );
	}
	
	@Override
	public IWizardPage[] getPages() {
		final IWizardPage[] base = super.getPages();
		if (base.length > 1) {
			final IWizardPage[] fpages = new IWizardPage[1];
			fpages[0] = beginPages[0];
			for (IWizardPage iWizardPage : base) {
					if ("web.facet.install.page".equals(iWizardPage.getName())) {
						webModulePage = iWizardPage;
					} else if ("first.page".equals(iWizardPage.getName())&&newWebAppPage==null) {
						newWebAppPage = iWizardPage;
						newWebAppPage.setTitle("Create New Web Application");
						newWebAppPage.setDescription("Give a project name for the new web app");
					}
				}
			if (appModel != null) {
				IWizardPage[] pages=null;
				if (appModel.isNewWebApp()) {
					pages = new IWizardPage[4];
					pages[0] = fpages[0];
					pages[1] = newWebAppPage;
					pages[2] = webModulePage;
					pages[3] = endingPages[0];
				} else {
					pages = new IWizardPage[3];
					pages[0] = fpages[0];
					pages[1] = importPage;
					pages[2] = endingPages[0];
				} 
				final IWizardPage[] finalPages = new IWizardPage[pages.length];
				System.arraycopy(pages, 0, finalPages, 0,pages.length);
				return finalPages;
			}  	
			return fpages;		 
		} else {
			return base;
		}
	}
		 
	 @Override
	public boolean canFinish() {
		 IWizardPage currentPage = getContainer().getCurrentPage();
		 if("Maven Information".equals(currentPage.getTitle())){
			 IDataModel dataModel = getDataModel();
			try {
				if(appModel.isNewWebApp()){
				Object property = dataModel.getProperty(IFacetProjectCreationDataModelProperties.FACET_PROJECT_NAME);
				webApp.getModel().setProjectName(property.toString());
				}else{
					dataModel.setProperty(IFacetProjectCreationDataModelProperties.FACET_PROJECT_NAME, appModel.getWarName());
					webApp.getModel().setProjectName(appModel.getWarName());
				}
			} catch (ObserverFailedException e) { 
				log.error(e.getMessage(), e);
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
			if(!appModel.isNewWebApp()){
				File importFile = appModel.getImportFile();
				String[] folderList = new String[] {"WebContent"};
				IFolder webappFolder = ProjectUtils.getWorkspaceFolder(project, folderList);
				WebUtils.extractWAR(webappFolder, importFile);
			} 
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