package org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.Tool;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.internal.services.palette.PaletteToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbDiagram;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.NamedEndpoint;
import org.wso2.developerstudio.eclipse.gmf.esb.SendMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequence;
import org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractEndpoint;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.EsbGraphicalShape;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.FixedBorderItemLocator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.OpenSeparatelyEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.ToolPalleteDetails;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceEditPart.NodeToolEntry;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.NamedEndpointCanonicalEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.NamedEndpointItemSemanticEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbDiagramEditorUtil;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.Messages;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

import static org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.EditorUtils.*;

/**
 * @generated NOT
 */
public class NamedEndpointEditPart extends AbstractEndpoint {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3660;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;
	
	public static ArrayList<String> definedEndpointsNames = new ArrayList<String>();
	
	private static IDeveloperStudioLog log = Logger
	.getLog("org.wso2.developerstudio.eclipse.gmf.esb.diagram");

	/**
	 * @generated
	 */
	public NamedEndpointEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new NamedEndpointItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new NamedEndpointCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// For handle Double click Event.
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenSeparatelyEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (EsbVisualIDRegistry.getVisualID(childView)) {
				case NamedEndpointInputConnectorEditPart.VISUAL_ID:
				case NamedEndpointOutputConnectorEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated NOT
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new NamedEndpointFigure(){
			public void setBounds(org.eclipse.draw2d.geometry.Rectangle rect) {
				super.setBounds(rect);
				if (!connected) {
					getMostSuitableElementToConnect();
					connected = true;
				}
			};
		};
	}

