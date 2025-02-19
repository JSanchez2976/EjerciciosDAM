package ej04;

import java.util.Arrays;
import java.util.Scanner;

public class Curso {
	private String Nombre; // en las indicaciones ponía que el nombre fuera en mayusculas
	private Profesor[] profesores;
	
	public Curso() {
	}

	public Curso(String nombre, Profesor[] profesores) {
		Nombre = nombre;
		this.profesores = profesores;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Profesor[] getProfesores() {
		return profesores;
	}

	public void setProfesores(Profesor[] profesores) {
		this.profesores = profesores;
	}

	@Override
	public String toString() {
		return "Curso [Nombre=" + Nombre + ", profesores=" + Arrays.toString(profesores) + "]";
	}
	
	public void rellenarCurso() {
		Scanner in=new Scanner(System.in);
		System.out.println("*** RELLENAR CURSO ***\n");
		System.out.print("Nombre del curso = ");
		Nombre=in.nextLine();
		System.out.print("Cuantos profesores hay? = ");
		int nProfesores=in.nextInt();
		this.profesores=new Profesor[nProfesores];
		for (int i = 0; i < profesores.length; i++) {
			profesores[i]= new Profesor();
			profesores[i].rellenarProfesor();
		}
	}
	
	public void visualizarCurso() {
		System.out.println("*** VISUALIZAR CURSO ***");
		System.out.println("Nombre = "+Nombre);
		for (int i = 0; i < profesores.length; i++) {
			profesores[i].visualizarProfesor();
		}
	}
}
