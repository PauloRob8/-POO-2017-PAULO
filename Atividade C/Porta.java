public class Porta{
	
	String material;
	String cor;
	
	public Porta(String cor,String material) {
		this.cor = cor;
		this.material = material;
	}
	
	String mostrarPortas() {
		return "Material da porta: " + this.material + "\n" + "Cor da porta: " + this.cor;
	}
}