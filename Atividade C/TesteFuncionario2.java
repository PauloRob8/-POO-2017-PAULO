public class TesteFuncionario2{
	
	public static void main(String[] args) {
		
		Funcionario2 f1 = new Funcionario2(1);
		
		f1.nome = "Irineu";
		f1.cpf = 1234;
		f1.rg = 23123;
		f1.setSalario(1000.00);
		
		System.out.println("Salario: "+ f1.getSalario());
	}
}