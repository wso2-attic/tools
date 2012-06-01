/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enqueue Mediator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.EnqueueMediator#getExecutor <em>Executor</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.EnqueueMediator#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.EnqueueMediator#getSequenceKey <em>Sequence Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getEnqueueMediator()
 * @model
 * @generated
 */
public interface EnqueueMediator extends Mediator {
	/**
	 * Returns the value of the '<em><b>Executor</b></em>' attribute.
	 * The default value is <code>"executor_name"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executor</em>' attribute.
	 * @see #setExecutor(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getEnqueueMediator_Executor()
	 * @model default="executor_name"
	 * @generated
	 */
	String getExecutor();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnqueueMediator#getExecutor <em>Executor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor</em>' attribute.
	 * @see #getExecutor()
	 * @generated
	 */
	void setExecutor(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getEnqueueMediator_Priority()
	 * @model default="0"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnqueueMediator#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

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
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getEnqueueMediator_SequenceKey()
	 * @model containment="true"
	 * @generated
	 */
	RegistryKeyProperty getSequenceKey();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.EnqueueMediator#getSequenceKey <em>Sequence Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Key</em>' containment reference.
	 * @see #getSequenceKey()
	 * @generated
	 */
	void setSequenceKey(RegistryKeyProperty value);

} // EnqueueMediator
