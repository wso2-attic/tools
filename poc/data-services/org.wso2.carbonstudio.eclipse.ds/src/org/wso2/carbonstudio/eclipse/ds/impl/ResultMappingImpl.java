/* Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbonstudio.eclipse.ds.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.wso2.carbonstudio.eclipse.ds.AttributeMapping;
import org.wso2.carbonstudio.eclipse.ds.CallQuery;
import org.wso2.carbonstudio.eclipse.ds.DsPackage;
import org.wso2.carbonstudio.eclipse.ds.ElementMapping;
import org.wso2.carbonstudio.eclipse.ds.ResultMapping;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Result Mapping</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ResultMappingImpl#getElementName
 * <em>Element Name</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ResultMappingImpl#getRowName
 * <em>Row Name</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ResultMappingImpl#getDefaultNamespace
 * <em>Default Namespace</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ResultMappingImpl#getXsltPath
 * <em>Xslt Path</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ResultMappingImpl#getOutputType
 * <em>Output Type</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ResultMappingImpl#getElementMappings
 * <em>Element Mappings</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ResultMappingImpl#getAttributeMappings
 * <em>Attribute Mappings</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ResultMappingImpl#getCallQueries
 * <em>Call Queries</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ResultMappingImpl extends EObjectImpl implements ResultMapping {
	/**
	 * The default value of the '{@link #getElementName() <em>Element Name</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementName() <em>Element Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected String elementName = ELEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowName() <em>Row Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRowName()
	 * @generated
	 * @ordered
	 */
	protected static final String ROW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowName() <em>Row Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRowName()
	 * @generated
	 * @ordered
	 */
	protected String rowName = ROW_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultNamespace()
	 * <em>Default Namespace</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDefaultNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultNamespace()
	 * <em>Default Namespace</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDefaultNamespace()
	 * @generated
	 * @ordered
	 */
	protected String defaultNamespace = DEFAULT_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXsltPath() <em>Xslt Path</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getXsltPath()
	 * @generated
	 * @ordered
	 */
	protected static final String XSLT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXsltPath() <em>Xslt Path</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getXsltPath()
	 * @generated
	 * @ordered
	 */
	protected String xsltPath = XSLT_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputType() <em>Output Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOutputType()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getOutputType() <em>Output Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOutputType()
	 * @generated
	 * @ordered
	 */
	protected String outputType = OUTPUT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementMappings()
	 * <em>Element Mappings</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getElementMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementMapping> elementMappings;

	/**
	 * The cached value of the '{@link #getAttributeMappings()
	 * <em>Attribute Mappings</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAttributeMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeMapping> attributeMappings;

	/**
	 * The cached value of the '{@link #getCallQueries() <em>Call Queries</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCallQueries()
	 * @generated
	 * @ordered
	 */
	protected EList<CallQuery> callQueries;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ResultMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsPackage.Literals.RESULT_MAPPING;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getElementName() {
		return elementName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setElementName(String newElementName) {
		String oldElementName = elementName;
		elementName = newElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.RESULT_MAPPING__ELEMENT_NAME, oldElementName, elementName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getRowName() {
		return rowName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRowName(String newRowName) {
		String oldRowName = rowName;
		rowName = newRowName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.RESULT_MAPPING__ROW_NAME, oldRowName, rowName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDefaultNamespace() {
		return defaultNamespace;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDefaultNamespace(String newDefaultNamespace) {
		String oldDefaultNamespace = defaultNamespace;
		defaultNamespace = newDefaultNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.RESULT_MAPPING__DEFAULT_NAMESPACE, oldDefaultNamespace,
					defaultNamespace));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getXsltPath() {
		return xsltPath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setXsltPath(String newXsltPath) {
		String oldXsltPath = xsltPath;
		xsltPath = newXsltPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.RESULT_MAPPING__XSLT_PATH, oldXsltPath, xsltPath));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getOutputType() {
		return outputType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOutputType(String newOutputType) {
		String oldOutputType = outputType;
		outputType = newOutputType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DsPackage.RESULT_MAPPING__OUTPUT_TYPE, oldOutputType, outputType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ElementMapping> getElementMappings() {
		if (elementMappings == null) {
			elementMappings = new EObjectContainmentEList<ElementMapping>(ElementMapping.class,
					this, DsPackage.RESULT_MAPPING__ELEMENT_MAPPINGS);
		}
		return elementMappings;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<AttributeMapping> getAttributeMappings() {
		if (attributeMappings == null) {
			attributeMappings = new EObjectContainmentEList<AttributeMapping>(
					AttributeMapping.class, this, DsPackage.RESULT_MAPPING__ATTRIBUTE_MAPPINGS);
		}
		return attributeMappings;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CallQuery> getCallQueries() {
		if (callQueries == null) {
			callQueries = new EObjectContainmentEList<CallQuery>(CallQuery.class, this,
					DsPackage.RESULT_MAPPING__CALL_QUERIES);
		}
		return callQueries;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case DsPackage.RESULT_MAPPING__ELEMENT_MAPPINGS:
			return ((InternalEList<?>) getElementMappings()).basicRemove(otherEnd, msgs);
		case DsPackage.RESULT_MAPPING__ATTRIBUTE_MAPPINGS:
			return ((InternalEList<?>) getAttributeMappings()).basicRemove(otherEnd, msgs);
		case DsPackage.RESULT_MAPPING__CALL_QUERIES:
			return ((InternalEList<?>) getCallQueries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DsPackage.RESULT_MAPPING__ELEMENT_NAME:
			return getElementName();
		case DsPackage.RESULT_MAPPING__ROW_NAME:
			return getRowName();
		case DsPackage.RESULT_MAPPING__DEFAULT_NAMESPACE:
			return getDefaultNamespace();
		case DsPackage.RESULT_MAPPING__XSLT_PATH:
			return getXsltPath();
		case DsPackage.RESULT_MAPPING__OUTPUT_TYPE:
			return getOutputType();
		case DsPackage.RESULT_MAPPING__ELEMENT_MAPPINGS:
			return getElementMappings();
		case DsPackage.RESULT_MAPPING__ATTRIBUTE_MAPPINGS:
			return getAttributeMappings();
		case DsPackage.RESULT_MAPPING__CALL_QUERIES:
			return getCallQueries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DsPackage.RESULT_MAPPING__ELEMENT_NAME:
			setElementName((String) newValue);
			return;
		case DsPackage.RESULT_MAPPING__ROW_NAME:
			setRowName((String) newValue);
			return;
		case DsPackage.RESULT_MAPPING__DEFAULT_NAMESPACE:
			setDefaultNamespace((String) newValue);
			return;
		case DsPackage.RESULT_MAPPING__XSLT_PATH:
			setXsltPath((String) newValue);
			return;
		case DsPackage.RESULT_MAPPING__OUTPUT_TYPE:
			setOutputType((String) newValue);
			return;
		case DsPackage.RESULT_MAPPING__ELEMENT_MAPPINGS:
			getElementMappings().clear();
			getElementMappings().addAll((Collection<? extends ElementMapping>) newValue);
			return;
		case DsPackage.RESULT_MAPPING__ATTRIBUTE_MAPPINGS:
			getAttributeMappings().clear();
			getAttributeMappings().addAll((Collection<? extends AttributeMapping>) newValue);
			return;
		case DsPackage.RESULT_MAPPING__CALL_QUERIES:
			getCallQueries().clear();
			getCallQueries().addAll((Collection<? extends CallQuery>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DsPackage.RESULT_MAPPING__ELEMENT_NAME:
			setElementName(ELEMENT_NAME_EDEFAULT);
			return;
		case DsPackage.RESULT_MAPPING__ROW_NAME:
			setRowName(ROW_NAME_EDEFAULT);
			return;
		case DsPackage.RESULT_MAPPING__DEFAULT_NAMESPACE:
			setDefaultNamespace(DEFAULT_NAMESPACE_EDEFAULT);
			return;
		case DsPackage.RESULT_MAPPING__XSLT_PATH:
			setXsltPath(XSLT_PATH_EDEFAULT);
			return;
		case DsPackage.RESULT_MAPPING__OUTPUT_TYPE:
			setOutputType(OUTPUT_TYPE_EDEFAULT);
			return;
		case DsPackage.RESULT_MAPPING__ELEMENT_MAPPINGS:
			getElementMappings().clear();
			return;
		case DsPackage.RESULT_MAPPING__ATTRIBUTE_MAPPINGS:
			getAttributeMappings().clear();
			return;
		case DsPackage.RESULT_MAPPING__CALL_QUERIES:
			getCallQueries().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DsPackage.RESULT_MAPPING__ELEMENT_NAME:
			return ELEMENT_NAME_EDEFAULT == null ? elementName != null : !ELEMENT_NAME_EDEFAULT
					.equals(elementName);
		case DsPackage.RESULT_MAPPING__ROW_NAME:
			return ROW_NAME_EDEFAULT == null ? rowName != null : !ROW_NAME_EDEFAULT.equals(rowName);
		case DsPackage.RESULT_MAPPING__DEFAULT_NAMESPACE:
			return DEFAULT_NAMESPACE_EDEFAULT == null ? defaultNamespace != null
					: !DEFAULT_NAMESPACE_EDEFAULT.equals(defaultNamespace);
		case DsPackage.RESULT_MAPPING__XSLT_PATH:
			return XSLT_PATH_EDEFAULT == null ? xsltPath != null : !XSLT_PATH_EDEFAULT
					.equals(xsltPath);
		case DsPackage.RESULT_MAPPING__OUTPUT_TYPE:
			return OUTPUT_TYPE_EDEFAULT == null ? outputType != null : !OUTPUT_TYPE_EDEFAULT
					.equals(outputType);
		case DsPackage.RESULT_MAPPING__ELEMENT_MAPPINGS:
			return elementMappings != null && !elementMappings.isEmpty();
		case DsPackage.RESULT_MAPPING__ATTRIBUTE_MAPPINGS:
			return attributeMappings != null && !attributeMappings.isEmpty();
		case DsPackage.RESULT_MAPPING__CALL_QUERIES:
			return callQueries != null && !callQueries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (elementName: ");
		result.append(elementName);
		result.append(", rowName: ");
		result.append(rowName);
		result.append(", defaultNamespace: ");
		result.append(defaultNamespace);
		result.append(", xsltPath: ");
		result.append(xsltPath);
		result.append(", outputType: ");
		result.append(outputType);
		result.append(')');
		return result.toString();
	}

} // ResultMappingImpl
