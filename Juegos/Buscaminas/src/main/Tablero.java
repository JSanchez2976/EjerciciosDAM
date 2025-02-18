package main;

import java.util.Scanner;

public class Tablero {
	public static void visualizarTablero(String[][] tablero) {
		System.out.println();
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void rellenarTablero(String[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				if (i == 0 && j == 0) {
					tablero[i][j] = "   ";
				} else if (i == 0) {
					tablero[i][j] = " " + (j - 1) + " ";
				} else if (j == 0) {
					tablero[i][j] = " " + (i - 1) + " ";
				} else {
					tablero[i][j] = "[ ]";
				}

			}
		}

	}

	public static void hacerTiradas(String[][] tablero, int[][] posiciones, Scanner in) {
		Tablero.visualizarTablero(tablero);
		int fila;
		int columna;
		int contador = 0;
		int tiradas = 0;
		boolean repetido;
		do {
			tiradas++;
			do {
				// posiciones
				System.out.println("Introduce una posicion (fila,columna): ");
				do {
					System.out.print("Fila del barco = ");
					fila = in.nextInt();
					if (fila < 0 || fila > tablero.length - 2) {
						System.out
								.println("ERROR, las filas deben estar comprendidas entre 0 y " + (tablero.length - 2));
					}
				} while (fila < 0 || fila > tablero.length - 2);
				// columnas
				do {
					System.out.print("Columna del barco = ");
					columna = in.nextInt();
					if (columna < 0 || columna > tablero.length - 2) {
						System.out.println(
								"ERROR, las columnas deben estar comprendidas entre 0 y " + (tablero.length - 2));
					}
				} while (columna < 0 || columna > tablero.length - 2);
				repetido = false;
				// mirar según el tablero si ya hemos tirado
				if (tablero[fila + 1][columna + 1] == "[O]" || tablero[fila + 1][columna + 1] == "[X]") {
					repetido = true;
				}
				// no repetido
				if (!repetido) {
					// mirar si es la misma q la de barcos
					boolean encontrado = false;
					int barco = 0;
					for (int i = 0; i < posiciones.length; i++) {
						if (fila == posiciones[i][0] && columna == posiciones[i][1]) {
							barco = i;
							encontrado = true;
						}
					}
					if (encontrado) {
						tablero[fila + 1][columna + 1] = "[O]";
						Tablero.visualizarTablero(tablero);
						System.out.println("Barco " + barco + " hundido, nº de tiradas: " + tiradas);
						contador++;
					} else {
						tablero[fila + 1][columna + 1] = "[X]";
						Tablero.visualizarTablero(tablero);
						System.out.println("Agua, nº de tiradas " + tiradas);
					}
				}
				// repetido
				else {
					System.out.println("NO PUEDES REPETIR TIRADAS");
				}
			} while (repetido);
		} while (contador < 3);
	}
}
