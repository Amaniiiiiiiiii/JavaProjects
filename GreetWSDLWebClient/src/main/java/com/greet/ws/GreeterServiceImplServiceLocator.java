/**
 * GreeterServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.greet.ws;

public class GreeterServiceImplServiceLocator extends org.apache.axis.client.Service implements com.greet.ws.GreeterServiceImplService {

    public GreeterServiceImplServiceLocator() {
    }


    public GreeterServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GreeterServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GreeterServiceImpl
    private java.lang.String GreeterServiceImpl_address = "http://localhost:8081/GreetWSDLWeb/services/GreeterServiceImpl";

    public java.lang.String getGreeterServiceImplAddress() {
        return GreeterServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GreeterServiceImplWSDDServiceName = "GreeterServiceImpl";

    public java.lang.String getGreeterServiceImplWSDDServiceName() {
        return GreeterServiceImplWSDDServiceName;
    }

    public void setGreeterServiceImplWSDDServiceName(java.lang.String name) {
        GreeterServiceImplWSDDServiceName = name;
    }

    public com.greet.ws.GreeterServiceImpl getGreeterServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GreeterServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGreeterServiceImpl(endpoint);
    }

    public com.greet.ws.GreeterServiceImpl getGreeterServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.greet.ws.GreeterServiceImplSoapBindingStub _stub = new com.greet.ws.GreeterServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getGreeterServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGreeterServiceImplEndpointAddress(java.lang.String address) {
        GreeterServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.greet.ws.GreeterServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.greet.ws.GreeterServiceImplSoapBindingStub _stub = new com.greet.ws.GreeterServiceImplSoapBindingStub(new java.net.URL(GreeterServiceImpl_address), this);
                _stub.setPortName(getGreeterServiceImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GreeterServiceImpl".equals(inputPortName)) {
            return getGreeterServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.greet.com", "GreeterServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.greet.com", "GreeterServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GreeterServiceImpl".equals(portName)) {
            setGreeterServiceImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
