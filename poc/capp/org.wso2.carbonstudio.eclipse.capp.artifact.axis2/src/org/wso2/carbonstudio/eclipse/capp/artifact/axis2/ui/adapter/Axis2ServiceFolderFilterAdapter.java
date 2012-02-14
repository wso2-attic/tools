/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbonstudio.eclipse.capp.artifact.axis2.ui.adapter;

import org.eclipse.core.resources.IFolder;
import org.eclipse.ui.IActionFilter;

public class Axis2ServiceFolderFilterAdapter implements IActionFilter{

	private static final Object MYOBJECT_TYPE = "axis2Service";

	private static Axis2ServiceFolderFilterAdapter INSTANCE = new Axis2ServiceFolderFilterAdapter();

	private Axis2ServiceFolderFilterAdapter() {}

	public boolean testAttribute(Object target, String name, String value) {
		if (target instanceof IFolder) {
			IFolder obj = (IFolder) target;

			if(MYOBJECT_TYPE.equals(name)) {
				return true;
			}
		}

		return false;

    }
	public static Axis2ServiceFolderFilterAdapter getInstance() {
		return INSTANCE;
	}

}
