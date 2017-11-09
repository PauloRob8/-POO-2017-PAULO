public class Funcionario{
	
	// Modelando funcionario
	double salario;
	String nome;
	String departamento;
	String RG;
	data dataDeEntrada = new data();
	
	
	
	void recebeAumento(double aumento) {
		salario = salario + aumento;
		
	}
	
	double calculaGanhoAtual() {
		return salario * 12;
	}
	
	// Questão 3 criando metodo mostra
	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("RG: " + this.RG);
		System.out.println("Salario " + this.salario);
		System.out.println("Departamento " + this.departamento);
		System.out.println("Data atual " + this.dataDeEntrada.dia + "/" + this.dataDeEntrada.mes + "/" + this.dataDeEntrada.ano);
	}
	
}
