package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Ejemplo:
 * 
 * numero: 3 |  Esperaba  |   Resultado
 *   
 *              1              1    
 *              121            121
 *              12321          12321
 * 
 * numero: 5 |  Esperaba  |   Resultado
 * 
 *              1              1    
 *              121            121
 *              12321          12321
 *              1234321        1234321
 *              123454321      123454321
 * 
 * numero: -11 | Esperaba: Menor que 1 | Resultado: Menor que 1
 * 
 * numero: aaa | Esperaba: Dato introducido invalido | Resultado: Dato introducido invalido
 * 
 */

public class Ejercicio07 {

	public static void main(String[] args) {

		// numero: numero insertado por el usuario
		int numero = 0;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		do {

			try {
				System.out.println("Inserta un numero");
				numero = sc.nextInt();
				if (numero < 1) {
					System.out.println("Dato introducido menor que 1");
				}
			} catch (InputMismatchException e) {
				System.out.println("Dato introducido invalido");
				sc.nextLine();
			}

		} while (numero < 1);

		// For I-J-K: I y J empiezan en 1, y se iran sumando en cada respectiva
		// iteracion
		// I sera menor o igual que el numero, y J sera menor o igual que I
		// Respecto a K, empieza por i-1, debera ser mayor o igual que 1, y se ira
		// restando en cada respectiva iteracion
		for (int i = 1; i <= numero; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			} // Fin For J
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			} // Fin For K
			System.out.println("");
		} // Fin For I

		// Cierra el Scanner
		sc.close();

	}

}
