package model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Noticia {
	
	private String titulo;
	private String area;  //Esportes,tecnologia,pólitica,econimia...
	private String local;	//Se em destaques,noticia principal...
	private String hora;
	private String data;
	private String estado;
	private String cor;
	private String autor;
        private Noticia ListaDeNoticia[] = new Noticia[10];
	
	public Noticia() {
		
	}
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public String infoNoticia() {
		return "Autor: " + this.autor + "\n" +
				"Titulo: " + this.titulo + "\n" +
				"Local: " + this.local + "\n" +
				"Estado: " + this.estado + "\n" +
				"Cor " + this.cor;
	}
	
	public void corDaNoticia() {
		if(this.getLocal() == "Destaques" || this.getArea() == "Politica" || this.getArea() == "Economia") {
			this.setCor("Vermelho");
		}
		else if(this.getArea() == "Esportes") {
			this.setCor("Verde");
		}
		else if(this.getArea() == "Entretenimento") {
			this.setCor("Laranja");
		}
		
		//Outras possiveis possibilidades
	}
}