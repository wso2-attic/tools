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
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.Sequence#getName <em>Name</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.Sequence#getKey <em>Key</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.Sequence#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.Sequence#getOutputConnector <em>Output Connector</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.Sequence#getIncludedMediators <em>Included Mediators</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends Mediator {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getSequence_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.Sequence#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * The default value is <code>"<inline/>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getSequence_Key()
	 * @model default="<inline/>"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.Sequence#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Connector</em>' containment reference.
	 * @see #setInputConnector(SequenceInputConnector)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getSequence_InputConnector()
	 * @model containment="true"
	 * @generated
	 */
	SequenceInputConnector getInputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.Sequence#getInputConnector <em>Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Connector</em>' containment reference.
	 * @see #getInputConnector()
	 * @generated
	 */
	void setInputConnector(SequenceInputConnector value);

	/**
	 * Returns the value of the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Connector</em>' containment reference.
	 * @see #setOutputConnector(SequenceOutputConnector)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getSequence_OutputConnector()
	 * @model containment="true"
	 * @generated
	 */
	SequenceOutputConnector getOutputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.Sequence#getOutputConnector <em>Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Connector</em>' containment reference.
	 * @see #getOutputConnector()
	 * @generated
	 */
	void setOutputConnector(SequenceOutputConnector value);

	/**
	 * Returns the value of the '<em><b>Included Mediators</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.gmf.esb.Mediator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Mediators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Mediators</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getSequence_IncludedMediators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mediator> getIncludedMediators();

} // Sequence
