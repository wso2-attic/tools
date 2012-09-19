/*
 * Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
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
import java.util.regex.Pattern;

import org.apache.synapse.SynapseArtifact;
import org.apache.synapse.config.xml.AnonymousListMediator;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.ListMediator;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.FilterConditionType;
import org.wso2.developerstudio.eclipse.gmf.esb.FilterMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.EsbNodeTransformer;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

/**
 * {@link EsbNodeTransformer} responsible for transforming
 * {@link org.wso2.developerstudio.eclipse.gmf.esb.FilterMediator} model objects into
 * corresponding synapse artifact(s).
 */
public class FilterMediatorTransformer extends AbstractEsbNodeTransformer {
	/**
	 * {@inheritDoc}
	 */
	public void transform(TransformationInfo info, EsbNode subject) throws Exception {
		// Check subject.
		Assert.isTrue(subject instanceof FilterMediator, "Invalid subject.");
		FilterMediator visualFilter = (FilterMediator) subject;
		
		// Build filter mediator.
		org.apache.synapse.mediators.filters.FilterMediator filterMediator = new org.apache.synapse.mediators.filters.FilterMediator();
		if (visualFilter.getConditionType() == FilterConditionType.XPATH) {
			//TODO: validate xpaths before adding			
			
			if (visualFilter.getXpath() != null
					&& visualFilter.getXpath().getPropertyValue() != null
					&& !visualFilter.getXpath().getPropertyValue().equals("")) {

				SynapseXPath xPath = new SynapseXPath(visualFilter.getXpath()
						.getPropertyValue());

				for (int i = 0; i < visualFilter.getXpath().getNamespaces()
						.keySet().size(); ++i) {
					String prefix = (String) visualFilter.getXpath()
							.getNamespaces().keySet().toArray()[i];
					String namespaceUri = visualFilter.getXpath()
							.getNamespaces().get(prefix);
					xPath.addNamespace(prefix, namespaceUri);
				}
				filterMediator.setXpath(xPath);
			}		
			
		} else {			
			if (visualFilter.getSource() != null
					&& visualFilter.getSource().getPropertyValue() != null
					&& !visualFilter.getSource().getPropertyValue().equals("")) {

				SynapseXPath source = new SynapseXPath(visualFilter.getSource()
						.getPropertyValue());

				for (int i = 0; i < visualFilter.getSource().getNamespaces()
						.keySet().size(); ++i) {
					String prefix = (String) visualFilter.getSource()
							.getNamespaces().keySet().toArray()[i];
					String namespaceUri = visualFilter.getSource()
							.getNamespaces().get(prefix);
					source.addNamespace(prefix, namespaceUri);
				}
				filterMediator.setSource(source);
			}	
			
			filterMediator.setRegex(Pattern.compile(visualFilter.getRegex()));
		}
		info.getParentSequence().addChild(filterMediator);
		
		// Transform pass output data flow path.
		filterMediator.setThenElementPresent(true);
		TransformationInfo newThenInfo = new TransformationInfo();
		newThenInfo.setTraversalDirection(TransformationInfo.TRAVERSAL_DIRECTION_IN);
		newThenInfo.setSynapseConfiguration(info.getSynapseConfiguration());
		newThenInfo.setOriginInSequence(info.getOriginInSequence());
		newThenInfo.setOriginOutSequence(info.getOriginOutSequence());
		newThenInfo.setParentSequence(filterMediator);
		doTransform(newThenInfo, visualFilter.getPassOutputConnector());		
		
		// Transform fail output data flow path.
		ListMediator elseMediator = new AnonymousListMediator();
		filterMediator.setElseMediator(elseMediator);
		TransformationInfo newElseInfo = new TransformationInfo();
		newElseInfo.setTraversalDirection(TransformationInfo.TRAVERSAL_DIRECTION_IN);
		newElseInfo.setSynapseConfiguration(info.getSynapseConfiguration());
		newElseInfo.setOriginInSequence(info.getOriginInSequence());
		newElseInfo.setOriginOutSequence(info.getOriginOutSequence());
		newElseInfo.setParentSequence(elseMediator);
		doTransform(newElseInfo, visualFilter.getFailOutputConnector());
		
		doTransform(info, ((FilterMediator)subject).getOutputConnector());
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}


