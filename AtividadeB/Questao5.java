public class Questao5{
	
	double raio;
	double circunferencia;
	double area;
	double centro;
	double comprimento;
	
	void calcularCircunferencia(){
		this.circunferencia = 2 * 3.14 * raio;
	}
	
	void calcularArea(){
		if(raio > 0){
			this.area = 3.14 * Math.pow(raio,2);
		}
		else if (raio < 0){
			raio = 1;
			this.area = 3.14 * Math.pow(raio,2);
		}
	}
}