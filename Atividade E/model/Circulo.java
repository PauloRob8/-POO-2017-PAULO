package model;

public class Circulo{
	
	public double raio;
	
	public double calculoArea(){
		return (raio * 3.14);
	}
	
	public double calculoPerimetro(){
		return (2 * 3.14 * raio);
	}
}