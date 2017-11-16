import javax.swing.*;

public class ControleDoSplit{
	
	public static void main(String [] args){
		
		Split split1= new Split("branco", 32);
		
		split1.Ligar();
		split1.temperatura = 20;
		split1.mudarTemperatura(17);
		split1.VelocidadeVentilador = 100;
		split1.mudarVelocidadeVentilador(120);
		System.out.println("Estados do split");
		
		System.out.println("Ligado: " + split1.ligado);
		System.out.println("Cor: " + split1.cor);
		System.out.println("Potência: " + split1.potencia);
		System.out.println("Temperatura:" + split1.temperatura);
		System.out.println("VelocidadeVentilador: " + split1.VelocidadeVentilador);
		System.out.println("Modo Frio: " + split1.modoFrio);
		System.out.println("Modo Ventilador:" + split1.modoVentilador);
		
	}

	
}