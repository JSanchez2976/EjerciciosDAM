package ej04;

import java.util.Scanner;

/*
 *  Crear un objeto de tipo centrosDeFormacion,
 Rellenar los datos del objeto
 Visualizar todos los datos.
 Muestra el centro que más cursos tiene
 Lee por teclado el nombre de un curso y muestra los profesores que lo imparten y en que
academia se imparte.
 Ordenar las academias en orden creciente y por cada academia ordenar los profesores por nombre
 */

// NOTA: Tener en cuenta que falta el control de errores en el ejercicio.
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Crear un objeto de tipo centrosDeFormacion
		CentrosDeFormacion centro = new CentrosDeFormacion();

		// Rellenar los datos del objeto
		centro.rellenarCentros();

		// Visualizar todos los datos
		centro.visualizarCentros();

		// Muestra el centro que más cursos tiene
		Academia[] academias = centro.getAcademias();
		boolean primeraVez = true;
		int nCursosMax = 0;
		String nombreAcademiaMax = "";
		for (int i = 0; i < academias.length; i++) {
			int nCursos = academias[i].getCursos().length;
			if (primeraVez) {
				primeraVez = false;
				nCursosMax = nCursos;
				nombreAcademiaMax = academias[i].getNombreAcademia();
			} else if (nCursosMax < nCursos) {
				nCursosMax = nCursos;
				nombreAcademiaMax = academias[i].getNombreAcademia();
			}
		}
		System.out.println("La academia " + nombreAcademiaMax + ", que tiene " + nCursosMax
				+ " cursos es la que más cursos tiene.");

		/*
		 * Lee por teclado el nombre de un curso y muestra los profesores que lo
		 * imparten y en que academia se imparte.
		 */
		System.out.print("\nDe que curso quieres ver los profesores? : ");
		String curso = in.nextLine();
		// buscar el curso en academias
		for (int i = 0; i < academias.length; i++) {
			//entrar en cursos
			Curso [] cursos = academias[i].getCursos();
			for (int j = 0; j < cursos.length; j++) {
				if(cursos[j].getNombre().equalsIgnoreCase(curso)) {
					Profesor[] profesores = cursos[j].getProfesores();
					for (int k = 0; k < profesores.length; k++) {
						System.out.println("Los profesores son: "+profesores[k].getNombre());
					}
					System.out.println("La academia en la que se imparte es: "+academias[i].getNombreAcademia());
				}
			}
		}
		
		// Ordenar las academias en orden creciente y por cada academia ordenar los profesores por nombre
		// Academias creciente
		for (int i = 1; i < academias.length; i++) {
			for (int j = academias.length-1;j>=i; j--) {
				if(academias[j].getNombreAcademia().compareTo(academias[j-1].getNombreAcademia())<0) {
					Academia aux = academias[j];
					academias[j]=academias[j-1];
					academias[j-1]=aux;
				}
			}
		}
		// Profesores por nombre
		for (int i = 0; i < academias.length; i++) {
			Curso [] cursos = academias[i].getCursos();
			// Entrar en cursos
			for (int j = 0; j < cursos.length; j++) {
				Profesor[] profesores = cursos[j].getProfesores();
				// Binaria con profesores
				for (int k = 1; k < profesores.length; k++) {
					for (int k2 = profesores.length-1;k2>=k; k2--) {
						if(profesores[k2].getNombre().compareTo(profesores[k2-1].getNombre())<0) {
							Profesor aux = profesores[k2];
							profesores [k2] = profesores[k2-1];
							profesores[k2-1]=aux;
						}
					}
				}
			}
		}
		
		// Visualizar todos los datos
		centro.visualizarCentros();
		in.close();
	}

}
