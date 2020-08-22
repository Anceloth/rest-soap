package com.rest.app.soap.client;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.stereotype.Component;

import com.conseres.ws.soap.endpoints.OperacionesWS;
import com.conseres.ws.soap.endpoints.OperacionesWSService;

@Component
public class Client2 {
	
	private OperacionesWSService service;
	private OperacionesWS operacionesWSPort;
	
	public Client2(){
		try {
			this.service = new OperacionesWSService(new URL("http://localhost:8080/hellowebservice-2/operaciones?wsdl"));
			this.operacionesWSPort = service.getOperacionesWSPort();
		}catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	
	public Double dividirSoapService(double x,double y) {
		return operacionesWSPort.division(x, y);
	}
	
	public Double sumarSoapService(double x,double y) {
		return operacionesWSPort.suma(x, y);
	}
	public Double restarSoapService(double x,double y) {
		return operacionesWSPort.resta(x, y);
	}
	public Double multiplicarSoapService(double x,double y) {
		return operacionesWSPort.multiplicacion(x, y);
	}
	
	public OperacionesWSService getService() {
		return service;
	}

	public OperacionesWS getOperacionesWSPort() {
		return operacionesWSPort;
	}

}
