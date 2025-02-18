package ej10;

public class Dado {
	private int numero;

	public Dado() {
		this.numero = (int) (Math.random() * 6) + 1;
	}

	public void dibujar() {
		switch (numero) {
		case 1:
			dibujarUno();
			break;
		case 2:
			dibujarDos();
			break;
		case 3:
			dibujarTres();
			break;
		case 4:
			dibujarCuatro();
			break;
		case 5:
			dibujarCinco();
			break;
		case 6:
			dibujarSeis();
			break;
		}// final del switch

	}

	private void dibujarSeis() {
		System.out.println("6");

	}

	private void dibujarCinco() {
		System.out.println("5");

	}

	private void dibujarCuatro() {
		System.out.println("4");

	}

	private void dibujarTres() {
		System.out.println("3");

	}

	private void dibujarDos() {
		System.out.println("2");

	}

	private void dibujarUno() {
		System.out.println("1");

	}
}
