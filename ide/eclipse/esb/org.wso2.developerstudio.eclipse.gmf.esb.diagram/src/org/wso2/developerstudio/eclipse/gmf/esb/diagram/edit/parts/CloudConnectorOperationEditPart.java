package org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Properties;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.synapse.config.xml.TemplateMediatorFactory;
import org.apache.synapse.mediators.template.TemplateMediator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xml.type.internal.QName;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.wso2.developerstudio.eclipse.gmf.esb.CallTemplateMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.CallTemplateParameter;
import org.wso2.developerstudio.eclipse.gmf.esb.CloudConnectorOperation;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleActionType;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.Activator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.EsbGraphicalShapeWithLabel;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.FixedBorderItemLocator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.FixedSizedAbstractMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.ShowPropertyViewEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.cloudconnector.CloudConnectorDirectoryTraverser;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.editpolicy.FeedbackIndicateDragDropEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.extensions.CustomPaletteToolTransferDropTargetListener;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.CloudConnectorOperationCanonicalEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.CloudConnectorOperationItemSemanticEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbMultiPageEditor;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;

/**
 * @generated NOT
 */
public class CloudConnectorOperationEditPart extends FixedSizedAbstractMediator {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3722;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);
	private static final String synapseNS = "http://ws.apache.org/ns/synapse";
	private Properties properties = new Properties();

	/**
	 * @generated
	 */
	public CloudConnectorOperationEditPart(View view) {
		super(view);
	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub
		super.activate();

		SetCommand setCommand = new SetCommand(getEditingDomain(),
				((CloudConnectorOperation) ((Node) getModel()).getElement()),
				EsbPackage.Literals.CLOUD_CONNECTOR_OPERATION__CONFIG_REF,
				CustomPaletteToolTransferDropTargetListener.definedName);
		if (setCommand.canExecute()) {
			getEditingDomain().getCommandStack().execute(setCommand);
		}
		CustomPaletteToolTransferDropTargetListener.definedName = null;
		fillConnectorOperationParameters();
	}

	protected void fillConnectorOperationParameters() {
		TransactionalEditingDomain editingDomain = null;
		IEditorPart editorpart = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage().getActiveEditor();
		IFileEditorInput input = (IFileEditorInput) editorpart.getEditorInput();
		IFile file = input.getFile();
		IProject activeProject = file.getProject();
		String connectorPath = activeProject.getLocation().toOSString() + File.separator
				+ "cloudConnectors" + File.separator + "twilio-connector";

		CloudConnectorDirectoryTraverser cloudConnectorDirectoryTraverser = CloudConnectorDirectoryTraverser
				.getInstance(connectorPath);
		String directory = null;
		try {
			directory = cloudConnectorDirectoryTraverser.getArtifactsMap().get(
					CustomPaletteToolTransferDropTargetListener.addedOperation);
		} catch (Exception e1) {
			log.error("Error while retrieving data for cloud connector", e1);
		}
		String path = connectorPath + File.separator + directory + File.separator
				+ CustomPaletteToolTransferDropTargetListener.addedOperation + ".xml";
		CustomPaletteToolTransferDropTargetListener.addedOperation = null;

		try {
			String source = FileUtils.getContentAsString(new File(path));
			OMElement element = AXIOMUtil.stringToOM(source);

			if (element.getFirstChildWithName(new QName(synapseNS, "sequence", null)) != null) {
				TemplateMediatorFactory templateMediatorFactory = new TemplateMediatorFactory();
				TemplateMediator templateMediator = (TemplateMediator) templateMediatorFactory
						.createMediator(element, properties);
				editingDomain = getEditingDomain();
				DeleteCommand modelDeleteCommand = new DeleteCommand(editingDomain,
						((CloudConnectorOperation) ((Node) getModel()).getElement())
								.getConnectorParameters());
				if (modelDeleteCommand.canExecute()) {
					editingDomain.getCommandStack().execute(modelDeleteCommand);
				}
				for (String parameter : templateMediator.getParameters()) {
					final CallTemplateParameter callTemplateParameter = EsbFactory.eINSTANCE
							.createCallTemplateParameter();
					callTemplateParameter.setParameterName(parameter);
					RecordingCommand command = new RecordingCommand(editingDomain) {
						protected void doExecute() {
							((CloudConnectorOperation) ((Node) getModel()).getElement())
									.getConnectorParameters().add(callTemplateParameter);
						}
					};
					if (command.canExecute()) {
						editingDomain.getCommandStack().execute(command);
					}
				}
			}
		} catch (XMLStreamException e) {
			log.error("Error occured while parsing selected template file", e);
			//ErrorDialog.openError(shell,"Error occured while parsing selected template file", e.getMessage(), null);
		} catch (IOException e) {
			log.error("Error occured while reading selected template file", e);
			//ErrorDialog.openError(shell,"Error occured while reading selected template file", e.getMessage(), null);
		}
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicyWithCustomReparent(
				EsbVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CloudConnectorOperationItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new FeedbackIndicateDragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CloudConnectorOperationCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// For handle Double click Event.
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new ShowPropertyViewEditPolicy());
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
				case CloudConnectorOperationInputConnectorEditPart.VISUAL_ID:
				case CloudConnectorOperationOutputConnectorEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
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
		return primaryShape = new CloudConnectorOperationFigure() {
			public void setBounds(org.eclipse.draw2d.geometry.Rectangle rect) {
				super.setBounds(rect);
				if (this.getBounds().getLocation().x != 0 && this.getBounds().getLocation().y != 0) {
					getMostSuitableElementToConnect();
					reAllocate(rect);
				}
			};
		};
	}

	/**
	 * @generated
	 */
	public CloudConnectorOperationFigure getPrimaryShape() {
		return (CloudConnectorOperationFigure) primaryShape;
	}

	/**
	 * @generated NOT
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CloudConnectorOperationDescriptionEditPart) {
			((CloudConnectorOperationDescriptionEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureCloudConnectorOperationDescriptionFigure());
			return true;
		}
		if (childEditPart instanceof CloudConnectorOperationInputConnectorEditPart) {
			IFigure borderItemFigure = ((CloudConnectorOperationInputConnectorEditPart) childEditPart)
					.getFigure();
			BorderItemLocator locator = new FixedBorderItemLocator(getMainFigure(),
					borderItemFigure, PositionConstants.WEST, 0.5);
			getBorderedFigure().getBorderItemContainer().add(borderItemFigure, locator);
			return true;
		}
		if (childEditPart instanceof CloudConnectorOperationOutputConnectorEditPart) {
			IFigure borderItemFigure = ((CloudConnectorOperationOutputConnectorEditPart) childEditPart)
					.getFigure();
			BorderItemLocator locator = new FixedBorderItemLocator(getMainFigure(),
					borderItemFigure, PositionConstants.EAST, 0.5);
			getBorderedFigure().getBorderItemContainer().add(borderItemFigure, locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CloudConnectorOperationDescriptionEditPart) {
			return true;
		}
		if (childEditPart instanceof CloudConnectorOperationInputConnectorEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((CloudConnectorOperationInputConnectorEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CloudConnectorOperationOutputConnectorEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((CloudConnectorOperationOutputConnectorEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
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

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(EsbVisualIDRegistry
				.getType(CloudConnectorOperationDescriptionEditPart.VISUAL_ID));
	}

	/**
	 * @generated NOT
	 */
	public class CloudConnectorOperationFigure extends EsbGraphicalShapeWithLabel {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureCloudConnectorOperationDescriptionFigure;

		/**
		 * @generated NOT
		 */
		public CloudConnectorOperationFigure() {

			/*			GridLayout layoutThis = new GridLayout();
			 layoutThis.numColumns = 1;
			 layoutThis.makeColumnsEqualWidth = true;
			 this.setLayoutManager(layoutThis);

			 this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			 this.setLineStyle(Graphics.LINE_DASH);*/
			this.setBackgroundColor(THIS_BACK);
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureCloudConnectorOperationDescriptionFigure = new WrappingLabel();

			fFigureCloudConnectorOperationDescriptionFigure.setText("<...>");

			//this.add(fFigureCloudConnectorOperationDescriptionFigure);
			fFigureCloudConnectorOperationDescriptionFigure = getPropertyNameLabel();

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCloudConnectorOperationDescriptionFigure() {
			return fFigureCloudConnectorOperationDescriptionFigure;
		}

		public String getIconPath() {
			return "icons/ico20/log-mediator.gif";
		}

		public String getNodeName() {
			return "Cloud Connector";
		}

		public IFigure getToolTip() {
			return new Label("Connect with Cloud");
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 255, 255, 255);

}
