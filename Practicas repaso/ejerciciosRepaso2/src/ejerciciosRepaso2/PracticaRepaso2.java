package ejerciciosRepaso2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticaRepaso2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("*** EJERCICIOS REPASO ***\n");
		int veces = 0;
		int opcion = 0;
		do {
			System.out.println("\n1 – Estadísticas vector\r\n" + "2 – Sumar arrays\r\n" + "3 – Ordenar vector\r\n"
					+ "4 – Estadísticas matriz\r\n" + "5 – Contar apariciones matriz\r\n" + "6 - Salir");
			do {
				try {
					System.out.print("Elegir opcion: ");
					opcion = in.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Mete un valor numerico.");
					in.nextLine();
				}
			} while (opcion < 1 || opcion > 6);
			veces++;
			switch (opcion) {
			case 1:
				Metodos.mostrarEstadisticas();
				break;
			case 2:
				Metodos.sumarArray();
				break;
			case 3:
				System.out.print("Longitud del vector: ");
				int longitud = in.nextInt();
				int[] vector = new int[longitud];
				in.nextLine();
				System.out.println("Ordenar ascendente?(true/false) ");
				Boolean ascendente = in.nextBoolean();
				System.out.println("Burbuja o Seleccion: ");
				in.nextLine();
				String algoritmo = in.nextLine().toLowerCase();
				Metodos.ordenar(vector,ascendente,algoritmo);
				break;
			case 4:
				System.out.print("Filas = ");
				int filas = in.nextInt();
				System.out.print("Columnas = ");
				int columnas = in.nextInt();
				int[][] matriz = new int[filas][columnas];
				Metodos.mostrarEstadisticasMatriz(matriz);
				break;
			case 5:
				Metodos.contarApariciones();
				break;
			case 6:
				System.out.println("Saliendo del programa, total de ejecuciones: "+veces);
			}
		} while (opcion != 6);

		in.close();
	}

}
