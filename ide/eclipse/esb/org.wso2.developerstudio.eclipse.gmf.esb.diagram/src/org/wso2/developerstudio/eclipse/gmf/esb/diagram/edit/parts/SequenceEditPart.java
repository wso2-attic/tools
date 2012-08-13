package org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts;

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
import org.wso2.developerstudio.eclipse.gmf.esb.EsbDiagram;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequence;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.EsbGraphicalShape;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.FixedBorderItemLocator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.SequenceOpenEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.SequenceStorage;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.ToolPalleteDetails;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.SequenceCanonicalEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.SequenceItemSemanticEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.Messages;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.custom.SequenceFileCreator;

/**
 * @generated NOT
 */
public class SequenceEditPart extends AbstractMediator {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3503;

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
	
	private float inputCount = 0, outputCount = 0;


	/**
	 * @generated
	 */
	public SequenceEditPart(View view) {
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
				new SequenceItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new SequenceCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());

		// For handle Double click Event.
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new SequenceOpenEditPolicy());

		// XXX need an SCR to runtime to have another abstract superclass that
		// would let children add reasonable editpolicies
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
				case SequenceInputConnectorEditPart.VISUAL_ID:
				case SequenceOutputConnectorEditPart.VISUAL_ID:
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
	 * @generated NOT
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SequenceNameEditPart) {
			((SequenceNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getSequenceLabelFigure());
			return true;
		}
		if (childEditPart instanceof SequenceInputConnectorEditPart) {
			IFigure borderItemFigure = ((SequenceInputConnectorEditPart) childEditPart)
					.getFigure();
			BorderItemLocator locator = new FixedBorderItemLocator(
					getMainFigure(), borderItemFigure, PositionConstants.WEST,
					0.5);
			getBorderedFigure().getBorderItemContainer().add(borderItemFigure,
					locator);
			return true;
		}
		if (childEditPart instanceof SequenceOutputConnectorEditPart) {
			IFigure borderItemFigure = ((SequenceOutputConnectorEditPart) childEditPart)
					.getFigure();
			BorderItemLocator locator = new FixedBorderItemLocator(
					getMainFigure(), borderItemFigure, PositionConstants.EAST,
					0.5);
			getBorderedFigure().getBorderItemContainer().add(borderItemFigure,
					locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SequenceNameEditPart) {
			return true;
		}
		if (childEditPart instanceof SequenceInputConnectorEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((SequenceInputConnectorEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof SequenceOutputConnectorEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((SequenceOutputConnectorEditPart) childEditPart)
							.getFigure());
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
	 * Body of this method does not depend on settings in generation model so
	 * you may safely remove <i>generated</i> tag and modify it.
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
	 * Default implementation treats passed figure as content pane. Respects
	 * layout one may have set for generated figure.
	 * 
	 * @param nodeShape
	 *            instance of generated figure class
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
	 * {@inheritDoc}
	 */
	protected void addBorderItem(IFigure borderItemContainer,
			IBorderItemEditPart borderItemEditPart) {
		IFigure borderItemFigure = borderItemEditPart.getFigure();
		if (borderItemEditPart instanceof SequenceInputConnectorEditPart) {
			borderItemContainer.add(borderItemFigure,
					new FixedBorderItemLocator(getMainFigure(),
							borderItemFigure, PositionConstants.WEST, 0.5));
		} else if (borderItemEditPart instanceof SequenceOutputConnectorEditPart) {
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

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(EsbVisualIDRegistry
				.getType(SequenceNameEditPart.VISUAL_ID));
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
		types.add(EsbElementTypes.Sequence_3503);
		/*types.add(EsbElementTypes.Sequence_3187);
		types.add(EsbElementTypes.Sequence_3254);
		types.add(EsbElementTypes.Sequence_3375);*/
		NodeToolEntry entry = new NodeToolEntry(name,
				Messages.Sequence4CreationTool_desc, types);
		entry.setId("createSequence4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.Sequence_3503));
		entry.setLargeIcon(entry.getSmallIcon());

		// ((org.wso2.developerstudio.eclipse.gmf.esb.Sequence)(org.eclipse.emf.ecore.impl.EClassImpl)entry.elementTypes.get(0).getEClass()).setName("Tha");
		// System.out.println("wwwwww"
		// + entry.elementTypes.get(0).getEClass().eContainer()
		// .eContents().get(0));
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
			// Set layout for the main container
			GridLayout mainLayout = new GridLayout(2,false);
			mainLayout.marginHeight = 20;
			mainLayout.marginWidth = 20;
			shell.setLayout(mainLayout);

			Label label = new Label(shell, SWT.NULL);
			label.setText("Name    ");

			final Text text = new Text(shell, SWT.SINGLE | SWT.BORDER);
			GridData textGridData= new GridData();
			textGridData.horizontalAlignment = GridData.HORIZONTAL_ALIGN_FILL;
			textGridData.horizontalSpan = 1;
			textGridData.minimumHeight=100;
			textGridData.minimumWidth=300;
			textGridData.grabExcessHorizontalSpace=true;
			text.setLayoutData(textGridData);	
			
			Button buttonCancel = new Button(shell, SWT.PUSH);
			buttonCancel.setText("    Cancel    ");
			GridData cancelButtonGridData=new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
			cancelButtonGridData.verticalIndent=10;
			buttonCancel.setLayoutData(cancelButtonGridData);
			
			final Button buttonOK = new Button(shell, SWT.PUSH);
			buttonOK.setText("        Ok         ");
			GridData okButtonGridData=new GridData(GridData.HORIZONTAL_ALIGN_END);
			okButtonGridData.verticalIndent=10;
			buttonOK.setLayoutData(okButtonGridData);

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
		 * @generated NOT
		 */
		public SequenceFigure() {

			/*
			 * GridLayout layoutThis = new GridLayout(); layoutThis.numColumns =
			 * 1; layoutThis.makeColumnsEqualWidth = true;
			 * this.setLayoutManager(layoutThis);
			 * 
			 * this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
			 * getMapMode().DPtoLP(8)));
			 */
			this.setBackgroundColor(THIS_BACK);
			createContents();

			/*
			 * this.addMouseListener(new MouseListener() {
			 * 
			 * public void mouseReleased(MouseEvent me) { // TODO Auto-generated
			 * method stub System.out.println("Released"); }
			 * 
			 * public void mousePressed(MouseEvent me) {
			 * //openWithSeparateEditor();
			 * 
			 * /*final EObject diagram =
			 * ((org.eclipse.gmf.runtime.notation.impl.NodeImpl)
			 * ((org.eclipse.gmf.runtime.notation.impl.NodeImpl) getModel())
			 * .getDiagram().getChildren().get(0)).getElement() .eContainer();
			 * String name = ((Sequence)
			 * ((org.eclipse.gmf.runtime.notation.impl.NodeImpl) getModel())
			 * .getElement()).getName(); if (sequenceStorage.sequences.get(name)
			 * == null) {
			 * 
			 * TransactionalEditingDomain editingDomain = getEditingDomain();
			 * SetRequest setRequest = new SetRequest(editingDomain, diagram,
			 * EsbPackage.eINSTANCE .getEsbDiagram_Test(), ((EsbDiagram)
			 * diagram).getTest() + 1); SetValueCommand operation = new
			 * SetValueCommand( setRequest) {
			 * 
			 * public boolean canUndo() { return true; }
			 * 
			 * public boolean canRedo() { return true; } };
			 * 
			 * getEditDomain().getCommandStack().execute( new
			 * ICommandProxy(operation));
			 * 
			 * sequenceStorage.sequences.put(name, ((EsbDiagram)
			 * diagram).getTest());
			 * 
			 * 
			 * // * Tool group creations in the Tool pallete.
			 * 
			 * 
			 * if ((getEditDomain().getPaletteViewer()
			 * .getPaletteRoot().getChildren().size() - 1) !=
			 * ToolPalleteDetails.SEQUENCE) {
			 * getEditDomain().getPaletteViewer().getPaletteRoot()
			 * .add(createSequenceGroup()); }
			 * 
			 * ((PaletteContainer) getEditDomain().getPaletteViewer()
			 * .getPaletteRoot().getChildren()
			 * .get(ToolPalleteDetails.SEQUENCE))
			 * .add(createSequence4CreationTool(name));
			 * 
			 * }
			 * 
			 * 
			 * // * File creations.
			 * 
			 * SequenceFileCreator sequenceFileCreator = new
			 * SequenceFileCreator();
			 * sequenceFileCreator.createFiles("sequence_" + name +
			 * ".sequence_diagram", "sequence_" + name + ".sequence");
			 * 
			 * 
			 * /* IFile file =
			 * ResourcesPlugin.getWorkspace().getRoot().getProject ("testing")
			 * .getFile("sequence"+sequenceStorage.sequences.
			 * get(currentSequence).toString()+".sequence_diagram");
			 * 
			 * if(!file.exists()){
			 * 
			 * createFiles(); try { file.create(null, IResource.NONE, null); }
			 * catch (CoreException e1) { // TODO Auto-generated catch block
			 * e1.printStackTrace(); } } file =
			 * ResourcesPlugin.getWorkspace().getRoot().getProject("testing" )
			 * .getFile("sequence"+sequenceStorage.sequences.get(
			 * currentSequence).toString()+".sequence_diagram");
			 * 
			 * IWorkbenchPage page = PlatformUI.getWorkbench()
			 * .getActiveWorkbenchWindow().getActivePage(); //System.out.
			 * println("xxxxxxxxxx"+sequenceStorage.sequences
			 * .get(currentSequence
			 * )+"     "+page.getActiveEditor().getEditorInput ().getName());
			 * HashMap map = new HashMap(); map.put(IMarker.LINE_NUMBER, new
			 * Integer(5)); map.put(IWorkbenchPage.EDITOR_ID_ATTR,
			 * "org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.part.EsbDiagramEditorID"
			 * ); IMarker marker; try { marker =
			 * file.createMarker(IMarker.TEXT);
			 * 
			 * marker.setAttributes(map); // page.openEditor(marker); //2.1 API
			 * IDE.openEditor(page, marker); // 3.0 API marker.delete(); } catch
			 * (CoreException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); }
			 * 
			 * 
			 * }
			 * 
			 * public void mouseDoubleClicked(MouseEvent me) { // TODO
			 * Auto-generated method stub System.out.println("DoubleClicked");
			 * 
			 * }
			 * 
			 * });
			 */
		}

		private PaletteContainer createSequenceGroup() {
			PaletteDrawer paletteContainer = new PaletteDrawer("Sequences");
			paletteContainer.setId("Sequences"); //$NON-NLS-1$

			return paletteContainer;
		}

		private ToolEntry createSequence4CreationTool(String name) {
			NodeToolEntry entry = new NodeToolEntry(name,
					Messages.Sequence4CreationTool_desc,
					Collections.singletonList(EsbElementTypes.Sequence_3503));
			entry.setId("createSequence4CreationTool"); //$NON-NLS-1$
			entry.setSmallIcon(EsbElementTypes
					.getImageDescriptor(EsbElementTypes.Sequence_3503));
			entry.setLargeIcon(entry.getSmallIcon());

			// ((org.wso2.developerstudio.eclipse.gmf.esb.Sequence)(org.eclipse.emf.ecore.impl.EClassImpl)entry.elementTypes.get(0).getEClass()).setName("Tha");
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

		/*	*//**
				 * @generated NOT
				 */
		/*
		 * protected void fillShape(Graphics graphics) { // Backup the graphics
		 * colors Color bgColor = graphics.getBackgroundColor(); Color fgColor =
		 * graphics.getForegroundColor(); // Set the graphics color
		 * graphics.setBackgroundColor(getBackgroundColor());
		 * graphics.setForegroundColor(ColorConstants.white); // Restore the
		 * original colors graphics.fillGradient(getBounds(), true);
		 * graphics.setBackgroundColor(bgColor);
		 * graphics.setForegroundColor(fgColor); }
		 */

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

	/*
	 * This will be used for arrange the connectors to the right side of the figure.
	 */
	public void moveConnectorsRightSide(){
	
		for (int i = 0; i < this.getChildren().size(); ++i) {
			if (this.getChildren().get(i) instanceof AbstractInputConnector) {
				IFigure inputConnector=((AbstractInputConnector) this.getChildren().get(i))
				.getFigure();
				NodeFigure figureInput = ((AbstractInputConnector) this.getChildren()
						.get(i)).getNodeFigureInput();
				figureInput.removeAll();
				figureInput.add(((AbstractInputConnector) this.getChildren().get(i))
						.getPrimaryShapeReverse());
				BorderItemLocator inputLocator = new FixedBorderItemLocator(
						this.getMainFigure(), inputConnector, PositionConstants.EAST,
						0.30);
				
				this.getBorderedFigure().getBorderItemContainer()
				.remove(inputConnector);
				this.getBorderedFigure().getBorderItemContainer()
				.add(inputConnector, inputLocator);
			}
		}

		for (int i = 0; i < this.getChildren().size(); ++i) {
			if (this.getChildren().get(i) instanceof AbstractOutputConnector) {
				IFigure outputConnector = ((AbstractOutputConnector) this.getChildren().get(i))
				.getFigure();
				NodeFigure figureOutput = ((AbstractOutputConnector) this.getChildren()
						.get(i)).getNodeFigureOutput();
				
				BorderItemLocator outputLocator = new FixedBorderItemLocator(
						this.getMainFigure(), outputConnector, PositionConstants.EAST,
						0.70);
				this.getBorderedFigure().getBorderItemContainer()
				.remove(outputConnector);
				this.getBorderedFigure().getBorderItemContainer()
				.add(outputConnector,outputLocator);
			}
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

}
