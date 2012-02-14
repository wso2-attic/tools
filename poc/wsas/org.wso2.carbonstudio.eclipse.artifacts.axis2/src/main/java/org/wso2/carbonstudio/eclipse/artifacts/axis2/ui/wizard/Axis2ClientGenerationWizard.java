package org.wso2.carbonstudio.eclipse.artifacts.axis2.ui.wizard;

import org.apache.axis2.wsdl.WSDL2Java;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.wso2.carbonstudio.eclipse.libraries.utils.LibraryUtils;
import org.wso2.carbonstudio.eclipse.utils.jdt.JavaUtils;

/**
 * @author dakshitha
 *
 */
public class Axis2ClientGenerationWizard extends Wizard implements INewWizard {

	private IStructuredSelection selection;
	private Axis2SelectWSDLPage wsdlPage;
	private Axis2GenerateClientOptionPage clientOptionPage;
	private Axis2ClientConfigurationPage clientConfigurationPage;
	private DataModel model;

	@Override
	public boolean performFinish() {
		String[] parameterArray = Axis2ParametersUtils
				.getParameterArray(Axis2ParametersUtils.getParameterList(model));
		try {
			WSDL2Java.main(parameterArray);
			JavaUtils.addJarLibraryToProject(model.getSelectedProject(), LibraryUtils.getDependencyPath("axis2-1.6.0.wso2v1.jar"));
			JavaUtils.addJarLibraryToProject(model.getSelectedProject(), LibraryUtils.getDependencyPath("axiom-1.2.9.wso2v1.jar"));
			model.getSelectedProject().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean canFinish() {
		if (clientConfigurationPage.isDataPopulated()) {
			return true;
		}
		return false;

	}

	@Override
	public boolean needsPreviousAndNextButtons() {
		// TODO Auto-generated method stub
		return super.needsPreviousAndNextButtons();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		model = new DataModel();
	}

	@Override
	public void addPages() {
		wsdlPage = new Axis2SelectWSDLPage("Select WSDL", model);
		addPage(wsdlPage);
		clientOptionPage = new Axis2GenerateClientOptionPage(
				"Web Service Client", selection, model);
		addPage(clientOptionPage);
		// model.addDataEventListener(clientOptionPage);
		model.addObserver(clientOptionPage);
		clientConfigurationPage = new Axis2ClientConfigurationPage(
				"Client Configuration", model);
		addPage(clientConfigurationPage);
		// model.addObserver(clientConfigurationPage);
	}

	public Axis2SelectWSDLPage getWsdlPage() {
		return wsdlPage;
	}

	public Axis2GenerateClientOptionPage getClientOptionPage() {
		return clientOptionPage;
	}

	public Axis2ClientConfigurationPage getClientConfigurationPage() {
		return clientConfigurationPage;
	}
}
