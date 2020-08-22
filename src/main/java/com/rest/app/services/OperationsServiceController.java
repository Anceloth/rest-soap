package com.rest.app.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.app.model.Pendiente;
import com.rest.app.model.Promedio;
import com.rest.app.usecase.UseCaseOperacionesClient2;
import com.rest.app.model.AreaCirculo;
import com.rest.app.model.AreaTriangulo;

@RestController
public class OperationsServiceController {
	
	private Logger LOG = LoggerFactory.getLogger(OperationsServiceController.class);
	
	//Operacion operacion = new OperacionImpl();
	@Autowired
	UseCaseOperacionesClient2 operacion; 
	
	@RequestMapping(value = "/pendiente", method = RequestMethod.POST,consumes="application/json")
	public ResponseEntity<Object> calcularPendiente(@RequestBody Pendiente pendiente){
		LOG.debug("Datos para calcular pendiente: {}", pendiente);
		System.out.println("Datos para calcular pendiente: {}" + pendiente);
		return new ResponseEntity<>("resultado pendiente= "+operacion.calcular("pendiente", pendiente), HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/promedio", method = RequestMethod.POST)
	public ResponseEntity<Object> calcularPromedio(@RequestBody Promedio promedio){	
		System.out.println("Datos para calcular promedio: {}" + promedio);
		return new ResponseEntity<>("resultado promedio= "+operacion.calcular("promedio", promedio), HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/areaCirculo", method = RequestMethod.POST)
	public ResponseEntity<Object> calcularAreaCirculo(@RequestBody AreaCirculo areaCirculo){
		System.out.println("Datos para calcular areaCirculo: {}" + areaCirculo);
		return new ResponseEntity<>("resultado areaCirculo= "+operacion.calcular("areaCirculo", areaCirculo), HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/areaTriangulo", method = RequestMethod.POST)
	public ResponseEntity<Object> calcularAreaTriangulo(@RequestBody AreaTriangulo areaTriangulo){
		System.out.println("Datos para calcular areaTriangulo: {}" + areaTriangulo);
		return new ResponseEntity<>("resultado areaTriangulo= "+operacion.calcular("areaTriangulo", areaTriangulo), HttpStatus.OK);
		
	}
	

}
