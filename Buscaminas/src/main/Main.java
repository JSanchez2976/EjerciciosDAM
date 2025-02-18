package main;
/*
 * EL JUEGO DE LOS BARCOS. Escribir un programa que simule el juego de los barcos. El juego consiste
 * en introducir tres posiciones
(fila y columna) de los barcos y a partir de aquí comienza el juego. Puedes hundir el barco o fallar tirada.
El juego contabilizará
el número de tiradas y si están repetidas o no, dando la oportunidad de seguir jugando hasta ganar. 

NOTAS-> los valores están metidos como i+1 y j+1 ya q el tablero es n+1
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// crear tablero
		int n;
		do {
			System.out.print("Cuantas filas y columnas quieres q tenga el tablero: ");
			n = in.nextInt();
			if (n < 1 || n > 10) {
				System.out.println("Debes introducir un valor comprendido entre 1 y 10");
			}
		} while (n < 1 || n > 10);
		String tablero[][] = new String[n + 1][n + 1];
		Tablero.rellenarTablero(tablero);
		Tablero.visualizarTablero(tablero);
		// introducir posiciones de barcos
		int posiciones[][] = Barcos.introducirPosicionesBarcos(tablero, in);
		visualizarVector(posiciones);
		System.out.println("\n\n\n\n\n*** EMPEZAR EL JUEGO ***");
		Tablero.hacerTiradas(tablero, posiciones, in);
		System.out.println("\nENHORABUENA!!!");
		in.close();
	}
	private static void visualizarVector(int[][] posiciones) {
		for (int i = 0; i < posiciones.length; i++) {
			System.out.print("Barco " + i + " = [" + posiciones[i][0] + "]" + "[" + posiciones[i][1] + "]");
			System.out.println();
		}

	}

}
