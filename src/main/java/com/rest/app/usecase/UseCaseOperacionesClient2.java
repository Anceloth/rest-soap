package com.rest.app.usecase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rest.app.model.AreaCirculo;
import com.rest.app.model.AreaTriangulo;
import com.rest.app.model.Pendiente;
import com.rest.app.model.Promedio;
import com.rest.app.soap.client.Client2;

@Component
public class UseCaseOperacionesClient2 implements UseCase{
	Logger LOG = LoggerFactory.getLogger(UseCaseOperacionesClient2.class);
	
	@Autowired
	private Client2 cliente; //= new Client2(); 
	
	public Double calcular(String tipoOperacion,Object object) {
		if(tipoOperacion.equals("pendiente")) {
			Double result;
			Pendiente pendiente= (Pendiente) object;
			LOG.debug("Objeto para calcular pendiente: {}",pendiente);
			System.out.println("Objeto para calcular pendiente: {}" + pendiente);
			result = cliente.restarSoapService(pendiente.getY2(), pendiente.getY1())/
					cliente.restarSoapService(pendiente.getX2(), pendiente.getX1());
			return result;					
		}else if(tipoOperacion.equals("promedio")) {
			Double result = 0.0;
			Promedio promedio = (Promedio) object;
			for(Double num:promedio.getNumeros()) {
				result = cliente.sumarSoapService(result, num);
			}
			result = cliente.dividirSoapService(result, (double) promedio.getNumeros().size());
			return result;
			
		}else if (tipoOperacion.equals("areaCirculo")) {
			Double result;
			AreaCirculo areaCirculo = (AreaCirculo) object;
			result = cliente.multiplicarSoapService(areaCirculo.getPi(),(cliente.multiplicarSoapService(areaCirculo.getRadio(),areaCirculo.getRadio())));
			return result;
		}else if(tipoOperacion.equals("areaTriangulo")) {
			Double result;
			AreaTriangulo areaTriangulo = (AreaTriangulo) object;
			result = cliente.dividirSoapService(cliente.multiplicarSoapService(areaTriangulo.getBase(), areaTriangulo.getAltura()),2.0);
			return result;
		}else {
			return null;
		}
	}

}
