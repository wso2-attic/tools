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

import org.apache.synapse.config.xml.SwitchCase;
import org.apache.synapse.mediators.AbstractMediator;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.SwitchCaseBranchOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.SwitchCaseContainer;
import org.wso2.developerstudio.eclipse.gmf.esb.SwitchDefaultBranchOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.SwitchDefaultContainer;
import org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.*;

public class SwitchMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, SwitchMediator> {

	@Override
	public SwitchMediator createNode(IGraphicalEditPart part,AbstractMediator mediator) {
		
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.filters.SwitchMediator, "Unsupported mediator passed in for deserialization at "+ this.getClass());
		
		org.apache.synapse.mediators.filters.SwitchMediator switchMediator = (org.apache.synapse.mediators.filters.SwitchMediator)mediator;
		
		org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator VisualSwitchMediator = (org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator) DeserializerUtils.createNode(part, EsbElementTypes.SwitchMediator_3498);
		setElementToEdit(VisualSwitchMediator);
		
		//SwitchMediator vishualSwitch = EsbFactory.eINSTANCE.createSwitchMediator();
		
		//Setting default case 
	    SwitchDefaultBranchOutputConnector defaultSwcboc = EsbFactory.eINSTANCE.createSwitchDefaultBranchOutputConnector();
	    
	    SwitchDefaultContainer defaultContainer = EsbFactory.eINSTANCE.createSwitchDefaultContainer();
		
	    //vishualSwitch.getSwitchContainer().setSwitchDefaultContainer(defaultContainer);
	    executeSetValueCommand(SWITCH_MEDIATOR_CONTAINER__SWITCH_DEFAULT_CONTAINER, defaultContainer);
	    
		//vishualSwitch.setDefaultBranch(defaultSwcboc);
		executeSetValueCommand(SWITCH_MEDIATOR__DEFAULT_BRANCH, defaultSwcboc);
		
		
		if(switchMediator.getCases() != null && !switchMediator.getCases().isEmpty()){
			
			//Iterate through the switch cases.
			for(SwitchCase switchCase : switchMediator.getCases()){
				
				SwitchCaseContainer switchContainer = EsbFactory.eINSTANCE.createSwitchCaseContainer();
				
				SwitchCaseBranchOutputConnector swcboc = EsbFactory.eINSTANCE.createSwitchCaseBranchOutputConnector();
				
				if(switchCase.getRegex() != null && DeserializerUtils.isValidRegex(switchCase.getRegex().toString())){
					
					swcboc.setCaseRegex(switchCase.getRegex().toString());
					
				}
				
				if(switchCase.getCaseMediator().getList() != null && !switchCase.getCaseMediator().getList().isEmpty()){
					
					SequenceMediator sequence = new SequenceMediator();
					sequence.addAll(switchCase.getCaseMediator().getList());
					deserializeSequence(null, sequence,swcboc);
				}
				
				VisualSwitchMediator.getSwitchContainer().getSwitchCaseContainer().add(switchContainer);
				VisualSwitchMediator.getCaseBranches().add(swcboc);
			}

		}
		
		return VisualSwitchMediator;
	}

	

}
