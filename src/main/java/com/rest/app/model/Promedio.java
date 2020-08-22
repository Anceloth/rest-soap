package com.rest.app.model;

import java.util.List;

public class Promedio {
	
	private List<Double> numeros;
	
	public Promedio() {
	}

	@Override
	public String toString() {
		return "Promedio [numeros=" + numeros + "]";
	}

	public List<Double> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<Double> numeros) {
		this.numeros = numeros;
	}

}
