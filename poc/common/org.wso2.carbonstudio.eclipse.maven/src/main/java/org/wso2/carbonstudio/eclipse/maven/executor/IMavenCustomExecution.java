package org.wso2.carbonstudio.eclipse.maven.executor;

public interface IMavenCustomExecution {
	public void preExecution();
	public void postExecution();
	public void execute();
	public boolean isExecute();
	public void onError(Exception e);
	
}
