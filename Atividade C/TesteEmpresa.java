public class TesteEmpresa{
	
	public static void main(String[] args){
		
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10];
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.setSalario(1000.0);
		f1.nome = "Jaum";
		empresa.addFuncs(f1);
		
		f2.setSalario(850.0);
		f2.nome = "Irineu";
		empresa.addFuncs(f2);
		
		
		empresa.mostrarEmpregados();
		
		System.out.println(empresa.Contem(f1));
		System.out.println(empresa.Contem(f2));
		
	}
}