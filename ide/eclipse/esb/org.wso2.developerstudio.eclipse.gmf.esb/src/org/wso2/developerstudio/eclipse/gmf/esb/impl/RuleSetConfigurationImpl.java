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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleSetConfiguration;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleSetCreationProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleSourceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Set Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleSetConfigurationImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleSetConfigurationImpl#getSourceCode <em>Source Code</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleSetConfigurationImpl#getSourceKey <em>Source Key</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.RuleSetConfigurationImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleSetConfigurationImpl extends EObjectImpl implements RuleSetConfiguration {
	/**
	 * The default value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected static final RuleSourceType SOURCE_TYPE_EDEFAULT = RuleSourceType.INLINE;

	/**
	 * The cached value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected RuleSourceType sourceType = SOURCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceCode() <em>Source Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCode()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_CODE_EDEFAULT = "<code/>";

	/**
	 * The cached value of the '{@link #getSourceCode() <em>Source Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCode()
	 * @generated
	 * @ordered
	 */
	protected String sourceCode = SOURCE_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceKey() <em>Source Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceKey()
	 * @generated
	 * @ordered
	 */
	protected RegistryKeyProperty sourceKey;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleSetCreationProperty> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleSetConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	protected EClass eStaticClass() {
		return EsbPackage.Literals.RULE_SET_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleSourceType getSourceType() {
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceType(RuleSourceType newSourceType) {
		RuleSourceType oldSourceType = sourceType;
		sourceType = newSourceType == null ? SOURCE_TYPE_EDEFAULT : newSourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_SET_CONFIGURATION__SOURCE_TYPE, oldSourceType, sourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceCode() {
		return sourceCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceCode(String newSourceCode) {
		String oldSourceCode = sourceCode;
		sourceCode = newSourceCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_SET_CONFIGURATION__SOURCE_CODE, oldSourceCode, sourceCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryKeyProperty getSourceKey() {
		return sourceKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceKey(RegistryKeyProperty newSourceKey, NotificationChain msgs) {
		RegistryKeyProperty oldSourceKey = sourceKey;
		sourceKey = newSourceKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_SET_CONFIGURATION__SOURCE_KEY, oldSourceKey, newSourceKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceKey(RegistryKeyProperty newSourceKey) {
		if (newSourceKey != sourceKey) {
			NotificationChain msgs = null;
			if (sourceKey != null)
				msgs = ((InternalEObject)sourceKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_SET_CONFIGURATION__SOURCE_KEY, null, msgs);
			if (newSourceKey != null)
				msgs = ((InternalEObject)newSourceKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.RULE_SET_CONFIGURATION__SOURCE_KEY, null, msgs);
			msgs = basicSetSourceKey(newSourceKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.RULE_SET_CONFIGURATION__SOURCE_KEY, newSourceKey, newSourceKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleSetCreationProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<RuleSetCreationProperty>(RuleSetCreationProperty.class, this, EsbPackage.RULE_SET_CONFIGURATION__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.RULE_SET_CONFIGURATION__SOURCE_KEY:
				return basicSetSourceKey(null, msgs);
			case EsbPackage.RULE_SET_CONFIGURATION__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case EsbPackage.RULE_SET_CONFIGURATION__SOURCE_TYPE:
				return getSourceType();
			case EsbPackage.RULE_SET_CONFIGURATION__SOURCE_CODE:
				return getSourceCode();
			case EsbPackage.RULE_SET_CONFIGURATION__SOURCE_KEY:
				return getSourceKey();
			case EsbPackage.RULE_SET_CONFIGURATION__PROPERTIES:
				return getProperties();
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
			case EsbPackage.RULE_SET_CONFIGURATION__SOURCE_TYPE:
				setSourceType((RuleSourceType)newValue);
				return;
			case EsbPackage.RULE_SET_CONFIGURATION__SOURCE_CODE:
				setSourceCode((String)newValue);
				return;
			case EsbPackage.RULE_SET_CONFIGURATION__SOURCE_KEY:
				setSourceKey((RegistryKeyProperty)newValue);
				return;
			case EsbPackage.RULE_SET_CONFIGURATION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends RuleSetCreationProperty>)newValue);
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
			case EsbPackage.RULE_SET_CONFIGURATION__SOURCE_TYPE:
				setSourceType(SOURCE_TYPE_EDEFAULT);
				return;
			case EsbPackage.RULE_SET_CONFIGURATION__SOURCE_CODE:
				setSourceCode(SOURCE_CODE_EDEFAULT);
				return;
			case EsbPackage.RULE_SET_CONFIGURATION__SOURCE_KEY:
				setSourceKey((RegistryKeyProperty)null);
				return;
			case EsbPackage.RULE_SET_CONFIGURATION__PROPERTIES:
				getProperties().clear();
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
			case EsbPackage.RULE_SET_CONFIGURATION__SOURCE_TYPE:
				return sourceType != SOURCE_TYPE_EDEFAULT;
			case EsbPackage.RULE_SET_CONFIGURATION__SOURCE_CODE:
				return SOURCE_CODE_EDEFAULT == null ? sourceCode != null : !SOURCE_CODE_EDEFAULT.equals(sourceCode);
			case EsbPackage.RULE_SET_CONFIGURATION__SOURCE_KEY:
				return sourceKey != null;
			case EsbPackage.RULE_SET_CONFIGURATION__PROPERTIES:
				return properties != null && !properties.isEmpty();
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
		result.append(" (sourceType: ");
		result.append(sourceType);
		result.append(", sourceCode: ");
		result.append(sourceCode);
		result.append(')');
		return result.toString();
	}

} //RuleSetConfigurationImpl
