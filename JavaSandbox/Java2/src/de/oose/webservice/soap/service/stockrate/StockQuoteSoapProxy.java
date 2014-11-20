package de.oose.webservice.soap.service.stockrate;

public class StockQuoteSoapProxy implements de.oose.webservice.soap.service.stockrate.StockQuoteSoap {
  private String _endpoint = null;
  private de.oose.webservice.soap.service.stockrate.StockQuoteSoap stockQuoteSoap = null;
  
  public StockQuoteSoapProxy() {
    _initStockQuoteSoapProxy();
  }
  
  public StockQuoteSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initStockQuoteSoapProxy();
  }
  
  private void _initStockQuoteSoapProxy() {
    try {
      stockQuoteSoap = (new de.oose.webservice.soap.service.stockrate.StockQuoteLocator()).getStockQuoteSoap();
      if (stockQuoteSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)stockQuoteSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)stockQuoteSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (stockQuoteSoap != null)
      ((javax.xml.rpc.Stub)stockQuoteSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public de.oose.webservice.soap.service.stockrate.StockQuoteSoap getStockQuoteSoap() {
    if (stockQuoteSoap == null)
      _initStockQuoteSoapProxy();
    return stockQuoteSoap;
  }
  
  public java.lang.String getQuote(java.lang.String symbol) throws java.rmi.RemoteException{
    if (stockQuoteSoap == null)
      _initStockQuoteSoapProxy();
    return stockQuoteSoap.getQuote(symbol);
  }
  
  
}