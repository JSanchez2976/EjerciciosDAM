package main;

import java.util.Scanner;

public class Usuario {
	static Scanner in = new Scanner(System.in);

	public static void tirarUsuario(String[][] tablero) {
		boolean valida;
		do {
			System.out.println("Usuario, elige fila y columna: ");
			int fila;
			int columna;
			do {
				System.out.print("Fila = ");
				fila = in.nextInt();
				System.out.print("Columna = ");
				columna = in.nextInt();
				if (fila < 0 || columna < 0 || fila > tablero.length - 1 || columna > tablero[0].length - 1) {
					System.out.println("ERROR, posiciones incorrectas. Elige de nuevo");
				}
			} while (fila < 0 || columna < 0 || fila > tablero.length - 1 || columna > tablero[0].length - 1);

			valida = Main.revisarTiradas(tablero, fila, columna);
			if (valida) {
				anotarTiradaUsuario(tablero, fila, columna);
			} else {
				System.out.println("ERROR, no puedes sobrescribir posiciones");
			}
		} while (!valida);

	}

	private static void anotarTiradaUsuario(String[][] tablero, int fila, int columna) {
		tablero[fila][columna] = " X ";

	}
}
