/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.ds.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.wso2.developerstudio.eclipse.ds.DsPackage;
import org.wso2.developerstudio.eclipse.ds.ExcelQuery;
import org.wso2.developerstudio.eclipse.ds.HasHeader;
import org.wso2.developerstudio.eclipse.ds.MaxRowCount;
import org.wso2.developerstudio.eclipse.ds.StartingRow;
import org.wso2.developerstudio.eclipse.ds.WorkBookName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Excel Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.ExcelQueryImpl#getWorkbookname <em>Workbookname</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.ExcelQueryImpl#getHasheader <em>Hasheader</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.ExcelQueryImpl#getStartingrow <em>Startingrow</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.ExcelQueryImpl#getMaxrowcount <em>Maxrowcount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExcelQueryImpl extends EObjectImpl implements ExcelQuery {
	/**
	 * The cached value of the '{@link #getWorkbookname() <em>Workbookname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkbookname()
	 * @generated
	 * @ordered
	 */
	protected WorkBookName workbookname;

	/**
	 * The cached value of the '{@link #getHasheader() <em>Hasheader</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasheader()
	 * @generated
	 * @ordered
	 */
	protected HasHeader hasheader;

	/**
	 * The cached value of the '{@link #getStartingrow() <em>Startingrow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingrow()
	 * @generated
	 * @ordered
	 */
	protected StartingRow startingrow;

	/**
	 * The cached value of the '{@link #getMaxrowcount() <em>Maxrowcount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxrowcount()
	 * @generated
	 * @ordered
	 */
	protected MaxRowCount maxrowcount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExcelQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	protected EClass eStaticClass() {
		return DsPackage.Literals.EXCEL_QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkBookName getWorkbookname() {
		return workbookname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkbookname(WorkBookName newWorkbookname, NotificationChain msgs) {
		WorkBookName oldWorkbookname = workbookname;
		workbookname = newWorkbookname;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsPackage.EXCEL_QUERY__WORKBOOKNAME, oldWorkbookname, newWorkbookname);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkbookname(WorkBookName newWorkbookname) {
		if (newWorkbookname != workbookname) {
			NotificationChain msgs = null;
			if (workbookname != null)
				msgs = ((InternalEObject)workbookname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsPackage.EXCEL_QUERY__WORKBOOKNAME, null, msgs);
			if (newWorkbookname != null)
				msgs = ((InternalEObject)newWorkbookname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsPackage.EXCEL_QUERY__WORKBOOKNAME, null, msgs);
			msgs = basicSetWorkbookname(newWorkbookname, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.EXCEL_QUERY__WORKBOOKNAME, newWorkbookname, newWorkbookname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasHeader getHasheader() {
		return hasheader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasheader(HasHeader newHasheader, NotificationChain msgs) {
		HasHeader oldHasheader = hasheader;
		hasheader = newHasheader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsPackage.EXCEL_QUERY__HASHEADER, oldHasheader, newHasheader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasheader(HasHeader newHasheader) {
		if (newHasheader != hasheader) {
			NotificationChain msgs = null;
			if (hasheader != null)
				msgs = ((InternalEObject)hasheader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsPackage.EXCEL_QUERY__HASHEADER, null, msgs);
			if (newHasheader != null)
				msgs = ((InternalEObject)newHasheader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsPackage.EXCEL_QUERY__HASHEADER, null, msgs);
			msgs = basicSetHasheader(newHasheader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.EXCEL_QUERY__HASHEADER, newHasheader, newHasheader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartingRow getStartingrow() {
		return startingrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartingrow(StartingRow newStartingrow, NotificationChain msgs) {
		StartingRow oldStartingrow = startingrow;
		startingrow = newStartingrow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsPackage.EXCEL_QUERY__STARTINGROW, oldStartingrow, newStartingrow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingrow(StartingRow newStartingrow) {
		if (newStartingrow != startingrow) {
			NotificationChain msgs = null;
			if (startingrow != null)
				msgs = ((InternalEObject)startingrow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsPackage.EXCEL_QUERY__STARTINGROW, null, msgs);
			if (newStartingrow != null)
				msgs = ((InternalEObject)newStartingrow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsPackage.EXCEL_QUERY__STARTINGROW, null, msgs);
			msgs = basicSetStartingrow(newStartingrow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.EXCEL_QUERY__STARTINGROW, newStartingrow, newStartingrow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxRowCount getMaxrowcount() {
		return maxrowcount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxrowcount(MaxRowCount newMaxrowcount, NotificationChain msgs) {
		MaxRowCount oldMaxrowcount = maxrowcount;
		maxrowcount = newMaxrowcount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsPackage.EXCEL_QUERY__MAXROWCOUNT, oldMaxrowcount, newMaxrowcount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxrowcount(MaxRowCount newMaxrowcount) {
		if (newMaxrowcount != maxrowcount) {
			NotificationChain msgs = null;
			if (maxrowcount != null)
				msgs = ((InternalEObject)maxrowcount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsPackage.EXCEL_QUERY__MAXROWCOUNT, null, msgs);
			if (newMaxrowcount != null)
				msgs = ((InternalEObject)newMaxrowcount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsPackage.EXCEL_QUERY__MAXROWCOUNT, null, msgs);
			msgs = basicSetMaxrowcount(newMaxrowcount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.EXCEL_QUERY__MAXROWCOUNT, newMaxrowcount, newMaxrowcount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsPackage.EXCEL_QUERY__WORKBOOKNAME:
				return basicSetWorkbookname(null, msgs);
			case DsPackage.EXCEL_QUERY__HASHEADER:
				return basicSetHasheader(null, msgs);
			case DsPackage.EXCEL_QUERY__STARTINGROW:
				return basicSetStartingrow(null, msgs);
			case DsPackage.EXCEL_QUERY__MAXROWCOUNT:
				return basicSetMaxrowcount(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsPackage.EXCEL_QUERY__WORKBOOKNAME:
				return getWorkbookname();
			case DsPackage.EXCEL_QUERY__HASHEADER:
				return getHasheader();
			case DsPackage.EXCEL_QUERY__STARTINGROW:
				return getStartingrow();
			case DsPackage.EXCEL_QUERY__MAXROWCOUNT:
				return getMaxrowcount();
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
			case DsPackage.EXCEL_QUERY__WORKBOOKNAME:
				setWorkbookname((WorkBookName)newValue);
				return;
			case DsPackage.EXCEL_QUERY__HASHEADER:
				setHasheader((HasHeader)newValue);
				return;
			case DsPackage.EXCEL_QUERY__STARTINGROW:
				setStartingrow((StartingRow)newValue);
				return;
			case DsPackage.EXCEL_QUERY__MAXROWCOUNT:
				setMaxrowcount((MaxRowCount)newValue);
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
			case DsPackage.EXCEL_QUERY__WORKBOOKNAME:
				setWorkbookname((WorkBookName)null);
				return;
			case DsPackage.EXCEL_QUERY__HASHEADER:
				setHasheader((HasHeader)null);
				return;
			case DsPackage.EXCEL_QUERY__STARTINGROW:
				setStartingrow((StartingRow)null);
				return;
			case DsPackage.EXCEL_QUERY__MAXROWCOUNT:
				setMaxrowcount((MaxRowCount)null);
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
			case DsPackage.EXCEL_QUERY__WORKBOOKNAME:
				return workbookname != null;
			case DsPackage.EXCEL_QUERY__HASHEADER:
				return hasheader != null;
			case DsPackage.EXCEL_QUERY__STARTINGROW:
				return startingrow != null;
			case DsPackage.EXCEL_QUERY__MAXROWCOUNT:
				return maxrowcount != null;
		}
		return super.eIsSet(featureID);
	}

} //ExcelQueryImpl
