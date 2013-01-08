/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.wso2.developerstudio.eclipse.gmf.esb.EndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EndPointImpl#getEndPointName <em>End Point Name</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EndPointImpl#isAnonymous <em>Anonymous</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EndPointImpl#isInLine <em>In Line</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.EndPointImpl#isDuplicate <em>Duplicate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EndPointImpl extends EsbElementImpl implements EndPoint {
	/**
	 * The default value of the '{@link #getEndPointName() <em>End Point Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointName()
	 * @generated
	 * @ordered
	 */
	protected static final String END_POINT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndPointName() <em>End Point Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointName()
	 * @generated
	 * @ordered
	 */
	protected String endPointName = END_POINT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isAnonymous() <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnonymous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANONYMOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnonymous() <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnonymous()
	 * @generated
	 * @ordered
	 */
	protected boolean anonymous = ANONYMOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isInLine() <em>In Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInLine()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IN_LINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInLine() <em>In Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInLine()
	 * @generated
	 * @ordered
	 */
	protected boolean inLine = IN_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDuplicate() <em>Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDuplicate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DUPLICATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDuplicate() <em>Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDuplicate()
	 * @generated
	 * @ordered
	 */
	protected boolean duplicate = DUPLICATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.END_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndPointName() {
		return endPointName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPointName(String newEndPointName) {
		String oldEndPointName = endPointName;
		endPointName = newEndPointName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.END_POINT__END_POINT_NAME, oldEndPointName, endPointName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnonymous() {
		return anonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymous(boolean newAnonymous) {
		boolean oldAnonymous = anonymous;
		anonymous = newAnonymous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.END_POINT__ANONYMOUS, oldAnonymous, anonymous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInLine() {
		return inLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInLine(boolean newInLine) {
		boolean oldInLine = inLine;
		inLine = newInLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.END_POINT__IN_LINE, oldInLine, inLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDuplicate() {
		return duplicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuplicate(boolean newDuplicate) {
		boolean oldDuplicate = duplicate;
		duplicate = newDuplicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.END_POINT__DUPLICATE, oldDuplicate, duplicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsbPackage.END_POINT__END_POINT_NAME:
				return getEndPointName();
			case EsbPackage.END_POINT__ANONYMOUS:
				return isAnonymous();
			case EsbPackage.END_POINT__IN_LINE:
				return isInLine();
			case EsbPackage.END_POINT__DUPLICATE:
				return isDuplicate();
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
			case EsbPackage.END_POINT__END_POINT_NAME:
				setEndPointName((String)newValue);
				return;
			case EsbPackage.END_POINT__ANONYMOUS:
				setAnonymous((Boolean)newValue);
				return;
			case EsbPackage.END_POINT__IN_LINE:
				setInLine((Boolean)newValue);
				return;
			case EsbPackage.END_POINT__DUPLICATE:
				setDuplicate((Boolean)newValue);
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
			case EsbPackage.END_POINT__END_POINT_NAME:
				setEndPointName(END_POINT_NAME_EDEFAULT);
				return;
			case EsbPackage.END_POINT__ANONYMOUS:
				setAnonymous(ANONYMOUS_EDEFAULT);
				return;
			case EsbPackage.END_POINT__IN_LINE:
				setInLine(IN_LINE_EDEFAULT);
				return;
			case EsbPackage.END_POINT__DUPLICATE:
				setDuplicate(DUPLICATE_EDEFAULT);
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
			case EsbPackage.END_POINT__END_POINT_NAME:
				return END_POINT_NAME_EDEFAULT == null ? endPointName != null : !END_POINT_NAME_EDEFAULT.equals(endPointName);
			case EsbPackage.END_POINT__ANONYMOUS:
				return anonymous != ANONYMOUS_EDEFAULT;
			case EsbPackage.END_POINT__IN_LINE:
				return inLine != IN_LINE_EDEFAULT;
			case EsbPackage.END_POINT__DUPLICATE:
				return duplicate != DUPLICATE_EDEFAULT;
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
		result.append(" (endPointName: ");
		result.append(endPointName);
		result.append(", anonymous: ");
		result.append(anonymous);
		result.append(", InLine: ");
		result.append(inLine);
		result.append(", duplicate: ");
		result.append(duplicate);
		result.append(')');
		return result.toString();
	}

} //EndPointImpl
