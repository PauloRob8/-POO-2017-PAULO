package model;

public class ContaPoupanca extends Conta {

	@Override
	public int getNumero() {
		return numero;
	}

	
	public double atualiza(double taxa) {
		return this.saldo + taxa;
	}

}
