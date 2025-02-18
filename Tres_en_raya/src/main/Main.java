package main;

/*
 * JUEGO DEL TRES EN RAYA. Escribir un programa que simule el juego del tres en raya. El tablero será de 3*3. La partida será entre
el usuario y la máquina. El usuario tendrá la ficha ‘X’ y la máquina la ficha ‘O’.
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String tablero[][] = new String[3][3];
		Tablero.rellenarTablero(tablero);
		System.out.println("*** VISUALIZAR TABLERO ***");
		Tablero.visualizarTablero(tablero);
		jugarPartida(tablero);
		in.close();
	}

	public static boolean revisarTiradas(String[][] tablero, int fila, int columna) {
		if (tablero[fila][columna] == "   ") {
			return true;
		} else {
			return false;
		}
	}

	private static void jugarPartida(String[][] tablero) {
		String ganador;
		int rondas = 0;
		do {
			Usuario.tirarUsuario(tablero);
			rondas++;
			Tablero.visualizarTablero(tablero);
			ganador = comprobarPartida(tablero);
			if (ganador != null || rondas == 9) {
				break;
			}
			Maquina.tirarMaquina(tablero);
			rondas++;
			Tablero.visualizarTablero(tablero);
			// comprobar que me haya metido la ficha ganadora
			ganador = comprobarPartida(tablero);
			if (ganador != null || rondas == 9) {
				break;
			}
		} while (ganador == null || rondas != 9);
		asignarGanador(ganador);
	}

	public static String comprobarPartida(String[][] tablero) {
		// filas
		for (int i = 0; i < tablero.length; i++) {
			if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][0] != "   ") {
				return tablero[i][0];
			}
		}
		// columnas
		for (int i = 0; i < tablero[0].length; i++) {
			if (tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i] && tablero[0][i] != "   ") {
				return tablero[0][i];
			}
		}
		// diagonal superior derecha
		if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != "   ") {
			return tablero[0][0];
		}
		// diagonal inferior izquierda
		if (tablero[2][0] == tablero[1][1] && tablero[1][1] == tablero[0][2] && tablero[2][0] != "   ") {
			return tablero[2][0];
		}
		return null;
	}

	private static void asignarGanador(String ganador) {
		if (ganador == " X ") {
			System.out.println("Enhorabuena has ganado!!!");
		} else if (ganador == " O ") {
			System.out.println("Ha ganado la maquina...");
		} else {
			System.out.println("Ha sido un empate");
		}
	}
}
