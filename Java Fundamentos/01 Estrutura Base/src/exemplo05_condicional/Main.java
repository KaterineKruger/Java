package exemplo05_condicional;

public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Exemplo 01 - IF
		if(15 >= 18) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");
		}
		
		// Exemplo 02 - OPERADOR TERNÁRIO
		System.out.println(15 >= 18 ? "Maior de idade" : "Menor de idade");
		
	}
}