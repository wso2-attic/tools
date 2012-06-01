/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate On Complete Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateOnCompleteBranch#getAggregationExpression <em>Aggregation Expression</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateOnCompleteBranch#getSequenceType <em>Sequence Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateOnCompleteBranch#getSequenceKey <em>Sequence Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAggregateOnCompleteBranch()
 * @model
 * @generated
 */
public interface AggregateOnCompleteBranch extends EObject {
	/**
	 * Returns the value of the '<em><b>Aggregation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Expression</em>' containment reference.
	 * @see #setAggregationExpression(NamespacedProperty)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAggregateOnCompleteBranch_AggregationExpression()
	 * @model containment="true"
	 * @generated
	 */
	NamespacedProperty getAggregationExpression();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateOnCompleteBranch#getAggregationExpression <em>Aggregation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Expression</em>' containment reference.
	 * @see #getAggregationExpression()
	 * @generated
	 */
	void setAggregationExpression(NamespacedProperty value);

	/**
	 * Returns the value of the '<em><b>Sequence Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateSequenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Type</em>' attribute.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateSequenceType
	 * @see #setSequenceType(AggregateSequenceType)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAggregateOnCompleteBranch_SequenceType()
	 * @model
	 * @generated
	 */
	AggregateSequenceType getSequenceType();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateOnCompleteBranch#getSequenceType <em>Sequence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Type</em>' attribute.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.AggregateSequenceType
	 * @see #getSequenceType()
	 * @generated
	 */
	void setSequenceType(AggregateSequenceType value);

	/**
	 * Returns the value of the '<em><b>Sequence Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Key</em>' containment reference.
	 * @see #setSequenceKey(RegistryKeyProperty)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAggregateOnCompleteBranch_SequenceKey()
	 * @model containment="true"
	 * @generated
	 */
	RegistryKeyProperty getSequenceKey();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateOnCompleteBranch#getSequenceKey <em>Sequence Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Key</em>' containment reference.
	 * @see #getSequenceKey()
	 * @generated
	 */
	void setSequenceKey(RegistryKeyProperty value);

} // AggregateOnCompleteBranch
