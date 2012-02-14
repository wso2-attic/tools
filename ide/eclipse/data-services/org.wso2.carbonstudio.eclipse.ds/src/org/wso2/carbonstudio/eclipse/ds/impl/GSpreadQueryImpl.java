/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSpread Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.GSpreadQueryImpl#getWorksheetnumber <em>Worksheetnumber</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.GSpreadQueryImpl#getStartingrow <em>Startingrow</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.GSpreadQueryImpl#getMaxrowcount <em>Maxrowcount</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.GSpreadQueryImpl#isHasheader <em>Hasheader</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GSpreadQueryImpl extends EObjectImpl implements GSpreadQuery {
	/**
	 * The default value of the '{@link #getWorksheetnumber() <em>Worksheetnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorksheetnumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger WORKSHEETNUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorksheetnumber() <em>Worksheetnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorksheetnumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger worksheetnumber = WORKSHEETNUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartingrow() <em>Startingrow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingrow()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger STARTINGROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartingrow() <em>Startingrow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingrow()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startingrow = STARTINGROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxrowcount() <em>Maxrowcount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxrowcount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAXROWCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxrowcount() <em>Maxrowcount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxrowcount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxrowcount = MAXROWCOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasheader() <em>Hasheader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasheader()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HASHEADER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasheader() <em>Hasheader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasheader()
	 * @generated
	 * @ordered
	 */
	protected boolean hasheader = HASHEADER_EDEFAULT;

	/**
	 * This is true if the Hasheader attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hasheaderESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSpreadQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsPackage.Literals.GSPREAD_QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getWorksheetnumber() {
		return worksheetnumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorksheetnumber(BigInteger newWorksheetnumber) {
		BigInteger oldWorksheetnumber = worksheetnumber;
		worksheetnumber = newWorksheetnumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.GSPREAD_QUERY__WORKSHEETNUMBER, oldWorksheetnumber, worksheetnumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStartingrow() {
		return startingrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingrow(BigInteger newStartingrow) {
		BigInteger oldStartingrow = startingrow;
		startingrow = newStartingrow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.GSPREAD_QUERY__STARTINGROW, oldStartingrow, startingrow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxrowcount() {
		return maxrowcount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxrowcount(BigInteger newMaxrowcount) {
		BigInteger oldMaxrowcount = maxrowcount;
		maxrowcount = newMaxrowcount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.GSPREAD_QUERY__MAXROWCOUNT, oldMaxrowcount, maxrowcount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasheader() {
		return hasheader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasheader(boolean newHasheader) {
		boolean oldHasheader = hasheader;
		hasheader = newHasheader;
		boolean oldHasheaderESet = hasheaderESet;
		hasheaderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.GSPREAD_QUERY__HASHEADER, oldHasheader, hasheader, !oldHasheaderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasheader() {
		boolean oldHasheader = hasheader;
		boolean oldHasheaderESet = hasheaderESet;
		hasheader = HASHEADER_EDEFAULT;
		hasheaderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DsPackage.GSPREAD_QUERY__HASHEADER, oldHasheader, HASHEADER_EDEFAULT, oldHasheaderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasheader() {
		return hasheaderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsPackage.GSPREAD_QUERY__WORKSHEETNUMBER:
				return getWorksheetnumber();
			case DsPackage.GSPREAD_QUERY__STARTINGROW:
				return getStartingrow();
			case DsPackage.GSPREAD_QUERY__MAXROWCOUNT:
				return getMaxrowcount();
			case DsPackage.GSPREAD_QUERY__HASHEADER:
				return isHasheader();
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
			case DsPackage.GSPREAD_QUERY__WORKSHEETNUMBER:
				setWorksheetnumber((BigInteger)newValue);
				return;
			case DsPackage.GSPREAD_QUERY__STARTINGROW:
				setStartingrow((BigInteger)newValue);
				return;
			case DsPackage.GSPREAD_QUERY__MAXROWCOUNT:
				setMaxrowcount((BigInteger)newValue);
				return;
			case DsPackage.GSPREAD_QUERY__HASHEADER:
				setHasheader((Boolean)newValue);
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
			case DsPackage.GSPREAD_QUERY__WORKSHEETNUMBER:
				setWorksheetnumber(WORKSHEETNUMBER_EDEFAULT);
				return;
			case DsPackage.GSPREAD_QUERY__STARTINGROW:
				setStartingrow(STARTINGROW_EDEFAULT);
				return;
			case DsPackage.GSPREAD_QUERY__MAXROWCOUNT:
				setMaxrowcount(MAXROWCOUNT_EDEFAULT);
				return;
			case DsPackage.GSPREAD_QUERY__HASHEADER:
				unsetHasheader();
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
			case DsPackage.GSPREAD_QUERY__WORKSHEETNUMBER:
				return WORKSHEETNUMBER_EDEFAULT == null ? worksheetnumber != null : !WORKSHEETNUMBER_EDEFAULT.equals(worksheetnumber);
			case DsPackage.GSPREAD_QUERY__STARTINGROW:
				return STARTINGROW_EDEFAULT == null ? startingrow != null : !STARTINGROW_EDEFAULT.equals(startingrow);
			case DsPackage.GSPREAD_QUERY__MAXROWCOUNT:
				return MAXROWCOUNT_EDEFAULT == null ? maxrowcount != null : !MAXROWCOUNT_EDEFAULT.equals(maxrowcount);
			case DsPackage.GSPREAD_QUERY__HASHEADER:
				return isSetHasheader();
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
		result.append(" (worksheetnumber: ");
		result.append(worksheetnumber);
		result.append(", startingrow: ");
		result.append(startingrow);
		result.append(", maxrowcount: ");
		result.append(maxrowcount);
		result.append(", hasheader: ");
		if (hasheaderESet) result.append(hasheader); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSpreadQueryImpl
