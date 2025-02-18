package ej02;

public class Main {

	public static void main(String[] args) {
		Contador contador1=new Contador();
		System.out.println("Contador sin modificar: "+contador1.getContador());
		contador1.incrementar();
		System.out.println("Contador incrementado: "+contador1.getContador());
		contador1.decrementar();
		contador1.decrementar();
		System.out.println("Contador decrementado: "+contador1.getContador());
	}

}
