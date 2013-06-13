/*
 * Copyright WSO2, Inc. (http://wso2.com)
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

import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.*;

import org.apache.synapse.message.store.MessageStore;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

/**
 * Deserializes a message-store configuration to a graphical message-Store object
 */
public class MessageStoreDeserializer
		extends
		AbstractEsbNodeDeserializer<MessageStore, org.wso2.developerstudio.eclipse.gmf.esb.MessageStore> {

	@Override
	public org.wso2.developerstudio.eclipse.gmf.esb.MessageStore createNode(
			IGraphicalEditPart part, MessageStore store) {
		org.wso2.developerstudio.eclipse.gmf.esb.MessageStore messageStore = (org.wso2.developerstudio.eclipse.gmf.esb.MessageStore) DeserializerUtils
				.createNode(part, EsbElementTypes.MessageStore_3700);
		setElementToEdit(messageStore);
		
		executeSetValueCommand(MESSAGE_STORE__STORE_NAME,messageStore.getStoreName());
		
		//TODO: implement parameter deserializetion 
		
		return messageStore;
	}

}
