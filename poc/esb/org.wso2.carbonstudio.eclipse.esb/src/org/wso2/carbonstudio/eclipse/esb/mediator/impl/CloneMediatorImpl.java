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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.w3c.dom.Element;
import org.wso2.carbonstudio.eclipse.esb.impl.MediatorImpl;
import org.wso2.carbonstudio.eclipse.esb.mediator.CloneMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.CloneTarget;
import org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clone Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.CloneMediatorImpl#isContinueParent <em>Continue Parent</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.CloneMediatorImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CloneMediatorImpl extends MediatorImpl implements CloneMediator {
	/**
	 * The default value of the '{@link #isContinueParent() <em>Continue Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContinueParent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTINUE_PARENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContinueParent() <em>Continue Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContinueParent()
	 * @generated
	 * @ordered
	 */
	protected boolean continueParent = CONTINUE_PARENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<CloneTarget> targets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloneMediatorImpl() {
		super();
	}
	
	/**
	 * {@inheritDoc}
	 */
	protected void doLoad(Element self) throws Exception {
		if (self.hasAttribute("continueParent")) {
			setContinueParent(self.getAttribute("continueParent").equals("true") ? true : false);
		} else {
			setContinueParent(false);
		}

		// Targets.
		loadObjects(self, "target", CloneTarget.class, new ObjectHandler<CloneTarget>() {
			public void handle(CloneTarget object) {
				getTargets().add(object);
			}			
		});		
	}

	/**
	 * {@inheritDoc}
	 */
	protected Element doSave(Element parent) throws Exception {
		Element self = createChildElement(parent, "clone");		
		if (isContinueParent()) {
			self.setAttribute("continueParent", "true");
		}
		
		// Targets.
		for (CloneTarget target : getTargets()) {
			target.save(self);
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
		return MediatorPackage.Literals.CLONE_MEDIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContinueParent() {
		return continueParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinueParent(boolean newContinueParent) {
		boolean oldContinueParent = continueParent;
		continueParent = newContinueParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.CLONE_MEDIATOR__CONTINUE_PARENT, oldContinueParent, continueParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloneTarget> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentEList<CloneTarget>(CloneTarget.class, this, MediatorPackage.CLONE_MEDIATOR__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MediatorPackage.CLONE_MEDIATOR__TARGETS:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
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
			case MediatorPackage.CLONE_MEDIATOR__CONTINUE_PARENT:
				return isContinueParent();
			case MediatorPackage.CLONE_MEDIATOR__TARGETS:
				return getTargets();
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
			case MediatorPackage.CLONE_MEDIATOR__CONTINUE_PARENT:
				setContinueParent((Boolean)newValue);
				return;
			case MediatorPackage.CLONE_MEDIATOR__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends CloneTarget>)newValue);
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
			case MediatorPackage.CLONE_MEDIATOR__CONTINUE_PARENT:
				setContinueParent(CONTINUE_PARENT_EDEFAULT);
				return;
			case MediatorPackage.CLONE_MEDIATOR__TARGETS:
				getTargets().clear();
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
			case MediatorPackage.CLONE_MEDIATOR__CONTINUE_PARENT:
				return continueParent != CONTINUE_PARENT_EDEFAULT;
			case MediatorPackage.CLONE_MEDIATOR__TARGETS:
				return targets != null && !targets.isEmpty();
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
		result.append(" (continueParent: ");
		result.append(continueParent);
		result.append(')');
		return result.toString();
	}

} //CloneMediatorImpl
