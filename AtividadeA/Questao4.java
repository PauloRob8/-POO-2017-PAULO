class Questao4{
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.nome = "Danilo";
		f1.salario = 100;
		f1.nome = "Xablau";
		f1.salario = 150;
		if(f1 == f2) {
			System.out.println("iguais");
		}
		else {
			System.out.println("diferentes");
		}
		
		
	}
}