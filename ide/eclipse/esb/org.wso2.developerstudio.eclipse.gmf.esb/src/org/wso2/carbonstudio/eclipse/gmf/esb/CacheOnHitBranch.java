/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.gmf.esb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cache On Hit Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.CacheOnHitBranch#getSequenceType <em>Sequence Type</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.CacheOnHitBranch#getSequenceKey <em>Sequence Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getCacheOnHitBranch()
 * @model
 * @generated
 */
public interface CacheOnHitBranch extends EObject {
	/**
	 * Returns the value of the '<em><b>Sequence Type</b></em>' attribute.
	 * The default value is <code>"REGISTRY_REFERENCE"</code>.
	 * The literals are from the enumeration {@link org.wso2.carbonstudio.eclipse.gmf.esb.CacheSequenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Type</em>' attribute.
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.CacheSequenceType
	 * @see #setSequenceType(CacheSequenceType)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getCacheOnHitBranch_SequenceType()
	 * @model default="REGISTRY_REFERENCE"
	 * @generated
	 */
	CacheSequenceType getSequenceType();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.CacheOnHitBranch#getSequenceType <em>Sequence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Type</em>' attribute.
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.CacheSequenceType
	 * @see #getSequenceType()
	 * @generated
	 */
	void setSequenceType(CacheSequenceType value);

	/**
	 * Returns the value of the '<em><b>Sequence Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Key</em>' reference.
	 * @see #setSequenceKey(RegistryKeyProperty)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getCacheOnHitBranch_SequenceKey()
	 * @model
	 * @generated
	 */
	RegistryKeyProperty getSequenceKey();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.CacheOnHitBranch#getSequenceKey <em>Sequence Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Key</em>' reference.
	 * @see #getSequenceKey()
	 * @generated
	 */
	void setSequenceKey(RegistryKeyProperty value);

} // CacheOnHitBranch
