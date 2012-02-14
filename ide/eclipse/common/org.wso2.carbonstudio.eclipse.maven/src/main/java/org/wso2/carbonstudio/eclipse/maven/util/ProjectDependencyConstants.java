package org.wso2.carbonstudio.eclipse.maven.util;

import java.util.HashMap;
import java.util.Map;


public class ProjectDependencyConstants {
	public static final Map<String, String> dependencyMap = new HashMap<String, String>();
    static {
        dependencyMap.put("${wsdl4j.version}", "1.6.2");
        dependencyMap.put("${neethi.version}", "2.0.4");
        dependencyMap.put("commons-collections", "3.2.0.wso2v1");
        dependencyMap.put("org.wso2.carbon.governance.registry.extensions", "3.1.0");
        dependencyMap.put("axis2", "1.6.0-wso2v1");
        dependencyMap.put("rampart-trust", "1.6.0.wso2v1");
        dependencyMap.put("jline", "0.9.94");
        dependencyMap.put("org.wso2.carbon.dataservices.core", "3.0.1");
        dependencyMap.put("ognl", "2.7.3");
        dependencyMap.put("geronimo-stax-api_1.0_spec", "1.0.1.wso2v1");
        dependencyMap.put("commons-lang", "2.3.0.wso2v1");
        dependencyMap.put("commons-httpclient", "3.1.0.wso2v1");
        dependencyMap.put("org.wso2.carbon.user.core", "3.0.0");
        dependencyMap.put("XmlSchema", "1.4.2.wso2v1");
        dependencyMap.put("commons-lang", "2.4");
        dependencyMap.put("json", "1.0.0.wso2v1");
        dependencyMap.put("rampart-core", "1.6.0.wso2v1");
        dependencyMap.put("abdera", "1.0.wso2v1");
        dependencyMap.put("snakeyaml", "1.6");
        dependencyMap.put("httpcore", "4.1.0.alpha1-wso2v1");
        dependencyMap.put("opensaml2", "2.0.0.alpha1-wso2v1");
        dependencyMap.put("rampart-policy", "1.6.0.wso2v1");
        dependencyMap.put("mvel2", "2.0.17");
        dependencyMap.put("axiom", "1.2.9-wso2v1");
        dependencyMap.put("synapse-core", "2.1.0-wso2v1");
        dependencyMap.put("jettison", "1.2");
        dependencyMap.put("woden", "1.0.0.M8-wso2v1");
        dependencyMap.put("commons-io", "1.4.0.wso2v1");
        dependencyMap.put("slf4j-api", "1.5.8");
        dependencyMap.put("org.wso2.carbon.authenticator.proxy", "3.1.0");
        dependencyMap.put("commons-codec", "1.3.0.wso2v1");
        dependencyMap.put("commons-logging", "1.1.1");
        dependencyMap.put("org.wso2.carbon.registry.core", "3.0.0");
        dependencyMap.put("joda-time", "1.6.0.wso2v1");
        dependencyMap.put("xstream", "1.2.2");
        dependencyMap.put("synapse-commons", "1.4.0-wso2v2");
        dependencyMap.put("synapse-tasks", "1.4.0-wso2v2");
        dependencyMap.put("synapse-nhttp-transport", "1.4.0-wso2v2");
    }
}
