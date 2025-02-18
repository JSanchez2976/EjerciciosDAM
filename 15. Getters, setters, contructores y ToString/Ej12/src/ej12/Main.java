package ej12;

public class Main {

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		persona1.rellenarPersona();
		System.out.println("PERSONA 1: \n");
		persona1.visualizarPersona();
		
		Persona persona2 = new Persona();
		System.out.println("\nPERSONA 2: ");
		persona2.setNombre("Lucas");
		persona2.setApellido("Martinez");
		persona2.setFecha_nacimiento(new Fecha(15,23,2004));
		System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Apellido: " + persona2.getApellido());
        System.out.print("Fecha de nacimiento: "+ persona2.getFecha_nacimiento());
        System.out.println();
		Persona persona3 = new Persona("Pedro","Gimenez",new Fecha(24,5,2009));
		System.out.println("\nPERSONA 3: ");
		System.out.println(persona3.toString());
	}

}
