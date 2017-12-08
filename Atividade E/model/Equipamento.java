package model;

public class Equipamento {
	
	public boolean ligado;
	
	public boolean liga() {
		if(ligado = false);
			return this.ligado = true;
	}
	
	public boolean desliga() {
		if(ligado = true);
			return this.ligado = false;
	}
	
	public boolean inverte() {
		if(ligado = true) {
			return this.ligado = false;
		}
		else {
			return this.ligado = true;
		}
	}
	
	public boolean estaLigado() {
		return this.ligado;
	}


}
