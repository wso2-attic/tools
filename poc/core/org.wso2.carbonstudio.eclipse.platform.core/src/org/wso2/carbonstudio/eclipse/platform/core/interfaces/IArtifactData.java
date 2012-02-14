/*
 * Copyright (c) 2011, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbonstudio.eclipse.platform.core.interfaces;

/**
 * Contains the information about a defined artifact
 * @author saminda
 *
 */
public interface IArtifactData {
	
	/**
	 * Return the unique id which represents the artifact
	 * @return
	 */
	public String getId();
	
	/**
	 * Name of the artifact
	 * @return
	 */
	public String getName();
	
	/**
	 * Eclipse project nature for the artifact project
	 * @return
	 */
	public String getNatureId();
	
	/**
	 * The filename extension of the final build output of the artifact
	 * @return
	 */
	public String getExtension();
}
