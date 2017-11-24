public class Casa{
	
	String cor;
	int TotalDePortas;
	Porta[] portas;
	boolean portaAberta = false;
	int contadorDePortasAbertas = 0;
	int qtdPortas = 0;
	int cont = 0;
	
	void adicionaPorta(Porta p){
		this.portas[cont] = p;
		cont ++;
		qtdPortas++;
	}
	
	void pinta(String s){
		this.cor = s;
	}
	
	void abrirPorta(){
		portaAberta = true;
		contadorDePortasAbertas ++;
	}
	
	int quantasPortasAbertas(){
		return contadorDePortasAbertas;
	}
	
	int totalDePortas(){
		return qtdPortas;
	}
	
	void mostrarPortas(){
		for(int i = 0; i <cont; i++) {
			System.out.println(portas[i].mostrarPortas());
		}
	}
}