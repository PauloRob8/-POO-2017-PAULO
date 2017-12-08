package app;
import model .*;

public class TesteDesconto{
	
	public static void main(String [] args) {
		
		Desconto discount = new Desconto();
		
		discount.valorOriginal = 120;
		discount.desconto = 10;
		
		System.out.println("Desconto total: " + discount.calcula());
		
	}
}