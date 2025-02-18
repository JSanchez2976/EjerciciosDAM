package ej13;

import java.util.Scanner;

public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Persona() {
	}

	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

	public void rellenarPersona() {
		Scanner in=new Scanner(System.in);
		System.out.print("Nombre = ");
		nombre=in.nextLine();
		System.out.print("Apellidos = ");
		apellidos=in.nextLine();
		System.out.print("Edad = ");
		edad=in.nextInt();
	}
	
	public void visualizarPersona() {
		System.out.println("Nombre = "+nombre);
		System.out.println("Apellidos = "+apellidos);
		System.out.println("Edad = "+edad);
	}
}