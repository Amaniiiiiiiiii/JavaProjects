package com.calc.ws;

public class CalculatorServiceImplProxy implements com.calc.ws.CalculatorServiceImpl {
  private String _endpoint = null;
  private com.calc.ws.CalculatorServiceImpl calculatorServiceImpl = null;
  
  public CalculatorServiceImplProxy() {
    _initCalculatorServiceImplProxy();
  }
  
  public CalculatorServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculatorServiceImplProxy();
  }
  
  private void _initCalculatorServiceImplProxy() {
    try {
      calculatorServiceImpl = (new com.calc.ws.CalculatorServiceImplServiceLocator()).getCalculatorServiceImpl();
      if (calculatorServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculatorServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculatorServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculatorServiceImpl != null)
      ((javax.xml.rpc.Stub)calculatorServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.calc.ws.CalculatorServiceImpl getCalculatorServiceImpl() {
    if (calculatorServiceImpl == null)
      _initCalculatorServiceImplProxy();
    return calculatorServiceImpl;
  }
  
  public double add(int x, int y) throws java.rmi.RemoteException{
    if (calculatorServiceImpl == null)
      _initCalculatorServiceImplProxy();
    return calculatorServiceImpl.add(x, y);
  }
  
  
}