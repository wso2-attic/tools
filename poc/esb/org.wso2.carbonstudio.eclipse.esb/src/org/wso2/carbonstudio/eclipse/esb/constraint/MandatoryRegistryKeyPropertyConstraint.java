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
package org.wso2.carbonstudio.eclipse.esb.constraint;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.wso2.carbonstudio.eclipse.esb.RegistryKeyProperty;

/**
 * A constraint for validating mandatory {@link RegistryKeyProperty} attributes.
 */
public class MandatoryRegistryKeyPropertyConstraint extends AbstractModelConstraint {
	/**
	 * {@inheritDoc}
	 */
	public IStatus validate(IValidationContext ctx) {
		List<Notification> notifications = ctx.getAllEvents();

		// We are only interested in live validations triggered by 'set'
		// operations which cause only one notification to be sent. 
		if (notifications.size() == 1) {
			Notification notification = notifications.get(0);
			String newValue = ((RegistryKeyProperty) notification.getNewValue()).getKeyValue();
			String oldValue = ((RegistryKeyProperty) notification.getOldValue()).getKeyValue();
			
			// If the original value is also invalid, there is no point in
			// triggering a failure. 
			if (StringUtils.isBlank(newValue) && !StringUtils.isBlank(oldValue)) {
				return ctx.createFailureStatus();
			}
		}
		
		return ctx.createSuccessStatus();
	}
}
