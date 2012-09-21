package org.wso2.developerstudio.eclipse.gmf.esb.diagram.part;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBArtifact;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBProjectArtifact;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;
import static org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.EditorUtils.DIAGRAM_FILE_EXTENSION;
import static org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.EditorUtils.DOMAIN_FILE_EXTENSION;

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
	 * @generated NOT
	 */
	/*protected EsbCreationWizardPage domainModelFilePage;*/

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
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
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
	 * @generated NOT
	 */
	public void addPages() {
		diagramModelFilePage = new EsbCreationWizardPage(
				"DiagramModelFile", getSelection(), null); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(Messages.EsbCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(Messages.EsbCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);
		/* removed domainModelFilePage */
	/*	domainModelFilePage = new EsbCreationWizardPage(
				"DomainModelFile", getSelection(), "esb") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".esb_diagram".length()); //$NON-NLS-1$
					setFileName(EsbDiagramEditorUtil.getUniqueFileName(
							getContainerFullPath(), fileName, "esb")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(Messages.EsbCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(Messages.EsbCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);*/
	}

	/**
	 * @generated NOT
	 */
	public boolean performFinish() {
		try {

			IPath containerFullPath = diagramModelFilePage.getContainerFullPath();
			
			esbProject = ResourcesPlugin.getWorkspace().getRoot().getProject(containerFullPath.segment(0));
			
			esbProjectArtifact = new ESBProjectArtifact();
			esbProjectArtifact.fromFile(esbProject.getFile("artifact.xml")
					.getLocation().toFile());

			IContainer location = esbProject.getFolder("src/main/synapse-config");

			fileCreationLocationDiagram = URI.createPlatformResourceURI(
					location.getFullPath().toString() + "/"
							+ diagramModelFilePage.getFileName() + DIAGRAM_FILE_EXTENSION, false);
			fileCreationLocationDomain = URI.createPlatformResourceURI(
					location.getFullPath().toString() + "/"
							+ diagramModelFilePage.getFileName() + DOMAIN_FILE_EXTENSION, false);

			String relativePathDiagram = FileUtils.getRelativePath(esbProject
					.getLocation().toFile(), new File(location.getLocation()
					.toFile(), diagramModelFilePage.getFileName()+ DIAGRAM_FILE_EXTENSION));
			esbProjectArtifact
					.addESBArtifact(createArtifact(diagramModelFilePage
							.getFileName(), "test",
							"1.0.0", relativePathDiagram));

			esbProjectArtifact.toFile();
			esbProject.refreshLocal(IResource.DEPTH_INFINITE,
					new NullProgressMonitor());
			
			//IProject currentProject = ResourcesPlugin.getWorkspace().
			IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

				protected void execute(IProgressMonitor monitor)
						throws CoreException, InterruptedException {
					/*diagram = EsbDiagramEditorUtil.createDiagram(
							diagramModelFilePage.getURI(),
							domainModelFilePage.getURI(), monitor);  */
					diagram = EsbDiagramEditorUtil.createDiagram(
							fileCreationLocationDiagram,
							fileCreationLocationDomain, monitor);
					if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
						try {
							EsbDiagramEditorUtil.openDiagram(diagram);
						} catch (PartInitException e) {
							ErrorDialog.openError(getContainer().getShell(),
									Messages.EsbCreationWizardOpenEditorError,
									null, e.getStatus());
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
			
		} catch (Exception e) {
			ErrorDialog.openError(getContainer().getShell(), "Error creating diagram",
					"An unexpected error has occurred while creating diagram",
					Status.CANCEL_STATUS);
			// TODO: log error
		}
		return true;
	}

	private ESBArtifact createArtifact(String name, String groupId,
			String version, String path) {
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
