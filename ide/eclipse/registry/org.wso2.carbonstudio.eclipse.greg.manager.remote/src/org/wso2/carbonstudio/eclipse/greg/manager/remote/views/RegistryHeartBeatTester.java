package org.wso2.carbonstudio.eclipse.greg.manager.remote.views;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.wso2.carbonstudio.eclipse.greg.base.model.RegistryNode;
import org.wso2.carbonstudio.eclipse.greg.base.model.RegistryURLNode;
import org.wso2.carbonstudio.eclipse.greg.manager.remote.utils.Utils;

public class RegistryHeartBeatTester implements Runnable {
	private RegistryURLNode urlNodeList;
	private boolean stop=false;
	private Map<RegistryNode,Boolean> originalState=new HashMap<RegistryNode, Boolean>();;
	private int HEARTBEAT_RATE=5000;
	
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
			if (registryEnabledStateChanged){
				urlNodeList.refreshViewer(true);
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
