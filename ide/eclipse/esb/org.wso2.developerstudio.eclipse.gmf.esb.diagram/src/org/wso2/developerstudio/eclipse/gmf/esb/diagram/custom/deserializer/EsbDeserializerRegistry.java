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


import org.apache.synapse.core.axis2.ProxyService;

import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.builtin.DropMediator;
import org.apache.synapse.mediators.builtin.EnqueueMediator;
import org.apache.synapse.mediators.builtin.LogMediator;
import org.apache.synapse.mediators.builtin.PropertyMediator;
import org.apache.synapse.mediators.builtin.SendMediator;
import org.apache.synapse.mediators.builtin.ValidateMediator;
import org.apache.synapse.mediators.eip.aggregator.AggregateMediator;
import org.apache.synapse.mediators.eip.splitter.CloneMediator;
import org.apache.synapse.mediators.elementary.EnrichMediator;
import org.apache.synapse.mediators.filters.FilterMediator;
import org.apache.synapse.mediators.filters.SwitchMediator;
import org.apache.synapse.mediators.transform.XSLTMediator;
import org.apache.synapse.mediators.xquery.XQueryMediator;
import org.apache.synapse.rest.API;
import org.wso2.carbon.mediator.event.EventMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.Activator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbDiagramEditor;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;


/**
 * A registry of synapse model to model object deserializers.
 */
public class EsbDeserializerRegistry {
	/**
	 * Singleton instance.
	 */
	private static EsbDeserializerRegistry singleton;
	
	/**
	 * DeveloperStudio logger
	 * */
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	
	/**
	 * synapse model type to deserializers map.
	 */
	@SuppressWarnings("rawtypes")
	private Map<Class<?>, IEsbNodeDeserializer> deserializersMap;
	
	private EsbDiagramEditor diagramEditor;
	
	/**
	 * Creates a new deserialize registry.
	 */
	@SuppressWarnings("rawtypes")
	private EsbDeserializerRegistry(){
		deserializersMap = new HashMap<Class<?>, IEsbNodeDeserializer>();
		addDeserializer(LogMediator.class,new LogMediatorDeserializer());
		addDeserializer(PropertyMediator.class,new PropertyMediatorDeserializer());
		addDeserializer(ProxyService.class, new ProxyServiceDeserializer());
		addDeserializer(SendMediator.class, new SendMediatorDeserializer());
		addDeserializer(CloneMediator.class, new CloneMediatorDeserializer());
		addDeserializer(DropMediator.class, new DropMediatorDeserializer());
		addDeserializer(EnrichMediator.class, new EnrichMediatorDeserializer());
		addDeserializer(EventMediator.class, new EventMediatorDeserializer());
		addDeserializer(EnqueueMediator.class, new EnqueueMediatorDeserializer());
		addDeserializer(ValidateMediator.class, new ValidateMediatorDeserializer());
		addDeserializer(AggregateMediator.class, new AggregateMediatorDeserializer());
		addDeserializer(FilterMediator.class,new FilterMediatorDeserializer());
		addDeserializer(SwitchMediator.class, new SwitchMediatorDeserializer());
		addDeserializer(SequenceMediator.class, new SequenceDeserializer());
		addDeserializer(API.class, new APIDeserializer());
		addDeserializer(XSLTMediator.class, new XSLTMediatorDeserializer());
		addDeserializer(XQueryMediator.class, new XQueryMediatorDeserializer());
		
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
	@SuppressWarnings("rawtypes")
	public void addDeserializer(Class<?> synapseModelClass, IEsbNodeDeserializer deserializer) {
		deserializersMap.put(synapseModelClass, deserializer);
	}
	
	/**
	 * Attempts to locate a deserializer corresponding to the specified synapse model object.
	 * @param synapseModel
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public IEsbNodeDeserializer getDeserializer(Object synapseModel) {
		IEsbNodeDeserializer nodeDeserializer = deserializersMap.get(synapseModel.getClass());
		if(nodeDeserializer!=null){
			nodeDeserializer.setDiagramEditor(getDiagramEditor());
		} else{
			log.error("Can not find deserializer for synapse object " + synapseModel.getClass());
		}
		
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