	/**
	 * @generated
	 */
	public NamedEndpointFigure getPrimaryShape() {
		return (NamedEndpointFigure) primaryShape;
	}
	
	
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof NamedEndpointInputConnectorEditPart) {
			double position;
			EObject parentEndpoint = ((org.eclipse.gmf.runtime.notation.impl.NodeImpl) (childEditPart
					.getParent()).getModel()).getElement();
			if (((NamedEndpoint) parentEndpoint).getInputConnector()
					.getIncomingLinks().size() != 0) {
				EObject source = ((NamedEndpoint) parentEndpoint)
						.getInputConnector().getIncomingLinks().get(0)
						.getSource().eContainer();
				position = ((source instanceof LoadBalanceEndPoint)
						|| (source instanceof FailoverEndPoint) || (source instanceof SendMediator)) ? 0.5
						: 0.25;
			} else {
				position = 0.25;
			}
			IFigure borderItemFigure = ((NamedEndpointInputConnectorEditPart) childEditPart)
					.getFigure();
			BorderItemLocator locator = new FixedBorderItemLocator(
					getMainFigure(), borderItemFigure, PositionConstants.WEST,
					position);
			getBorderedFigure().getBorderItemContainer().add(borderItemFigure,
					locator);
			return true;
		}
		if (childEditPart instanceof NamedEndpointOutputConnectorEditPart) {
			IFigure borderItemFigure = ((NamedEndpointOutputConnectorEditPart) childEditPart)
					.getFigure();
			BorderItemLocator locator = new FixedBorderItemLocator(
					getMainFigure(), borderItemFigure, PositionConstants.WEST,
					0.75);
			getBorderedFigure().getBorderItemContainer().add(borderItemFigure,
					locator);
			return true;
		}
		return false;
	}

	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}
	
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}	
	
	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createMainFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}
	
	public void createDialogBox() {

		final EObject diagram = ((org.eclipse.gmf.runtime.notation.impl.NodeImpl) ((org.eclipse.gmf.runtime.notation.impl.NodeImpl) getModel())
				.getDiagram().getChildren().get(0)).getElement().eContainer();

		final EObject endpoint = (NamedEndpoint) ((org.eclipse.gmf.runtime.notation.impl.NodeImpl) getModel())
				.getElement();

		// For validation: user should not enter "" value for name.
		if ((((NamedEndpoint) endpoint).getName() == null)||((NamedEndpoint) endpoint).getName().trim().equals("")) {
			IInputValidator validator = new IInputValidator() {

				public String isValid(String str) {
					if (str.trim().isEmpty()) {
						return "Endpoint name cannot be empty";
					} else if (str.indexOf(0x20) != -1) {
						return "Endpoint name cannot contain spaces";
					}
					return null;
				}

			};
/*			String defaultName = "Default"
					+ (((EsbDiagram) diagram).getTest() + 1);*/
			String defaultName = "Default";
			final InputDialog endpointNameInput = new InputDialog(new Shell(),
					"Enter Endpoint Name", "Endpoint Name", defaultName,
					validator);
			int open = endpointNameInput.open();
			if (open == Dialog.OK) {
				Display.getDefault().asyncExec(new Runnable() {

					public void run() {
						String endpointName = endpointNameInput.getValue();
						TransactionalEditingDomain editingDomain = getEditingDomain();
/*						SetRequest setRequestSequenceCount = new SetRequest(
								editingDomain, diagram, EsbPackage.eINSTANCE
										.getEsbDiagram_Test(),
								((EsbDiagram) diagram).getTest() + 1);
						SetValueCommand operationSequenceCount = new SetValueCommand(
								setRequestSequenceCount) {

							public boolean canUndo() {
								return true;
							}

							public boolean canRedo() {
								return true;
							}
						};

						ICommandProxy commandSequenceCount = new ICommandProxy(
								operationSequenceCount);
						if (commandSequenceCount.canExecute()) {
							getEditDomain().getCommandStack().execute(
									commandSequenceCount);
						}*/

						SetRequest setRequest = new SetRequest(editingDomain,
								endpoint, EsbPackage.eINSTANCE
										.getNamedEndpoint_Name(), endpointName);
						SetValueCommand operation = new SetValueCommand(
								setRequest) {

							public boolean canUndo() {
								return true;
							}

							public boolean canRedo() {
								return true;
							}
						};

						getEditDomain().getCommandStack().execute(
								new ICommandProxy(operation));
						openWithSeparateEditor();
					}
				});
			}
		} else {
			openWithSeparateEditor();
		}
	}
	
	public void openWithSeparateEditor() {
		IEditorPart editorPart = null;
		IProject activeProject = null;
		IEditorReference editorReferences[] = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage()
				.getEditorReferences();
		for (int i = 0; i < editorReferences.length; i++) {
			IEditorPart editor = editorReferences[i].getEditor(false);

			if (editor != null) {
				editorPart = editor.getSite().getWorkbenchWindow()
						.getActivePage().getActiveEditor();
			}

			if (editorPart != null) {
				IFileEditorInput input = (IFileEditorInput) editorPart
						.getEditorInput();
				IFile file = input.getFile();
				activeProject = file.getProject();

			}

		}

		String name = ((NamedEndpoint) ((org.eclipse.gmf.runtime.notation.impl.NodeImpl) getModel())
				.getElement()).getName();
		if (!name.equals("")) {

			/*
			 * Tool group creations in the Tool pallete.
			 */

			if ((getEditDomain().getPaletteViewer().getPaletteRoot()
					.getChildren().size() - 1) != ToolPalleteDetails.DEFINED_ENDPOINT) {
				getEditDomain().getPaletteViewer().getPaletteRoot()
						.add(createDefinedEndpointsGroup());
			}

			if (!definedEndpointsNames.contains(name)) {
				((PaletteContainer) getEditDomain().getPaletteViewer()
						.getPaletteRoot().getChildren()
						.get(ToolPalleteDetails.DEFINED_ENDPOINT))
						.add(createNamedEndpoint6CreationTool(name));
				definedEndpointsNames.add(name);
			}

		}

		/*
		 * File creations.
		 */
		createFiles(name, "endpoint_" + name + ".esb_diagram", "endpoint_"
				+ name + ".esb", activeProject);

	}
	
	public boolean createFiles(String name, String fileURI1, String fileURI2,
			IProject currentProject) {
		Resource diagram;

		String basePath = "platform:/resource/" + currentProject.getName()
				+ "/" + ENDPOINT_RESOURCE_DIR + "/";
		IFile file = currentProject.getFile(ENDPOINT_RESOURCE_DIR + "/"
				+ fileURI1);

		if (!file.exists()) {
			diagram = EsbDiagramEditorUtil.createDiagram(
					URI.createURI(basePath + fileURI1),
					URI.createURI(basePath + fileURI2),
					new NullProgressMonitor(), "endpoint", name);
			try {
				EsbDiagramEditorUtil.openDiagram(diagram);

			} catch (PartInitException e) {
				log.error("Cannot init editor", e);
			}
			return diagram != null;
		}

		else {
			IWorkbenchPage page = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage();
			IEditorDescriptor desc = PlatformUI.getWorkbench()
					.getEditorRegistry().getDefaultEditor(file.getName());
			try {
				page.openEditor(new FileEditorInput(file), desc.getId());
			} catch (PartInitException e) {
				log.error("Cannot init editor", e);
			}
			return true;
		}
	}
	
	private PaletteContainer createDefinedEndpointsGroup() {
		PaletteDrawer paletteContainer = new PaletteDrawer("DefinedEndpoints");
		paletteContainer.setId("DefinedEndpoints"); //$NON-NLS-1$

		return paletteContainer;
	}

	private ToolEntry createNamedEndpoint6CreationTool(String name) {
		NodeToolEntry entry = new NodeToolEntry(
				name,
				Messages.NamedEndpoint6CreationTool_desc,
				Collections.singletonList(EsbElementTypes.NamedEndpoint_3660));
		entry.setId("createNamedEndpoint6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.NamedEndpoint_3660));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	public class NamedEndpointFigure extends EsbGraphicalShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureNamedEndPointNamePropertyLabel;

		/**
		 * @generated
		 */
		public NamedEndpointFigure() {

			this.setBackgroundColor(THIS_BACK);
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureNamedEndPointNamePropertyLabel = new WrappingLabel();
			fFigureNamedEndPointNamePropertyLabel.setText("<...>");
			fFigureNamedEndPointNamePropertyLabel.setAlignment(SWT.CENTER);
			this.getPropertyValueRectangle1().add(
					fFigureNamedEndPointNamePropertyLabel);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNamedEndPointNamePropertyLabel() {
			return fFigureNamedEndPointNamePropertyLabel;
		}

		public String getIconPath() {
			return "icons/ico20/wsdl-endpoint.gif";
		}

		public String getNodeName() {
			return "WSDL-EP";
		}

		public Color getBackgroundColor() {
			return THIS_BACK;
		}

	}
	
	public static class NodeToolEntry extends PaletteToolEntry {

		private final List<IElementType> elementTypes;

		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			// super(title, description, null, null);
			super(null, title, null);
			this.setDescription(description);
			this.elementTypes = elementTypes;
		}

		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 40, 151, 248);

}
