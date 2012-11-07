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

import java.util.HashMap;
import java.util.Map;

import javax.management.RuntimeErrorException;

import org.apache.synapse.core.axis2.ProxyService;
import org.apache.synapse.mediators.builtin.LogMediator;
import org.apache.synapse.mediators.builtin.PropertyMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbDiagramEditor;


/**
 * A registry of synapse model to model object deserializers.
 */
public class EsbDeserializerRegistry {
	/**
	 * Singleton instance.
	 */
	private static EsbDeserializerRegistry singleton;		
	
	/**
	 * synapse model type to deserializers map.
	 */
	private Map<Class<?>, IEsbNodeDeserializer> deserializersMap;
	
	private EsbDiagramEditor diagramEditor;
	
	/**
	 * Creates a new deserialize registry.
	 */
	private EsbDeserializerRegistry(){
		deserializersMap = new HashMap<Class<?>, IEsbNodeDeserializer>();
		addDeserializer(LogMediator.class,new LogMediatorDeserializer());
		addDeserializer(PropertyMediator.class,new PropertyMediatorDeserializer());
		addDeserializer(ProxyService.class, new ProxyServiceDeserializer());
	}
	
	/**
	 * @return singleton instance.
	 */
	public static EsbDeserializerRegistry getInstance() {
		if (null == singleton) {
			singleton = new EsbDeserializerRegistry();
		}
		return singleton;
	}
	
	/**
	 * initialize registry
	 */
	public void init(EsbDiagramEditor diagramEditor){
		this.diagramEditor = diagramEditor;
	}
	
	/**
	 * Adds a new deserializer into this registry.
	 * 
	 * @param synapseModelClass
	 * @param transformer
	 */
	public void addDeserializer(Class<?> synapseModelClass, IEsbNodeDeserializer deserializer) {
		deserializersMap.put(synapseModelClass, deserializer);
	}
	
	/**
	 * Attempts to locate a deserializer corresponding to the specified synapse model object.
	 * @param synapseModel
	 * @return
	 */
	public IEsbNodeDeserializer getDeserializer(Object synapseModel) {
		IEsbNodeDeserializer nodeDeserializer = deserializersMap.get(synapseModel.getClass());
		nodeDeserializer.setDiagramEditor(getDiagramEditor());
		return nodeDeserializer;
	}
	
	/**
	 * Get active diagram editor 
	 * @return
	 */
	public EsbDiagramEditor getDiagramEditor() {
		return diagramEditor;
	}

}
