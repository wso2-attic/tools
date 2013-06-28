package org.wso2.developerstudio.appfactory.core.model;

import java.util.List;

public class ErroModel {
	
	private String message;
	private String cause;
	private String Stacrace;
	private Throwable throwable;
	private List<String> resions;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public String getStacrace() {
		return Stacrace;
	}
	public void setStacrace(String stacrace) {
		Stacrace = stacrace;
	}
	public Throwable getThrowable() {
		return throwable;
	}
	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}
	public List<String> getResions() {
		return resions;
	}
	public void setResions(List<String> resions) {
		this.resions = resions;
	}
 

}
