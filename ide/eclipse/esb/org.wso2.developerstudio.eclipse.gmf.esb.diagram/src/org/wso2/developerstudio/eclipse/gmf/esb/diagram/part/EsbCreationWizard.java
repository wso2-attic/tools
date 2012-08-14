package org.wso2.developerstudio.eclipse.gmf.esb.diagram.part;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBArtifact;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBProjectArtifact;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;

/**
 * @generated
 */
public class EsbCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected EsbCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected EsbCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	private IProject esbProject;

	private ESBProjectArtifact esbProjectArtifact;

	private URI fileCreationLocationDiagram;

	private URI fileCreationLocationDomain;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Messages.EsbCreationWizardTitle);
		setDefaultPageImageDescriptor(EsbDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewEsbWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new EsbCreationWizardPage(
				"DiagramModelFile", getSelection(), "esb_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage.setTitle(Messages.EsbCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(Messages.EsbCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new EsbCreationWizardPage("DomainModelFile", getSelection(), "esb") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".esb_diagram".length()); //$NON-NLS-1$
					setFileName(EsbDiagramEditorUtil.getUniqueFileName(getContainerFullPath(),
							fileName, "esb")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage.setTitle(Messages.EsbCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(Messages.EsbCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated NOT
	 */
	public boolean performFinish() {
		try {
			if (((TreeSelection) getSelection()).toArray()[0] instanceof Folder) {
				esbProject = ((Folder) ((TreeSelection) getSelection()).toArray()[0]).getProject();
			}
			if (((TreeSelection) getSelection()).toArray()[0] instanceof Project) {
				esbProject = (Project) ((TreeSelection) getSelection()).toArray()[0];
			}
			esbProjectArtifact = new ESBProjectArtifact();
			esbProjectArtifact.fromFile(esbProject.getFile("artifact.xml").getLocation().toFile());

			IContainer location = esbProject.getFolder("src" + File.separator + "main"
					+ File.separator + "synapse-config");

			fileCreationLocationDiagram = URI.createPlatformResourceURI(location.getFullPath()
					.toString() + "/" + diagramModelFilePage.getFileName(), false);
			fileCreationLocationDomain = URI.createPlatformResourceURI(location.getFullPath()
					.toString() + "/" + domainModelFilePage.getFileName(), false);

			String relativePathDiagram = FileUtils.getRelativePath(esbProject.getLocation()
					.toFile(),
					new File(location.getLocation().toFile(), diagramModelFilePage.getFileName()));
			esbProjectArtifact.addESBArtifact(createArtifact(diagramModelFilePage.getFileName()
					.split(".esb_diagram")[0], "test", "1.0.0", relativePathDiagram));

			esbProjectArtifact.toFile();
			esbProject.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException e) {
			System.out.println("Error ESBCreationWizard");
		} catch (Exception e) {
			System.out.println("Error ESBCreationWizard");
		}

		//IProject currentProject = ResourcesPlugin.getWorkspace().
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException,
					InterruptedException {
				/*diagram = EsbDiagramEditorUtil.createDiagram(
						diagramModelFilePage.getURI(),
						domainModelFilePage.getURI(), monitor);  */
				diagram = EsbDiagramEditorUtil.createDiagram(fileCreationLocationDiagram,
						fileCreationLocationDomain, monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						EsbDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								Messages.EsbCreationWizardOpenEditorError, null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						Messages.EsbCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				EsbDiagramEditorPlugin.getInstance().logError(
						"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}

	private ESBArtifact createArtifact(String name, String groupId, String version, String path) {
		ESBArtifact artifact = new ESBArtifact();
		artifact.setName(name);
		artifact.setVersion(version);
		artifact.setType("synapse/graphical-configuration");
		artifact.setServerRole("EnterpriseServiceBus");
		artifact.setGroupId(groupId);
		artifact.setFile(path);
		return artifact;
	}
}
