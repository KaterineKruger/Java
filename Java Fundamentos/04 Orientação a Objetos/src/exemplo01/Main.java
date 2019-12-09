package exemplo01;

public class Main {

	public static void main(String[] args) {
		
		/*
		   CLASSE - Molde
		   ATRIBUTOS - Características
		   MÉTODOS - Funções
		   OBJETO - Resultado obtido através da classe
		*/
		
		//Instanciar (criar um objeto) a classe Pessoa
		Pessoa p1 = new Pessoa();	//Instância
		p1.nome = "Guilherme";
		p1.idade = 21;
		p1.altura = 1.80;
		p1.peso = 77;
		p1.idade();
		p1.situacaoIMC();
		
	}

}