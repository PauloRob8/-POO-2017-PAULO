package app;
import model.*;

public class TesteRetangulo {
	
	public static void main(String [] args) {
		
		Retangulo retangulo = new Retangulo();
		
		retangulo.lado1 = 10;
		retangulo.lado2 = 20;
		System.out.println("Perimetro do retangulo: " + retangulo.calcularPerimetro());
	}
}