package conexao;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ConexaoMysql {
	
	// Atributo de conexão
	public static Connection conexao;
	
	// Método de conexão
	public static void realizarConexao() {
		
		// Tentativa
		try {
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/projeto_desktop", "root", "Gunskathy272666+");
			// JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso");
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null, "Falha ao conectar "+erro.getMessage());
		}
		
	}
	
	// Método para finalizar a conexão
	public static void finalizarConexao() {
		try {
			conexao.close();
		}catch(Exception erro) {}
	}

}
