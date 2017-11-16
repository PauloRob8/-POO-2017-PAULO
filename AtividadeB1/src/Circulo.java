public class Circulo{
	
	double raio;
	double diametro;
	double circunferencia;
	double pi = 3.14;
	double Area;
	double Centro;
	double ComprimentoDeCircunferencia;
	Ponto ponto = new Ponto();
	
	void calculcarCircunferencia(){
		circunferencia = (2 * pi * raio);
	}
	
	void CalcularArea(){
		if(raio > 0){
		 Area = pi * (raio * raio);
	}
		else if(raio < 0){
			raio = 1;
			Area = pi * (raio * raio);
		}
	
  }
	void movimentarCirculo(double valor){
		raio = valor;
	}
	
	void Info(){
		System.out.println("Raio: " + this.raio);
		System.out.println("Diametro: " + this.diametro);
		System.out.println("Circunferencia: " + this.circunferencia);
		System.out.println("Area: " + this.Area);
		System.out.println("Comprimento De Circunferencia: " + this.ComprimentoDeCircunferencia);
		System.out.println("Distância dos pontos: " + this.ponto.Distancia);
	}
}