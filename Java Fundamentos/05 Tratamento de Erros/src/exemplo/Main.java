package exemplo;

import javax.swing.JOptionPane;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		try {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Falha ao obter o n�mero "+e.getMessage());
		}
		
	}

}