public class Funcionario{
	
	String nome;
	private double salario;
	private int cpf;
	private int rg;
	
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	void aumentoSalario(double valor){
		this.salario += valor; 
		
	}
	
	String mostra(){
		return "Nome: " + this.nome + "\n" + "Salário: " + this.salario + "\n" + "CPF: " + this.cpf + "\n"+ "RG: " + this.rg;
	}
}