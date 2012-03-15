package org.wso2.carbonstudio.eclipse.artifact.sequence.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.wso2.carbonstudio.eclipse.artifact.sequence.validators.RegOptionsList;
import org.wso2.carbonstudio.eclipse.esb.core.utils.SynapseEntryType;
import org.wso2.carbonstudio.eclipse.esb.core.utils.SynapseFileUtils;
import org.wso2.carbonstudio.eclipse.esb.project.utils.ESBProjectUtils;
import org.wso2.carbonstudio.eclipse.platform.core.exception.ObserverFailedException;
import org.wso2.carbonstudio.eclipse.platform.core.project.model.ProjectDataModel;
import org.wso2.carbonstudio.eclipse.utils.project.ProjectUtils;

public class SequenceModel extends ProjectDataModel {

	private boolean saveAsDynamic = false;
	private String dynamicSeqRegistryPath = "conf:";
	private List<OMElement> availableSeqList;
	private IContainer sequenceSaveLocation;
	private String sequenceName;
	private String onErrorSequence = "";
	private String selectedEP = "";
	private List<OMElement> selectedSeqList;

	
	public Object getModelPropertyValue(String key) {
		Object modelPropertyValue = super.getModelPropertyValue(key);
		if (modelPropertyValue == null) {
			if (key.equals("dynamic.sequence")) {
				modelPropertyValue = isSaveAsDynamic();
			} else if (key.equals("reg.path")) {
				modelPropertyValue = getDynamicSeqRegistryPath();
			} else if (key.equals("save.file")) {
				modelPropertyValue = getSequenceSaveLocation();
			}

		}
		return modelPropertyValue;
	}

	
	public boolean setModelPropertyValue(String key, Object data) throws ObserverFailedException {
		boolean returnResult = super.setModelPropertyValue(key, data);
		selectedSeqList = new ArrayList<OMElement>();
		if (key.equals("import.file")) {
			if (getImportFile() != null && !getImportFile().toString().equals("")) {
				try {
					List<OMElement> availableSequences = new ArrayList<OMElement>();
					if (SynapseFileUtils.isSynapseConfGiven(getImportFile(),
					                                        SynapseEntryType.SEQUENCE)) {
						availableSequences =
						        SynapseFileUtils.synapseFileProcessing(getImportFile().getPath(),
						                                               SynapseEntryType.SEQUENCE);
						setAvailableSeqList(availableSequences);
					} else {
						setAvailableSeqList(new ArrayList<OMElement>());
					}
					returnResult = false;
				} catch (OMException e) {
					e.printStackTrace();
				} catch (XMLStreamException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} else if (key.equals("dynamic.sequence")) {
			setSaveAsDynamic((Boolean) data);
		} else if (key.equals("reg.path")) {
			if (data.toString().equals(RegOptionsList.CONST_GOVERNANCE)) {
				data = "gov:";
				returnResult = true;
			} else if (data.toString().equals(RegOptionsList.CONST_CONFIG)) {
				data = "conf:";
				returnResult = true;
			}
			setDynamicSeqRegistryPath(data.toString());
		} else if (key.equals("save.file")) {
			setSequenceSaveLocation((IContainer) data);
		} else if (key.equals("create.esb.prj")) {
			Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			IProject esbProject = ESBProjectUtils.createESBProject(shell);
			setSequenceSaveLocation(esbProject);
			// TODO show wizard to create a esb project
			// get endpoint location of the esb project & set
			// endpointSaveLocation as it is
		}else if(key.equals("sequence.name")){
			setSequenceName(data.toString());
		}else if(key.equals("on.error.sequence")){
			String seqName = ProjectUtils.fileNameWithoutExtension((new File(data.toString())).getName());
			setOnErrorSequence(seqName);
		}else if(key.equals("available.eps")){
			String epName = ProjectUtils.fileNameWithoutExtension((new File(data.toString())).getName());
			setSelectedEP(epName);
		}else if(key.equals("available.sequences")){
			Object[] selectedSequencess = (Object[])data;
			for (Object object : selectedSequencess) {
				if(object instanceof OMElement){
					if(!selectedSeqList.contains((OMElement)object)){
						selectedSeqList.add((OMElement)object);
					}
					
				}
			}
			setSelectedSeqList(selectedSeqList);
		}

		return returnResult;
	}

	public void setSaveAsDynamic(boolean saveAsDynamic) {
		this.saveAsDynamic = saveAsDynamic;
	}

	public boolean isSaveAsDynamic() {
		return saveAsDynamic;
	}

	public void setSequenceSaveLocation(String sequenceSaveLocation) {
		this.setSequenceSaveLocation(ResourcesPlugin.getWorkspace().getRoot()
		        .getContainerForLocation(new Path(sequenceSaveLocation)));
	}

	
	public void setLocation(File location) {
		super.setLocation(location);
		File absolutionPath = getLocation();
		if (getSequenceSaveLocation() == null && absolutionPath != null) {
			IContainer newEndpointSaveLocation =
			        getContainer(absolutionPath, "org.wso2.carbonstudio.eclipse.esb.project.nature");
			setSequenceSaveLocation(newEndpointSaveLocation);
		}
	}

	public static IContainer getContainer(File absolutionPath, String projectNature) {
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		int length = 0;
		IProject currentSelection = null;
		for (IProject project : projects) {
			try {
				if (project.isOpen() && project.hasNature(projectNature)) {
					File projectLocation = project.getLocation().toFile();
					int projectLocationLength = projectLocation.toString().length();
					if (projectLocationLength > length &&
					    projectLocationLength <= absolutionPath.toString().length()) {
						if (absolutionPath.toString().startsWith(projectLocation.toString())) {
							length = projectLocationLength;
							currentSelection = project;
						}
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		IContainer newSequenceSaveLocation = null;
		if (currentSelection != null) {
			String path =
			        absolutionPath.toString().substring(
			                                            currentSelection.getLocation().toFile()
			                                                    .toString().length());

			if (path.equals("")) {
				newSequenceSaveLocation = currentSelection;
			} else {
				newSequenceSaveLocation = currentSelection.getFolder(path);
			}
		}
		return newSequenceSaveLocation;
	}

	public void setAvailableSeqList(List<OMElement> availableSeqList) {
		this.availableSeqList = availableSeqList;
	}

	public List<OMElement> getAvailableSeqList() {
		return availableSeqList;
	}

	public void setSequenceSaveLocation(IContainer sequenceSaveLocation) {
		this.sequenceSaveLocation = sequenceSaveLocation;
	}

	public IContainer getSequenceSaveLocation() {
		return sequenceSaveLocation;
	}

	public void setSequenceName(String sequenceName) {
		this.sequenceName = sequenceName;
	}

	public String getSequenceName() {
		return sequenceName;
	}

	public void setDynamicSeqRegistryPath(String dynamicSeqRegistryPath) {
		this.dynamicSeqRegistryPath = dynamicSeqRegistryPath;
	}

	public String getDynamicSeqRegistryPath() {
		return dynamicSeqRegistryPath;
	}

	public void setOnErrorSequence(String onErrorSequence) {
		if(!onErrorSequence.equals("")){
			onErrorSequence = "onError=\"" + onErrorSequence + "\"";
		}
		this.onErrorSequence = onErrorSequence;
	}

	public String getOnErrorSequence() {
		return onErrorSequence;
	}

	public void setSelectedEP(String selectedEP) {
		if(!selectedEP.equals("")){
			selectedEP = "><send><endpoint key=\"" +  selectedEP + "\" /></send></sequence>";
		}
		this.selectedEP = selectedEP;
	}

	public String getSelectedEP() {
		return selectedEP;
	}

	public void setSelectedSeqList(List<OMElement> selectedSeqList) {
		this.selectedSeqList = selectedSeqList;
	}

	public List<OMElement> getSelectedSeqList() {
		return selectedSeqList;
	}

}
