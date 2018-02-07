package com.ats.personas;

public class Futbolista extends Persona{
	
	private int dorsal;
	private String posicion;
	
	public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion) {
		super(nombre, apellido, edad);
		this.dorsal = dorsal;
		this.posicion = posicion;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Futbolista: \n" + super.toString() + "\nDorsal: " + dorsal + "\nPosicion=" + posicion;
	}
	
	
	
	

}
