package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 
 * numero: 22 | Esperaba: Capicua | Resultado: Capicua
 * 
 * numero: 355 | Esperaba: No capicua | Resultado: No capicua
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

		// cifras: numero que corresponda cada cifra
		int cifras;

		// numeroInverso: numero al que se van acumulando las cifras de cada iteracion
		int numeroInverso = 0;

		// numeroAuxiliar: numero que hace preservar la variable numero, usandose para
		// saber cada cifra. Se ira quitando cada cifra poco a poco
		int numeroAuxiliar;

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

		// numeroAuxiliar pasara a tener el valor de numero
		numeroAuxiliar = numero;

		// While: mientras que numeroAuxiliar no sea 0...

		// Las cifras sera el resto de numeroAuxiliar entre 10, para ir por cada cifra
		// A numeroInverso se le sumara una cifra multiplicandolo por 10 y sumando la
		// variable cifra a el, para que el resultado sea exacto y se vaya construyendo
		// el numero final
		// A numeroAuxiliar se le quitara una cifra dividiendolo entre 10
		while (numeroAuxiliar != 0) {
			cifras = numeroAuxiliar % 10;
			numeroInverso = numeroInverso * 10 + cifras;
			numeroAuxiliar /= 10;

		} // Fin While

		// Muestra el resultado por pantalla
		if (numero == numeroInverso) {
			System.out.println("El numero es capicua");
		} else {
			System.out.println("El numero no es capicua");
		} // Fin If-Else

		// Cierra el Scanner
		sc.close();

	}

}
