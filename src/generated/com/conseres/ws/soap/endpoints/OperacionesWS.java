package com.conseres.ws.soap.endpoints;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2020-07-14T00:05:28.492-04:00
 * Generated source version: 3.2.5
 *
 */
@WebService(targetNamespace = "http://endpoints.soap.ws.conseres.com/", name = "OperacionesWS")
@XmlSeeAlso({ObjectFactory.class})
public interface OperacionesWS {

    @WebMethod(action = "resta")
    @RequestWrapper(localName = "resta", targetNamespace = "http://endpoints.soap.ws.conseres.com/", className = "com.conseres.ws.soap.endpoints.Resta")
    @ResponseWrapper(localName = "restaResponse", targetNamespace = "http://endpoints.soap.ws.conseres.com/", className = "com.conseres.ws.soap.endpoints.RestaResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.Double resta(
        @WebParam(name = "x", targetNamespace = "")
        java.lang.Double x,
        @WebParam(name = "y", targetNamespace = "")
        java.lang.Double y
    );

    @WebMethod(action = "division")
    @RequestWrapper(localName = "division", targetNamespace = "http://endpoints.soap.ws.conseres.com/", className = "com.conseres.ws.soap.endpoints.Division")
    @ResponseWrapper(localName = "divisionResponse", targetNamespace = "http://endpoints.soap.ws.conseres.com/", className = "com.conseres.ws.soap.endpoints.DivisionResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.Double division(
        @WebParam(name = "x", targetNamespace = "")
        java.lang.Double x,
        @WebParam(name = "y", targetNamespace = "")
        java.lang.Double y
    );

    @WebMethod(action = "suma")
    @RequestWrapper(localName = "suma", targetNamespace = "http://endpoints.soap.ws.conseres.com/", className = "com.conseres.ws.soap.endpoints.Suma")
    @ResponseWrapper(localName = "sumaResponse", targetNamespace = "http://endpoints.soap.ws.conseres.com/", className = "com.conseres.ws.soap.endpoints.SumaResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.Double suma(
        @WebParam(name = "x", targetNamespace = "")
        java.lang.Double x,
        @WebParam(name = "y", targetNamespace = "")
        java.lang.Double y
    );

    @WebMethod(action = "multiplicacion")
    @RequestWrapper(localName = "multiplicacion", targetNamespace = "http://endpoints.soap.ws.conseres.com/", className = "com.conseres.ws.soap.endpoints.Multiplicacion")
    @ResponseWrapper(localName = "multiplicacionResponse", targetNamespace = "http://endpoints.soap.ws.conseres.com/", className = "com.conseres.ws.soap.endpoints.MultiplicacionResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.Double multiplicacion(
        @WebParam(name = "x", targetNamespace = "")
        java.lang.Double x,
        @WebParam(name = "y", targetNamespace = "")
        java.lang.Double y
    );
}
