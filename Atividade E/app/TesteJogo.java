package app;
import model.*;

public class TesteJogo{
	
	public static void main(String [] args) {
		
		Jogo jogo = new Jogo();
		
		jogo.nome = "TheWitcher";
		jogo.faixaEtaria =14;
		jogo.preço = 100;
		jogo.estilo = "RPG";
		jogo.coop = false;
		jogo.GB = 40;
		
		jogo.Info();
		jogo.InstalarJogo(500);
		jogo.SalvandoJogo(5);
		
	}
}