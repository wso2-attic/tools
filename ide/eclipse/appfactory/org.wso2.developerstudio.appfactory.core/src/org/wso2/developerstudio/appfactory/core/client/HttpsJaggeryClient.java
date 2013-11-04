/* Copyright (c) WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.appfactory.core.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.wso2.developerstudio.appfactory.core.Activator;
import org.wso2.developerstudio.appfactory.core.authentication.Authenticator;
import org.wso2.developerstudio.appfactory.core.model.ErrorModel;
import org.wso2.developerstudio.appfactory.core.utils.Messages;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
 
public class HttpsJaggeryClient {
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
    private static HttpClient  client;

	public static String httpPostLogin(String urlStr, Map<String,String> params){
 
	 
	    client = new DefaultHttpClient();
	    client = HttpsJaggeryClient.wrapClient(client,urlStr);
	    return  httpPost(urlStr,params);
	}
	
	public static String httpPost(String urlStr, Map<String,String> params){
		   
		    HttpPost post = new HttpPost(urlStr);
		   //  PostMethod postMethod = new PostMethod(urlStr);
		    String respond = Messages.HttpsJaggeryClient_0;
		    HttpResponse response=null;
	         try{
		      List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
			  Set<String> keySet = params.keySet();
			  for (String key : keySet) {
				  nameValuePairs.add(new BasicNameValuePair(key, params.get(key)));
			   }
		      post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
		      response = client.execute(post);
		    //  client.executeMethod(post);
		      if(200==response.getStatusLine().getStatusCode()){
		      HttpEntity entityGetAppsOfUser = response.getEntity();
		      BufferedReader rd = new BufferedReader(new InputStreamReader(entityGetAppsOfUser.getContent()));
		      StringBuilder sb = new StringBuilder();
		      String line =Messages.HttpsJaggeryClient_1;
		      while ((line = rd.readLine()) != null) {
		                  sb.append(line);
		            }
		      respond = sb.toString();
		      EntityUtils.consume(entityGetAppsOfUser);
		      if (entityGetAppsOfUser != null) {
		    	  entityGetAppsOfUser.getContent().close();
		    	}
		      }else{
		    	     ErrorModel errorModel = Authenticator.getInstance().getErrorModel();
		    	     errorModel.setMessage(Messages.HttpsJaggeryClient_2);
		    	     List<String> reasons = new ArrayList<String>();
		    	     reasons.add(Messages.HttpsJaggeryClient_3+response.getStatusLine().getStatusCode());
		    	     reasons.add(response.getStatusLine().getReasonPhrase()); 
		    	     errorModel.setReasons(reasons);
		    	  return Messages.HttpsJaggeryClient_4;
		      }
		     
	      }catch(Exception e){
	    	  
	    	     ErrorModel errorModel = Authenticator.getInstance().getErrorModel();
	    	     
	    	     errorModel.setMessage(Messages.HttpsJaggeryClient_5);
	    	     List<String> reasons = new ArrayList<String>();
	    	     reasons.add(Messages.HttpsJaggeryClient_6);
	    	     reasons.add(Messages.HttpsJaggeryClient_7);
	    	     reasons.add(Messages.HttpsJaggeryClient_8);
	    	     reasons.add(e.getMessage());
	    	     reasons.add(Messages.HttpsJaggeryClient_9);
	    	     reasons.add(Messages.HttpsJaggeryClient_10);
	    	     errorModel.setReasons(reasons);
	    	     log.error(Messages.HttpsJaggeryClient_11,e); 
	        	 return Messages.HttpsJaggeryClient_12;
	         } finally{
	           client.getConnectionManager().closeExpiredConnections();
	         }
 
     return respond;	       
  }
	@SuppressWarnings("deprecation")
	public static HttpClient wrapClient(HttpClient base,String urlStr) {
        try {
            SSLContext ctx = SSLContext.getInstance(Messages.HttpsJaggeryClient_13);
            X509TrustManager tm = new X509TrustManager() {

                public void checkClientTrusted(X509Certificate[] xcs, String string) throws CertificateException {
                }

                public void checkServerTrusted(X509Certificate[] xcs, String string) throws CertificateException {
                }

                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
            };
            ctx.init(null, new TrustManager[]{tm}, null);
            SSLSocketFactory ssf = new SSLSocketFactory(ctx);
            ssf.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
          
            ClientConnectionManager ccm =  new ThreadSafeClientConnManager();
            SchemeRegistry sr = ccm.getSchemeRegistry();
            URL url = new URL(urlStr);
            int port = url.getPort();
            if(port==-1){
            	port=443;
            }
            String protocol = url.getProtocol();
            if(Messages.HttpsJaggeryClient_14.equals(protocol)){
            	 if(port==-1){
                 	port=443;
                 }
            }else if(Messages.HttpsJaggeryClient_15.equals(protocol)){
            	 if(port==-1){
                 	port=80;
                 }
            }
            sr.register(new Scheme(protocol, ssf, port));
            
            return new DefaultHttpClient(ccm, base.getParams());
        } catch (Throwable ex) {
            ex.printStackTrace();
            log.error(Messages.HttpsJaggeryClient_16, ex);
            return null;
        } 
    }
}
