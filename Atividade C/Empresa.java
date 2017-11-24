public class Empresa{
	
	Funcionario empregados[];
	String cnpj;
	int cont = 0;
	boolean  FuncNaEmpresa;
	
	Funcionario funcs = new Funcionario();
	
	
	void addFuncs(Funcionario funcs){
		this.empregados[cont] = funcs;
		FuncNaEmpresa = true;
		cont++;
	}
	
	void mostrarEmpregados(){
		for(int i = 0;i < cont; i++){
			System.out.println(empregados[i].mostra());
		}
	}
	
	boolean Contem(Funcionario f){
		if(FuncNaEmpresa = true){
			return true;
		}
		else{
			return false;
	}
		}
}