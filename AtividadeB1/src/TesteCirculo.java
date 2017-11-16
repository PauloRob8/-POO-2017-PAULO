public class TesteCirculo{
	
	public static void main(String [] args){
		
		Circulo circulo = new Circulo();
		
		circulo.raio = 3;
		circulo.diametro = 4;
		circulo.ComprimentoDeCircunferencia = 5.4;
		circulo.CalcularArea();
		circulo.calculcarCircunferencia();
		circulo.movimentarCirculo(2);
		circulo.ponto.x1 = 2;
		circulo.ponto.x2 = 1;
		circulo.ponto.y1 = 4;
		circulo.ponto.y2 = 3;
		circulo.ponto.calcudarDistancia();
		
		circulo.Info();
		
		
	}
}