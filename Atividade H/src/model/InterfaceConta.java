package model;

public interface InterfaceConta {
	
	public double getSaldo(); 
	
	public void deposita(double valor); 
	
	public void saca(double valor); 
	
	public void atualiza(double taxaSelic);
	
} 


