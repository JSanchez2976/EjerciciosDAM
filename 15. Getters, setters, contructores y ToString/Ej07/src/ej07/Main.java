package ej07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int aprobados=0;
		int suspendidos=0;
		System.out.println("Cuantos alumnos vas a meter: ");
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
		}
		System.out.println("Total de aprobados: "+aprobados);
		System.out.println("Total de suspendidos: "+suspendidos);
		in.close();
	}

}
