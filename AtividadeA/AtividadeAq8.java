public class AtividadeAq8{
	
	public static void main(String [] args) {
		
		int i,a,j;
		// Valor qualquer pra a
		a = 8;
		
		for(i = 1 ; i <= a ; i++) {
			for(j = 1 ; j <= i ; j++) {
				
				int b = i * j;
				if (i == j) {
					System.out.printf("%d\n" , b);
				}
				else {
					System.out.printf("%d",b);
				}
			}
			
		}
	}
}