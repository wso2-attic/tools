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
package org.wso2.carbonstudio.eclipse.esb.mediator.impl;

import org.eclipse.emf.ecore.EClass;
import org.w3c.dom.Element;
import org.wso2.carbonstudio.eclipse.esb.Mediator;
import org.wso2.carbonstudio.eclipse.esb.impl.ParentMediatorImpl;
import org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage;
import org.wso2.carbonstudio.eclipse.esb.mediator.OutMediator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OutMediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OutMediatorImpl extends ParentMediatorImpl implements OutMediator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutMediatorImpl() {
		super();
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void doLoad(Element self) throws Exception {
		super.doLoad(self);
	}
	
	/**
	 * {@inheritDoc}
	 */
	public Element doSave(Element parent) throws Exception {
		Element self = createChildElement(parent, "out");
		for (Mediator child : getChildren()) {
			child.save(self);
		}
		return self;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MediatorPackage.Literals.OUT_MEDIATOR;
	}

} //OutMediatorImpl
