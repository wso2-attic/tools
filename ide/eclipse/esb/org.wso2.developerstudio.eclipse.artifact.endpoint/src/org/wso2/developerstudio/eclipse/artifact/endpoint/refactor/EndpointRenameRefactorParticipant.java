package org.wso2.developerstudio.eclipse.artifact.endpoint.refactor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.RenameArguments;
import org.eclipse.ltk.core.refactoring.participants.RenameParticipant;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class EndpointRenameRefactorParticipant extends RenameParticipant {
	private IFile originalFile;
	private String changedFileName;
	private IProject esbProject;
	private static List<String> skipList;

	@Override
    public RefactoringStatus checkConditions(IProgressMonitor arg0, CheckConditionsContext arg1)
                                                                                                throws OperationCanceledException {
		if (originalFile != null) {
			List<String> matchinFilesList = new ArrayList<String>();			
			skipList=new ArrayList<String>();
			skipList.add("target");
			skipList.add("bin");
			skipList.add(".svn");
			
			FileUtils.getAllExactMatchingFiles(esbProject.getLocation().toOSString(),
			                                   changedFileName.substring(0,
			                                                             changedFileName.lastIndexOf(".")),
			                                   changedFileName.substring(changedFileName.lastIndexOf(".") + 1),
			                                   matchinFilesList,skipList);

			if (!matchinFilesList.isEmpty()) {
				return RefactoringStatus.createFatalErrorStatus("An ESB Artifact already exist with the same name " +
				                                                changedFileName +
				                                                " in the project " +
				                                                esbProject.getName());
			} else if (changedFileName.substring(0, changedFileName.lastIndexOf("."))
			                          .equalsIgnoreCase(esbProject.getName())) {
				return RefactoringStatus.createFatalErrorStatus("You are trying to rename your ESB Artifact to have the project name.");
			}

			return RefactoringStatus.createInfoStatus("You are about the rename your ESB Artifact " +
			                                          originalFile.getName() +
			                                          " to " +
			                                          changedFileName);
		}

		return RefactoringStatus.createFatalErrorStatus("You are trying to rename a different resource than a file");
    }

	@Override
    public Change createChange(IProgressMonitor arg0) throws CoreException,
                                                     OperationCanceledException {
		
//		This has to be a composite change since we have several changes to be made with in the same change.
		
		// Change the meta data file
		// change the pom file
		// change/update all the references to this endpoint
		CompositeChange endpointChange=new CompositeChange("Endpoint Artifact Rename");
		String originalFileNamewithExtension = originalFile.getName();
		EndpointArtifactFileChange endpointArtifactFileChange = new EndpointArtifactFileChange("Renaming ESB Artifact "+originalFile.getName().substring(0,originalFile.getName().length()-originalFile.getFileExtension().length()), originalFile, originalFileNamewithExtension.substring(0,originalFileNamewithExtension.length()-4),changedFileName.substring(0,changedFileName.length()-4), -1, -1);
		endpointChange.add(endpointArtifactFileChange);
		
		String osString = originalFile.getLocation().toOSString();
		IProject project = originalFile.getProject();
		String osString2 = project.getLocation().toOSString();
		String substring = osString.substring(0, osString.length()-(originalFile.getName()).length());
		substring=substring.substring(osString2.length()+1);
		IFile endpointFile=project.getFile(substring+changedFileName);
		
		endpointChange.add(new EndpointArtifactFileChange("Renaming ESB Artifact 1"+originalFile.getName().substring(0,originalFile.getName().length()-originalFile.getFileExtension().length()), endpointFile, originalFileNamewithExtension.substring(0,originalFileNamewithExtension.length()-4),changedFileName.substring(0,changedFileName.length()-4),endpointArtifactFileChange.getEndpointReplaceOffset(), endpointArtifactFileChange.getEndpointReplaceLength()));
//		change.add(new ESBMetaDataFileChange("Meta data file", esbProject.getFile("pom.xml")));
		
//		change.add(new RenameResourceChange(originalFile.getLocation(), changedFileName));
		return endpointChange;
    }

	@Override
    public String getName() {
	    return "EndpointArtifactRenameParticipant";
    }

	@Override
    protected boolean initialize(Object arg0) {
		if (arg0 instanceof IFile) {
			originalFile = (IFile) arg0;
			esbProject = originalFile.getProject();
			RenameArguments arguments = getArguments();
			changedFileName = arguments.getNewName();
			return true;
		}
		return false;
    }

}
