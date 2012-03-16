package org.wso2.developerstudio.eclipse.carbonserver.remote.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.wst.server.core.IRuntimeWorkingCopy;
import org.eclipse.wst.server.core.TaskModel;
import org.eclipse.wst.server.ui.wizard.IWizardHandle;
import org.eclipse.wst.server.ui.wizard.WizardFragment;

public class RemoteServerWizardFragment extends WizardFragment {
	
	private RemoteWizardFragmentCompositie comp;

	/**
	 * Create a new fragment.
	 */
	public RemoteServerWizardFragment() {
		// do nothing
	}

	/**
	 * @see WizardFragment#hasComposite()
	 */
	public boolean hasComposite() {
		return true;
	}

	/**
	 * @see WizardFragment#createComposite(Composite, IWizardHandle)
	 */
	public Composite createComposite(Composite parent, IWizardHandle wizard) {
		comp = new RemoteWizardFragmentCompositie(parent, SWT.FILL,wizard);
		wizard.setDescription("Carbon remote server details");
		wizard.setTitle("Remote Carbon Server");
		return comp;
	}

	/**
	 * @see WizardFragment#isComplete()
	 */
	public boolean isComplete() {
		return comp.isContentValid();
	}

	/**
	 * @see WizardFragment#enter()
	 */
	public void enter() {
		if (comp != null) {
			comp.setRuntime(getTaskModel().getObject(TaskModel.TASK_SERVER));
		}
	}
}
