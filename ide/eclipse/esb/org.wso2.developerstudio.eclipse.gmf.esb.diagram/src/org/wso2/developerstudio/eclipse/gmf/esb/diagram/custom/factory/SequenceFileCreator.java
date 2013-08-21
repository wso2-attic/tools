package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.factory;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.wso2.developerstudio.eclipse.artifact.sequence.model.SequenceModel;
import org.wso2.developerstudio.eclipse.artifact.sequence.ui.wizard.SequenceProjectCreationWizard;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;

public class SequenceFileCreator implements IFileCreator{
	private SequenceModel seqModel;
	public SequenceFileCreator (SequenceModel seqModel){
		this.seqModel=seqModel;
	}
	
	public void createSequenceFile() throws Exception{
		SequenceProjectCreationWizard sequenceProjectCreationWizard = new SequenceProjectCreationWizard();
		IProject project = seqModel.getSequenceSaveLocation().getProject();
		sequenceProjectCreationWizard.setProject(project);
		seqModel.setSelectedOption("");
		sequenceProjectCreationWizard.setModel(seqModel);

		if(seqModel.isSaveAsDynamic()){
			sequenceProjectCreationWizard.createDynamicSequenceArtifact(seqModel.getSequenceSaveLocation(),seqModel);
		} else{
			if(!sequenceProjectCreationWizard.createSequenceArtifact(project,seqModel)){
			}
		}
		
		project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
	}
}
