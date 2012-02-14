package org.wso2.carbonstudio.eclipse.maven.internal.executor.impl;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.wso2.carbonstudio.eclipse.maven.executor.IMavenArchetypeDefinition;
import org.wso2.carbonstudio.eclipse.maven.executor.IMavenCustomExecution;
import org.wso2.carbonstudio.eclipse.maven.executor.IMavenDependencyDefinition;

public class MavenArchetypeDefinition extends MavenDefinitionImpl implements
		IMavenArchetypeDefinition {
	private URL archeTypePluginFile;
	private Map<String, String> archeTypeCreateProperties;
	private IMavenCustomExecution customExecution;
	private Map<String, String> eclipseIDEProperties;
	private List<IMavenDependencyDefinition> archeTypeDependencies;
	private Map<String,String> templateList;
	private String name;
	
	public MavenArchetypeDefinition(String groupId, String artifactId,
			String version) {
		super(groupId, artifactId, version);
	}
	
	@Override
	public String getArcheTypeCreateGoal() {
		return "archetype:generate";
	}

	@Override
	public Map<String, String> getArcheTypeCreateProperties() {
		if (archeTypeCreateProperties == null) {
			archeTypeCreateProperties = new HashMap<String, String>();
		}
		return archeTypeCreateProperties;
	}

	@Override
	public URL getArchetypePlugin() {
		try {
			return getArcheTypePluginFile();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public IMavenCustomExecution getCustomExecution() {
		return customExecution;
	}

	@Override
	public String getEclipseIDEGoal() {
		return "eclipse:eclipse";
	}

	@Override
	public Map<String, String> getEclipseIDEProperties() {
		if (eclipseIDEProperties == null) {
			eclipseIDEProperties = new HashMap<String, String>();
		}
		return eclipseIDEProperties;
	}

	public void setArcheTypePluginFile(URL archeTypePluginFile) {
		this.archeTypePluginFile = archeTypePluginFile;
	}

	public URL getArcheTypePluginFile() {
		return archeTypePluginFile;
	}

	public void setCustomExecution(IMavenCustomExecution customExecution) {
		this.customExecution = customExecution;
	}

	private List<IMavenDependencyDefinition>  getDependencies() {
		if (archeTypeDependencies == null) {
			archeTypeDependencies = new ArrayList<IMavenDependencyDefinition>() ;
		}
		return archeTypeDependencies;
	}
	
	public void addArchetypeDependency(IMavenDependencyDefinition...definitions){
		for (IMavenDependencyDefinition definition : definitions) {
			getDependencies().add(definition);
		}
	}

	@Override
	public IMavenDependencyDefinition[] getArcheTypeDependencies() {
		return getDependencies().toArray(new IMavenDependencyDefinition[]{});
	}

	@Override
	public Map<String, String> getTemplateList() {
		if (templateList==null){
			templateList=new HashMap<String, String>();
		}
		return templateList;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
