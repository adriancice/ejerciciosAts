package com.ats.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.ats.poligono.Poligono;
import com.ats.poligono.Rectangulo;
import com.ats.poligono.Triangulo;


public class Main {
	
	static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();
	static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		//llenar poligono
		llenarPoligono();
		
		//mostrar datos y el area de cada poligono
		mostrarResultados();
		
		
		
	}
	
	public static void llenarPoligono() {
		int opcion;
		char respuesta;
		do {
			do {
				System.out.println("Digite que poligono desea: ");
				System.out.println("1.- Triangulo");
				System.out.println("2.- Rectangulo");
				System.out.print("Opcion: ");
				opcion = sc.nextInt();
				
			} while (opcion < 1 || opcion > 2);
			
			switch (opcion) {
			case 1://llenar un triangulo
				llenarTriangulo();
				break;
			case 2://llenar un rectangulo
				llenarRectangulo();
				break;
			}
			System.out.print("\nDesea introducir otro poligono? (s/n): ");
			respuesta = sc.next().charAt(0);
			System.out.println("");
		} while (respuesta == 's' || respuesta == 'S');
	}
	
	public static void llenarTriangulo() {
		double lado1, lado2, lado3;
		System.out.print("Introduzca el lado 1 del triangulo: ");
		lado1 = sc.nextDouble();
		System.out.print("Introduzca el lado 2 del triangulo: ");
		lado2 = sc.nextDouble();
		System.out.print("Introduzca el lado 3 del triangulo: ");
		lado3 = sc.nextDouble();
		
		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
		//guardamos un triangulo dentro de nuestro array de pligonos
		poligonos.add(triangulo);
	}
	
	public static void llenarRectangulo() {
		double lado1, lado2;
		System.out.print("Introduzca el lado 1 del rectangulo: ");
		lado1 = sc.nextDouble();
		System.out.print("Introduzca el lado 2 del rectangulo: ");
		lado2 = sc.nextDouble();
		
		Rectangulo rectangulo = new Rectangulo(lado1, lado2);
		//guardamos un rectangulo en el array de poligonos
		poligonos.add(rectangulo);
	}
	
	public static void mostrarResultados() {
		//recorriendo el array de poligonos + mostrar datos
		for (Poligono poli : poligonos) {
			System.out.println(poli.toString());
			System.out.println("Area: " + poli.area());
			System.out.println("");
		}
	}
}
