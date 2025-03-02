package ej08;

import java.util.Scanner;

/*
 * Crear la clase Alumno que contenga:
Los atributos nombre, apellidos, nota (valor comprendido entre1 y 10)
Constructores, getters y setters y toString()
M�todos:
void rellenarAlumno()
void visualizarAlumno()
boolean promociona()que devuelve un valor true si supera el cinco (valor
almacenado en el campo nota) o false en caso contrario.
Introducir los datos de todos los alumnos de un aula (valor introducido previamente por teclado).
Visualizar la cantidad de alumnos aprobados y el n�mero de alumnos suspendidos. 
 */
public class Alumno {
	private String nombre;
	private String apellidos;
	private double nota;
	private double notaMin;
	
	public Alumno() {
	}

	public Alumno(String nombre, String apellidos, double nota) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		setNota(nota,notaMin);
	}

	public void setNota(double nota,double notaMin) {
		if (nota >= 1 && nota <= 10) {
			this.nota = nota;
			this.notaMin=10-nota;
		} else {
			System.out.println("ERROR: La nota debe estar entre 1 y 10. Se establecer� en 1 por defecto.");
			this.nota = 1;
			this.notaMin=9;
		}
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

	public double getNota() {
		return nota;
	}

	

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", nota=" + nota + ", notaMin=" + notaMin
				+ "]";
	}

	public void rellenarAlumno() {
		Scanner in = new Scanner(System.in);
		System.out.print("Nombre: ");
		nombre = in.nextLine();
		System.out.print("Apellidos: ");
		apellidos = in.nextLine();
		do {
			System.out.print("Nota: ");
			nota = in.nextDouble();
			if (nota < 1 || nota > 10) {
				System.out.println("ERROR, la nota debe estar comprendida entre 1 y 10");
			}
		} while (nota < 1 || nota > 10);
		setNota(nota,notaMin);
	}

	public void visualizarAlumno() {
		System.out.println("Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", nota=" + nota + "]");
	}

	public boolean promociona() {
		boolean promociona;
		if (nota >= 5) {
			promociona = true;
		} else {
			promociona = false;
		}
		return promociona;
	}

}
