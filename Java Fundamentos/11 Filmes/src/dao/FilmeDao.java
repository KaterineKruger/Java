package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import banco.ConexaoMySQL;
import modelo.FilmeModelo;

public class FilmeDao {

	// Listar filmes
	public static DefaultTableModel listar() {
		
		// DefaultTableModel
		DefaultTableModel filmes = new DefaultTableModel();
		
		// Colunas
		filmes.addColumn("Código");
		filmes.addColumn("Nome");
		filmes.addColumn("Categoria");
		
		// SQL
		String sql = "SELECT filmes.idFilme, filmes.nomeFilme, categorias.nomeCategoria FROM filmes INNER JOIN categorias ON filmes.categoriaFilme = categorias.idCategoria";
		
		// Tentativa
		try {
			
			// Conexão
			ConexaoMySQL.conectar();
			
			// Objeto de consulta
			Statement stmt = ConexaoMySQL.conexao.createStatement();
			
			// Obter os dados
			ResultSet rs = stmt.executeQuery(sql);
			
			// Laço
			while(rs.next()) {
				
				filmes.addRow(new Object[] {
					rs.getInt(1),
					rs.getString(2),
					rs.getString(3)
				});
				
			}
			
		}catch(Exception erro) {
		}finally {ConexaoMySQL.desconectar();}
		
		// Retorno
		return filmes;
		
	}
	
	
	// Cadastrar
	public static void cadastrar(FilmeModelo f) {
		
		// Conexão
		ConexaoMySQL.conectar();
		
		// SQL
		String sql = "INSERT INTO filmes (nomeFilme, categoriaFilme) VALUES (?, ?)";
		
		// Tentativa
		try {
			
			// Objeto de consulta
			PreparedStatement pstmt = ConexaoMySQL.conexao.prepareStatement(sql);
			pstmt.setString(1, f.getNomeFilme());
			pstmt.setInt(2, f.getCategoriaFilme());
			pstmt.execute();
			
		}catch(Exception erro) {
		}finally {ConexaoMySQL.desconectar();}
		
	}
	
	// Excluir
	public static void excluir(int codigo) {
		
		// Conexão
		ConexaoMySQL.conectar();
		
		// SQL
		String sql = "DELETE FROM filmes WHERE idFilme = ?";
		
		// Tentativa
		try {
			
			PreparedStatement pstmt = ConexaoMySQL.conexao.prepareStatement(sql);
			pstmt.setInt(1, codigo);
			pstmt.execute();
			
		}catch(Exception erro) {
		}finally {ConexaoMySQL.desconectar();}
		
	}
	
	// Alterar
	public static void alterar(FilmeModelo f) {
		
		// Conexão
		ConexaoMySQL.conectar();
		
		// SQL
		String sql = "UPDATE filmes SET nomeFilme = ?, categoriaFilme = ? WHERE idFilme = ?";
		
		// Tentativa
		try {
			
			// Objeto de consulta
			PreparedStatement pstmt = ConexaoMySQL.conexao.prepareStatement(sql);
			pstmt.setString(1, f.getNomeFilme());
			pstmt.setInt(2, f.getCategoriaFilme());
			pstmt.setInt(3, f.getIdFilme());
			pstmt.execute();
			
		}catch(Exception erro) {
		}finally {ConexaoMySQL.desconectar();}
		
	}
}