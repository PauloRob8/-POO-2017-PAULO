public class AtividadeAq7{
	
	public static void main(String [] args) {
		
		int atual = 0;
		int anterior = 0;
		
		// imprimindo fibonacci de 1 a 100
		// Desafio : fazer sequência de fibonacci cm 2 variáveis
		for(int i = 0 ; atual < 100 ; i++) {
			
			if (i == 1) {
				atual = 1;
				anterior = 0;
				
			}
			else {
				atual += anterior;
				anterior = atual - anterior;
			}
			
			System.out.println(atual);
		}
		
	}
}