package app;

import model.*;

public class TesteAuditoriaInterna {
	
	public static void main(String [] args) {
	
		AuditoriaInterna auditor = new AuditoriaInterna();
		
		ContaCorrente cc1 = new ContaCorrente();
		cc1.depositar(6000.0);
		auditor.adiciona(cc1);
		
		SeguroDeVida sv1 = new SeguroDeVida();
		auditor.adiciona(sv1);
		
		ContaCorrente cc2 = new ContaCorrente();
		cc2.depositar(7000.0);
		auditor.adiciona(cc2);
		
		SeguroDeVida sv2 = new SeguroDeVida();
		auditor.adiciona(sv2);
		
		System.out.println(cc1.CalculaTributo());
		System.out.println(sv1.CalculaTributo());
		System.out.println(cc2.CalculaTributo());
		System.out.println(sv2.CalculaTributo());
		
		System.out.println(auditor.getTotal());
			
	}
}
