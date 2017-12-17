package app;

import javax.swing.JOptionPane;

import model.*;

public class TesteArea {
	
	public static void main(String [] args) {
		
		AreaCalculavel a1 = new Quadrado(4);
		AreaCalculavel a2 = new Retangulo(3,2);
		AreaCalculavel a3 = new Circulo(3);
		
		JOptionPane.showMessageDialog(null,"Aréa do quadrado: " + a1.calcularArea());
		JOptionPane.showMessageDialog(null, "Aréa do Retângulo: " + a2.calcularArea());
		JOptionPane.showMessageDialog(null, "Aréa do Circulo: " + a3.calcularArea());
	}

}
