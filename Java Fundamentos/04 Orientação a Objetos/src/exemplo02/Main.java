package exemplo02;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Instanciar objetos da classe Produto
		Produto p1 = new Produto();
		p1.nome = "Inspiron 5000";
		p1.marca = "Dell";
		p1.valor = 4800;
		
		Produto p2 = new Produto();
		p2.nome = "TV 32 Polegadas";
		p2.marca = "LG";
		p2.valor = 1900;
		
		Produto p3 = new Produto();
		p3.nome = "Geladeira branca";
		p3.marca = "Brastemp";
		p3.valor = 2600;
		
		// ArrayList
		ArrayList<Produto> vetor = new ArrayList<Produto>();
		vetor.add(p1);
		vetor.add(p2);
		vetor.add(p3);
		
		for(int indice = 0; indice < vetor.size(); indice++) {
			System.out.println(vetor.get(indice).nome);
		}
	}
}