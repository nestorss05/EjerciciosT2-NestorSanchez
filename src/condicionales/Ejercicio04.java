package condicionales;

import java.util.Scanner;

/*
 * Ejemplo:
 * 
 * numero: 33 | Esperaba: TREINTA Y TRES | Resultado: TREINTA Y TRES
 * 
 * numero: 60 | Esperaba: SESENTA | Resultado: SESENTA
 * 
 */

public class Ejercicio04 {

	public static void main(String[] args) {

		// numero: numero introducido por el usuario
		int numero;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario un numero y guardalo en numero
		System.out.println("Inserta un numero del 1 al 99");
		numero = sc.nextInt();

		// If: numero debe ser entre 1 y 99 para continuar
		// Si es de 1 a 19: se dice el numero y ya
		// Si es de 20 a 99:
		// Si la unidad es 0, se dice el numero y ya. De lo contrario, se concatenaran
		// las dos cifras

		if (numero < 1 || numero > 99) {

			System.out.println("El numero introducido no esta en el rango");

		} else {

			if (numero >= 20 && numero % 10 == 0) {

				switch (numero) {

				case 20 -> {
					System.out.println("VEINTE");
				}

				case 30 -> {
					System.out.println("TREINTA");
				}

				case 40 -> {
					System.out.println("CUARENTA");
				}

				case 50 -> {
					System.out.println("CINCUENTA");
				}

				case 60 -> {
					System.out.println("SESENTA");
				}

				case 70 -> {
					System.out.println("SETENTA");
				}

				case 80 -> {
					System.out.println("OCHENTA");
				}

				case 90 -> {
					System.out.println("NOVENTA");
				}

				}

			}

			else if (numero <= 19) {

				switch (numero) {

				case 0 -> {
					System.out.println("CERO");
				}

				case 1 -> {
					System.out.println("UNO");
				}

				case 2 -> {
					System.out.println("DOS");
				}

				case 3 -> {
					System.out.println("TRES");
				}

				case 4 -> {
					System.out.println("CUATRO");
				}

				case 5 -> {
					System.out.println("CINCO");
				}

				case 6 -> {
					System.out.println("SEIS");
				}

				case 7 -> {
					System.out.println("SIETE");
				}

				case 8 -> {
					System.out.println("OCHO");
				}

				case 9 -> {
					System.out.println("NUEVE");
				}

				case 10 -> {
					System.out.println("DIEZ");
				}

				case 11 -> {
					System.out.println("ONCE");
				}

				case 12 -> {
					System.out.println("DOCE");
				}

				case 13 -> {
					System.out.println("TRECE");
				}

				case 14 -> {
					System.out.println("CATORCE");
				}

				case 15 -> {
					System.out.println("QUINCE");
				}

				case 16 -> {
					System.out.println("DIECISEIS");
				}

				case 17 -> {
					System.out.println("DIECISIETE");
				}

				case 18 -> {
					System.out.println("DIECIOCHO");
				}
				case 19 -> {
					System.out.println("DIECINUEVE");
				}

				}

			} else {

				switch (numero / 10) {

				case 2 -> {
					System.out.print("VEINTI");
				}

				case 3 -> {
					System.out.print("TREINTA Y ");
				}

				case 4 -> {
					System.out.print("CUARENTA Y ");
				}

				case 5 -> {
					System.out.print("CINCUENTA Y ");
				}

				case 6 -> {
					System.out.print("SESENTA Y ");
				}

				case 7 -> {
					System.out.print("SETENTA Y ");
				}

				case 8 -> {
					System.out.print("OCHENTA Y ");
				}

				case 9 -> {
					System.out.print("NOVENTA Y ");
				}

				}

				switch (numero % 10) {

				case 1 -> {
					System.out.print("UNO");
				}

				case 2 -> {
					System.out.print("DOS");
				}

				case 3 -> {
					System.out.print("TRES");
				}

				case 4 -> {
					System.out.print("CUATRO");
				}

				case 5 -> {
					System.out.print("CINCO");
				}

				case 6 -> {
					System.out.print("SEIS");
				}

				case 7 -> {
					System.out.print("SIETE");
				}

				case 8 -> {
					System.out.print("OCHO");
				}

				case 9 -> {
					System.out.print("NUEVE");
				}

				}

			}

		}

		// Cierra el Scanner
		sc.close();

	}

}
