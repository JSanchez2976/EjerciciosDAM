package ej04;

import java.util.Arrays;
import java.util.Scanner;

public class Academia {
	private String nombreAcademia;
	private String direccion;
	private Curso[] cursos;
	
	public Academia() {
		this.nombreAcademia="";
		this.direccion="";
		this.cursos=new Curso[10]; // por poner cantidad
	}

	public Academia(String nombreAcademia, String direccion, Curso[] cursos) {
		this.nombreAcademia = nombreAcademia;
		this.direccion = direccion;
		this.cursos = cursos;
	}

	public String getNombreAcademia() {
		return nombreAcademia;
	}

	public void setNombreAcademia(String nombreAcademia) {
		this.nombreAcademia = nombreAcademia;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Curso[] getCursos() {
		return cursos;
	}

	public void setCursos(Curso[] cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Academia [nombreAcademia=" + nombreAcademia + ", direccion=" + direccion + ", cursos="
				+ Arrays.toString(cursos) + "]";
	}
	
	public void rellenarAcademia() {
		Scanner in=new Scanner(System.in);
		System.out.println("*** RELLENAR ACADEMIA ***\n");
		System.out.print("Nombre de la academia = ");
		nombreAcademia=in.nextLine();
		System.out.print("Direccion = ");
		direccion = in.nextLine();
		System.out.print("Cuantos cursos hay? = ");
		int nCursos = in.nextInt();
		this.cursos=new Curso[nCursos];
		for (int i = 0; i < cursos.length; i++) {
			cursos[i]= new Curso();
			cursos[i].rellenarCurso();
		}
	}
	
	public void visualizarAcademia() {
		System.out.println("*** VISUALIZAR ACADEMIA ***");
		System.out.println("Nombre ="+nombreAcademia);
		System.out.println("Direccion = "+direccion);
		for (int i = 0; i < cursos.length; i++) {
			cursos[i].visualizarCurso();
		}
	}
}
