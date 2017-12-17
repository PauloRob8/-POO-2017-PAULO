package model;

public class Retangulo implements AreaCalculavel {
	
	public int largura;
	public int altura;
	
	public Retangulo(int l,int a) {
		this.largura = l;
		this.altura = a;
		
	}

	public double calcularArea() {
		return this.altura * this.largura;
			
	}
	
}
