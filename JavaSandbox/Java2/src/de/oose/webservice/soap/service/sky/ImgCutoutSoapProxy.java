package de.oose.webservice.soap.service.sky;

public class ImgCutoutSoapProxy implements de.oose.webservice.soap.service.sky.ImgCutoutSoap {
  private String _endpoint = null;
  private de.oose.webservice.soap.service.sky.ImgCutoutSoap imgCutoutSoap = null;
  
  public ImgCutoutSoapProxy() {
    _initImgCutoutSoapProxy();
  }
  
  public ImgCutoutSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initImgCutoutSoapProxy();
  }
  
  private void _initImgCutoutSoapProxy() {
    try {
      imgCutoutSoap = (new de.oose.webservice.soap.service.sky.ImgCutoutLocator()).getImgCutoutSoap();
      if (imgCutoutSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)imgCutoutSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)imgCutoutSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (imgCutoutSoap != null)
      ((javax.xml.rpc.Stub)imgCutoutSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public de.oose.webservice.soap.service.sky.ImgCutoutSoap getImgCutoutSoap() {
    if (imgCutoutSoap == null)
      _initImgCutoutSoapProxy();
    return imgCutoutSoap;
  }
  
  public java.lang.String[] revisions() throws java.rmi.RemoteException{
    if (imgCutoutSoap == null)
      _initImgCutoutSoapProxy();
    return imgCutoutSoap.revisions();
  }
  
  public byte[] getJpeg(double ra_, double dec_, double scale_, int width_, int height_, java.lang.String opt_) throws java.rmi.RemoteException{
    if (imgCutoutSoap == null)
      _initImgCutoutSoapProxy();
    return imgCutoutSoap.getJpeg(ra_, dec_, scale_, width_, height_, opt_);
  }
  
  public byte[] getJpegQuery(double ra_, double dec_, double scale_, int width_, int height_, java.lang.String opt_, java.lang.String query_) throws java.rmi.RemoteException{
    if (imgCutoutSoap == null)
      _initImgCutoutSoapProxy();
    return imgCutoutSoap.getJpegQuery(ra_, dec_, scale_, width_, height_, opt_, query_);
  }
  
  public void dimeJpeg(double ra_, double dec_, double scale_, int width_, int height_, java.lang.String opt_) throws java.rmi.RemoteException{
    if (imgCutoutSoap == null)
      _initImgCutoutSoapProxy();
    imgCutoutSoap.dimeJpeg(ra_, dec_, scale_, width_, height_, opt_);
  }
  
  
}