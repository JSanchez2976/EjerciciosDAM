package ej03;

import java.util.Scanner;

public class Persona {
	private String nombre;
	private String apellidos;
	
	public Persona() {
	}
	
	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	public void rellenar() {
		System.out.println("*** RELLENAR PROFESOR ***");
		Scanner in=new Scanner(System.in);
		System.out.print("Nombre = ");
		nombre=in.nextLine();
		System.out.print("Apellidos = ");
		apellidos=in.nextLine();
	}
	
	public void visualizar() {
		System.out.println("*** PROFESOR ***");
		System.out.println("Nombre = "+nombre);
		System.out.println("Apellidos = "+apellidos);
	}
}
