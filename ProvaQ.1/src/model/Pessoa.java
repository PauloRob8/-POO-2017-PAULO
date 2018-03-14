package model;

public abstract class Pessoa {
	
	private String email;
	private String senha;
	
	public Pessoa(String e,String n){
		this.email = e;
		this.senha = n;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}