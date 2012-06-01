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
import org.wso2.developerstudio.eclipse.gmf.esb.ThrottleContainer;
import org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediatorInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediatorOnAcceptOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediatorOnRejectOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediatorOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.ThrottleOnAcceptBranch;
import org.wso2.developerstudio.eclipse.gmf.esb.ThrottleOnRejectBranch;
import org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Throttle Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleMediatorImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleMediatorImpl#getPolicyConfiguration <em>Policy Configuration</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleMediatorImpl#getOnAcceptBranch <em>On Accept Branch</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleMediatorImpl#getOnRejectBranch <em>On Reject Branch</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleMediatorImpl#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleMediatorImpl#getOutputConnector <em>Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleMediatorImpl#getOnAcceptOutputConnector <em>On Accept Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleMediatorImpl#getOnRejectOutputConnector <em>On Reject Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ThrottleMediatorImpl#getThrottleContainer <em>Throttle Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThrottleMediatorImpl extends MediatorImpl implements ThrottleMediator {
	/**
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = "group_id";

	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected String groupId = GROUP_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPolicyConfiguration() <em>Policy Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ThrottlePolicyConfiguration policyConfiguration;

	/**
	 * The cached value of the '{@link #getOnAcceptBranch() <em>On Accept Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnAcceptBranch()
	 * @generated
	 * @ordered
	 */
	protected ThrottleOnAcceptBranch onAcceptBranch;

	/**
	 * The cached value of the '{@link #getOnRejectBranch() <em>On Reject Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnRejectBranch()
	 * @generated
	 * @ordered
	 */
	protected ThrottleOnRejectBranch onRejectBranch;

	/**
	 * The cached value of the '{@link #getInputConnector() <em>Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputConnector()
	 * @generated
	 * @ordered
	 */
	protected ThrottleMediatorInputConnector inputConnector;

	/**
	 * The cached value of the '{@link #getOutputConnector() <em>Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputConnector()
	 * @generated
	 * @ordered
	 */
	protected ThrottleMediatorOutputConnector outputConnector;

	/**
	 * The cached value of the '{@link #getOnAcceptOutputConnector() <em>On Accept Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getOnAcceptOutputConnector()
	 * @generated
	 * @ordered
	 */
    protected ThrottleMediatorOnAcceptOutputConnector onAcceptOutputConnector;

    /**
	 * The cached value of the '{@link #getOnRejectOutputConnector() <em>On Reject Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getOnRejectOutputConnector()
	 * @generated
	 * @ordered
	 */
    protected ThrottleMediatorOnRejectOutputConnector onRejectOutputConnector;

    /**
	 * The cached value of the '{@link #getThrottleContainer() <em>Throttle Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getThrottleContainer()
	 * @generated
	 * @ordered
	 */
    protected ThrottleContainer throttleContainer;

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThrottleMediatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.THROTTLE_MEDIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupId(String newGroupId) {
		String oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.THROTTLE_MEDIATOR__GROUP_ID, oldGroupId, groupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrottlePolicyConfiguration getPolicyConfiguration() {
		return policyConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicyConfiguration(ThrottlePolicyConfiguration newPolicyConfiguration, NotificationChain msgs) {
		ThrottlePolicyConfiguration oldPolicyConfiguration = policyConfiguration;
		policyConfiguration = newPolicyConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.THROTTLE_MEDIATOR__POLICY_CONFIGURATION, oldPolicyConfiguration, newPolicyConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyConfiguration(ThrottlePolicyConfiguration newPolicyConfiguration) {
		if (newPolicyConfiguration != policyConfiguration) {
			NotificationChain msgs = null;
			if (policyConfiguration != null)
				msgs = ((InternalEObject)policyConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.THROTTLE_MEDIATOR__POLICY_CONFIGURATION, null, msgs);
			if (newPolicyConfiguration != null)
				msgs = ((InternalEObject)newPolicyConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.THROTTLE_MEDIATOR__POLICY_CONFIGURATION, null, msgs);
			msgs = basicSetPolicyConfiguration(newPolicyConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.THROTTLE_MEDIATOR__POLICY_CONFIGURATION, newPolicyConfiguration, newPolicyConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrottleOnAcceptBranch getOnAcceptBranch() {
		return onAcceptBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnAcceptBranch(ThrottleOnAcceptBranch newOnAcceptBranch, NotificationChain msgs) {
		ThrottleOnAcceptBranch oldOnAcceptBranch = onAcceptBranch;
		onAcceptBranch = newOnAcceptBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.THROTTLE_MEDIATOR__ON_ACCEPT_BRANCH, oldOnAcceptBranch, newOnAcceptBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnAcceptBranch(ThrottleOnAcceptBranch newOnAcceptBranch) {
		if (newOnAcceptBranch != onAcceptBranch) {
			NotificationChain msgs = null;
			if (onAcceptBranch != null)
				msgs = ((InternalEObject)onAcceptBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.THROTTLE_MEDIATOR__ON_ACCEPT_BRANCH, null, msgs);
			if (newOnAcceptBranch != null)
				msgs = ((InternalEObject)newOnAcceptBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.THROTTLE_MEDIATOR__ON_ACCEPT_BRANCH, null, msgs);
			msgs = basicSetOnAcceptBranch(newOnAcceptBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.THROTTLE_MEDIATOR__ON_ACCEPT_BRANCH, newOnAcceptBranch, newOnAcceptBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrottleOnRejectBranch getOnRejectBranch() {
		return onRejectBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnRejectBranch(ThrottleOnRejectBranch newOnRejectBranch, NotificationChain msgs) {
		ThrottleOnRejectBranch oldOnRejectBranch = onRejectBranch;
		onRejectBranch = newOnRejectBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.THROTTLE_MEDIATOR__ON_REJECT_BRANCH, oldOnRejectBranch, newOnRejectBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnRejectBranch(ThrottleOnRejectBranch newOnRejectBranch) {
		if (newOnRejectBranch != onRejectBranch) {
			NotificationChain msgs = null;
			if (onRejectBranch != null)
				msgs = ((InternalEObject)onRejectBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.THROTTLE_MEDIATOR__ON_REJECT_BRANCH, null, msgs);
			if (newOnRejectBranch != null)
				msgs = ((InternalEObject)newOnRejectBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.THROTTLE_MEDIATOR__ON_REJECT_BRANCH, null, msgs);
			msgs = basicSetOnRejectBranch(newOnRejectBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.THROTTLE_MEDIATOR__ON_REJECT_BRANCH, newOnRejectBranch, newOnRejectBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrottleMediatorInputConnector getInputConnector() {
		return inputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputConnector(ThrottleMediatorInputConnector newInputConnector, NotificationChain msgs) {
		ThrottleMediatorInputConnector oldInputConnector = inputConnector;
		inputConnector = newInputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.THROTTLE_MEDIATOR__INPUT_CONNECTOR, oldInputConnector, newInputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputConnector(ThrottleMediatorInputConnector newInputConnector) {
		if (newInputConnector != inputConnector) {
			NotificationChain msgs = null;
			if (inputConnector != null)
				msgs = ((InternalEObject)inputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.THROTTLE_MEDIATOR__INPUT_CONNECTOR, null, msgs);
			if (newInputConnector != null)
				msgs = ((InternalEObject)newInputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.THROTTLE_MEDIATOR__INPUT_CONNECTOR, null, msgs);
			msgs = basicSetInputConnector(newInputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.THROTTLE_MEDIATOR__INPUT_CONNECTOR, newInputConnector, newInputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrottleMediatorOutputConnector getOutputConnector() {
		return outputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputConnector(ThrottleMediatorOutputConnector newOutputConnector, NotificationChain msgs) {
		ThrottleMediatorOutputConnector oldOutputConnector = outputConnector;
		outputConnector = newOutputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.THROTTLE_MEDIATOR__OUTPUT_CONNECTOR, oldOutputConnector, newOutputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputConnector(ThrottleMediatorOutputConnector newOutputConnector) {
		if (newOutputConnector != outputConnector) {
			NotificationChain msgs = null;
			if (outputConnector != null)
				msgs = ((InternalEObject)outputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.THROTTLE_MEDIATOR__OUTPUT_CONNECTOR, null, msgs);
			if (newOutputConnector != null)
				msgs = ((InternalEObject)newOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.THROTTLE_MEDIATOR__OUTPUT_CONNECTOR, null, msgs);
			msgs = basicSetOutputConnector(newOutputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.THROTTLE_MEDIATOR__OUTPUT_CONNECTOR, newOutputConnector, newOutputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ThrottleMediatorOnAcceptOutputConnector getOnAcceptOutputConnector() {
		return onAcceptOutputConnector;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetOnAcceptOutputConnector(ThrottleMediatorOnAcceptOutputConnector newOnAcceptOutputConnector, NotificationChain msgs) {
		ThrottleMediatorOnAcceptOutputConnector oldOnAcceptOutputConnector = onAcceptOutputConnector;
		onAcceptOutputConnector = newOnAcceptOutputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.THROTTLE_MEDIATOR__ON_ACCEPT_OUTPUT_CONNECTOR, oldOnAcceptOutputConnector, newOnAcceptOutputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setOnAcceptOutputConnector(ThrottleMediatorOnAcceptOutputConnector newOnAcceptOutputConnector) {
		if (newOnAcceptOutputConnector != onAcceptOutputConnector) {
			NotificationChain msgs = null;
			if (onAcceptOutputConnector != null)
				msgs = ((InternalEObject)onAcceptOutputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.THROTTLE_MEDIATOR__ON_ACCEPT_OUTPUT_CONNECTOR, null, msgs);
			if (newOnAcceptOutputConnector != null)
				msgs = ((InternalEObject)newOnAcceptOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.THROTTLE_MEDIATOR__ON_ACCEPT_OUTPUT_CONNECTOR, null, msgs);
			msgs = basicSetOnAcceptOutputConnector(newOnAcceptOutputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.THROTTLE_MEDIATOR__ON_ACCEPT_OUTPUT_CONNECTOR, newOnAcceptOutputConnector, newOnAcceptOutputConnector));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ThrottleMediatorOnRejectOutputConnector getOnRejectOutputConnector() {
		return onRejectOutputConnector;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetOnRejectOutputConnector(ThrottleMediatorOnRejectOutputConnector newOnRejectOutputConnector, NotificationChain msgs) {
		ThrottleMediatorOnRejectOutputConnector oldOnRejectOutputConnector = onRejectOutputConnector;
		onRejectOutputConnector = newOnRejectOutputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.THROTTLE_MEDIATOR__ON_REJECT_OUTPUT_CONNECTOR, oldOnRejectOutputConnector, newOnRejectOutputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setOnRejectOutputConnector(ThrottleMediatorOnRejectOutputConnector newOnRejectOutputConnector) {
		if (newOnRejectOutputConnector != onRejectOutputConnector) {
			NotificationChain msgs = null;
			if (onRejectOutputConnector != null)
				msgs = ((InternalEObject)onRejectOutputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.THROTTLE_MEDIATOR__ON_REJECT_OUTPUT_CONNECTOR, null, msgs);
			if (newOnRejectOutputConnector != null)
				msgs = ((InternalEObject)newOnRejectOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.THROTTLE_MEDIATOR__ON_REJECT_OUTPUT_CONNECTOR, null, msgs);
			msgs = basicSetOnRejectOutputConnector(newOnRejectOutputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.THROTTLE_MEDIATOR__ON_REJECT_OUTPUT_CONNECTOR, newOnRejectOutputConnector, newOnRejectOutputConnector));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ThrottleContainer getThrottleContainer() {
		return throttleContainer;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetThrottleContainer(ThrottleContainer newThrottleContainer, NotificationChain msgs) {
		ThrottleContainer oldThrottleContainer = throttleContainer;
		throttleContainer = newThrottleContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.THROTTLE_MEDIATOR__THROTTLE_CONTAINER, oldThrottleContainer, newThrottleContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setThrottleContainer(ThrottleContainer newThrottleContainer) {
		if (newThrottleContainer != throttleContainer) {
			NotificationChain msgs = null;
			if (throttleContainer != null)
				msgs = ((InternalEObject)throttleContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.THROTTLE_MEDIATOR__THROTTLE_CONTAINER, null, msgs);
			if (newThrottleContainer != null)
				msgs = ((InternalEObject)newThrottleContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.THROTTLE_MEDIATOR__THROTTLE_CONTAINER, null, msgs);
			msgs = basicSetThrottleContainer(newThrottleContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.THROTTLE_MEDIATOR__THROTTLE_CONTAINER, newThrottleContainer, newThrottleContainer));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.THROTTLE_MEDIATOR__POLICY_CONFIGURATION:
				return basicSetPolicyConfiguration(null, msgs);
			case EsbPackage.THROTTLE_MEDIATOR__ON_ACCEPT_BRANCH:
				return basicSetOnAcceptBranch(null, msgs);
			case EsbPackage.THROTTLE_MEDIATOR__ON_REJECT_BRANCH:
				return basicSetOnRejectBranch(null, msgs);
			case EsbPackage.THROTTLE_MEDIATOR__INPUT_CONNECTOR:
				return basicSetInputConnector(null, msgs);
			case EsbPackage.THROTTLE_MEDIATOR__OUTPUT_CONNECTOR:
				return basicSetOutputConnector(null, msgs);
			case EsbPackage.THROTTLE_MEDIATOR__ON_ACCEPT_OUTPUT_CONNECTOR:
				return basicSetOnAcceptOutputConnector(null, msgs);
			case EsbPackage.THROTTLE_MEDIATOR__ON_REJECT_OUTPUT_CONNECTOR:
				return basicSetOnRejectOutputConnector(null, msgs);
			case EsbPackage.THROTTLE_MEDIATOR__THROTTLE_CONTAINER:
				return basicSetThrottleContainer(null, msgs);
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
			case EsbPackage.THROTTLE_MEDIATOR__GROUP_ID:
				return getGroupId();
			case EsbPackage.THROTTLE_MEDIATOR__POLICY_CONFIGURATION:
				return getPolicyConfiguration();
			case EsbPackage.THROTTLE_MEDIATOR__ON_ACCEPT_BRANCH:
				return getOnAcceptBranch();
			case EsbPackage.THROTTLE_MEDIATOR__ON_REJECT_BRANCH:
				return getOnRejectBranch();
			case EsbPackage.THROTTLE_MEDIATOR__INPUT_CONNECTOR:
				return getInputConnector();
			case EsbPackage.THROTTLE_MEDIATOR__OUTPUT_CONNECTOR:
				return getOutputConnector();
			case EsbPackage.THROTTLE_MEDIATOR__ON_ACCEPT_OUTPUT_CONNECTOR:
				return getOnAcceptOutputConnector();
			case EsbPackage.THROTTLE_MEDIATOR__ON_REJECT_OUTPUT_CONNECTOR:
				return getOnRejectOutputConnector();
			case EsbPackage.THROTTLE_MEDIATOR__THROTTLE_CONTAINER:
				return getThrottleContainer();
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
			case EsbPackage.THROTTLE_MEDIATOR__GROUP_ID:
				setGroupId((String)newValue);
				return;
			case EsbPackage.THROTTLE_MEDIATOR__POLICY_CONFIGURATION:
				setPolicyConfiguration((ThrottlePolicyConfiguration)newValue);
				return;
			case EsbPackage.THROTTLE_MEDIATOR__ON_ACCEPT_BRANCH:
				setOnAcceptBranch((ThrottleOnAcceptBranch)newValue);
				return;
			case EsbPackage.THROTTLE_MEDIATOR__ON_REJECT_BRANCH:
				setOnRejectBranch((ThrottleOnRejectBranch)newValue);
				return;
			case EsbPackage.THROTTLE_MEDIATOR__INPUT_CONNECTOR:
				setInputConnector((ThrottleMediatorInputConnector)newValue);
				return;
			case EsbPackage.THROTTLE_MEDIATOR__OUTPUT_CONNECTOR:
				setOutputConnector((ThrottleMediatorOutputConnector)newValue);
				return;
			case EsbPackage.THROTTLE_MEDIATOR__ON_ACCEPT_OUTPUT_CONNECTOR:
				setOnAcceptOutputConnector((ThrottleMediatorOnAcceptOutputConnector)newValue);
				return;
			case EsbPackage.THROTTLE_MEDIATOR__ON_REJECT_OUTPUT_CONNECTOR:
				setOnRejectOutputConnector((ThrottleMediatorOnRejectOutputConnector)newValue);
				return;
			case EsbPackage.THROTTLE_MEDIATOR__THROTTLE_CONTAINER:
				setThrottleContainer((ThrottleContainer)newValue);
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
			case EsbPackage.THROTTLE_MEDIATOR__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case EsbPackage.THROTTLE_MEDIATOR__POLICY_CONFIGURATION:
				setPolicyConfiguration((ThrottlePolicyConfiguration)null);
				return;
			case EsbPackage.THROTTLE_MEDIATOR__ON_ACCEPT_BRANCH:
				setOnAcceptBranch((ThrottleOnAcceptBranch)null);
				return;
			case EsbPackage.THROTTLE_MEDIATOR__ON_REJECT_BRANCH:
				setOnRejectBranch((ThrottleOnRejectBranch)null);
				return;
			case EsbPackage.THROTTLE_MEDIATOR__INPUT_CONNECTOR:
				setInputConnector((ThrottleMediatorInputConnector)null);
				return;
			case EsbPackage.THROTTLE_MEDIATOR__OUTPUT_CONNECTOR:
				setOutputConnector((ThrottleMediatorOutputConnector)null);
				return;
			case EsbPackage.THROTTLE_MEDIATOR__ON_ACCEPT_OUTPUT_CONNECTOR:
				setOnAcceptOutputConnector((ThrottleMediatorOnAcceptOutputConnector)null);
				return;
			case EsbPackage.THROTTLE_MEDIATOR__ON_REJECT_OUTPUT_CONNECTOR:
				setOnRejectOutputConnector((ThrottleMediatorOnRejectOutputConnector)null);
				return;
			case EsbPackage.THROTTLE_MEDIATOR__THROTTLE_CONTAINER:
				setThrottleContainer((ThrottleContainer)null);
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
			case EsbPackage.THROTTLE_MEDIATOR__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
			case EsbPackage.THROTTLE_MEDIATOR__POLICY_CONFIGURATION:
				return policyConfiguration != null;
			case EsbPackage.THROTTLE_MEDIATOR__ON_ACCEPT_BRANCH:
				return onAcceptBranch != null;
			case EsbPackage.THROTTLE_MEDIATOR__ON_REJECT_BRANCH:
				return onRejectBranch != null;
			case EsbPackage.THROTTLE_MEDIATOR__INPUT_CONNECTOR:
				return inputConnector != null;
			case EsbPackage.THROTTLE_MEDIATOR__OUTPUT_CONNECTOR:
				return outputConnector != null;
			case EsbPackage.THROTTLE_MEDIATOR__ON_ACCEPT_OUTPUT_CONNECTOR:
				return onAcceptOutputConnector != null;
			case EsbPackage.THROTTLE_MEDIATOR__ON_REJECT_OUTPUT_CONNECTOR:
				return onRejectOutputConnector != null;
			case EsbPackage.THROTTLE_MEDIATOR__THROTTLE_CONTAINER:
				return throttleContainer != null;
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
		result.append(" (groupId: ");
		result.append(groupId);
		result.append(')');
		return result.toString();
	}

} //ThrottleMediatorImpl
