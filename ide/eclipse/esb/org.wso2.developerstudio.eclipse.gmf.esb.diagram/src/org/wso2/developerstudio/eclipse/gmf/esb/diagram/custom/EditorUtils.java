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

import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;

public class EditorUtils {
	
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
}
