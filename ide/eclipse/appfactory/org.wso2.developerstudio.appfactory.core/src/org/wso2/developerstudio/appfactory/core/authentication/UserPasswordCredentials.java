package org.wso2.developerstudio.appfactory.core.authentication;

public class UserPasswordCredentials {
	private final String user;
	private final String password;

	/**
	 * @param user
	 * @param password
	 */
	public UserPasswordCredentials(String user, String password) {
		this.user = user;
		this.password = password;
	}

	/**
	 * @return user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
}
