package banco;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoMySQL {
	
	// Atributos da classe
	public static Connection conexao = null;
	
	// Método para criar a conexão
	public static void conectar() {
		
		// Variáveis
		String usuario = "root";
		String senha = "Gunskathy272666+";
		String base = "projeto_filme";
		
		// Tentativa
		try {
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/"+base, usuario, senha);
		}catch(Exception erro) {}
		
	}
	
	// Método para excluir a conexão
	public static void desconectar() {
		
		// Tentiva
		try {
			conexao.close();
		}catch(Exception erro) {}
		
	}

}