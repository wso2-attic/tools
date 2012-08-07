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

package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.ext.POJOCommandMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.CommandMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence.custom.DummyPOJOClass;
import org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence.custom.MediatorSerializerRegister;
import org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence.custom.POJOCommandMediatorExt;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class CommandMediatorTransformer extends AbstractEsbNodeTransformer{
	
	static{
		//TODO: move this to common location
		MediatorSerializerRegister.registerSerializers();
	}

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		// TODO Auto-generated method stub
		information.getParentSequence().addChild(createCommandMediator(information,subject));
		// Transform the Command mediator output data flow path.
		doTransform(information,
				((CommandMediator) subject).getOutputConnector());	
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub
		sequence.addChild( createCommandMediator(information,subject));
		doTransformWithinSequence(information,((CommandMediator) subject).getOutputConnector().getOutgoingLink(),sequence);	

	}

	private POJOCommandMediator createCommandMediator(TransformationInfo information,EsbNode subject) throws Exception{
		// Check subject.
		Assert.isTrue(subject instanceof CommandMediator, "Invalid subject.");
		CommandMediator visualCommand = (CommandMediator) subject;
		String className = visualCommand.getClassName();
		POJOCommandMediatorExt commandMediator =new POJOCommandMediatorExt(className);
		Class clazz= DummyPOJOClass.class;
		
		//TODO: serialize setter/getter properties
		
		commandMediator.setCommand(clazz);
		return commandMediator;
	}


}
