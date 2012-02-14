/**
 * 
 */
package org.wso2.carbonstudio.eclipse.platform.ui.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author saminda
 *
 */
public interface IWSO2ArtifactWizardExtension {
	public void preFinish(IProgressMonitor monitor);
	public void postFinish(IProject project, IProgressMonitor monitor);
}
