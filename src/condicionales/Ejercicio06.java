package condicionales;

import java.util.Random;
import java.util.Scanner;

/*
 * Ejemplo:
 * 
 * numeroAleatorio1: 95, numeroAleatorio2: 83, respuesta: 178 | Esperaba: Correcto | Resultado: Correcto
 * 
 * numeroAleatorio1: 86, numeroAleatorio2: 70, respuesta: 44 | Esperaba: Incorrecto | Resultado: Incorrecto
 * 
 */

public class Ejercicio06 {

	public static void main(String[] args) {

		// Inicia el Random (generador de numeros aleatorios)
		Random rand = new Random();

		// numeroAleatorio1: numero aleatorio generado por la maquina
		int numeroAleatorio1 = rand.nextInt(100) + 1;

		// numeroAleatorio2: numero aleatorio generado por la maquina
		int numeroAleatorio2 = rand.nextInt(100) + 1;

		// respuesta: respuesta que introducira el usuario
		int respuesta;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario el resultado de la suma de los dos numeros aleatorios y
		// registralo en respuesta
		System.out.println("¿Cuanto es " + numeroAleatorio1 + "+" + numeroAleatorio2 + "?");
		respuesta = sc.nextInt();

		// If: Si la respuesta es la suma de los dos numeros aleatorios, te dira que es
		// correcto
		if (respuesta == (numeroAleatorio1 + numeroAleatorio2)) {
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		} // Fin If

		// Cierra el Scanner
		sc.close();

	}

}
