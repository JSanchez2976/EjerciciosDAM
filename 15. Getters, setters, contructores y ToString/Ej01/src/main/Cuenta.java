package main;

import java.util.Scanner;

/*
 * Crea una clase Cuenta que contenga:
Los atributos: número de cuenta y saldo
Los métodos: ingreso(), reintegro(), rellenar(), visualizar().
Un constructor por defecto y un constructor con parámetros
Los métodos getters y setters y toString().
Desde el main(), crear 3 objetos de la clase y haz uso de todos los métodos anteriores
 */
public class Cuenta {
	int numeroCuenta;
	double saldo;
	public Scanner in=new Scanner(System.in);
	public Cuenta() {
	}

	public Cuenta(int numeroCuenta, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + "]";
	}

	public void rellenar() {
		System.out.print("Numero de cuenta: ");
		numeroCuenta=in.nextInt();
		System.out.print("Saldo: ");
		saldo=in.nextDouble();
	}
	public void visualizar() {
		System.out.println("Numero de cuenta: "+numeroCuenta);
		System.out.printf("Saldo: %.2f",saldo);
	}
	public void ingresar() {
		double ingreso;
		do {
			System.out.print("Cuanto quieres ingresar: ");
			ingreso=in.nextDouble();
			if(ingreso<0) {
				System.out.println("No puedes ingresar menos de 0€");
			}
		}while(ingreso<0);
		saldo+=ingreso;
	}
	public void reintegrar() {
		double reintegro;
		do {
			System.out.print("Cuanto quieres recibir: ");
			reintegro=in.nextDouble();
			if(reintegro>saldo) {
				System.out.println("Error, no puedes recibir más dinero del que tienes en la cuenta ("+saldo+")");
			}
		}while(reintegro>saldo);
		saldo-=reintegro;
	}
}
