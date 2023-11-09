package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 
 * numero: 11, 33, 22, 0 | Esperaba: 3 Numeros, 1 Error | Resultado: 3 Numeros, 1 Error
 * 
 * numero: bbb | Esperaba: Dato introducido invalido | Resultado: Dato introducido invalido
 * 
 */

public class Ejercicio08 {

	public static void main(String[] args) {

		// numero: respectivos numeros introducidos por el usuario
		int numero = -1;

		// numeroMayor:
		int numeroMayor = 1;

		// numerosFallados
		int numerosFallados = 0;

		// numerosTotales
		int numerosTotales = 0;

		// esNumero
		boolean esNumero = true;

		// Abre el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario un numero (y asegurate de que no sea decimal)

		// Try catch: el numero mientras no sea un numero, repetira esta secuencia.
		do {
			try {
				System.out.println("Inserta un numero");
				numero = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Dato introducido invalido");
				sc.nextLine();
				esNumero = false;
				numero = -88888889;
			} finally {
				// -88888888 es un numero ejemplo para establecer un minimo para que no sea un
				// esNumero = false permanente
				if (numero > -88888888) {
					esNumero = true;
				}
			}
		} while (esNumero == false);

		// While: Mientras el numero no sea 0...

		// Si numero es mayor que numeroMayor, numeroMayor pasara a ser numero
		// Si numero es menor que numeroMayor, se le informara que el numero debe ser
		// menor, y se sumara 1 a numerosFallados
		// Despues, se sumara 1 a numerosTotales y se le volvera a pedir un numero
		while (numero != 0) {

			if (numero > numeroMayor) {
				numeroMayor = numero;
			} else {
				System.out.println("Error: El numero es menor que el anterior");
				numerosFallados++;
			}
			numerosTotales++;
			do {
				try {
					System.out.println("Inserta un numero");
					numero = sc.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Dato introducido invalido");
					sc.nextLine();
					esNumero = false;
					numero = -88888889;
				} finally {
					if (numero > -88888888) {
						esNumero = true;
					}
				}
			} while (esNumero == false);

		} // Fin While

		// Muestra los numeros introducidos y numeros fallados
		System.out.println("Total de numeros introducidos: " + numerosTotales);
		System.out.println("Numeros fallados: " + numerosFallados);

		// Cierra el Scanner
		sc.close();

	}

}
