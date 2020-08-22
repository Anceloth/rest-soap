package com.rest.app.soap.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceClient;

import com.conseres.ws.soap.endpoints.OperacionesWS;
import com.conseres.ws.soap.endpoints.OperacionesWSService;
import com.conseres.ws.soap.endpoints.Suma;
import com.conseres.ws.soap.endpoints.SumaResponse;

@WebServiceClient(name = "ClienteOperaciones", 
	wsdlLocation = "http://localhost:8080/hellowebservice-2/operaciones?wsdl",
	targetNamespace = "http://endpoints.soap.ws.conseres.com/")
public class ClienteOperacionesImpl implements ClienteOperacionesInterface{
	
	public final static URL WSDL_LOCATION;
	private static final QName SERVICE_NAME = 
			new QName("http://endpoints.soap.ws.conseres.com/","OperacionesWSService");
	
	static {
        URL url = null;
        try {
        	//url = new URL("file:/home/jonathan/WorkSpace-Pruebas/nexos_bogota/rest/src/main/resources/wsdl/operationsService.wsdl");
            url = new URL("http://localhost:8080/hellowebservice-2/operaciones?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ClienteOperacionesImpl.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/hellowebservice-2/operaciones?wsdl");
        }
        WSDL_LOCATION = url;
    }
	OperacionesWSService ss = new OperacionesWSService(WSDL_LOCATION);
	//OperacionesWSService ss = new OperacionesWSService(WSDL_LOCATION, SERVICE_NAME);
	OperacionesWS port = ss.getOperacionesWSPort();
	
    Double resp;
    
    @Override
	public Double sumarSoapService(Double x,Double y) {
		resp = port.suma(x,y);
		return resp;
	}
	
    @Override
	public Double restarSoapService(Double x,Double y) {
    	resp=1.0;
		//resp = port.resta(x, y);
		return resp;
	}
	
    @Override
	public Double multiplicarSoapService(Double x,Double y) {
		resp = port.multiplicacion(x, y);
		return resp;
	}
	
    @Override
	public Double dividirSoapService(Double x,Double y) {
		resp = port.division(x, y);
		return resp;
	}

}
