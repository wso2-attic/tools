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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.wso2.carbonstudio.eclipse.ds.CustomValidator;
import org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator;
import org.wso2.carbonstudio.eclipse.ds.DsPackage;
import org.wso2.carbonstudio.eclipse.ds.LengthValidator;
import org.wso2.carbonstudio.eclipse.ds.LongRangeValidator;
import org.wso2.carbonstudio.eclipse.ds.PatternValidator;
import org.wso2.carbonstudio.eclipse.ds.QueryParameter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Query Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getType
 * <em>Type</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getSqlType
 * <em>Sql Type</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getDefaultValue
 * <em>Default Value</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getOrdinal
 * <em>Ordinal</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getParamType
 * <em>Param Type</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getLongRangeValidator
 * <em>Long Range Validator</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getDoubleRangeValidator
 * <em>Double Range Validator</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getLengthValidator
 * <em>Length Validator</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getPatternValidators
 * <em>Pattern Validators</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getCustomValidators
 * <em>Custom Validators</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class QueryParameterImpl extends EObjectImpl implements QueryParameter {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSqlType() <em>Sql Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSqlType()
	 * @generated
	 * @ordered
	 */
	protected static final String SQL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSqlType() <em>Sql Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSqlType()
	 * @generated
	 * @ordered
	 */
	protected String sqlType = SQL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue()
	 * <em>Default Value</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue()
	 * <em>Default Value</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrdinal() <em>Ordinal</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOrdinal()
	 * @generated
	 * @ordered
	 */
	protected static final long ORDINAL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getOrdinal() <em>Ordinal</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOrdinal()
	 * @generated
	 * @ordered
	 */
	protected long ordinal = ORDINAL_EDEFAULT;

	/**
	 * This is true if the Ordinal attribute has been set. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean ordinalESet;

	/**
	 * The default value of the '{@link #getParamType() <em>Param Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParamType()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParamType() <em>Param Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParamType()
	 * @generated
	 * @ordered
	 */
	protected String paramType = PARAM_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLongRangeValidator()
	 * <em>Long Range Validator</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLongRangeValidator()
	 * @generated
	 * @ordered
	 */
	protected LongRangeValidator longRangeValidator;

	/**
	 * The cached value of the '{@link #getDoubleRangeValidator()
	 * <em>Double Range Validator</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDoubleRangeValidator()
	 * @generated
	 * @ordered
	 */
	protected DoubleRangeValidator doubleRangeValidator;

	/**
	 * The cached value of the '{@link #getLengthValidator()
	 * <em>Length Validator</em>}' containment reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getLengthValidator()
	 * @generated
	 * @ordered
	 */
	protected LengthValidator lengthValidator;

	/**
	 * The cached value of the '{@link #getPatternValidators()
	 * <em>Pattern Validators</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPatternValidators()
	 * @generated
	 * @ordered
	 */
	protected EList<PatternValidator> patternValidators;

	/**
	 * The cached value of the '{@link #getCustomValidators()
	 * <em>Custom Validators</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCustomValidators()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomValidator> customValidators;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected QueryParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsPackage.Literals.QUERY_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY_PARAMETER__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY_PARAMETER__TYPE,
					oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSqlType() {
		return sqlType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSqlType(String newSqlType) {
		String oldSqlType = sqlType;
		sqlType = newSqlType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.QUERY_PARAMETER__SQL_TYPE, oldSqlType, sqlType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.QUERY_PARAMETER__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public long getOrdinal() {
		return ordinal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOrdinal(long newOrdinal) {
		long oldOrdinal = ordinal;
		ordinal = newOrdinal;
		boolean oldOrdinalESet = ordinalESet;
		ordinalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.QUERY_PARAMETER__ORDINAL, oldOrdinal, ordinal, !oldOrdinalESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetOrdinal() {
		long oldOrdinal = ordinal;
		boolean oldOrdinalESet = ordinalESet;
		ordinal = ORDINAL_EDEFAULT;
		ordinalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					DsPackage.QUERY_PARAMETER__ORDINAL, oldOrdinal, ORDINAL_EDEFAULT,
					oldOrdinalESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetOrdinal() {
		return ordinalESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getParamType() {
		return paramType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParamType(String newParamType) {
		String oldParamType = paramType;
		paramType = newParamType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.QUERY_PARAMETER__PARAM_TYPE, oldParamType, paramType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LongRangeValidator getLongRangeValidator() {
		return longRangeValidator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetLongRangeValidator(LongRangeValidator newLongRangeValidator,
			NotificationChain msgs) {
		LongRangeValidator oldLongRangeValidator = longRangeValidator;
		longRangeValidator = newLongRangeValidator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DsPackage.QUERY_PARAMETER__LONG_RANGE_VALIDATOR, oldLongRangeValidator,
					newLongRangeValidator);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLongRangeValidator(LongRangeValidator newLongRangeValidator) {
		if (newLongRangeValidator != longRangeValidator) {
			NotificationChain msgs = null;
			if (longRangeValidator != null)
				msgs = ((InternalEObject) longRangeValidator).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DsPackage.QUERY_PARAMETER__LONG_RANGE_VALIDATOR,
						null, msgs);
			if (newLongRangeValidator != null)
				msgs = ((InternalEObject) newLongRangeValidator).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DsPackage.QUERY_PARAMETER__LONG_RANGE_VALIDATOR,
						null, msgs);
			msgs = basicSetLongRangeValidator(newLongRangeValidator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.QUERY_PARAMETER__LONG_RANGE_VALIDATOR, newLongRangeValidator,
					newLongRangeValidator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DoubleRangeValidator getDoubleRangeValidator() {
		return doubleRangeValidator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDoubleRangeValidator(
			DoubleRangeValidator newDoubleRangeValidator, NotificationChain msgs) {
		DoubleRangeValidator oldDoubleRangeValidator = doubleRangeValidator;
		doubleRangeValidator = newDoubleRangeValidator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DsPackage.QUERY_PARAMETER__DOUBLE_RANGE_VALIDATOR, oldDoubleRangeValidator,
					newDoubleRangeValidator);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDoubleRangeValidator(DoubleRangeValidator newDoubleRangeValidator) {
		if (newDoubleRangeValidator != doubleRangeValidator) {
			NotificationChain msgs = null;
			if (doubleRangeValidator != null)
				msgs = ((InternalEObject) doubleRangeValidator).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DsPackage.QUERY_PARAMETER__DOUBLE_RANGE_VALIDATOR,
						null, msgs);
			if (newDoubleRangeValidator != null)
				msgs = ((InternalEObject) newDoubleRangeValidator).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DsPackage.QUERY_PARAMETER__DOUBLE_RANGE_VALIDATOR,
						null, msgs);
			msgs = basicSetDoubleRangeValidator(newDoubleRangeValidator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.QUERY_PARAMETER__DOUBLE_RANGE_VALIDATOR, newDoubleRangeValidator,
					newDoubleRangeValidator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LengthValidator getLengthValidator() {
		return lengthValidator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetLengthValidator(LengthValidator newLengthValidator,
			NotificationChain msgs) {
		LengthValidator oldLengthValidator = lengthValidator;
		lengthValidator = newLengthValidator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DsPackage.QUERY_PARAMETER__LENGTH_VALIDATOR, oldLengthValidator,
					newLengthValidator);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLengthValidator(LengthValidator newLengthValidator) {
		if (newLengthValidator != lengthValidator) {
			NotificationChain msgs = null;
			if (lengthValidator != null)
				msgs = ((InternalEObject) lengthValidator).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DsPackage.QUERY_PARAMETER__LENGTH_VALIDATOR, null,
						msgs);
			if (newLengthValidator != null)
				msgs = ((InternalEObject) newLengthValidator).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DsPackage.QUERY_PARAMETER__LENGTH_VALIDATOR, null,
						msgs);
			msgs = basicSetLengthValidator(newLengthValidator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.QUERY_PARAMETER__LENGTH_VALIDATOR, newLengthValidator,
					newLengthValidator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<PatternValidator> getPatternValidators() {
		if (patternValidators == null) {
			patternValidators = new EObjectContainmentEList<PatternValidator>(
					PatternValidator.class, this, DsPackage.QUERY_PARAMETER__PATTERN_VALIDATORS);
		}
		return patternValidators;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CustomValidator> getCustomValidators() {
		if (customValidators == null) {
			customValidators = new EObjectContainmentEList<CustomValidator>(CustomValidator.class,
					this, DsPackage.QUERY_PARAMETER__CUSTOM_VALIDATORS);
		}
		return customValidators;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case DsPackage.QUERY_PARAMETER__LONG_RANGE_VALIDATOR:
			return basicSetLongRangeValidator(null, msgs);
		case DsPackage.QUERY_PARAMETER__DOUBLE_RANGE_VALIDATOR:
			return basicSetDoubleRangeValidator(null, msgs);
		case DsPackage.QUERY_PARAMETER__LENGTH_VALIDATOR:
			return basicSetLengthValidator(null, msgs);
		case DsPackage.QUERY_PARAMETER__PATTERN_VALIDATORS:
			return ((InternalEList<?>) getPatternValidators()).basicRemove(otherEnd, msgs);
		case DsPackage.QUERY_PARAMETER__CUSTOM_VALIDATORS:
			return ((InternalEList<?>) getCustomValidators()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DsPackage.QUERY_PARAMETER__NAME:
			return getName();
		case DsPackage.QUERY_PARAMETER__TYPE:
			return getType();
		case DsPackage.QUERY_PARAMETER__SQL_TYPE:
			return getSqlType();
		case DsPackage.QUERY_PARAMETER__DEFAULT_VALUE:
			return getDefaultValue();
		case DsPackage.QUERY_PARAMETER__ORDINAL:
			return getOrdinal();
		case DsPackage.QUERY_PARAMETER__PARAM_TYPE:
			return getParamType();
		case DsPackage.QUERY_PARAMETER__LONG_RANGE_VALIDATOR:
			return getLongRangeValidator();
		case DsPackage.QUERY_PARAMETER__DOUBLE_RANGE_VALIDATOR:
			return getDoubleRangeValidator();
		case DsPackage.QUERY_PARAMETER__LENGTH_VALIDATOR:
			return getLengthValidator();
		case DsPackage.QUERY_PARAMETER__PATTERN_VALIDATORS:
			return getPatternValidators();
		case DsPackage.QUERY_PARAMETER__CUSTOM_VALIDATORS:
			return getCustomValidators();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DsPackage.QUERY_PARAMETER__NAME:
			setName((String) newValue);
			return;
		case DsPackage.QUERY_PARAMETER__TYPE:
			setType((String) newValue);
			return;
		case DsPackage.QUERY_PARAMETER__SQL_TYPE:
			setSqlType((String) newValue);
			return;
		case DsPackage.QUERY_PARAMETER__DEFAULT_VALUE:
			setDefaultValue((String) newValue);
			return;
		case DsPackage.QUERY_PARAMETER__ORDINAL:
			setOrdinal((Long) newValue);
			return;
		case DsPackage.QUERY_PARAMETER__PARAM_TYPE:
			setParamType((String) newValue);
			return;
		case DsPackage.QUERY_PARAMETER__LONG_RANGE_VALIDATOR:
			setLongRangeValidator((LongRangeValidator) newValue);
			return;
		case DsPackage.QUERY_PARAMETER__DOUBLE_RANGE_VALIDATOR:
			setDoubleRangeValidator((DoubleRangeValidator) newValue);
			return;
		case DsPackage.QUERY_PARAMETER__LENGTH_VALIDATOR:
			setLengthValidator((LengthValidator) newValue);
			return;
		case DsPackage.QUERY_PARAMETER__PATTERN_VALIDATORS:
			getPatternValidators().clear();
			getPatternValidators().addAll((Collection<? extends PatternValidator>) newValue);
			return;
		case DsPackage.QUERY_PARAMETER__CUSTOM_VALIDATORS:
			getCustomValidators().clear();
			getCustomValidators().addAll((Collection<? extends CustomValidator>) newValue);
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
		case DsPackage.QUERY_PARAMETER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DsPackage.QUERY_PARAMETER__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case DsPackage.QUERY_PARAMETER__SQL_TYPE:
			setSqlType(SQL_TYPE_EDEFAULT);
			return;
		case DsPackage.QUERY_PARAMETER__DEFAULT_VALUE:
			setDefaultValue(DEFAULT_VALUE_EDEFAULT);
			return;
		case DsPackage.QUERY_PARAMETER__ORDINAL:
			unsetOrdinal();
			return;
		case DsPackage.QUERY_PARAMETER__PARAM_TYPE:
			setParamType(PARAM_TYPE_EDEFAULT);
			return;
		case DsPackage.QUERY_PARAMETER__LONG_RANGE_VALIDATOR:
			setLongRangeValidator((LongRangeValidator) null);
			return;
		case DsPackage.QUERY_PARAMETER__DOUBLE_RANGE_VALIDATOR:
			setDoubleRangeValidator((DoubleRangeValidator) null);
			return;
		case DsPackage.QUERY_PARAMETER__LENGTH_VALIDATOR:
			setLengthValidator((LengthValidator) null);
			return;
		case DsPackage.QUERY_PARAMETER__PATTERN_VALIDATORS:
			getPatternValidators().clear();
			return;
		case DsPackage.QUERY_PARAMETER__CUSTOM_VALIDATORS:
			getCustomValidators().clear();
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
		case DsPackage.QUERY_PARAMETER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DsPackage.QUERY_PARAMETER__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case DsPackage.QUERY_PARAMETER__SQL_TYPE:
			return SQL_TYPE_EDEFAULT == null ? sqlType != null : !SQL_TYPE_EDEFAULT.equals(sqlType);
		case DsPackage.QUERY_PARAMETER__DEFAULT_VALUE:
			return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT
					.equals(defaultValue);
		case DsPackage.QUERY_PARAMETER__ORDINAL:
			return isSetOrdinal();
		case DsPackage.QUERY_PARAMETER__PARAM_TYPE:
			return PARAM_TYPE_EDEFAULT == null ? paramType != null : !PARAM_TYPE_EDEFAULT
					.equals(paramType);
		case DsPackage.QUERY_PARAMETER__LONG_RANGE_VALIDATOR:
			return longRangeValidator != null;
		case DsPackage.QUERY_PARAMETER__DOUBLE_RANGE_VALIDATOR:
			return doubleRangeValidator != null;
		case DsPackage.QUERY_PARAMETER__LENGTH_VALIDATOR:
			return lengthValidator != null;
		case DsPackage.QUERY_PARAMETER__PATTERN_VALIDATORS:
			return patternValidators != null && !patternValidators.isEmpty();
		case DsPackage.QUERY_PARAMETER__CUSTOM_VALIDATORS:
			return customValidators != null && !customValidators.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", sqlType: ");
		result.append(sqlType);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", ordinal: ");
		if (ordinalESet)
			result.append(ordinal);
		else
			result.append("<unset>");
		result.append(", paramType: ");
		result.append(paramType);
		result.append(')');
		return result.toString();
	}

} // QueryParameterImpl
