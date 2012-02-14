package org.wso2.carbonstudio.capp.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.wso2.carbonstudio.capp.model.Artifact;

public class CAppUtils {
	
	public static List<Artifact> retrieveArtifacts(File path){
		return retrieveArtifacts(path, new ArrayList<Artifact>());
	}
	
	public static List<Artifact> retrieveArtifacts(File path, List<Artifact> artifacts){
		if (path.exists()){
			if (path.isFile()){
				Artifact artifact = new Artifact();
				try {
					artifact.fromFile(path);
					if (artifact.getVersion()!=null && artifact.getType()!=null){
						artifact.setSuperArtifact(artifact.getType().equalsIgnoreCase("carbon/application"));
						artifacts.add(artifact);
					}
				} catch (Exception e) {
					//not an artifact
				}
			}else{
				File[] files = path.listFiles();
				for (File file : files) {
					retrieveArtifacts(file, artifacts);
				}
			}
		}
		return artifacts;
	}

	
}
