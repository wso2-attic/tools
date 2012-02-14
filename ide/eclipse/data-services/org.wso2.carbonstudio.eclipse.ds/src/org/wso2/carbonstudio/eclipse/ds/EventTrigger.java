/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.ds;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.EventTrigger#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.EventTrigger#getTargetTopic <em>Target Topic</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.EventTrigger#getSubscriptions <em>Subscriptions</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.EventTrigger#getId <em>Id</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.EventTrigger#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getEventTrigger()
 * @model extendedMetaData="name='event-trigger_._type' kind='elementOnly'"
 * @generated
 */
public interface EventTrigger extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(EObject)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getEventTrigger_Expression()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getExpression();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.EventTrigger#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(EObject value);

	/**
	 * Returns the value of the '<em><b>Target Topic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Topic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Topic</em>' containment reference.
	 * @see #setTargetTopic(EObject)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getEventTrigger_TargetTopic()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='target-topic' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getTargetTopic();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.EventTrigger#getTargetTopic <em>Target Topic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Topic</em>' containment reference.
	 * @see #getTargetTopic()
	 * @generated
	 */
	void setTargetTopic(EObject value);

	/**
	 * Returns the value of the '<em><b>Subscriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriptions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriptions</em>' containment reference.
	 * @see #setSubscriptions(EventSubscriptionList)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getEventTrigger_Subscriptions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subscriptions' namespace='##targetNamespace'"
	 * @generated
	 */
	EventSubscriptionList getSubscriptions();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.EventTrigger#getSubscriptions <em>Subscriptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriptions</em>' containment reference.
	 * @see #getSubscriptions()
	 * @generated
	 */
	void setSubscriptions(EventSubscriptionList value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getEventTrigger_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.EventTrigger#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getEventTrigger_Language()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.EventTrigger#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

} // EventTrigger
