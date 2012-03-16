/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage
 * @generated
 */
public interface EsbFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EsbFactory eINSTANCE = org.wso2.developerstudio.eclipse.gmf.esb.impl.EsbFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram</em>'.
	 * @generated
	 */
	EsbDiagram createEsbDiagram();

	/**
	 * Returns a new object of class '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server</em>'.
	 * @generated
	 */
	EsbServer createEsbServer();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	EsbLink createEsbLink();

	/**
	 * Returns a new object of class '<em>Proxy Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proxy Service</em>'.
	 * @generated
	 */
	ProxyService createProxyService();

	/**
	 * Returns a new object of class '<em>Proxy Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proxy Output Connector</em>'.
	 * @generated
	 */
	ProxyOutputConnector createProxyOutputConnector();

	/**
	 * Returns a new object of class '<em>Proxy Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proxy Input Connector</em>'.
	 * @generated
	 */
	ProxyInputConnector createProxyInputConnector();

	/**
	 * Returns a new object of class '<em>Proxy Service Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proxy Service Parameter</em>'.
	 * @generated
	 */
	ProxyServiceParameter createProxyServiceParameter();

	/**
	 * Returns a new object of class '<em>Proxy Service Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proxy Service Policy</em>'.
	 * @generated
	 */
	ProxyServicePolicy createProxyServicePolicy();

	/**
	 * Returns a new object of class '<em>Proxy Service In Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proxy Service In Sequence</em>'.
	 * @generated
	 */
	ProxyServiceInSequence createProxyServiceInSequence();

	/**
	 * Returns a new object of class '<em>Proxy Service Out Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proxy Service Out Sequence</em>'.
	 * @generated
	 */
	ProxyServiceOutSequence createProxyServiceOutSequence();

	/**
	 * Returns a new object of class '<em>Proxy Service Sequence Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proxy Service Sequence Container</em>'.
	 * @generated
	 */
	ProxyServiceSequenceContainer createProxyServiceSequenceContainer();

	/**
	 * Returns a new object of class '<em>Proxy Service Endpoint Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proxy Service Endpoint Container</em>'.
	 * @generated
	 */
	ProxyServiceEndpointContainer createProxyServiceEndpointContainer();

	/**
	 * Returns a new object of class '<em>Message Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Mediator</em>'.
	 * @generated
	 */
	MessageMediator createMessageMediator();

	/**
	 * Returns a new object of class '<em>Message Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Input Connector</em>'.
	 * @generated
	 */
	MessageInputConnector createMessageInputConnector();

	/**
	 * Returns a new object of class '<em>Message Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Output Connector</em>'.
	 * @generated
	 */
	MessageOutputConnector createMessageOutputConnector();

	/**
	 * Returns a new object of class '<em>Default End Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default End Point</em>'.
	 * @generated
	 */
	DefaultEndPoint createDefaultEndPoint();

	/**
	 * Returns a new object of class '<em>Default End Point Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default End Point Input Connector</em>'.
	 * @generated
	 */
	DefaultEndPointInputConnector createDefaultEndPointInputConnector();

	/**
	 * Returns a new object of class '<em>Default End Point Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default End Point Output Connector</em>'.
	 * @generated
	 */
	DefaultEndPointOutputConnector createDefaultEndPointOutputConnector();

	/**
	 * Returns a new object of class '<em>Address End Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address End Point</em>'.
	 * @generated
	 */
	AddressEndPoint createAddressEndPoint();

	/**
	 * Returns a new object of class '<em>Address End Point Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address End Point Input Connector</em>'.
	 * @generated
	 */
	AddressEndPointInputConnector createAddressEndPointInputConnector();

	/**
	 * Returns a new object of class '<em>Address End Point Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address End Point Output Connector</em>'.
	 * @generated
	 */
	AddressEndPointOutputConnector createAddressEndPointOutputConnector();

	/**
	 * Returns a new object of class '<em>Drop Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop Mediator</em>'.
	 * @generated
	 */
	DropMediator createDropMediator();

	/**
	 * Returns a new object of class '<em>Drop Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop Mediator Input Connector</em>'.
	 * @generated
	 */
	DropMediatorInputConnector createDropMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Filter Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Mediator</em>'.
	 * @generated
	 */
	FilterMediator createFilterMediator();

	/**
	 * Returns a new object of class '<em>Filter Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Mediator Input Connector</em>'.
	 * @generated
	 */
	FilterMediatorInputConnector createFilterMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Filter Mediator Pass Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Mediator Pass Output Connector</em>'.
	 * @generated
	 */
	FilterMediatorPassOutputConnector createFilterMediatorPassOutputConnector();

	/**
	 * Returns a new object of class '<em>Filter Mediator Fail Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Mediator Fail Output Connector</em>'.
	 * @generated
	 */
	FilterMediatorFailOutputConnector createFilterMediatorFailOutputConnector();

	/**
	 * Returns a new object of class '<em>Merge Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge Node</em>'.
	 * @generated
	 */
	MergeNode createMergeNode();

	/**
	 * Returns a new object of class '<em>Merge Node First Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge Node First Input Connector</em>'.
	 * @generated
	 */
	MergeNodeFirstInputConnector createMergeNodeFirstInputConnector();

	/**
	 * Returns a new object of class '<em>Merge Node Second Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge Node Second Input Connector</em>'.
	 * @generated
	 */
	MergeNodeSecondInputConnector createMergeNodeSecondInputConnector();

	/**
	 * Returns a new object of class '<em>Merge Node Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge Node Output Connector</em>'.
	 * @generated
	 */
	MergeNodeOutputConnector createMergeNodeOutputConnector();

	/**
	 * Returns a new object of class '<em>Log Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Mediator</em>'.
	 * @generated
	 */
	LogMediator createLogMediator();

	/**
	 * Returns a new object of class '<em>Log Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Mediator Input Connector</em>'.
	 * @generated
	 */
	LogMediatorInputConnector createLogMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Log Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Mediator Output Connector</em>'.
	 * @generated
	 */
	LogMediatorOutputConnector createLogMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>Log Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Property</em>'.
	 * @generated
	 */
	LogProperty createLogProperty();

	/**
	 * Returns a new object of class '<em>Registry Key Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registry Key Property</em>'.
	 * @generated
	 */
	RegistryKeyProperty createRegistryKeyProperty();
	
	
	RegistryKeyProperty copyRegistryKeyProperty(RegistryKeyProperty registryKeyProperty); 

	/**
	 * Returns a new object of class '<em>Property Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Mediator</em>'.
	 * @generated
	 */
	PropertyMediator createPropertyMediator();

	/**
	 * Returns a new object of class '<em>Property Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Mediator Input Connector</em>'.
	 * @generated
	 */
	PropertyMediatorInputConnector createPropertyMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Property Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Mediator Output Connector</em>'.
	 * @generated
	 */
	PropertyMediatorOutputConnector createPropertyMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>Namespaced Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Namespaced Property</em>'.
	 * @generated
	 */
	NamespacedProperty createNamespacedProperty();
	
	/**
	 * Utility method for creating a copy of the given
	 * {@link NamespacedProperty}.
	 * 
	 * @param namespacedProperty
	 *            original {@link NamespacedProperty} instance.
	 * @return copy of the original {@link NamespacedProperty} instance.
	 */
	NamespacedProperty copyNamespacedProperty(
			NamespacedProperty namespacedProperty);

	/**
	 * Returns a new object of class '<em>Enrich Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enrich Mediator</em>'.
	 * @generated
	 */
	EnrichMediator createEnrichMediator();

	/**
	 * Returns a new object of class '<em>Enrich Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enrich Mediator Input Connector</em>'.
	 * @generated
	 */
	EnrichMediatorInputConnector createEnrichMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Enrich Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enrich Mediator Output Connector</em>'.
	 * @generated
	 */
	EnrichMediatorOutputConnector createEnrichMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>XSLT Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSLT Mediator</em>'.
	 * @generated
	 */
	XSLTMediator createXSLTMediator();

	/**
	 * Returns a new object of class '<em>XSLT Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSLT Property</em>'.
	 * @generated
	 */
	XSLTProperty createXSLTProperty();

	/**
	 * Returns a new object of class '<em>XSLT Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSLT Feature</em>'.
	 * @generated
	 */
	XSLTFeature createXSLTFeature();

	/**
	 * Returns a new object of class '<em>XSLT Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSLT Resource</em>'.
	 * @generated
	 */
	XSLTResource createXSLTResource();

	/**
	 * Returns a new object of class '<em>XSLT Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSLT Mediator Input Connector</em>'.
	 * @generated
	 */
	XSLTMediatorInputConnector createXSLTMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>XSLT Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSLT Mediator Output Connector</em>'.
	 * @generated
	 */
	XSLTMediatorOutputConnector createXSLTMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>Switch Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Mediator</em>'.
	 * @generated
	 */
	SwitchMediator createSwitchMediator();

	/**
	 * Returns a new object of class '<em>Switch Case Branch Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Case Branch Output Connector</em>'.
	 * @generated
	 */
	SwitchCaseBranchOutputConnector createSwitchCaseBranchOutputConnector();

	/**
	 * Returns a new object of class '<em>Switch Default Branch Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Default Branch Output Connector</em>'.
	 * @generated
	 */
	SwitchDefaultBranchOutputConnector createSwitchDefaultBranchOutputConnector();

	/**
	 * Returns a new object of class '<em>Switch Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Mediator Input Connector</em>'.
	 * @generated
	 */
	SwitchMediatorInputConnector createSwitchMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Sequence Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Diagram</em>'.
	 * @generated
	 */
	SequenceDiagram createSequenceDiagram();

	/**
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	EsbSequence createEsbSequence();

	/**
	 * Returns a new object of class '<em>Sequence Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Input</em>'.
	 * @generated
	 */
	EsbSequenceInput createEsbSequenceInput();

	/**
	 * Returns a new object of class '<em>Sequence Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Output</em>'.
	 * @generated
	 */
	EsbSequenceOutput createEsbSequenceOutput();

	/**
	 * Returns a new object of class '<em>Sequence Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Input Connector</em>'.
	 * @generated
	 */
	EsbSequenceInputConnector createEsbSequenceInputConnector();

	/**
	 * Returns a new object of class '<em>Sequence Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Output Connector</em>'.
	 * @generated
	 */
	EsbSequenceOutputConnector createEsbSequenceOutputConnector();

	/**
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	Sequence createSequence();

	/**
	 * Returns a new object of class '<em>Sequence Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Input Connector</em>'.
	 * @generated
	 */
	SequenceInputConnector createSequenceInputConnector();

	/**
	 * Returns a new object of class '<em>Sequence Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Output Connector</em>'.
	 * @generated
	 */
	SequenceOutputConnector createSequenceOutputConnector();

	/**
	 * Returns a new object of class '<em>Event Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Mediator</em>'.
	 * @generated
	 */
	EventMediator createEventMediator();

	/**
	 * Returns a new object of class '<em>Event Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Mediator Input Connector</em>'.
	 * @generated
	 */
	EventMediatorInputConnector createEventMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Event Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Mediator Output Connector</em>'.
	 * @generated
	 */
	EventMediatorOutputConnector createEventMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>Entitlement Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entitlement Mediator</em>'.
	 * @generated
	 */
	EntitlementMediator createEntitlementMediator();

	/**
	 * Returns a new object of class '<em>Entitlement Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entitlement Mediator Input Connector</em>'.
	 * @generated
	 */
	EntitlementMediatorInputConnector createEntitlementMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Entitlement Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entitlement Mediator Output Connector</em>'.
	 * @generated
	 */
	EntitlementMediatorOutputConnector createEntitlementMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>Enqueue Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enqueue Mediator</em>'.
	 * @generated
	 */
	EnqueueMediator createEnqueueMediator();

	/**
	 * Returns a new object of class '<em>Class Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Mediator</em>'.
	 * @generated
	 */
	ClassMediator createClassMediator();

	/**
	 * Returns a new object of class '<em>Class Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Mediator Input Connector</em>'.
	 * @generated
	 */
	ClassMediatorInputConnector createClassMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Class Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Mediator Output Connector</em>'.
	 * @generated
	 */
	ClassMediatorOutputConnector createClassMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>Class Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Property</em>'.
	 * @generated
	 */
	ClassProperty createClassProperty();

	/**
	 * Returns a new object of class '<em>Spring Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spring Mediator</em>'.
	 * @generated
	 */
	SpringMediator createSpringMediator();

	/**
	 * Returns a new object of class '<em>Spring Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spring Mediator Input Connector</em>'.
	 * @generated
	 */
	SpringMediatorInputConnector createSpringMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Spring Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spring Mediator Output Connector</em>'.
	 * @generated
	 */
	SpringMediatorOutputConnector createSpringMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>Validate Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validate Mediator</em>'.
	 * @generated
	 */
	ValidateMediator createValidateMediator();

	/**
	 * Returns a new object of class '<em>Validate On Fail Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validate On Fail Branch</em>'.
	 * @generated
	 */
	ValidateOnFailBranch createValidateOnFailBranch();

	/**
	 * Returns a new object of class '<em>Validate Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validate Feature</em>'.
	 * @generated
	 */
	ValidateFeature createValidateFeature();

	/**
	 * Returns a new object of class '<em>Validate Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validate Schema</em>'.
	 * @generated
	 */
	ValidateSchema createValidateSchema();

	/**
	 * Returns a new object of class '<em>Script Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script Mediator</em>'.
	 * @generated
	 */
	ScriptMediator createScriptMediator();

	/**
	 * Returns a new object of class '<em>Script Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script Mediator Input Connector</em>'.
	 * @generated
	 */
	ScriptMediatorInputConnector createScriptMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Script Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script Mediator Output Connector</em>'.
	 * @generated
	 */
	ScriptMediatorOutputConnector createScriptMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>Fault Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Mediator</em>'.
	 * @generated
	 */
	FaultMediator createFaultMediator();

	/**
	 * Returns a new object of class '<em>Fault Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Mediator Input Connector</em>'.
	 * @generated
	 */
	FaultMediatorInputConnector createFaultMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Fault Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Mediator Output Connector</em>'.
	 * @generated
	 */
	FaultMediatorOutputConnector createFaultMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>Aggregate Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregate Mediator</em>'.
	 * @generated
	 */
	AggregateMediator createAggregateMediator();

	/**
	 * Returns a new object of class '<em>Aggregate Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregate Mediator Input Connector</em>'.
	 * @generated
	 */
	AggregateMediatorInputConnector createAggregateMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Aggregate Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregate Mediator Output Connector</em>'.
	 * @generated
	 */
	AggregateMediatorOutputConnector createAggregateMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>Aggregate Mediator On Complete Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregate Mediator On Complete Output Connector</em>'.
	 * @generated
	 */
	AggregateMediatorOnCompleteOutputConnector createAggregateMediatorOnCompleteOutputConnector();

	/**
	 * Returns a new object of class '<em>Aggregate On Complete Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregate On Complete Branch</em>'.
	 * @generated
	 */
	AggregateOnCompleteBranch createAggregateOnCompleteBranch();

	/**
	 * Returns a new object of class '<em>Router Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Router Mediator</em>'.
	 * @generated
	 */
	RouterMediator createRouterMediator();

	/**
	 * Returns a new object of class '<em>Router Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Router Route</em>'.
	 * @generated
	 */
	RouterRoute createRouterRoute();

	/**
	 * Returns a new object of class '<em>Route Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Target</em>'.
	 * @generated
	 */
	RouteTarget createRouteTarget();

	/**
	 * Returns a new object of class '<em>Clone Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clone Mediator</em>'.
	 * @generated
	 */
	CloneMediator createCloneMediator();

	/**
	 * Returns a new object of class '<em>Clone Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clone Mediator Input Connector</em>'.
	 * @generated
	 */
	CloneMediatorInputConnector createCloneMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Clone Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clone Mediator Output Connector</em>'.
	 * @generated
	 */
	CloneMediatorOutputConnector createCloneMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>Clone Mediator Target Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clone Mediator Target Output Connector</em>'.
	 * @generated
	 */
	CloneMediatorTargetOutputConnector createCloneMediatorTargetOutputConnector();

	/**
	 * Returns a new object of class '<em>Iterate Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iterate Mediator</em>'.
	 * @generated
	 */
	IterateMediator createIterateMediator();

	/**
	 * Returns a new object of class '<em>Iterate Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iterate Mediator Input Connector</em>'.
	 * @generated
	 */
	IterateMediatorInputConnector createIterateMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Iterate Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iterate Mediator Output Connector</em>'.
	 * @generated
	 */
	IterateMediatorOutputConnector createIterateMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>Iterate Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iterate Target</em>'.
	 * @generated
	 */
	IterateTarget createIterateTarget();

	/**
	 * Returns a new object of class '<em>Abstract Common Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Common Target</em>'.
	 * @generated
	 */
	AbstractCommonTarget createAbstractCommonTarget();

	/**
	 * Returns a new object of class '<em>Mediator Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mediator Sequence</em>'.
	 * @generated
	 */
	MediatorSequence createMediatorSequence();

	/**
	 * Returns a new object of class '<em>Cache Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cache Mediator</em>'.
	 * @generated
	 */
	CacheMediator createCacheMediator();

	/**
	 * Returns a new object of class '<em>Cache Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cache Mediator Input Connector</em>'.
	 * @generated
	 */
	CacheMediatorInputConnector createCacheMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Cache Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cache Mediator Output Connector</em>'.
	 * @generated
	 */
	CacheMediatorOutputConnector createCacheMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>Cache On Hit Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cache On Hit Branch</em>'.
	 * @generated
	 */
	CacheOnHitBranch createCacheOnHitBranch();

	/**
	 * Returns a new object of class '<em>XQuery Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XQuery Mediator</em>'.
	 * @generated
	 */
	XQueryMediator createXQueryMediator();

	/**
	 * Returns a new object of class '<em>XQuery Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XQuery Mediator Input Connector</em>'.
	 * @generated
	 */
	XQueryMediatorInputConnector createXQueryMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>XQuery Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XQuery Mediator Output Connector</em>'.
	 * @generated
	 */
	XQueryMediatorOutputConnector createXQueryMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>XQuery Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XQuery Variable</em>'.
	 * @generated
	 */
	XQueryVariable createXQueryVariable();

	/**
	 * Returns a new object of class '<em>Callout Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Callout Mediator</em>'.
	 * @generated
	 */
	CalloutMediator createCalloutMediator();

	/**
	 * Returns a new object of class '<em>Callout Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Callout Mediator Input Connector</em>'.
	 * @generated
	 */
	CalloutMediatorInputConnector createCalloutMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Callout Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Callout Mediator Output Connector</em>'.
	 * @generated
	 */
	CalloutMediatorOutputConnector createCalloutMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>RM Sequence Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RM Sequence Mediator</em>'.
	 * @generated
	 */
	RMSequenceMediator createRMSequenceMediator();

	/**
	 * Returns a new object of class '<em>RM Sequence Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RM Sequence Mediator Input Connector</em>'.
	 * @generated
	 */
	RMSequenceMediatorInputConnector createRMSequenceMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>RM Sequence Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RM Sequence Mediator Output Connector</em>'.
	 * @generated
	 */
	RMSequenceMediatorOutputConnector createRMSequenceMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>Transaction Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transaction Mediator</em>'.
	 * @generated
	 */
	TransactionMediator createTransactionMediator();

	/**
	 * Returns a new object of class '<em>Transaction Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transaction Mediator Input Connector</em>'.
	 * @generated
	 */
	TransactionMediatorInputConnector createTransactionMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Transaction Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transaction Mediator Output Connector</em>'.
	 * @generated
	 */
	TransactionMediatorOutputConnector createTransactionMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>OAuth Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OAuth Mediator</em>'.
	 * @generated
	 */
	OAuthMediator createOAuthMediator();

	/**
	 * Returns a new object of class '<em>OAuth Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OAuth Mediator Input Connector</em>'.
	 * @generated
	 */
	OAuthMediatorInputConnector createOAuthMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>OAuth Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OAuth Mediator Output Connector</em>'.
	 * @generated
	 */
	OAuthMediatorOutputConnector createOAuthMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>Autoscale In Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Autoscale In Mediator</em>'.
	 * @generated
	 */
	AutoscaleInMediator createAutoscaleInMediator();

	/**
	 * Returns a new object of class '<em>Autoscale Out Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Autoscale Out Mediator</em>'.
	 * @generated
	 */
	AutoscaleOutMediator createAutoscaleOutMediator();

	/**
	 * Returns a new object of class '<em>Header Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Mediator</em>'.
	 * @generated
	 */
	HeaderMediator createHeaderMediator();

	/**
	 * Returns a new object of class '<em>Header Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Mediator Input Connector</em>'.
	 * @generated
	 */
	HeaderMediatorInputConnector createHeaderMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Header Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Mediator Output Connector</em>'.
	 * @generated
	 */
	HeaderMediatorOutputConnector createHeaderMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>Throttle Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Throttle Mediator</em>'.
	 * @generated
	 */
	ThrottleMediator createThrottleMediator();

	/**
	 * Returns a new object of class '<em>Throttle Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Throttle Mediator Input Connector</em>'.
	 * @generated
	 */
	ThrottleMediatorInputConnector createThrottleMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Throttle Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Throttle Mediator Output Connector</em>'.
	 * @generated
	 */
	ThrottleMediatorOutputConnector createThrottleMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>Throttle Policy Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Throttle Policy Configuration</em>'.
	 * @generated
	 */
	ThrottlePolicyConfiguration createThrottlePolicyConfiguration();

	/**
	 * Returns a new object of class '<em>Throttle Policy Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Throttle Policy Entry</em>'.
	 * @generated
	 */
	ThrottlePolicyEntry createThrottlePolicyEntry();

	/**
	 * Returns a new object of class '<em>Throttle On Accept Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Throttle On Accept Branch</em>'.
	 * @generated
	 */
	ThrottleOnAcceptBranch createThrottleOnAcceptBranch();

	/**
	 * Returns a new object of class '<em>Throttle On Reject Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Throttle On Reject Branch</em>'.
	 * @generated
	 */
	ThrottleOnRejectBranch createThrottleOnRejectBranch();

	/**
	 * Returns a new object of class '<em>Command Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Mediator</em>'.
	 * @generated
	 */
	CommandMediator createCommandMediator();

	/**
	 * Returns a new object of class '<em>Command Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Mediator Input Connector</em>'.
	 * @generated
	 */
	CommandMediatorInputConnector createCommandMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Command Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Mediator Output Connector</em>'.
	 * @generated
	 */
	CommandMediatorOutputConnector createCommandMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>Command Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Property</em>'.
	 * @generated
	 */
	CommandProperty createCommandProperty();

	/**
	 * Returns a new object of class '<em>Sql Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sql Statement</em>'.
	 * @generated
	 */
	SqlStatement createSqlStatement();

	/**
	 * Returns a new object of class '<em>Sql Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sql Parameter Definition</em>'.
	 * @generated
	 */
	SqlParameterDefinition createSqlParameterDefinition();

	/**
	 * Returns a new object of class '<em>Sql Result Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sql Result Mapping</em>'.
	 * @generated
	 */
	SqlResultMapping createSqlResultMapping();

	/**
	 * Returns a new object of class '<em>DB Lookup Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DB Lookup Mediator</em>'.
	 * @generated
	 */
	DBLookupMediator createDBLookupMediator();

	/**
	 * Returns a new object of class '<em>DB Lookup Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DB Lookup Mediator Input Connector</em>'.
	 * @generated
	 */
	DBLookupMediatorInputConnector createDBLookupMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>DB Lookup Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DB Lookup Mediator Output Connector</em>'.
	 * @generated
	 */
	DBLookupMediatorOutputConnector createDBLookupMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>DB Report Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DB Report Mediator</em>'.
	 * @generated
	 */
	DBReportMediator createDBReportMediator();

	/**
	 * Returns a new object of class '<em>DB Report Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DB Report Mediator Input Connector</em>'.
	 * @generated
	 */
	DBReportMediatorInputConnector createDBReportMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>DB Report Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DB Report Mediator Output Connector</em>'.
	 * @generated
	 */
	DBReportMediatorOutputConnector createDBReportMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>Rule Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Mediator</em>'.
	 * @generated
	 */
	RuleMediator createRuleMediator();

	/**
	 * Returns a new object of class '<em>Rule Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Mediator Input Connector</em>'.
	 * @generated
	 */
	RuleMediatorInputConnector createRuleMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Rule Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Mediator Output Connector</em>'.
	 * @generated
	 */
	RuleMediatorOutputConnector createRuleMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>Rule Set Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Set Configuration</em>'.
	 * @generated
	 */
	RuleSetConfiguration createRuleSetConfiguration();

	/**
	 * Returns a new object of class '<em>Rule Set Creation Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Set Creation Property</em>'.
	 * @generated
	 */
	RuleSetCreationProperty createRuleSetCreationProperty();

	/**
	 * Returns a new object of class '<em>Rule Session Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Session Configuration</em>'.
	 * @generated
	 */
	RuleSessionConfiguration createRuleSessionConfiguration();

	/**
	 * Returns a new object of class '<em>Rule Session Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Session Property</em>'.
	 * @generated
	 */
	RuleSessionProperty createRuleSessionProperty();

	/**
	 * Returns a new object of class '<em>Rule Facts Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Facts Configuration</em>'.
	 * @generated
	 */
	RuleFactsConfiguration createRuleFactsConfiguration();

	/**
	 * Returns a new object of class '<em>Rule Fact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Fact</em>'.
	 * @generated
	 */
	RuleFact createRuleFact();

	/**
	 * Returns a new object of class '<em>Rule Results Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Results Configuration</em>'.
	 * @generated
	 */
	RuleResultsConfiguration createRuleResultsConfiguration();

	/**
	 * Returns a new object of class '<em>Rule Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Result</em>'.
	 * @generated
	 */
	RuleResult createRuleResult();

	/**
	 * Returns a new object of class '<em>Rule Child Mediators Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Child Mediators Configuration</em>'.
	 * @generated
	 */
	RuleChildMediatorsConfiguration createRuleChildMediatorsConfiguration();

	/**
	 * Returns a new object of class '<em>Smooks Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smooks Mediator</em>'.
	 * @generated
	 */
	SmooksMediator createSmooksMediator();

	/**
	 * Returns a new object of class '<em>Smooks Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smooks Mediator Input Connector</em>'.
	 * @generated
	 */
	SmooksMediatorInputConnector createSmooksMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Smooks Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smooks Mediator Output Connector</em>'.
	 * @generated
	 */
	SmooksMediatorOutputConnector createSmooksMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>Smooks In Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smooks In Configuration</em>'.
	 * @generated
	 */
	SmooksInConfiguration createSmooksInConfiguration();

	/**
	 * Returns a new object of class '<em>Smooks Out Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smooks Out Configuration</em>'.
	 * @generated
	 */
	SmooksOutConfiguration createSmooksOutConfiguration();

	/**
	 * Returns a new object of class '<em>Store Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Store Mediator</em>'.
	 * @generated
	 */
	StoreMediator createStoreMediator();

	/**
	 * Returns a new object of class '<em>Conditional Route Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Route Branch</em>'.
	 * @generated
	 */
	ConditionalRouteBranch createConditionalRouteBranch();

	/**
	 * Returns a new object of class '<em>Conditional Router Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Router Mediator</em>'.
	 * @generated
	 */
	ConditionalRouterMediator createConditionalRouterMediator();

	/**
	 * Returns a new object of class '<em>Send Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Mediator</em>'.
	 * @generated
	 */
	SendMediator createSendMediator();

	/**
	 * Returns a new object of class '<em>Send Mediator Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Mediator Input Connector</em>'.
	 * @generated
	 */
	SendMediatorInputConnector createSendMediatorInputConnector();

	/**
	 * Returns a new object of class '<em>Send Mediator Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Mediator Output Connector</em>'.
	 * @generated
	 */
	SendMediatorOutputConnector createSendMediatorOutputConnector();

	/**
	 * Returns a new object of class '<em>Failover End Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failover End Point</em>'.
	 * @generated
	 */
	FailoverEndPoint createFailoverEndPoint();

	/**
	 * Returns a new object of class '<em>Failover End Point Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failover End Point Input Connector</em>'.
	 * @generated
	 */
	FailoverEndPointInputConnector createFailoverEndPointInputConnector();

	/**
	 * Returns a new object of class '<em>Failover End Point Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failover End Point Output Connector</em>'.
	 * @generated
	 */
	FailoverEndPointOutputConnector createFailoverEndPointOutputConnector();

	/**
	 * Returns a new object of class '<em>Failover End Point West Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failover End Point West Output Connector</em>'.
	 * @generated
	 */
	FailoverEndPointWestOutputConnector createFailoverEndPointWestOutputConnector();

	/**
	 * Returns a new object of class '<em>Parent End Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parent End Point</em>'.
	 * @generated
	 */
	ParentEndPoint createParentEndPoint();

	/**
	 * Returns a new object of class '<em>WSDL End Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WSDL End Point</em>'.
	 * @generated
	 */
	WSDLEndPoint createWSDLEndPoint();

	/**
	 * Returns a new object of class '<em>WSDL Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WSDL Definition</em>'.
	 * @generated
	 */
	WSDLDefinition createWSDLDefinition();

	/**
	 * Returns a new object of class '<em>WSDL Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WSDL Description</em>'.
	 * @generated
	 */
	WSDLDescription createWSDLDescription();

	/**
	 * Returns a new object of class '<em>WSDL End Point Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WSDL End Point Input Connector</em>'.
	 * @generated
	 */
	WSDLEndPointInputConnector createWSDLEndPointInputConnector();

	/**
	 * Returns a new object of class '<em>WSDL End Point Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WSDL End Point Output Connector</em>'.
	 * @generated
	 */
	WSDLEndPointOutputConnector createWSDLEndPointOutputConnector();

	/**
	 * Returns a new object of class '<em>Load Balance End Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Balance End Point</em>'.
	 * @generated
	 */
	LoadBalanceEndPoint createLoadBalanceEndPoint();

	/**
	 * Returns a new object of class '<em>Load Balance End Point Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Balance End Point Input Connector</em>'.
	 * @generated
	 */
	LoadBalanceEndPointInputConnector createLoadBalanceEndPointInputConnector();

	/**
	 * Returns a new object of class '<em>Load Balance End Point Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Balance End Point Output Connector</em>'.
	 * @generated
	 */
	LoadBalanceEndPointOutputConnector createLoadBalanceEndPointOutputConnector();

	/**
	 * Returns a new object of class '<em>Load Balance End Point West Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Balance End Point West Output Connector</em>'.
	 * @generated
	 */
	LoadBalanceEndPointWestOutputConnector createLoadBalanceEndPointWestOutputConnector();

	/**
	 * Returns a new object of class '<em>Local Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Entry</em>'.
	 * @generated
	 */
	LocalEntry createLocalEntry();

	/**
	 * Returns a new object of class '<em>Session</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Session</em>'.
	 * @generated
	 */
	Session createSession();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EsbPackage getEsbPackage();

} //EsbFactory
