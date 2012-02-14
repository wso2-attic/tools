/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.gmf.esb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Set Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleSetConfiguration#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleSetConfiguration#getSourceCode <em>Source Code</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleSetConfiguration#getSourceKey <em>Source Key</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleSetConfiguration#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getRuleSetConfiguration()
 * @model
 * @generated
 */
public interface RuleSetConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' attribute.
	 * The default value is <code>"INLINE"</code>.
	 * The literals are from the enumeration {@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleSourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' attribute.
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.RuleSourceType
	 * @see #setSourceType(RuleSourceType)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getRuleSetConfiguration_SourceType()
	 * @model default="INLINE"
	 * @generated
	 */
	RuleSourceType getSourceType();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleSetConfiguration#getSourceType <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' attribute.
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.RuleSourceType
	 * @see #getSourceType()
	 * @generated
	 */
	void setSourceType(RuleSourceType value);

	/**
	 * Returns the value of the '<em><b>Source Code</b></em>' attribute.
	 * The default value is <code>"<code/>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Code</em>' attribute.
	 * @see #setSourceCode(String)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getRuleSetConfiguration_SourceCode()
	 * @model default="<code/>"
	 * @generated
	 */
	String getSourceCode();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleSetConfiguration#getSourceCode <em>Source Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Code</em>' attribute.
	 * @see #getSourceCode()
	 * @generated
	 */
	void setSourceCode(String value);

	/**
	 * Returns the value of the '<em><b>Source Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Key</em>' containment reference.
	 * @see #setSourceKey(RegistryKeyProperty)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getRuleSetConfiguration_SourceKey()
	 * @model containment="true"
	 * @generated
	 */
	RegistryKeyProperty getSourceKey();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleSetConfiguration#getSourceKey <em>Source Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Key</em>' containment reference.
	 * @see #getSourceKey()
	 * @generated
	 */
	void setSourceKey(RegistryKeyProperty value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.gmf.esb.RuleSetCreationProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getRuleSetConfiguration_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuleSetCreationProperty> getProperties();

} // RuleSetConfiguration
