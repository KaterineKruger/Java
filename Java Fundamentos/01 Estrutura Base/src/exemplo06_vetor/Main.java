package exemplo06_vetor;

public class Main {

	public static void main(String[] args) {

		// Criar o vetor
		// String [] nomes = {"Guilherme", "Julia", "Tânia", "Sérgio"};
		String[] nomes = new String[4];
		
		// Adicionar nomes
		nomes[0] = "Guilherme";
		nomes[1] = "Julia";
		nomes[2] = "Tânia";
		nomes[3] = "Sérgio";
		
		// Exibir a quantidade de registros
		System.out.println("O vetor possui " + nomes.length + " nomes.");
		
		// Laço de repetição - FOR EACH
		for(String n : nomes) {
			System.out.println(n);
		}
	}

}