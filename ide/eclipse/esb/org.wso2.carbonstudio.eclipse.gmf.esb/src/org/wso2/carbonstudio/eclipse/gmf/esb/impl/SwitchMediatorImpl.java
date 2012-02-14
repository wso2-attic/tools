/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.gmf.esb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.wso2.carbonstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.carbonstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.carbonstudio.eclipse.gmf.esb.SwitchCaseBranchOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.SwitchDefaultBranchOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.SwitchMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.SwitchMediatorInputConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.SwitchMediatorImpl#getSourceXpath <em>Source Xpath</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.SwitchMediatorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.SwitchMediatorImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.SwitchMediatorImpl#getNamespacePrefix <em>Namespace Prefix</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.SwitchMediatorImpl#getCaseBranches <em>Case Branches</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.SwitchMediatorImpl#getDefaultBranch <em>Default Branch</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.SwitchMediatorImpl#getInputConnector <em>Input Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchMediatorImpl extends MediatorImpl implements SwitchMediator {
	/**
	 * The cached value of the '{@link #getSourceXpath() <em>Source Xpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceXpath()
	 * @generated
	 * @ordered
	 */
	protected NamespacedProperty sourceXpath;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespacePrefix() <em>Namespace Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespacePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespacePrefix() <em>Namespace Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespacePrefix()
	 * @generated
	 * @ordered
	 */
	protected String namespacePrefix = NAMESPACE_PREFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCaseBranches() <em>Case Branches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseBranches()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchCaseBranchOutputConnector> caseBranches;

	/**
	 * The cached value of the '{@link #getDefaultBranch() <em>Default Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultBranch()
	 * @generated
	 * @ordered
	 */
	protected SwitchDefaultBranchOutputConnector defaultBranch;

	/**
	 * The cached value of the '{@link #getInputConnector() <em>Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputConnector()
	 * @generated
	 * @ordered
	 */
	protected SwitchMediatorInputConnector inputConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SwitchMediatorImpl() {
		super();
		
		// xpath.
		NamespacedProperty xpath = EsbFactory.eINSTANCE.createNamespacedProperty();
		xpath.setPrettyName("Switch Source XPath");
		xpath.setPropertyName("switchSourceXpath");
		xpath.setPropertyValue(DEFAULT_XPATH_PROPERTY_VALUE);		
		setSourceXpath(xpath);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.SWITCH_MEDIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacedProperty getSourceXpath() {
		return sourceXpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceXpath(NamespacedProperty newSourceXpath, NotificationChain msgs) {
		NamespacedProperty oldSourceXpath = sourceXpath;
		sourceXpath = newSourceXpath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.SWITCH_MEDIATOR__SOURCE_XPATH, oldSourceXpath, newSourceXpath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceXpath(NamespacedProperty newSourceXpath) {
		if (newSourceXpath != sourceXpath) {
			NotificationChain msgs = null;
			if (sourceXpath != null)
				msgs = ((InternalEObject)sourceXpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SWITCH_MEDIATOR__SOURCE_XPATH, null, msgs);
			if (newSourceXpath != null)
				msgs = ((InternalEObject)newSourceXpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SWITCH_MEDIATOR__SOURCE_XPATH, null, msgs);
			msgs = basicSetSourceXpath(newSourceXpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SWITCH_MEDIATOR__SOURCE_XPATH, newSourceXpath, newSourceXpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SWITCH_MEDIATOR__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SWITCH_MEDIATOR__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespacePrefix() {
		return namespacePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespacePrefix(String newNamespacePrefix) {
		String oldNamespacePrefix = namespacePrefix;
		namespacePrefix = newNamespacePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SWITCH_MEDIATOR__NAMESPACE_PREFIX, oldNamespacePrefix, namespacePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwitchCaseBranchOutputConnector> getCaseBranches() {
		if (caseBranches == null) {
			caseBranches = new EObjectContainmentEList<SwitchCaseBranchOutputConnector>(SwitchCaseBranchOutputConnector.class, this, EsbPackage.SWITCH_MEDIATOR__CASE_BRANCHES);
		}
		return caseBranches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchDefaultBranchOutputConnector getDefaultBranch() {
		return defaultBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultBranch(SwitchDefaultBranchOutputConnector newDefaultBranch, NotificationChain msgs) {
		SwitchDefaultBranchOutputConnector oldDefaultBranch = defaultBranch;
		defaultBranch = newDefaultBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.SWITCH_MEDIATOR__DEFAULT_BRANCH, oldDefaultBranch, newDefaultBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultBranch(SwitchDefaultBranchOutputConnector newDefaultBranch) {
		if (newDefaultBranch != defaultBranch) {
			NotificationChain msgs = null;
			if (defaultBranch != null)
				msgs = ((InternalEObject)defaultBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SWITCH_MEDIATOR__DEFAULT_BRANCH, null, msgs);
			if (newDefaultBranch != null)
				msgs = ((InternalEObject)newDefaultBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SWITCH_MEDIATOR__DEFAULT_BRANCH, null, msgs);
			msgs = basicSetDefaultBranch(newDefaultBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SWITCH_MEDIATOR__DEFAULT_BRANCH, newDefaultBranch, newDefaultBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchMediatorInputConnector getInputConnector() {
		return inputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputConnector(SwitchMediatorInputConnector newInputConnector, NotificationChain msgs) {
		SwitchMediatorInputConnector oldInputConnector = inputConnector;
		inputConnector = newInputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.SWITCH_MEDIATOR__INPUT_CONNECTOR, oldInputConnector, newInputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputConnector(SwitchMediatorInputConnector newInputConnector) {
		if (newInputConnector != inputConnector) {
			NotificationChain msgs = null;
			if (inputConnector != null)
				msgs = ((InternalEObject)inputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SWITCH_MEDIATOR__INPUT_CONNECTOR, null, msgs);
			if (newInputConnector != null)
				msgs = ((InternalEObject)newInputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SWITCH_MEDIATOR__INPUT_CONNECTOR, null, msgs);
			msgs = basicSetInputConnector(newInputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SWITCH_MEDIATOR__INPUT_CONNECTOR, newInputConnector, newInputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.SWITCH_MEDIATOR__SOURCE_XPATH:
				return basicSetSourceXpath(null, msgs);
			case EsbPackage.SWITCH_MEDIATOR__CASE_BRANCHES:
				return ((InternalEList<?>)getCaseBranches()).basicRemove(otherEnd, msgs);
			case EsbPackage.SWITCH_MEDIATOR__DEFAULT_BRANCH:
				return basicSetDefaultBranch(null, msgs);
			case EsbPackage.SWITCH_MEDIATOR__INPUT_CONNECTOR:
				return basicSetInputConnector(null, msgs);
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
			case EsbPackage.SWITCH_MEDIATOR__SOURCE_XPATH:
				return getSourceXpath();
			case EsbPackage.SWITCH_MEDIATOR__SOURCE:
				return getSource();
			case EsbPackage.SWITCH_MEDIATOR__NAMESPACE:
				return getNamespace();
			case EsbPackage.SWITCH_MEDIATOR__NAMESPACE_PREFIX:
				return getNamespacePrefix();
			case EsbPackage.SWITCH_MEDIATOR__CASE_BRANCHES:
				return getCaseBranches();
			case EsbPackage.SWITCH_MEDIATOR__DEFAULT_BRANCH:
				return getDefaultBranch();
			case EsbPackage.SWITCH_MEDIATOR__INPUT_CONNECTOR:
				return getInputConnector();
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
			case EsbPackage.SWITCH_MEDIATOR__SOURCE_XPATH:
				setSourceXpath((NamespacedProperty)newValue);
				return;
			case EsbPackage.SWITCH_MEDIATOR__SOURCE:
				setSource((String)newValue);
				return;
			case EsbPackage.SWITCH_MEDIATOR__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case EsbPackage.SWITCH_MEDIATOR__NAMESPACE_PREFIX:
				setNamespacePrefix((String)newValue);
				return;
			case EsbPackage.SWITCH_MEDIATOR__CASE_BRANCHES:
				getCaseBranches().clear();
				getCaseBranches().addAll((Collection<? extends SwitchCaseBranchOutputConnector>)newValue);
				return;
			case EsbPackage.SWITCH_MEDIATOR__DEFAULT_BRANCH:
				setDefaultBranch((SwitchDefaultBranchOutputConnector)newValue);
				return;
			case EsbPackage.SWITCH_MEDIATOR__INPUT_CONNECTOR:
				setInputConnector((SwitchMediatorInputConnector)newValue);
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
			case EsbPackage.SWITCH_MEDIATOR__SOURCE_XPATH:
				setSourceXpath((NamespacedProperty)null);
				return;
			case EsbPackage.SWITCH_MEDIATOR__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case EsbPackage.SWITCH_MEDIATOR__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case EsbPackage.SWITCH_MEDIATOR__NAMESPACE_PREFIX:
				setNamespacePrefix(NAMESPACE_PREFIX_EDEFAULT);
				return;
			case EsbPackage.SWITCH_MEDIATOR__CASE_BRANCHES:
				getCaseBranches().clear();
				return;
			case EsbPackage.SWITCH_MEDIATOR__DEFAULT_BRANCH:
				setDefaultBranch((SwitchDefaultBranchOutputConnector)null);
				return;
			case EsbPackage.SWITCH_MEDIATOR__INPUT_CONNECTOR:
				setInputConnector((SwitchMediatorInputConnector)null);
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
			case EsbPackage.SWITCH_MEDIATOR__SOURCE_XPATH:
				return sourceXpath != null;
			case EsbPackage.SWITCH_MEDIATOR__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case EsbPackage.SWITCH_MEDIATOR__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case EsbPackage.SWITCH_MEDIATOR__NAMESPACE_PREFIX:
				return NAMESPACE_PREFIX_EDEFAULT == null ? namespacePrefix != null : !NAMESPACE_PREFIX_EDEFAULT.equals(namespacePrefix);
			case EsbPackage.SWITCH_MEDIATOR__CASE_BRANCHES:
				return caseBranches != null && !caseBranches.isEmpty();
			case EsbPackage.SWITCH_MEDIATOR__DEFAULT_BRANCH:
				return defaultBranch != null;
			case EsbPackage.SWITCH_MEDIATOR__INPUT_CONNECTOR:
				return inputConnector != null;
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
		result.append(" (source: ");
		result.append(source);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", namespacePrefix: ");
		result.append(namespacePrefix);
		result.append(')');
		return result.toString();
	}

} //SwitchMediatorImpl
