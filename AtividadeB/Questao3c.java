public class Questao3c{
	
	String endereço;
	String nome;
	int numApartamento;
	double preço;
	int numeroDeQuartos;
	
	Propietario propietario = new Propietario();
	
	String venderApt(double valor){
		if(valor >= preço){
			return "Apartamento vendido com sucesso";
		}
		
		else{
			return "Capital insuficiente";
		}
	}
	String receberVisitar(int numDeVisitas){
		if(numDeVisitas > numeroDeQuartos){	
			
			return "Espaço no apartamento insuficiente";
		}
		
		else{
			return "Coube que foi uma beleza";
		}
	
	
}
}
