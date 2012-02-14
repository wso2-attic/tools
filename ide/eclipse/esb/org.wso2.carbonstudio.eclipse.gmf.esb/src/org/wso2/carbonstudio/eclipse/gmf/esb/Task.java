/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.gmf.esb;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.Task#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.Task#getName <em>Name</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.Task#getPinnedServers <em>Pinned Servers</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.Task#getPropertyString <em>Property String</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.Task#getPropertyXML <em>Property XML</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.Task#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EsbElement {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getTask_Class()
	 * @model
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.Task#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pinned Servers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pinned Servers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pinned Servers</em>' attribute.
	 * @see #setPinnedServers(String)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getTask_PinnedServers()
	 * @model
	 * @generated
	 */
	String getPinnedServers();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.Task#getPinnedServers <em>Pinned Servers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pinned Servers</em>' attribute.
	 * @see #getPinnedServers()
	 * @generated
	 */
	void setPinnedServers(String value);

	/**
	 * Returns the value of the '<em><b>Property String</b></em>' reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.gmf.esb.propertyTaskString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property String</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property String</em>' reference list.
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getTask_PropertyString()
	 * @model
	 * @generated
	 */
	EList<propertyTaskString> getPropertyString();

	/**
	 * Returns the value of the '<em><b>Property XML</b></em>' reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.gmf.esb.propertyTaskXML}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property XML</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property XML</em>' reference list.
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getTask_PropertyXML()
	 * @model
	 * @generated
	 */
	EList<propertyTaskXML> getPropertyXML();

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' reference.
	 * @see #setTrigger(Trigger)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getTask_Trigger()
	 * @model
	 * @generated
	 */
	Trigger getTrigger();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.Task#getTrigger <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Trigger value);

} // Task
