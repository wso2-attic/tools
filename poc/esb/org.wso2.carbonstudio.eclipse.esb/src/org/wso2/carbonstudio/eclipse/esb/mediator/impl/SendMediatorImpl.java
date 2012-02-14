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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.w3c.dom.Element;
import org.wso2.carbonstudio.eclipse.esb.EndPoint;
import org.wso2.carbonstudio.eclipse.esb.EndPointReference;
import org.wso2.carbonstudio.eclipse.esb.impl.MediatorImpl;
import org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage;
import org.wso2.carbonstudio.eclipse.esb.mediator.SendMediator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SendMediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SendMediatorImpl#getAnonymousEndPoint <em>Anonymous End Point</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.impl.SendMediatorImpl#getEndPointReference <em>End Point Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SendMediatorImpl extends MediatorImpl implements SendMediator {
	/**
	 * The cached value of the '{@link #getAnonymousEndPoint() <em>Anonymous End Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymousEndPoint()
	 * @generated
	 * @ordered
	 */
	protected EndPoint anonymousEndPoint;
	/**
	 * The cached value of the '{@link #getEndPointReference() <em>End Point Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getEndPointReference()
	 * @generated
	 * @ordered
	 */
    protected EndPointReference endPointReference;
    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendMediatorImpl() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	public void doLoad(Element self) throws Exception {
		Element endpointElem = getChildElement(self, "endpoint");
		if (null != endpointElem) {
			if (endpointElem.hasAttribute("key-expression") || endpointElem.hasAttribute("key")) {
				loadObject(endpointElem, EndPointReference.class, false, new ObjectHandler<EndPointReference>() {
					public void handle(EndPointReference object) {
						setEndPointReference(object);
					}
				});
			} else {
				loadObject(endpointElem, EndPoint.class, false, new ObjectHandler<EndPoint>() {
					public void handle(EndPoint object) {
						setAnonymousEndPoint(object);
					}
				});
			}
		}	
	}

	/**
	 * {@inheritDoc}
	 */
	public Element doSave(Element parent) throws Exception {
		Element self = createChildElement(parent, "send");
		if (null != getEndPointReference()) {
			getEndPointReference().save(self);
		} else if (null != getAnonymousEndPoint()) {
			getAnonymousEndPoint().save(self);
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
		return MediatorPackage.Literals.SEND_MEDIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndPoint getAnonymousEndPoint() {
		return anonymousEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnonymousEndPoint(EndPoint newAnonymousEndPoint, NotificationChain msgs) {
		EndPoint oldAnonymousEndPoint = anonymousEndPoint;
		anonymousEndPoint = newAnonymousEndPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MediatorPackage.SEND_MEDIATOR__ANONYMOUS_END_POINT, oldAnonymousEndPoint, newAnonymousEndPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymousEndPoint(EndPoint newAnonymousEndPoint) {
		if (newAnonymousEndPoint != anonymousEndPoint) {
			NotificationChain msgs = null;
			if (anonymousEndPoint != null)
				msgs = ((InternalEObject)anonymousEndPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.SEND_MEDIATOR__ANONYMOUS_END_POINT, null, msgs);
			if (newAnonymousEndPoint != null)
				msgs = ((InternalEObject)newAnonymousEndPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.SEND_MEDIATOR__ANONYMOUS_END_POINT, null, msgs);
			msgs = basicSetAnonymousEndPoint(newAnonymousEndPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.SEND_MEDIATOR__ANONYMOUS_END_POINT, newAnonymousEndPoint, newAnonymousEndPoint));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EndPointReference getEndPointReference() {
		return endPointReference;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetEndPointReference(EndPointReference newEndPointReference, NotificationChain msgs) {
		EndPointReference oldEndPointReference = endPointReference;
		endPointReference = newEndPointReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MediatorPackage.SEND_MEDIATOR__END_POINT_REFERENCE, oldEndPointReference, newEndPointReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setEndPointReference(EndPointReference newEndPointReference) {
		if (newEndPointReference != endPointReference) {
			NotificationChain msgs = null;
			if (endPointReference != null)
				msgs = ((InternalEObject)endPointReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.SEND_MEDIATOR__END_POINT_REFERENCE, null, msgs);
			if (newEndPointReference != null)
				msgs = ((InternalEObject)newEndPointReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MediatorPackage.SEND_MEDIATOR__END_POINT_REFERENCE, null, msgs);
			msgs = basicSetEndPointReference(newEndPointReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.SEND_MEDIATOR__END_POINT_REFERENCE, newEndPointReference, newEndPointReference));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MediatorPackage.SEND_MEDIATOR__ANONYMOUS_END_POINT:
				return basicSetAnonymousEndPoint(null, msgs);
			case MediatorPackage.SEND_MEDIATOR__END_POINT_REFERENCE:
				return basicSetEndPointReference(null, msgs);
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
			case MediatorPackage.SEND_MEDIATOR__ANONYMOUS_END_POINT:
				return getAnonymousEndPoint();
			case MediatorPackage.SEND_MEDIATOR__END_POINT_REFERENCE:
				return getEndPointReference();
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
			case MediatorPackage.SEND_MEDIATOR__ANONYMOUS_END_POINT:
				setAnonymousEndPoint((EndPoint)newValue);
				return;
			case MediatorPackage.SEND_MEDIATOR__END_POINT_REFERENCE:
				setEndPointReference((EndPointReference)newValue);
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
			case MediatorPackage.SEND_MEDIATOR__ANONYMOUS_END_POINT:
				setAnonymousEndPoint((EndPoint)null);
				return;
			case MediatorPackage.SEND_MEDIATOR__END_POINT_REFERENCE:
				setEndPointReference((EndPointReference)null);
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
			case MediatorPackage.SEND_MEDIATOR__ANONYMOUS_END_POINT:
				return anonymousEndPoint != null;
			case MediatorPackage.SEND_MEDIATOR__END_POINT_REFERENCE:
				return endPointReference != null;
		}
		return super.eIsSet(featureID);
	}

} //SendMediatorImpl
