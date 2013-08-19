package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.extensions;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.internal.parts.PaletteToolTransferDropTargetListener;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.ui.PlatformUI;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.configure.ui.CallTemplateParamDialog;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbPaletteFactory.NodeToolEntry;
import org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbFactoryImpl;


public class CustomPaletteToolTransferDropTargetListener extends
		PaletteToolTransferDropTargetListener {

	public CustomPaletteToolTransferDropTargetListener(EditPartViewer viewer) {
		super(viewer);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void drop(DropTargetEvent event) {		
		if(event.data instanceof NodeToolEntry){
			if("createCloudConnector1CreationTool".equals(((NodeToolEntry)event.data).getId())){
				CallTemplateParamDialog callTemplateParamDialog = new CallTemplateParamDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(),
						EsbFactoryImpl.eINSTANCE.createCallTemplateMediator(),null);
				callTemplateParamDialog.setBlockOnOpen(true);
				callTemplateParamDialog.open();
				return;
			}
		}
		super.drop(event);
	}

}
