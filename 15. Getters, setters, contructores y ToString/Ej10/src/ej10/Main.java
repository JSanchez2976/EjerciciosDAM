package ej10;

import java.util.Scanner;

/*
 * Realizar un programa que lance un dado, mostrando por pantalla la cara del dado. A continuación, se
preguntará al usuario si desea seguir jugando. Si la respuesta es afirmativa, el programa volverá a
lanzar el dado, procediendo de forma análoga hasta que el usuario quiera.
Se aconseja estructurar el programa en dos clases, cada una en un archivo java:
Principal, contendrá el método main y se encargará de interrogar al usuario e invocar los
métodos de dado.
Dado, que dispondrá de los siguientes métodos:
 public Dado(): Constructor que creará un elemento random(), que generará un
número aleatorio entre 1 y 6, invocando al método dibujar_() que corresponda.
 void dibujarUno(),void dibujarDos(),..., void dibujarSeis():
métodos que imprimirán por pantalla los dados respectivamente.
 */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String respuesta;
		do {
			Dado dado = new Dado();
			dado.dibujar();
			do {
				System.out.print("¿Quieres seguir jugando?: ");
				respuesta = in.nextLine();
				if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
					System.out.println("Debes responder con 'si' o 'no'");
				}
			} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));
		} while (respuesta.equalsIgnoreCase("si"));
		in.close();
	}

}
