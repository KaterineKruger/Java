package banco;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoMySQL {
	
	// Atributos da classe
	public static Connection conexao = null;
	
	// M�todo para criar a conex�o
	public static void conectar() {
		
		// Vari�veis
		String usuario = "root";
		String senha = "Gunskathy272666+";
		String base = "projeto_filme";
		
		// Tentativa
		try {
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/"+base, usuario, senha);
		}catch(Exception erro) {}
		
	}
	
	// M�todo para excluir a conex�o
	public static void desconectar() {
		
		// Tentiva
		try {
			conexao.close();
		}catch(Exception erro) {}
		
	}

}