/**
 * GreeterServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.greet.ws;

public interface GreeterServiceImplService extends javax.xml.rpc.Service {
    public java.lang.String getGreeterServiceImplAddress();

    public com.greet.ws.GreeterServiceImpl getGreeterServiceImpl() throws javax.xml.rpc.ServiceException;

    public com.greet.ws.GreeterServiceImpl getGreeterServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
