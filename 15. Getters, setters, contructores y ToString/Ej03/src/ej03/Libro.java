package ej03;

/*
 * Crea una clase Libro que contenga:
Los atributos título, autor, estado de libro (true si está disponible o false si está prestado)
Métodos: métodos getters y setters y toString().
Constructores: un constructor por defecto, un constructor con parámetros.
Desde el main(), crear dos libros y mostrar si están prestados o no.
 */
public class Libro {
	private String libro;
	private String autor;
	private boolean estado;

	public Libro() {
	}

	public Libro(String libro, String autor, boolean estado) {
		this.libro = libro;
		this.autor = autor;
		this.estado = estado;
	}

	public String getLibro() {
		return libro;
	}

	public void setLibro(String libro) {
		this.libro = libro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public void prestar(){
		this.estado=false;
	}
	public void devolver(){
		this.estado=true;
	}
}
