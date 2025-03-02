package ejerciciosRepaso2;

import java.util.Scanner;

public class Metodos {

	public static void mostrarEstadisticas() {
		Scanner in = new Scanner(System.in);

	}

	public static void sumarArray() {
		Scanner in = new Scanner(System.in);
		System.out.print("Tamaño del primero: ");
		int tamaño1 = in.nextInt();
		System.out.print("Tamaño del segundo: ");
		int tamaño2 = in.nextInt();
		int max;
		int min;
		if (tamaño1 > tamaño2) {
			max = tamaño1;
			min = tamaño2;
		} else {
			min = tamaño1;
			max = tamaño2;
		}
		int[] mayor = new int[max];
		int[] menor = new int[min];
		int[] sumado = new int[max];
		// rellenar arrays
		System.out.println("ARRAY GRANDE");
		for (int i = 0; i < mayor.length; i++) {
			System.out.print("Valor " + i + " = ");
			mayor[i] = in.nextInt();
		}
		System.out.println("ARRAY PEQUEÑO");
		for (int i = 0; i < menor.length; i++) {
			System.out.print("Valor " + i + " = ");
			menor[i] = in.nextInt();
		}
		// sumar
		for (int i = 0; i < mayor.length; i++) {
			if (i < menor.length) {
				sumado[i] = mayor[i] + menor[i];

			} else {
				sumado[i] = mayor[i];
			}
		}
		// mostrar
		for (int i = 0; i < sumado.length; i++) {
			System.out.println("Valor " + i + " = " + sumado[i]);
		}
	}

	public static void ordenar(int[] vector, Boolean ascendente, String algoritmo) {
		Scanner in = new Scanner(System.in);
		int contador = 0;
		// rellenar vector
		for (int i = 0; i < vector.length; i++) {
			System.out.print("Valor " + i + " = ");
			vector[i] = in.nextInt();
		}

		if (algoritmo.equalsIgnoreCase("burbuja")) {
			if (ascendente) {
				for (int i = 1; i < vector.length; i++) {
					for (int j = vector.length - 1; j >= i; j--) {
						if (vector[j] < vector[j - 1]) {
							int aux = vector[j];
							vector[j] = vector[j - 1];
							vector[j - 1] = aux;
							contador++;
						}
					}
				}
			} else {
				for (int i = 1; i < vector.length; i++) {
					for (int j = vector.length - 1; j >= i; j--) {
						if (vector[j] > vector[j - 1]) {
							int aux = vector[j];
							vector[j] = vector[j - 1];
							vector[j - 1] = aux;
							contador++;
						}
					}
				}
			}
		}
		// ver vector
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Valor " + i + " = " + vector[i]);
		}
		System.out.println("Numero de cambios = " + contador);
	}

	public static void mostrarEstadisticasMatriz(int[][] matriz) {
		Scanner in = new Scanner(System.in);
		// rellenar matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print("[" + i + "]" + "[" + j + "]" + " = ");
				matriz[i][j] = in.nextInt();
			}
		}
		// mayor y menor valor
		System.out.println("\nMAYOR Y MENOR VALOR: ");
		int mayor = 0;
		int menor = 0;
		boolean primeraVez = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (primeraVez) {
					mayor = matriz[i][j];
					menor = matriz[i][j];
					primeraVez = false;
				} else {
					if (mayor < matriz[i][j]) {
						mayor = matriz[i][j];
					}
					if (menor > matriz[i][j]) {
						menor = matriz[i][j];
					}
				}
			}
		}
		System.out.println("El mayor de la matriz es: " + mayor);
		System.out.println("El menor de la matriz es: " + menor);

		// media y producto de los elementos
		System.out.println("\nMEDIA Y PRODUCTO: ");
		int suma = 0;
		int producto = 1;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				suma += matriz[i][j];
				producto *= matriz[i][j];
			}
		}
		int media = suma / (matriz.length * matriz[0].length);
		System.out.println("Media de la matriz: " + media);
		System.out.println("Producto de la matriz: " + producto);

		// suma de filas y columnas

		// filas
		System.out.println("\nSUMA DE FILAS: ");
		for (int i = 0; i < matriz.length; i++) {
			suma = 0;
			for (int j = 0; j < matriz[0].length; j++) {
				suma += matriz[i][j];
			}
			System.out.println("La suma de la fila " + i + " es: " + suma);
		}
		// columnas
		System.out.println("\nSUMA DE COLUMNAS: ");
		for (int i = 0; i < matriz[0].length; i++) {
			suma = 0;
			for (int j = 0; j < matriz.length; j++) {
				suma += matriz[j][i];
			}
			System.out.println("La suma de la columna " + i + " es: " + suma);
		}

		// valores repetidos en fila
		System.out.println("\nVALORES REPETIDOS EN FILA: ");
		for (int i = 0; i < matriz.length; i++) {
			boolean repetido = false;
			// revisar
			for (int j = 0; j < matriz[0].length; j++) {
				for (int k = 0; k < j; k++) {
					if (matriz[i][j] == matriz[i][k]) {
						repetido = true;
					}
				}
			}
			if (repetido) {
				System.out.println("Valores repetidos en la fila " + i);
			} else {
				System.out.println("Valores sin repetir en la fila " + i);
			}
		}

		// valores repetidos en columna
		System.out.println("\nVALORES REPETIDOS EN COLUMNA: ");
		for (int i = 0; i < matriz[0].length; i++) {
			boolean repetido = false;
			// revisar
			for (int j = 0; j < matriz.length; j++) {
				for (int k = 0; k < j; k++) {
					if (matriz[j][i] == matriz[k][i]) {
						repetido = true;
					}
				}
			}
			if (repetido) {
				System.out.println("Valores repetidos en la columna " + i);
			} else {
				System.out.println("Valores sin repetir en la columna " + i);
			}
		}

	}

	public static void contarApariciones() {
		Scanner in = new Scanner(System.in);
		System.out.print("Filas = ");
		int filas = in.nextInt();
		System.out.print("Columnas = ");
		int columnas = in.nextInt();
		int[][] matriz = new int[filas][columnas];
		//rellenar matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print("[" + i + "]" + "[" + j + "]" + " = ");
				matriz[i][j] = in.nextInt();
			}
		}
		System.out.print("Cuantos valores vas a buscar: ");
		int cantidad = in.nextInt();
		int[] numeros = new int[cantidad];
		for (int i = 0; i < cantidad; i++) {
			System.out.print("Valor " + (i + 1) + " = ");
			numeros[i] = in.nextInt();
		}
		// revisar apariciones
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Valor "+numeros[i]+": ");
			int contador = 0;
			for (int j = 0; j < matriz.length; j++) {
				for (int k = 0; k < matriz[0].length; k++) {
					if (numeros[i] == matriz[j][k]) {
						contador++;
						System.out.println("Posicion: ["+j+"] ["+k+"]");
					}
				}
			}
			System.out.println("El numero "+numeros[i]+" se repite "+contador+" veces");
		}

	}

}
