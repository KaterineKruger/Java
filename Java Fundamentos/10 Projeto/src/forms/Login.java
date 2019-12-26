// Pacote
package forms;

// Importar componente
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import dao.UsuarioDao;
import modelo.UsuarioModelo;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Classe
public class Login extends JFrame {

	// Componentes
	private JPanel contentPane;
	private JTextField txtEmail;
	private JPasswordField txtSenha;
	private JButton btnEntrar;

	// Construtor
	public Login() {
		
		// JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		// Painel
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Adicionar componentes
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(24, 150, 67, 24);
		contentPane.add(lblEmail);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(24, 188, 67, 24);
		contentPane.add(lblSenha);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtEmail.setBounds(83, 150, 347, 26);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtSenha.setBounds(83, 188, 347, 26);
		contentPane.add(txtSenha);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Obter e-mail e senha
				String email = txtEmail.getText();
				String senha = new String(txtSenha.getPassword());
				
				// Realizar a autenticação
				UsuarioModelo usuario = UsuarioDao.autenticar(email, senha);
				
				
				// Validar
				if(usuario.getIdUsuario() == 0) {
					JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos");
				}else {
					principal.Principal.usuario = usuario;
					
					Principal principal = new Principal();
					principal.setVisible(true);
					
					dispose();
				}
				
			}
		});
		btnEntrar.setBounds(165, 225, 117, 29);
		contentPane.add(btnEntrar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Katerine\\Desktop\\Apex\\Apex - noturno\\Java Fundamentos\\10 Projeto\\src\\imagens\\iconfinder_lock.png"));
		label.setBounds(162, 23, 128, 108);
		contentPane.add(label);
	}
}