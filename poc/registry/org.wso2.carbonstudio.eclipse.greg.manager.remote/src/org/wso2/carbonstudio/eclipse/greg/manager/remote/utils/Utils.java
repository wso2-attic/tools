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

package org.wso2.carbonstudio.eclipse.greg.manager.remote.utils;

import java.io.File;

public class Utils {
	public static final String READ = "Read";
	public static final String WRITE = "Write";
	public static final String DELETE = "Delete";
	public static final String AUTHORIZE = "Authorize";

	public static void getFolderFileCount(File path,
			ResourceCounter resourceCount) {
		if (!path.exists())
			return;
		if (path.isFile()) {
			resourceCount.fileCount += 1;
			return;
		} else
			resourceCount.folderCount += 1;
		File[] files = path.listFiles();
		for (File file : files) {
			getFolderFileCount(file, resourceCount);
		}
	}

	public static class ResourceCounter {
		public int folderCount = 0;
		public int fileCount = 0;
	}
}
