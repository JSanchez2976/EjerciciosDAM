package ej12;

import java.util.Scanner;

public class Fecha {
	private int dia;
	private int mes;
	private int año;

	public Fecha() {
	}

	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", año=" + año + "]";
	}

	public void rellenarFecha() {
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("Dia = ");
			dia = in.nextInt();
			if (dia < 1 || dia > 31) {
				System.out.println("Introduce un día correcto");
			}
		} while (dia < 1 || dia > 31);

		do {
			System.out.print("Mes = ");
			mes = in.nextInt();
			if (mes < 1 || mes > 12) {
				System.out.println("Introduce un mes correcto");
			}
		} while (mes < 1 || mes > 12);

		do {
			System.out.print("Año = ");
			año = in.nextInt();
			if (año > 2025) {
				System.out.println("Introduce un año correcto");
			}
		} while (año > 2025);
	}

	public String visualizarFecha() {
		return "(" + dia + "/" + mes + "/" + año+")";
	}
}
