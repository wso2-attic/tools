/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getValidateLongRange <em>Validate Long Range</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getValidateDoubleRange <em>Validate Double Range</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getValidateLength <em>Validate Length</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getValidatePattern <em>Validate Pattern</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getValidateCustom <em>Validate Custom</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getOrdinal <em>Ordinal</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getParamType <em>Param Type</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getSqlType <em>Sql Type</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getStructType <em>Struct Type</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryParameterImpl extends EObjectImpl implements QueryParameter {
	/**
	 * The cached value of the '{@link #getValidateLongRange() <em>Validate Long Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidateLongRange()
	 * @generated
	 * @ordered
	 */
	protected LongRangeValidator validateLongRange;

	/**
	 * The cached value of the '{@link #getValidateDoubleRange() <em>Validate Double Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidateDoubleRange()
	 * @generated
	 * @ordered
	 */
	protected DoubleRangeValidator validateDoubleRange;

	/**
	 * The cached value of the '{@link #getValidateLength() <em>Validate Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidateLength()
	 * @generated
	 * @ordered
	 */
	protected LengthValidator validateLength;

	/**
	 * The cached value of the '{@link #getValidatePattern() <em>Validate Pattern</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatePattern()
	 * @generated
	 * @ordered
	 */
	protected EList<PatternValidator> validatePattern;

	/**
	 * The cached value of the '{@link #getValidateCustom() <em>Validate Custom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidateCustom()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomValidator> validateCustom;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrdinal() <em>Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdinal()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDINAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrdinal() <em>Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdinal()
	 * @generated
	 * @ordered
	 */
	protected int ordinal = ORDINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getParamType() <em>Param Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamType()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParamType() <em>Param Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamType()
	 * @generated
	 * @ordered
	 */
	protected String paramType = PARAM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSqlType() <em>Sql Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlType()
	 * @generated
	 * @ordered
	 */
	protected static final String SQL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSqlType() <em>Sql Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlType()
	 * @generated
	 * @ordered
	 */
	protected String sqlType = SQL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStructType() <em>Struct Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructType()
	 * @generated
	 * @ordered
	 */
	protected static final String STRUCT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStructType() <em>Struct Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructType()
	 * @generated
	 * @ordered
	 */
	protected String structType = STRUCT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsPackage.Literals.QUERY_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongRangeValidator getValidateLongRange() {
		return validateLongRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidateLongRange(LongRangeValidator newValidateLongRange, NotificationChain msgs) {
		LongRangeValidator oldValidateLongRange = validateLongRange;
		validateLongRange = newValidateLongRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsPackage.QUERY_PARAMETER__VALIDATE_LONG_RANGE, oldValidateLongRange, newValidateLongRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidateLongRange(LongRangeValidator newValidateLongRange) {
		if (newValidateLongRange != validateLongRange) {
			NotificationChain msgs = null;
			if (validateLongRange != null)
				msgs = ((InternalEObject)validateLongRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsPackage.QUERY_PARAMETER__VALIDATE_LONG_RANGE, null, msgs);
			if (newValidateLongRange != null)
				msgs = ((InternalEObject)newValidateLongRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsPackage.QUERY_PARAMETER__VALIDATE_LONG_RANGE, null, msgs);
			msgs = basicSetValidateLongRange(newValidateLongRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY_PARAMETER__VALIDATE_LONG_RANGE, newValidateLongRange, newValidateLongRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleRangeValidator getValidateDoubleRange() {
		return validateDoubleRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidateDoubleRange(DoubleRangeValidator newValidateDoubleRange, NotificationChain msgs) {
		DoubleRangeValidator oldValidateDoubleRange = validateDoubleRange;
		validateDoubleRange = newValidateDoubleRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsPackage.QUERY_PARAMETER__VALIDATE_DOUBLE_RANGE, oldValidateDoubleRange, newValidateDoubleRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidateDoubleRange(DoubleRangeValidator newValidateDoubleRange) {
		if (newValidateDoubleRange != validateDoubleRange) {
			NotificationChain msgs = null;
			if (validateDoubleRange != null)
				msgs = ((InternalEObject)validateDoubleRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsPackage.QUERY_PARAMETER__VALIDATE_DOUBLE_RANGE, null, msgs);
			if (newValidateDoubleRange != null)
				msgs = ((InternalEObject)newValidateDoubleRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsPackage.QUERY_PARAMETER__VALIDATE_DOUBLE_RANGE, null, msgs);
			msgs = basicSetValidateDoubleRange(newValidateDoubleRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY_PARAMETER__VALIDATE_DOUBLE_RANGE, newValidateDoubleRange, newValidateDoubleRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthValidator getValidateLength() {
		return validateLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidateLength(LengthValidator newValidateLength, NotificationChain msgs) {
		LengthValidator oldValidateLength = validateLength;
		validateLength = newValidateLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsPackage.QUERY_PARAMETER__VALIDATE_LENGTH, oldValidateLength, newValidateLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidateLength(LengthValidator newValidateLength) {
		if (newValidateLength != validateLength) {
			NotificationChain msgs = null;
			if (validateLength != null)
				msgs = ((InternalEObject)validateLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsPackage.QUERY_PARAMETER__VALIDATE_LENGTH, null, msgs);
			if (newValidateLength != null)
				msgs = ((InternalEObject)newValidateLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsPackage.QUERY_PARAMETER__VALIDATE_LENGTH, null, msgs);
			msgs = basicSetValidateLength(newValidateLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY_PARAMETER__VALIDATE_LENGTH, newValidateLength, newValidateLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatternValidator> getValidatePattern() {
		if (validatePattern == null) {
			validatePattern = new EObjectContainmentEList<PatternValidator>(PatternValidator.class, this, DsPackage.QUERY_PARAMETER__VALIDATE_PATTERN);
		}
		return validatePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomValidator> getValidateCustom() {
		if (validateCustom == null) {
			validateCustom = new EObjectContainmentEList<CustomValidator>(CustomValidator.class, this, DsPackage.QUERY_PARAMETER__VALIDATE_CUSTOM);
		}
		return validateCustom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY_PARAMETER__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrdinal() {
		return ordinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdinal(int newOrdinal) {
		int oldOrdinal = ordinal;
		ordinal = newOrdinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY_PARAMETER__ORDINAL, oldOrdinal, ordinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParamType() {
		return paramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamType(String newParamType) {
		String oldParamType = paramType;
		paramType = newParamType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY_PARAMETER__PARAM_TYPE, oldParamType, paramType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSqlType() {
		return sqlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlType(String newSqlType) {
		String oldSqlType = sqlType;
		sqlType = newSqlType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY_PARAMETER__SQL_TYPE, oldSqlType, sqlType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStructType() {
		return structType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructType(String newStructType) {
		String oldStructType = structType;
		structType = newStructType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY_PARAMETER__STRUCT_TYPE, oldStructType, structType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY_PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsPackage.QUERY_PARAMETER__VALIDATE_LONG_RANGE:
				return basicSetValidateLongRange(null, msgs);
			case DsPackage.QUERY_PARAMETER__VALIDATE_DOUBLE_RANGE:
				return basicSetValidateDoubleRange(null, msgs);
			case DsPackage.QUERY_PARAMETER__VALIDATE_LENGTH:
				return basicSetValidateLength(null, msgs);
			case DsPackage.QUERY_PARAMETER__VALIDATE_PATTERN:
				return ((InternalEList<?>)getValidatePattern()).basicRemove(otherEnd, msgs);
			case DsPackage.QUERY_PARAMETER__VALIDATE_CUSTOM:
				return ((InternalEList<?>)getValidateCustom()).basicRemove(otherEnd, msgs);
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
			case DsPackage.QUERY_PARAMETER__VALIDATE_LONG_RANGE:
				return getValidateLongRange();
			case DsPackage.QUERY_PARAMETER__VALIDATE_DOUBLE_RANGE:
				return getValidateDoubleRange();
			case DsPackage.QUERY_PARAMETER__VALIDATE_LENGTH:
				return getValidateLength();
			case DsPackage.QUERY_PARAMETER__VALIDATE_PATTERN:
				return getValidatePattern();
			case DsPackage.QUERY_PARAMETER__VALIDATE_CUSTOM:
				return getValidateCustom();
			case DsPackage.QUERY_PARAMETER__DEFAULT_VALUE:
				return getDefaultValue();
			case DsPackage.QUERY_PARAMETER__NAME:
				return getName();
			case DsPackage.QUERY_PARAMETER__ORDINAL:
				return getOrdinal();
			case DsPackage.QUERY_PARAMETER__PARAM_TYPE:
				return getParamType();
			case DsPackage.QUERY_PARAMETER__SQL_TYPE:
				return getSqlType();
			case DsPackage.QUERY_PARAMETER__STRUCT_TYPE:
				return getStructType();
			case DsPackage.QUERY_PARAMETER__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DsPackage.QUERY_PARAMETER__VALIDATE_LONG_RANGE:
				setValidateLongRange((LongRangeValidator)newValue);
				return;
			case DsPackage.QUERY_PARAMETER__VALIDATE_DOUBLE_RANGE:
				setValidateDoubleRange((DoubleRangeValidator)newValue);
				return;
			case DsPackage.QUERY_PARAMETER__VALIDATE_LENGTH:
				setValidateLength((LengthValidator)newValue);
				return;
			case DsPackage.QUERY_PARAMETER__VALIDATE_PATTERN:
				getValidatePattern().clear();
				getValidatePattern().addAll((Collection<? extends PatternValidator>)newValue);
				return;
			case DsPackage.QUERY_PARAMETER__VALIDATE_CUSTOM:
				getValidateCustom().clear();
				getValidateCustom().addAll((Collection<? extends CustomValidator>)newValue);
				return;
			case DsPackage.QUERY_PARAMETER__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case DsPackage.QUERY_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case DsPackage.QUERY_PARAMETER__ORDINAL:
				setOrdinal((Integer)newValue);
				return;
			case DsPackage.QUERY_PARAMETER__PARAM_TYPE:
				setParamType((String)newValue);
				return;
			case DsPackage.QUERY_PARAMETER__SQL_TYPE:
				setSqlType((String)newValue);
				return;
			case DsPackage.QUERY_PARAMETER__STRUCT_TYPE:
				setStructType((String)newValue);
				return;
			case DsPackage.QUERY_PARAMETER__TYPE:
				setType((String)newValue);
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
			case DsPackage.QUERY_PARAMETER__VALIDATE_LONG_RANGE:
				setValidateLongRange((LongRangeValidator)null);
				return;
			case DsPackage.QUERY_PARAMETER__VALIDATE_DOUBLE_RANGE:
				setValidateDoubleRange((DoubleRangeValidator)null);
				return;
			case DsPackage.QUERY_PARAMETER__VALIDATE_LENGTH:
				setValidateLength((LengthValidator)null);
				return;
			case DsPackage.QUERY_PARAMETER__VALIDATE_PATTERN:
				getValidatePattern().clear();
				return;
			case DsPackage.QUERY_PARAMETER__VALIDATE_CUSTOM:
				getValidateCustom().clear();
				return;
			case DsPackage.QUERY_PARAMETER__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case DsPackage.QUERY_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DsPackage.QUERY_PARAMETER__ORDINAL:
				setOrdinal(ORDINAL_EDEFAULT);
				return;
			case DsPackage.QUERY_PARAMETER__PARAM_TYPE:
				setParamType(PARAM_TYPE_EDEFAULT);
				return;
			case DsPackage.QUERY_PARAMETER__SQL_TYPE:
				setSqlType(SQL_TYPE_EDEFAULT);
				return;
			case DsPackage.QUERY_PARAMETER__STRUCT_TYPE:
				setStructType(STRUCT_TYPE_EDEFAULT);
				return;
			case DsPackage.QUERY_PARAMETER__TYPE:
				setType(TYPE_EDEFAULT);
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
			case DsPackage.QUERY_PARAMETER__VALIDATE_LONG_RANGE:
				return validateLongRange != null;
			case DsPackage.QUERY_PARAMETER__VALIDATE_DOUBLE_RANGE:
				return validateDoubleRange != null;
			case DsPackage.QUERY_PARAMETER__VALIDATE_LENGTH:
				return validateLength != null;
			case DsPackage.QUERY_PARAMETER__VALIDATE_PATTERN:
				return validatePattern != null && !validatePattern.isEmpty();
			case DsPackage.QUERY_PARAMETER__VALIDATE_CUSTOM:
				return validateCustom != null && !validateCustom.isEmpty();
			case DsPackage.QUERY_PARAMETER__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case DsPackage.QUERY_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DsPackage.QUERY_PARAMETER__ORDINAL:
				return ordinal != ORDINAL_EDEFAULT;
			case DsPackage.QUERY_PARAMETER__PARAM_TYPE:
				return PARAM_TYPE_EDEFAULT == null ? paramType != null : !PARAM_TYPE_EDEFAULT.equals(paramType);
			case DsPackage.QUERY_PARAMETER__SQL_TYPE:
				return SQL_TYPE_EDEFAULT == null ? sqlType != null : !SQL_TYPE_EDEFAULT.equals(sqlType);
			case DsPackage.QUERY_PARAMETER__STRUCT_TYPE:
				return STRUCT_TYPE_EDEFAULT == null ? structType != null : !STRUCT_TYPE_EDEFAULT.equals(structType);
			case DsPackage.QUERY_PARAMETER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (defaultValue: ");
		result.append(defaultValue);
		result.append(", name: ");
		result.append(name);
		result.append(", ordinal: ");
		result.append(ordinal);
		result.append(", paramType: ");
		result.append(paramType);
		result.append(", sqlType: ");
		result.append(sqlType);
		result.append(", structType: ");
		result.append(structType);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //QueryParameterImpl
