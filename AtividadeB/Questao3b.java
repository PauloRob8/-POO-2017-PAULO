public class Questao3b{
		
		double saldo;
		Titular titular = new Titular();
		
		
		void depostiar(double valor){
			this.saldo += valor;
		}
		
		void sacar(double valor){
			this.saldo -= valor;
		}

}