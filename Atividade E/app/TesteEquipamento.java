package app;

import model .*;

public class TesteEquipamento {
	
	public static void main(String[] args) {
		
		Equipamento e1 = new Equipamento();
		Equipamento e2 = new Equipamento();
		
		e1.liga();
		e2.desliga();
		
		e1.inverte();
		e2.inverte();
		
		System.out.println(e1.estaLigado());
		System.out.println(e2.estaLigado());
		
	}

}
