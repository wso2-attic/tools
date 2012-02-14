package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
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
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbDiagram;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.carbonstudio.eclipse.gmf.esb.Sequence;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.EsbGraphicalShape;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.FixedBorderItemLocator;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.SequenceOpenEditPolicy;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.SequenceStorage;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.ToolPalleteDetails;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.policies.Sequence2CanonicalEditPolicy;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.policies.Sequence2ItemSemanticEditPolicy;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part.Messages;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.custom.SequenceFileCreator;

/**
 * @generated
 */
public class Sequence2EditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3187;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	public static SequenceStorage sequenceStorage = new SequenceStorage();

	private static Integer sequenceCount = 0;

	private SequenceEditPart currentSequence;

	private String value;

	public static ArrayList<String> definedSequenceNames = new ArrayList<String>();

	/**
	 * @generated
	 */
	public Sequence2EditPart(View view) {
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
				new Sequence2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new Sequence2CanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());

		// For handle Double click Event.
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new SequenceOpenEditPolicy());
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
				case SequenceInputConnector2EditPart.VISUAL_ID:
				case SequenceOutputConnector2EditPart.VISUAL_ID:
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
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new SequenceFigure();
	}

	/**
	 * @generated
	 */
	public SequenceFigure getPrimaryShape() {
		return (SequenceFigure) primaryShape;
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

	protected void addBorderItem(IFigure borderItemContainer,
			IBorderItemEditPart borderItemEditPart) {
		IFigure borderItemFigure = borderItemEditPart.getFigure();
		if (borderItemEditPart instanceof SequenceInputConnector2EditPart) {
			borderItemContainer.add(borderItemFigure,
					new FixedBorderItemLocator(getMainFigure(),
							borderItemFigure, PositionConstants.WEST, 0.5));
		} else if (borderItemEditPart instanceof SequenceOutputConnector2EditPart) {
			borderItemContainer.add(borderItemFigure,
					new FixedBorderItemLocator(getMainFigure(),
							borderItemFigure, PositionConstants.EAST, 0.5));
		} else {
			super.addBorderItem(borderItemContainer, borderItemEditPart);
		}
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

		String name = ((Sequence) ((org.eclipse.gmf.runtime.notation.impl.NodeImpl) getModel())
				.getElement()).getName();
		//if (sequenceStorage.sequences.get(name) == null) {
		if (!name.equals("")) {

			//sequenceStorage.sequences.put(name,
			//	((EsbDiagram) diagram).getTest());

			/*
			 * Tool group creations in the Tool pallete.
			 */

			if ((getEditDomain().getPaletteViewer().getPaletteRoot()
					.getChildren().size() - 1) != ToolPalleteDetails.SEQUENCE) {
				getEditDomain().getPaletteViewer().getPaletteRoot()
						.add(createSequenceGroup());
			}

			if (!definedSequenceNames.contains(name)) {
				((PaletteContainer) getEditDomain().getPaletteViewer()
						.getPaletteRoot().getChildren()
						.get(ToolPalleteDetails.SEQUENCE))
						.add(createSequence4CreationTool(name));
				definedSequenceNames.add(name);
			}

		}

		/*
		 * File creations.
		 */
		SequenceFileCreator sequenceFileCreator = new SequenceFileCreator();
		sequenceFileCreator.createFiles("sequence_" + name
				+ ".sequence_diagram", "sequence_" + name + ".sequence",
				activeProject);

	}

	private PaletteContainer createSequenceGroup() {
		PaletteDrawer paletteContainer = new PaletteDrawer("Sequences");
		paletteContainer.setId("Sequences"); //$NON-NLS-1$

		return paletteContainer;
	}

	private ToolEntry createSequence4CreationTool(String name) {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EsbElementTypes.Sequence_3048);
		types.add(EsbElementTypes.Sequence_3187);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Sequence4CreationTool_title,
				Messages.Sequence4CreationTool_desc, types);
		entry.setId("createSequence4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.Sequence_3048));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	public void createDialogBox() {

		final EObject diagram = ((org.eclipse.gmf.runtime.notation.impl.NodeImpl) ((org.eclipse.gmf.runtime.notation.impl.NodeImpl) getModel())
				.getDiagram().getChildren().get(0)).getElement().eContainer();

		final EObject sequence = (Sequence) ((org.eclipse.gmf.runtime.notation.impl.NodeImpl) getModel())
				.getElement();

		// For validation: user should not enter "" value for name.
		if (((Sequence) sequence).getName().equals("")) {

			Shell parent = new Shell();
			final Shell shell = new Shell(parent, SWT.TITLE | SWT.BORDER
					| SWT.APPLICATION_MODAL);
			shell.setText("Enter Sequence Name");

			shell.setLayout(new GridLayout(2, true));

			Label label = new Label(shell, SWT.NULL);
			label.setText("Name    ");

			final Text text = new Text(shell, SWT.SINGLE | SWT.BORDER);

			final Button buttonOK = new Button(shell, SWT.PUSH);
			buttonOK.setText("Ok");
			buttonOK.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
			Button buttonCancel = new Button(shell, SWT.PUSH);
			buttonCancel.setText("Cancel");

			text.addListener(SWT.Modify, new Listener() {
				public void handleEvent(Event event) {
					try {
						value = text.getText();
						buttonOK.setEnabled(true);
					} catch (Exception e) {
						buttonOK.setEnabled(false);
					}
				}
			});

			buttonOK.addListener(SWT.Selection, new Listener() {
				public void handleEvent(Event event) {

					TransactionalEditingDomain editingDomain = getEditingDomain();
					SetRequest setRequestSequenceCount = new SetRequest(
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
					}

					// Set Name

					//TransactionalEditingDomain editingDomain = getEditingDomain();
					SetRequest setRequest = new SetRequest(editingDomain,
							sequence, EsbPackage.eINSTANCE.getSequence_Name(),
							text.getText());
					SetValueCommand operation = new SetValueCommand(setRequest) {

						public boolean canUndo() {
							return true;
						}

						public boolean canRedo() {
							return true;
						}
					};

					getEditDomain().getCommandStack().execute(
							new ICommandProxy(operation));

					shell.dispose();

					openWithSeparateEditor();
				}
			});

			buttonCancel.addListener(SWT.Selection, new Listener() {
				public void handleEvent(Event event) {
					shell.dispose();
				}
			});

			shell.addListener(SWT.Traverse, new Listener() {
				public void handleEvent(Event event) {
					if (event.detail == SWT.TRAVERSE_ESCAPE)
						event.doit = false;
				}
			});

			text.setText("Default" + (((EsbDiagram) diagram).getTest() + 1));
			shell.pack();
			shell.open();

			/*
			 * Display display = parent.getDisplay(); while
			 * (!shell.isDisposed()) { if (!display.readAndDispatch())
			 * display.sleep(); }
			 */

		} else {
			openWithSeparateEditor();
		}
	}

	/**
	 * @generated
	 */
	public class SequenceFigure extends EsbGraphicalShape {

		/**
		 * @generated
		 */
		private WrappingLabel fSequenceLabelFigure;

		/**
		 * @generated
		 */
		public SequenceFigure() {

			this.setBackgroundColor(THIS_BACK);
			createContents();
		}

		private PaletteContainer createSequenceGroup() {
			PaletteDrawer paletteContainer = new PaletteDrawer("Sequences");
			paletteContainer.setId("Sequences"); //$NON-NLS-1$

			return paletteContainer;
		}

		private ToolEntry createSequence4CreationTool(String name) {
			NodeToolEntry entry = new NodeToolEntry(name,
					Messages.Sequence4CreationTool_desc,
					Collections.singletonList(EsbElementTypes.Sequence_3048));
			entry.setId("createSequence4CreationTool"); //$NON-NLS-1$
			entry.setSmallIcon(EsbElementTypes
					.getImageDescriptor(EsbElementTypes.Sequence_3048));
			entry.setLargeIcon(entry.getSmallIcon());

			// ((org.wso2.carbonstudio.eclipse.gmf.esb.Sequence)(org.eclipse.emf.ecore.impl.EClassImpl)entry.elementTypes.get(0).getEClass()).setName("Tha");
			// System.out.println("wwwwww"
			// + entry.elementTypes.get(0).getEClass().eContainer()
			// .eContents().get(0));
			return entry;
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fSequenceLabelFigure = new WrappingLabel();
			fSequenceLabelFigure.setText("<...>");
			fSequenceLabelFigure.setAlignment(SWT.CENTER);
			this.getPropertyValueRectangle1().add(fSequenceLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getSequenceLabelFigure() {
			return fSequenceLabelFigure;
		}

		public String getIconPath() {
			return "icons/ico20/sequence.gif";
		}

		public String getNodeName() {
			return "Sequence";
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 230, 230, 230);

	private static class NodeToolEntry extends PaletteToolEntry {

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

}
