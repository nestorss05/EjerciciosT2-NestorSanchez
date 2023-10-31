package ejercicio02;

import java.util.Scanner;

/*
 * Ejemplo:
 * 
 * numeroDNI: 67126546 | Esperaba: 67126546B | Resultado: 67126546B
 * 
 * numeroDNI: 36862378 | Esperaba: 36862378W | Resultado: 36862378W
 * 
 */

public class Ejercicio02 {

	public static void main(String[] args) {

		// numeroDNI: ocho digitos introducidos por el usuario
		int numeroDNI;
		
		// letraNum: el resultado del resto de numeroDNI entre 23
		int letraNum; // La gracia de todo esto es que letra es entero puesto a que un numero igualara
						// a una letra
		
		// letra: la letra asignada por el resultado de letraNum
		String letra="";
		
		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pide al usuario que inserte los primeros 8 digitos del DNI para guardarlos en numeroDNI
		System.out.println("Escribe los primeros 8 digitos del DNI");
		numeroDNI = sc.nextInt();

		// letraNum sera el resto de numeroDNI entre 23
		letraNum = numeroDNI % 23;

		// switch: por el resultado de letraNum, se asignara una letra
		switch (letraNum) {

		case 0 -> {
			letra="T";
		}
		
		case 1 -> {
			letra="R";
		}

		case 2 -> {
			letra="W";
		}

		case 3 -> {
			letra="A";
		}

		case 4 -> {
			letra="G";
		}
		
		case 5 -> {
			letra="M";
		}
		
		case 6 -> {
			letra="Y";
		}
		
		case 7 -> {
			letra="F";
		}
		
		case 8 -> {
			letra="P";
		}
		
		case 9 -> {
			letra="D";
		}
		
		case 10 -> {
			letra="X";
		}
		
		case 11 -> {
			letra="B";
		}
		
		case 12 -> {
			letra="N";
		}
		
		case 13 -> {
			letra="J";
		}
		
		case 14 -> {
			letra="Z";
		}
		
		case 15 -> {
			letra="S";
		}
		
		case 16 -> {
			letra="Q";
		}
		
		case 17 -> {
			letra="V";
		}
		
		case 18 -> {
			letra="H";
		}
		
		case 19 -> {
			letra="L";
		}

		case 20 -> {
			letra="C";
		}
		
		case 21 -> {
			letra="K";
		}
		
		default -> {
			letra="E";
		}
		
		} // Fin switch
		
		// Muestra como seria el DNI
		System.out.println("DNI: " + numeroDNI + letra);

		// Cierra el Scanner
		sc.close();
		
	}

}
