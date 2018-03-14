package model;

public class Editor extends Pessoa {
	
	private String nome;
	private boolean chefe = false;
	private String area;
	
	public Editor(String e, String n,String nome,String area) {
		super(e, n);
		this.area = area;
		this.nome = nome;
	}
	
	public void promover(){
		this.chefe = true;
	}

	public boolean isChefe() {
		return chefe;
	}

	public void setChefe(boolean chefe) {
		this.chefe = chefe;
	}
	
	public String autorizarNoticia(Noticia noticia,String hora,String data){
		if(this.area == noticia.getArea()){
			noticia.setEstado("Pronto pra revisar");
			noticia.setData(data);
			noticia.setHora(hora);
			return noticia.getTitulo() + " " + "Pronto para ser publicada \n" + "Autorizada por " + this.nome;
		}
		else{
			return "Você não tem autorizaçãoo para isso";
			
		}	
	}
	
	public String publicaNoticia(Noticia noticia,String data,String hora,String local) {
		if(this.chefe == true) {
			if(noticia.getEstado() == "Pronto pra revisar") {
				noticia.setData(data);
				noticia.setHora(hora);
				noticia.setLocal(local);
                                //seta lista de noticias caso necessario
				return noticia.getTitulo() + " " + "Publica com sucesso em " + noticia.getLocal();
				
			}
			else {
				noticia.setEstado("Desativa");
				return "Noticia ainda não foi autorizada";
			}
		}
		
		else {
			return "Você não tem permissão para isso!";
			
		}
		
	}

}