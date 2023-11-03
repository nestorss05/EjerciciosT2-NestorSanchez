package condicionales;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		// distancia: distancia a recorrer introducida por el usuario
		float distancia;
		
		// dias: duracion de la estancia introducidos por el usuario
		int dias;
		
		// precio: precio total del billete de tren
		int precio;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario la distancia a recorrer y el numero de dias de estancia
		System.out.println("¿Cuantos km vas a recorrer?");
		distancia = sc.nextInt();
		System.out.println("¿De cuantos dias sera la estancia?");
		dias = sc.nextInt();
		
		// Multiplica la distancia por 2,5 (o yo que se)
		// If: 
		if (dias>7 && distancia>800) {
			
		}

		// Cierra el Scanner
		sc.close();

	}

}
