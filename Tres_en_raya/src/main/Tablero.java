package main;

public class Tablero {
	public static void rellenarTablero(String[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				tablero[i][j] = "   ";
			}
		}

	}

	public static void visualizarTablero(String tablero[][]) {
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(tablero[i][j]);
				if (j < tablero[0].length - 1) {
					System.out.print("|");
				}
			}
			System.out.println();
			if (i < tablero.length - 1) {
				System.out.println("---+---+---");
			}
		}
	}
}
