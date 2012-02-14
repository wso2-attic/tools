
/**
 * UserAdminExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6-wso2v1  Built on : Apr 27, 2010 (12:11:11 UTC)
 */

package org.wso2.carbon.user.mgt;

public class UserAdminExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1283847204676L;
    
    private org.wso2.carbon.user.mgt.UserAdminStub.UserAdminExceptionE faultMessage;

    
        public UserAdminExceptionException() {
            super("UserAdminExceptionException");
        }

        public UserAdminExceptionException(java.lang.String s) {
           super(s);
        }

        public UserAdminExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UserAdminExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.user.mgt.UserAdminStub.UserAdminExceptionE msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.user.mgt.UserAdminStub.UserAdminExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    