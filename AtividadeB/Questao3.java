public class Questao3{
	
	double preço;
	String cor;
	String modelo;
	Montadora montadora = new Montadora();
	
	void comprar(double valor){
		if(valor > preço){
			System.out.println("Veículo adquirido com sucesso!");
		}
		else{
			System.out.println("Capital insuficiente.");
		}
	}
	
	void ligarVeiculo(){
		System.out.println("O veiculo deu a partida e está funcionando.");
	}
	
	
}