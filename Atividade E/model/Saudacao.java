package model;

public class Saudacao {
	
	public String texto;
	public String Destinatario;
	
	public Saudacao(String txt , String dest) {
		this.texto = txt;
		this.Destinatario = dest;
	}
	
	public String ObterSaudacao() {
		return this.texto + " " + this.Destinatario;
	}
}
