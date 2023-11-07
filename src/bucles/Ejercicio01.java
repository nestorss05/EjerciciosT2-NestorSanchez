package bucles;

import java.util.Scanner;

/*
 * Ejemplo:
 * 
 * horas: 15, minutos: 10, segundos: 32, incremento: 33| Esperaba: 15:11:05 | Resultado: 15:11:5
 * 
 * horas: 2, minutos: 29, segundos: 34, incremento: 26 | Esperaba: 2:30:00 | Resultado: 2:30:0
 * 
 * horas: 66, minutos: 66, segundos: 66, incremento: 66 | Esperaba: Formato incorrecto | Resultado: Formato incorrecto
 * 
 */

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
		// Si el formato es correcto, se le sumara la variable incremento a segundos.
		// De ahi, se iniciara un bucle: i debera ser 0, la condicion es que sea siempre
		// menor que el incremento, y se ira sumando 1 en cada iteracion. En caso de que
		// sea 60, el valor de segundos sera 0 y se sumara 1 a minutos. Si pasa igual
		// con minutos, se repetira lo mismo pero aplicado a minutos

		if (segundos > 59 || segundos < 0 || minutos > 59 || minutos < 0 || horas > 23 || horas < 0) {
			System.out.println("Formato incorrecto");
		} else {
			segundos = segundos + incremento;
			for (int i = 0; i < incremento; i++) {
				if (segundos >= 60) {
					segundos = segundos - 60;
					minutos++;
					if (minutos >= 60) {
						minutos = minutos - 60;
						horas++;
						if (horas >= 24) {
							horas = horas - 24;
						} // Fin If Horas
					} // Fin If Minutos
				} // Fin If Segundos
			} // Fin For

			// Muestra la fecha final
			System.out.println("Fecha final: " + horas + ":" + minutos + ":" + segundos);

		} // Fin If

		// Cierra el Scanner
		sc.close();

	}

}
