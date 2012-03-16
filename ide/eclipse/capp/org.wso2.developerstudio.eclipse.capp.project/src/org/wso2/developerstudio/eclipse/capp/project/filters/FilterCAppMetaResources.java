package org.wso2.developerstudio.eclipse.capp.project.filters;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.wso2.developerstudio.eclipse.capp.project.Activator;
import org.wso2.developerstudio.eclipse.capp.project.model.ServerRoleCollectionNode;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

public class FilterCAppMetaResources extends ViewerFilter {
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	public boolean select(Viewer arg0, Object parent, Object child) {
//		Following commented code will hide the artifact folder		
//		if (child instanceof IFolder){
//			IFolder artifactFolder=(IFolder)child;
//			if (!artifactFolder.isLinked()){
//				try {
//					Artifact artifact = CAppEnvironment.getcAppManager().getArtifact(artifactFolder);
//					return artifact==null;
//				} catch (Exception e) {
//					log.error(e);
//				}
//			}
//		}
//		Hiding the artifact.xml & Server roles nodes
//		if (child instanceof IFile){
//			IFile artifactFile=(IFile)child;
//			if (!artifactFile.isLinked()){
//				try {
//					Artifact artifact = CAppEnvironment.getcAppManager().getArtifact(artifactFile);
//					return artifact==null;
//				} catch (Exception e) {
//					log.error(e);
//				}
//			}
//		}
		if (child instanceof ServerRoleCollectionNode){
			return false;
		}
		return true;
	}

}
