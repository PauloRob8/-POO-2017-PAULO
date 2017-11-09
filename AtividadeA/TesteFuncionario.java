public class TesteFuncionario{
	
	//questao 2 criando main para utilizar 
	
	public static void main(String [] args) {
		
		Funcionario f1 = new Funcionario();
		
		
		f1.nome = "Vinao";
		f1.salario = 500;
		f1.recebeAumento(100);
		f1.dataDeEntrada.dia = 7;
		f1.dataDeEntrada.mes = 11;
		f1.dataDeEntrada.ano = 2017;
	
		System.out.println("Salário atual " + f1.salario);
		System.out.println("Saláiro anual " + f1.calculaGanhoAtual());
		
		f1.mostra();
		
	}
	
	
}