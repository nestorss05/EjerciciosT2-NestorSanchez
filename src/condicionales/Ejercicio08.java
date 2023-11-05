package condicionales;

import java.util.Scanner;

/*
 * Ejemplo:
 * 
 * distancia: 700, dias: 9 | Esperaba: 1750.0€ | Resultado: 1750.0€
 * 
 * distancia: 900, dias: 9 | Esperaba: 1575.0€ | Resultado: 1575.0€
 * 
 */

public class Ejercicio08 {

	public static void main(String[] args) {

		// PRECIOKM: precio por kilometro
		final float PRECIOKM = 2.5f;

		// distancia: distancia a recorrer introducida por el usuario
		float distancia;

		// dias: duracion de la estancia introducidos por el usuario
		int dias;

		// precioTotal: precio total del billete de tren
		float precioTotal;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario la distancia a recorrer y el numero de dias de estancia
		System.out.println("¿Cuantos km vas a recorrer?");
		distancia = sc.nextInt();
		System.out.println("¿De cuantos dias sera la estancia?");
		dias = sc.nextInt();

		// Multiplica la distancia por PRECIOKM (o yo que se)
		precioTotal = distancia * PRECIOKM;

		// If: Si la estancia es mayor a 7 dias y los kilometros recorridos son mas de
		// 800, se hara un 30% de descuento
		if (dias > 7 && distancia > 800) {

			precioTotal = precioTotal * 0.7f;

		}

		// Muestra el precio total por pantalla
		System.out.println("Precio total: " + precioTotal);

		// Cierra el Scanner
		sc.close();

	}

}
