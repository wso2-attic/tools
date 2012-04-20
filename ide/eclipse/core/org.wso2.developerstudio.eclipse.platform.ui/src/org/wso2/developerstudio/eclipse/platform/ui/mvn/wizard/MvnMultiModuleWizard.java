package org.wso2.developerstudio.eclipse.platform.ui.mvn.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

import org.wso2.developerstudio.eclipse.platform.core.exception.ObserverFailedException;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;

public class MvnMultiModuleWizard extends AbstractWSO2ProjectCreationWizard  {

	private MvnMultiModuleModel moduleModel;
	private IProject project;
	
	
	public MvnMultiModuleWizard(){
		 moduleModel = new MvnMultiModuleModel();
		 setModel(moduleModel);
	     setWindowTitle("Maven Modules Creation Wizard");
	   //  setDefaultPageImageDescriptor(MediatorImageUtils.getInstance().getImageDescriptor("new-mediator-wizard.png"));

	}
	

	public boolean performFinish() {
//        try {
////			project = createNewProject();
//			
//			//Add Logic here 
//			
//			
//		} catch (CoreException e) {
//		 
//		}
		return true;
	}


	@Override
	public IResource getCreatedResource() {
		return project;
	}
}
