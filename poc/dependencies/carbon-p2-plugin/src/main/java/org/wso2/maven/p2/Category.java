package org.wso2.maven.p2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.maven.artifact.factory.ArtifactFactory;
import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.artifact.resolver.ArtifactResolver;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.project.MavenProject;
import org.wso2.maven.p2.generate.utils.MavenUtils;

public class Category {
	
    /**
     * Category Id
     *
     * @parameter
     * @required
     */
	private String id;
	
    /**
     * Category Label
     *
     * @parameter
     */
	private String label;

	/**
     * Category description
     *
     * @parameter
     */
	private String description;
	
    /**
     * List of features contained in the category
     *
     * @parameter
     * @required
     */
	private ArrayList features;

	private ArrayList processedFeatures;

	public ArrayList getFeatures() {
		return features;
	}
	
    public ArrayList getProcessedFeatures(MavenProject project, ArtifactFactory artifactFactory, List remoteRepositories, ArtifactRepository localRepository, ArtifactResolver resolver) throws MojoExecutionException{
        if (processedFeatures != null)
            return processedFeatures;
        if (features == null || features.size() == 0) return null;
        processedFeatures = new ArrayList();
        Iterator iter = features.iterator();
        while (iter.hasNext()) {
            Object obj = iter.next();
            FeatureArtifact f;
            if (obj instanceof FeatureArtifact) {
                f = (FeatureArtifact) obj;
            } else if (obj instanceof String) {
                f = FeatureArtifact.getFeatureArtifact(obj.toString());
            } else
                f = (FeatureArtifact) obj;
            f.resolveVersion(project);
            f.setArtifact(MavenUtils.getResolvedArtifact(f, artifactFactory, remoteRepositories, localRepository, resolver));
            processedFeatures.add(f);
        }
        return processedFeatures;
    }

	public String getId() {
		return id;
	}

	public String getLabel() {
		if (label==null){
			return getId();
		}else{
			return label;
		}
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		if (description==null){
			return getLabel();
		}else{
			return description;
		}
	}
}
