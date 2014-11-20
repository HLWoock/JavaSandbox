/**
 * StockQuote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.oose.webservice.soap.service.stockrate;

public interface StockQuote extends javax.xml.rpc.Service {
    public java.lang.String getStockQuoteSoapAddress();

    public de.oose.webservice.soap.service.stockrate.StockQuoteSoap getStockQuoteSoap() throws javax.xml.rpc.ServiceException;

    public de.oose.webservice.soap.service.stockrate.StockQuoteSoap getStockQuoteSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
