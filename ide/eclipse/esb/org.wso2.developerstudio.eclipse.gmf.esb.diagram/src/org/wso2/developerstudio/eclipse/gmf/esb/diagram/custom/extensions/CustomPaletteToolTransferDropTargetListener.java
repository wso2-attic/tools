package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.extensions;

import java.util.Collection;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.internal.parts.PaletteToolTransferDropTargetListener;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.ui.PlatformUI;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.cloudconnector.CloudConnectorDirectoryTraverser;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.configure.ui.CloudConnectorInitialConfigurationDialog;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbPaletteFactory.NodeToolEntry;


public class CustomPaletteToolTransferDropTargetListener extends
		PaletteToolTransferDropTargetListener {

	public static String definedName;
	public static String addedOperation;
	
	public CustomPaletteToolTransferDropTargetListener(EditPartViewer viewer) {
		super(viewer);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void drop(DropTargetEvent event) {		
		if(event.data instanceof NodeToolEntry){
			if("createCloudConnector1CreationTool".equals(((NodeToolEntry)event.data).getId())){
				Collection<String> cloudConnectorConfigurationParameters = null;
				try {
					cloudConnectorConfigurationParameters = CloudConnectorDirectoryTraverser.getInstance("/home/viraj/WSO2/DeveloperStudio/Trunk/eclipse/esb/org.wso2.developerstudio.eclipse.gmf.esb.diagram/resources/cloudConnectors/temp/twilio-connector").getCloudConnectorConfigurationParameters();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
				CloudConnectorInitialConfigurationDialog cloudConnectorConfigureDialog = new CloudConnectorInitialConfigurationDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(),cloudConnectorConfigurationParameters);
				cloudConnectorConfigureDialog.setBlockOnOpen(true);
				cloudConnectorConfigureDialog.open();
			
				return;
			}else if((((NodeToolEntry)event.data).getId()).contains("cloudConnectorOperation")){
				definedName=((NodeToolEntry)event.data).getId().split("-")[2];
				addedOperation=((NodeToolEntry)event.data).getLabel();
			}
		}
		
		super.drop(event);
	}

}
