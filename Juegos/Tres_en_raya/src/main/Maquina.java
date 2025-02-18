package main;

public class Maquina {
	public static void tirarMaquina(String[][] tablero) {
		System.out.println("*** TURNO DE LA MAQUINA ***");
		boolean valido;
		int fila;
		int columna;
		do {
			fila = (int) (Math.random() * 3);
			columna = (int) (Math.random() * 3);
			valido = Main.revisarTiradas(tablero, fila, columna);
		} while (!valido);
		anotarTiradaMaquina(tablero, fila, columna);
	}

	private static void anotarTiradaMaquina(String[][] tablero, int fila, int columna) {
		tablero[fila][columna] = " O ";

	}
}
