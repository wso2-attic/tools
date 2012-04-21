/*
 * Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.greg.base.heartbeat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.swt.widgets.Display;
import org.wso2.developerstudio.eclipse.greg.base.model.RegistryNode;
import org.wso2.developerstudio.eclipse.greg.base.model.RegistryURLNode;
import org.wso2.developerstudio.eclipse.greg.base.util.Utils;

public class RegistryHeartBeatTester implements Runnable {
	private RegistryURLNode urlNodeList;
	private boolean stop=false;
	private Map<RegistryNode,Boolean> originalState=new HashMap<RegistryNode, Boolean>();;
	private static final int HEARTBEAT_RATE=5000;
	
	public RegistryHeartBeatTester(RegistryURLNode urlNodeList) {
		setUrlNodeList(urlNodeList);
	}
	
	public void run() {
		while(!isStop()){
			List<RegistryNode> urlInfoList = urlNodeList.getUrlInfoList();
			boolean registryEnabledStateChanged=false;
			for (RegistryNode registryNode : urlInfoList) {
				registryEnabledStateChanged = registryEnabledStateChanged || validateRegistryNode(registryNode);
			}
			if (registryEnabledStateChanged) {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						urlNodeList.refreshViewer(true);
					}
				});
			}
			try {
				Thread.sleep(HEARTBEAT_RATE);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private boolean validateRegistryNode(RegistryNode registryNode) {
		boolean registryEnabledStateChanged=false;
		boolean currentEnableState = registryNode.isEnabled();
		if (currentEnableState || !originalState.containsKey(registryNode)){
			originalState.put(registryNode, currentEnableState);
		}
		if (!Utils.isValidServerURL(registryNode.getServerUrl())){
			registryNode.setEnabled(false);
		}else{
			if (registryNode.getRegistryUrlInfo().isEnabled()){
				registryNode.setEnabled(true);
			}
		}
		if (currentEnableState!=registryNode.isEnabled()){
			if (registryNode.isEnabled()){
				registryNode.setIterativeRefresh(true);
			}
			registryEnabledStateChanged=true;
		}
		return registryEnabledStateChanged;
	}

	public void setUrlNodeList(RegistryURLNode urlNodeList) {
		this.urlNodeList = urlNodeList;
	}

	public RegistryURLNode getUrlNodeList() {
		return urlNodeList;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public boolean isStop() {
		return stop;
	}

}