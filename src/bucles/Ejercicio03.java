package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Ejemplo:
 * 
 * numero: 3 | Esperaba  |  Resultado
 *   
 *                 *            *     
 *                * *          * *
 *               * * *        * * *
 * 
 * numero: 5 | Esperaba  |  Resultado
 * 
 *                 *            *     
 *                * *          * *
 *               * * *        * * *
 *              * * * *      * * * *
 *             * * * * *    * * * * *
 * 
 * numero: -4 | Esperaba: Menor que 1 | Resultado: Menor que 1
 * 
 */

public class Ejercicio03 {

	public static void main(String[] args) {

		// n: valor introducido por el usuario que serviran como base y altura del
		// triangulo
		int n = 0;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario un numero y guardalo en n
		do {

			try {
				System.out.println("Inserta un numero");
				n = sc.nextInt();
				if (n < 1) {
					System.out.println("Dato introducido menor que 1");
				}
			} catch (InputMismatchException e) {
				System.out.println("Dato introducido invalido");
				sc.nextLine();
			}

		} while (n < 1);

		// For I: i empezara por 1, debera ser n o menor, y se ira sumando 1 en cada
		// iteracion

		// Este bucle for guaradara dos bucles for: uno para los espacios, y otro para
		// los asteriscos
		for (int i = 1; i <= n; i++) {
			// For J: j empezara por 1, debera ser menor o igual que la resta de n-i, y se
			// ira sumando 1 en cada iteracion

			// Para centrar los asteriscos, se hara print de espacios en blanco, pero por
			// n-i veces

			/*
			 * Ejemplo con n=3, i empieza por 1
			 * 
			 * 1. n-i = 3-1=2, 2 espacios (j tiene 2 iteraciones) 2. n-i = 3-2=1, 1 espacio
			 * (j tiene 1 iteracion) 3. n-i = 3-2=0, 0 espacios (j no tiene iteraciones)
			 * 
			 */
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			} // Fin For J

			// For K: k empezara por 1, debera ser i o menor, y se ira sumando 1 en cada
			// iteracion
			// Por cada iteracion, se pondra un asterisco k veces, dependiendo del valor de
			// i
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			} // Fin For K
			System.out.println("");
		} // Fin For I

		// Cierra el Scanner
		sc.close();

	}

}
