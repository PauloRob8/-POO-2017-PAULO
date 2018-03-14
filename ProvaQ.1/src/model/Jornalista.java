package model;

public class Jornalista extends Pessoa{
	
	private String email;
	private String senha;
	private String nome;
	
	
	public Jornalista(String e,String s,String nome){
		super(e,s);
		this.nome = nome;
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
	
	public void criaNoticia(Noticia noticia,String hora,String data,String titulo,String area){
		noticia.setTitulo(titulo);
		noticia.setArea(area);
		noticia.setHora(hora);
		noticia.setData(data);
		noticia.setAutor(this.nome);
		noticia.setEstado("Criada");
	}
	
}