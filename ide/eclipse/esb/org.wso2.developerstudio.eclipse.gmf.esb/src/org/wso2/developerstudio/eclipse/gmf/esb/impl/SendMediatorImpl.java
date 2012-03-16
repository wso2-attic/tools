/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.osgi.internal.module.MappedList;

import org.wso2.developerstudio.eclipse.esb.core.utils.ESBMediaTypeConstants;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.ReceivingSequenceType;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.SendMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.SendMediatorInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.SendMediatorOutputConnector;
import org.wso2.developerstudio.eclipse.platform.core.utils.CSProviderConstants;
import org.wso2.developerstudio.eclipse.platform.core.utils.DeveloperStudioProviderUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SendMediatorImpl#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SendMediatorImpl#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SendMediatorImpl#getOutputConnector <em>Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SendMediatorImpl#getReceivingSequenceType <em>Receiving Sequence Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SendMediatorImpl#getStaticReceivingSequence <em>Static Receiving Sequence</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SendMediatorImpl#getDynamicReceivingSequence <em>Dynamic Receiving Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SendMediatorImpl extends MediatorImpl implements SendMediator {
	/**
	 * The cached value of the '{@link #getEndPoint() <em>End Point</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<EndPoint> endPoint;

	/**
	 * The cached value of the '{@link #getInputConnector() <em>Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputConnector()
	 * @generated
	 * @ordered
	 */
	protected SendMediatorInputConnector inputConnector;

	/**
	 * The cached value of the '{@link #getOutputConnector() <em>Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputConnector()
	 * @generated
	 * @ordered
	 */
	protected SendMediatorOutputConnector outputConnector;

	/**
	 * The default value of the '{@link #getReceivingSequenceType() <em>Receiving Sequence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingSequenceType()
	 * @generated
	 * @ordered
	 */
	protected static final ReceivingSequenceType RECEIVING_SEQUENCE_TYPE_EDEFAULT = ReceivingSequenceType.DEFAULT;

	/**
	 * The cached value of the '{@link #getReceivingSequenceType() <em>Receiving Sequence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingSequenceType()
	 * @generated
	 * @ordered
	 */
	protected ReceivingSequenceType receivingSequenceType = RECEIVING_SEQUENCE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStaticReceivingSequence() <em>Static Receiving Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticReceivingSequence()
	 * @generated
	 * @ordered
	 */
	protected RegistryKeyProperty staticReceivingSequence;

	/**
	 * The cached value of the '{@link #getDynamicReceivingSequence() <em>Dynamic Receiving Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicReceivingSequence()
	 * @generated
	 * @ordered
	 */
	protected NamespacedProperty dynamicReceivingSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SendMediatorImpl() {
		super();
		// Static Receiving Sequence
		staticReceivingSequence = EsbFactoryImpl.eINSTANCE.createRegistryKeyProperty();
	/*	DeveloperStudioProviderUtils.addFilter(
				(Map<String, List<String>>) staticReceivingSequence
						.getFilters(), CSProviderConstants.FILTER_MEDIA_TYPE,
				ESBMediaTypeConstants.MEDIA_TYPE_SEQUENCE);*/
		staticReceivingSequence.setPrettyName("Static");
		staticReceivingSequence.setKeyName("receive");
		staticReceivingSequence
				.setKeyValue(DEFAULT_SEQUENCE_REFERENCE_REGISTRY_KEY);
		setStaticReceivingSequence(staticReceivingSequence);

		// Dynamic Receiving Sequence
		dynamicReceivingSequence = EsbFactoryImpl.eINSTANCE.createNamespacedProperty();
		dynamicReceivingSequence.setPropertyName("receive");
		dynamicReceivingSequence.setPropertyValue(DEFAULT_XPATH_PROPERTY_VALUE);
		dynamicReceivingSequence.setPrettyName("Dynamic");
		setDynamicReceivingSequence(dynamicReceivingSequence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.SEND_MEDIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndPoint> getEndPoint() {
		if (endPoint == null) {
			endPoint = new EObjectResolvingEList<EndPoint>(EndPoint.class, this, EsbPackage.SEND_MEDIATOR__END_POINT);
		}
		return endPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendMediatorInputConnector getInputConnector() {
		return inputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputConnector(SendMediatorInputConnector newInputConnector, NotificationChain msgs) {
		SendMediatorInputConnector oldInputConnector = inputConnector;
		inputConnector = newInputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.SEND_MEDIATOR__INPUT_CONNECTOR, oldInputConnector, newInputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputConnector(SendMediatorInputConnector newInputConnector) {
		if (newInputConnector != inputConnector) {
			NotificationChain msgs = null;
			if (inputConnector != null)
				msgs = ((InternalEObject)inputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SEND_MEDIATOR__INPUT_CONNECTOR, null, msgs);
			if (newInputConnector != null)
				msgs = ((InternalEObject)newInputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SEND_MEDIATOR__INPUT_CONNECTOR, null, msgs);
			msgs = basicSetInputConnector(newInputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SEND_MEDIATOR__INPUT_CONNECTOR, newInputConnector, newInputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendMediatorOutputConnector getOutputConnector() {
		return outputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputConnector(SendMediatorOutputConnector newOutputConnector, NotificationChain msgs) {
		SendMediatorOutputConnector oldOutputConnector = outputConnector;
		outputConnector = newOutputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.SEND_MEDIATOR__OUTPUT_CONNECTOR, oldOutputConnector, newOutputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputConnector(SendMediatorOutputConnector newOutputConnector) {
		if (newOutputConnector != outputConnector) {
			NotificationChain msgs = null;
			if (outputConnector != null)
				msgs = ((InternalEObject)outputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SEND_MEDIATOR__OUTPUT_CONNECTOR, null, msgs);
			if (newOutputConnector != null)
				msgs = ((InternalEObject)newOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SEND_MEDIATOR__OUTPUT_CONNECTOR, null, msgs);
			msgs = basicSetOutputConnector(newOutputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SEND_MEDIATOR__OUTPUT_CONNECTOR, newOutputConnector, newOutputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceivingSequenceType getReceivingSequenceType() {
		return receivingSequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivingSequenceType(ReceivingSequenceType newReceivingSequenceType) {
		ReceivingSequenceType oldReceivingSequenceType = receivingSequenceType;
		receivingSequenceType = newReceivingSequenceType == null ? RECEIVING_SEQUENCE_TYPE_EDEFAULT : newReceivingSequenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SEND_MEDIATOR__RECEIVING_SEQUENCE_TYPE, oldReceivingSequenceType, receivingSequenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryKeyProperty getStaticReceivingSequence() {
		return staticReceivingSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticReceivingSequence(RegistryKeyProperty newStaticReceivingSequence, NotificationChain msgs) {
		RegistryKeyProperty oldStaticReceivingSequence = staticReceivingSequence;
		staticReceivingSequence = newStaticReceivingSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.SEND_MEDIATOR__STATIC_RECEIVING_SEQUENCE, oldStaticReceivingSequence, newStaticReceivingSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticReceivingSequence(RegistryKeyProperty newStaticReceivingSequence) {
		if (newStaticReceivingSequence != staticReceivingSequence) {
			NotificationChain msgs = null;
			if (staticReceivingSequence != null)
				msgs = ((InternalEObject)staticReceivingSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SEND_MEDIATOR__STATIC_RECEIVING_SEQUENCE, null, msgs);
			if (newStaticReceivingSequence != null)
				msgs = ((InternalEObject)newStaticReceivingSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SEND_MEDIATOR__STATIC_RECEIVING_SEQUENCE, null, msgs);
			msgs = basicSetStaticReceivingSequence(newStaticReceivingSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SEND_MEDIATOR__STATIC_RECEIVING_SEQUENCE, newStaticReceivingSequence, newStaticReceivingSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacedProperty getDynamicReceivingSequence() {
		return dynamicReceivingSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamicReceivingSequence(NamespacedProperty newDynamicReceivingSequence, NotificationChain msgs) {
		NamespacedProperty oldDynamicReceivingSequence = dynamicReceivingSequence;
		dynamicReceivingSequence = newDynamicReceivingSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.SEND_MEDIATOR__DYNAMIC_RECEIVING_SEQUENCE, oldDynamicReceivingSequence, newDynamicReceivingSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicReceivingSequence(NamespacedProperty newDynamicReceivingSequence) {
		if (newDynamicReceivingSequence != dynamicReceivingSequence) {
			NotificationChain msgs = null;
			if (dynamicReceivingSequence != null)
				msgs = ((InternalEObject)dynamicReceivingSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SEND_MEDIATOR__DYNAMIC_RECEIVING_SEQUENCE, null, msgs);
			if (newDynamicReceivingSequence != null)
				msgs = ((InternalEObject)newDynamicReceivingSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SEND_MEDIATOR__DYNAMIC_RECEIVING_SEQUENCE, null, msgs);
			msgs = basicSetDynamicReceivingSequence(newDynamicReceivingSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SEND_MEDIATOR__DYNAMIC_RECEIVING_SEQUENCE, newDynamicReceivingSequence, newDynamicReceivingSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.SEND_MEDIATOR__INPUT_CONNECTOR:
				return basicSetInputConnector(null, msgs);
			case EsbPackage.SEND_MEDIATOR__OUTPUT_CONNECTOR:
				return basicSetOutputConnector(null, msgs);
			case EsbPackage.SEND_MEDIATOR__STATIC_RECEIVING_SEQUENCE:
				return basicSetStaticReceivingSequence(null, msgs);
			case EsbPackage.SEND_MEDIATOR__DYNAMIC_RECEIVING_SEQUENCE:
				return basicSetDynamicReceivingSequence(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsbPackage.SEND_MEDIATOR__END_POINT:
				return getEndPoint();
			case EsbPackage.SEND_MEDIATOR__INPUT_CONNECTOR:
				return getInputConnector();
			case EsbPackage.SEND_MEDIATOR__OUTPUT_CONNECTOR:
				return getOutputConnector();
			case EsbPackage.SEND_MEDIATOR__RECEIVING_SEQUENCE_TYPE:
				return getReceivingSequenceType();
			case EsbPackage.SEND_MEDIATOR__STATIC_RECEIVING_SEQUENCE:
				return getStaticReceivingSequence();
			case EsbPackage.SEND_MEDIATOR__DYNAMIC_RECEIVING_SEQUENCE:
				return getDynamicReceivingSequence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EsbPackage.SEND_MEDIATOR__END_POINT:
				getEndPoint().clear();
				getEndPoint().addAll((Collection<? extends EndPoint>)newValue);
				return;
			case EsbPackage.SEND_MEDIATOR__INPUT_CONNECTOR:
				setInputConnector((SendMediatorInputConnector)newValue);
				return;
			case EsbPackage.SEND_MEDIATOR__OUTPUT_CONNECTOR:
				setOutputConnector((SendMediatorOutputConnector)newValue);
				return;
			case EsbPackage.SEND_MEDIATOR__RECEIVING_SEQUENCE_TYPE:
				setReceivingSequenceType((ReceivingSequenceType)newValue);
				return;
			case EsbPackage.SEND_MEDIATOR__STATIC_RECEIVING_SEQUENCE:
				setStaticReceivingSequence((RegistryKeyProperty)newValue);
				return;
			case EsbPackage.SEND_MEDIATOR__DYNAMIC_RECEIVING_SEQUENCE:
				setDynamicReceivingSequence((NamespacedProperty)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EsbPackage.SEND_MEDIATOR__END_POINT:
				getEndPoint().clear();
				return;
			case EsbPackage.SEND_MEDIATOR__INPUT_CONNECTOR:
				setInputConnector((SendMediatorInputConnector)null);
				return;
			case EsbPackage.SEND_MEDIATOR__OUTPUT_CONNECTOR:
				setOutputConnector((SendMediatorOutputConnector)null);
				return;
			case EsbPackage.SEND_MEDIATOR__RECEIVING_SEQUENCE_TYPE:
				setReceivingSequenceType(RECEIVING_SEQUENCE_TYPE_EDEFAULT);
				return;
			case EsbPackage.SEND_MEDIATOR__STATIC_RECEIVING_SEQUENCE:
				setStaticReceivingSequence((RegistryKeyProperty)null);
				return;
			case EsbPackage.SEND_MEDIATOR__DYNAMIC_RECEIVING_SEQUENCE:
				setDynamicReceivingSequence((NamespacedProperty)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EsbPackage.SEND_MEDIATOR__END_POINT:
				return endPoint != null && !endPoint.isEmpty();
			case EsbPackage.SEND_MEDIATOR__INPUT_CONNECTOR:
				return inputConnector != null;
			case EsbPackage.SEND_MEDIATOR__OUTPUT_CONNECTOR:
				return outputConnector != null;
			case EsbPackage.SEND_MEDIATOR__RECEIVING_SEQUENCE_TYPE:
				return receivingSequenceType != RECEIVING_SEQUENCE_TYPE_EDEFAULT;
			case EsbPackage.SEND_MEDIATOR__STATIC_RECEIVING_SEQUENCE:
				return staticReceivingSequence != null;
			case EsbPackage.SEND_MEDIATOR__DYNAMIC_RECEIVING_SEQUENCE:
				return dynamicReceivingSequence != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (receivingSequenceType: ");
		result.append(receivingSequenceType);
		result.append(')');
		return result.toString();
	}

} //SendMediatorImpl
