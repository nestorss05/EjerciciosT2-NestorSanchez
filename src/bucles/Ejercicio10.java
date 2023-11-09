package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 
 * numero: 22 | Esperaba: Capicua | Resultado: 
 * 
 * numero: 355 | Esperaba: No capicua | Resultado: 
 * 
 * numero: -5 | Esperaba: Menor que 0 | Resultado: Menor o igual que 0
 * 
 * numero: fdsf | Esperaba: Dato introducido invalido | Resultado: Dato introducido invalido
 * 
 */

public class Ejercicio10 {

	public static void main(String[] args) {

		// numero: numero introducido por el usuario
		int numero = -1;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Do While: Pide un numero al usuario. Para que siga el programa, el numero
		// debera ser o 0 o positivo
		do {
			try {
				System.out.println("Inserta un numero");
				numero = sc.nextInt();
				if (numero < 0) {
					System.out.println("Numero introducido negativo");
				}
			} catch (InputMismatchException e) {
				System.out.println("Numero introducido invalido");
				sc.nextLine();
			}
		} while (numero < 0); // Fin Do While

		// Aqui deberia estar el resto del codigo
		
		// Cierra el Scanner
		sc.close();

	}

}
