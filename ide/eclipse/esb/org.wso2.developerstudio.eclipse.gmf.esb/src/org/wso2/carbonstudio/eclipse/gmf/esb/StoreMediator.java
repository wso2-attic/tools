/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.gmf.esb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store Mediator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.StoreMediator#getMessageStore <em>Message Store</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.StoreMediator#getOnStoreSequence <em>On Store Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getStoreMediator()
 * @model
 * @generated
 */
public interface StoreMediator extends Mediator {
	/**
	 * Returns the value of the '<em><b>Message Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Store</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Store</em>' attribute.
	 * @see #setMessageStore(String)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getStoreMediator_MessageStore()
	 * @model
	 * @generated
	 */
	String getMessageStore();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.StoreMediator#getMessageStore <em>Message Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Store</em>' attribute.
	 * @see #getMessageStore()
	 * @generated
	 */
	void setMessageStore(String value);

	/**
	 * Returns the value of the '<em><b>On Store Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Store Sequence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Store Sequence</em>' reference.
	 * @see #setOnStoreSequence(RegistryKeyProperty)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getStoreMediator_OnStoreSequence()
	 * @model
	 * @generated
	 */
	RegistryKeyProperty getOnStoreSequence();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.StoreMediator#getOnStoreSequence <em>On Store Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Store Sequence</em>' reference.
	 * @see #getOnStoreSequence()
	 * @generated
	 */
	void setOnStoreSequence(RegistryKeyProperty value);

} // StoreMediator
