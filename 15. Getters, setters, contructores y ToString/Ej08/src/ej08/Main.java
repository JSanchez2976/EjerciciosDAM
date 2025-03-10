package ej08;

import java.util.Scanner;

/*
 * Modificar la clase anterior a�adiendo un campo nuevo de nombre notaMinima que permita
almacenar la nota m�nima que cada alumno deber�a alcanzar para estar aprobado. A diferencia del
enunciado anterior, en este ejemplo el proceso finalizar cuando el usuario responda �No� a la pregunta
��Deseas introducir otro alumno?�.
 */

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int aprobados=0;
		int suspendidos=0;
		System.out.println("Cuantos alumnos vas a meter como maximo: ");
		int numeroAlumnos=in.nextInt();
		Alumno alumnos[]=new Alumno[numeroAlumnos];
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i]=new Alumno();
			alumnos[i].rellenarAlumno();
			System.out.println("Promociona: "+alumnos[i].promociona());
			if(alumnos[i].promociona()==true) {
				aprobados++;
			} else {
				suspendidos++;
			}
			System.out.println(alumnos[i].toString());
			in.nextLine();
			System.out.print("�Deseas introducir otro alumno? ");
			String respuesta=in.nextLine();
			if(respuesta.equalsIgnoreCase("No")) {
				break;
			}
		}
		System.out.println("Total de aprobados: "+aprobados);
		System.out.println("Total de suspendidos: "+suspendidos);
		in.close();
	}

}
