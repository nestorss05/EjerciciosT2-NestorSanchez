package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Ejemplo:
 * 
 * numero: 3 | Esperaba: 2 numeros primos | Resultado: 2 numeros primos
 * 
 * numero: 33 | Esperaba: 11 numeros primos | Resultado: 11 numeros primos
 * 
 * numero: -5 | Esperaba: Menor que 1 | Resultado: Menor que 1
 * 
 */

public class Ejercicio02 {

	public static void main(String[] args) {

		// numero: numero introducido por el usuario
		int numero = 0;

		// esPrimo: un contador de numeros primos que se va sumando con cuantos mas
		// numeros primos hayan
		int esPrimo = 0;

		// greenFlags: ???
		int greenFlags;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario un numero y guardalo en la variable numero
		do {

			try {
				System.out.println("Inserta un numero");
				numero = sc.nextInt();
				if (numero < 1) {
					System.out.println("Dato introducido menor que 1");
				}
			} catch (InputMismatchException e) {
				System.out.println("Dato introducido incorrecto");
				sc.nextLine();
			}

		} while (numero < 1);

		// For I: I sera 1, debera ser menor que el numero, y se ira sumando 1 en cada
		// iteracion

		// greenFlags pasara a ser 0, se ejecutara For J y se revisara si tienes 2 o
		// menos green flags (o si el numero no es 1), donde se contara el numero como
		// primo
		for (int i = 1; i <= numero; i++) {
			greenFlags = 0;
			// For J: J sera 1, debera ser menor que I, y se ira sumando 1 en cada
			// iteracion. Si el resto de i entre j es 0, se le asignara una greenFlag
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					greenFlags++;
				} // Fin If1 J
			} // Fin For J
			if (greenFlags <= 2 && i != 1) {
				esPrimo++;
			} // Fin If I
		} // Fin For I

		// Se le informara al usuario cuantos numeros primos hay
		System.out.println("Entre 1 y " + numero + ", hay " + esPrimo + " numeros primos");

		// Cierra el Scanner
		sc.close();

	}

}
