/*
 * Copyright 2012 WSO2, Inc. (http://wso2.com)
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

package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence.custom;

import java.util.List;
import org.apache.axiom.om.OMElement;
import org.apache.synapse.Mediator;
import org.apache.synapse.config.xml.AbstractMediatorSerializer;

public class CallTemplateMediatorExtSerializer extends AbstractMediatorSerializer {

	public String getMediatorClassName() {
		return CallTemplateMediatorExt.class.getName();
	}

	protected OMElement serializeSpecificMediator(Mediator m) {
		if (!(m instanceof CallTemplateMediatorExt)) {
            handleException("Unsupported mediator passed in for serialization : " + m.getType());
        }
		CallTemplateMediatorExt mediator = (CallTemplateMediatorExt) m;
        OMElement callTemplate = fac.createOMElement("call-template", synNS);
        saveTracingState(callTemplate, mediator);

        if (mediator.getTarget() != null) {
            callTemplate.addAttribute(fac.createOMAttribute(
                "target", nullNS, mediator.getTarget()));
        } else {
            handleException("Invalid call-template mediator. The target is required");
        }
        
        List<CallTemplateExtParameter> parameters = mediator.getParameters();
        for (CallTemplateExtParameter parameter : parameters) {
        	OMElement param = fac.createOMElement("target", synNS, callTemplate);
        	param.addAttribute(fac.createOMAttribute("name", nullNS, parameter.getParameterName()));
        	if(parameter.getParameterType().equals(CallTemplateExtParameter.ParameterType.EXPRESSION)){
        		param.addAttribute(fac.createOMAttribute("value", nullNS, "{" + parameter.getParameterValue() + "}"));
        	} else{
        		param.addAttribute(fac.createOMAttribute("value", nullNS, parameter.getParameterValue()));
        	}
        	callTemplate.addChild(param);
		}

        return callTemplate;
	}

}
