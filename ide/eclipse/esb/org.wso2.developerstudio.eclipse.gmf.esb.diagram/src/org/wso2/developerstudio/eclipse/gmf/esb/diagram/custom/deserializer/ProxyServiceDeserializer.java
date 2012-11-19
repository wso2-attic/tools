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

import java.util.List;
import java.util.Map;

import org.apache.synapse.core.axis2.ProxyService;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.MediatorFlow;
import org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceParameter;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.SequenceType;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

public class ProxyServiceDeserializer extends AbstractEsbNodeDeserializer<ProxyService,org.wso2.developerstudio.eclipse.gmf.esb.ProxyService> {

	@Override
	public org.wso2.developerstudio.eclipse.gmf.esb.ProxyService createNode(IGraphicalEditPart editPart,ProxyService object) {
		org.wso2.developerstudio.eclipse.gmf.esb.ProxyService proxy = (org.wso2.developerstudio.eclipse.gmf.esb.ProxyService) DeserializerUtils.createNode(editPart, EsbElementTypes.ProxyService_3001);
		//proxy.setName(object.getName());
		//SetCommand setCmd =null;
		
		SetRequest reqSet = new SetRequest(editPart.getEditingDomain(),
				proxy, EsbPackage.Literals.PROXY_SERVICE__NAME,
				object.getName());
		SetValueCommand operation = new SetValueCommand(reqSet);
		editPart.getDiagramEditDomain().getDiagramCommandStack().execute(new 
				ICommandProxy(operation));
		
		/*setCmd = new SetCommand(TransactionUtil.getEditingDomain(proxy), proxy, EsbPackage.Literals.PROXY_SERVICE__NAME, object.getName());
		if(setCmd.canExecute()){
			setCmd.execute();
		}*/
		/*if(object.getTransports().size()>0){
			proxy.setTransports(DeserializerUtils.join(object.getTransports(), ","));
		}
		
		if(object.getServiceGroup()!=null){
			proxy.setServiceGroup(object.getServiceGroup());
		}
		
		if(object.getPinnedServers().size()>0){
			proxy.setPinnedServers(DeserializerUtils.join(object.getPinnedServers(), ","));
		}
		
		for (Map.Entry<String, Object> entry : object.getParameterMap().entrySet()) {
			ProxyServiceParameter parameter = EsbFactory.eINSTANCE.createProxyServiceParameter();
			parameter.setName(entry.getKey());
			parameter.setValue(entry.getValue().toString());
			proxy.getServiceParameters().add(parameter);
		}*/
		
	/*	setRootInputConnector(proxy.getInputConnector());*/
		MediatorFlow mediatorFlow = proxy.getContainer().getSequenceAndEndpointContainer().getMediatorFlow();
		refreshEditPartMap();
		SequenceMediator inSequence = object.getTargetInLineInSequence();
		if(inSequence!=null){	
			setRootMediatorFlow(mediatorFlow);
		//	EditPart con = (EditPart)getEditpart(proxy).getChildren().get(4);
		/*	for (Object object2 : children) {
				System.out.println("child= " + object2);
			}*/
			
			deserializeSequence((GraphicalEditPart)( (EditPart) ((EditPart)((EditPart)getEditpart(proxy).getChildren().get(4)).getChildren().get(0)).getChildren().get(0)).getChildren().get(0), inSequence, proxy.getOutputConnector());
			//proxy.setInSequenceType(SequenceType.ANONYMOUS);
			setRootMediatorFlow(null);
		} else{
			/*String inSequenceName = object.getTargetInSequence();
			if(inSequenceName!=null){
				if(inSequenceName.startsWith("/") || inSequenceName.startsWith("conf:") || inSequenceName.startsWith("gov:")){
					proxy.setInSequenceType(SequenceType.REGISTRY_REFERENCE);
					RegistryKeyProperty keyProperty = EsbFactory.eINSTANCE.createRegistryKeyProperty();
					keyProperty.setKeyValue(inSequenceName);
					proxy.setInSequenceKey(keyProperty);
				} else{
					proxy.setInSequenceType(SequenceType.NAMED_REFERENCE);
					proxy.setInSequenceName(inSequenceName);
				}
			}*/
		}
		
		/*SequenceMediator outSequence = object.getTargetInLineOutSequence();
		if(outSequence!=null){
			setRootMediatorFlow(mediatorFlow);
			deserializeSequence(mediatorFlow, outSequence, proxy.getInputConnector());
			proxy.setOutSequenceType(SequenceType.ANONYMOUS);
			setRootMediatorFlow(null);
		} else{
			String outSequenceName = object.getTargetOutSequence();
			if(outSequenceName!=null){
				if(outSequenceName.startsWith("/") || outSequenceName.startsWith("conf:") || outSequenceName.startsWith("gov:")){
					proxy.setOutSequenceType(SequenceType.REGISTRY_REFERENCE);
					RegistryKeyProperty keyProperty = EsbFactory.eINSTANCE.createRegistryKeyProperty();
					keyProperty.setKeyValue(outSequenceName);
					proxy.setOutSequenceKey(keyProperty);
				} else{
					proxy.setOutSequenceType(SequenceType.NAMED_REFERENCE);
					proxy.setOutSequenceName(outSequenceName);
				}
			}
		}*/
		
	/*	SequenceMediator faultSequence = object.getTargetInLineFaultSequence();
		if(faultSequence!=null){
			MediatorFlow faultmediatorFlow = proxy.getContainer().getFaultContainer().getMediatorFlow();
			setRootMediatorFlow(faultmediatorFlow);
			deserializeSequence(faultmediatorFlow, faultSequence, proxy.getFaultInputConnector());
			proxy.setFaultSequenceType(SequenceType.ANONYMOUS);
			setRootMediatorFlow(null);
		} else{
			String faultSequenceName = object.getTargetFaultSequence();
			if(faultSequenceName!=null){
				if(faultSequenceName.startsWith("/") || faultSequenceName.startsWith("conf:") || faultSequenceName.startsWith("gov:")){
					proxy.setFaultSequenceType(SequenceType.REGISTRY_REFERENCE);
					RegistryKeyProperty keyProperty = EsbFactory.eINSTANCE.createRegistryKeyProperty();
					keyProperty.setKeyValue(faultSequenceName);
					proxy.setFaultSequenceKey(keyProperty);
				} else{
					proxy.setFaultSequenceType(SequenceType.NAMED_REFERENCE);
					proxy.setFaultSequenceName(faultSequenceName);
				}
			}
		}*/
		
		//addPairMediatorFlow(proxy.getOutputConnector(),proxy.getInputConnector());
		
		//TODO : deserialize other  properties
		
		return proxy;
	}



}
