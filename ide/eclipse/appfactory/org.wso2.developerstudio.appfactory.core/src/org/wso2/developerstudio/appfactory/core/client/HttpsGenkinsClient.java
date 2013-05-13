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
import org.wso2.developerstudio.appfactory.core.authentication.Authenticator;
import org.wso2.developerstudio.appfactory.core.authentication.UserPasswordCredentials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	/**
	 * Simple class to launch a jenkins build on run@Cloud platform, should also work on every jenkins instance (not tested)
	 */
	public class HttpsGenkinsClient {

	    public static HttpResponse getBulildinfo(String applicationId,String version,String builderBaseUrl,int lastBuildNo){
 
	        DefaultHttpClient client = new DefaultHttpClient();
	        client = (DefaultHttpClient) HttpsJaggeryClient.wrapClient(client);
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
	        // You get request that will start the build
	        //String builderBaseUrl = "https://jenkins.staging.appfactorypreview.wso2.com";
	        //int lastBuildNo = 2;
	        String getUrl =   builderBaseUrl + "/job/" + applicationId + "-" + version + "-default/" + lastBuildNo + "/consoleText";
	        HttpGet get = new HttpGet(getUrl);

	        try {
	            // Execute your request with the given context
	            HttpResponse response = client.execute(get, context);
	          /*  System.out.println(response.getStatusLine().getStatusCode());

	            HttpEntity entity = response.getEntity();
	            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
	            StringBuilder sb = new StringBuilder();
	            String line;
	       //     TestOutputConsole
               
	            while ((line = rd.readLine()) != null) {
	               // Thread.sleep(100);
	                //sb.append(line + "\n");
	                System.out.println(line.toString());
	                Thread.sleep(10);
	            }
	            EntityUtils.consume(entity);*/
	            return response;
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	         e.printStackTrace();
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
