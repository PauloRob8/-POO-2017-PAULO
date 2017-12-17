package app;

import model.*;

public class TesteTributavel {
	
	public static void main(String [] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(1000.0);
		
		System.out.println(cc.CalculaTributo());
		
		Tributavel t = cc;
		
		System.out.println(t.CalculaTributo());
		
	}

}
