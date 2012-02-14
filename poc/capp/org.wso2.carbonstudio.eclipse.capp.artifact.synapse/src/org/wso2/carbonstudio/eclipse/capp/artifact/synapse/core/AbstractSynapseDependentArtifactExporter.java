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
package org.wso2.carbonstudio.eclipse.capp.artifact.synapse.core;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMDocument;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.commons.io.IOUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.ICAppArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.ArtifactDependency;

/**
 * An abstract implementation of {@link SynapseDependentArtifactExporter}.
 */
public abstract class AbstractSynapseDependentArtifactExporter implements SynapseDependentArtifactExporter {
	/**
	 * {@inheritDoc}
	 */
	public IArtifactOutput export(OMElement artifactDefinition, Artifact synapseArtifactClone, IFolder workDir, File targetDir)
			throws Exception {
		// Create the temporary directory.
		workDir.create(true, true, null);
		// Serialize the sequence definition.
		String artifactName = getArtifactName(artifactDefinition);		
		File artifactContentFile = new File(workDir.getLocation().toFile(), String.format("%s.xml", artifactName));
		FileOutputStream fos = null;		
		try {			
			fos = new FileOutputStream(artifactContentFile);
			OMFactory omFactory = OMAbstractFactory.getOMFactory();
			OMDocument omDocument = omFactory.createOMDocument();
			omDocument.addChild(artifactDefinition);			
			omDocument.serialize(fos);
		} finally {
			IOUtils.closeQuietly(fos);
		}		
		
		// Create the sequence artifact.
		IFile artifactDescriptorFile = workDir.getFile("artifact.xml");
		Artifact artifact = new Artifact(artifactDescriptorFile);
		artifact.setName(artifactName);
		artifact.setFile(artifactContentFile.getName());
		artifact.setType(getArtifactType());
		artifact.setVersion(synapseArtifactClone.getVersion());
		artifact.setCarTimestamp(synapseArtifactClone.getCarTimestamp());
		artifact.setServerRole(synapseArtifactClone.getServerRole());
		try {
			fos = new FileOutputStream(artifactDescriptorFile.getLocation().toFile());
			IOUtils.write(artifact.serialize(), fos);
		} finally {
			IOUtils.closeQuietly(fos);
		}		
		
		// Perform the export.
		File artifactDeployDir = new File(targetDir, String.format("%s_%s", artifact.getName(), artifact.getTimestampedVersion()));
		ICAppArtifactHandler handler = CAppEnvironment.getcAppManager().getArtifactHandler(artifact);
		handler.createArtifactContent(workDir.getLocation().toFile(), artifact, artifactDeployDir);
		
		// Add a dependency to synapse artifact.
		ArtifactDependency dependency = new ArtifactDependency(synapseArtifactClone, artifact);		
		synapseArtifactClone.getDependencies().add(dependency);
		return new ArtifactOutput(artifact,artifactDeployDir);
	}
	
	/**
	 * Determines the name of the artifact which is to be exported.
	 * 
	 * @param artifactDefinition serialized form of the artifact.
	 * @return artifact name.
	 */
	protected abstract String getArtifactName(OMElement artifactDefinition);
	
	/**
	 * Determines the type of the artifact to be exported.
	 * 
	 * @return artifact type identifier string.
	 */
	protected abstract String getArtifactType();
	
	public class ArtifactOutput implements IArtifactOutput{
		private Artifact artifact;
		private File location;
		public ArtifactOutput(Artifact artifact, File location) {
	        setArtifact(artifact);
	        setLocation(location);
        }
		public void setArtifact(Artifact artifact) {
	        this.artifact = artifact;
        }
		public Artifact getArtifact() {
	        return artifact;
        }
		public void setLocation(File location) {
	        this.location = location;
        }
		public File getLocation() {
	        return location;
        }
	}
}
