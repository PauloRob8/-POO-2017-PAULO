package model;

public class Jogo{
	public String nome;
	public int faixaEtaria;
	public boolean multiplayer = true;
	public double preço;
	public String estilo;
	public boolean coop;
	public int GB;
	public boolean autosave = true;
	
	public void InstalarJogo(int qtdGB) {
		if(qtdGB > GB) {
			System.out.println("Jogo instalado com sucesso!");
		}
		else {
			System.out.println("Erro,memoria insufisciente");
		}
	}
	
	public void SalvandoJogo(int tamanhoDoSave) {
		if(tamanhoDoSave < GB) {
			System.out.println("Jogo salvo com sucesso!");
		}
		else {
			System.out.println("Impossivel completar save");
		}
	}
	
	public void Autosave(String opcao) {
		if(opcao == "ligar") {
			autosave = true;
		}
		else if(opcao == "desligar") {
			autosave = false;
		}
	}
	public void Info() {
		System.out.println("Nome do jogo: " + this.nome);
		System.out.println("Faixa etária: " + this.faixaEtaria);
		System.out.println("Multiplayer: " + this.multiplayer);
		System.out.println("Preço: " + this.preço);
		System.out.println("Estilo do jogo: " + this.estilo);
		System.out.println("coop: " + this.coop);
		System.out.println("Tamanho do jogo: " + this.GB);
		System.out.println("Autosave: " + this.autosave);
	}
}