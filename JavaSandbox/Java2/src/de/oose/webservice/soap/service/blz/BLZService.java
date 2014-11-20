/**
 * BLZService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.oose.webservice.soap.service.blz;

import java.net.URL;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface BLZService extends Service {
    public String getBLZServiceSOAP11port_httpAddress();

    public BLZServicePortType getBLZServiceSOAP11port_http() throws ServiceException;

    public BLZServicePortType getBLZServiceSOAP11port_http(URL portAddress) throws ServiceException;
}
