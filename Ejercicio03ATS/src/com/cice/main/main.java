package com.cice.main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.cice.vehiculos.Vehiculos;

/**
 * Ejercicio 3: Construir un programa que dada una serie de vehículos
 * caracterizados por su marca, modelo y precio, imprima las propiedades del
 * vehículo más barato. Para ello, se deberán leer por teclado las
 * características de cada vehículo y crear una clase que represente a cada uno
 * de ellos.
 * 
 * @author Adrian Stan
 *
 */

public class main {
	
	public static int indiceCocheMasBarato(Vehiculos coches[]) {
		int precio;
		int indice = 0;
		
		
		precio = coches[0].getPrecio();
		for(int i=1; i < coches.length; i++) {
			if(coches[i].getPrecio() < precio);
			precio = coches[i].getPrecio();
			indice = i;
		}
		return indice;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String marca, modelo;
		int precio, numeroVehiculos, indiceBarato;
		
		
		System.out.print("Introduzca la cantidad de vehiculos: ");
		numeroVehiculos = sc.nextInt();
		
		//creamos los objetos para los coches
		Vehiculos coches[] = new Vehiculos[numeroVehiculos];
		
		for(int i = 0; i < coches.length; i++) {
			sc.nextLine();
			System.out.println("\nIntroduzca las caracteristicas del coche " + (i+1)+ " :");
			System.out.print("Introduzca la marca: ");
			marca = sc.nextLine();
			System.out.print("Introduzca el modelo: ");
			modelo = sc.nextLine();
			System.out.print("Introduzca el precio: ");
			precio = sc.nextInt();
			
			coches[i] = new Vehiculos(marca, modelo, precio);
		}
		sc.close();
		indiceBarato = indiceCocheMasBarato(coches);
		
		System.out.println("\nEl coche mas barato es: ");
		System.out.println(coches[indiceBarato].mostrarDatos());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
