package app;

import model .*;

public class TesteConta {
	
	public static void main(String [] args) {
		
		Conta conta = new ContaCorrente();
		
		conta.saldo = 100;
		conta.numero = 1;
		conta.atualiza(30);
		
		System.out.println(conta.saldo);
		System.out.println(conta.getNumero());
		System.out.println(conta.atualiza(30));
	}

}
