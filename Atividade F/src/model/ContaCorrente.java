package model;

public class ContaCorrente extends Conta {

	@Override
	public int getNumero() {
		return numero;
	}

	
	public double atualiza(double taxa) {
		return this.saldo + taxa;
	}

}
