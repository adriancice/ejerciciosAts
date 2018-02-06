package com.cice.vehiculos;

public class Vehiculos {
	
	private String marca;
	private String modelo;
	private int precio;
	
	public Vehiculos() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Vehiculos(String marca, String modelo, int precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public String mostrarDatos() {
		return "Marca: " + marca + "\nModelo: " + modelo + "\nPrecio: " + precio+" €";
	}
	
}
