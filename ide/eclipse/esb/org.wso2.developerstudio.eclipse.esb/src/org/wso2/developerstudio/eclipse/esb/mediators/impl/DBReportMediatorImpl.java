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

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.w3c.dom.Element;
import org.wso2.developerstudio.eclipse.esb.mediators.DBReportMediator;
import org.wso2.developerstudio.eclipse.esb.mediators.MediatorsPackage;
import org.wso2.developerstudio.eclipse.esb.mediators.SqlStatement;
import org.wso2.developerstudio.eclipse.esb.util.ObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DB Report Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.esb.mediators.impl.DBReportMediatorImpl#isConnectionUseTransaction <em>Connection Use Transaction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DBReportMediatorImpl extends AbstractSqlExecutorMediatorImpl implements DBReportMediator {
	/**
     * The default value of the '{@link #isConnectionUseTransaction() <em>Connection Use Transaction</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isConnectionUseTransaction()
     * @generated
     * @ordered
     */
	protected static final boolean CONNECTION_USE_TRANSACTION_EDEFAULT = false;
	/**
     * The cached value of the '{@link #isConnectionUseTransaction() <em>Connection Use Transaction</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isConnectionUseTransaction()
     * @generated
     * @ordered
     */
	protected boolean connectionUseTransaction = CONNECTION_USE_TRANSACTION_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected DBReportMediatorImpl() {
        super();
    }

	/**
	 * {@inheritDoc}
	 */
	protected void doLoad(Element self) throws Exception {
		// Use transaction flag.
		if (self.getAttribute("useTransaction").equalsIgnoreCase("true")) {
			setConnectionUseTransaction(true);
		}
		
		// Connection.
		Element connectionElem = getChildElement(self, "connection");
		if (null != connectionElem) {
			loadConnection(connectionElem);
		} else {
			throw new Exception("Expected connection element.");
		}
		
		// Statements.
		loadObjects(self, "statement", SqlStatement.class, new ObjectHandler<SqlStatement>() {
			public void handle(SqlStatement object) {
				object.setResultsEnabled(true);
				getSqlStatements().add(object);
			}			
		});		
	}

	/**
	 * {@inheritDoc}
	 */
	protected Element doSave(Element parent) throws Exception {
		Element self = createChildElement(parent, "dbreport");
		
		// Use transaction flag.
		self.setAttribute("useTransaction", Boolean.toString(isConnectionUseTransaction()));
		
		// Connection.
		Element connectionElem = createChildElement(self, "connection");
		saveConnection(connectionElem);
		
		// Statements.
		for (SqlStatement statement : getSqlStatements()) {
			statement.save(self);
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
        return MediatorsPackage.Literals.DB_REPORT_MEDIATOR;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isConnectionUseTransaction() {
        return connectionUseTransaction;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setConnectionUseTransaction(boolean newConnectionUseTransaction) {
        boolean oldConnectionUseTransaction = connectionUseTransaction;
        connectionUseTransaction = newConnectionUseTransaction;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MediatorsPackage.DB_REPORT_MEDIATOR__CONNECTION_USE_TRANSACTION, oldConnectionUseTransaction, connectionUseTransaction));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MediatorsPackage.DB_REPORT_MEDIATOR__CONNECTION_USE_TRANSACTION:
                return isConnectionUseTransaction();
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
            case MediatorsPackage.DB_REPORT_MEDIATOR__CONNECTION_USE_TRANSACTION:
                setConnectionUseTransaction((Boolean)newValue);
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
            case MediatorsPackage.DB_REPORT_MEDIATOR__CONNECTION_USE_TRANSACTION:
                setConnectionUseTransaction(CONNECTION_USE_TRANSACTION_EDEFAULT);
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
            case MediatorsPackage.DB_REPORT_MEDIATOR__CONNECTION_USE_TRANSACTION:
                return connectionUseTransaction != CONNECTION_USE_TRANSACTION_EDEFAULT;
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
        result.append(" (connectionUseTransaction: ");
        result.append(connectionUseTransaction);
        result.append(')');
        return result.toString();
    }

	@Override
    public Map<String, ObjectValidator> validate() {
	    // TODO Auto-generated method stub
	    return null;
    }

} //DBReportMediatorImpl
