/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.ds.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator;
import org.wso2.carbonstudio.eclipse.ds.DsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Double Range Validator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.DoubleRangeValidatorImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.DoubleRangeValidatorImpl#getMinimum <em>Minimum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoubleRangeValidatorImpl extends EObjectImpl implements DoubleRangeValidator {
	/**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected String maximum = MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected String minimum = MINIMUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleRangeValidatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsPackage.Literals.DOUBLE_RANGE_VALIDATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(String newMaximum) {
		String oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.DOUBLE_RANGE_VALIDATOR__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(String newMinimum) {
		String oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.DOUBLE_RANGE_VALIDATOR__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsPackage.DOUBLE_RANGE_VALIDATOR__MAXIMUM:
				return getMaximum();
			case DsPackage.DOUBLE_RANGE_VALIDATOR__MINIMUM:
				return getMinimum();
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
			case DsPackage.DOUBLE_RANGE_VALIDATOR__MAXIMUM:
				setMaximum((String)newValue);
				return;
			case DsPackage.DOUBLE_RANGE_VALIDATOR__MINIMUM:
				setMinimum((String)newValue);
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
			case DsPackage.DOUBLE_RANGE_VALIDATOR__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case DsPackage.DOUBLE_RANGE_VALIDATOR__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
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
			case DsPackage.DOUBLE_RANGE_VALIDATOR__MAXIMUM:
				return MAXIMUM_EDEFAULT == null ? maximum != null : !MAXIMUM_EDEFAULT.equals(maximum);
			case DsPackage.DOUBLE_RANGE_VALIDATOR__MINIMUM:
				return MINIMUM_EDEFAULT == null ? minimum != null : !MINIMUM_EDEFAULT.equals(minimum);
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
		result.append(" (maximum: ");
		result.append(maximum);
		result.append(", minimum: ");
		result.append(minimum);
		result.append(')');
		return result.toString();
	}

} //DoubleRangeValidatorImpl
