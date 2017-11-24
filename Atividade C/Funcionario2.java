public class Funcionario2{
	
	String nome;
	int cpf;
	int rg;
	int indetificador;
	
	private double salario;
	
	public Funcionario2(int indentificador){
		this.indetificador = indentificador;
	}
	
	public Funcionario2(String nome,int indentificador) {
		this.nome = nome;
		this.indetificador = indentificador;
	}
	
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
}