package ej13;

import java.util.Scanner;

public class Pelicula {
	private String titulo;
	private String genero;
	private Persona actorPrincipal;
	private Persona director;
	
	public Pelicula() {
		this.actorPrincipal=new Persona();
		this.director=new Persona();
	}

	public Pelicula(String titulo, String genero, Persona actorPrincipal, Persona director) {
		this.titulo = titulo;
		this.genero = genero;
		this.actorPrincipal = actorPrincipal;
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Persona getActorPrincipal() {
		return actorPrincipal;
	}

	public void setActorPrincipal(Persona actorPrincipal) {
		this.actorPrincipal = actorPrincipal;
	}

	public Persona getDirector() {
		return director;
	}

	public void setDirector(Persona director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Pelicula [Titulo=" + titulo + ", Genero=" + genero + ", actorPrincipal=" + actorPrincipal
				+ ", director=" + director + "]";
	}
	
	public void rellenarPelicula() {
		Scanner in=new Scanner(System.in);
		System.out.print("Titulo = ");
		titulo=in.nextLine();
		System.out.print("Genero  = ");
		genero=in.nextLine();
		System.out.println("Actor principal: ");
		actorPrincipal.rellenarPersona();
		System.out.println("Director: ");
		director.rellenarPersona();
	}
	
	public void visualizarPelicula() {
		System.out.println("Titulo = "+titulo);
		System.out.println("Genero = "+genero);
		System.out.println("Actor principal =  "+actorPrincipal.toString());
		System.out.println("Director = "+director.toString());
	}
}