package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.extensions;

import java.io.File;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.internal.parts.PaletteToolTransferDropTargetListener;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.cloudconnector.CloudConnectorDirectoryTraverser;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.configure.ui.CloudConnectorInitialConfigurationDialog;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbPaletteFactory.NodeToolEntry;


public class CustomPaletteToolTransferDropTargetListener extends
		PaletteToolTransferDropTargetListener {

	public static String definedName;
	public static String addedConnector;
	public static String addedOperation;
	
	public CustomPaletteToolTransferDropTargetListener(EditPartViewer viewer) {
		super(viewer);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void drop(DropTargetEvent event) {		
		if(event.data instanceof NodeToolEntry){
			String[] splittedString = ((NodeToolEntry)event.data).getId().split("-");
			String groupName="";
			if(splittedString.length>1){
				groupName = splittedString[1];
			}
			if("cloudConnector".equals(groupName)){
				Collection<String> cloudConnectorConfigurationParameters = null;
				String droppedCloudConnector = splittedString[0];
				try {
					
					IEditorPart editorpart = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
							.getActivePage().getActiveEditor();
					IFileEditorInput input = (IFileEditorInput) editorpart.getEditorInput();
					IFile file = input.getFile();
					IProject activeProject = file.getProject();
					String connectorPath = activeProject.getLocation().toOSString() + File.separator
							+ "cloudConnectors" + File.separator + droppedCloudConnector+"-connector";
					
					cloudConnectorConfigurationParameters = CloudConnectorDirectoryTraverser.getInstance(connectorPath).getCloudConnectorConfigurationParameters();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
				CloudConnectorInitialConfigurationDialog cloudConnectorConfigureDialog = new CloudConnectorInitialConfigurationDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(),cloudConnectorConfigurationParameters);
				
				cloudConnectorConfigureDialog.setDroppedCloudConnector(droppedCloudConnector);
				cloudConnectorConfigureDialog.setBlockOnOpen(true);
				cloudConnectorConfigureDialog.open();
			
				return;
			}else if((((NodeToolEntry)event.data).getId()).contains("cloudConnectorOperation")){
				definedName=splittedString[2];
				addedConnector=groupName.toLowerCase();
				addedOperation=((NodeToolEntry)event.data).getLabel();
			}
		}
		
		super.drop(event);
	}

}
