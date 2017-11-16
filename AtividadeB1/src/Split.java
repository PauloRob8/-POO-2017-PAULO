public class Split{
	
	String cor;
	int potencia;
	boolean ligado = false;
	double temperatura;
	double VelocidadeVentilador;
	boolean modoVentilador = false;
	boolean modoFrio = true;
	
	public Split(String cor,int potencia){
		this.cor = cor;
		this.potencia = potencia;
	}
	
	
	void Ligar(){
		
		ligado = true;

	}
	
	void mudarTemperatura(double valor){
		if(ligado = true){
			temperatura = valor;
		}
		else{
			System.out.println("Operação invalida o split está desligado");
		}
	}
	
	void mudarVelocidadeVentilador(double valor){
		if(ligado = true){
			VelocidadeVentilador = valor;
		}
		else{
			System.out.println("Operação invalida o split está desligado");
		}
	
	}
	
	void ligarModoVentilador(){
		
		modoVentilador = true;
		modoFrio = false;
	
	}
	
	
	
}