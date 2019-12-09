package exemplo01;

public class Pessoa {

	// Atributos
	String nome;
	int idade;
	double peso, altura;
	
	// Método para verificar a idade
	void idade() {
		System.out.println(idade >= 18 ? "Maior de idade." : "Menor de idade.");
	}
	
	// Cálculo de IMC
	double calculoImc() {
		
		// Efetuar o cálculo do imc
		double calculo = peso / (altura*altura);
		
		// Retorno
		return calculo;
	}
	
	// Situação do IMC
	void situacaoIMC() {
		
		// Obter o IMC
		double calculo = calculoImc();
		
		//Condicional
		if(calculo < 17) {
			System.out.println("Muito abaixo do peso");
		}else if(calculo < 18.5) {
			System.out.println("Abaixo do peso");
		}else if(calculo < 25) {
			System.out.println("Peso normal");
		}else if(calculo < 30) {
			System.out.println("Acima do peso");
		}else if(calculo < 35) {
			System.out.println("Obesidade I");
		}else if(calculo < 40) {
			System.out.println("Obesidade II");
		}else {
			System.out.println("Obesidade III");
		}
	}
}