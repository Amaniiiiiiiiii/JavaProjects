/**
 * GreeterServiceImplSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.greet.ws;

public class GreeterServiceImplSoapBindingSkeleton implements com.greet.ws.GreeterServiceImpl, org.apache.axis.wsdl.Skeleton {
    private com.greet.ws.GreeterServiceImpl impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.greet.com", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("welcomeUser", _params, new javax.xml.namespace.QName("http://ws.greet.com", "welcomeUserReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ws.greet.com", "welcomeUser"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("welcomeUser") == null) {
            _myOperations.put("welcomeUser", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("welcomeUser")).add(_oper);
    }

    public GreeterServiceImplSoapBindingSkeleton() {
        this.impl = new com.greet.ws.GreeterServiceImplSoapBindingImpl();
    }

    public GreeterServiceImplSoapBindingSkeleton(com.greet.ws.GreeterServiceImpl impl) {
        this.impl = impl;
    }
    public java.lang.String welcomeUser(java.lang.String name) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.welcomeUser(name);
        return ret;
    }

}
