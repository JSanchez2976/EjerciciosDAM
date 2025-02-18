package ej04;

/*
 * Crea una clase Fecha que contenga:
Los atributos: dia, mes y año.
Constructores: Un constructor por defecto y un constructor con parámetros.
Métodos: setters y getters y el método toString(), un método para comprobar si la fecha
es correcta y otro para modificar la fecha actual por la del día siguiente.
Desde la clase principal hacer uso de la clase. Leer una fecha de teclado y comprobar si es correcta o
no
 */
public class Fecha {
	private int dia;
	private int mes;
	private int año;

	public Fecha() {
	}

	public Fecha(int fecha, int mes, int año) {
		this.dia = fecha;
		this.mes = mes;
		this.año = año;
	}

	public int getFecha() {
		return dia;
	}

	public void setFecha(int fecha) {
		this.dia = fecha;
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
		return "Fecha [fecha=" + dia + ", mes=" + mes + ", año=" + año + "]";
	}

	public String comprobarFecha() {
		if(dia<1 || dia>31 || mes<1 || mes>12 || año>2025) {
			return "incorrecta";
		} else {
			return "correcta";
		}
	}
	
	public void modificarFecha() {
		dia+=1;
		if(dia==32) {
			dia=1;
			mes+=1;
			if(mes==13) {
				mes=1;
				año+=1;
			}
		}
		
	}
}
