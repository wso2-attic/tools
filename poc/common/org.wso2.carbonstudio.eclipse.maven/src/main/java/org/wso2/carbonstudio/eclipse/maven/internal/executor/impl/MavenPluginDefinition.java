package org.wso2.carbonstudio.eclipse.maven.internal.executor.impl;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.wso2.carbonstudio.eclipse.maven.executor.IMavenCustomExecution;
import org.wso2.carbonstudio.eclipse.maven.executor.IMavenDependencyDefinition;
import org.wso2.carbonstudio.eclipse.maven.executor.IMavenPluginDefinition;

public class MavenPluginDefinition extends MavenDefinitionImpl implements
		IMavenPluginDefinition {
	
	public MavenPluginDefinition(String groupId, String artifactId,
			String version) {
		super(groupId, artifactId, version);
	}

	private IMavenCustomExecution customExecution;
	private String goals;
	private URL pluginFile;
	private List<IMavenDependencyDefinition> pluginDependencies;

	@Override
	public IMavenCustomExecution getCustomExecution() {
		return customExecution;
	}

	@Override
	public String[] getGoals() {
		return goals.split(",");
	}

	@Override
	public URL getPlugin() throws FileNotFoundException {
		return getPluginFile();
	}

	public void setCustomExecution(IMavenCustomExecution customExecution) {
		this.customExecution = customExecution;
	}

	public void setGoals(String goals) {
		this.goals = goals;
	}

	public void setPluginFile(URL pluginFile) {
		this.pluginFile = pluginFile;
	}

	public URL getPluginFile() {
		return pluginFile;
	}
	private List<IMavenDependencyDefinition>  getDependencies() {
		if (pluginDependencies == null) {
			pluginDependencies = new ArrayList<IMavenDependencyDefinition>() ;
		}
		return pluginDependencies;
	}
	
	public void addPluginDependency(IMavenDependencyDefinition...definitions){
		for (IMavenDependencyDefinition definition : definitions) {
			getDependencies().add(definition);
		}
	}

	@Override
	public IMavenDependencyDefinition[] getPluginDependencies() {
		return getDependencies().toArray(new IMavenDependencyDefinition[]{});
	}
}
