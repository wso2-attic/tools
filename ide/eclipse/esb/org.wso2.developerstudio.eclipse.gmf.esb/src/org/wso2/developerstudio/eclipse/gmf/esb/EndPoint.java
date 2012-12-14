/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.EndPoint#getEndPointName <em>End Point Name</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.EndPoint#isAnonymous <em>Anonymous</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.EndPoint#isInLine <em>In Line</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getEndPoint()
 * @model abstract="true"
 * @generated
 */
public interface EndPoint extends EsbElement {
	/**
	 * Returns the value of the '<em><b>End Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Point Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point Name</em>' attribute.
	 * @see #setEndPointName(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getEndPoint_EndPointName()
	 * @model
	 * @generated
	 */
	String getEndPointName();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.EndPoint#getEndPointName <em>End Point Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point Name</em>' attribute.
	 * @see #getEndPointName()
	 * @generated
	 */
	void setEndPointName(String value);

	/**
	 * Returns the value of the '<em><b>Anonymous</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous</em>' attribute.
	 * @see #setAnonymous(boolean)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getEndPoint_Anonymous()
	 * @model default="false"
	 * @generated
	 */
	boolean isAnonymous();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.EndPoint#isAnonymous <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymous</em>' attribute.
	 * @see #isAnonymous()
	 * @generated
	 */
	void setAnonymous(boolean value);

	/**
	 * Returns the value of the '<em><b>In Line</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Line</em>' attribute.
	 * @see #setInLine(boolean)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getEndPoint_InLine()
	 * @model default="false"
	 * @generated
	 */
	boolean isInLine();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.EndPoint#isInLine <em>In Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Line</em>' attribute.
	 * @see #isInLine()
	 * @generated
	 */
	void setInLine(boolean value);

} // EndPoint
