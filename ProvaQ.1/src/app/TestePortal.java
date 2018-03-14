package app;
import model .*;

public class TestePortal {
	
	public static void main(String [] args) {
		
		Noticia noticia1 = new Noticia();
		Noticia noticia2 = new Noticia();
		
		Jornalista jornalista1 = new Jornalista("jaumzao@hotmail.com","123","Jaum");
		Editor editor = new Editor("jaumzim@jonson.com","1234","Jonsu","Politica");
		
		jornalista1.criaNoticia(noticia1, "22:00","13/03/2018","Aumento do role","Politica");
		jornalista1.criaNoticia(noticia2, "22:00","13/03/2018","Aumento do role","Entrenimento");
		System.out.println(editor.autorizarNoticia(noticia1, "22:30", "13/03/2018"));
		System.out.println(editor.autorizarNoticia(noticia2, "113", "odhad"));
		
		editor.promover();
		
		System.out.println(editor.publicaNoticia(noticia1, "13/03/2018", "23:00", "Destaques"));
		
		System.out.println(editor.publicaNoticia(noticia2, "14/04/18", "14", "Noticia Principal"));
		
		noticia1.corDaNoticia();
		
		System.out.println(noticia1.infoNoticia());

	}
}