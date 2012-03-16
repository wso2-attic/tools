/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.wso2.developerstudio.eclipse.gmf.esb.EnrichSourceType;
import org.wso2.developerstudio.eclipse.gmf.esb.EnrichTargetAction;
import org.wso2.developerstudio.eclipse.gmf.esb.EnrichTargetType;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.Mediator;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequence;
import org.wso2.developerstudio.eclipse.gmf.esb.SequenceInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.SequenceOutputConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SequenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SequenceImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SequenceImpl#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SequenceImpl#getOutputConnector <em>Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SequenceImpl#getIncludedMediators <em>Included Mediators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceImpl extends MediatorImpl implements Sequence {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = "<inline/>";

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputConnector() <em>Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputConnector()
	 * @generated
	 * @ordered
	 */
	protected SequenceInputConnector inputConnector;

	/**
	 * The cached value of the '{@link #getOutputConnector() <em>Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputConnector()
	 * @generated
	 * @ordered
	 */
	protected SequenceOutputConnector outputConnector;

	/**
	 * The cached value of the '{@link #getIncludedMediators() <em>Included Mediators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedMediators()
	 * @generated
	 * @ordered
	 */
	protected EList<Mediator> includedMediators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	protected EClass eStaticClass() {
		return EsbPackage.Literals.SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SEQUENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SEQUENCE__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceInputConnector getInputConnector() {
		return inputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputConnector(SequenceInputConnector newInputConnector, NotificationChain msgs) {
		SequenceInputConnector oldInputConnector = inputConnector;
		inputConnector = newInputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.SEQUENCE__INPUT_CONNECTOR, oldInputConnector, newInputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputConnector(SequenceInputConnector newInputConnector) {
		if (newInputConnector != inputConnector) {
			NotificationChain msgs = null;
			if (inputConnector != null)
				msgs = ((InternalEObject)inputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SEQUENCE__INPUT_CONNECTOR, null, msgs);
			if (newInputConnector != null)
				msgs = ((InternalEObject)newInputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SEQUENCE__INPUT_CONNECTOR, null, msgs);
			msgs = basicSetInputConnector(newInputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SEQUENCE__INPUT_CONNECTOR, newInputConnector, newInputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceOutputConnector getOutputConnector() {
		return outputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputConnector(SequenceOutputConnector newOutputConnector, NotificationChain msgs) {
		SequenceOutputConnector oldOutputConnector = outputConnector;
		outputConnector = newOutputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.SEQUENCE__OUTPUT_CONNECTOR, oldOutputConnector, newOutputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputConnector(SequenceOutputConnector newOutputConnector) {
		if (newOutputConnector != outputConnector) {
			NotificationChain msgs = null;
			if (outputConnector != null)
				msgs = ((InternalEObject)outputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SEQUENCE__OUTPUT_CONNECTOR, null, msgs);
			if (newOutputConnector != null)
				msgs = ((InternalEObject)newOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SEQUENCE__OUTPUT_CONNECTOR, null, msgs);
			msgs = basicSetOutputConnector(newOutputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SEQUENCE__OUTPUT_CONNECTOR, newOutputConnector, newOutputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mediator> getIncludedMediators() {
		if (includedMediators == null) {
			includedMediators = new EObjectContainmentEList<Mediator>(Mediator.class, this, EsbPackage.SEQUENCE__INCLUDED_MEDIATORS);
		}
		return includedMediators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.SEQUENCE__INPUT_CONNECTOR:
				return basicSetInputConnector(null, msgs);
			case EsbPackage.SEQUENCE__OUTPUT_CONNECTOR:
				return basicSetOutputConnector(null, msgs);
			case EsbPackage.SEQUENCE__INCLUDED_MEDIATORS:
				return ((InternalEList<?>)getIncludedMediators()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsbPackage.SEQUENCE__NAME:
				return getName();
			case EsbPackage.SEQUENCE__KEY:
				return getKey();
			case EsbPackage.SEQUENCE__INPUT_CONNECTOR:
				return getInputConnector();
			case EsbPackage.SEQUENCE__OUTPUT_CONNECTOR:
				return getOutputConnector();
			case EsbPackage.SEQUENCE__INCLUDED_MEDIATORS:
				return getIncludedMediators();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@SuppressWarnings("unchecked")
	
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EsbPackage.SEQUENCE__NAME:
				setName((String)newValue);
				return;
			case EsbPackage.SEQUENCE__KEY:
				setKey((String)newValue);
				return;
			case EsbPackage.SEQUENCE__INPUT_CONNECTOR:
				setInputConnector((SequenceInputConnector)newValue);
				return;
			case EsbPackage.SEQUENCE__OUTPUT_CONNECTOR:
				setOutputConnector((SequenceOutputConnector)newValue);
				return;
			case EsbPackage.SEQUENCE__INCLUDED_MEDIATORS:
				getIncludedMediators().clear();
				getIncludedMediators().addAll((Collection<? extends Mediator>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public void eUnset(int featureID) {
		switch (featureID) {
			case EsbPackage.SEQUENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EsbPackage.SEQUENCE__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case EsbPackage.SEQUENCE__INPUT_CONNECTOR:
				setInputConnector((SequenceInputConnector)null);
				return;
			case EsbPackage.SEQUENCE__OUTPUT_CONNECTOR:
				setOutputConnector((SequenceOutputConnector)null);
				return;
			case EsbPackage.SEQUENCE__INCLUDED_MEDIATORS:
				getIncludedMediators().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EsbPackage.SEQUENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EsbPackage.SEQUENCE__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case EsbPackage.SEQUENCE__INPUT_CONNECTOR:
				return inputConnector != null;
			case EsbPackage.SEQUENCE__OUTPUT_CONNECTOR:
				return outputConnector != null;
			case EsbPackage.SEQUENCE__INCLUDED_MEDIATORS:
				return includedMediators != null && !includedMediators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", key: ");
		result.append(key);
		result.append(')');
		return result.toString();
	}

} //SequenceImpl
