package condicionales;

import java.util.Scanner;

/*
 * Ejemplo:
 * 
 * numero: 3 | Esperaba: 3 | Resultado: 3
 * 
 * numero: -6 | Esperaba: 6 | Resultado: 6
 * 
 */

public class Ejercicio05 {

	public static void main(String[] args) {

		// numero: numero introducido por el usuario
		int numero;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario un numero y guardalo en numero
		System.out.println("Inserta un numero");
		numero = sc.nextInt();

		// Muestra el valor absoluto del numero con un ternario:
		// Si el numero es mayor o igual que 0, el numero sera igual.
		// De lo contrario, el numero se multiplicara por -1, para que sea positivo
		System.out.println((numero >= 0) ? numero : numero * -1);

		// Cierra el Scanner
		sc.close();

	}

}
