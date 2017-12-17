package model;

public class ContaCorrente extends Conta implements Tributavel{
	

	public double CalculaTributo() {
		return getSaldo() * 0.01;
	}

	@Override
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		
	}

	@Override
	public void sacar(double valor) {
		this.saldo = this.saldo - valor;
		
	}

}
