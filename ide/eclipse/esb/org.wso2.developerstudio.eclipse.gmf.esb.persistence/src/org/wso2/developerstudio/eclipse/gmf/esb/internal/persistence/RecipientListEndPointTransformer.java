/**
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

package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.endpoints.EndpointDefinition;
import org.apache.synapse.endpoints.RecipientListEndpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.builtin.SendMediator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.wso2.developerstudio.eclipse.gmf.esb.ComplexEndpoints;
import org.wso2.developerstudio.eclipse.gmf.esb.ComplexEndpointsOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbDiagram;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbElement;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.InputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.RecipientListEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequence;
import org.wso2.developerstudio.eclipse.gmf.esb.SequenceInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.EsbNodeTransformer;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.EsbTransformerRegistry;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class RecipientListEndPointTransformer extends AbstractEndpointTransformer {

	public void transform(TransformationInfo info, EsbNode subject) throws Exception {
		Assert.isTrue(subject instanceof RecipientListEndPoint, "Invalid subject.");
		RecipientListEndPoint endPointModel = (RecipientListEndPoint) subject;

		SendMediator sendMediator = getSendMediator(info);

		if (endPointModel.isInLine()) {
			info.getCurrentProxy().setTargetInLineEndpoint(
					createRecipientListConf(info, endPointModel, null, null));
		} else {
			if (sendMediator != null) {
				sendMediator.setEndpoint(createRecipientListConf(info, endPointModel, null, null));
			}
		}

		if (!info.isEndPointFound) {
			info.isEndPointFound = true;
			info.firstEndPoint = endPointModel;
		}

		if (endPointModel.getWestOutputConnector() != null) {
			if (endPointModel.getWestOutputConnector().getOutgoingLink() != null) {
				InputConnector nextInputConnector = endPointModel.getWestOutputConnector()
						.getOutgoingLink().getTarget();
				if ((!(nextInputConnector instanceof SequenceInputConnector))
						|| ((((Sequence) nextInputConnector.eContainer()).getOutputConnector()
								.get(0).getOutgoingLink() != null) && (!(((Sequence) nextInputConnector
								.eContainer()).getOutputConnector().get(0).getOutgoingLink()
								.getTarget().eContainer() instanceof EndPoint)))) {
					info.setParentSequence(info.getOriginOutSequence());
					info.setTraversalDirection(TransformationInfo.TRAVERSAL_DIRECTION_OUT);
				} else if (endPointModel.getInputConnector().getIncomingLinks().get(0).getSource()
						.eContainer() instanceof Sequence) {
					info.setParentSequence(info.getCurrentReferredSequence());
				}
			}
		}

		List<EsbNode> transformedMediators = info.getTransformedMediators();
		if (endPointModel.getOutputConnector() != null
				&& endPointModel.getWestOutputConnector()!=null && endPointModel.getWestOutputConnector().getOutgoingLink() != null) {
			EsbNode nextElement = (EsbNode) endPointModel.getWestOutputConnector()
					.getOutgoingLink().getTarget().eContainer();
			if (transformedMediators.contains(nextElement)) {
				return;
			}
			doTransform(info, endPointModel.getWestOutputConnector());
			transformedMediators.add(nextElement);
		}

	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		Assert.isTrue(subject instanceof RecipientListEndPoint, "Invalid subject.");
		RecipientListEndPoint model = (RecipientListEndPoint) subject;
		createRecipientListConf(info, model, null,endPoints);

	}

	public void transformWithinSequence(TransformationInfo information, EsbNode subject,
			SequenceMediator sequence) throws Exception {
		Assert.isTrue(subject instanceof RecipientListEndPoint, "Invalid subject");
		RecipientListEndPoint endPointModel = (RecipientListEndPoint) subject;

		SendMediator sendMediator = getSendMediator(sequence);
		
		sendMediator.setEndpoint(createRecipientListConf(information, endPointModel, null, null));

	}

	public RecipientListEndpoint createRecipientListConf(TransformationInfo info,
			RecipientListEndPoint model, String name, List<Endpoint> endPoints) {
		RecipientListEndpoint recipientList = new RecipientListEndpoint();
		if (name != null) {
			recipientList.setName(name);
		}
		EndpointDefinition synapseEPDef = new EndpointDefinition();
		List<Endpoint> endPointsList = new ArrayList<Endpoint>();
		recipientList.setChildren(endPointsList);
		recipientList.setDefinition(synapseEPDef);
		saveProperties(model, recipientList);
		if (endPoints != null) {
			endPoints.add(recipientList);
		}

		if (!info.isEndPointFound) {
			info.isEndPointFound = true;
			info.firstEndPoint = model;
		}
		try {
			ArrayList<ComplexEndpointsOutputConnector> connectors = createAllEndpoints(model);

			for (ComplexEndpointsOutputConnector outputConnector : connectors) {
				if (outputConnector.getOutgoingLink() != null) {
					if (outputConnector.getOutgoingLink().getTarget() != null) {
						EsbNode esbNode = (EsbNode) outputConnector.getOutgoingLink().getTarget()
								.eContainer();
						EsbNodeTransformer transformer = EsbTransformerRegistry.getInstance()
								.getTransformer(esbNode);
						transformer.createSynapseObject(info, esbNode, endPointsList);

					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return recipientList;
	}

	private ArrayList<ComplexEndpointsOutputConnector> createAllEndpoints(
			RecipientListEndPoint model) throws Exception {
		IEditorPart editorPart = null;
		IProject activeProject = null;
		ArrayList<ComplexEndpointsOutputConnector> outputConnectors = new ArrayList<ComplexEndpointsOutputConnector>();

		IEditorReference editorReferences[] = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage().getEditorReferences();
		for (int i = 0; i < editorReferences.length; i++) {
			IEditorPart editor = editorReferences[i].getEditor(false);

			if (editor != null) {
				editorPart = editor.getSite().getWorkbenchWindow().getActivePage()
						.getActiveEditor();
			}

			if (editorPart != null) {
				IFileEditorInput input = (IFileEditorInput) editorPart.getEditorInput();
				IFile file = input.getFile();
				activeProject = file.getProject();
			}
		}

		String name = (String) model.getName();
		IPath location = new Path("src/main/graphical-synapse-config/complex_endpoints" + "/"
				+ "complex_endpoint_" + name + ".esb_diagram");
		IFile file = activeProject.getFile(location);

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = null;

		File f = new File(file.getLocationURI().getPath());
		URI uri = URI.createFileURI(f.getAbsolutePath());

		if (!f.exists()) {

		} else {

			resource = resourceSet.getResource(uri, true);

			EsbDiagram s = (EsbDiagram) ((org.eclipse.gmf.runtime.notation.impl.DiagramImpl) resource
					.getContents().get(0)).getElement();
			EList<EsbElement> children = s.getServer().getChildren();
			for (EsbElement esbElement : children) {
				if (esbElement instanceof ComplexEndpoints) {
					outputConnectors.addAll(((ComplexEndpoints) esbElement).getOutputConnector());
				}
			}
		}
		return outputConnectors;
	}

}
