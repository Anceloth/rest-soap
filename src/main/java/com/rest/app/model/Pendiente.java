package com.rest.app.model;

public class Pendiente{
	
	private Double y1;
	private Double y2;
	private Double x1;
	private Double x2;
	
	public Pendiente() {
		
	}
	
	public Pendiente(Double y1, Double y2, Double x1, Double x2, Double result) {
		super();
		this.y1 = y1;
		this.y2 = y2;
		this.x1 = x1;
		this.x2 = x2;
	}
	
	public Double getY1() {
		return y1;
	}
	public void setY1(Double y1) {
		this.y1 = y1;
	}
	public Double getY2() {
		return y2;
	}
	public void setY2(Double y2) {
		this.y2 = y2;
	}
	public Double getX1() {
		return x1;
	}
	public void setX1(Double x1) {
		this.x1 = x1;
	}
	public Double getX2() {
		return x2;
	}
	public void setX2(Double x2) {
		this.x2 = x2;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pendiente [\ny1=");
		builder.append(y1);
		builder.append(", \ny2=");
		builder.append(y2);
		builder.append(", \nx1=");
		builder.append(x1);
		builder.append(", \nx2=");
		builder.append(x2);
		builder.append("]");
		return builder.toString();
	}
	
}
