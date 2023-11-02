package condicionales;

import java.util.Scanner;

/*
 * Ejemplo:
 * 
 * cantidadComida: 350, numeroAnimales: 0, animalesComen: 300 | Esperaba: ERROR | Resultado: ERROR
 * 
 * cantidadComida: 350, numeroAnimales: 3, animalesComen: 300 | Esperaba: HAY COMIDA PARA TODOS | Resultado: HAY COMIDA PARA TODOS
 * 
 * cantidadComida: 250, numeroAnimales: 3, animalesComen: 300 | Esperaba: NO HAY COMIDA PARA TODOS, 83.3kg/animal | Resultado: NO HAY COMIDA PARA TODOS, 83.3kg/animal
 * 
 */

public class Ejercicio03 {

	public static void main(String[] args) {

		// cantidadComida: cantidad en kg de comida comprada en total
		float cantidadComida;

		// numeroAnimales: nº de animales que hay en la granja
		int numeroAnimales;

		// animalesComen: cantidad en kg que comen todos los animales
		float animalesComen;

		// racion: cantidad de comida entre nº de animales cuando no hay suficiente para
		// todos
		float racion;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		/*
		 * 
		 * Se le pedira al usuario: - Cantidad de comida animales - Cantidad de animales
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

		// If 1: Si el nº de animales es 0 o menor, el programa no continuara
		// If 1.1: De lo contrario, se revisara si la cantidad de comida es mayor o
		// igual a la cantidad que comen entre todos.
		if (numeroAnimales <= 0) {
			System.out.println("No hay animales");
		} else {
			if (cantidadComida >= animalesComen) {
				
				// Hay comida
				System.out.println("Hay suficiente comida");
			
			} else {
				
				// No hay comida, pero tampoco dinero, por lo que se dividira la comida entre nº
				// de animales
				System.out.println("No hay suficiente comida, por lo que se dividira la comida");
				racion = cantidadComida / numeroAnimales;
				System.out.println("Teniendo un total de " + numeroAnimales + " animales, habra que usar " + racion
						+ "kg de comida por cada animal.");
			
			} // Fin If 1.1
		} // Fin If 1

		// Cierra el Scanner
		sc.close();

	}

}
