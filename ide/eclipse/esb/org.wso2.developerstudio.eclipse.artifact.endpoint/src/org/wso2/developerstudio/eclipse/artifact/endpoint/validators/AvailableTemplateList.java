package org.wso2.developerstudio.eclipse.artifact.endpoint.validators;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.FactoryConfigurationError;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.ui.*;
import org.eclipse.ui.internal.WorkbenchWindow;
import org.eclipse.ui.part.FileEditorInput;
import org.wso2.developerstudio.eclipse.artifact.endpoint.Activator;
import org.wso2.developerstudio.eclipse.artifact.endpoint.model.EndpointModel;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBArtifact;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBProjectArtifact;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractListDataProvider;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractListDataProvider.ListData;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.source.CompositeRuler;
import org.eclipse.jface.text.source.LineNumberRulerColumn;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.views.navigator.ResourceNavigator;
import org.osgi.framework.Bundle;
import org.eclipse.ui.IEditorPart;

public class AvailableTemplateList extends AbstractListDataProvider{

	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	@Override
	public List<ListData> getListData(String modelProperty,ProjectDataModel model) {
		
		List<ListData> availableStoreList = new ArrayList<ListData>();
		
		EndpointModel endpointModel = (EndpointModel) model;
		 
		IProject projects = endpointModel.getEndpointSaveLocation().getProject();
		
		
		
				try {
					if (projects.hasNature("org.wso2.developerstudio.eclipse.esb.project.nature")) {
						
						ESBProjectArtifact esbProjectArtifact = new ESBProjectArtifact();
						try {
							esbProjectArtifact.fromFile(projects.getFile("artifact.xml").getLocation().toFile());
							List<ESBArtifact> allESBArtifacts = esbProjectArtifact.getAllESBArtifacts();
							for (ESBArtifact esbArtifact : allESBArtifacts) {
								if(esbArtifact.getType().equals("synapse/endpointTemplate")){
									String relativeFilePath = esbArtifact.getFile().replaceAll("/", (File.separatorChar=='/')?"/":"\\\\");
									String fileName = new File((relativeFilePath)).getName().replaceAll(".xml$", "");
									availableStoreList.add(createListData(fileName,fileName));
								}
							}
						} catch (Exception e) {
							log.error("Error occured while scanning the workspace for Message-Store artifacts", e);
						}
					}
				} catch (Exception e) {
					log.error("Error occured while scanning the workspace for Message-Store artifacts", e);
				} 
		
		
		return availableStoreList;
	}

}
