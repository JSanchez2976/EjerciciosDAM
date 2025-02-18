package ej05;

public class Main {

	public static void main(String[] args) {
		Linea linea1=new Linea(6);
		System.out.println("LINEA 1: ");
		System.out.println(linea1.crearLineas());
		Linea linea2=new Linea();
		System.out.println("LINEA 2: ");
		System.out.print(linea2.crearLineas());
	}

}
