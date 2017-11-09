public class Questao4{
	
	boolean ligado = false;
	boolean modoVentilador = false;
	double preço;
	String enconomia; //se do tipo A(muito economico) ou tipo D(baixa economia de energia)
	int temperatura;
	int velocidade;
	
	void ligar(){
		this.ligado = true;
	}
	void ligarModoVentilador(){
		this.modoVentilador = true;
	}
	
	void TemperaturaAlvo(int valor){
		this.temperatura = valor;
		
	}
	
	void defVelocidade(int valor){
		if(modoVentilador = true){
			this.velocidade = valor;
		}
		
		else if(modoVentilador = false){
			this.modoVentilador = true; //quando usario tentar definir velocidade o modo ventilador será ligado automaticamente
			this.velocidade = valor;
		}
	}
	
	
}