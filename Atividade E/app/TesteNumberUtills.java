package app;

import model.*;

public class TesteNumberUtills {
	
	public static void main(String[] args) {
		
		NumberUtills number = new NumberUtills();
		
		number.n = 10;
		
		System.out.println(number.isPair());
		System.out.println(number.isOdd());
		System.out.println(number.isPrime());
		
		number.printCount();
		number.printReverseCount();
		
	}

}
