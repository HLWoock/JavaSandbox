/**
 * BLZServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.oose.webservice.soap.service.blz;

public class BLZServiceLocator extends org.apache.axis.client.Service implements de.oose.webservice.soap.service.blz.BLZService {

    public BLZServiceLocator() {
    }


    public BLZServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BLZServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BLZServiceSOAP11port_http
    private String BLZServiceSOAP11port_http_address = "http://www.thomas-bayer.com:80/axis2/services/BLZService";

    public String getBLZServiceSOAP11port_httpAddress() {
        return BLZServiceSOAP11port_http_address;
    }

    // The WSDD service name defaults to the port name.
    private String BLZServiceSOAP11port_httpWSDDServiceName = "BLZServiceSOAP11port_http";

    public String getBLZServiceSOAP11port_httpWSDDServiceName() {
        return BLZServiceSOAP11port_httpWSDDServiceName;
    }

    public void setBLZServiceSOAP11port_httpWSDDServiceName(String name) {
        BLZServiceSOAP11port_httpWSDDServiceName = name;
    }

    public de.oose.webservice.soap.service.blz.BLZServicePortType getBLZServiceSOAP11port_http() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BLZServiceSOAP11port_http_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBLZServiceSOAP11port_http(endpoint);
    }

    public de.oose.webservice.soap.service.blz.BLZServicePortType getBLZServiceSOAP11port_http(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            de.oose.webservice.soap.service.blz.BLZServiceSOAP11BindingStub _stub = new de.oose.webservice.soap.service.blz.BLZServiceSOAP11BindingStub(portAddress, this);
            _stub.setPortName(getBLZServiceSOAP11port_httpWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBLZServiceSOAP11port_httpEndpointAddress(String address) {
        BLZServiceSOAP11port_http_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (de.oose.webservice.soap.service.blz.BLZServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                de.oose.webservice.soap.service.blz.BLZServiceSOAP11BindingStub _stub = new de.oose.webservice.soap.service.blz.BLZServiceSOAP11BindingStub(new java.net.URL(BLZServiceSOAP11port_http_address), this);
                _stub.setPortName(getBLZServiceSOAP11port_httpWSDDServiceName());
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
        String inputPortName = portName.getLocalPart();
        if ("BLZServiceSOAP11port_http".equals(inputPortName)) {
            return getBLZServiceSOAP11port_http();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://thomas-bayer.com/blz/", "BLZService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://thomas-bayer.com/blz/", "BLZServiceSOAP11port_http"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("BLZServiceSOAP11port_http".equals(portName)) {
            setBLZServiceSOAP11port_httpEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
