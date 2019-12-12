package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexaoMysql {

	// Quando existe só um método, melhor ser estático. Quando existem mais métodos, melhor criar um objeto.

	// Atributo de conexão
	public static Connection conexao;

	// Método de conexão
	public static void realizarConexao() {

		// Tentativa
		try {
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/projeto_desktop", "root", "Gunskathy272666+");
//			JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso.");
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Falha ao conectar. " + erro.getMessage());
		}
	}
	
	// Método para finalizar a conexão
	public static void finalizarConexao() {
		try {
			conexao.close();
		} catch (Exception e) {}
	}
	
}