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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.wso2.carbonstudio.eclipse.capp.artifact.synapse.core.SynapseDependentArtifactExporter.IArtifactOutput;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.ArtifactDependency;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactBundleCreator;

/**
 * A specialization of {@link ArtifactBundleCreator} used to explode synapse
 * configuration artifacts into multiple artifacts at car generation.
 */
public class SynapseArtifactBundleCreator extends ArtifactBundleCreator {
	/**
	 * Name of the temporary working directory.
	 */
	private static final String WORK_DIR_NAME = ".org.wso2.carbonstudio.eclipse.capp.artifact.synapse.temp";

	/**
	 * Dependent artifact exporter factory.
	 */
	private SynapseDependentArtifactExporterFactory exporterFactory;

	/**
	 * Creates a new {@link SynapseArtifactBundleCreator} instance.
	 * 
	 * @param artifact
	 *            synapse configuration artifact.
	 * @param location
	 *            parent directory which contains the synapse artifact.
	 * @param parentApplication
	 */
	public SynapseArtifactBundleCreator(Artifact artifact, File location, String parentApplication) {
		super(artifact, location, parentApplication);
		exporterFactory = SynapseDependentArtifactExporterFactory.getInstance();
	}

	/**
	 * {@inheritDoc}
	 */
	public File getBundle() throws Exception {
		throw new RuntimeException("Method not implemented.");
	}

	/**
	 * {@inheritDoc}
	 */
	public Map<Artifact,File> getArtifactContent() throws Exception {
		throw new RuntimeException("Method not implemented.");
	}

	/**
	 * {@inheritDoc}
	 */
	public Map<Artifact,File> getArtifactContent(File contentLocation) throws Exception {
		// Where dependent artifacts are to be deployed into.
		File targetDir = contentLocation.getParentFile();

		// Clone the original synapse artifact because we do not want to make
		// any changes to it.
		Artifact synapseArtifactClone = getArtifact().clone();

		// This is a work around for cloning issues.
		List<ArtifactDependency> dependencies = new ArrayList<ArtifactDependency>();
		dependencies.addAll(getArtifact().getDependencies());
		synapseArtifactClone.setDependencies(dependencies);
		synapseArtifactClone.setCarTimestamp(getArtifact().getCarTimestamp());

		// Reference to original synapse.xml file.
		File synapseXmlFile = new File(getLocation(), getArtifact().getFile());

		// Export dependents.
		return exportDependentArtifacts(synapseXmlFile, synapseArtifactClone, targetDir);

		// Export the cloned synapse artifact.
//		FileUtils.copyFileToDirectory(synapseXmlFile, contentLocation);
//		File targetArtifactXmlFile = new File(contentLocation, getArtifact().getSource().getName());
//		IOUtils.write(synapseArtifactClone.serialize(), new FileOutputStream(targetArtifactXmlFile));

//		return createArtifactMap(getArtifact(),contentLocation);
	}

	/**
	 * Exports any dependent artifacts that can be extracted from this synapse
	 * configuration artifacts.
	 * 
	 * @param synapseXmlFile
	 *            synapse.xml file.
	 * @param synapseArtifactClone
	 *            clone of the original synapse artifact.
	 * @param targetDir
	 *            location where dependent artifacts are to be exported.
	 * @throws Exception
	 *             if an error is encountered while performing the explode
	 *             operation.
	 */
	private Map<Artifact, File> exportDependentArtifacts(File synapseXmlFile, Artifact synapseArtifactClone, File targetDir)
			throws Exception {
		FileInputStream fis = null;
		IFolder rootWorkDir = null;
		try {
			// Parse the synapse.xml file into an OMDocument.
			fis = new FileInputStream(synapseXmlFile);
			StAXOMBuilder builder = new StAXOMBuilder(fis);
			OMElement documentElement = builder.getDocumentElement();
			documentElement.build();

			// Iterate through all the top level elements looking for sub
			// artifacts that can be extracted.
			Iterator<?> iter = documentElement.getChildElements();
		    Map<Artifact, File> artifacts = null;

			while (iter.hasNext()) {
				OMElement childElement = (OMElement) iter.next();
				SynapseDependentArtifactExporter exporter = exporterFactory.getExporter(childElement.getLocalName());
				if (null != exporter) {
					// Create a working directory only if we have at least one
					// exporter.
					rootWorkDir = (null == rootWorkDir) ? 
							getRootWorkDir(synapseArtifactClone.getSource()) : rootWorkDir;
					IFolder workDir = rootWorkDir.getFolder(UUID.randomUUID().toString());
					try {
						IArtifactOutput artifactContent = exporter.export(childElement, synapseArtifactClone, workDir, targetDir);
						artifacts = createArtifactMap(artifactContent.getArtifact(), artifactContent.getLocation(), artifacts);
					} catch (Exception ex) {
						// TODO: Log the exception & get rid of the stack trace.
					}
				}
			}
			return artifacts;
		} finally {
			// Close file input stream.
			IOUtils.closeQuietly(fis);

			// Clean up the temporary work dir if necessary.
			if (null != rootWorkDir) {
				try {
					rootWorkDir.delete(true, null);
				} catch (CoreException ex) {
					// TODO: Log the exception.
				}
			}
		}
	}

	/**
	 * Creates a temporary working directory to be used for holding intermediate
	 * files.
	 * 
	 * @param resource
	 *            {@link IResource} with respect to which the working directory
	 *            is created.
	 * @return an {@link IFolder} instance referrring to the root work
	 *         directory.
	 * @throws Exception
	 *             if an error is encuntered.
	 */
	private IFolder getRootWorkDir(IResource resource) throws Exception {
		IFolder rootWorkDir = resource.getProject().getFolder(WORK_DIR_NAME);
		if (!rootWorkDir.exists()) {
			rootWorkDir.create(true, true, null);
		}
		return rootWorkDir;
	}
}
