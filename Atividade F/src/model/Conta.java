package model;

public abstract class Conta {
	
	public double saldo;
	public int numero;
	
	public double getSalario() {
		return this.saldo;
	}
	
	public abstract int getNumero();
	
	public abstract double atualiza(double taxa);
	
	public void attNumero() {
		int novoNumero = this.getNumero() + 1;
	}

}
