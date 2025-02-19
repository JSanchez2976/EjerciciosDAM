package ej04;

/*
 *  Crear un objeto de tipo centrosDeFormacion,
 Rellenar los datos del objeto
 Visualizar todos los datos.
 Muestra el centro que más cursos tiene
 Lee por teclado el nombre de un curso y muestra los profesores que lo imparten y en que
academia se imparte.
 Ordenar las academias en orden creciente y por cada academia ordenar los profesores por nombre
 */
public class Main {

	public static void main(String[] args) {
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
		String nombreAcademiaMax="";
		for (int i = 0; i < academias.length; i++) {
			int nCursos = academias[i].getCursos().length;
			if (primeraVez) {
				primeraVez = false;
				nCursosMax = nCursos;
				nombreAcademiaMax=academias[i].getNombreAcademia();
			} else if (nCursosMax < nCursos) {
				nCursosMax = nCursos;
				nombreAcademiaMax=academias[i].getNombreAcademia();
			}
		}
		System.out.println("La academia "+nombreAcademiaMax+", que tiene "+nCursosMax+" cursos es la que más cursos tiene.");
	}

}
