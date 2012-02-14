/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.ds;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.ResultMapping#getElementMappings <em>Element Mappings</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.ResultMapping#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.ResultMapping#getCallQuery <em>Call Query</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.ResultMapping#getDefaultNamespace <em>Default Namespace</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.ResultMapping#getElementName <em>Element Name</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.ResultMapping#getRowName <em>Row Name</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.ResultMapping#getUseColumnNumbers <em>Use Column Numbers</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.ResultMapping#getXsltPath <em>Xslt Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getResultMapping()
 * @model extendedMetaData="name='result_._type' kind='elementOnly'"
 * @generated
 */
public interface ResultMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Element Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.ds.ElementMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Mappings</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getResultMapping_ElementMappings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ElementMapping> getElementMappings();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.ds.AttributeMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getResultMapping_Attribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AttributeMapping> getAttribute();

	/**
	 * Returns the value of the '<em><b>Call Query</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.ds.CallQuery}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Query</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getResultMapping_CallQuery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='call-query' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CallQuery> getCallQuery();

	/**
	 * Returns the value of the '<em><b>Default Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Namespace</em>' attribute.
	 * @see #setDefaultNamespace(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getResultMapping_DefaultNamespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultNamespace' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultNamespace();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.ResultMapping#getDefaultNamespace <em>Default Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Namespace</em>' attribute.
	 * @see #getDefaultNamespace()
	 * @generated
	 */
	void setDefaultNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Name</em>' attribute.
	 * @see #setElementName(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getResultMapping_ElementName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	String getElementName();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.ResultMapping#getElementName <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name</em>' attribute.
	 * @see #getElementName()
	 * @generated
	 */
	void setElementName(String value);

	/**
	 * Returns the value of the '<em><b>Row Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Name</em>' attribute.
	 * @see #setRowName(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getResultMapping_RowName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='rowName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRowName();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.ResultMapping#getRowName <em>Row Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Name</em>' attribute.
	 * @see #getRowName()
	 * @generated
	 */
	void setRowName(String value);

	/**
	 * Returns the value of the '<em><b>Use Column Numbers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Column Numbers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Column Numbers</em>' attribute.
	 * @see #setUseColumnNumbers(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getResultMapping_UseColumnNumbers()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useColumnNumbers' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUseColumnNumbers();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.ResultMapping#getUseColumnNumbers <em>Use Column Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Column Numbers</em>' attribute.
	 * @see #getUseColumnNumbers()
	 * @generated
	 */
	void setUseColumnNumbers(String value);

	/**
	 * Returns the value of the '<em><b>Xslt Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xslt Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xslt Path</em>' attribute.
	 * @see #setXsltPath(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getResultMapping_XsltPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='xsltPath' namespace='##targetNamespace'"
	 * @generated
	 */
	String getXsltPath();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.ResultMapping#getXsltPath <em>Xslt Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xslt Path</em>' attribute.
	 * @see #getXsltPath()
	 * @generated
	 */
	void setXsltPath(String value);

} // ResultMapping
