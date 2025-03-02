package ej03;

import java.util.Arrays;
import java.util.Scanner;

public class Academia {
	private String nombre;
	private String direccion;
	private Curso[] cursos;

	public Academia() {
	}

	public Academia(String nombre, String direccion, Curso[] cursos) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.cursos = cursos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		return "Academia [nombre=" + nombre + ", direccion=" + direccion + ", cursos=" + Arrays.toString(cursos) + "]";
	}

	public void rellenar() {
		Scanner in = new Scanner(System.in);
		System.out.print("Nombre = ");
		nombre = in.nextLine();
		System.out.print("Direccion =");
		direccion = in.nextLine();
		System.out.print("�Cuantos cursos tienes?: ");
		int nCursos = in.nextInt();
		this.cursos = new Curso[nCursos];
		for (int i = 0; i < cursos.length; i++) {
			cursos[i] = new Curso();
			cursos[i].rellenar();
		}
	}

	public void visualizar() {
		System.out.println("Nombre = " + nombre);
		System.out.println("Direccion = " + direccion);
		for (int i = 0; i < cursos.length; i++) {
			cursos[i].visualizar();
		}
	}

	public static void buscarCursoPorAcademia(Academia[] academias) {
		Scanner in = new Scanner(System.in);
		System.out.println("\n*** BUSCAR CURSO POR ACADEMIA ***");
		System.out.println("En que academia quieres buscar: ");
		String respuesta = in.nextLine();
		// revisar la academia que quiere
		for (int i = 0; i < academias.length; i++) {
			if (academias[i].getNombre().equalsIgnoreCase(respuesta)) {
				System.out.print("Que curso quieres buscar: ");
				String curso = in.nextLine();
				boolean encontrado = false;
				for (int j = 0; j < academias[i].getCursos().length; j++) {
					if (academias[i].getCursos()[j].getNombreCurso().equalsIgnoreCase(curso)) {
						encontrado = true;
						System.out.println("El profesor del curso es: " + academias[i].getCursos()[j].getProfesor());
					}
				}
				if (!encontrado) {
					System.out.println("No existe ese curso");
				}
			}
		}

	}

	public static void buscarProfesorPorAcademia(Academia[] academias) {
		Scanner in = new Scanner(System.in);
		boolean encontrado = false;
		System.out.println("\n *** BUSCAR PROFESOR POR ACADEMIA ***");
		System.out.print("En que academia quieres buscar: ");
		String academia = in.nextLine();
		System.out.println("Introduce el profesor a buscar :");
		String profesor = in.nextLine();
		// revisar dentro del bucle por academia
		for (int i = 0; i < academias.length; i++) {
			if (academias[i].getNombre().equalsIgnoreCase(academia)) {
				// entrar dentro de cursos
				for (int j = 0; j < academias[i].getCursos().length; j++) {
					if (academias[i].cursos[j].getProfesor().getNombre().equalsIgnoreCase(profesor)) {
						encontrado = true;
						System.out.println("Curso: " + academias[i].cursos[j].toString());
					}
				}
			}
		}
		if (!encontrado) {
			System.out.println("El profesor no existe, por lo que no proporcionamos datos del curso");
		}
	}

	public static void ordenarCursosPorAcademia(Academia[] academias) {
		Scanner in = new Scanner(System.in);
		boolean encontrado = false;
		System.out.println("\n*** ORDENAR CURSOS POR ACADEMIA ***");
		System.out.print("Que academia quieres ordenarle los cursos: ");
		String academia = in.nextLine();
		// buscar academia
		for (int i = 0; i < academias.length; i++) {
			if (academias[i].getNombre().equalsIgnoreCase(academia)) {
				encontrado = true;
				Curso[] cursos = academias[i].getCursos();
				// ordenarle los cursos
				for (int j = 1; j < cursos.length; j++) {
					// ordenar cursos
					for (int j2 = cursos.length - 1; j2 >= j; j2--) {
						if (cursos[j2].getNombreCurso()
								.compareTo(cursos[j2 - 1].getNombreCurso()) < 0) {
							Curso curso2 = cursos[j2];
							cursos[j2]=cursos[j2-1];
							cursos[j2-1]=curso2;
						}
					}
				}
				// ver cursos academia ( no pon�a que lo haga)
				for (int j = 0; j < cursos.length; j++) {
					System.out.println(cursos[j].toString());
				}
				break;
			}
		}
		if (!encontrado) {
			System.out.println("La academia no ha sido encontrada");
		}

	}
}
