package ej11;

/*
 * Cree un programa que genere 10 letras de forma aleatoria e imprima para cada letra si es una vocal o
una consonante. Para esto crear una clase de nombre Aleatorio en donde se genere la letra
aleatoria en el constructor de la clase y se visualice si es consonante o vocal en un método de nombre
tipoLetra.
 */
public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Aleatorio letra=new Aleatorio();
			System.out.println(letra.toString());
			letra.TipoLetra();
		}

	}

}
