package app;
import model.*;

public class TesteCirculo{
	
	public static void main(String [] args) {
		
		Circulo circulo = new Circulo();
		
		circulo.raio = 2;
		
		System.out.println("Perimetro: " + circulo.calculoPerimetro());
		System.out.println("Area: " + circulo.calculoArea());
	}
}