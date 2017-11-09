public class Questao3d{
	
	String nome;
	int RG;
	int CPF;
	boolean FuncionarioNaEmpresa = true;
	double salario;
	Cargo cargo = new Cargo();
	
	void demitir(){
		this.FuncionarioNaEmpresa = false;
	}
	
	void AumentoDeSalario(double valor){
		this.salario += valor;
	}
}