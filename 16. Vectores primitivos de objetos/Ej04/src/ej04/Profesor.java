package ej04;

import java.util.Scanner;

public class Profesor {
	private String nombre;
	private String apellido;
	
	public Profesor() {
	}

	public Profesor(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	public void rellenarProfesor() {
		Scanner in = new Scanner(System.in);
		System.out.println("*** RELLENAR PROFESOR ***\n");
		System.out.print("Nombre = ");
		nombre=in.nextLine();
		System.out.print("Apellido = ");
		apellido=in.nextLine();
	}
	
	public void visualizarProfesor() {
		System.out.println("*** VISUALIZAR PROFESOR ***");
		System.out.println("Nombre = "+nombre);
		System.out.println("Apellido = "+apellido);
	}
}
