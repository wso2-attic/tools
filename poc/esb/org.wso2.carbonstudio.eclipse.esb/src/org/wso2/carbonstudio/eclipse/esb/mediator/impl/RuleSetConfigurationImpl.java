/*
 * Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbonstudio.eclipse.esb.mediator.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.w3c.dom.Element;
import org.wso2.carbonstudio.eclipse.esb.RegistryKeyProperty;
import org.wso2.carbonstudio.eclipse.esb.impl.ModelObjectImpl;
import org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage;
import org.wso2.carbonstudio.eclipse.esb.mediator.RuleSetConfiguration;
import org.wso2.carbonstudio.eclipse.esb.mediator.RuleSetCreationProperty;
import org.wso2.carbonstudio.eclipse.esb.mediator.RuleSourceType;
import org.wso2.carbonstudio.eclipse.esb.util.EsbUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Set Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleSetConfigurationImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleSetConfigurationImpl#getSourceCode <em>Source Code</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleSetConfigurationImpl#getSourceKey <em>Source Key</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.RuleSetConfigurationImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleSetConfigurationImpl extends ModelObjectImpl implements RuleSetConfiguration {
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
	 */
	protected RuleSetConfigurationImpl() {
		super();
		
		// Source key.
		RegistryKeyProperty sourceKey = getEsbFactory().createRegistryKeyProperty();
		sourceKey.setPrettyName("Source Key");
		sourceKey.setKeyName("key");
		sourceKey.setKeyValue(DEFAULT_REGISTRY_KEY);
		setSourceKey(sourceKey);
	}

	/**
	 * {@inheritDoc}
	 */
	protected void doLoad(Element self) throws Exception {
		Element sourceElem = getChildElement(self, "source");
		if (null != sourceElem) {
			if (sourceElem.hasAttribute("key")) {
				setSourceType(RuleSourceType.REGISTRY_REFERENCE);
				getSourceKey().load(sourceElem);
			} else {
				setSourceType(RuleSourceType.INLINE);
				List<Element> sourceCodeElems = getChildElements(sourceElem);
				// Question: Is it possible for the rule source to be comprised of multiple elements?
				if (!sourceCodeElems.isEmpty()) {
					setSourceCode(EsbUtils.renderElement(sourceCodeElems.get(0), true));
				}
			}
		} else {
			throw new Exception("Expected source element.");
		}
		
		Element creationElem = getChildElement(self, "creation");
		if (null != creationElem) {
			loadObjects(creationElem, "property", RuleSetCreationProperty.class, new ObjectHandler<RuleSetCreationProperty>() {
				public void handle(RuleSetCreationProperty object) {
					getProperties().add(object);
				}
			});
		}
	}

	/**
	 * {@inheritDoc}
	 */
	protected Element doSave(Element parent) throws Exception {
		Element self = createChildElement(parent, "ruleset");
		
		Element sourceElem = createChildElement(self, "source");
		if (getSourceType().equals(RuleSourceType.REGISTRY_REFERENCE)) {
			getSourceKey().save(sourceElem);
		} else {
			try {
				Element sourceCodeElem = EsbUtils.parseElement(getSourceCode());
				sourceCodeElem = (Element) sourceElem.getOwnerDocument().importNode(sourceCodeElem, true);
				sourceElem.appendChild(sourceCodeElem);
			} catch (Exception ex) {
				// TODO: Log this exception.
				createChildElement(sourceElem, "code");
				setSourceCode(SOURCE_CODE_EDEFAULT);
			}			
		}
		
		Element creationElem = createChildElement(self, "creation");
		for (RuleSetCreationProperty property : getProperties()) {
			property.save(creationElem);
		}
		
		return self;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MediatorPackage.Literals.RULE_SET_CONFIGURATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.RULE_SET_CONFIGURATION__SOURCE_TYPE, oldSourceType, sourceType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.RULE_SET_CONFIGURATION__SOURCE_CODE, oldSourceCode, sourceCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MediatorPackage.RULE_SET_CONFIGURATION__SOURCE_KEY, oldSourceKey, newSourceKey);
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
				msgs = ((InternalEObject)sourceKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.RULE_SET_CONFIGURATION__SOURCE_KEY, null, msgs);
			if (newSourceKey != null)
				msgs = ((InternalEObject)newSourceKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.RULE_SET_CONFIGURATION__SOURCE_KEY, null, msgs);
			msgs = basicSetSourceKey(newSourceKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.RULE_SET_CONFIGURATION__SOURCE_KEY, newSourceKey, newSourceKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleSetCreationProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<RuleSetCreationProperty>(RuleSetCreationProperty.class, this, MediatorPackage.RULE_SET_CONFIGURATION__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MediatorPackage.RULE_SET_CONFIGURATION__SOURCE_KEY:
				return basicSetSourceKey(null, msgs);
			case MediatorPackage.RULE_SET_CONFIGURATION__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case MediatorPackage.RULE_SET_CONFIGURATION__SOURCE_TYPE:
				return getSourceType();
			case MediatorPackage.RULE_SET_CONFIGURATION__SOURCE_CODE:
				return getSourceCode();
			case MediatorPackage.RULE_SET_CONFIGURATION__SOURCE_KEY:
				return getSourceKey();
			case MediatorPackage.RULE_SET_CONFIGURATION__PROPERTIES:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MediatorPackage.RULE_SET_CONFIGURATION__SOURCE_TYPE:
				setSourceType((RuleSourceType)newValue);
				return;
			case MediatorPackage.RULE_SET_CONFIGURATION__SOURCE_CODE:
				setSourceCode((String)newValue);
				return;
			case MediatorPackage.RULE_SET_CONFIGURATION__SOURCE_KEY:
				setSourceKey((RegistryKeyProperty)newValue);
				return;
			case MediatorPackage.RULE_SET_CONFIGURATION__PROPERTIES:
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
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MediatorPackage.RULE_SET_CONFIGURATION__SOURCE_TYPE:
				setSourceType(SOURCE_TYPE_EDEFAULT);
				return;
			case MediatorPackage.RULE_SET_CONFIGURATION__SOURCE_CODE:
				setSourceCode(SOURCE_CODE_EDEFAULT);
				return;
			case MediatorPackage.RULE_SET_CONFIGURATION__SOURCE_KEY:
				setSourceKey((RegistryKeyProperty)null);
				return;
			case MediatorPackage.RULE_SET_CONFIGURATION__PROPERTIES:
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MediatorPackage.RULE_SET_CONFIGURATION__SOURCE_TYPE:
				return sourceType != SOURCE_TYPE_EDEFAULT;
			case MediatorPackage.RULE_SET_CONFIGURATION__SOURCE_CODE:
				return SOURCE_CODE_EDEFAULT == null ? sourceCode != null : !SOURCE_CODE_EDEFAULT.equals(sourceCode);
			case MediatorPackage.RULE_SET_CONFIGURATION__SOURCE_KEY:
				return sourceKey != null;
			case MediatorPackage.RULE_SET_CONFIGURATION__PROPERTIES:
				return properties != null && !properties.isEmpty();
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
		result.append(" (sourceType: ");
		result.append(sourceType);
		result.append(", sourceCode: ");
		result.append(sourceCode);
		result.append(')');
		return result.toString();
	}

} //RuleSetConfigurationImpl
