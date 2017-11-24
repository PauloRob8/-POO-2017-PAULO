
public class Data {
	
	int mes;
	int dia;
	int ano;
	
	void validaDia() {
		if(mes == 2) {
			if(dia >= 31) {
				System.out.println("Data inválida.");
			}
		}
		else if(mes == 4 || mes == 6 || mes == 8 || mes == 10 || mes == 12 ) {
			if(dia >= 31) {
				dia = 30;
			}
		}
	}

}
