/*
 * Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
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
package org.wso2.carbonstudio.eclipse.gmf.esb.internal.persistence;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.apache.axiom.om.OMNode;
import org.apache.synapse.SynapseArtifact;
import org.apache.synapse.config.SynapseConfigUtils;
import org.apache.synapse.core.axis2.ProxyService;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.carbonstudio.eclipse.gmf.esb.persistence.EsbNodeTransformer;
import org.wso2.carbonstudio.eclipse.gmf.esb.persistence.TransformationInfo;

/**
 * {@link EsbNodeTransformer} responsible for transforming
 * {@link org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService} model objects into
 * corresponding synapse artifact(s).
 */
public class ProxyServiceTransformer extends AbstractEsbNodeTransformer {
	/**
	 * {@inheritDoc}
	 */
	public void transform(TransformationInfo info, EsbNode subject)
			throws Exception {
		
		
		/*TaskTransformer t=new TaskTransformer();
		t.transform(info, subject);*/
		
		
		
		
		ArrayList<String> transports = new ArrayList<String>();
		List<String> pinnedServers = new ArrayList<String>();
		// Check subject.
		Assert.isTrue(
				subject instanceof org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService,
				"Invalid subject.");
		org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService visualService = (org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService) subject;

		// Check start.
		if (info.getTraversalDirection() == TransformationInfo.TRAVERSAL_DIRECTION_IN) {

			ProxyService proxyService = new org.apache.synapse.core.axis2.ProxyService(
					visualService.getName());

			if (visualService.getServiceGroup() != null) {
				proxyService.setServiceGroup(visualService.getServiceGroup());
			}

			proxyService.setTraceState(visualService.isTraceEnabled() ? 1 : 0);
			proxyService.setWsSecEnabled(visualService.isSecurityEnabled());
			proxyService.setWsRMEnabled(visualService
					.isReliableMessagingEnabled());

			for (String a : visualService.getTransports().split(",")) {
				transports.add(a);
			}

			proxyService.setTransports(transports);
			switch (visualService.getWsdlType()) {
			case INLINE:
				OMNode node = SynapseConfigUtils.stringToOM(visualService.getWsdlXML());
				proxyService.setInLineWSDL(node);
				break;
			case SOURCE_URL:
				proxyService.setWsdlURI(new URI(visualService.getWsdlURL()));
				break;
			case REGISTRY_KEY:
				proxyService.setWSDLKey(visualService.getWsdlKey().getKeyValue());
				break;
			case NONE:
				break;
			}
			String pinnedServerInfo = visualService.getPinnedServers();
			if (pinnedServerInfo != null && !pinnedServerInfo.equals("")) {
				for (String a : pinnedServerInfo.split(",")) {
					pinnedServers.add(a);
				}
			}
			if (pinnedServers.size() > 0)
				proxyService.setPinnedServers(pinnedServers);
			// proxyService.setStatisticsState(visualService.isStatisticsEnabled()?1:0);
			info.getSynapseConfiguration().addProxyService(
					visualService.getName(), proxyService);
			
			//Proxy Service Parameterts.
			for(int i=0;i<visualService.getServiceParameters().size();++i){
			proxyService.addParameter(visualService.getServiceParameters().get(i).getName(), visualService.getServiceParameters().get(i).getValue());
			}
			

			// In sequence.
			SequenceMediator inSequence = new SequenceMediator();
			proxyService.setTargetInLineInSequence(inSequence);

			// Out sequence.
			SequenceMediator outSequence = new SequenceMediator();
			proxyService.setTargetInLineOutSequence(outSequence);

			info.setOriginInSequence(inSequence);
			info.setOriginOutSequence(outSequence);
			info.setParentSequence(inSequence);

			// Transform output data flow.
			doTransform(info, visualService.getOutputConnector());
		} else {
			// Round-trip comlplete, send the message back to client.
			// TODO: Need to verify (either here or in the visual model) that
			// this is not a short-cricuit or an illegal message routing
			// operation (attempting to route one proxy service's messages to
			// another).
			// parentMediator.addChild(new SendMediator());
		}
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}


	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub
		
	}


}
