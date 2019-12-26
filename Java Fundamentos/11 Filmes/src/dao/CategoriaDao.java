package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import banco.ConexaoMySQL;
import modelo.CategoriaModelo;

public class CategoriaDao {

	// Método para listar as categorias
	public static DefaultComboBoxModel<CategoriaModelo> listarCategorias(){
		
		// Objeto DefaultComboBoxModel
		DefaultComboBoxModel<CategoriaModelo> categorias = new DefaultComboBoxModel<CategoriaModelo>();
		
		// SQL
		String sql = "SELECT * FROM categorias";
	
		// Tentativa
		try {
			
			// Criar a conexão
			ConexaoMySQL.conectar();
			
			// Objeto de consulta
			Statement stmt = ConexaoMySQL.conexao.createStatement();
			
			// Obter todos os dados da tabela de categorias
			ResultSet rs = stmt.executeQuery(sql);
			
			
			// Laço
			while(rs.next()) {
				CategoriaModelo c = new CategoriaModelo();
				c.setIdCategoria(rs.getInt(1));
				c.setNomeCategoria(rs.getString(2));
				
				categorias.addElement(c);
			}
			
		}catch(Exception erro) {
		}finally {ConexaoMySQL.desconectar();}
		
		// Retorno
		return categorias;
		
	}
	
}