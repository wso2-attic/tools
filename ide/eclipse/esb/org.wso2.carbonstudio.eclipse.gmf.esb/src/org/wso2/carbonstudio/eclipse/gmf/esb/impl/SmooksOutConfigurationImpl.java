/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.gmf.esb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.carbonstudio.eclipse.gmf.esb.ExpressionAction;
import org.wso2.carbonstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.carbonstudio.eclipse.gmf.esb.OutputMethod;
import org.wso2.carbonstudio.eclipse.gmf.esb.SmooksIODataType;
import org.wso2.carbonstudio.eclipse.gmf.esb.SmooksOutConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smooks Out Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.SmooksOutConfigurationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.SmooksOutConfigurationImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.SmooksOutConfigurationImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.SmooksOutConfigurationImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.impl.SmooksOutConfigurationImpl#getOutputMethod <em>Output Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SmooksOutConfigurationImpl extends EObjectImpl implements SmooksOutConfiguration {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SmooksIODataType TYPE_EDEFAULT = SmooksIODataType.XML;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SmooksIODataType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected NamespacedProperty expression;

	/**
	 * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected String property = PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final ExpressionAction ACTION_EDEFAULT = ExpressionAction.ADD;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected ExpressionAction action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputMethod() <em>Output Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMethod()
	 * @generated
	 * @ordered
	 */
	protected static final OutputMethod OUTPUT_METHOD_EDEFAULT = OutputMethod.DEFAULT;

	/**
	 * The cached value of the '{@link #getOutputMethod() <em>Output Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMethod()
	 * @generated
	 * @ordered
	 */
	protected OutputMethod outputMethod = OUTPUT_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SmooksOutConfigurationImpl() {
		super();
		// Property expression.
		NamespacedProperty expression = EsbFactoryImpl.eINSTANCE.createNamespacedProperty();
		expression.setPrettyName("Expression");
		expression.setPropertyName("expression");
		expression.setPropertyValue("/default/expression");
		setExpression(expression);
		
		//Property value
		setProperty(PROPERTY_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.SMOOKS_OUT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmooksIODataType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SmooksIODataType newType) {
		SmooksIODataType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SMOOKS_OUT_CONFIGURATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacedProperty getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(NamespacedProperty newExpression, NotificationChain msgs) {
		NamespacedProperty oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.SMOOKS_OUT_CONFIGURATION__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(NamespacedProperty newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SMOOKS_OUT_CONFIGURATION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.SMOOKS_OUT_CONFIGURATION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SMOOKS_OUT_CONFIGURATION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(String newProperty) {
		String oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SMOOKS_OUT_CONFIGURATION__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAction getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(ExpressionAction newAction) {
		ExpressionAction oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SMOOKS_OUT_CONFIGURATION__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputMethod getOutputMethod() {
		return outputMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputMethod(OutputMethod newOutputMethod) {
		OutputMethod oldOutputMethod = outputMethod;
		outputMethod = newOutputMethod == null ? OUTPUT_METHOD_EDEFAULT : newOutputMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.SMOOKS_OUT_CONFIGURATION__OUTPUT_METHOD, oldOutputMethod, outputMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.SMOOKS_OUT_CONFIGURATION__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case EsbPackage.SMOOKS_OUT_CONFIGURATION__TYPE:
				return getType();
			case EsbPackage.SMOOKS_OUT_CONFIGURATION__EXPRESSION:
				return getExpression();
			case EsbPackage.SMOOKS_OUT_CONFIGURATION__PROPERTY:
				return getProperty();
			case EsbPackage.SMOOKS_OUT_CONFIGURATION__ACTION:
				return getAction();
			case EsbPackage.SMOOKS_OUT_CONFIGURATION__OUTPUT_METHOD:
				return getOutputMethod();
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
			case EsbPackage.SMOOKS_OUT_CONFIGURATION__TYPE:
				setType((SmooksIODataType)newValue);
				return;
			case EsbPackage.SMOOKS_OUT_CONFIGURATION__EXPRESSION:
				setExpression((NamespacedProperty)newValue);
				return;
			case EsbPackage.SMOOKS_OUT_CONFIGURATION__PROPERTY:
				setProperty((String)newValue);
				return;
			case EsbPackage.SMOOKS_OUT_CONFIGURATION__ACTION:
				setAction((ExpressionAction)newValue);
				return;
			case EsbPackage.SMOOKS_OUT_CONFIGURATION__OUTPUT_METHOD:
				setOutputMethod((OutputMethod)newValue);
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
			case EsbPackage.SMOOKS_OUT_CONFIGURATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EsbPackage.SMOOKS_OUT_CONFIGURATION__EXPRESSION:
				setExpression((NamespacedProperty)null);
				return;
			case EsbPackage.SMOOKS_OUT_CONFIGURATION__PROPERTY:
				setProperty(PROPERTY_EDEFAULT);
				return;
			case EsbPackage.SMOOKS_OUT_CONFIGURATION__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case EsbPackage.SMOOKS_OUT_CONFIGURATION__OUTPUT_METHOD:
				setOutputMethod(OUTPUT_METHOD_EDEFAULT);
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
			case EsbPackage.SMOOKS_OUT_CONFIGURATION__TYPE:
				return type != TYPE_EDEFAULT;
			case EsbPackage.SMOOKS_OUT_CONFIGURATION__EXPRESSION:
				return expression != null;
			case EsbPackage.SMOOKS_OUT_CONFIGURATION__PROPERTY:
				return PROPERTY_EDEFAULT == null ? property != null : !PROPERTY_EDEFAULT.equals(property);
			case EsbPackage.SMOOKS_OUT_CONFIGURATION__ACTION:
				return action != ACTION_EDEFAULT;
			case EsbPackage.SMOOKS_OUT_CONFIGURATION__OUTPUT_METHOD:
				return outputMethod != OUTPUT_METHOD_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", property: ");
		result.append(property);
		result.append(", action: ");
		result.append(action);
		result.append(", outputMethod: ");
		result.append(outputMethod);
		result.append(')');
		return result.toString();
	}

} //SmooksOutConfigurationImpl
