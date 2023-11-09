package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Ejemplo:
 * 
 * numero: 3 | Esperaba  |  Resultado
 *   
 *                1            1    
 *                22           22
 *                333          333
 * 
 * numero: 5 | Esperaba  |  Resultado
 * 
 *              1             1    
 *              22            22
 *              333           333
 *              4444          4444
 *              55555         55555
 * 
 * numero: -11 | Esperaba: Fuera del rango | Resultado: Fuera del rango
 * 
 * numero: 21 | Esperaba: Fuera del rango | Resultado: Fuera del rango
 * 
 * numero: aea | Esperaba: Dato introducido invalido | Resultado: Dato introducido invalido
 * 
 * numero: 0 | Esperaba: N/A | Resultado: N/A
 * 
 */

public class Ejercicio06 {

	public static void main(String[] args) {

		// numero: numero insertado por el usuario
		int numero = -1;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario un numero. Si el numero es entre 0 y 20, podra pasar
		do {

			try {
				System.out.println("Inserta un numero");
				numero = sc.nextInt();
				if (numero < 0 || numero > 20) {
					System.out.println("Dato introducido fuera del rango");
				}
			} catch (InputMismatchException e) {
				System.out.println("Dato introducido invalido");
				sc.nextLine();
			}

		} while (numero < 0 || numero > 20);

		// For I y J: empiezan en 1, y se iran sumando en cada respectiva iteracion
		// I sera menor o igual que el numero, y J sera menor o igual que I
		// Se imprimira el numero en un print y un println vacio para pasar de linea
		for (int i = 1; i <= numero; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			} // Fin For J
			System.out.println("");
		} // Fin For I

		// Cierra el Scanner
		sc.close();

	}

}