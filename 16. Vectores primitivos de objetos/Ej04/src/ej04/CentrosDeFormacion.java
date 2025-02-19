package ej04;

import java.util.Arrays;
import java.util.Scanner;

public class CentrosDeFormacion {
	private String provincia;
	private Academia[] academias;
	
	public CentrosDeFormacion(String provincia, Academia[] academias) {
		this.provincia = provincia;
		this.academias = academias;
	}
	
	public CentrosDeFormacion() {
		this.provincia="";
		this.academias=new Academia[10]; // por poner alguna cantidad
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Academia[] getAcademias() {
		return academias;
	}

	public void setAcademias(Academia[] academias) {
		this.academias = academias;
	}

	@Override
	public String toString() {
		return "CentrosDeFormacion [provincia=" + provincia + ", academias=" + Arrays.toString(academias) + "]";
	}
	
	public void rellenarCentros() {
		Scanner in=new Scanner(System.in);
		System.out.println("\n*** RELLENAR CENTROS ***");
		System.out.print("Provincia = ");
		provincia=in.nextLine();
		System.out.print("Cuantas academias? = ");
		int numeroAcademias=in.nextInt();
		this.academias= new Academia[numeroAcademias];
		for (int i = 0; i < academias.length; i++) {
			academias[i]=new Academia();
			academias[i].rellenarAcademia();
		}
	}
	
	public void visualizarCentros() {
		System.out.println("\n*** VISUALIZAR CENTRO ***");
		System.out.println("Provincia = "+provincia);
		for (int i = 0; i < academias.length; i++) {
			academias[i].visualizarAcademia();
		}
		
	}
}
