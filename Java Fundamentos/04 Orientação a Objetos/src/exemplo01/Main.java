package exemplo01;

public class Main {

	public static void main(String[] args) {
		
		/*
		   CLASSE - Molde
		   ATRIBUTOS - Caracter�sticas
		   M�TODOS - Fun��es
		   OBJETO - Resultado obtido atrav�s da classe
		*/
		
		//Instanciar (criar um objeto) a classe Pessoa
		Pessoa p1 = new Pessoa();	//Inst�ncia
		p1.nome = "Guilherme";
		p1.idade = 21;
		p1.altura = 1.80;
		p1.peso = 77;
		p1.idade();
		p1.situacaoIMC();
		
	}

}