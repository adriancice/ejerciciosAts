package com.ats.triangulo;

public class Triangulo {
	
	private int base;
	private int lado;
	
	public Triangulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Triangulo(int base, int lado) {
		this.base = base;
		this.lado = lado;
	}
	
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	
	public double perimetro() {
		double perimetro = 2 * lado + base;
			return perimetro;
	}
	
	public double area() {
		double area = base * Math.sqrt((Math.pow(lado, 2)-(Math.pow(base, 2)/4)))/2;
		return area;
	}
	

	public String mostrarDatos() {
		return "Base: " + base + "\nLado: " + lado + "\nPerimetro: " + perimetro() + "\nArea: " + area();
	}
	 

}
