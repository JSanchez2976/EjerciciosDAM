package main;

import java.util.Scanner;

public class Barcos {
	public static int[][] introducirPosicionesBarcos(String[][] tablero, Scanner in) {
		int posiciones[][] = new int[3][2];
		System.out.println("\n*** INTRODUCIR POSICIONES DE LOS BARCOS ");
		for (int i = 0; i < 3; i++) {
			System.out.println();
			// filas
			do {
				System.out.print("Fila del barco " + (i + 1) + " = ");
				posiciones[i][0] = in.nextInt();
				if (posiciones[i][0] < 0 || posiciones[i][0] > tablero.length - 2) {
					System.out.println("ERROR, las filas deben estar comprendidas entre 0 y " + (tablero.length - 2));
				}
			} while (posiciones[i][0] < 0 || posiciones[i][0] > tablero.length - 2);
			// columnas
			do {
				System.out.print("Columna del barco " + (i + 1) + " = ");
				posiciones[i][1] = in.nextInt();
				if (posiciones[i][1] < 0 || posiciones[i][1] > tablero.length - 2) {
					System.out
							.println("ERROR, las columnas deben estar comprendidas entre 0 y " + (tablero.length - 2));
				}
			} while (posiciones[i][1] < 0 || posiciones[i][1] > tablero.length - 2);
			// ver si la posicion ya estaba
			boolean repetida = false;
			for (int k = 0; k < i; k++) {
				if (posiciones[i][0] == posiciones[k][0] && posiciones[i][1] == posiciones[k][1]) {
					repetida = true;
					break;
				}
			}
			if (repetida) {
				System.out.println("Posicion repetida, introduzca otra posicion");
				i--;
			}
		}
		return posiciones;
	}
}
