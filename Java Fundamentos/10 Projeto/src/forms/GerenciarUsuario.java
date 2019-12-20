package forms;

//Importar componentes
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


public class GerenciarUsuario extends JFrame {

	// Componentes
	private JPanel contentPane;
	private JPasswordField txtRepetirNovaSenha;
	private JPasswordField txtNovaSenha;
	private JPasswordField txtSenhaAtual;
	private JTextField txtEmail;
	private JTextField txtNome;

	// Construtor
	public GerenciarUsuario() {
		
		// JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 279);
		
		// JPanel
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Componentes
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(22, 15, 52, 14);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(22, 46, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblSenhaAtual = new JLabel("Senha Atual:");
		lblSenhaAtual.setBounds(22, 95, 84, 14);
		contentPane.add(lblSenhaAtual);
		
		JLabel lblNovaSenha = new JLabel("Nova senha:");
		lblNovaSenha.setBounds(22, 126, 74, 14);
		contentPane.add(lblNovaSenha);
		
		JLabel lblRepetirNovaSenha = new JLabel("Repita a nova senha:");
		lblRepetirNovaSenha.setBounds(22, 157, 138, 14);
		contentPane.add(lblRepetirNovaSenha);
		
		JButton btnAlterar = new JButton("Alterar");
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
				String senha2 = new String(txtNovaSenha.getPassword());
				String senha3 = new String(txtRepetirNovaSenha.getPassword());
				
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
		btnAlterar.setBounds(137, 197, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Exibir o formulário Principal
				Principal principal = new Principal();
				principal.setVisible(true);
				
				// Fechar o formulário GerenciarUsuario
				dispose();
				
			}
		});
		btnCancelar.setBounds(251, 197, 89, 23);
		contentPane.add(btnCancelar);
		
		txtRepetirNovaSenha = new JPasswordField();
		txtRepetirNovaSenha.setBounds(189, 152, 264, 23);
		contentPane.add(txtRepetirNovaSenha);
		
		txtNovaSenha = new JPasswordField();
		txtNovaSenha.setBounds(189, 121, 264, 23);
		contentPane.add(txtNovaSenha);
		
		txtSenhaAtual = new JPasswordField();
		txtSenhaAtual.setBounds(189, 90, 264, 23);
		contentPane.add(txtSenhaAtual);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(189, 43, 264, 23);
		contentPane.add(txtEmail);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(189, 13, 264, 23);
		contentPane.add(txtNome);
	}
}