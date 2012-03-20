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
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.ValidateFeature;
import org.wso2.developerstudio.eclipse.gmf.esb.ValidateMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.ValidateOnFailBranch;
import org.wso2.developerstudio.eclipse.gmf.esb.ValidateSchema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validate Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ValidateMediatorImpl#getSourceXpath <em>Source Xpath</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ValidateMediatorImpl#getOnFailBranch <em>On Fail Branch</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ValidateMediatorImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ValidateMediatorImpl#getSchemas <em>Schemas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValidateMediatorImpl extends MediatorImpl implements ValidateMediator {
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
	 * The cached value of the '{@link #getOnFailBranch() <em>On Fail Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnFailBranch()
	 * @generated
	 * @ordered
	 */
	protected ValidateOnFailBranch onFailBranch;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidateFeature> features;

	/**
	 * The cached value of the '{@link #getSchemas() <em>Schemas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemas()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidateSchema> schemas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidateMediatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.VALIDATE_MEDIATOR;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.VALIDATE_MEDIATOR__SOURCE_XPATH, oldSourceXpath, newSourceXpath);
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
				msgs = ((InternalEObject)sourceXpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.VALIDATE_MEDIATOR__SOURCE_XPATH, null, msgs);
			if (newSourceXpath != null)
				msgs = ((InternalEObject)newSourceXpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.VALIDATE_MEDIATOR__SOURCE_XPATH, null, msgs);
			msgs = basicSetSourceXpath(newSourceXpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.VALIDATE_MEDIATOR__SOURCE_XPATH, newSourceXpath, newSourceXpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidateOnFailBranch getOnFailBranch() {
		return onFailBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnFailBranch(ValidateOnFailBranch newOnFailBranch, NotificationChain msgs) {
		ValidateOnFailBranch oldOnFailBranch = onFailBranch;
		onFailBranch = newOnFailBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.VALIDATE_MEDIATOR__ON_FAIL_BRANCH, oldOnFailBranch, newOnFailBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnFailBranch(ValidateOnFailBranch newOnFailBranch) {
		if (newOnFailBranch != onFailBranch) {
			NotificationChain msgs = null;
			if (onFailBranch != null)
				msgs = ((InternalEObject)onFailBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.VALIDATE_MEDIATOR__ON_FAIL_BRANCH, null, msgs);
			if (newOnFailBranch != null)
				msgs = ((InternalEObject)newOnFailBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.VALIDATE_MEDIATOR__ON_FAIL_BRANCH, null, msgs);
			msgs = basicSetOnFailBranch(newOnFailBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.VALIDATE_MEDIATOR__ON_FAIL_BRANCH, newOnFailBranch, newOnFailBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValidateFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<ValidateFeature>(ValidateFeature.class, this, EsbPackage.VALIDATE_MEDIATOR__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValidateSchema> getSchemas() {
		if (schemas == null) {
			schemas = new EObjectContainmentEList<ValidateSchema>(ValidateSchema.class, this, EsbPackage.VALIDATE_MEDIATOR__SCHEMAS);
		}
		return schemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.VALIDATE_MEDIATOR__SOURCE_XPATH:
				return basicSetSourceXpath(null, msgs);
			case EsbPackage.VALIDATE_MEDIATOR__ON_FAIL_BRANCH:
				return basicSetOnFailBranch(null, msgs);
			case EsbPackage.VALIDATE_MEDIATOR__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case EsbPackage.VALIDATE_MEDIATOR__SCHEMAS:
				return ((InternalEList<?>)getSchemas()).basicRemove(otherEnd, msgs);
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
			case EsbPackage.VALIDATE_MEDIATOR__SOURCE_XPATH:
				return getSourceXpath();
			case EsbPackage.VALIDATE_MEDIATOR__ON_FAIL_BRANCH:
				return getOnFailBranch();
			case EsbPackage.VALIDATE_MEDIATOR__FEATURES:
				return getFeatures();
			case EsbPackage.VALIDATE_MEDIATOR__SCHEMAS:
				return getSchemas();
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
			case EsbPackage.VALIDATE_MEDIATOR__SOURCE_XPATH:
				setSourceXpath((NamespacedProperty)newValue);
				return;
			case EsbPackage.VALIDATE_MEDIATOR__ON_FAIL_BRANCH:
				setOnFailBranch((ValidateOnFailBranch)newValue);
				return;
			case EsbPackage.VALIDATE_MEDIATOR__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends ValidateFeature>)newValue);
				return;
			case EsbPackage.VALIDATE_MEDIATOR__SCHEMAS:
				getSchemas().clear();
				getSchemas().addAll((Collection<? extends ValidateSchema>)newValue);
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
			case EsbPackage.VALIDATE_MEDIATOR__SOURCE_XPATH:
				setSourceXpath((NamespacedProperty)null);
				return;
			case EsbPackage.VALIDATE_MEDIATOR__ON_FAIL_BRANCH:
				setOnFailBranch((ValidateOnFailBranch)null);
				return;
			case EsbPackage.VALIDATE_MEDIATOR__FEATURES:
				getFeatures().clear();
				return;
			case EsbPackage.VALIDATE_MEDIATOR__SCHEMAS:
				getSchemas().clear();
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
			case EsbPackage.VALIDATE_MEDIATOR__SOURCE_XPATH:
				return sourceXpath != null;
			case EsbPackage.VALIDATE_MEDIATOR__ON_FAIL_BRANCH:
				return onFailBranch != null;
			case EsbPackage.VALIDATE_MEDIATOR__FEATURES:
				return features != null && !features.isEmpty();
			case EsbPackage.VALIDATE_MEDIATOR__SCHEMAS:
				return schemas != null && !schemas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValidateMediatorImpl
