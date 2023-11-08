package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Ejemplos:
 * 
 * numeroA: 6 | numeroB: 8 | Esperaba: MCM = 24 | Resultado: MCM = 24
 * 
 * numeroA: 3 | numeroB: 4 | Esperaba: MCM = 12 | Resultado: MCM = 12
 * 
 * numeroA: -8 | numeroB: 4 | Esperaba: Sin Respuesta | Resultado: Sin Respuesta
 * 
 */

public class Ejercicio05 {

	public static void main(String[] args) {

		// numeroA: primer numero pedido al usuario
		int numeroA=0;

		// numeroB: segundo numero pedido al usuario
		int numeroB=0;

		// numeroMayor: el numero mas grande entre numeroA y numeroB
		int numeroMayor;

		// resultado: resultado final: MCM de numeroA y numeroB
		int resultado = 0;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario dos numeros
		do {

			try {
				System.out.println("Inserta un numero");
				numeroA = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Dato introducido invalido");
				sc.nextLine();
			}

		} while (numeroA < 1);

		do {

			try {
				System.out.println("Inserta otro numero");
				numeroB = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Dato introducido invalido");
				sc.nextLine();
			}

		} while (numeroB < 1);

		// If: Se revisara cual numero es mayor, y el numero mayor se asignara a la
		// variable numeroMayor
		if (numeroA > numeroB) {
			numeroMayor = numeroA;
		} else {
			numeroMayor = numeroB;
		} // Fin If

		// For: i sera numeroMayor, sin condiciones, y se ira sumando 1 en cada
		// iteracion
		for (int i = numeroMayor;; i++) {

			// If-For: el resto de i entre cada numero debera ser 0 para hallar el MCM
			if (i % numeroA == 0 && i % numeroB == 0) {
				resultado = i;
				break;
			} // Fin If-For

		} // Fin For

		// Muestra el resultado por pantalla
		System.out.println("MCM de " + numeroA + " y " + numeroB + " = " + resultado);

		// Cierra el Scanner
		sc.close();

	}

}
