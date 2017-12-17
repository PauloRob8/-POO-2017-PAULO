package model;

public class AuditoriaInterna {
	
	private double total;
	
	public void adiciona(Tributavel t) {
		this.total += t.CalculaTributo();
	}
	
	public double getTotal() { 
		return this.total;

	}
}