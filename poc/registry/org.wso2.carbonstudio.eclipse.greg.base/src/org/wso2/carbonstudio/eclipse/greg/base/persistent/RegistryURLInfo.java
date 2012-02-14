package org.wso2.carbonstudio.eclipse.greg.base.persistent;

import java.net.URL;

/**
 * RegistryURLInfo inner class
 * 
 *
 */
public class RegistryURLInfo {
	private URL url;
	private String path;
	private String username;
	private boolean enabled = true;
	private boolean persist = true;

	public void setUrl(URL url) {
		this.url = url;
		if (isPersist()){
			RegistryUrlStore.getInstance().persist();
		}
	}

	public URL getUrl() {
		return url;
	}

	public void setPath(String path) {
		this.path = path;
		if (isPersist()){
			RegistryUrlStore.getInstance().persist();
		}
	}

	public String getPath() {
		return path;
	}

	public void setUsername(String username) {
		this.username = username;
		if (isPersist()){
			RegistryUrlStore.getInstance().persist();
		}
	}

	public String getUsername() {
		return username;
	}

	public void setPersist(boolean persist) {
		this.persist = persist;
	}

	public boolean isPersist() {
		return persist;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
		if (isPersist()){
			RegistryUrlStore.getInstance().persist();
		}
	}

	public boolean isEnabled() {
		return enabled;
	}
}