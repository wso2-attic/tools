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
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.w3c.dom.Element;
import org.wso2.carbonstudio.eclipse.esb.NamespacedProperty;
import org.wso2.carbonstudio.eclipse.esb.RegistryKeyProperty;
import org.wso2.carbonstudio.eclipse.esb.impl.MediatorImpl;
import org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage;
import org.wso2.carbonstudio.eclipse.esb.mediator.XSLTFeature;
import org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.XSLTProperty;
import org.wso2.carbonstudio.eclipse.esb.mediator.XSLTResource;
import org.wso2.carbonstudio.eclipse.platform.core.mediatype.PlatformMediaTypeConstants;
import org.wso2.carbonstudio.eclipse.platform.core.utils.CSProviderConstants;
import org.wso2.carbonstudio.eclipse.platform.core.utils.CarbonStudioProviderUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSLT Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.XSLTMediatorImpl#getXsltKey <em>Xslt Key</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.XSLTMediatorImpl#getSourceXPath <em>Source XPath</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.XSLTMediatorImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.XSLTMediatorImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.XSLTMediatorImpl#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XSLTMediatorImpl extends MediatorImpl implements XSLTMediator {
	/**
	 * The cached value of the '{@link #getXsltKey() <em>Xslt Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsltKey()
	 * @generated
	 * @ordered
	 */
	protected RegistryKeyProperty xsltKey;

	/**
	 * The cached value of the '{@link #getSourceXPath() <em>Source XPath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceXPath()
	 * @generated
	 * @ordered
	 */
	protected NamespacedProperty sourceXPath;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<XSLTProperty> properties;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<XSLTFeature> features;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<XSLTResource> resources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected XSLTMediatorImpl() {
		super();
		
		// XSLT key.
		RegistryKeyProperty xsltKey = getEsbFactory().createRegistryKeyProperty();
		//Set filter properties to filter in only xslt media type
		CarbonStudioProviderUtils.addFilter((Map<String, List<String>>)xsltKey.getFilters(), CSProviderConstants.FILTER_MEDIA_TYPE, PlatformMediaTypeConstants.MEDIA_TYPE_XSLT);
		
		xsltKey.setPrettyName("XSLT Key");
		xsltKey.setKeyName("key");
		xsltKey.setKeyValue(DEFAULT_REGISTRY_KEY);
		setXsltKey(xsltKey);
		
		// Source XPath.
		NamespacedProperty sourceXPath = getEsbFactory().createNamespacedProperty();
		sourceXPath.setPrettyName("Source XPath");
		sourceXPath.setPropertyName("source");
		setSourceXPath(sourceXPath);
	}

	/**
	 * {@inheritDoc}
	 */
	protected void doLoad(Element self) throws Exception {
		getXsltKey().load(self);
		getSourceXPath().load(self);
		
		// Properties.
		loadObjects(self, "property", XSLTProperty.class, new ObjectHandler<XSLTProperty>() {
			public void handle(XSLTProperty object) {
				getProperties().add(object);
			}			
		});
		
		// Features.
		loadObjects(self, "feature", XSLTFeature.class, new ObjectHandler<XSLTFeature>() {
			public void handle(XSLTFeature object) {
				getFeatures().add(object);
			}			
		});
		
		// Resources.
		loadObjects(self, "resource", XSLTResource.class, new ObjectHandler<XSLTResource>() {
			public void handle(XSLTResource object) {
				getResources().add(object);
			}			
		});
	}

	/**
	 * {@inheritDoc}
	 */
	protected Element doSave(Element parent) throws Exception {
		Element self = createChildElement(parent, "xslt");

		// XSLT Key.
		getXsltKey().save(self);
		
		// Source XPath.
		if (!StringUtils.isBlank(getSourceXPath().getPropertyValue())) {
			getSourceXPath().save(self);
		}
		
		// Properties.
		for (XSLTProperty property : getProperties()) {
			property.save(self);
		}
		
		// Features.
		for (XSLTFeature feature : getFeatures()) {
			feature.save(self);
		}
		
		// Resources.
		for (XSLTResource resource : getResources()) {
			resource.save(self);
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
		return MediatorPackage.Literals.XSLT_MEDIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryKeyProperty getXsltKey() {
		return xsltKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXsltKey(RegistryKeyProperty newXsltKey, NotificationChain msgs) {
		RegistryKeyProperty oldXsltKey = xsltKey;
		xsltKey = newXsltKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MediatorPackage.XSLT_MEDIATOR__XSLT_KEY, oldXsltKey, newXsltKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXsltKey(RegistryKeyProperty newXsltKey) {
		if (newXsltKey != xsltKey) {
			NotificationChain msgs = null;
			if (xsltKey != null)
				msgs = ((InternalEObject)xsltKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.XSLT_MEDIATOR__XSLT_KEY, null, msgs);
			if (newXsltKey != null)
				msgs = ((InternalEObject)newXsltKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.XSLT_MEDIATOR__XSLT_KEY, null, msgs);
			msgs = basicSetXsltKey(newXsltKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.XSLT_MEDIATOR__XSLT_KEY, newXsltKey, newXsltKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacedProperty getSourceXPath() {
		return sourceXPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceXPath(NamespacedProperty newSourceXPath, NotificationChain msgs) {
		NamespacedProperty oldSourceXPath = sourceXPath;
		sourceXPath = newSourceXPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MediatorPackage.XSLT_MEDIATOR__SOURCE_XPATH, oldSourceXPath, newSourceXPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceXPath(NamespacedProperty newSourceXPath) {
		if (newSourceXPath != sourceXPath) {
			NotificationChain msgs = null;
			if (sourceXPath != null)
				msgs = ((InternalEObject)sourceXPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.XSLT_MEDIATOR__SOURCE_XPATH, null, msgs);
			if (newSourceXPath != null)
				msgs = ((InternalEObject)newSourceXPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.XSLT_MEDIATOR__SOURCE_XPATH, null, msgs);
			msgs = basicSetSourceXPath(newSourceXPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.XSLT_MEDIATOR__SOURCE_XPATH, newSourceXPath, newSourceXPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSLTProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<XSLTProperty>(XSLTProperty.class, this, MediatorPackage.XSLT_MEDIATOR__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSLTFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<XSLTFeature>(XSLTFeature.class, this, MediatorPackage.XSLT_MEDIATOR__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSLTResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<XSLTResource>(XSLTResource.class, this, MediatorPackage.XSLT_MEDIATOR__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MediatorPackage.XSLT_MEDIATOR__XSLT_KEY:
				return basicSetXsltKey(null, msgs);
			case MediatorPackage.XSLT_MEDIATOR__SOURCE_XPATH:
				return basicSetSourceXPath(null, msgs);
			case MediatorPackage.XSLT_MEDIATOR__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case MediatorPackage.XSLT_MEDIATOR__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case MediatorPackage.XSLT_MEDIATOR__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
			case MediatorPackage.XSLT_MEDIATOR__XSLT_KEY:
				return getXsltKey();
			case MediatorPackage.XSLT_MEDIATOR__SOURCE_XPATH:
				return getSourceXPath();
			case MediatorPackage.XSLT_MEDIATOR__PROPERTIES:
				return getProperties();
			case MediatorPackage.XSLT_MEDIATOR__FEATURES:
				return getFeatures();
			case MediatorPackage.XSLT_MEDIATOR__RESOURCES:
				return getResources();
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
			case MediatorPackage.XSLT_MEDIATOR__XSLT_KEY:
				setXsltKey((RegistryKeyProperty)newValue);
				return;
			case MediatorPackage.XSLT_MEDIATOR__SOURCE_XPATH:
				setSourceXPath((NamespacedProperty)newValue);
				return;
			case MediatorPackage.XSLT_MEDIATOR__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends XSLTProperty>)newValue);
				return;
			case MediatorPackage.XSLT_MEDIATOR__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends XSLTFeature>)newValue);
				return;
			case MediatorPackage.XSLT_MEDIATOR__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends XSLTResource>)newValue);
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
			case MediatorPackage.XSLT_MEDIATOR__XSLT_KEY:
				setXsltKey((RegistryKeyProperty)null);
				return;
			case MediatorPackage.XSLT_MEDIATOR__SOURCE_XPATH:
				setSourceXPath((NamespacedProperty)null);
				return;
			case MediatorPackage.XSLT_MEDIATOR__PROPERTIES:
				getProperties().clear();
				return;
			case MediatorPackage.XSLT_MEDIATOR__FEATURES:
				getFeatures().clear();
				return;
			case MediatorPackage.XSLT_MEDIATOR__RESOURCES:
				getResources().clear();
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
			case MediatorPackage.XSLT_MEDIATOR__XSLT_KEY:
				return xsltKey != null;
			case MediatorPackage.XSLT_MEDIATOR__SOURCE_XPATH:
				return sourceXPath != null;
			case MediatorPackage.XSLT_MEDIATOR__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case MediatorPackage.XSLT_MEDIATOR__FEATURES:
				return features != null && !features.isEmpty();
			case MediatorPackage.XSLT_MEDIATOR__RESOURCES:
				return resources != null && !resources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //XSLTMediatorImpl
