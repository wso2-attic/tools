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

package org.wso2.developerstudio.eclipse.distribution.project.ui.wizard;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.maven.model.Dependency;
import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.wso2.developerstudio.eclipse.distribution.project.model.DependencyData;
import org.wso2.developerstudio.eclipse.distribution.project.util.DistProjectUtils;
import org.wso2.developerstudio.eclipse.distribution.project.validator.ProjectList;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractListDataProvider.ListData;
import org.wso2.developerstudio.eclipse.platform.core.project.export.util.ExportUtil;
import org.wso2.developerstudio.eclipse.platform.core.utils.Constants;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;

public class DistributionProjectExportWizard extends Wizard implements IExportWizard {
	DistributionProjectExportWizardPage mainPage;
	CarExportDetailsWizardPage detailsPage; 
	private IFile pomFileRes;
	private File pomFile; 
	private IProject selectedProject;
	private MavenProject parentPrj;	
	
	@SuppressWarnings("unchecked")
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		try {
			detailsPage = new CarExportDetailsWizardPage();
			selectedProject = getSelectedProject(selection);
			pomFileRes = selectedProject.getFile("pom.xml");
			pomFile = pomFileRes.getLocation().toFile();
			
			if(!selectedProject.hasNature(Constants.DISTRIBUTION_PROJECT_NATURE)){
				throw new Exception();
			}
			
			ProjectList projectListProvider = new ProjectList();
			List<ListData> projectListData = projectListProvider.getListData(null, null);
			HashMap<String,DependencyData> projectList= new HashMap<String, DependencyData>();
			HashMap<String,Dependency> dependencyMap = new HashMap<String, Dependency>();
			for (ListData data : projectListData) {
				DependencyData dependencyData = (DependencyData)data.getData();
				projectList.put(DistProjectUtils.getArtifactInfoAsString(dependencyData.getDependency()), dependencyData);
			}
			
			parentPrj = MavenUtils.getMavenProject(pomFile);
			
			for(Dependency dependency : (List<Dependency>)parentPrj.getDependencies()){
				dependencyMap.put(DistProjectUtils.getArtifactInfoAsString(dependency), dependency);
			}
			mainPage = new DistributionProjectExportWizardPage();
			mainPage.setProjectList(projectList);
			mainPage.setDependencyList(dependencyMap);
			mainPage.setMissingDependencyList((HashMap<String,Dependency>)mainPage.getDependencyList().clone());
			detailsPage.setName(parentPrj.getModel().getArtifactId());
			detailsPage.setVersion(parentPrj.getModel().getVersion());
		} catch (Exception e) {
			Display display= PlatformUI.createDisplay();
			Shell shell = display.getActiveShell();
			openMessageBox(shell,"WSO2 Platform Distribution",
			               "Please select a valid carbon application project",
			               SWT.ICON_INFORMATION);
		}
		
	}

	public void savePOM() throws Exception{
		parentPrj.setDependencies(new ArrayList<Dependency>(mainPage.getDependencyList().values()));
		MavenUtils.saveMavenProject(parentPrj, pomFile);
		pomFileRes.getProject().refreshLocal(IResource.DEPTH_INFINITE,new NullProgressMonitor());
		
	}
	
	public static IProject getSelectedProject(Object obj) throws Exception {
        if (obj == null) {
            return null;
        }
        if (obj instanceof IResource) {
            return ((IResource) obj).getProject();
        } else if (obj instanceof IStructuredSelection) {
            return getSelectedProject(((IStructuredSelection) obj).getFirstElement());
        }
        return null;
    }

	public void addPages() {
		addPage(detailsPage);
		addPage(mainPage);
		super.addPages();
	}
	
	public boolean performFinish() {
		String finalFileName = String.format("%s_%s.car", detailsPage.getName().replaceAll(
				".car$", ""), detailsPage.getVersion()); 
		try {
			File destFileName = new File(detailsPage.getExportPath(), finalFileName) ;
			if(destFileName.exists()){
				int response = openMessageBox(getShell(),"WSO2 Platform Distribution",
				                              "there is already a file with same name (" +
				                                      finalFileName + ") in target location\n\n" +
				                                      "Would you like to replace the existing file?",
				                                      SWT.ICON_QUESTION | SWT.YES | SWT.NO );
				if (response == SWT.NO) 
					return false;
			      
			}
			savePOM();
			IResource carbonArchive = ExportUtil.BuildCAppProject(selectedProject);
			FileUtils.copy(carbonArchive.getLocation().toFile(), destFileName);
				 
		} catch (Exception e) {
			openMessageBox(getShell(),"WSO2 Platform Distribution",
			               "Error occurred while exporting the archive :\n" + e.getMessage(),
			               SWT.ICON_ERROR);
		}
		
		return true;
	}
	
	protected int openMessageBox(Shell shell,String title,String message,int style){
		MessageBox exportMsg = new MessageBox(shell,style);
		exportMsg.setText(title);
		exportMsg.setMessage(message);
		return exportMsg.open();
	}

}
