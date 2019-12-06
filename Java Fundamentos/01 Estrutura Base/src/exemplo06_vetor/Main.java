package exemplo06_vetor;

public class Main {

	public static void main(String[] args) {

		// Criar o vetor
		// String [] nomes = {"Guilherme", "Julia", "T�nia", "S�rgio"};
		String[] nomes = new String[4];
		
		// Adicionar nomes
		nomes[0] = "Guilherme";
		nomes[1] = "Julia";
		nomes[2] = "T�nia";
		nomes[3] = "S�rgio";
		
		// Exibir a quantidade de registros
		System.out.println("O vetor possui " + nomes.length + " nomes.");
		
		// La�o de repeti��o - FOR EACH
		for(String n : nomes) {
			System.out.println(n);
		}
	}

}