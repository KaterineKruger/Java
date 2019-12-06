package exemplo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

//		List
//		 -> ArrayList
//		 -> LinkedList
//		 -> HashMap
//		 -> Map
		
		// Criar o ArrayList
		ArrayList<String> cidades = new ArrayList<String>();
		
		// Adicionar dados
		cidades.add("Pomerode");
		cidades.add("Blumenau");
		cidades.add("Penha");

		// Alterar dados
		cidades.set(2, "Florian�polis");
		
		// Exibir a quantidade
		System.out.println("H� " + cidades.size() + " cidades cadastradas.");
		
		// Listar cidades
		for(String c : cidades) {
			System.out.println(c);
		}
		
	}

}