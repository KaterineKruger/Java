// Pacote
package forms;

// Importar componentes
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import dao.UsuarioDao;
import modelo.UsuarioModelo;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

// Classe
public class GerenciarUsuario extends JFrame {

	// Componentes
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JPasswordField txtSenhaAtual;
	private JPasswordField txtSenhaNova1;
	private JPasswordField txtSenhaNova2;

	// Construtor
	public GerenciarUsuario() {
		
		// JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 313);
		
		// JPanel
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Componentes
		JLabel label = new JLabel("Nome");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(10, 39, 61, 16);
		contentPane.add(label);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNome.setColumns(10);
		txtNome.setBounds(148, 29, 307, 26);
		txtNome.setText(principal.Principal.usuario.getNomeUsuario());
		contentPane.add(txtNome);
		
		JLabel label_1 = new JLabel("E-mail");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(10, 72, 61, 16);
		contentPane.add(label_1);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtEmail.setColumns(10);
		txtEmail.setBounds(148, 66, 307, 26);
		txtEmail.setText(principal.Principal.usuario.getEmailUsuario());
		contentPane.add(txtEmail);
		
		JLabel lblSsehaAtual = new JLabel("Senha atual");
		lblSsehaAtual.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSsehaAtual.setBounds(10, 110, 88, 16);
		contentPane.add(lblSsehaAtual);
		
		JLabel lblNovaSenha = new JLabel("Nova senha");
		lblNovaSenha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNovaSenha.setBounds(10, 149, 88, 16);
		contentPane.add(lblNovaSenha);
		
		JLabel lblRepetirNovaSenha = new JLabel("Repetir nova senha");
		lblRepetirNovaSenha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRepetirNovaSenha.setBounds(10, 185, 125, 16);
		contentPane.add(lblRepetirNovaSenha);
		
		txtSenhaAtual = new JPasswordField();
		txtSenhaAtual.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtSenhaAtual.setBounds(148, 104, 307, 26);
		contentPane.add(txtSenhaAtual);
		
		txtSenhaNova1 = new JPasswordField();
		txtSenhaNova1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtSenhaNova1.setBounds(148, 143, 307, 26);
		contentPane.add(txtSenhaNova1);
		
		txtSenhaNova2 = new JPasswordField();
		txtSenhaNova2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtSenhaNova2.setBounds(148, 179, 307, 26);
		contentPane.add(txtSenhaNova2);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Obter dados do usuário
				int idUsuario = principal.Principal.usuario.getIdUsuario();
				String nomeUsuario = txtNome.getText();
				String emailUsuario = txtEmail.getText();
				String senhaUsuario = principal.Principal.usuario.getSenhaUsuario();
				int nivelUsuario = principal.Principal.usuario.getNivelUsuario();
				
				// Obter os valores das senhas
				String senha1 = new String(txtSenhaAtual.getPassword());
				String senha2 = new String(txtSenhaNova1.getPassword());
				String senha3 = new String(txtSenhaNova2.getPassword());
				
				// Validar senhas
				if(!senha1.equals(senhaUsuario)) {
					JOptionPane.showMessageDialog(null, "A senha atual informada não confere");
				}else if(!senha2.equals(senha3)) {
					JOptionPane.showMessageDialog(null, "A senha nova precisa ser igual a validação");	
				}else {
					
					UsuarioModelo u = new UsuarioModelo(nomeUsuario, emailUsuario, senha2, nivelUsuario, idUsuario);
					
					boolean valida = UsuarioDao.alterarUsuario(u);
					
					if(valida) {
						principal.Principal.usuario = u;
						JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
					}else {
						JOptionPane.showMessageDialog(null, "Falha ao alterar os dados");	
					}
					
					
				}
				
			}
		});
		btnAlterar.setBounds(93, 228, 117, 29);
		contentPane.add(btnAlterar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Exibir o formulário Principal
				Principal principal = new Principal();
				principal.setVisible(true);
				
				// Fechar o formulário Login
				dispose();
				
			}
		});
		btnCancelar.setBounds(222, 228, 117, 29);
		contentPane.add(btnCancelar);
	}
}