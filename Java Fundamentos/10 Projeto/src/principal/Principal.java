package principal;

import forms.Login;
import modelo.UsuarioModelo;

public class Principal {
	
	// Objeto estático da classe UsuarioModelo
	public static UsuarioModelo usuario;

	public static void main(String[] args) {
			
		// Instânciar classe Login
		Login login = new Login();
		login.setVisible(true);
		
		
		
		// Inserir uma nova marca
//		try {
//			String marca = "Microsoft";
//			String sql = "insert into marcas (nomeMarca) values (?)";
//		
//			PreparedStatement pstmt = ConexaoMysql.realizarConexao().prepareStatement(sql);
//			pstmt.setString(1, marca);
//			pstmt.execute();
//			
//		}catch(Exception erro){
//			JOptionPane.showMessageDialog(null, "Falha ao cadastrar "+erro.getMessage());
//		}
		
		//Selecionar marcas
//		try {
//			ConexaoMysql.realizarConexao();
//			
//			String sql = "SELECT * FROM marcas";
//			
//			Statement stmt = ConexaoMysql.conexao.createStatement();
//			
//			ResultSet rs = stmt.executeQuery(sql);
//			
//			while(rs.next()) {
//				System.out.println(rs.getString(2));
//			}
//			
//		}catch(Exception erro) {
//			JOptionPane.showMessageDialog(null, "Falha ao selecionar "+erro.getMessage());
//		}finally {
//			ConexaoMysql.finalizarConexao();
//		}
					
	}

}