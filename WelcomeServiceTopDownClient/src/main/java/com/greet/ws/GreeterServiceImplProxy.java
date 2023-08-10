package com.greet.ws;

public class GreeterServiceImplProxy implements com.greet.ws.GreeterServiceImpl {
  private String _endpoint = null;
  private com.greet.ws.GreeterServiceImpl greeterServiceImpl = null;
  
  public GreeterServiceImplProxy() {
    _initGreeterServiceImplProxy();
  }
  
  public GreeterServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initGreeterServiceImplProxy();
  }
  
  private void _initGreeterServiceImplProxy() {
    try {
      greeterServiceImpl = (new com.greet.ws.GreeterServiceImplServiceLocator()).getGreeterServiceImpl();
      if (greeterServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)greeterServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)greeterServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (greeterServiceImpl != null)
      ((javax.xml.rpc.Stub)greeterServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.greet.ws.GreeterServiceImpl getGreeterServiceImpl() {
    if (greeterServiceImpl == null)
      _initGreeterServiceImplProxy();
    return greeterServiceImpl;
  }
  
  public java.lang.String welcomeUser(java.lang.String name) throws java.rmi.RemoteException{
    if (greeterServiceImpl == null)
      _initGreeterServiceImplProxy();
    return greeterServiceImpl.welcomeUser(name);
  }
  
  
}