	public void transformWithinSequence(TransformationInfo info,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// Check subject.
		Assert.isTrue(subject instanceof FilterMediator, "Invalid subject.");
		FilterMediator visualFilter = (FilterMediator) subject;
		
		// Build filter mediator.
		org.apache.synapse.mediators.filters.FilterMediator filterMediator = new org.apache.synapse.mediators.filters.FilterMediator();
		if (visualFilter.getConditionType() == FilterConditionType.XPATH) {
			//TODO: validate xpaths before adding
			if (visualFilter.getXpath() != null
					&& visualFilter.getXpath().getPropertyValue() != null
					&& !visualFilter.getXpath().getPropertyValue().equals("")) {

				SynapseXPath xPath = new SynapseXPath(visualFilter.getXpath()
						.getPropertyValue());

				for (int i = 0; i < visualFilter.getXpath().getNamespaces()
						.keySet().size(); ++i) {
					String prefix = (String) visualFilter.getXpath()
							.getNamespaces().keySet().toArray()[i];
					String namespaceUri = visualFilter.getXpath()
							.getNamespaces().get(prefix);
					xPath.addNamespace(prefix, namespaceUri);
				}
				filterMediator.setXpath(xPath);
			}
		} else {			
			if (visualFilter.getSource() != null
					&& visualFilter.getSource().getPropertyValue() != null
					&& !visualFilter.getSource().getPropertyValue().equals("")) {

				SynapseXPath source = new SynapseXPath(visualFilter.getSource()
						.getPropertyValue());

				for (int i = 0; i < visualFilter.getSource().getNamespaces()
						.keySet().size(); ++i) {
					String prefix = (String) visualFilter.getSource()
							.getNamespaces().keySet().toArray()[i];
					String namespaceUri = visualFilter.getSource()
							.getNamespaces().get(prefix);
					source.addNamespace(prefix, namespaceUri);
				}
				filterMediator.setSource(source);
			}			
			filterMediator.setRegex(Pattern.compile(visualFilter.getRegex()));
		}
		sequence.addChild(filterMediator);
		
		
		// Transform pass output data flow path.
		filterMediator.setThenElementPresent(true);
		TransformationInfo newThenInfo = new TransformationInfo();
		newThenInfo.setTraversalDirection(TransformationInfo.TRAVERSAL_DIRECTION_IN);
		newThenInfo.setSynapseConfiguration(info.getSynapseConfiguration());
		newThenInfo.setOriginInSequence(info.getOriginInSequence());
		newThenInfo.setOriginOutSequence(info.getOriginOutSequence());
		newThenInfo.setParentSequence(filterMediator);	
		doTransform(newThenInfo, visualFilter.getPassOutputConnector());
		//doTransformWithinSequence(newThenInfo,((FilterMediator) subject).getPassOutputConnector().getOutgoingLink(),sequence);
		
		// Transform fail output data flow path.
		ListMediator elseMediator = new AnonymousListMediator();
		filterMediator.setElseMediator(elseMediator);
		TransformationInfo newElseInfo = new TransformationInfo();
		newElseInfo.setTraversalDirection(TransformationInfo.TRAVERSAL_DIRECTION_IN);
		newElseInfo.setSynapseConfiguration(info.getSynapseConfiguration());
		newElseInfo.setOriginInSequence(info.getOriginInSequence());
		newElseInfo.setOriginOutSequence(info.getOriginOutSequence());
		newElseInfo.setParentSequence(elseMediator);
		doTransform(newElseInfo, visualFilter.getFailOutputConnector());
		//doTransformWithinSequence(newThenInfo,((FilterMediator) subject).getFailOutputConnector().getOutgoingLink(),sequence);
		
		
		doTransformWithinSequence(info,((FilterMediator) subject).getOutputConnector().getOutgoingLink(),sequence);
		
	}


}
