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

import java.util.Arrays;
import java.util.List;

import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.rest.API;
import org.apache.synapse.rest.Resource;
import org.apache.synapse.rest.dispatch.DispatcherHelper;
import org.apache.synapse.rest.dispatch.URITemplateHelper;
import org.apache.synapse.rest.dispatch.URLMappingHelper;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.APIResource;
import org.wso2.developerstudio.eclipse.gmf.esb.ApiResourceUrlStyle;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.MediatorFlow;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.SequenceType;
import org.wso2.developerstudio.eclipse.gmf.esb.SynapseAPI;

/**
 * Synapse API deserializer
 */
public class APIDeserializer extends AbstractEsbNodeDeserializer<API, SynapseAPI> {

	@Override
	public SynapseAPI createNode(IGraphicalEditPart part,API api) {
		SynapseAPI synapseAPI = EsbFactory.eINSTANCE.createSynapseAPI();
		synapseAPI.setApiName(api.getAPIName());
		synapseAPI.setContext(api.getContext());
		if (api.getHost() != null) {
			synapseAPI.setHostName(api.getHost());
		}
		if (api.getPort() > 0) {
			synapseAPI.setPort(api.getPort());
		}
		Resource[] resources = api.getResources();
		for (int i = 0; i < resources.length; i++) {
			
			APIResource resource = EsbFactory.eINSTANCE.createAPIResource();
			
			List<String> methodList = Arrays.asList(resources[i].getMethods());
			resource.setAllowGet(methodList.contains("GET"));
			resource.setAllowPost(methodList.contains("POST"));
			resource.setAllowOptions(methodList.contains("OPTIONS"));
			resource.setAllowDelete(methodList.contains("DELETE"));
			resource.setAllowPut(methodList.contains("PUT"));
			
			DispatcherHelper dispatcherHelper = resources[i].getDispatcherHelper();
			if(dispatcherHelper instanceof URITemplateHelper){
				URITemplateHelper helper = (URITemplateHelper) dispatcherHelper;
				resource.setUrlStyle(ApiResourceUrlStyle.URI_TEMPLATE);
				resource.setUriTemplate(helper.getUriTemplate().toString());
			} else if(dispatcherHelper instanceof URLMappingHelper){
				URLMappingHelper helper = (URLMappingHelper) dispatcherHelper; 
				resource.setUrlStyle(ApiResourceUrlStyle.URL_MAPPING);
				resource.setUrlMapping(helper.getString());
			} else{
				resource.setUrlStyle(ApiResourceUrlStyle.NONE);
			}
			
			setRootInputConnector(resource.getInputConnector());
			MediatorFlow mediatorFlow = resource.getContainer().getSequenceAndEndpointContainer().getMediatorFlow();
			setRootMediatorFlow(mediatorFlow);
			
			SequenceMediator inSequence = resources[i].getInSequence();
			if(inSequence!=null){	
				setRootMediatorFlow(mediatorFlow);
				deserializeSequence(null, inSequence, resource.getOutputConnector());
				resource.setInSequenceType(SequenceType.ANONYMOUS);
				setRootMediatorFlow(null);
			} else{
				String inSequenceName = resources[i].getInSequenceKey();
				if(inSequenceName!=null){
					if(inSequenceName.startsWith("/") || inSequenceName.startsWith("conf:") || inSequenceName.startsWith("gov:")){
						resource.setInSequenceType(SequenceType.REGISTRY_REFERENCE);
						RegistryKeyProperty keyProperty = EsbFactory.eINSTANCE.createRegistryKeyProperty();
						keyProperty.setKeyValue(inSequenceName);
						resource.setInSequenceKey(keyProperty);
					} else{
						resource.setInSequenceType(SequenceType.NAMED_REFERENCE);
						resource.setInSequenceName(inSequenceName);
					}
				}
			}
			
			SequenceMediator outSequence = resources[i].getOutSequence();
			if(outSequence!=null){
				setRootMediatorFlow(mediatorFlow);
				deserializeSequence(null, outSequence, resource.getInputConnector());
				resource.setOutSequenceType(SequenceType.ANONYMOUS);
				setRootMediatorFlow(null);
			} else{
				String outSequenceName = resources[i].getOutSequenceKey();
				if(outSequenceName!=null){
					if(outSequenceName.startsWith("/") || outSequenceName.startsWith("conf:") || outSequenceName.startsWith("gov:")){
						resource.setOutSequenceType(SequenceType.REGISTRY_REFERENCE);
						RegistryKeyProperty keyProperty = EsbFactory.eINSTANCE.createRegistryKeyProperty();
						keyProperty.setKeyValue(outSequenceName);
						resource.setOutSequenceKey(keyProperty);
					} else{
						resource.setOutSequenceType(SequenceType.NAMED_REFERENCE);
						resource.setOutSequenceName(outSequenceName);
					}
				}
			}
			
			SequenceMediator faultSequence = resources[i].getFaultSequence();
			if(faultSequence!=null){
				MediatorFlow faultmediatorFlow = resource.getContainer().getFaultContainer().getMediatorFlow();
				setRootMediatorFlow(faultmediatorFlow);
				deserializeSequence(null, faultSequence, resource.getFaultInputConnector());
				resource.setFaultSequenceType(SequenceType.ANONYMOUS);
				setRootMediatorFlow(null);
			} else{
				String faultSequenceName = resources[i].getFaultSequenceKey();
				if(faultSequenceName!=null){
					if(faultSequenceName.startsWith("/") || faultSequenceName.startsWith("conf:") || faultSequenceName.startsWith("gov:")){
						resource.setFaultSequenceType(SequenceType.REGISTRY_REFERENCE);
						RegistryKeyProperty keyProperty = EsbFactory.eINSTANCE.createRegistryKeyProperty();
						keyProperty.setKeyValue(faultSequenceName);
						resource.setFaultSequenceKey(keyProperty);
					} else{
						resource.setFaultSequenceType(SequenceType.NAMED_REFERENCE);
						resource.setFaultSequenceName(faultSequenceName);
					}
				}
			}
			
			addPairMediatorFlow(resource.getOutputConnector(),resource.getInputConnector());

			synapseAPI.getResources().add(resource);
		}
		
		return synapseAPI;
	}

}
