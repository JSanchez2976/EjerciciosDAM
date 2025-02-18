package ej06;
/*
 * 6. Crea una clase de nombre Tabla que contenga:
Atributo: un n�mero,
constructor para inicializar a cero y otro para darle un valor,
M�todo que muestre su tabla de multiplicar y un m�todo toString().
Desde el main pide un n�mero y muestra su tabla.
 */
public class Tabla {
	private int numero;
	public Tabla() {
	}
	public Tabla(int numero) {
		this.numero=numero;
	}
	@Override
	public String toString() {
		return "Tabla [numero=" + numero + "]";
	}
	
	public void mostrarTablaMultiplicar() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i+" * "+numero+" = "+(i*numero));
		}
	}
}
