package org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.custom;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.part.EsbDiagramEditorUtil;

public class SequenceFileCreator {

	public boolean createFiles(String fileURI1, String fileURI2, IProject currentProject) {
		Resource diagram;
		
		IPath location = new Path("platform:/resource/"+currentProject.getName()+"/" + fileURI1);
		IFile file = currentProject.getFile(location.lastSegment());
		
		if(!file.exists()){		
		diagram = EsbDiagramEditorUtil.createDiagram(
				URI.createURI("platform:/resource/"+currentProject.getName()+"/" + fileURI1),
				URI.createURI("platform:/resource/"+currentProject.getName()+"/" + fileURI2),
				new NullProgressMonitor());
		try {
			EsbDiagramEditorUtil.openDiagram(diagram);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		return diagram != null;
		}
		
		else{		
		IWorkbenchPage page =PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();		
		IEditorDescriptor desc = PlatformUI.getWorkbench().
		        getEditorRegistry().getDefaultEditor(file.getName());
		try {
			page.openEditor(new FileEditorInput(file), desc.getId());
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
		}
		
		
		
	}

}
