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

package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.xml.namespace.QName;
import org.apache.axiom.om.OMAttribute;
import org.apache.axiom.om.OMElement;
import org.apache.synapse.Mediator;
import org.apache.synapse.config.xml.AbstractMediatorFactory;
import org.apache.synapse.config.xml.XMLConfigConstants;
import org.apache.synapse.mediators.Value;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.EditorUtils;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.cloudconnector.CloudConnectorDirectoryTraverser;
import org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence.custom.CloudConnectorOperationExt;

public class CloudConnectorOperationExtFactory extends AbstractMediatorFactory{

	protected static final QName CONFIG_REF  = new QName("config-ref");
	
	@Override
	protected Mediator createSpecificMediator(OMElement elem, Properties properties) {		
		CloudConnectorOperationExt cloudConnectorOperationExt = new CloudConnectorOperationExt();			
		OMAttribute configRef = elem.getAttribute(CONFIG_REF);
		if (configRef != null) {
			cloudConnectorOperationExt.setConfigRef(configRef.getAttributeValue());
		}
		String [] splittedRootElement=elem.getQName().getLocalPart().split("\\.");
		String cloudConnectorName="";
		for(int i=0;i<splittedRootElement.length-1;++i){
			if(i==(splittedRootElement.length-2)){
				cloudConnectorName=cloudConnectorName.concat(splittedRootElement[i]);
			}else {
				cloudConnectorName=cloudConnectorName.concat(splittedRootElement[i]+".");
			}
		}
		String operationName=splittedRootElement[splittedRootElement.length-1];		
		cloudConnectorOperationExt.setConnector(cloudConnectorName);
		cloudConnectorOperationExt.setOperation(operationName);
		
		//TODO expression values for params yet to handle.
		Iterator<OMElement> parameters=elem.getChildElements();
		while(parameters.hasNext()) {
			OMElement parameter=(OMElement)parameters.next();
			String paramName=parameter.getQName().getLocalPart();
			String paramValue=parameter.getText();
			cloudConnectorOperationExt.getpName2ExpressionMap().put(paramName, new Value(paramValue));
		}
		
		return cloudConnectorOperationExt;
	}
	
	public List<QName> getTagQNameList() throws Exception {
		ArrayList<QName> tagQNameList = new ArrayList<QName>();
		IContainer cloudConnectorsRoot = EditorUtils.getActiveProject()
				.getFolder("cloudConnectors");
		if(cloudConnectorsRoot.exists()){
			IResource[] directories = cloudConnectorsRoot.members();
			for (int i = 0; i < directories.length; ++i) {
				CloudConnectorDirectoryTraverser directoryTraverser = CloudConnectorDirectoryTraverser
						.getInstance(directories[i].getLocation().toOSString());
				Map<String, String> map = directoryTraverser.getOperationsConnectorComponentNameMap();
				Iterator<String> iterator = map.keySet().iterator();
				while (iterator.hasNext()) {
					String key = iterator.next();
					tagQNameList.add(new QName(XMLConfigConstants.SYNAPSE_NAMESPACE, map.get(key) + "."
							+ key));
				}
			}
		}
		return tagQNameList;
	}

	@Override
	public QName getTagQName() {
		return null;
	}

}
