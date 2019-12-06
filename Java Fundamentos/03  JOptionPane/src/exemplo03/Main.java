package exemplo03;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		// Caixa de confirmação
		int opcao = JOptionPane.showConfirmDialog(null, "Gostando de Java?", "Título", JOptionPane.YES_NO_OPTION);
		
		// Exibir valor selecionado
		JOptionPane.showMessageDialog(null, opcao);
		
	}

}