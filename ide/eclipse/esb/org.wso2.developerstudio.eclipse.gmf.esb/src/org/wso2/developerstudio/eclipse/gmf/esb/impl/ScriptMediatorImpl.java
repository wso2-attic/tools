/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.ScriptLanguage;
import org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediatorInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediatorOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.ScriptType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ScriptMediatorImpl#getScriptType <em>Script Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ScriptMediatorImpl#getScriptLanguage <em>Script Language</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ScriptMediatorImpl#getMediateFunction <em>Mediate Function</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ScriptMediatorImpl#getScriptKey <em>Script Key</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ScriptMediatorImpl#getScriptBody <em>Script Body</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ScriptMediatorImpl#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ScriptMediatorImpl#getOutputConnector <em>Output Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScriptMediatorImpl extends MediatorImpl implements ScriptMediator {
	/**
	 * The default value of the '{@link #getScriptType() <em>Script Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptType()
	 * @generated
	 * @ordered
	 */
	protected static final ScriptType SCRIPT_TYPE_EDEFAULT = ScriptType.REGISTRY_REFERENCE;

	/**
	 * The cached value of the '{@link #getScriptType() <em>Script Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptType()
	 * @generated
	 * @ordered
	 */
	protected ScriptType scriptType = SCRIPT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScriptLanguage() <em>Script Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final ScriptLanguage SCRIPT_LANGUAGE_EDEFAULT = ScriptLanguage.JAVASCRIPT;

	/**
	 * The cached value of the '{@link #getScriptLanguage() <em>Script Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptLanguage()
	 * @generated
	 * @ordered
	 */
	protected ScriptLanguage scriptLanguage = SCRIPT_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediateFunction() <em>Mediate Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediateFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIATE_FUNCTION_EDEFAULT = "mediate";

	/**
	 * The cached value of the '{@link #getMediateFunction() <em>Mediate Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediateFunction()
	 * @generated
	 * @ordered
	 */
	protected String mediateFunction = MEDIATE_FUNCTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScriptKey() <em>Script Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptKey()
	 * @generated
	 * @ordered
	 */
	protected RegistryKeyProperty scriptKey;

	/**
	 * The default value of the '{@link #getScriptBody() <em>Script Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptBody()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_BODY_EDEFAULT = "script_code";

	/**
	 * The cached value of the '{@link #getScriptBody() <em>Script Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptBody()
	 * @generated
	 * @ordered
	 */
	protected String scriptBody = SCRIPT_BODY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputConnector() <em>Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputConnector()
	 * @generated
	 * @ordered
	 */
	protected ScriptMediatorInputConnector inputConnector;

	/**
	 * The cached value of the '{@link #getOutputConnector() <em>Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputConnector()
	 * @generated
	 * @ordered
	 */
	protected ScriptMediatorOutputConnector outputConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ScriptMediatorImpl() {
		super();
		
		// Script key.
		RegistryKeyProperty key = EsbFactoryImpl.eINSTANCE.createRegistryKeyProperty();
		key.setPrettyName("Script Key");
		key.setKeyName("key");
		key.setKeyValue(DEFAULT_REGISTRY_KEY);
		setScriptKey(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.SCRIPT_MEDIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptType getScriptType() {
		return scriptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptType(ScriptType newScriptType) {
		ScriptType oldScriptType = scriptType;
		scriptType = newScriptType == null ? SCRIPT_TYPE_EDEFAULT : newScriptType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SCRIPT_MEDIATOR__SCRIPT_TYPE, oldScriptType, scriptType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptLanguage getScriptLanguage() {
		return scriptLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptLanguage(ScriptLanguage newScriptLanguage) {
		ScriptLanguage oldScriptLanguage = scriptLanguage;
		scriptLanguage = newScriptLanguage == null ? SCRIPT_LANGUAGE_EDEFAULT : newScriptLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SCRIPT_MEDIATOR__SCRIPT_LANGUAGE, oldScriptLanguage, scriptLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMediateFunction() {
		return mediateFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediateFunction(String newMediateFunction) {
		String oldMediateFunction = mediateFunction;
		mediateFunction = newMediateFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SCRIPT_MEDIATOR__MEDIATE_FUNCTION, oldMediateFunction, mediateFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryKeyProperty getScriptKey() {
		return scriptKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScriptKey(RegistryKeyProperty newScriptKey, NotificationChain msgs) {
		RegistryKeyProperty oldScriptKey = scriptKey;
		scriptKey = newScriptKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.SCRIPT_MEDIATOR__SCRIPT_KEY, oldScriptKey, newScriptKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptKey(RegistryKeyProperty newScriptKey) {
		if (newScriptKey != scriptKey) {
			NotificationChain msgs = null;
			if (scriptKey != null)
				msgs = ((InternalEObject)scriptKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SCRIPT_MEDIATOR__SCRIPT_KEY, null, msgs);
			if (newScriptKey != null)
				msgs = ((InternalEObject)newScriptKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SCRIPT_MEDIATOR__SCRIPT_KEY, null, msgs);
			msgs = basicSetScriptKey(newScriptKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SCRIPT_MEDIATOR__SCRIPT_KEY, newScriptKey, newScriptKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScriptBody() {
		return scriptBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptBody(String newScriptBody) {
		String oldScriptBody = scriptBody;
		scriptBody = newScriptBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SCRIPT_MEDIATOR__SCRIPT_BODY, oldScriptBody, scriptBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptMediatorInputConnector getInputConnector() {
		return inputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputConnector(ScriptMediatorInputConnector newInputConnector, NotificationChain msgs) {
		ScriptMediatorInputConnector oldInputConnector = inputConnector;
		inputConnector = newInputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.SCRIPT_MEDIATOR__INPUT_CONNECTOR, oldInputConnector, newInputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputConnector(ScriptMediatorInputConnector newInputConnector) {
		if (newInputConnector != inputConnector) {
			NotificationChain msgs = null;
			if (inputConnector != null)
				msgs = ((InternalEObject)inputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SCRIPT_MEDIATOR__INPUT_CONNECTOR, null, msgs);
			if (newInputConnector != null)
				msgs = ((InternalEObject)newInputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SCRIPT_MEDIATOR__INPUT_CONNECTOR, null, msgs);
			msgs = basicSetInputConnector(newInputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SCRIPT_MEDIATOR__INPUT_CONNECTOR, newInputConnector, newInputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptMediatorOutputConnector getOutputConnector() {
		return outputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputConnector(ScriptMediatorOutputConnector newOutputConnector, NotificationChain msgs) {
		ScriptMediatorOutputConnector oldOutputConnector = outputConnector;
		outputConnector = newOutputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.SCRIPT_MEDIATOR__OUTPUT_CONNECTOR, oldOutputConnector, newOutputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputConnector(ScriptMediatorOutputConnector newOutputConnector) {
		if (newOutputConnector != outputConnector) {
			NotificationChain msgs = null;
			if (outputConnector != null)
				msgs = ((InternalEObject)outputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SCRIPT_MEDIATOR__OUTPUT_CONNECTOR, null, msgs);
			if (newOutputConnector != null)
				msgs = ((InternalEObject)newOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SCRIPT_MEDIATOR__OUTPUT_CONNECTOR, null, msgs);
			msgs = basicSetOutputConnector(newOutputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SCRIPT_MEDIATOR__OUTPUT_CONNECTOR, newOutputConnector, newOutputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.SCRIPT_MEDIATOR__SCRIPT_KEY:
				return basicSetScriptKey(null, msgs);
			case EsbPackage.SCRIPT_MEDIATOR__INPUT_CONNECTOR:
				return basicSetInputConnector(null, msgs);
			case EsbPackage.SCRIPT_MEDIATOR__OUTPUT_CONNECTOR:
				return basicSetOutputConnector(null, msgs);
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
			case EsbPackage.SCRIPT_MEDIATOR__SCRIPT_TYPE:
				return getScriptType();
			case EsbPackage.SCRIPT_MEDIATOR__SCRIPT_LANGUAGE:
				return getScriptLanguage();
			case EsbPackage.SCRIPT_MEDIATOR__MEDIATE_FUNCTION:
				return getMediateFunction();
			case EsbPackage.SCRIPT_MEDIATOR__SCRIPT_KEY:
				return getScriptKey();
			case EsbPackage.SCRIPT_MEDIATOR__SCRIPT_BODY:
				return getScriptBody();
			case EsbPackage.SCRIPT_MEDIATOR__INPUT_CONNECTOR:
				return getInputConnector();
			case EsbPackage.SCRIPT_MEDIATOR__OUTPUT_CONNECTOR:
				return getOutputConnector();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EsbPackage.SCRIPT_MEDIATOR__SCRIPT_TYPE:
				setScriptType((ScriptType)newValue);
				return;
			case EsbPackage.SCRIPT_MEDIATOR__SCRIPT_LANGUAGE:
				setScriptLanguage((ScriptLanguage)newValue);
				return;
			case EsbPackage.SCRIPT_MEDIATOR__MEDIATE_FUNCTION:
				setMediateFunction((String)newValue);
				return;
			case EsbPackage.SCRIPT_MEDIATOR__SCRIPT_KEY:
				setScriptKey((RegistryKeyProperty)newValue);
				return;
			case EsbPackage.SCRIPT_MEDIATOR__SCRIPT_BODY:
				setScriptBody((String)newValue);
				return;
			case EsbPackage.SCRIPT_MEDIATOR__INPUT_CONNECTOR:
				setInputConnector((ScriptMediatorInputConnector)newValue);
				return;
			case EsbPackage.SCRIPT_MEDIATOR__OUTPUT_CONNECTOR:
				setOutputConnector((ScriptMediatorOutputConnector)newValue);
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
			case EsbPackage.SCRIPT_MEDIATOR__SCRIPT_TYPE:
				setScriptType(SCRIPT_TYPE_EDEFAULT);
				return;
			case EsbPackage.SCRIPT_MEDIATOR__SCRIPT_LANGUAGE:
				setScriptLanguage(SCRIPT_LANGUAGE_EDEFAULT);
				return;
			case EsbPackage.SCRIPT_MEDIATOR__MEDIATE_FUNCTION:
				setMediateFunction(MEDIATE_FUNCTION_EDEFAULT);
				return;
			case EsbPackage.SCRIPT_MEDIATOR__SCRIPT_KEY:
				setScriptKey((RegistryKeyProperty)null);
				return;
			case EsbPackage.SCRIPT_MEDIATOR__SCRIPT_BODY:
				setScriptBody(SCRIPT_BODY_EDEFAULT);
				return;
			case EsbPackage.SCRIPT_MEDIATOR__INPUT_CONNECTOR:
				setInputConnector((ScriptMediatorInputConnector)null);
				return;
			case EsbPackage.SCRIPT_MEDIATOR__OUTPUT_CONNECTOR:
				setOutputConnector((ScriptMediatorOutputConnector)null);
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
			case EsbPackage.SCRIPT_MEDIATOR__SCRIPT_TYPE:
				return scriptType != SCRIPT_TYPE_EDEFAULT;
			case EsbPackage.SCRIPT_MEDIATOR__SCRIPT_LANGUAGE:
				return scriptLanguage != SCRIPT_LANGUAGE_EDEFAULT;
			case EsbPackage.SCRIPT_MEDIATOR__MEDIATE_FUNCTION:
				return MEDIATE_FUNCTION_EDEFAULT == null ? mediateFunction != null : !MEDIATE_FUNCTION_EDEFAULT.equals(mediateFunction);
			case EsbPackage.SCRIPT_MEDIATOR__SCRIPT_KEY:
				return scriptKey != null;
			case EsbPackage.SCRIPT_MEDIATOR__SCRIPT_BODY:
				return SCRIPT_BODY_EDEFAULT == null ? scriptBody != null : !SCRIPT_BODY_EDEFAULT.equals(scriptBody);
			case EsbPackage.SCRIPT_MEDIATOR__INPUT_CONNECTOR:
				return inputConnector != null;
			case EsbPackage.SCRIPT_MEDIATOR__OUTPUT_CONNECTOR:
				return outputConnector != null;
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
		result.append(" (scriptType: ");
		result.append(scriptType);
		result.append(", scriptLanguage: ");
		result.append(scriptLanguage);
		result.append(", mediateFunction: ");
		result.append(mediateFunction);
		result.append(", scriptBody: ");
		result.append(scriptBody);
		result.append(')');
		return result.toString();
	}

} //ScriptMediatorImpl
