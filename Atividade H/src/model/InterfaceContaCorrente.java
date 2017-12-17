package model;

public class InterfaceContaCorrente implements InterfaceConta {

	public double saldo;
	
	public double getSaldo() {
		return this.saldo;
	}

	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
		
	}


	public void atualiza(double taxaSelic) {
		this.saldo += taxaSelic;
		
	}

}
