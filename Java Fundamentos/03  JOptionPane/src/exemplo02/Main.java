package exemplo02;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		// Variáveis
		String nome;
		int idade;
		double altura;
		
		// Obter dados
		nome = JOptionPane.showInputDialog("Informe seu nome:");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura:"));
		
		// Mensagem
		JOptionPane.showMessageDialog(null, nome + "\n" + idade + "\n" + altura);
		
	}

}