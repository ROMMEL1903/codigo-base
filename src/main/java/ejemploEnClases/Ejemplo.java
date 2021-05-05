package ejemploEnClases;

public class Ejemplo {
	
	private String frase;
	
	public Ejemplo (String frase) {
		this.frase = frase;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}
	
	public int tamanoFrase() {
		return this.frase.length();
	}
}
