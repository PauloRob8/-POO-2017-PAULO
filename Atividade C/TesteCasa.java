public class TesteCasa{
	
	public static void main(String [] args) {
		
		Casa casa = new Casa();
		casa.portas = new Porta[3];
		Porta porta1 = new Porta("Marrom","Madeira");
		Porta porta2 = new Porta("Azul","Metal");
		Porta porta3 = new Porta("Vermelho","Madeira");
		
		casa.cor = "Branco";
		
		casa.pinta("Vermelho");
		
		casa.adicionaPorta(porta1);
		casa.adicionaPorta(porta2);
		casa.adicionaPorta(porta3);
		
		casa.abrirPorta();
		
		System.out.println("Quantidade total de portas: " + casa.totalDePortas());
		System.out.println("Quantidade total de portas abertas: " + casa.quantasPortasAbertas());
		System.out.println("info das portas ");
		
		casa.mostrarPortas();
		
		
	}
}