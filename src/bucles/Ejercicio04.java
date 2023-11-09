package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Ejemplos:
 * 
 * numeroA: 6 | numeroB: 9 | Esperaba: MCD = 3 | Resultado: MCD = 3
 * 
 * numeroA: 8 | numeroB: 12 | Esperaba: MCD = 4 | Resultado: MCD = 4
 * 
 * numeroA: -8 | numeroB: 12 | Esperaba: Menor que 1 | Resultado: Menor que 1
 * 
 */

public class Ejercicio04 {

	public static void main(String[] args) {

		// numeroA: primer numero pedido al usuario
		int numeroA=0;

		// numeroB: segundo numero pedido al usuario
		int numeroB=0;

		// numeroMenor: el numero mas pequeño entre numeroA y numeroB
		int numeroMenor;

		// resultado: resultado final: MCD de numeroA y numeroB
		int resultado = 0;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario dos numeros
		do {

			try {
				System.out.println("Inserta un numero");
				numeroA = sc.nextInt();
				if (numeroA < 1) {
					System.out.println("Dato introducido menor que 1");
				}
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

		// If: Se revisara cual numero es menor, y el numero menor se asignara a la
		// variable numeroMenor
		if (numeroA < numeroB) {
			numeroMenor = numeroA;
		} else {
			numeroMenor = numeroB;
		} // Fin If

		// For: i sera numeroMenor, debera ser mayor o igual a 1, y se ira restando 1 en
		// cada iteracion
		for (int i = numeroMenor; i >= 1; i--) {

			// If-For: el resto de cada numero entre i debera ser 0 para hallar el MCD
			if (numeroA % i == 0 && numeroB % i == 0) {
				resultado = i;
				break;
			} // Fin If-For

		} // Fin For

		// Muestra el resultado por pantalla
		System.out.println("MCD de " + numeroA + " y " + numeroB + " = " + resultado);

		// Cierra el Scanner
		sc.close();

	}

}
