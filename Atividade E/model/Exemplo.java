package app;

public class Exemplo {
	
	public static void main(String[] args) {
		int a = 9;
		int b = 0;
		if ((a > 11) && (++b <= 100)){
			System.out.println(a*b);
} 		else {
			System.out.println(a-b);
}
}
}

// O resultado do programa é 9 pois 9 - 0 = 9,pois a condição a > 11 n foi atendida