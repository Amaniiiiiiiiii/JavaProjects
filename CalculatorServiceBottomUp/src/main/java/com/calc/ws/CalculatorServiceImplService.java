/**
 * CalculatorServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.calc.ws;

public interface CalculatorServiceImplService extends javax.xml.rpc.Service {
    public java.lang.String getCalculatorServiceImplAddress();

    public com.calc.ws.CalculatorServiceImpl getCalculatorServiceImpl() throws javax.xml.rpc.ServiceException;

    public com.calc.ws.CalculatorServiceImpl getCalculatorServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
