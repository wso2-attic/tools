package org.wso2.developerstudio.eclipse.gmf.esb.persistence;

import org.apache.synapse.config.SynapseConfiguration;
import org.apache.synapse.mediators.ListMediator;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbLink;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequence;

public class TransformationInfo {
	
	public static final int TRAVERSAL_DIRECTION_IN = 1;
	public static final int TRAVERSAL_DIRECTION_OUT = 2;
	
	SynapseConfiguration synapseConfiguration;
	ListMediator originInSequence;
	ListMediator originOutSequence;
	ListMediator parentSequence;
	ListMediator currentReferredSequence;
	int traversalDirection;
	public boolean isEndPointFound;
	public EObject firstEndPoint;
	public boolean isOutputPathSet;
	public EsbLink sequenceIncomingLink;
	public Sequence currentSequence;
	public EObject previousNode;
	
	public ListMediator getOriginInSequence() {
		return originInSequence;
	}
	
	public ListMediator getParentSequence() {
		return parentSequence;
	}
	
	public ListMediator getOriginOutSequence() {
		return originOutSequence;
	}
	
	public SynapseConfiguration getSynapseConfiguration() {
		return synapseConfiguration;
	}
	
	public int getTraversalDirection() {
		return traversalDirection;
	}
	
	public EObject getPreviouNode(){
		return previousNode;
	}
	
	public ListMediator getCurrentReferredSequence(){
		return currentReferredSequence;
	}
	
	public void setOriginOutSequence(ListMediator originOutSequence) {
		this.originOutSequence = originOutSequence;
	}
	
	public void setOriginInSequence(ListMediator originInSequence) {
		this.originInSequence = originInSequence;
	}
	
	public void setParentSequence(ListMediator parentMediator) {
		this.parentSequence = parentMediator;
	}
	
	public void setSynapseConfiguration(
			SynapseConfiguration synapseConfiguration) {
		this.synapseConfiguration = synapseConfiguration;
	}
	
	public void setTraversalDirection(int traversalDirection) {
		this.traversalDirection = traversalDirection;
	}
	
	public void setPreviousNode(EObject previousNode){
		this.previousNode=previousNode;
	}
	
	public void setCurrentReferredSequence(ListMediator currentReferredSequence){
		this.currentReferredSequence=currentReferredSequence;
	}
}
