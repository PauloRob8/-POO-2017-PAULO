package model;

public class Circulo implements AreaCalculavel{
	
	public final double PI = 3.14;
	public double raio;
	
	public Circulo(double r) {
		this.raio = r;
		
	}

	public double calcularArea() {
		return Math.pow(this.raio, 2) * PI;
	}

}
