package com.ats.poligono;

public abstract class Poligono {
	
	protected int numeroLados;

	public Poligono(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	@Override
	public String toString() {
		return "Numero lados = " + numeroLados ;
	}

	//declaramos el metodo area como abstracto
	public abstract double area();
	
	
	

}
