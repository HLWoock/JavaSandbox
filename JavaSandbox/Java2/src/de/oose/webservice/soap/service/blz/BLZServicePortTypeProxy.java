package de.oose.webservice.soap.service.blz;

public class BLZServicePortTypeProxy implements de.oose.webservice.soap.service.blz.BLZServicePortType {
  private String _endpoint = null;
  private de.oose.webservice.soap.service.blz.BLZServicePortType bLZServicePortType = null;
  
  public BLZServicePortTypeProxy() {
    _initBLZServicePortTypeProxy();
  }
  
  public BLZServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initBLZServicePortTypeProxy();
  }
  
  private void _initBLZServicePortTypeProxy() {
    try {
      bLZServicePortType = (new de.oose.webservice.soap.service.blz.BLZServiceLocator()).getBLZServiceSOAP11port_http();
      if (bLZServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bLZServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bLZServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bLZServicePortType != null)
      ((javax.xml.rpc.Stub)bLZServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public de.oose.webservice.soap.service.blz.BLZServicePortType getBLZServicePortType() {
    if (bLZServicePortType == null)
      _initBLZServicePortTypeProxy();
    return bLZServicePortType;
  }
  
  public de.oose.webservice.soap.service.blz.DetailsType getBank(java.lang.String blz) throws java.rmi.RemoteException{
    if (bLZServicePortType == null)
      _initBLZServicePortTypeProxy();
    return bLZServicePortType.getBank(blz);
  }
  
  
}