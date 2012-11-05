/*
 * Copyright 2012 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence.custom;

import org.apache.synapse.util.xpath.SynapseXPath;

public class CallTemplateExtParameter {
	private String parameterName;
	private String parameterValue="";
	private SynapseXPath parameterExpression;
	private ParameterType parameterType = ParameterType.VALUE;
	
	public CallTemplateExtParameter(String parameterName) {
		this.parameterName = parameterName;
	}
	
	public CallTemplateExtParameter(String parameterName,String parameterValue) {
		this.parameterName = parameterName;
		this.parameterValue = parameterValue;
	}
	
	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	public String getParameterName() {
		return parameterName;
	}

	public void setParameterValue(String parameterValue) {
		this.parameterValue = parameterValue;
	}

	public String getParameterValue() {
		return parameterValue;
	}
	
	public void setParameterType(ParameterType parameterType) {
		this.parameterType = parameterType;
	}

	public ParameterType getParameterType() {
		return parameterType;
	}

	public void setParameterExpression(SynapseXPath parameterExpression) {
		this.parameterExpression = parameterExpression;
	}

	public SynapseXPath getParameterExpression() {
		return parameterExpression;
	}

	public enum ParameterType{
		VALUE,EXPRESSION
	}
}
