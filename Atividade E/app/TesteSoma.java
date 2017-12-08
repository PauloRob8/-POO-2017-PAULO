package app;
import model .*;

public class TesteSoma{
	
	public static void main(String [] args) {
		
		Soma calculo = new Soma();
		
		calculo.a = 15;
		calculo.b = -9;
		
		System.out.println("Resultado: " + calculo.soma());
		
	}
}