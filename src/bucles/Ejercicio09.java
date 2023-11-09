package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 
 * numero: 22 | Esperaba: 2 cifras | Resultado: 2 cifras
 * 
 * numero: 51389 | Esperaba: 5 cifras | Resultado: 5 cifras
 * 
 * numero: -5 | Esperaba: Menor o igual que 0 | Resultado: Menor o igual que 0
 * 
 * numero: bbb | Esperaba: Dato introducido invalido | Resultado: Dato introducido invalido
 * 
 */

public class Ejercicio09 {

	public static void main(String[] args) {

		// numero: numero introducido por el usuario
		int numero = 0;

		// cifras: cantidad de cifras totales del numero
		int cifras = 0;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Do While: mientras que el numero sea menor o igual que 0, se revisara por
		// fallos gramaticales o numeros incorrectos que sean decimales, ceros o
		// negativos
		do {
			try {
				System.out.println("Inserta un numero");
				numero = sc.nextInt();
				if (numero <= 0) {
					System.out.println("Dato introducido menor o igual que 0");
				}
			} catch (InputMismatchException e) {
				System.out.println("Dato introducido invalido");
				sc.nextLine();
			}
		} while (numero <= 0); // Fin Do While

		// While: mientras que numero no sea 0, se ira dividiendo entre 10 y se ira
		// sumando 1 a cifras
		while (numero != 0) {
			numero = numero / 10;
			cifras++;
		} // Fin While

		// Muestra el resultado por pantalla (pero ten cuidado gramaticalmente)
		if (cifras == 1) {
			System.out.println("El numero tiene " + cifras + " cifra");
		} else {
			System.out.println("El numero tiene " + cifras + " cifras");
		} // Fin If-Else

		// Cierra el Scanner
		sc.close();

	}

}
