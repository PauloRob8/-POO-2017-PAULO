package model;

public class NumberUtills {
	
	public int n;
	
	public boolean isPair() {
		if(n % 2 == 0) {
			return true;
		}
		
		return false;
	}
	
	public boolean isOdd() {
		if(n % 2 == 0) {
			return true;
		}
		
		return false;
	}
	
	public boolean isPrime() {
		int cont = 0;
		for(int i = 0; i < 100; i++) {
			if (i % n == 0) {
				cont++;
			}
	
		}
			if(cont > 2) {
				return false;
		}
			return true;
			}
	
	public void printCount() {
		for(int i = 0; i < n ; i++) {
			System.out.println(i);
		}
	}
	public void printReverseCount() {
		for(int i = n; i <= 0 ; i --) {
			System.out.println(i);
		}
	}
}
