package ej03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Libro libro1=new Libro("El Quijote","Jorge",true);
		System.out.println("Libro 1: "+libro1.isEstado());
		System.out.print("Quieres tomar prestado el libro?");
		String respuesta=in.nextLine().toLowerCase();
		if(respuesta.equals("si")) {
			libro1.prestar();
			System.out.print("Libro 1: "+libro1.isEstado());
		}
		
		in.close();
	}

}
