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
package org.wso2.developerstudio.eclipse.esb.mediators.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.w3c.dom.Element;
import org.wso2.developerstudio.eclipse.esb.impl.MediatorImpl;
import org.wso2.developerstudio.eclipse.esb.mediators.EntitlementMediator;
import org.wso2.developerstudio.eclipse.esb.mediators.MediatorsPackage;
import org.wso2.developerstudio.eclipse.esb.mediators.SqlExecutorConnectionType;
import org.wso2.developerstudio.eclipse.esb.mediators.SqlExecutorDatasourceType;
import org.wso2.developerstudio.eclipse.esb.util.ObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entitlement Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.esb.mediators.impl.EntitlementMediatorImpl#getServerURL <em>Server URL</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.esb.mediators.impl.EntitlementMediatorImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.esb.mediators.impl.EntitlementMediatorImpl#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntitlementMediatorImpl extends MediatorImpl implements EntitlementMediator {
	/**
     * The default value of the '{@link #getServerURL() <em>Server URL</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getServerURL()
     * @generated
     * @ordered
     */
	protected static final String SERVER_URL_EDEFAULT = "server_url";

	/**
     * The cached value of the '{@link #getServerURL() <em>Server URL</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getServerURL()
     * @generated
     * @ordered
     */
	protected String serverURL = SERVER_URL_EDEFAULT;

	/**
     * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUsername()
     * @generated
     * @ordered
     */
	protected static final String USERNAME_EDEFAULT = "username";

	/**
     * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUsername()
     * @generated
     * @ordered
     */
	protected String username = USERNAME_EDEFAULT;

	/**
     * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPassword()
     * @generated
     * @ordered
     */
	protected static final String PASSWORD_EDEFAULT = "password";

	/**
     * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPassword()
     * @generated
     * @ordered
     */
	protected String password = PASSWORD_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected EntitlementMediatorImpl() {
        super();
    }

	/**
	 * {@inheritDoc}
	 */
	public void doLoad(Element self) throws Exception {
		setServerURL(self.getAttribute("remoteServiceUrl"));
		setUsername(self.getAttribute("remoteServiceUserName"));
		setPassword(self.getAttribute("remoteServicePassword"));		
	}

	/**
	 * {@inheritDoc}
	 */
	public Element doSave(Element parent) throws Exception {
		Element self =  createChildElement(parent, "entitlementService");		
		self.setAttribute("remoteServiceUrl", getServerURL());		
		self.setAttribute("remoteServiceUserName", getUsername());		
		self.setAttribute("remoteServicePassword", getPassword());				
		return self;
	}
	
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	
	protected EClass eStaticClass() {
        return MediatorsPackage.Literals.ENTITLEMENT_MEDIATOR;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getServerURL() {
        return serverURL;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setServerURL(String newServerURL) {
        String oldServerURL = serverURL;
        serverURL = newServerURL;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MediatorsPackage.ENTITLEMENT_MEDIATOR__SERVER_URL, oldServerURL, serverURL));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getUsername() {
        return username;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setUsername(String newUsername) {
        String oldUsername = username;
        username = newUsername;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MediatorsPackage.ENTITLEMENT_MEDIATOR__USERNAME, oldUsername, username));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getPassword() {
        return password;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPassword(String newPassword) {
        String oldPassword = password;
        password = newPassword;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MediatorsPackage.ENTITLEMENT_MEDIATOR__PASSWORD, oldPassword, password));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MediatorsPackage.ENTITLEMENT_MEDIATOR__SERVER_URL:
                return getServerURL();
            case MediatorsPackage.ENTITLEMENT_MEDIATOR__USERNAME:
                return getUsername();
            case MediatorsPackage.ENTITLEMENT_MEDIATOR__PASSWORD:
                return getPassword();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case MediatorsPackage.ENTITLEMENT_MEDIATOR__SERVER_URL:
                setServerURL((String)newValue);
                return;
            case MediatorsPackage.ENTITLEMENT_MEDIATOR__USERNAME:
                setUsername((String)newValue);
                return;
            case MediatorsPackage.ENTITLEMENT_MEDIATOR__PASSWORD:
                setPassword((String)newValue);
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
            case MediatorsPackage.ENTITLEMENT_MEDIATOR__SERVER_URL:
                setServerURL(SERVER_URL_EDEFAULT);
                return;
            case MediatorsPackage.ENTITLEMENT_MEDIATOR__USERNAME:
                setUsername(USERNAME_EDEFAULT);
                return;
            case MediatorsPackage.ENTITLEMENT_MEDIATOR__PASSWORD:
                setPassword(PASSWORD_EDEFAULT);
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
            case MediatorsPackage.ENTITLEMENT_MEDIATOR__SERVER_URL:
                return SERVER_URL_EDEFAULT == null ? serverURL != null : !SERVER_URL_EDEFAULT.equals(serverURL);
            case MediatorsPackage.ENTITLEMENT_MEDIATOR__USERNAME:
                return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
            case MediatorsPackage.ENTITLEMENT_MEDIATOR__PASSWORD:
                return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
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
        result.append(" (serverURL: ");
        result.append(serverURL);
        result.append(", username: ");
        result.append(username);
        result.append(", password: ");
        result.append(password);
        result.append(')');
        return result.toString();
    }

	
    public Map<String, ObjectValidator> validate() {
    	ObjectValidator objectValidator = new ObjectValidator();
 		Map<String, String> validateMap = new HashMap<String, String>();
 		Map<String, ObjectValidator> mediatorValidateMap = new HashMap<String, ObjectValidator>();
		if (null == getServerURL() || getServerURL().trim().isEmpty()) {
			validateMap.put("RemoteService URL","RemoteService URL Context is empty");
		}
		if (null == getUsername() || getUsername().trim().isEmpty()) {
			validateMap.put("remoteService username","RemoteService username is empty");
		}
		if (null == getPassword() || getPassword().trim().isEmpty()) {
			validateMap.put("remoteService password","RemoteService password is empty");
		}	
 	    objectValidator.setMediatorErrorMap(validateMap);
 	    mediatorValidateMap.put("Entitlement Mediator", objectValidator);
 	    return mediatorValidateMap;
    }

	
} //EntitlementMediatorImpl
