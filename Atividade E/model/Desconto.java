package model;

public class Desconto {
	
	public double valorOriginal;
	public double desconto;
	
	public double calcula() {
		double valorCalculado = valorOriginal * (desconto/100);
		return valorCalculado;
	}
}
