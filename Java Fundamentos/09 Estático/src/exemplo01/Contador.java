package exemplo01;

public class Contador {
	
	// Atributo
	private static int cont;
	
	// Construtor
	@SuppressWarnings("static-access")
	public Contador() {
		this.cont+=1;
		System.out.println(this.cont);
	}

}