/* Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
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
package org.wso2.carbonstudio.eclipse.ds.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.wso2.carbonstudio.eclipse.ds.DsPackage;
import org.wso2.carbonstudio.eclipse.ds.GSpreadQuery;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>GSpread Query</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.GSpreadQueryImpl#getWorksheetNumber
 * <em>Worksheet Number</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.GSpreadQueryImpl#getStartingRow
 * <em>Starting Row</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.GSpreadQueryImpl#getMaxRowCount
 * <em>Max Row Count</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.GSpreadQueryImpl#isHasHeader
 * <em>Has Header</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class GSpreadQueryImpl extends EObjectImpl implements GSpreadQuery {
	/**
	 * The default value of the '{@link #getWorksheetNumber()
	 * <em>Worksheet Number</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getWorksheetNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger WORKSHEET_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorksheetNumber()
	 * <em>Worksheet Number</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getWorksheetNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger worksheetNumber = WORKSHEET_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartingRow() <em>Starting Row</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStartingRow()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger STARTING_ROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartingRow() <em>Starting Row</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStartingRow()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startingRow = STARTING_ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRowCount()
	 * <em>Max Row Count</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getMaxRowCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_ROW_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxRowCount() <em>Max Row Count</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMaxRowCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxRowCount = MAX_ROW_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasHeader() <em>Has Header</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isHasHeader()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_HEADER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasHeader() <em>Has Header</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isHasHeader()
	 * @generated
	 * @ordered
	 */
	protected boolean hasHeader = HAS_HEADER_EDEFAULT;

	/**
	 * This is true if the Has Header attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean hasHeaderESet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GSpreadQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsPackage.Literals.GSPREAD_QUERY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BigInteger getWorksheetNumber() {
		return worksheetNumber;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setWorksheetNumber(BigInteger newWorksheetNumber) {
		BigInteger oldWorksheetNumber = worksheetNumber;
		worksheetNumber = newWorksheetNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.GSPREAD_QUERY__WORKSHEET_NUMBER, oldWorksheetNumber, worksheetNumber));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BigInteger getStartingRow() {
		return startingRow;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStartingRow(BigInteger newStartingRow) {
		BigInteger oldStartingRow = startingRow;
		startingRow = newStartingRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.GSPREAD_QUERY__STARTING_ROW, oldStartingRow, startingRow));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BigInteger getMaxRowCount() {
		return maxRowCount;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMaxRowCount(BigInteger newMaxRowCount) {
		BigInteger oldMaxRowCount = maxRowCount;
		maxRowCount = newMaxRowCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.GSPREAD_QUERY__MAX_ROW_COUNT, oldMaxRowCount, maxRowCount));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isHasHeader() {
		return hasHeader;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setHasHeader(boolean newHasHeader) {
		boolean oldHasHeader = hasHeader;
		hasHeader = newHasHeader;
		boolean oldHasHeaderESet = hasHeaderESet;
		hasHeaderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.GSPREAD_QUERY__HAS_HEADER, oldHasHeader, hasHeader, !oldHasHeaderESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetHasHeader() {
		boolean oldHasHeader = hasHeader;
		boolean oldHasHeaderESet = hasHeaderESet;
		hasHeader = HAS_HEADER_EDEFAULT;
		hasHeaderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					DsPackage.GSPREAD_QUERY__HAS_HEADER, oldHasHeader, HAS_HEADER_EDEFAULT,
					oldHasHeaderESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetHasHeader() {
		return hasHeaderESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DsPackage.GSPREAD_QUERY__WORKSHEET_NUMBER:
			return getWorksheetNumber();
		case DsPackage.GSPREAD_QUERY__STARTING_ROW:
			return getStartingRow();
		case DsPackage.GSPREAD_QUERY__MAX_ROW_COUNT:
			return getMaxRowCount();
		case DsPackage.GSPREAD_QUERY__HAS_HEADER:
			return isHasHeader();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DsPackage.GSPREAD_QUERY__WORKSHEET_NUMBER:
			setWorksheetNumber((BigInteger) newValue);
			return;
		case DsPackage.GSPREAD_QUERY__STARTING_ROW:
			setStartingRow((BigInteger) newValue);
			return;
		case DsPackage.GSPREAD_QUERY__MAX_ROW_COUNT:
			setMaxRowCount((BigInteger) newValue);
			return;
		case DsPackage.GSPREAD_QUERY__HAS_HEADER:
			setHasHeader((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DsPackage.GSPREAD_QUERY__WORKSHEET_NUMBER:
			setWorksheetNumber(WORKSHEET_NUMBER_EDEFAULT);
			return;
		case DsPackage.GSPREAD_QUERY__STARTING_ROW:
			setStartingRow(STARTING_ROW_EDEFAULT);
			return;
		case DsPackage.GSPREAD_QUERY__MAX_ROW_COUNT:
			setMaxRowCount(MAX_ROW_COUNT_EDEFAULT);
			return;
		case DsPackage.GSPREAD_QUERY__HAS_HEADER:
			unsetHasHeader();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DsPackage.GSPREAD_QUERY__WORKSHEET_NUMBER:
			return WORKSHEET_NUMBER_EDEFAULT == null ? worksheetNumber != null
					: !WORKSHEET_NUMBER_EDEFAULT.equals(worksheetNumber);
		case DsPackage.GSPREAD_QUERY__STARTING_ROW:
			return STARTING_ROW_EDEFAULT == null ? startingRow != null : !STARTING_ROW_EDEFAULT
					.equals(startingRow);
		case DsPackage.GSPREAD_QUERY__MAX_ROW_COUNT:
			return MAX_ROW_COUNT_EDEFAULT == null ? maxRowCount != null : !MAX_ROW_COUNT_EDEFAULT
					.equals(maxRowCount);
		case DsPackage.GSPREAD_QUERY__HAS_HEADER:
			return isSetHasHeader();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (worksheetNumber: ");
		result.append(worksheetNumber);
		result.append(", startingRow: ");
		result.append(startingRow);
		result.append(", maxRowCount: ");
		result.append(maxRowCount);
		result.append(", hasHeader: ");
		if (hasHeaderESet)
			result.append(hasHeader);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // GSpreadQueryImpl
