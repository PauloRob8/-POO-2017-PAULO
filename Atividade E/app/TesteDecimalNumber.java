package app;
import model .*;

public class TesteDecimalNumber{
	
	public static void main(String [] args) {
		
		DecimalNumber numero = new DecimalNumber();
		
		numero.a = 15;
		
		System.out.println("Resultado: " + numero.decimal());
		System.out.println("Resultado: " + numero.inteiro());
		
	}
}