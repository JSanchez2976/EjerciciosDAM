package ej13;

public class Main {

	public static void main(String[] args) {
		//pelicula 1
		Pelicula pelicula1 = new Pelicula();
		pelicula1.rellenarPelicula();
		System.out.println("\n*** PELICULA 1 ***");
		pelicula1.visualizarPelicula();
		//pelicula 2		
		Pelicula pelicula2 = new Pelicula();
		pelicula2.setTitulo("El Mago de Oz");
		pelicula2.setGenero("Fantasía");
		pelicula2.setActorPrincipal(new Persona("Jorge","Sanchez",18));
		pelicula2.setDirector(new Persona("Pedro","El Director",45));
		//ver pelicula 2
		System.out.println("\n*** PELICULA 2 ***");
		System.out.println("Titulo = "+pelicula2.getTitulo());
		System.out.println("Genero = "+pelicula2.getGenero());
		System.out.println("Actor Principal = "+pelicula2.getActorPrincipal());
		System.out.println("Director = "+pelicula2.getDirector());
		//pelicula 3
		System.out.println("\n*** PELICULA 3 ***");
		Pelicula pelicula3 = new Pelicula("Gladiator","Aventura",
				new Persona("Chris","Evans",38),new Persona("Jennifer","Perez",28));
		System.out.println(pelicula3.toString());
	}

}
