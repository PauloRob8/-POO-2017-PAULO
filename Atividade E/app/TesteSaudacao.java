package app;
import model .*;

public class TesteSaudacao{
	
	public static void main(String[] args) {
		
		Saudacao saudacao = new Saudacao("Bom dia,","Jo�o");
		
		System.out.println(saudacao.ObterSaudacao());
	}
}