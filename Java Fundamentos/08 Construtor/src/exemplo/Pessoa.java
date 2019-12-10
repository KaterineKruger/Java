package exemplo;

public class Pessoa {

	// Atributos
	private String nome;
	private int idade;
	
	// Construtor
	public Pessoa() {
		System.out.println("Construtor ok!");
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
		exibir();
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		exibir();
	}
	
	private void exibir() {
		System.out.println("Nome "+this.nome);
		System.out.println("Idade "+this.idade);
	}
	
}