package org.wso2.developerstudio.appfactory.core.client;

 
	
	import org.apache.http.*;
import org.apache.http.auth.*;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.wso2.developerstudio.appfactory.core.Activator;
import org.wso2.developerstudio.appfactory.core.authentication.Authenticator;
import org.wso2.developerstudio.appfactory.core.authentication.UserPasswordCredentials;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	/**
	 * Simple class to launch a jenkins build on run@Cloud platform, should also work on every jenkins instance (not tested)
	 */
	public class HttpsGenkinsClient {
		private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	    public static HttpResponse getBulildinfo(String applicationId,String version,String builderBaseUrl,int lastBuildNo){
 
	        DefaultHttpClient client = new DefaultHttpClient();
	        client = (DefaultHttpClient) HttpsJaggeryClient.wrapClient(client,builderBaseUrl);
	        client.getCredentialsProvider().setCredentials(new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT),
	                new UsernamePasswordCredentials(Authenticator.getInstance().getCredentials().getUser()
	                		, Authenticator.getInstance().getCredentials().getPassword()));

	        // Generate BASIC scheme object and stick it to the execution context
	        BasicScheme basicAuth = new BasicScheme();
	        BasicHttpContext context = new BasicHttpContext();
	        context.setAttribute("preemptive-auth", basicAuth);

	        // Add as the first (because of the zero) request interceptor
	        // It will first intercept the request and preemptively initialize the authentication scheme if there is not
	        client.addRequestInterceptor(new PreemptiveAuth(), 0);
	        String getUrl =   builderBaseUrl + "/job/" + applicationId + "-" + version + "-default/" + lastBuildNo + "/consoleText";
	        HttpGet get = new HttpGet(getUrl);

	        try {
	            // Execute your request with the given context
	            HttpResponse response = client.execute(get, context);
	            return response;
	        } catch (Exception e) {
	        log.error("Jenkins Client err", e);
	        } 
			return null;
	    }

	    /**
	     * Preemptive authentication interceptor
	     */
	    static class PreemptiveAuth implements HttpRequestInterceptor {

	        /*
	           * (non-Javadoc)
	           *
	           * @see org.apache.http.HttpRequestInterceptor#process(org.apache.http.HttpRequest,
	           * org.apache.http.protocol.HttpContext)
	           */
	        public void process(HttpRequest request, HttpContext context) throws HttpException, IOException {
	            // Get the AuthState
	            AuthState authState = (AuthState) context.getAttribute(ClientContext.TARGET_AUTH_STATE);

	            // If no auth scheme available yet, try to initialize it preemptively
	            if (authState.getAuthScheme() == null) {
	                AuthScheme authScheme = (AuthScheme) context.getAttribute("preemptive-auth");
	                CredentialsProvider credsProvider = (CredentialsProvider) context
	                        .getAttribute(ClientContext.CREDS_PROVIDER);
	                HttpHost targetHost = (HttpHost) context.getAttribute(ExecutionContext.HTTP_TARGET_HOST);
	                if (authScheme != null) {
	                    Credentials creds = credsProvider.getCredentials(new AuthScope(targetHost.getHostName(), targetHost
	                            .getPort()));
	                    if (creds == null) {
	                        throw new HttpException("No credentials for preemptive authentication");
	                    }
	                    authState.setAuthScheme(authScheme);
	                    authState.setCredentials(creds);
	                }
	            }

	        }

	    }
 

}
