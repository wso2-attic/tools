
/**
 * UserAdminCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6-wso2v1  Built on : Apr 27, 2010 (12:11:11 UTC)
 */

    package org.wso2.carbon.user.mgt;

    /**
     *  UserAdminCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class UserAdminCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public UserAdminCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public UserAdminCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getAllUIPermissions method
            * override this method for handling normal response from getAllUIPermissions operation
            */
           public void receiveResultgetAllUIPermissions(
                    org.wso2.carbon.user.mgt.UserAdminStub.UIPermissionNode result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllUIPermissions operation
           */
            public void receiveErrorgetAllUIPermissions(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for listUsers method
            * override this method for handling normal response from listUsers operation
            */
           public void receiveResultlistUsers(
                    java.lang.String[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from listUsers operation
           */
            public void receiveErrorlistUsers(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getAllRolesNames method
            * override this method for handling normal response from getAllRolesNames operation
            */
           public void receiveResultgetAllRolesNames(
                    org.wso2.carbon.user.mgt.UserAdminStub.FlaggedName[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllRolesNames operation
           */
            public void receiveErrorgetAllRolesNames(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
               // No methods generated for meps other than in-out
                
               // No methods generated for meps other than in-out
                
               // No methods generated for meps other than in-out
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getUsersOfRole method
            * override this method for handling normal response from getUsersOfRole operation
            */
           public void receiveResultgetUsersOfRole(
                    org.wso2.carbon.user.mgt.UserAdminStub.FlaggedName[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUsersOfRole operation
           */
            public void receiveErrorgetUsersOfRole(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateUsersOfRole method
            * override this method for handling normal response from updateUsersOfRole operation
            */
           public void receiveResultupdateUsersOfRole(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateUsersOfRole operation
           */
            public void receiveErrorupdateUsersOfRole(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for changePasswordByUser method
            * override this method for handling normal response from changePasswordByUser operation
            */
           public void receiveResultchangePasswordByUser(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from changePasswordByUser operation
           */
            public void receiveErrorchangePasswordByUser(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRolePermissions method
            * override this method for handling normal response from getRolePermissions operation
            */
           public void receiveResultgetRolePermissions(
                    org.wso2.carbon.user.mgt.UserAdminStub.UIPermissionNode result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRolePermissions operation
           */
            public void receiveErrorgetRolePermissions(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRolesOfUser method
            * override this method for handling normal response from getRolesOfUser operation
            */
           public void receiveResultgetRolesOfUser(
                    org.wso2.carbon.user.mgt.UserAdminStub.FlaggedName[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRolesOfUser operation
           */
            public void receiveErrorgetRolesOfUser(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getUserStoreInfo method
            * override this method for handling normal response from getUserStoreInfo operation
            */
           public void receiveResultgetUserStoreInfo(
                    org.wso2.carbon.user.mgt.UserAdminStub.UserStoreInfo result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUserStoreInfo operation
           */
            public void receiveErrorgetUserStoreInfo(java.lang.Exception e) {
            }
                


    }
    