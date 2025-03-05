package ejerciciosInventados;

import java.util.Scanner;

public class Metodos {
	static Scanner in = new Scanner(System.in);

	public static void ordenarMatriz() {
		System.out.println("Filas de la matriz: ");
		int filas = in.nextInt();
		System.out.println("Columnas de la matriz: ");
		int columnas = in.nextInt();
		int[][] matriz = new int[filas][columnas];

		// rellenar matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.println("Matriz [" + i + "]" + "[" + j + "] = ");
				matriz[i][j] = in.nextInt();
			}
		}

		// crear vector tamaño matriz
		int[] vector = new int[matriz.length * matriz[0].length];

		// rellenar vector
		int contadorVector = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				vector[contadorVector] = matriz[i][j];
				contadorVector++;
			}
		}

		// ordenar Vector
		for (int i = 1; i < vector.length; i++) {
			for (int j = vector.length - 1; j >= i; j--) {
				if (vector[j] < vector[j - 1]) {
					int aux = vector[j];
					vector[j] = vector[j - 1];
					vector[j - 1] = aux;
				}
			}
		}

		// ver vector
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Valor " + i + " = " + vector[i]);
		}

		// meter en matriz de vuelta
		contadorVector = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = vector[contadorVector];
				contadorVector++;
			}
		}

		// ver matriz
		System.out.println("\nVER VALORES DE LA MATRIZ: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print("Matriz [" + i + "]" + "[" + j + "] = " + matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void contarVecesNumero() {
		System.out.println("Cuantos numeros vas a meter: ");
		int n = in.nextInt();
		int[] vector = new int[n];

		// rellenar vector
		for (int i = 0; i < vector.length; i++) {
			System.out.print("Valor " + i + " = ");
			vector[i] = in.nextInt();
		}

		// ordenar numeros (porque he querido)
		for (int i = 0; i < vector.length; i++) {
			for (int j = vector.length - 1; j > i; j--) {
				if (vector[j] < vector[j - 1]) {
					int aux = vector[j];
					vector[j] = vector[j - 1];
					vector[j - 1] = aux;
				}
			}
		}

		// contar por cada uno
		for (int i = 0; i < vector.length; i++) {
			boolean contado = false;
			// mirar si ya se ha contado
			for (int j = 0; j < i; j++) {
				if (vector[j] == vector[i]) {
					contado = true;
				}
			}
			// si no ha salido ya
			if (!contado) {
				int contador = 0;
				for (int j = 0; j < vector.length; j++) {
					if (vector[i] == vector[j]) {
						contador++;
					}
				}
				System.out.println("El número " + vector[i] + " aparece un total de " + contador + " veces");
			}
		}
	}

	public static void buscarPalabraPorPatron() {
		System.out.println("Tamaño del vector: ");
		int n = in.nextInt();
		in.nextLine();
		String vector[] = new String[n];

		// rellenar vector
		for (int i = 0; i < vector.length; i++) {
			System.out.print("Valor " + i + " = ");
			vector[i] = in.nextLine();
		}

		System.out.print("Patron a buscar: ");
		String patron = in.nextLine();

		// BUSCAR PATRÓN

		// entrar en vector
		for (int i = 0; i < vector.length; i++) {

			// tamaño de la palabra en vector - tamaño patron (para no sobrepasar bordes)
			for (int j = 0; j <= vector[i].length() - patron.length(); j++) {
				int contador = 0;
				for (int j2 = 0; j2 < patron.length(); j2++) {
					if (vector[i].charAt(j + j2) == patron.charAt(j2)) {
						contador++;
					}
				}
				if (contador == patron.length()) {
					System.out.println("Patron encontrado en la palabra: " + vector[i]);
					break;
				}
			}
		}
	}

}
