package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import conexao.ConexaoMysql;
import modelo.UsuarioModelo;

public class UsuarioDao {
	
	// M�todo para autenticar usu�rios
	public static UsuarioModelo autenticar(String email, String senha) {
		
		// Objeto UsuarioModelo
		UsuarioModelo usuario = new UsuarioModelo();
		
		// Realizar a conex�o
		ConexaoMysql.realizarConexao();
		
		// Tentativa de verifica��o
		try {
			String sql = "SELECT * FROM usuarios WHERE emailUsuario=? and senhaUsuario=?"; 
			
			PreparedStatement pstmt = ConexaoMysql.conexao.prepareStatement(sql);
			pstmt.setString(1, email);
			pstmt.setString(2, senha);
			
			ResultSet rs = pstmt.executeQuery();
			rs.last();
			
			usuario.setIdUsuario(rs.getInt(1));
			usuario.setNomeUsuario(rs.getString(2));
			usuario.setEmailUsuario(rs.getString(3));
			usuario.setSenhaUsuario(rs.getString(4));
			usuario.setNivelUsuario(rs.getInt(5));
			
		}catch(Exception erro) {
			
		}finally {
			ConexaoMysql.finalizarConexao();
		}
		
		// Retorno
		return usuario;
		
	}
	
	// M�todo para atualizar os dados do usu�rio
	public static boolean alterarUsuario(UsuarioModelo usuario) {
		
		// Valida��o
		boolean valida = false;
		
		// Conex�o
		ConexaoMysql.realizarConexao();
		
		// Tentativa
		try {
			String sql = "UPDATE usuarios SET nomeUsuario=?, emailUsuario=?, senhaUsuario=? where idUsuario=?";
			
			PreparedStatement pstmt = ConexaoMysql.conexao.prepareStatement(sql);
			
			pstmt.setString(1, usuario.getNomeUsuario());
			pstmt.setString(2, usuario.getEmailUsuario());
			pstmt.setString(3, usuario.getSenhaUsuario());
			pstmt.setInt(4, usuario.getIdUsuario());
			
			pstmt.execute();
			
			valida = true;
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null, erro.getMessage());
		}finally {
			ConexaoMysql.finalizarConexao();
		}
		
		// Retorno
		return valida;
		
	}

}