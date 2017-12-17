package model;

public class Quadrado implements AreaCalculavel {
	
	int lado;
	
	public Quadrado(int l) {
		this.lado = l;
	}

	
	public double calcularArea() {
		return this.lado * this.lado;
		
	}
	
	

}
