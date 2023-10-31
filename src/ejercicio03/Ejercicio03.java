package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		float cantidadComida;
		int numeroAnimales;
		float animalesComen;
		float racion;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		/*
		 * 
		 * Se le pedira al usuario: 
		 * - Cantidad de comida animales
		 * - Cantidad de animales
		 * - Kilos de comida que comen todos los animales diariamente
		 * 
		 */

		System.out.println("¿Cuanta cantidad de comida has comprado? (en kg)");
		cantidadComida = sc.nextInt();

		System.out.println("¿Cuantos animales hay en la granja?");
		numeroAnimales = sc.nextInt();
		
		System.out.println("¿Cuantos kilos de comida comen todos los animales en total?");
		System.out.println("Total de animales: " + numeroAnimales);
		animalesComen = sc.nextInt();
		
		if (numeroAnimales <= 0) {
			System.out.println("no u");
		} else {
			if (cantidadComida >= animalesComen) {
				System.out.println("Hay suficiente comida");
			} else {
				System.out.println("No hay suficiente comida, por lo que se dividira la comida");
				racion = cantidadComida/numeroAnimales;
				System.out.println("Teniendo un total de " + numeroAnimales + " animales, habra que usar " + racion + "kg de comida por cada animal.");
			}
		}

		// Cierra el Scanner
		sc.close();

	}

}
