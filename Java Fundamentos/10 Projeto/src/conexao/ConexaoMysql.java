package conexao;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ConexaoMysql {
	
	// Atributo de conex�o
	public static Connection conexao;
	
	// M�todo de conex�o
	public static void realizarConexao() {
		
		// Tentativa
		try {
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/projeto_desktop", "root", "Gunskathy272666+");
			// JOptionPane.showMessageDialog(null, "Conex�o efetuada com sucesso");
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null, "Falha ao conectar "+erro.getMessage());
		}
		
	}
	
	// M�todo para finalizar a conex�o
	public static void finalizarConexao() {
		try {
			conexao.close();
		}catch(Exception erro) {}
	}

}
