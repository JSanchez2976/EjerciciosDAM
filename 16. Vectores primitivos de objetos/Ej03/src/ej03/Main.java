package ej03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		// 1. Crear
		Academia[] academias=new Academia[2];
		// 2. Rellenar los datos
		for (int i = 0; i < academias.length; i++) {
			System.out.println("RELLENAR ACADEMIA "+i+": ");
			academias[i]=new Academia();
			academias[i].rellenar();
		}
		// 3. Visualizar los datos
		for (int i = 0; i < academias.length; i++) {
			System.out.println("VISUALIZAR ACADEMIA "+i+": ");
			academias[i].visualizar();
		}
		// 4. Buscar curso y decir profesor
		//Academia.buscarCursoPorAcademia(academias);
		// 5. Buscar profesor y decir curso
		//Academia.buscarProfesorPorAcademia(academias);
		// 6. Ordenar cursos de una academia
		Academia.ordenarCursosPorAcademia(academias);
		in.close();
	}

}
