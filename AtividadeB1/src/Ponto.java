public class Ponto{
	
	int x1;
	int y2;
	int x2;
	int y1;
	double Distancia;
	
	void calcudarDistancia(){
		
		double result = Math.pow(x2-x1,2) + Math.pow(y2-y1,2);
		Distancia = Math.sqrt(result);
	}
	
}