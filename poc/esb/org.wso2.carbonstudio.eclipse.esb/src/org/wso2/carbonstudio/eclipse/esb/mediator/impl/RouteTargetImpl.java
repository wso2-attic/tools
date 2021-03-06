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

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.wso2.carbonstudio.eclipse.esb.RegistryKeyProperty;
import org.wso2.carbonstudio.eclipse.esb.core.utils.ESBMediaTypeConstants;
import org.wso2.carbonstudio.eclipse.esb.impl.AbstractCommonTargetImpl;
import org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage;
import org.wso2.carbonstudio.eclipse.esb.mediator.RouteTarget;
import org.wso2.carbonstudio.eclipse.platform.core.utils.CSProviderConstants;
import org.wso2.carbonstudio.eclipse.platform.core.utils.CarbonStudioProviderUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RouteTargetImpl extends AbstractCommonTargetImpl implements RouteTarget {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected RouteTargetImpl() {
		super();
		
		// Sequence key.
		RegistryKeyProperty sequenceKey = getEsbFactory().createRegistryKeyProperty();
		//Set filter properties to filter in only sequences media type
		CarbonStudioProviderUtils.addFilter((Map<String, List<String>>)sequenceKey.getFilters(), CSProviderConstants.FILTER_MEDIA_TYPE, ESBMediaTypeConstants.MEDIA_TYPE_SEQUENCE);

		sequenceKey.setPrettyName("Sequence Key");
		sequenceKey.setKeyName("sequence");
		sequenceKey.setKeyValue(DEFAULT_SEQUENCE_REFERENCE_REGISTRY_KEY);
		setSequenceKey(sequenceKey);
		
		// Endpoint key.
		RegistryKeyProperty endpointKey = getEsbFactory().createRegistryKeyProperty();
		//Set filter properties to filter in only sequences media type
		CarbonStudioProviderUtils.addFilter((Map<String, List<String>>)endpointKey.getFilters(), CSProviderConstants.FILTER_MEDIA_TYPE, ESBMediaTypeConstants.MEDIA_TYPE_ENDPOINT);

		endpointKey.setPrettyName("Endpoint Key");
		endpointKey.setKeyName("endpoint");
		endpointKey.setKeyValue(DEFAULT_ENDPOINT_REFERENCE_REGISTRY_KEY);
		setEndpointKey(endpointKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MediatorPackage.Literals.ROUTE_TARGET;
	}

} //RouteTargetImpl
