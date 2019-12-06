package exemplo02_variaveis;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Variáveis numéricas (inteiras)
		byte var1 = 127;    // 1 Byte
		short var2 = 32000; // 2 Bytes
		int var3 = 1000;    // 4 Bytes
		long var4 = 50000;  // 8 Bytes
		
		// Variáveis numéricas (reais)
		float var5 = 6.7f; // 12 Bytes ---> Até 12 casas decimais
		double var6 = 4.8; // 24 Bytes ---> Até 24 casas decimais
		
		//Variáveis textuais
		char var7 = 'a'; // Entre apóstrofos, não aspas
		char[] var8 = {'A', 'p', 'e', 'x'};
		String var9 = "Apex";
		
		//Variável lógica
		boolean var10 = true;
		
	}

}