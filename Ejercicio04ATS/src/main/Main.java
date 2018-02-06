package main;

import java.util.Scanner;

import atleta.Atleta;

/**
 * Construir un programa para una competencia de atletismo, el programa debe
 * gestionar una serie de atletas caracterizados por su numero de atleta, nombre
 * y tiempo de la carrera. Al final el programa debe mostrar los datos del
 * atleta ganador de la carrera
 * 
 * @author Adrian Stan
 *
 */

public class Main {

	public static int atletaMasRapido(Atleta atleta[]) {
		int indice = 0;
		double tiempo;
		
		tiempo = atleta[0].getTiempo();
		for (int i = 1; i < atleta.length; i++) {
			if(atleta[i].getTiempo() < tiempo)
				tiempo = atleta[i].getTiempo();
			indice = i;			
		}
		return indice;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cantidadAtleta, numeroAtleta, indiceAtletaMasRapido;
		String nombre;
		double tiempo;

		System.out.println("\n*** Competencia atletismo ***");
		System.out.println("---                          ---");
		System.out.print("Cuantos atletas quieres apuntar? ");
		cantidadAtleta = sc.nextInt();
		// creamos los objetos para los atletas
		Atleta atleta[] = new Atleta[cantidadAtleta];
		
		for (int i = 0; i < atleta.length; i++) {
			sc.nextLine();
			System.out.print("\nIntroduzca el nombre del " + (i+1) + " atleta: ");
			nombre = sc.nextLine();
			System.out.print("Introduzca el numero del " + (i+1) + " atleta: ");
			numeroAtleta = sc.nextInt();			
			System.out.print("Introduzca el tiempo del " + (i+1) + " atleta: ");
			tiempo = sc.nextDouble();

			// creamos cada atleta
			atleta[i] = new Atleta(numeroAtleta, nombre, tiempo);
		}
		indiceAtletaMasRapido = atletaMasRapido(atleta);
		
		System.out.println("\nEl atleta mas rapido es: ");
		System.out.println(atleta[indiceAtletaMasRapido].mostrarDatos());
		
	}

	
	
	
}
