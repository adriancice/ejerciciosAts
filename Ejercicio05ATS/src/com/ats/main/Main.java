package com.ats.main;

import java.util.Scanner;

import com.ats.triangulo.Triangulo;

/**
 * Ejercicio 5: Diseñar un programa para trabajar con triángulos isósceles. Para
 * ello defina los atributos necesarios que se requieren, proporcione métodos de
 * consulta, un método constructor e implemente métodos para calcular el
 * perímetro y el área de un triángulo, además implementar un método que a
 * partir de un arreglo de triángulos devuelva el área del triángulo de mayor
 * superficie.
 * 
 * @author Adrian Stan
 *
 */
public class Main {
	public static double mayorArea(Triangulo triangulo[]) {
		double area;
		area = triangulo[0].area();
		for (int i = 1; i < triangulo.length; i++) {
			if(triangulo[i].area() > area) {
				area = triangulo[i].area();
			}
		}
		return area;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nTriangulos, baseTriangulo, ladoTriangulo;
		
		System.out.println("<<< Triangulos isosceles >>>\n");
		System.out.print("Cuantos triangulos quieres crear: ");
		nTriangulos = sc.nextInt();
		Triangulo triangulo[] = new Triangulo[nTriangulos];
		
		for (int i = 0; i < triangulo.length; i++) {
			System.out.print("\nIntroduce la base del " + (i+1)+ " triangulo: ");
			baseTriangulo = sc.nextInt();
			System.out.print("Introduce el lado del " + (i+1) + " triangulo: ");
			ladoTriangulo = sc.nextInt();
			
			triangulo[i] = new Triangulo(baseTriangulo, ladoTriangulo);
			
			System.out.println("El perimetro del triangulo es: " + triangulo[i].perimetro());
			System.out.println("El area del triangulo es : " + triangulo[i].area());
		}
		
		
		System.out.println("\nEl area del triangulo con mayor superficie es: " + mayorArea(triangulo));
		
	}

	
	
	
	
	
	
	
	
}
