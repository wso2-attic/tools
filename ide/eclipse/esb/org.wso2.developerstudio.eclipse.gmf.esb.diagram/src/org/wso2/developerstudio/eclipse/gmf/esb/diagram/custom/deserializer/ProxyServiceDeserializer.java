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

import org.apache.synapse.core.axis2.ProxyService;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.MediatorFlow;

public class ProxyServiceDeserializer extends AbstractEsbNodeDeserializer<ProxyService,org.wso2.developerstudio.eclipse.gmf.esb.ProxyService> {

	@Override
	public org.wso2.developerstudio.eclipse.gmf.esb.ProxyService createNode(ProxyService object) {
		org.wso2.developerstudio.eclipse.gmf.esb.ProxyService proxy = EsbFactory.eINSTANCE.createProxyService();
		proxy.setName(object.getName());
		proxy.setTransports(join(object.getTransports(), ","));
		
		SequenceMediator inSequence = object.getTargetInLineInSequence();
		MediatorFlow mediatorFlow = proxy.getContainer().getSequenceAndEndpointContainer().getMediatorFlow();
		deserializeSequence(mediatorFlow, inSequence, proxy.getOutputConnector());
		
		SequenceMediator outSequence = object.getTargetInLineOutSequence();
		deserializeSequence(mediatorFlow, outSequence, proxy.getInputConnector());
		
		SequenceMediator faultSequence = object.getTargetInLineFaultSequence();
		MediatorFlow faultmediatorFlow = proxy.getContainer().getFaultContainer().getMediatorFlow();
		deserializeSequence(faultmediatorFlow, faultSequence, proxy.getFaultInputConnector());
		
		//TODO : deserialize other mediator sequences and properties
		
		return proxy;
	}



}
