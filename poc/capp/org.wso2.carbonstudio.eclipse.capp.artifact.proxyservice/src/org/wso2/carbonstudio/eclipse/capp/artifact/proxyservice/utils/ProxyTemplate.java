package org.wso2.carbonstudio.eclipse.capp.artifact.proxyservice.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.osgi.framework.Bundle;

public class ProxyTemplate {

	private String name;
	private String id;
	private String templateFileName;
	private Bundle templateBundle;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setTemplateBundle(Bundle templateBundle) {
		this.templateBundle = templateBundle;
	}
	public Bundle getTemplateBundle() {
		return templateBundle;
	}
	public void setTemplateFileName(String templateFileName) {
		this.templateFileName = templateFileName;
	}
	public String getTemplateFileName() {
		return templateFileName;
	}
	
	public InputStream getTemplateDataStream() throws IOException{
		URL resource = getTemplateUrl();
		return resource.openStream();
	}
	public URL getTemplateUrl() {
		return getTemplateBundle().getResource(getTemplateFileName());
	}
}
