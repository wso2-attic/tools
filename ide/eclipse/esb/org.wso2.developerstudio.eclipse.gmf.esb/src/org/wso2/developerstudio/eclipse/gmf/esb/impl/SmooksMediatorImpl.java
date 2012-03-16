/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.impl;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.SmooksInConfiguration;
import org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediatorInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediatorOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.SmooksOutConfiguration;
import org.wso2.developerstudio.eclipse.platform.core.mediatype.PlatformMediaTypeConstants;
import org.wso2.developerstudio.eclipse.platform.core.utils.CSProviderConstants;
import org.wso2.developerstudio.eclipse.platform.core.utils.DeveloperStudioProviderUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smooks Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksMediatorImpl#getConfigurationKey <em>Configuration Key</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksMediatorImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksMediatorImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksMediatorImpl#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.SmooksMediatorImpl#getOutputConnector <em>Output Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SmooksMediatorImpl extends MediatorImpl implements SmooksMediator {
	/**
	 * The cached value of the '{@link #getConfigurationKey() <em>Configuration Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationKey()
	 * @generated
	 * @ordered
	 */
	protected RegistryKeyProperty configurationKey;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected SmooksInConfiguration input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected SmooksOutConfiguration output;

	/**
	 * The cached value of the '{@link #getInputConnector() <em>Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputConnector()
	 * @generated
	 * @ordered
	 */
	protected SmooksMediatorInputConnector inputConnector;

	/**
	 * The cached value of the '{@link #getOutputConnector() <em>Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputConnector()
	 * @generated
	 * @ordered
	 */
	protected SmooksMediatorOutputConnector outputConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SmooksMediatorImpl() {
		super();
		
		// Configuration key.
		RegistryKeyProperty configurationKey = EsbFactoryImpl.eINSTANCE.createRegistryKeyProperty();
		DeveloperStudioProviderUtils.addFilter((Map<String, List<String>>)configurationKey.getFilters(), CSProviderConstants.FILTER_MEDIA_TYPE, PlatformMediaTypeConstants.MEDIA_TYPE_SMOOKS);
		configurationKey.setPrettyName("Configuration Key");
		configurationKey.setKeyName("config-key");
		configurationKey.setKeyValue(DEFAULT_REGISTRY_KEY);
		setConfigurationKey(configurationKey);
		
		//Smooks input configurations
		setInput(EsbFactoryImpl.eINSTANCE.createSmooksInConfiguration());

		//Smooks output configurations
		setOutput(EsbFactoryImpl.eINSTANCE.createSmooksOutConfiguration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	protected EClass eStaticClass() {
		return EsbPackage.Literals.SMOOKS_MEDIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryKeyProperty getConfigurationKey() {
		return configurationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurationKey(RegistryKeyProperty newConfigurationKey, NotificationChain msgs) {
		RegistryKeyProperty oldConfigurationKey = configurationKey;
		configurationKey = newConfigurationKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.SMOOKS_MEDIATOR__CONFIGURATION_KEY, oldConfigurationKey, newConfigurationKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationKey(RegistryKeyProperty newConfigurationKey) {
		if (newConfigurationKey != configurationKey) {
			NotificationChain msgs = null;
			if (configurationKey != null)
				msgs = ((InternalEObject)configurationKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SMOOKS_MEDIATOR__CONFIGURATION_KEY, null, msgs);
			if (newConfigurationKey != null)
				msgs = ((InternalEObject)newConfigurationKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SMOOKS_MEDIATOR__CONFIGURATION_KEY, null, msgs);
			msgs = basicSetConfigurationKey(newConfigurationKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SMOOKS_MEDIATOR__CONFIGURATION_KEY, newConfigurationKey, newConfigurationKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmooksInConfiguration getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(SmooksInConfiguration newInput, NotificationChain msgs) {
		SmooksInConfiguration oldInput = input;
		input = newInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.SMOOKS_MEDIATOR__INPUT, oldInput, newInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(SmooksInConfiguration newInput) {
		if (newInput != input) {
			NotificationChain msgs = null;
			if (input != null)
				msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SMOOKS_MEDIATOR__INPUT, null, msgs);
			if (newInput != null)
				msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SMOOKS_MEDIATOR__INPUT, null, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SMOOKS_MEDIATOR__INPUT, newInput, newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmooksOutConfiguration getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(SmooksOutConfiguration newOutput, NotificationChain msgs) {
		SmooksOutConfiguration oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.SMOOKS_MEDIATOR__OUTPUT, oldOutput, newOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(SmooksOutConfiguration newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SMOOKS_MEDIATOR__OUTPUT, null, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SMOOKS_MEDIATOR__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SMOOKS_MEDIATOR__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmooksMediatorInputConnector getInputConnector() {
		return inputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputConnector(SmooksMediatorInputConnector newInputConnector, NotificationChain msgs) {
		SmooksMediatorInputConnector oldInputConnector = inputConnector;
		inputConnector = newInputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.SMOOKS_MEDIATOR__INPUT_CONNECTOR, oldInputConnector, newInputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputConnector(SmooksMediatorInputConnector newInputConnector) {
		if (newInputConnector != inputConnector) {
			NotificationChain msgs = null;
			if (inputConnector != null)
				msgs = ((InternalEObject)inputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SMOOKS_MEDIATOR__INPUT_CONNECTOR, null, msgs);
			if (newInputConnector != null)
				msgs = ((InternalEObject)newInputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SMOOKS_MEDIATOR__INPUT_CONNECTOR, null, msgs);
			msgs = basicSetInputConnector(newInputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SMOOKS_MEDIATOR__INPUT_CONNECTOR, newInputConnector, newInputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmooksMediatorOutputConnector getOutputConnector() {
		return outputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputConnector(SmooksMediatorOutputConnector newOutputConnector, NotificationChain msgs) {
		SmooksMediatorOutputConnector oldOutputConnector = outputConnector;
		outputConnector = newOutputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.SMOOKS_MEDIATOR__OUTPUT_CONNECTOR, oldOutputConnector, newOutputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputConnector(SmooksMediatorOutputConnector newOutputConnector) {
		if (newOutputConnector != outputConnector) {
			NotificationChain msgs = null;
			if (outputConnector != null)
				msgs = ((InternalEObject)outputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SMOOKS_MEDIATOR__OUTPUT_CONNECTOR, null, msgs);
			if (newOutputConnector != null)
				msgs = ((InternalEObject)newOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SMOOKS_MEDIATOR__OUTPUT_CONNECTOR, null, msgs);
			msgs = basicSetOutputConnector(newOutputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SMOOKS_MEDIATOR__OUTPUT_CONNECTOR, newOutputConnector, newOutputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.SMOOKS_MEDIATOR__CONFIGURATION_KEY:
				return basicSetConfigurationKey(null, msgs);
			case EsbPackage.SMOOKS_MEDIATOR__INPUT:
				return basicSetInput(null, msgs);
			case EsbPackage.SMOOKS_MEDIATOR__OUTPUT:
				return basicSetOutput(null, msgs);
			case EsbPackage.SMOOKS_MEDIATOR__INPUT_CONNECTOR:
				return basicSetInputConnector(null, msgs);
			case EsbPackage.SMOOKS_MEDIATOR__OUTPUT_CONNECTOR:
				return basicSetOutputConnector(null, msgs);
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
			case EsbPackage.SMOOKS_MEDIATOR__CONFIGURATION_KEY:
				return getConfigurationKey();
			case EsbPackage.SMOOKS_MEDIATOR__INPUT:
				return getInput();
			case EsbPackage.SMOOKS_MEDIATOR__OUTPUT:
				return getOutput();
			case EsbPackage.SMOOKS_MEDIATOR__INPUT_CONNECTOR:
				return getInputConnector();
			case EsbPackage.SMOOKS_MEDIATOR__OUTPUT_CONNECTOR:
				return getOutputConnector();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EsbPackage.SMOOKS_MEDIATOR__CONFIGURATION_KEY:
				setConfigurationKey((RegistryKeyProperty)newValue);
				return;
			case EsbPackage.SMOOKS_MEDIATOR__INPUT:
				setInput((SmooksInConfiguration)newValue);
				return;
			case EsbPackage.SMOOKS_MEDIATOR__OUTPUT:
				setOutput((SmooksOutConfiguration)newValue);
				return;
			case EsbPackage.SMOOKS_MEDIATOR__INPUT_CONNECTOR:
				setInputConnector((SmooksMediatorInputConnector)newValue);
				return;
			case EsbPackage.SMOOKS_MEDIATOR__OUTPUT_CONNECTOR:
				setOutputConnector((SmooksMediatorOutputConnector)newValue);
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
			case EsbPackage.SMOOKS_MEDIATOR__CONFIGURATION_KEY:
				setConfigurationKey((RegistryKeyProperty)null);
				return;
			case EsbPackage.SMOOKS_MEDIATOR__INPUT:
				setInput((SmooksInConfiguration)null);
				return;
			case EsbPackage.SMOOKS_MEDIATOR__OUTPUT:
				setOutput((SmooksOutConfiguration)null);
				return;
			case EsbPackage.SMOOKS_MEDIATOR__INPUT_CONNECTOR:
				setInputConnector((SmooksMediatorInputConnector)null);
				return;
			case EsbPackage.SMOOKS_MEDIATOR__OUTPUT_CONNECTOR:
				setOutputConnector((SmooksMediatorOutputConnector)null);
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
			case EsbPackage.SMOOKS_MEDIATOR__CONFIGURATION_KEY:
				return configurationKey != null;
			case EsbPackage.SMOOKS_MEDIATOR__INPUT:
				return input != null;
			case EsbPackage.SMOOKS_MEDIATOR__OUTPUT:
				return output != null;
			case EsbPackage.SMOOKS_MEDIATOR__INPUT_CONNECTOR:
				return inputConnector != null;
			case EsbPackage.SMOOKS_MEDIATOR__OUTPUT_CONNECTOR:
				return outputConnector != null;
		}
		return super.eIsSet(featureID);
	}

} //SmooksMediatorImpl
