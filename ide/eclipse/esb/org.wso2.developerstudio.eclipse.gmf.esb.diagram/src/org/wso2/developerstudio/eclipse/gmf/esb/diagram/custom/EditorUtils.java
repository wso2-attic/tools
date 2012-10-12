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

package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyServiceEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequencesEditPart;

public class EditorUtils {
	
	public static final String DIAGRAM_FILE_EXTENSION = ".esb_diagram";
	public static final String DOMAIN_FILE_EXTENSION = ".esb";
	public static final String SYNAPSE_CONFIG_DIR = "src/main/synapse-config";
	public static final String SYNAPSE_RESOURCE_DIR = "src/main/graphical-synapse-config";
	public static final String SEQUENCE_RESOURCE_DIR = "src/main/graphical-synapse-config/sequences";
	
	public static AbstractInputConnectorEditPart getInputConnector(ShapeNodeEditPart parent){
		for(int i=0;i<parent.getChildren().size();++i){					
			if(parent.getChildren().get(i) instanceof AbstractInputConnectorEditPart){
				return (AbstractInputConnectorEditPart) parent.getChildren().get(i);
			}
		}
		return null;
	}
	
	public static AbstractOutputConnectorEditPart getOutputConnector(ShapeNodeEditPart parent){
		for(int i=0;i<parent.getChildren().size();++i){					
			if(parent.getChildren().get(i) instanceof AbstractOutputConnectorEditPart){
				return (AbstractOutputConnectorEditPart) parent.getChildren().get(i);
			}
		}
		return null;
	}
	
	public static AbstractMediatorInputConnectorEditPart getMediatorInputConnector(ShapeNodeEditPart parent){
		for(int i=0;i<parent.getChildren().size();++i){					
			if(parent.getChildren().get(i) instanceof AbstractMediatorInputConnectorEditPart){
				return (AbstractMediatorInputConnectorEditPart) parent.getChildren().get(i);
			}
		}
		return null;
	}
	
	public static AbstractMediatorOutputConnectorEditPart getMediatorOutputConnector(ShapeNodeEditPart parent){
		for(int i=0;i<parent.getChildren().size();++i){					
			if(parent.getChildren().get(i) instanceof AbstractMediatorOutputConnectorEditPart){
				return (AbstractMediatorOutputConnectorEditPart) parent.getChildren().get(i);
			}
		}
		return null;
	}
	
	public static AbstractEndpointInputConnectorEditPart getEndpointInputConnector(ShapeNodeEditPart parent){
		for(int i=0;i<parent.getChildren().size();++i){					
			if(parent.getChildren().get(i) instanceof AbstractEndpointInputConnectorEditPart){
				return (AbstractEndpointInputConnectorEditPart) parent.getChildren().get(i);
			}
		}
		return null;
	}
	
	public static AbstractEndpointOutputConnectorEditPart getEndpointOutputConnector(ShapeNodeEditPart parent){
		for(int i=0;i<parent.getChildren().size();++i){					
			if(parent.getChildren().get(i) instanceof AbstractEndpointOutputConnectorEditPart){
				return (AbstractEndpointOutputConnectorEditPart) parent.getChildren().get(i);
			}
		}
		return null;
	}
	
	/*
	 * You can get the MediatorEditPart of the entered ConnectorEditPart using this method.
	 */
	public static AbstractMediator getMediator(AbstractConnectorEditPart connector){
		EditPart temp=connector;
		while((temp !=null)&&(!(temp instanceof AbstractMediator))){
			temp=temp.getParent();			
		}
		if(temp instanceof AbstractMediator){
			return (AbstractMediator) temp;
		}
		else{
			return null;
		}
	}
	
	public static AbstractEndpoint getEndpoint(AbstractConnectorEditPart connector){
		EditPart temp=connector;
		while((temp !=null)&&(!(temp instanceof AbstractEndpoint))){
			temp=temp.getParent();			
		}
		if(temp instanceof AbstractEndpoint){
			return (AbstractEndpoint) temp;
		}
		else{
			return null;
		}
	}
	
	public static ProxyServiceEditPart getProxy(AbstractConnectorEditPart connector){
		EditPart temp=connector;
		while((temp !=null)&&(!(temp instanceof ProxyServiceEditPart))){
			temp=temp.getParent();			
		}
		if(temp instanceof ProxyServiceEditPart){
			return (ProxyServiceEditPart) temp;
		}
		else{
			return null;
		}
	}
	
	public static SequencesEditPart getSequence(AbstractConnectorEditPart connector){
		EditPart temp=connector;
		while((temp !=null)&&(!(temp instanceof SequencesEditPart))){
			temp=temp.getParent();			
		}
		if(temp instanceof SequencesEditPart){
			return (SequencesEditPart) temp;
		}
		else{
			return null;
		}
	}
	
}
