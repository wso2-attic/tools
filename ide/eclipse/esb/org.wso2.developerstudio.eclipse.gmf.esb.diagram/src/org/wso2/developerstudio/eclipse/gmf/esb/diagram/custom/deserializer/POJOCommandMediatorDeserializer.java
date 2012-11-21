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

import java.util.Map;

import org.apache.synapse.mediators.AbstractMediator;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.CommandMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;
import org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence.custom.POJOCommandMediatorExt;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.*;

public class POJOCommandMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, CommandMediator> {

	@Override
	public CommandMediator createNode(IGraphicalEditPart part, AbstractMediator object) {

		Assert.isTrue(object instanceof POJOCommandMediatorExt,
				"Unsupported mediator passed in for deserialization");

		POJOCommandMediatorExt mediator = (POJOCommandMediatorExt) object;
		CommandMediator mediatorModel = (CommandMediator) DeserializerUtils.createNode(part, EsbElementTypes.CommandMediator_3511);
		setElementToEdit(mediatorModel);
		executeSetValueCommand(COMMAND_MEDIATOR__CLASS_NAME, mediator.getPojoClass());
		
		Map<String, String> contextGetterProperties = mediator.getContextGetterProperties();
		Map<String, String> contextSetterProperties = mediator.getContextSetterProperties();
		Map<String, SynapseXPath> messageGetterProperties = mediator.getMessageGetterProperties();
		Map<String, SynapseXPath> messageSetterProperties = mediator.getMessageSetterProperties();
		Map<String, Object> staticSetterProperties = mediator.getStaticSetterProperties();
		
		//TODO : Deserialize getter/setter properties
		
		return mediatorModel;
	}

}
