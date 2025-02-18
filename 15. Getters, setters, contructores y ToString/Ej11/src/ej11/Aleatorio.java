package ej11;

public class Aleatorio {
	private char letra;
	
	public Aleatorio() {
		this.letra=(char) (Math.random()*(122-97+1)+97);
	}
	
	public void TipoLetra() {
		if(letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u') {
			System.out.println("Es vocal");
		}
		else {
			System.out.println("Es consonante");
		}
	}

	@Override
	public String toString() {
		return "Aleatorio [letra=" + letra + "]";
	}
	
}
