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
import java.util.List;

import org.apache.synapse.mediators.AbstractMediator;
import org.apache.synapse.mediators.eip.Target;
import org.eclipse.core.runtime.Assert;
import org.wso2.developerstudio.eclipse.gmf.esb.CloneMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.CloneTarget;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.TargetEndpointType;
import org.wso2.developerstudio.eclipse.gmf.esb.TargetSequenceType;


public class CloneMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, CloneMediator> {

	public CloneMediator createNode(AbstractMediator mediator) {
		
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.eip.splitter.CloneMediator, "Invalid Mediator.");
		
		org.apache.synapse.mediators.eip.splitter.CloneMediator cloneMediator = (org.apache.synapse.mediators.eip.splitter.CloneMediator)mediator;
		
		CloneMediator vishualClone = EsbFactory.eINSTANCE.createCloneMediator();
		
		vishualClone.setCloneID(cloneMediator.getId());
		
		vishualClone.setSequentialMediation(cloneMediator.isSequential());
		
		vishualClone.setContinueParent(cloneMediator.isContinueParent());
		
		//Configuring clone targets
		
		List<CloneTarget> visualCloneTargetList = new ArrayList<CloneTarget>();
		
		for(Target target :cloneMediator.getTargets() ) {
			
			CloneTarget vishualTarget = EsbFactory.eINSTANCE.createCloneTarget();
			
			vishualTarget.setToAddress(target.getToAddress());
			
			vishualTarget.setSoapAction(target.getSoapAction());
			
			
			if(target.getSequence() != null){
				
				vishualTarget.setSequenceType(TargetSequenceType.ANONYMOUS);
				
				//TODO how to proceed ?
				
			}else if(target.getSequenceRef() != null && !target.getSequenceRef().equals("")){
				
				vishualTarget.setSequenceType(TargetSequenceType.REGISTRY_REFERENCE);
				
				RegistryKeyProperty regkey = EsbFactory.eINSTANCE.createRegistryKeyProperty();
				regkey.setKeyValue(target.getSequenceRef());
				
				vishualTarget.setSequenceKey(regkey);
				
			}
			
			if(target.getEndpoint() != null){
				
				vishualTarget.setEndpointType(TargetEndpointType.ANONYMOUS);
				
				//TODO how to proceed ?
				
			}else if (target.getEndpointRef() != null && target.getEndpointRef().equals("")) {
				
				RegistryKeyProperty regkey = EsbFactory.eINSTANCE.createRegistryKeyProperty();
				regkey.setKeyValue(target.getEndpointRef());
				
				vishualTarget.setEndpointKey(regkey);
			}
			
			visualCloneTargetList.add(vishualTarget);
			
		}
		
		vishualClone.getTargets().addAll(visualCloneTargetList);
		
		return vishualClone;
	}

}