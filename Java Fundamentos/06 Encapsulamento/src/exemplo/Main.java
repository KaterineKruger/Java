package exemplo;

public class Main {

	public static void main(String[] args) {
		
		/*
		DEFAULT   -> Ter acesso a atributos e métodos no mesmo pacote
		PUBLIC    -> Ter acesso a atributos e métodos no mesmo projeto
		PRIVATE   -> Ter acesso a atributos e métodos na classe onde foram criados
		PROTECTED -> Ter acesso a atributos e métodos no mesmo pacote ou através de herança 
		*/
		
		//Instanciar objeto da classe Carro
		Carro c = new Carro();
		c.setFabricante("Volkswagem");
		c.setMarca("Gol");
		c.setValor(25000);
		c.dados();
		
	}

}