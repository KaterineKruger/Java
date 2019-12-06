package exemplo07_matriz;

public class Main {

	public static void main(String[] args) {

		// Criar a matriz
		String [][] agenda = new String [3][2];
		
		// Cadastrar dados
		agenda [0][0] = "Guilherme";
		agenda [0][1] = "Blumenau";
		agenda [1][0] = "Julia";
		agenda [1][1] = "Pomerode";
		agenda [2][0] = "Tânia";
		agenda [2][1] = "Pomerode";
		
		// Listar contatos
		for (int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 2; coluna++) {
				System.out.print(agenda[linha][coluna] + " ");
			}
			System.out.println();
		}
		
	}

}