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

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.w3c.dom.Element;
import org.wso2.carbonstudio.eclipse.esb.NamespacedProperty;
import org.wso2.carbonstudio.eclipse.esb.impl.MediatorImpl;
import org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.EnrichSourceType;
import org.wso2.carbonstudio.eclipse.esb.mediator.EnrichTargetAction;
import org.wso2.carbonstudio.eclipse.esb.mediator.EnrichTargetType;
import org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage;
import org.wso2.carbonstudio.eclipse.esb.util.EsbUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enrich Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.EnrichMediatorImpl#isCloneSource <em>Clone Source</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.EnrichMediatorImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.EnrichMediatorImpl#getSourceXpath <em>Source Xpath</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.EnrichMediatorImpl#getSourceProperty <em>Source Property</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.EnrichMediatorImpl#getSourceXML <em>Source XML</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.EnrichMediatorImpl#getTargetAction <em>Target Action</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.EnrichMediatorImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.EnrichMediatorImpl#getTargetXpath <em>Target Xpath</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.EnrichMediatorImpl#getTargetProperty <em>Target Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnrichMediatorImpl extends MediatorImpl implements EnrichMediator {
	/**
	 * The default value of the '{@link #isCloneSource() <em>Clone Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCloneSource()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLONE_SOURCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCloneSource() <em>Clone Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCloneSource()
	 * @generated
	 * @ordered
	 */
	protected boolean cloneSource = CLONE_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected static final EnrichSourceType SOURCE_TYPE_EDEFAULT = EnrichSourceType.CUSTOM;

	/**
	 * The cached value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected EnrichSourceType sourceType = SOURCE_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getSourceProperty() <em>Source Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_PROPERTY_EDEFAULT = "source_property";

	/**
	 * The cached value of the '{@link #getSourceProperty() <em>Source Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceProperty()
	 * @generated
	 * @ordered
	 */
	protected String sourceProperty = SOURCE_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceXML() <em>Source XML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceXML()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_XML_EDEFAULT = "<inline/>";

	/**
	 * The cached value of the '{@link #getSourceXML() <em>Source XML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceXML()
	 * @generated
	 * @ordered
	 */
	protected String sourceXML = SOURCE_XML_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetAction() <em>Target Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAction()
	 * @generated
	 * @ordered
	 */
	protected static final EnrichTargetAction TARGET_ACTION_EDEFAULT = EnrichTargetAction.REPLACE;

	/**
	 * The cached value of the '{@link #getTargetAction() <em>Target Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAction()
	 * @generated
	 * @ordered
	 */
	protected EnrichTargetAction targetAction = TARGET_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetType() <em>Target Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetType()
	 * @generated
	 * @ordered
	 */
	protected static final EnrichTargetType TARGET_TYPE_EDEFAULT = EnrichTargetType.CUSTOM;

	/**
	 * The cached value of the '{@link #getTargetType() <em>Target Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetType()
	 * @generated
	 * @ordered
	 */
	protected EnrichTargetType targetType = TARGET_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetXpath() <em>Target Xpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetXpath()
	 * @generated
	 * @ordered
	 */
	protected NamespacedProperty targetXpath;

	/**
	 * The default value of the '{@link #getTargetProperty() <em>Target Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_PROPERTY_EDEFAULT = "target_property";

	/**
	 * The cached value of the '{@link #getTargetProperty() <em>Target Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetProperty()
	 * @generated
	 * @ordered
	 */
	protected String targetProperty = TARGET_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected EnrichMediatorImpl() {
		super();
		
		// Source xpath.
		NamespacedProperty sourceXpath = getEsbFactory().createNamespacedProperty();
		sourceXpath.setPrettyName("Source XPath");
		sourceXpath.setPropertyName("xpath");
		sourceXpath.setPropertyValue(DEFAULT_XPATH_PROPERTY_VALUE);		
		setSourceXpath(sourceXpath);
		
		// Target xpath.
		NamespacedProperty targetXpath = getEsbFactory().createNamespacedProperty();
		targetXpath.setPrettyName("Target XPath");
		targetXpath.setPropertyName("xpath");
		targetXpath.setPropertyValue(DEFAULT_XPATH_PROPERTY_VALUE);
		setTargetXpath(targetXpath);
	}

	/**
	 * {@inheritDoc}
	 */
	protected void doLoad(Element self) throws Exception {	
		Element sourceElem = getChildElement(self, "source");
		if (null == sourceElem) {
			throw new Exception("Expected source element.");
		}
		
		// Clone
		if (sourceElem.hasAttribute("clone")) {
			if (sourceElem.getAttribute("clone").equals("true")) {
				setCloneSource(true);	
			}
		}
		
		// Source type
		EnrichSourceType sourceType = EnrichSourceType.get(sourceElem.getAttribute("type"));
		if (null != sourceType) {
			setSourceType(EnrichSourceType.get(sourceElem.getAttribute("type")));
		}
		
		// Source XPath.
		if (getSourceType().equals(EnrichSourceType.CUSTOM)) {
			getSourceXpath().load(sourceElem);
		}		
		
		// Source property.
		if (getSourceType().equals(EnrichSourceType.PROPERTY)) {
			setSourceProperty(sourceElem.getAttribute("property"));
		}
		
		// Source inline XML.
		if (getSourceType().equals(EnrichSourceType.INLINE)) {
			List<Element> children = getChildElements(sourceElem);
			if (!children.isEmpty()) {
				// Question: Do we have to consider all the child elements?
				setSourceXML(EsbUtils.renderElement(children.get(0), true));
			}
		}
		
		Element targetElem = getChildElement(self, "target");
		if (null == targetElem) {
			throw new Exception("Target element expected.");
		}
		
		// Target action.
		EnrichTargetAction targetAction = EnrichTargetAction.get(targetElem.getAttribute("action")); 
		if (null != targetAction) {
			setTargetAction(targetAction);
		}
		
		// Target type.
		EnrichTargetType targetType = EnrichTargetType.get(targetElem.getAttribute("type"));
		if (null != targetType) {
			setTargetType(targetType);
		}
		
		// Target XPath.
		if (getTargetType().equals(EnrichTargetType.CUSTOM)) {
			getTargetXpath().load(targetElem);
		}
		
		// Target property.
		if (getTargetType().equals(EnrichTargetType.PROPERTY)) {
			setTargetProperty(targetElem.getAttribute("property"));
		}
	}

	/**
	 * {@inheritDoc}
	 */
	protected Element doSave(Element parent) throws Exception {
		Element self = createChildElement(parent, "enrich");		
		Element sourceElem = createChildElement(self, "source");
		
		// Clone source.
		if (isCloneSource()) {
			sourceElem.setAttribute("clone", "true"); 
		} else {
			sourceElem.setAttribute("clone", "false");
		}
		
		// Source type.
		sourceElem.setAttribute("type", getSourceType().getLiteral());
		
		// Source XPath.
		if (getSourceType().equals(EnrichSourceType.CUSTOM)) {
			getSourceXpath().save(sourceElem);
		}
		
		// Source property.
		if (getSourceType().equals(EnrichSourceType.PROPERTY)) {
			sourceElem.setAttribute("property", getSourceProperty());
		}
		
		// Source inline XML.
		if (getSourceType().equals(EnrichSourceType.INLINE)) {
			Element inlineElem = null;
			try {
				inlineElem = EsbUtils.parseElement(getSourceXML());
				inlineElem = (Element) sourceElem.getOwnerDocument().
					importNode(inlineElem, true);
				sourceElem.appendChild(inlineElem);
			} catch (Exception ex) {
				// TODO: Log the error.

				// This is a workaround. 
				inlineElem = createChildElement(sourceElem, "inline");
				setSourceXML(SOURCE_XML_EDEFAULT);
			}
		}	
		
		Element target = createChildElement(self,"target");
		
		// Target action.
		target.setAttribute("action", getTargetAction().getLiteral());
		
		// Target type.
		target.setAttribute("type", getTargetType().getLiteral());
		
		// Target XPath.
		if (getTargetType().equals(EnrichTargetType.CUSTOM)) {
			getTargetXpath().save(target);
		}
		
		// Target property.
		if (getTargetType().equals(EnrichTargetType.PROPERTY)) {
			target.setAttribute("property", getTargetProperty());
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
		return MediatorPackage.Literals.ENRICH_MEDIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCloneSource() {
		return cloneSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloneSource(boolean newCloneSource) {
		boolean oldCloneSource = cloneSource;
		cloneSource = newCloneSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.ENRICH_MEDIATOR__CLONE_SOURCE, oldCloneSource, cloneSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrichSourceType getSourceType() {
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceType(EnrichSourceType newSourceType) {
		EnrichSourceType oldSourceType = sourceType;
		sourceType = newSourceType == null ? SOURCE_TYPE_EDEFAULT : newSourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.ENRICH_MEDIATOR__SOURCE_TYPE, oldSourceType, sourceType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MediatorPackage.ENRICH_MEDIATOR__SOURCE_XPATH, oldSourceXpath, newSourceXpath);
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
				msgs = ((InternalEObject)sourceXpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.ENRICH_MEDIATOR__SOURCE_XPATH, null, msgs);
			if (newSourceXpath != null)
				msgs = ((InternalEObject)newSourceXpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.ENRICH_MEDIATOR__SOURCE_XPATH, null, msgs);
			msgs = basicSetSourceXpath(newSourceXpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.ENRICH_MEDIATOR__SOURCE_XPATH, newSourceXpath, newSourceXpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceProperty() {
		return sourceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceProperty(String newSourceProperty) {
		String oldSourceProperty = sourceProperty;
		sourceProperty = newSourceProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.ENRICH_MEDIATOR__SOURCE_PROPERTY, oldSourceProperty, sourceProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceXML() {
		return sourceXML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceXML(String newSourceXML) {
		String oldSourceXML = sourceXML;
		sourceXML = newSourceXML;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.ENRICH_MEDIATOR__SOURCE_XML, oldSourceXML, sourceXML));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrichTargetAction getTargetAction() {
		return targetAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetAction(EnrichTargetAction newTargetAction) {
		EnrichTargetAction oldTargetAction = targetAction;
		targetAction = newTargetAction == null ? TARGET_ACTION_EDEFAULT : newTargetAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.ENRICH_MEDIATOR__TARGET_ACTION, oldTargetAction, targetAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrichTargetType getTargetType() {
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetType(EnrichTargetType newTargetType) {
		EnrichTargetType oldTargetType = targetType;
		targetType = newTargetType == null ? TARGET_TYPE_EDEFAULT : newTargetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.ENRICH_MEDIATOR__TARGET_TYPE, oldTargetType, targetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacedProperty getTargetXpath() {
		return targetXpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetXpath(NamespacedProperty newTargetXpath, NotificationChain msgs) {
		NamespacedProperty oldTargetXpath = targetXpath;
		targetXpath = newTargetXpath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MediatorPackage.ENRICH_MEDIATOR__TARGET_XPATH, oldTargetXpath, newTargetXpath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetXpath(NamespacedProperty newTargetXpath) {
		if (newTargetXpath != targetXpath) {
			NotificationChain msgs = null;
			if (targetXpath != null)
				msgs = ((InternalEObject)targetXpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.ENRICH_MEDIATOR__TARGET_XPATH, null, msgs);
			if (newTargetXpath != null)
				msgs = ((InternalEObject)newTargetXpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.ENRICH_MEDIATOR__TARGET_XPATH, null, msgs);
			msgs = basicSetTargetXpath(newTargetXpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.ENRICH_MEDIATOR__TARGET_XPATH, newTargetXpath, newTargetXpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetProperty() {
		return targetProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetProperty(String newTargetProperty) {
		String oldTargetProperty = targetProperty;
		targetProperty = newTargetProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.ENRICH_MEDIATOR__TARGET_PROPERTY, oldTargetProperty, targetProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MediatorPackage.ENRICH_MEDIATOR__SOURCE_XPATH:
				return basicSetSourceXpath(null, msgs);
			case MediatorPackage.ENRICH_MEDIATOR__TARGET_XPATH:
				return basicSetTargetXpath(null, msgs);
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
			case MediatorPackage.ENRICH_MEDIATOR__CLONE_SOURCE:
				return isCloneSource();
			case MediatorPackage.ENRICH_MEDIATOR__SOURCE_TYPE:
				return getSourceType();
			case MediatorPackage.ENRICH_MEDIATOR__SOURCE_XPATH:
				return getSourceXpath();
			case MediatorPackage.ENRICH_MEDIATOR__SOURCE_PROPERTY:
				return getSourceProperty();
			case MediatorPackage.ENRICH_MEDIATOR__SOURCE_XML:
				return getSourceXML();
			case MediatorPackage.ENRICH_MEDIATOR__TARGET_ACTION:
				return getTargetAction();
			case MediatorPackage.ENRICH_MEDIATOR__TARGET_TYPE:
				return getTargetType();
			case MediatorPackage.ENRICH_MEDIATOR__TARGET_XPATH:
				return getTargetXpath();
			case MediatorPackage.ENRICH_MEDIATOR__TARGET_PROPERTY:
				return getTargetProperty();
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
			case MediatorPackage.ENRICH_MEDIATOR__CLONE_SOURCE:
				setCloneSource((Boolean)newValue);
				return;
			case MediatorPackage.ENRICH_MEDIATOR__SOURCE_TYPE:
				setSourceType((EnrichSourceType)newValue);
				return;
			case MediatorPackage.ENRICH_MEDIATOR__SOURCE_XPATH:
				setSourceXpath((NamespacedProperty)newValue);
				return;
			case MediatorPackage.ENRICH_MEDIATOR__SOURCE_PROPERTY:
				setSourceProperty((String)newValue);
				return;
			case MediatorPackage.ENRICH_MEDIATOR__SOURCE_XML:
				setSourceXML((String)newValue);
				return;
			case MediatorPackage.ENRICH_MEDIATOR__TARGET_ACTION:
				setTargetAction((EnrichTargetAction)newValue);
				return;
			case MediatorPackage.ENRICH_MEDIATOR__TARGET_TYPE:
				setTargetType((EnrichTargetType)newValue);
				return;
			case MediatorPackage.ENRICH_MEDIATOR__TARGET_XPATH:
				setTargetXpath((NamespacedProperty)newValue);
				return;
			case MediatorPackage.ENRICH_MEDIATOR__TARGET_PROPERTY:
				setTargetProperty((String)newValue);
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
			case MediatorPackage.ENRICH_MEDIATOR__CLONE_SOURCE:
				setCloneSource(CLONE_SOURCE_EDEFAULT);
				return;
			case MediatorPackage.ENRICH_MEDIATOR__SOURCE_TYPE:
				setSourceType(SOURCE_TYPE_EDEFAULT);
				return;
			case MediatorPackage.ENRICH_MEDIATOR__SOURCE_XPATH:
				setSourceXpath((NamespacedProperty)null);
				return;
			case MediatorPackage.ENRICH_MEDIATOR__SOURCE_PROPERTY:
				setSourceProperty(SOURCE_PROPERTY_EDEFAULT);
				return;
			case MediatorPackage.ENRICH_MEDIATOR__SOURCE_XML:
				setSourceXML(SOURCE_XML_EDEFAULT);
				return;
			case MediatorPackage.ENRICH_MEDIATOR__TARGET_ACTION:
				setTargetAction(TARGET_ACTION_EDEFAULT);
				return;
			case MediatorPackage.ENRICH_MEDIATOR__TARGET_TYPE:
				setTargetType(TARGET_TYPE_EDEFAULT);
				return;
			case MediatorPackage.ENRICH_MEDIATOR__TARGET_XPATH:
				setTargetXpath((NamespacedProperty)null);
				return;
			case MediatorPackage.ENRICH_MEDIATOR__TARGET_PROPERTY:
				setTargetProperty(TARGET_PROPERTY_EDEFAULT);
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
			case MediatorPackage.ENRICH_MEDIATOR__CLONE_SOURCE:
				return cloneSource != CLONE_SOURCE_EDEFAULT;
			case MediatorPackage.ENRICH_MEDIATOR__SOURCE_TYPE:
				return sourceType != SOURCE_TYPE_EDEFAULT;
			case MediatorPackage.ENRICH_MEDIATOR__SOURCE_XPATH:
				return sourceXpath != null;
			case MediatorPackage.ENRICH_MEDIATOR__SOURCE_PROPERTY:
				return SOURCE_PROPERTY_EDEFAULT == null ? sourceProperty != null : !SOURCE_PROPERTY_EDEFAULT.equals(sourceProperty);
			case MediatorPackage.ENRICH_MEDIATOR__SOURCE_XML:
				return SOURCE_XML_EDEFAULT == null ? sourceXML != null : !SOURCE_XML_EDEFAULT.equals(sourceXML);
			case MediatorPackage.ENRICH_MEDIATOR__TARGET_ACTION:
				return targetAction != TARGET_ACTION_EDEFAULT;
			case MediatorPackage.ENRICH_MEDIATOR__TARGET_TYPE:
				return targetType != TARGET_TYPE_EDEFAULT;
			case MediatorPackage.ENRICH_MEDIATOR__TARGET_XPATH:
				return targetXpath != null;
			case MediatorPackage.ENRICH_MEDIATOR__TARGET_PROPERTY:
				return TARGET_PROPERTY_EDEFAULT == null ? targetProperty != null : !TARGET_PROPERTY_EDEFAULT.equals(targetProperty);
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
		result.append(" (cloneSource: ");
		result.append(cloneSource);
		result.append(", sourceType: ");
		result.append(sourceType);
		result.append(", sourceProperty: ");
		result.append(sourceProperty);
		result.append(", sourceXML: ");
		result.append(sourceXML);
		result.append(", targetAction: ");
		result.append(targetAction);
		result.append(", targetType: ");
		result.append(targetType);
		result.append(", targetProperty: ");
		result.append(targetProperty);
		result.append(')');
		return result.toString();
	}

} //EnrichMediatorImpl
