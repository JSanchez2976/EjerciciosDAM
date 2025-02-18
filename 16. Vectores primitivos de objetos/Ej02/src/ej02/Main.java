package ej02;

import java.util.Scanner;

// me falta hacer que si ha dicho q pare q cree un vector para evitar el error del pointernull

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Cuantos alumnos vas a meter como maximo: ");
		int n = in.nextInt();
		Alumno[] alumnos = new Alumno[n];
		int opcion;
		do {
			System.out.println("MENU\r\n" + "1. Rellenar alumnos\r\n" + "2. Ver todos los alumnos\r\n"
					+ "3. Consultar alumno por apellido (binaria)\r\n" + "4. Ordenar por apellidos\r\n" + "5. Salir.\r\n");
			System.out.print("Elegir opci�n: ");
			opcion = in.nextInt();
			switch (opcion) {
			case 1:
				for (int i = 0; i < alumnos.length; i++) {
					alumnos[i]=new Alumno();
					alumnos[i].rellenar();
					if(i==0) {
						in.nextLine();
					}
					System.out.print("Quieres seguir metiendo alumnos?(si/no): ");
					String respuesta=in.nextLine();
					if(respuesta.equalsIgnoreCase("no")) {
						break;
					}
				}
				break;
			case 2:
				for (int i = 0; i < alumnos.length; i++) {
					System.out.println("*** ALUMNO "+i+" ***");
					alumnos[i].visualizar();
				}
				break;
			case 3:
				Alumno.consultarAlumnoPorApellido(alumnos);
				break;
			case 4:
				Alumno.ordenarPorApellido(alumnos);
				break;
			case 5:
				System.out.println("Saliendo del programa.");
				break;
			}// final del switch
		}while(opcion!=5);
		in.close();
	}

}
