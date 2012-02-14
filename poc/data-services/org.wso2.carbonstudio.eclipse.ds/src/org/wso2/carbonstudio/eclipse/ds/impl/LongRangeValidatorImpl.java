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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.wso2.carbonstudio.eclipse.ds.DsPackage;
import org.wso2.carbonstudio.eclipse.ds.LongRangeValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Long Range Validator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.LongRangeValidatorImpl#getMinValue
 * <em>Min Value</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.LongRangeValidatorImpl#getMaxValue
 * <em>Max Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class LongRangeValidatorImpl extends EObjectImpl implements LongRangeValidator {
	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final long MIN_VALUE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected long minValue = MIN_VALUE_EDEFAULT;

	/**
	 * This is true if the Min Value attribute has been set. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean minValueESet;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_VALUE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected long maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * This is true if the Max Value attribute has been set. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean maxValueESet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LongRangeValidatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsPackage.Literals.LONG_RANGE_VALIDATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public long getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMinValue(long newMinValue) {
		long oldMinValue = minValue;
		minValue = newMinValue;
		boolean oldMinValueESet = minValueESet;
		minValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.LONG_RANGE_VALIDATOR__MIN_VALUE, oldMinValue, minValue,
					!oldMinValueESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetMinValue() {
		long oldMinValue = minValue;
		boolean oldMinValueESet = minValueESet;
		minValue = MIN_VALUE_EDEFAULT;
		minValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					DsPackage.LONG_RANGE_VALIDATOR__MIN_VALUE, oldMinValue, MIN_VALUE_EDEFAULT,
					oldMinValueESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetMinValue() {
		return minValueESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public long getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMaxValue(long newMaxValue) {
		long oldMaxValue = maxValue;
		maxValue = newMaxValue;
		boolean oldMaxValueESet = maxValueESet;
		maxValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.LONG_RANGE_VALIDATOR__MAX_VALUE, oldMaxValue, maxValue,
					!oldMaxValueESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetMaxValue() {
		long oldMaxValue = maxValue;
		boolean oldMaxValueESet = maxValueESet;
		maxValue = MAX_VALUE_EDEFAULT;
		maxValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					DsPackage.LONG_RANGE_VALIDATOR__MAX_VALUE, oldMaxValue, MAX_VALUE_EDEFAULT,
					oldMaxValueESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetMaxValue() {
		return maxValueESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DsPackage.LONG_RANGE_VALIDATOR__MIN_VALUE:
			return getMinValue();
		case DsPackage.LONG_RANGE_VALIDATOR__MAX_VALUE:
			return getMaxValue();
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
		case DsPackage.LONG_RANGE_VALIDATOR__MIN_VALUE:
			setMinValue((Long) newValue);
			return;
		case DsPackage.LONG_RANGE_VALIDATOR__MAX_VALUE:
			setMaxValue((Long) newValue);
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
		case DsPackage.LONG_RANGE_VALIDATOR__MIN_VALUE:
			unsetMinValue();
			return;
		case DsPackage.LONG_RANGE_VALIDATOR__MAX_VALUE:
			unsetMaxValue();
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
		case DsPackage.LONG_RANGE_VALIDATOR__MIN_VALUE:
			return isSetMinValue();
		case DsPackage.LONG_RANGE_VALIDATOR__MAX_VALUE:
			return isSetMaxValue();
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
		result.append(" (minValue: ");
		if (minValueESet)
			result.append(minValue);
		else
			result.append("<unset>");
		result.append(", maxValue: ");
		if (maxValueESet)
			result.append(maxValue);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // LongRangeValidatorImpl
