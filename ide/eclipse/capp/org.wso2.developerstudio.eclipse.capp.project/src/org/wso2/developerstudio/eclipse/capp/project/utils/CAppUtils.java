/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.eclipse.capp.project.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.wso2.developerstudio.eclipse.capp.core.artifacts.ICAppArtifactHandler;
import org.wso2.developerstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.developerstudio.eclipse.capp.core.artifacts.manager.ICAppArtifactManager;
import org.wso2.developerstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.developerstudio.eclipse.capp.core.manifest.ArtifactDependency;
import org.wso2.developerstudio.eclipse.capp.core.manifest.Artifacts;
import org.wso2.developerstudio.eclipse.capp.core.utils.ArtifactBundleCreator;
import org.wso2.developerstudio.eclipse.capp.project.Activator;
import org.wso2.developerstudio.eclipse.capp.project.manager.CAppArtifactManager;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.utils.archive.ArchiveManipulator;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;

public class CAppUtils {
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private static void collectDependencies(List<Artifact> dependentArtifacts, Artifact artifact, Artifact superArtifact, boolean stratosEnabled){
		if (dependentArtifacts.contains(artifact) || artifact==null){
			return;
		}
		if(!stratosEnabled){
			if (superArtifact!=artifact) {
                dependentArtifacts.add(artifact);
            }
			List<ArtifactDependency> dependencies = artifact.getDependencies();
			for (ArtifactDependency artifactDependency : dependencies) {
				if (!artifactDependency.isInclude()) {
					Artifact connectingArtifact = artifactDependency.getConnectingArtifact();
					if (!dependentArtifacts.contains(connectingArtifact)){
						collectDependencies(dependentArtifacts, connectingArtifact, superArtifact, stratosEnabled);
					}
				}
			}
		}else{
			if (superArtifact!=artifact) {
				ICAppArtifactHandler artifactHandler = CAppEnvironment.getcAppManager().getArtifactHandler(artifact);
				if(artifactHandler.isStratosEnabled()){
					dependentArtifacts.add(artifact);
				}
				
			}
			List<ArtifactDependency> dependencies = artifact.getDependencies();
			for (ArtifactDependency artifactDependency : dependencies) {
				if (!artifactDependency.isInclude()) {
					Artifact connectingArtifact = artifactDependency.getConnectingArtifact();
					ICAppArtifactHandler connectingArtifactHandler = CAppEnvironment.getcAppManager().getArtifactHandler(connectingArtifact);
					if(connectingArtifactHandler.isStratosEnabled()){
						if (!dependentArtifacts.contains(connectingArtifact)){
							collectDependencies(dependentArtifacts, connectingArtifact, superArtifact, stratosEnabled);
						}
					}
				}
			}
		}
	}
	
	private static String generateTimestamp() {
		Calendar cal = Calendar.getInstance();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
	    return sdf.format(cal.getTime());
    }
	
	public static File generateCAR(String savePath, IProject selectedProject, boolean stratosEnabled) throws Exception, IOException {
		ICAppArtifactManager manager = CAppEnvironment.getcAppManager();
		Artifact superArtifact = manager.getSuperArtifact(selectedProject);
		superArtifact=superArtifact.cloneData();
//		P2RepoGenerator p2RepoGenerator = new P2RepoGenerator();
		List<Artifact> selectedArtifacts = new ArrayList<Artifact>();
		collectDependencies(selectedArtifacts, superArtifact, superArtifact, stratosEnabled);
		String timestamp=generateTimestamp();
		for (Artifact artifact : selectedArtifacts) {
			artifact.setCarTimestamp(timestamp);
	        if (!superArtifact.isDependencyPresent(artifact)){
		    	ArtifactDependency artifactDependency = new ArtifactDependency(superArtifact, artifact);
		    	artifactDependency.setInclude(false);
		    	superArtifact.getDependencies().add(artifactDependency);
	        }
        }
		superArtifact.getDependencies().clear();
		Artifacts artifactsModel = new Artifacts();
		File tmpCARFolder = FileUtils.createTempDirectory();
		ArchiveManipulator archiveManipulator = new ArchiveManipulator();
		for (Artifact artifact : selectedArtifacts) {
	        File artifactFolder=new File(tmpCARFolder,artifact.getName()+"_"+artifact.getTimestampedVersion());
	        ICAppArtifactHandler artifactHandler = CAppEnvironment.getcAppManager().getArtifactHandler(artifact);
	        Map<Artifact, File> artifactContentMap;
	        if (artifactHandler!=null) {
	        	artifactContentMap = artifactHandler.createArtifactContent(artifact.getSource().getParent().getLocation().toFile(), artifact, artifactFolder);
	        }else{
	        	artifactContentMap = new ArtifactBundleCreator(artifact, artifact.getSource().getParent().getLocation().toFile(), superArtifact.getName()).getArtifactContent(artifactFolder);
	        }
	        if (artifactContentMap!=null){
    	        for (Artifact a : artifactContentMap.keySet()) {
    	            ArtifactDependency dependencyForArtifact = superArtifact.getDependencyForArtifact(a);
    	            superArtifact.getDependencies().add(dependencyForArtifact);
                }
	        }
		}

		artifactsModel.getArtifacts().add(superArtifact);
		artifactsModel.toFile(new File(tmpCARFolder, "artifacts.xml"));
		File carFile = getCARFileName(savePath, superArtifact);
		archiveManipulator.archiveDir(carFile.toString(), tmpCARFolder.toString());
		return carFile;
	}
	
	public static File getCARFileName(String savePath, IProject project){
		return getCARFileName(new File(savePath), project);
	}
	 
	public static File getCARFileName(File savePath, IProject project){
		Artifact superArtifact;
        try {
	        superArtifact = CAppArtifactManager.getInstance().getSuperArtifact(project);
        } catch (Exception e) {
	        log.error(e);
	        return null;
        }
		return getCARFileName(savePath, superArtifact);
	}

	public static File getCARFileName(String savePath, Artifact superArtifact){
		return getCARFileName(new File(savePath), superArtifact);		
	}

	public static File getCARFileName(File savePath, Artifact superArtifact){
		return new File(savePath, superArtifact.getName() + "-" + superArtifact.getVersion() + ".car");		
	}
	
	public static boolean isCAppProject(IProject project){
		return CAppArtifactManager.getInstance().isCAppProject(project);
	}
}
