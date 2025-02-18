package ej04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int dia,mes,año;
		Fecha fecha1;
		do {
			System.out.println("FECHA 1: ");
			System.out.print("Dia: ");
			dia=in.nextInt();
			System.out.print("Mes: ");
			mes=in.nextInt();
			System.out.print("Año: ");
			año=in.nextInt();
			fecha1=new Fecha(dia,mes,año);
			System.out.println("Comprobar fecha: "+fecha1.comprobarFecha());
		}while(fecha1.comprobarFecha().equals("incorrecta"));
		System.out.println(fecha1.toString());
		System.out.println("FECHA MODIFICADA: ");
		fecha1.modificarFecha();
		System.out.println(fecha1.toString());
		in.close();
	}

}
