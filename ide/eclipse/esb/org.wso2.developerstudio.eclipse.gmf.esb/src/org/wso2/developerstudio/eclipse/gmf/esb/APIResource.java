/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#getOutputConnector <em>Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#getFaultInputConnector <em>Fault Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#getUrlStyle <em>Url Style</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#getUriTemplate <em>Uri Template</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#getUrlMapping <em>Url Mapping</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#isAllowGet <em>Allow Get</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#isAllowPost <em>Allow Post</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#isAllowPut <em>Allow Put</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#isAllowDelete <em>Allow Delete</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#isAllowOptions <em>Allow Options</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAPIResource()
 * @model
 * @generated
 */
public interface APIResource extends EsbNode {
	/**
	 * Returns the value of the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Connector</em>' containment reference.
	 * @see #setInputConnector(APIResourceInputConnector)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAPIResource_InputConnector()
	 * @model containment="true"
	 * @generated
	 */
	APIResourceInputConnector getInputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#getInputConnector <em>Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Connector</em>' containment reference.
	 * @see #getInputConnector()
	 * @generated
	 */
	void setInputConnector(APIResourceInputConnector value);

	/**
	 * Returns the value of the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Connector</em>' containment reference.
	 * @see #setOutputConnector(APIResourceOutputConnector)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAPIResource_OutputConnector()
	 * @model containment="true"
	 * @generated
	 */
	APIResourceOutputConnector getOutputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#getOutputConnector <em>Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Connector</em>' containment reference.
	 * @see #getOutputConnector()
	 * @generated
	 */
	void setOutputConnector(APIResourceOutputConnector value);

	/**
	 * Returns the value of the '<em><b>Fault Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Input Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Input Connector</em>' containment reference.
	 * @see #setFaultInputConnector(APIResourceFaultInputConnector)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAPIResource_FaultInputConnector()
	 * @model containment="true"
	 * @generated
	 */
	APIResourceFaultInputConnector getFaultInputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#getFaultInputConnector <em>Fault Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Input Connector</em>' containment reference.
	 * @see #getFaultInputConnector()
	 * @generated
	 */
	void setFaultInputConnector(APIResourceFaultInputConnector value);

	/**
	 * Returns the value of the '<em><b>Url Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wso2.developerstudio.eclipse.gmf.esb.ApiResourceUrlStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Style</em>' attribute.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ApiResourceUrlStyle
	 * @see #setUrlStyle(ApiResourceUrlStyle)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAPIResource_UrlStyle()
	 * @model
	 * @generated
	 */
	ApiResourceUrlStyle getUrlStyle();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#getUrlStyle <em>Url Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Style</em>' attribute.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.ApiResourceUrlStyle
	 * @see #getUrlStyle()
	 * @generated
	 */
	void setUrlStyle(ApiResourceUrlStyle value);

	/**
	 * Returns the value of the '<em><b>Uri Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Template</em>' attribute.
	 * @see #setUriTemplate(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAPIResource_UriTemplate()
	 * @model
	 * @generated
	 */
	String getUriTemplate();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#getUriTemplate <em>Uri Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Template</em>' attribute.
	 * @see #getUriTemplate()
	 * @generated
	 */
	void setUriTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Url Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Mapping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Mapping</em>' attribute.
	 * @see #setUrlMapping(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAPIResource_UrlMapping()
	 * @model
	 * @generated
	 */
	String getUrlMapping();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#getUrlMapping <em>Url Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Mapping</em>' attribute.
	 * @see #getUrlMapping()
	 * @generated
	 */
	void setUrlMapping(String value);

	/**
	 * Returns the value of the '<em><b>Allow Get</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Get</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Get</em>' attribute.
	 * @see #setAllowGet(boolean)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAPIResource_AllowGet()
	 * @model
	 * @generated
	 */
	boolean isAllowGet();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#isAllowGet <em>Allow Get</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Get</em>' attribute.
	 * @see #isAllowGet()
	 * @generated
	 */
	void setAllowGet(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Post</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Post</em>' attribute.
	 * @see #setAllowPost(boolean)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAPIResource_AllowPost()
	 * @model
	 * @generated
	 */
	boolean isAllowPost();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#isAllowPost <em>Allow Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Post</em>' attribute.
	 * @see #isAllowPost()
	 * @generated
	 */
	void setAllowPost(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Put</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Put</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Put</em>' attribute.
	 * @see #setAllowPut(boolean)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAPIResource_AllowPut()
	 * @model
	 * @generated
	 */
	boolean isAllowPut();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#isAllowPut <em>Allow Put</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Put</em>' attribute.
	 * @see #isAllowPut()
	 * @generated
	 */
	void setAllowPut(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Delete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Delete</em>' attribute.
	 * @see #setAllowDelete(boolean)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAPIResource_AllowDelete()
	 * @model
	 * @generated
	 */
	boolean isAllowDelete();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#isAllowDelete <em>Allow Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Delete</em>' attribute.
	 * @see #isAllowDelete()
	 * @generated
	 */
	void setAllowDelete(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Options</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Options</em>' attribute.
	 * @see #setAllowOptions(boolean)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAPIResource_AllowOptions()
	 * @model
	 * @generated
	 */
	boolean isAllowOptions();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#isAllowOptions <em>Allow Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Options</em>' attribute.
	 * @see #isAllowOptions()
	 * @generated
	 */
	void setAllowOptions(boolean value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference.
	 * @see #setContainer(ProxyServiceContainer)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getAPIResource_Container()
	 * @model containment="true"
	 * @generated
	 */
	ProxyServiceContainer getContainer();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.APIResource#getContainer <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' containment reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(ProxyServiceContainer value);

} // APIResource
