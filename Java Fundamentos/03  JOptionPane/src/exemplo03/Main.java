package exemplo03;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		// Caixa de confirma��o
		int opcao = JOptionPane.showConfirmDialog(null, "Gostando de Java?", "T�tulo", JOptionPane.YES_NO_OPTION);
		
		// Exibir valor selecionado
		JOptionPane.showMessageDialog(null, opcao);
		
	}

}