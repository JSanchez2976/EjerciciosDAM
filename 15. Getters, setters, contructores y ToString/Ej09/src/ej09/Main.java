package ej09;

import java.util.Scanner;

/*
 * Escribir un programa que permita escribir todas las tablas de multiplicar entre dos n�meros
introducidos por teclado. Usar la clase del ejercicio 6.
 */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Elige el numero menor: ");
		int n1 = in.nextInt();
		System.out.print("Elige el numero mayor: ");
		int n2 = in.nextInt();
		int cantidadTablas = n2 - n1 + 1;
		Tabla tablas[] = new Tabla[cantidadTablas];
		for (int i = 0; n1 <= n2; n1++) {
			System.out.println("*** TABLA DEL "+n1+" ***");
			tablas[i] = new Tabla(n1);
			tablas[i].mostrarTablaMultiplicar();
			i++;
		}
		in.close();
	}

}
