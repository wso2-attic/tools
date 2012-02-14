package org.wso2.carbonstudio.eclipse.maven.internal.executor.impl;

import org.wso2.carbonstudio.eclipse.maven.executor.IMavenDefiniton;
import org.wso2.carbonstudio.eclipse.maven.executor.MavenExecuteMode;

public abstract class MavenDefinitionImpl implements IMavenDefiniton{

	private String artifactId;
	private String groupId;
	private String version;
	private MavenExecuteMode executeMode;

	public MavenDefinitionImpl(String groupId, String artifactId, String version) {
		setGroupId(groupId);
		setArtifactId(artifactId);
		setVersion(version);
	}

	@Override
	public String getArtifactId() {
		return artifactId;
	}

	@Override
	public String getGroupId() {
		return groupId;
	}

	@Override
	public String getVersion() {
		return version;
	}

	@Override
	public MavenExecuteMode getExecuteMode() {
		return executeMode;
	}

	@Override
	public String getMavenArtifactId() {
		return getGroupId()+":"+getArtifactId()+":"+getVersion();
	}
	
	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public void setExecuteMode(MavenExecuteMode executeMode) {
		this.executeMode = executeMode;
	}
}