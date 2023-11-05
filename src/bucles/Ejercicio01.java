package bucles;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		// horas: una hora de 0 a 23
		int horas;

		// minutos: un minuto de 0 a 59
		int minutos;

		// segundos: un segundo de 0 a 59
		int segundos;

		// incremento: segundos a incrementar
		int incremento;

		// decremento:
		int decremento;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario que inserte la hora, los minutos, los segundos y los segundos
		// que incrementaran el tiempo
		System.out.println("Inserta la hora (0 a 23)");
		horas = sc.nextInt();
		System.out.println("Inserta los minutos (0 a 59)");
		minutos = sc.nextInt();
		System.out.println("Inserta los segundos (0 a 59)");
		segundos = sc.nextInt();
		System.out.println("¿Cuantos segundos vas a querer incrementar?");
		incremento = sc.nextInt();

		// If: no pasara si cualquier valor es menor que 0, o mayor que 59 (mayor que 23
		// en caso de las horas)
		//
		// Si el formato es correcto, se le sumara 1 a segundos. En caso de que sea 60,
		// el valor de segundos sera 0 y se sumara 1 a minutos. Si pasa igual con
		// minutos, se repetira lo mismo pero aplicado a minutos

		if (segundos > 59 || segundos < 0 || minutos > 59 || minutos < 0 || horas > 23 || horas < 0) {
			System.out.println("Formato incorrecto");
		} else {
			segundos = segundos + incremento;
			if (segundos >= 60) {
				segundos = 0;
				minutos++;
				if (minutos >= 60) {
					minutos = 0;
					horas++;
					if (horas >= 24) {
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
