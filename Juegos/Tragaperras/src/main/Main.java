package main;

/*
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
• El ordenador mostrará una tirada que consiste en mostrar 3 figuras. (Será
necesario trabajar con números aleatorios).
• Hay 5 figuras posibles: corazón, diamante, herradura, campana y limón.
• Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
ha perdido”.
• Si hay dos figuras iguales y una diferente se debe mostrar el mensaje
“Bien, ha recuperado su moneda”.
• Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”.
 */

public class Main {

	public static void main(String[] args) {
		// crear monedas
		int monedas = 4;
		// crear vector figuras
		String[] figuras = { "corazon", "diamante", "herradura", "campana", "limon" };
		System.out.println("Bienvenid@ a la maquina tragaperras");
		System.out.println("Si consigue 2 figuras iguales de devolveremos su dinero");
		System.out.println("Si consigue las 3, habrá ganado el premio");
		System.out.println("¡Buena suerte!\n");
		int monedasMax= monedas;
		// jugar
		do {
			String[] tiradas = hacerTirada(figuras);
			int actualizarMoneda=verSlot(tiradas);
			monedas+= actualizarMoneda;
			System.out.println("Monedas restantes = "+monedas);
			if(monedas>monedasMax) {
				monedasMax=monedas;
			}
		}while(monedas!=0);
		System.out.println("\nEl máximo acumulado ha sido: "+monedasMax);
	}

	private static int verSlot(String[] tiradas) {
		System.out.println();
		int monedas;
		System.out.println("-----------------------------------------");
		System.out.println("| " + tiradas[0] + " || " + tiradas[1] + " || " + tiradas[2] + " |");
		System.out.println("-----------------------------------------");
		// revisar tiradas
		// Verificar combinaciones
		if (tiradas[0].equals(tiradas[1]) && tiradas[1].equals(tiradas[2])) {
			System.out.println("Enhorabuena, ha ganado 10 monedas");
			monedas=10;
		} else if (tiradas[0].equals(tiradas[1]) || tiradas[0].equals(tiradas[2]) || tiradas[1].equals(tiradas[2])) {
			System.out.println("Bien, ha recuperado su moneda");
			monedas=0;
		} else {
			System.out.println("Lo siento, has perdido");
			monedas=-1;
		}
		return monedas;
	}

	private static String[] hacerTirada(String[] figuras) {
		String[] tiradas = new String[3];
		// bucle 3 veces
		for (int i = 0; i < 3; i++) {
			// sacar randoms
			int random = (int) (Math.random() * 5);
			tiradas[i] = figuras[random];
		}
		return tiradas;
	}

}
