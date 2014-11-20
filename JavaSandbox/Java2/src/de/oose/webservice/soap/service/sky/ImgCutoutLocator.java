/**
 * ImgCutoutLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.oose.webservice.soap.service.sky;

public class ImgCutoutLocator extends org.apache.axis.client.Service implements de.oose.webservice.soap.service.sky.ImgCutout {

/**
 * This is an <b>XML Web Service</b> interface to fetch <b>JPEG</b>
 * image cutouts from the <b>SDSS </b> image archive.<br>Send comments
 * to <b>Maria Nieto-Santisteban</b> -- nieto@pha.jhu.edu
 */

    public ImgCutoutLocator() {
    }


    public ImgCutoutLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ImgCutoutLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ImgCutoutSoap
    private java.lang.String ImgCutoutSoap_address = "http://casjobs.sdss.org/ImgCutoutDR4/imgcutout.asmx";

    public java.lang.String getImgCutoutSoapAddress() {
        return ImgCutoutSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ImgCutoutSoapWSDDServiceName = "ImgCutoutSoap";

    public java.lang.String getImgCutoutSoapWSDDServiceName() {
        return ImgCutoutSoapWSDDServiceName;
    }

    public void setImgCutoutSoapWSDDServiceName(java.lang.String name) {
        ImgCutoutSoapWSDDServiceName = name;
    }

    public de.oose.webservice.soap.service.sky.ImgCutoutSoap getImgCutoutSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ImgCutoutSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getImgCutoutSoap(endpoint);
    }

    public de.oose.webservice.soap.service.sky.ImgCutoutSoap getImgCutoutSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            de.oose.webservice.soap.service.sky.ImgCutoutSoapStub _stub = new de.oose.webservice.soap.service.sky.ImgCutoutSoapStub(portAddress, this);
            _stub.setPortName(getImgCutoutSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setImgCutoutSoapEndpointAddress(java.lang.String address) {
        ImgCutoutSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (de.oose.webservice.soap.service.sky.ImgCutoutSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                de.oose.webservice.soap.service.sky.ImgCutoutSoapStub _stub = new de.oose.webservice.soap.service.sky.ImgCutoutSoapStub(new java.net.URL(ImgCutoutSoap_address), this);
                _stub.setPortName(getImgCutoutSoapWSDDServiceName());
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
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ImgCutoutSoap".equals(inputPortName)) {
            return getImgCutoutSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://skyserver.sdss.org/", "ImgCutout");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://skyserver.sdss.org/", "ImgCutoutSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ImgCutoutSoap".equals(portName)) {
            setImgCutoutSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
