package exemplo;

public class Pessoa {

	// Atributo
	public int idade;
	
	// M�todo exibir idade
	@SuppressWarnings("unused")
	public void exibir() {
		int idade = 5;
		System.out.println(this.idade);
	}
	
}