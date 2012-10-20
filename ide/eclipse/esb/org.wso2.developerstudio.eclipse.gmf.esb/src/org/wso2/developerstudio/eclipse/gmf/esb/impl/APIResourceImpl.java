/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.wso2.developerstudio.eclipse.gmf.esb.APIResource;
import org.wso2.developerstudio.eclipse.gmf.esb.APIResourceFaultInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.APIResourceInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.APIResourceOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.ApiResourceUrlStyle;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.ProxyServiceContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.APIResourceImpl#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.APIResourceImpl#getOutputConnector <em>Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.APIResourceImpl#getFaultInputConnector <em>Fault Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.APIResourceImpl#getUrlStyle <em>Url Style</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.APIResourceImpl#getUriTemplate <em>Uri Template</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.APIResourceImpl#getUrlMapping <em>Url Mapping</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.APIResourceImpl#isAllowGet <em>Allow Get</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.APIResourceImpl#isAllowPost <em>Allow Post</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.APIResourceImpl#isAllowPut <em>Allow Put</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.APIResourceImpl#isAllowDelete <em>Allow Delete</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.APIResourceImpl#isAllowOptions <em>Allow Options</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.APIResourceImpl#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class APIResourceImpl extends EsbNodeImpl implements APIResource {
	/**
	 * The cached value of the '{@link #getInputConnector() <em>Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputConnector()
	 * @generated
	 * @ordered
	 */
	protected APIResourceInputConnector inputConnector;

	/**
	 * The cached value of the '{@link #getOutputConnector() <em>Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputConnector()
	 * @generated
	 * @ordered
	 */
	protected APIResourceOutputConnector outputConnector;

	/**
	 * The cached value of the '{@link #getFaultInputConnector() <em>Fault Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultInputConnector()
	 * @generated
	 * @ordered
	 */
	protected APIResourceFaultInputConnector faultInputConnector;

	/**
	 * The default value of the '{@link #getUrlStyle() <em>Url Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlStyle()
	 * @generated
	 * @ordered
	 */
	protected static final ApiResourceUrlStyle URL_STYLE_EDEFAULT = ApiResourceUrlStyle.NONE;

	/**
	 * The cached value of the '{@link #getUrlStyle() <em>Url Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlStyle()
	 * @generated
	 * @ordered
	 */
	protected ApiResourceUrlStyle urlStyle = URL_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUriTemplate() <em>Uri Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUriTemplate() <em>Uri Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriTemplate()
	 * @generated
	 * @ordered
	 */
	protected String uriTemplate = URI_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrlMapping() <em>Url Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlMapping()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_MAPPING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrlMapping() <em>Url Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlMapping()
	 * @generated
	 * @ordered
	 */
	protected String urlMapping = URL_MAPPING_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowGet() <em>Allow Get</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowGet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_GET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowGet() <em>Allow Get</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowGet()
	 * @generated
	 * @ordered
	 */
	protected boolean allowGet = ALLOW_GET_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowPost() <em>Allow Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowPost()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_POST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowPost() <em>Allow Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowPost()
	 * @generated
	 * @ordered
	 */
	protected boolean allowPost = ALLOW_POST_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowPut() <em>Allow Put</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowPut()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_PUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowPut() <em>Allow Put</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowPut()
	 * @generated
	 * @ordered
	 */
	protected boolean allowPut = ALLOW_PUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowDelete() <em>Allow Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowDelete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_DELETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowDelete() <em>Allow Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowDelete()
	 * @generated
	 * @ordered
	 */
	protected boolean allowDelete = ALLOW_DELETE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowOptions() <em>Allow Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowOptions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_OPTIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowOptions() <em>Allow Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowOptions()
	 * @generated
	 * @ordered
	 */
	protected boolean allowOptions = ALLOW_OPTIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected ProxyServiceContainer container;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.API_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIResourceInputConnector getInputConnector() {
		return inputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputConnector(APIResourceInputConnector newInputConnector, NotificationChain msgs) {
		APIResourceInputConnector oldInputConnector = inputConnector;
		inputConnector = newInputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.API_RESOURCE__INPUT_CONNECTOR, oldInputConnector, newInputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputConnector(APIResourceInputConnector newInputConnector) {
		if (newInputConnector != inputConnector) {
			NotificationChain msgs = null;
			if (inputConnector != null)
				msgs = ((InternalEObject)inputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.API_RESOURCE__INPUT_CONNECTOR, null, msgs);
			if (newInputConnector != null)
				msgs = ((InternalEObject)newInputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.API_RESOURCE__INPUT_CONNECTOR, null, msgs);
			msgs = basicSetInputConnector(newInputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.API_RESOURCE__INPUT_CONNECTOR, newInputConnector, newInputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIResourceOutputConnector getOutputConnector() {
		return outputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputConnector(APIResourceOutputConnector newOutputConnector, NotificationChain msgs) {
		APIResourceOutputConnector oldOutputConnector = outputConnector;
		outputConnector = newOutputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.API_RESOURCE__OUTPUT_CONNECTOR, oldOutputConnector, newOutputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputConnector(APIResourceOutputConnector newOutputConnector) {
		if (newOutputConnector != outputConnector) {
			NotificationChain msgs = null;
			if (outputConnector != null)
				msgs = ((InternalEObject)outputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.API_RESOURCE__OUTPUT_CONNECTOR, null, msgs);
			if (newOutputConnector != null)
				msgs = ((InternalEObject)newOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.API_RESOURCE__OUTPUT_CONNECTOR, null, msgs);
			msgs = basicSetOutputConnector(newOutputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.API_RESOURCE__OUTPUT_CONNECTOR, newOutputConnector, newOutputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIResourceFaultInputConnector getFaultInputConnector() {
		return faultInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFaultInputConnector(APIResourceFaultInputConnector newFaultInputConnector, NotificationChain msgs) {
		APIResourceFaultInputConnector oldFaultInputConnector = faultInputConnector;
		faultInputConnector = newFaultInputConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.API_RESOURCE__FAULT_INPUT_CONNECTOR, oldFaultInputConnector, newFaultInputConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultInputConnector(APIResourceFaultInputConnector newFaultInputConnector) {
		if (newFaultInputConnector != faultInputConnector) {
			NotificationChain msgs = null;
			if (faultInputConnector != null)
				msgs = ((InternalEObject)faultInputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.API_RESOURCE__FAULT_INPUT_CONNECTOR, null, msgs);
			if (newFaultInputConnector != null)
				msgs = ((InternalEObject)newFaultInputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.API_RESOURCE__FAULT_INPUT_CONNECTOR, null, msgs);
			msgs = basicSetFaultInputConnector(newFaultInputConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.API_RESOURCE__FAULT_INPUT_CONNECTOR, newFaultInputConnector, newFaultInputConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiResourceUrlStyle getUrlStyle() {
		return urlStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlStyle(ApiResourceUrlStyle newUrlStyle) {
		ApiResourceUrlStyle oldUrlStyle = urlStyle;
		urlStyle = newUrlStyle == null ? URL_STYLE_EDEFAULT : newUrlStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.API_RESOURCE__URL_STYLE, oldUrlStyle, urlStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUriTemplate() {
		return uriTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUriTemplate(String newUriTemplate) {
		String oldUriTemplate = uriTemplate;
		uriTemplate = newUriTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.API_RESOURCE__URI_TEMPLATE, oldUriTemplate, uriTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrlMapping() {
		return urlMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlMapping(String newUrlMapping) {
		String oldUrlMapping = urlMapping;
		urlMapping = newUrlMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.API_RESOURCE__URL_MAPPING, oldUrlMapping, urlMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowGet() {
		return allowGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowGet(boolean newAllowGet) {
		boolean oldAllowGet = allowGet;
		allowGet = newAllowGet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.API_RESOURCE__ALLOW_GET, oldAllowGet, allowGet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowPost() {
		return allowPost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowPost(boolean newAllowPost) {
		boolean oldAllowPost = allowPost;
		allowPost = newAllowPost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.API_RESOURCE__ALLOW_POST, oldAllowPost, allowPost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowPut() {
		return allowPut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowPut(boolean newAllowPut) {
		boolean oldAllowPut = allowPut;
		allowPut = newAllowPut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.API_RESOURCE__ALLOW_PUT, oldAllowPut, allowPut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowDelete() {
		return allowDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowDelete(boolean newAllowDelete) {
		boolean oldAllowDelete = allowDelete;
		allowDelete = newAllowDelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.API_RESOURCE__ALLOW_DELETE, oldAllowDelete, allowDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowOptions() {
		return allowOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowOptions(boolean newAllowOptions) {
		boolean oldAllowOptions = allowOptions;
		allowOptions = newAllowOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.API_RESOURCE__ALLOW_OPTIONS, oldAllowOptions, allowOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyServiceContainer getContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(ProxyServiceContainer newContainer, NotificationChain msgs) {
		ProxyServiceContainer oldContainer = container;
		container = newContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.API_RESOURCE__CONTAINER, oldContainer, newContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(ProxyServiceContainer newContainer) {
		if (newContainer != container) {
			NotificationChain msgs = null;
			if (container != null)
				msgs = ((InternalEObject)container).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.API_RESOURCE__CONTAINER, null, msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.API_RESOURCE__CONTAINER, null, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.API_RESOURCE__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.API_RESOURCE__INPUT_CONNECTOR:
				return basicSetInputConnector(null, msgs);
			case EsbPackage.API_RESOURCE__OUTPUT_CONNECTOR:
				return basicSetOutputConnector(null, msgs);
			case EsbPackage.API_RESOURCE__FAULT_INPUT_CONNECTOR:
				return basicSetFaultInputConnector(null, msgs);
			case EsbPackage.API_RESOURCE__CONTAINER:
				return basicSetContainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsbPackage.API_RESOURCE__INPUT_CONNECTOR:
				return getInputConnector();
			case EsbPackage.API_RESOURCE__OUTPUT_CONNECTOR:
				return getOutputConnector();
			case EsbPackage.API_RESOURCE__FAULT_INPUT_CONNECTOR:
				return getFaultInputConnector();
			case EsbPackage.API_RESOURCE__URL_STYLE:
				return getUrlStyle();
			case EsbPackage.API_RESOURCE__URI_TEMPLATE:
				return getUriTemplate();
			case EsbPackage.API_RESOURCE__URL_MAPPING:
				return getUrlMapping();
			case EsbPackage.API_RESOURCE__ALLOW_GET:
				return isAllowGet();
			case EsbPackage.API_RESOURCE__ALLOW_POST:
				return isAllowPost();
			case EsbPackage.API_RESOURCE__ALLOW_PUT:
				return isAllowPut();
			case EsbPackage.API_RESOURCE__ALLOW_DELETE:
				return isAllowDelete();
			case EsbPackage.API_RESOURCE__ALLOW_OPTIONS:
				return isAllowOptions();
			case EsbPackage.API_RESOURCE__CONTAINER:
				return getContainer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EsbPackage.API_RESOURCE__INPUT_CONNECTOR:
				setInputConnector((APIResourceInputConnector)newValue);
				return;
			case EsbPackage.API_RESOURCE__OUTPUT_CONNECTOR:
				setOutputConnector((APIResourceOutputConnector)newValue);
				return;
			case EsbPackage.API_RESOURCE__FAULT_INPUT_CONNECTOR:
				setFaultInputConnector((APIResourceFaultInputConnector)newValue);
				return;
			case EsbPackage.API_RESOURCE__URL_STYLE:
				setUrlStyle((ApiResourceUrlStyle)newValue);
				return;
			case EsbPackage.API_RESOURCE__URI_TEMPLATE:
				setUriTemplate((String)newValue);
				return;
			case EsbPackage.API_RESOURCE__URL_MAPPING:
				setUrlMapping((String)newValue);
				return;
			case EsbPackage.API_RESOURCE__ALLOW_GET:
				setAllowGet((Boolean)newValue);
				return;
			case EsbPackage.API_RESOURCE__ALLOW_POST:
				setAllowPost((Boolean)newValue);
				return;
			case EsbPackage.API_RESOURCE__ALLOW_PUT:
				setAllowPut((Boolean)newValue);
				return;
			case EsbPackage.API_RESOURCE__ALLOW_DELETE:
				setAllowDelete((Boolean)newValue);
				return;
			case EsbPackage.API_RESOURCE__ALLOW_OPTIONS:
				setAllowOptions((Boolean)newValue);
				return;
			case EsbPackage.API_RESOURCE__CONTAINER:
				setContainer((ProxyServiceContainer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EsbPackage.API_RESOURCE__INPUT_CONNECTOR:
				setInputConnector((APIResourceInputConnector)null);
				return;
			case EsbPackage.API_RESOURCE__OUTPUT_CONNECTOR:
				setOutputConnector((APIResourceOutputConnector)null);
				return;
			case EsbPackage.API_RESOURCE__FAULT_INPUT_CONNECTOR:
				setFaultInputConnector((APIResourceFaultInputConnector)null);
				return;
			case EsbPackage.API_RESOURCE__URL_STYLE:
				setUrlStyle(URL_STYLE_EDEFAULT);
				return;
			case EsbPackage.API_RESOURCE__URI_TEMPLATE:
				setUriTemplate(URI_TEMPLATE_EDEFAULT);
				return;
			case EsbPackage.API_RESOURCE__URL_MAPPING:
				setUrlMapping(URL_MAPPING_EDEFAULT);
				return;
			case EsbPackage.API_RESOURCE__ALLOW_GET:
				setAllowGet(ALLOW_GET_EDEFAULT);
				return;
			case EsbPackage.API_RESOURCE__ALLOW_POST:
				setAllowPost(ALLOW_POST_EDEFAULT);
				return;
			case EsbPackage.API_RESOURCE__ALLOW_PUT:
				setAllowPut(ALLOW_PUT_EDEFAULT);
				return;
			case EsbPackage.API_RESOURCE__ALLOW_DELETE:
				setAllowDelete(ALLOW_DELETE_EDEFAULT);
				return;
			case EsbPackage.API_RESOURCE__ALLOW_OPTIONS:
				setAllowOptions(ALLOW_OPTIONS_EDEFAULT);
				return;
			case EsbPackage.API_RESOURCE__CONTAINER:
				setContainer((ProxyServiceContainer)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EsbPackage.API_RESOURCE__INPUT_CONNECTOR:
				return inputConnector != null;
			case EsbPackage.API_RESOURCE__OUTPUT_CONNECTOR:
				return outputConnector != null;
			case EsbPackage.API_RESOURCE__FAULT_INPUT_CONNECTOR:
				return faultInputConnector != null;
			case EsbPackage.API_RESOURCE__URL_STYLE:
				return urlStyle != URL_STYLE_EDEFAULT;
			case EsbPackage.API_RESOURCE__URI_TEMPLATE:
				return URI_TEMPLATE_EDEFAULT == null ? uriTemplate != null : !URI_TEMPLATE_EDEFAULT.equals(uriTemplate);
			case EsbPackage.API_RESOURCE__URL_MAPPING:
				return URL_MAPPING_EDEFAULT == null ? urlMapping != null : !URL_MAPPING_EDEFAULT.equals(urlMapping);
			case EsbPackage.API_RESOURCE__ALLOW_GET:
				return allowGet != ALLOW_GET_EDEFAULT;
			case EsbPackage.API_RESOURCE__ALLOW_POST:
				return allowPost != ALLOW_POST_EDEFAULT;
			case EsbPackage.API_RESOURCE__ALLOW_PUT:
				return allowPut != ALLOW_PUT_EDEFAULT;
			case EsbPackage.API_RESOURCE__ALLOW_DELETE:
				return allowDelete != ALLOW_DELETE_EDEFAULT;
			case EsbPackage.API_RESOURCE__ALLOW_OPTIONS:
				return allowOptions != ALLOW_OPTIONS_EDEFAULT;
			case EsbPackage.API_RESOURCE__CONTAINER:
				return container != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (urlStyle: ");
		result.append(urlStyle);
		result.append(", uriTemplate: ");
		result.append(uriTemplate);
		result.append(", urlMapping: ");
		result.append(urlMapping);
		result.append(", allowGet: ");
		result.append(allowGet);
		result.append(", allowPost: ");
		result.append(allowPost);
		result.append(", allowPut: ");
		result.append(allowPut);
		result.append(", allowDelete: ");
		result.append(allowDelete);
		result.append(", allowOptions: ");
		result.append(allowOptions);
		result.append(')');
		return result.toString();
	}

} //APIResourceImpl
