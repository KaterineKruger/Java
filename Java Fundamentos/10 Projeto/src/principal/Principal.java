package principal;

import java.sql.ResultSet;
import java.sql.Statement;
//import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import conexao.ConexaoMysql;
import forms.Login;

public class Principal {

	public static void main(String[] args) {

		// Instanciar a classe Login
		Login login = new Login();
		login.setVisible(true);

		// Inserir uma nova marca
//		try {
//			String marca = "Microsoft";
//			String sql = "insert into marcas(nomeMarca) values(?);";
//
//			PreparedStatement pstmt = ConexaoMysql.realizarConexao().prepareStatement(sql);
//			pstmt.setString(1, marca);
//			pstmt.execute();
//			
//		} catch (Exception erro) {
//			JOptionPane.showMessageDialog(null, "Falha ao cadastrar " + erro.getMessage());
//		}

		// Selecionar marcas
//		try {
//			
//			ConexaoMysql.realizarConexao();
//			
//			String sql = "select * from marcas";
//			Statement stmt = ConexaoMysql.conexao.createStatement();
//			ResultSet rs = stmt.executeQuery(sql);
//			
//			while(rs.next()) {
//				System.out.println(rs.getString(2));
//			}
//			
//		} catch (Exception erro) {
//			JOptionPane.showMessageDialog(null, "Falha ao cadastrar " + erro.getMessage());
//		} finally {
//			ConexaoMysql.finalizarConexao();
//		}
//		
	}

}