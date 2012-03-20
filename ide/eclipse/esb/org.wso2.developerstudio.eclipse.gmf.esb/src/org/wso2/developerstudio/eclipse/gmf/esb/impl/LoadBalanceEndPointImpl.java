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

import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPointInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPointOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPointWestOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.Session;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Balance End Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LoadBalanceEndPointImpl#getSession <em>Session</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LoadBalanceEndPointImpl#isFailover <em>Failover</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LoadBalanceEndPointImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LoadBalanceEndPointImpl#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LoadBalanceEndPointImpl#getOutputConnector <em>Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.LoadBalanceEndPointImpl#getWestOutputConnector <em>West Output Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadBalanceEndPointImpl extends ParentEndPointImpl implements LoadBalanceEndPoint {
	/**
	 * The cached value of the '{@link #getSession() <em>Session</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSession()
	 * @generated
	 * @ordered
	 */
	protected Session session;

	/**
	 * The default value of the '{@link #isFailover() <em>Failover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailover()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAILOVER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFailover() <em>Failover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailover()
	 * @generated
	 * @ordered
	 */
	protected boolean failover = FAILOVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected String policy = POLICY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputConnector() <em>Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputConnector()
	 * @generated
	 * @ordered
	 */
	protected LoadBalanceEndPointInputConnector inputConnector;

	/**
	 * The cached value of the '{@link #getOutputConnector() <em>Output Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadBalanceEndPointOutputConnector> outputConnector;

	/**
	 * The cached value of the '{@link #getWestOutputConnector() <em>West Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWestOutputConnector()
	 * @generated
	 * @ordered
	 */
	protected LoadBalanceEndPointWestOutputConnector westOutputConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadBalanceEndPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.LOAD_BALANCE_END_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Session getSession() {
		if (session != null && session.eIsProxy()) {
			InternalEObject oldSession = (InternalEObject)session;
			session = (Session)eResolveProxy(oldSession);
			if (session != oldSession) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsbPackage.LOAD_BALANCE_END_POINT__SESSION, oldSession, session));
			}
		}
		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Session basicGetSession() {
		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSession(Session newSession) {
		Session oldSession = session;
		session = newSession;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.LOAD_BALANCE_END_POINT__SESSION, oldSession, session));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFailover() {
		return failover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailover(boolean newFailover) {
		boolean oldFailover = failover;
		failover = newFailover;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.LOAD_BALANCE_END_POINT__FAILOVER, oldFailover, failover));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPolicy() {
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicy(String newPolicy) {
		String oldPolicy = policy;
		policy = newPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.LOAD_BALANCE_END_POINT__POLICY, oldPolicy, policy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalanceEndPointInputConnector getInputConnector() {
		return inputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputConnector(LoadBalanceEndPointInputConnector newInputConnector, NotificationChain msgs) {
		LoadBalanceEndPointInputConnector oldInputConnector = inputConnector;
		inputConnector = newInputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.LOAD_BALANCE_END_POINT__INPUT_CONNECTOR, oldInputConnector, newInputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputConnector(LoadBalanceEndPointInputConnector newInputConnector) {
		if (newInputConnector != inputConnector) {
			NotificationChain msgs = null;
			if (inputConnector != null)
				msgs = ((InternalEObject)inputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.LOAD_BALANCE_END_POINT__INPUT_CONNECTOR, null, msgs);
			if (newInputConnector != null)
				msgs = ((InternalEObject)newInputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.LOAD_BALANCE_END_POINT__INPUT_CONNECTOR, null, msgs);
			msgs = basicSetInputConnector(newInputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.LOAD_BALANCE_END_POINT__INPUT_CONNECTOR, newInputConnector, newInputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadBalanceEndPointOutputConnector> getOutputConnector() {
		if (outputConnector == null) {
			outputConnector = new EObjectContainmentEList<LoadBalanceEndPointOutputConnector>(LoadBalanceEndPointOutputConnector.class, this, EsbPackage.LOAD_BALANCE_END_POINT__OUTPUT_CONNECTOR);
		}
		return outputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalanceEndPointWestOutputConnector getWestOutputConnector() {
		return westOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWestOutputConnector(LoadBalanceEndPointWestOutputConnector newWestOutputConnector, NotificationChain msgs) {
		LoadBalanceEndPointWestOutputConnector oldWestOutputConnector = westOutputConnector;
		westOutputConnector = newWestOutputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.LOAD_BALANCE_END_POINT__WEST_OUTPUT_CONNECTOR, oldWestOutputConnector, newWestOutputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWestOutputConnector(LoadBalanceEndPointWestOutputConnector newWestOutputConnector) {
		if (newWestOutputConnector != westOutputConnector) {
			NotificationChain msgs = null;
			if (westOutputConnector != null)
				msgs = ((InternalEObject)westOutputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.LOAD_BALANCE_END_POINT__WEST_OUTPUT_CONNECTOR, null, msgs);
			if (newWestOutputConnector != null)
				msgs = ((InternalEObject)newWestOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.LOAD_BALANCE_END_POINT__WEST_OUTPUT_CONNECTOR, null, msgs);
			msgs = basicSetWestOutputConnector(newWestOutputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.LOAD_BALANCE_END_POINT__WEST_OUTPUT_CONNECTOR, newWestOutputConnector, newWestOutputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.LOAD_BALANCE_END_POINT__INPUT_CONNECTOR:
				return basicSetInputConnector(null, msgs);
			case EsbPackage.LOAD_BALANCE_END_POINT__OUTPUT_CONNECTOR:
				return ((InternalEList<?>)getOutputConnector()).basicRemove(otherEnd, msgs);
			case EsbPackage.LOAD_BALANCE_END_POINT__WEST_OUTPUT_CONNECTOR:
				return basicSetWestOutputConnector(null, msgs);
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
			case EsbPackage.LOAD_BALANCE_END_POINT__SESSION:
				if (resolve) return getSession();
				return basicGetSession();
			case EsbPackage.LOAD_BALANCE_END_POINT__FAILOVER:
				return isFailover();
			case EsbPackage.LOAD_BALANCE_END_POINT__POLICY:
				return getPolicy();
			case EsbPackage.LOAD_BALANCE_END_POINT__INPUT_CONNECTOR:
				return getInputConnector();
			case EsbPackage.LOAD_BALANCE_END_POINT__OUTPUT_CONNECTOR:
				return getOutputConnector();
			case EsbPackage.LOAD_BALANCE_END_POINT__WEST_OUTPUT_CONNECTOR:
				return getWestOutputConnector();
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
			case EsbPackage.LOAD_BALANCE_END_POINT__SESSION:
				setSession((Session)newValue);
				return;
			case EsbPackage.LOAD_BALANCE_END_POINT__FAILOVER:
				setFailover((Boolean)newValue);
				return;
			case EsbPackage.LOAD_BALANCE_END_POINT__POLICY:
				setPolicy((String)newValue);
				return;
			case EsbPackage.LOAD_BALANCE_END_POINT__INPUT_CONNECTOR:
				setInputConnector((LoadBalanceEndPointInputConnector)newValue);
				return;
			case EsbPackage.LOAD_BALANCE_END_POINT__OUTPUT_CONNECTOR:
				getOutputConnector().clear();
				getOutputConnector().addAll((Collection<? extends LoadBalanceEndPointOutputConnector>)newValue);
				return;
			case EsbPackage.LOAD_BALANCE_END_POINT__WEST_OUTPUT_CONNECTOR:
				setWestOutputConnector((LoadBalanceEndPointWestOutputConnector)newValue);
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
			case EsbPackage.LOAD_BALANCE_END_POINT__SESSION:
				setSession((Session)null);
				return;
			case EsbPackage.LOAD_BALANCE_END_POINT__FAILOVER:
				setFailover(FAILOVER_EDEFAULT);
				return;
			case EsbPackage.LOAD_BALANCE_END_POINT__POLICY:
				setPolicy(POLICY_EDEFAULT);
				return;
			case EsbPackage.LOAD_BALANCE_END_POINT__INPUT_CONNECTOR:
				setInputConnector((LoadBalanceEndPointInputConnector)null);
				return;
			case EsbPackage.LOAD_BALANCE_END_POINT__OUTPUT_CONNECTOR:
				getOutputConnector().clear();
				return;
			case EsbPackage.LOAD_BALANCE_END_POINT__WEST_OUTPUT_CONNECTOR:
				setWestOutputConnector((LoadBalanceEndPointWestOutputConnector)null);
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
			case EsbPackage.LOAD_BALANCE_END_POINT__SESSION:
				return session != null;
			case EsbPackage.LOAD_BALANCE_END_POINT__FAILOVER:
				return failover != FAILOVER_EDEFAULT;
			case EsbPackage.LOAD_BALANCE_END_POINT__POLICY:
				return POLICY_EDEFAULT == null ? policy != null : !POLICY_EDEFAULT.equals(policy);
			case EsbPackage.LOAD_BALANCE_END_POINT__INPUT_CONNECTOR:
				return inputConnector != null;
			case EsbPackage.LOAD_BALANCE_END_POINT__OUTPUT_CONNECTOR:
				return outputConnector != null && !outputConnector.isEmpty();
			case EsbPackage.LOAD_BALANCE_END_POINT__WEST_OUTPUT_CONNECTOR:
				return westOutputConnector != null;
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
		result.append(" (failover: ");
		result.append(failover);
		result.append(", policy: ");
		result.append(policy);
		result.append(')');
		return result.toString();
	}

} //LoadBalanceEndPointImpl
