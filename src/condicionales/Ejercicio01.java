package condicionales;

import java.util.Scanner;

/*
 * PRUEBA A REALIZAR
 * 
 * Ejemplo:
 * 
 * numero: 636 | Esperaba: Capicua | Resultado: Capicua
 * 
 * numero: 36 | Esperaba: No es capicua | Resultado: No es capicua
 * 
 */

public class Ejercicio01 {

	public static void main(String[] args) {

		// numero: numero introducido por el usuario
		int numero;
		// numeroInicial: De 10 a 9999: primera cifra del numero
		int numeroInicial;
		// numeroFinal: De 10 a 9999: ultima cifra del numero
		int numeroFinal;
		// numeroInicial2: De 1000 a 9999: segunda cifra del numero
		int numeroInicial2;
		// numeroFinal2: De 1000 a 9999: tercera cifra del numero
		int numeroFinal2;
		// numeroCapicua: indica si el numero es capicua o no
		boolean numeroCapicua = false;

		// Inicia el Scanner para registrar datos del teclado
		Scanner sc = new Scanner(System.in);

		// Pide al usuario un numero que se registrara en la variable numero
		System.out.println("Introduce un numero");
		numero = sc.nextInt();

		// If 1: el numero debera ser uno de 0 a 9999

		if (numero < 0 || numero > 9999) {

			System.out.println("El numero debe ser entre 0 y 9999");

		} else if (numero < 10) {

			// If 1.1: Si el numero es uno entre 0 y 9, ya es capicua de por si
			numeroCapicua = true;

		} else if (numero < 100) {

			// If 1.2: Si el numero es uno entre 10 y 99, debera obtenerse el resto de su
			// division entre 11. Si el resto es 0, es capicua.
			if (numero % 11 == 0) {

				numeroCapicua = true;

			}

		} else if (numero < 1000) {

			// If 1.3: Si el numero es uno entre 100 y 999:
			// numeroInicial sera el numero entre 100
			// numeroFinal sera el resto de numero entre 100, y de ahi sera el resto del
			// resultado entre 10
			numeroInicial = numero / 100;
			numeroFinal = (numero % 100) % 10;

			// Si numeroInicial y numeroFinal son iguales, entonces el numero es capicua
			if (numeroInicial == numeroFinal) {
				numeroCapicua = true;
			}

		} else {

			// If 1.4: Si el numero es uno entre 1000 y 9999:
			
			// numeroInicial sera el numero entre 1000
			
			// numeroInicial2 sera el resto de numero entre 1000, y su resultado se dividira
			// entre 100.
			
			// numeroFinal2 sera el resto de numero entre 1000, de ahi se saca el resto del
			// resultado anterior entre 100 y se dividira entre 10
			
			// numeroFinal sera el resto de numero entre 1000, de ahi se saca el resto del
			// resultado anterior entre 100 y el resultado final sera el resto del ultimo
			// resultado entre 10
			numeroInicial = numero / 1000;
			numeroInicial2 = (numero % 1000) / 100;
			numeroFinal2 = ((numero % 1000) % 100) / 10;
			numeroFinal = ((numero % 1000) % 100) % 10;

			// Si numeroInicial y numeroFinal son iguales, y tambien numeroInicial2 y
			// numeroFinal2 son iguales, entonces el numero es capicua
			if (numeroInicial == numeroFinal && numeroInicial2 == numeroFinal2) {
				numeroCapicua = true;
			}

		} // Fin If 1

		// If 2: ¿capicua o no capicua?
		if (numeroCapicua) {
			System.out.println("El numero es capicua");
		} else {
			System.out.println("El numero no es capicua");
		} // Fin If 2
		sc.close();
	}

}
