package condicionales;

import java.util.Scanner;

/*
 * Ejemplo:
 * 
 * horas: 14, minutos: 29, segundos: 32 | Esperaba: 14:29:33 | Resultado: 14:29:33
 * 
 * horas: 23, minutos: 59, segundos: 59 | Esperaba: 0:00:00 | Resultado: 0:0:0
 * 
 * horas: 33, minutos: 33, segundos: 33 | Esperaba: Formato incorrecto | Resultado: Formato incorrecto
 * 
 */

public class Ejercicio07 {

	public static void main(String[] args) {

		// horas: una hora de 0 a 23
		int horas;

		// minutos: un minuto de 0 a 59
		int minutos;

		// segundos: un segundo de 0 a 59
		int segundos;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario que inserte la hora, los minutos y los segundos
		System.out.println("Inserta la hora (0 a 23)");
		horas = sc.nextInt();
		System.out.println("Inserta los minutos (0 a 59)");
		minutos = sc.nextInt();
		System.out.println("Inserta los segundos (0 a 59)");
		segundos = sc.nextInt();

		// If: no pasara si cualquier valor es menor que 0, o mayor que 59 (mayor que 23
		// en caso de las horas)
		//
		// Si el formato es correcto, se le sumara 1 a segundos. En caso de que sea 60,
		// el valor de segundos sera 0 y se sumara 1 a minutos. Si pasa igual con
		// minutos, se repetira lo mismo pero aplicado a minutos
		if (segundos > 59 || segundos < 0 || minutos > 59 || minutos < 0 || horas > 23 || horas < 0) {
			System.out.println("Formato incorrecto");
		} else {
			segundos++;
			
			if (segundos == 60) {
				minutos++;
				segundos = 0;
				
				if (minutos == 60) {
					horas++;
					minutos = 0;
					
					if (horas == 24) {
						horas = 0;
					} // Fin If Horas
				} // Fin If Minutos
			} // Fin If Segundos
			System.out.println(horas + ":" + minutos + ":" + segundos);
		} // Fin If

		// Cierra el Scanner
		sc.close();

	}

}
