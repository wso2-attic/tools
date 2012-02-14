package org.wso2.carbonstudio.eclipse.distribution.project.model;

import org.apache.maven.model.Dependency;
import org.eclipse.core.resources.IProject;

public class NodeData {
	public NodeData(Object obj){
		if(obj instanceof Dependency){
			dependency = (Dependency) obj;
		}
		else if (obj instanceof IProject) {
			project  = (IProject) obj;
			setHaschildren(true);

		}
	}

	public boolean hasChildren() {
		return hasChildren;
	}
	public void setHaschildren(boolean hasChildren) {
		this.hasChildren = hasChildren;
	}
	public Dependency getDependency() {
		return dependency;
	}
	public void setDependency(Dependency dependency) {
		this.dependency = dependency;
		this.project=null;
	}
	public IProject getProject() {
		return project;
	}
	public void setProject(IProject project) {
		this.project = project;
	}
	public void setServerRole(String serverRole) {
		this.serverRole = serverRole;
	}

	public String getServerRole() {
		return serverRole;
	}
	private boolean hasChildren;
	private Dependency dependency;
	private IProject project;
	private String serverRole;
}
