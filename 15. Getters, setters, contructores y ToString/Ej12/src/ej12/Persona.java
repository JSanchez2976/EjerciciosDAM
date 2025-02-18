package ej12;

import java.util.Scanner;

public class Persona {
	private String nombre;
	private String apellido;
	private Fecha fecha_nacimiento;

	public Persona() {
		this.fecha_nacimiento=new Fecha();
	}

	public Persona(String nombre, String apellido, Fecha fecha_nacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nacimiento = fecha_nacimiento;
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

	public Fecha getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Fecha fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", fecha_nacimiento=" + fecha_nacimiento + "]";
	}

	public void rellenarPersona() {
		Scanner in = new Scanner(System.in);
		System.out.println("Nombre = ");
		nombre = in.nextLine();
		System.out.println("Apellido = ");
		apellido = in.nextLine();
		System.out.println("Fecha nacimiento: ");
		fecha_nacimiento.rellenarFecha();
	}

	public void visualizarPersona() {
		System.out.println("Nombre = " + nombre + ", Apellido = " + apellido + ", Fecha de nacimiento = "
				+ fecha_nacimiento.visualizarFecha());
	}
}