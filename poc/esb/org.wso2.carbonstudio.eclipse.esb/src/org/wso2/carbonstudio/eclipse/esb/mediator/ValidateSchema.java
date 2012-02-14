/*
 * Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
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
package org.wso2.carbonstudio.eclipse.esb.mediator;

import org.wso2.carbonstudio.eclipse.esb.ModelObject;
import org.wso2.carbonstudio.eclipse.esb.RegistryKeyProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validate Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediator.ValidateSchema#getSchemaKey <em>Schema Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getValidateSchema()
 * @model
 * @generated
 */
public interface ValidateSchema extends ModelObject {
	/**
	 * Returns the value of the '<em><b>Schema Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Key</em>' containment reference.
	 * @see #setSchemaKey(RegistryKeyProperty)
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getValidateSchema_SchemaKey()
	 * @model containment="true"
	 * @generated
	 */
	RegistryKeyProperty getSchemaKey();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ValidateSchema#getSchemaKey <em>Schema Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Key</em>' containment reference.
	 * @see #getSchemaKey()
	 * @generated
	 */
	void setSchemaKey(RegistryKeyProperty value);

} // ValidateSchema
