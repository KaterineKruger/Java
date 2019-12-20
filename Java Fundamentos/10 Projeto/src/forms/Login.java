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

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Classe
@SuppressWarnings({ "unused", "serial" })
public class Login extends JFrame {

	// Componentes
	private JPanel contentPane;
	private JTextField txtEMail;
	private JPasswordField txtSenha;

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
		JLabel lblEmail = new JLabel("E-Mail");
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmail.setBounds(45, 166, 51, 14);
		contentPane.add(lblEmail);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSenha.setBounds(45, 195, 51, 14);
		contentPane.add(lblSenha);
		
		txtEMail = new JTextField();
		txtEMail.setBounds(99, 162, 248, 20);
		contentPane.add(txtEMail);
		txtEMail.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(99, 191, 119, 20);
		contentPane.add(txtSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Obter e-mail e senha
				String email = txtEMail.getText();
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
		btnEntrar.setBounds(178, 227, 89, 23);
		contentPane.add(btnEntrar);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setIcon(new ImageIcon("C:\\Users\\Katerine\\Desktop\\Apex\\Apex - noturno\\Java Fundamentos\\10 Projeto\\src\\imagens\\iconfinder_lock.png"));
		lblImagem.setBounds(156, 11, 124, 137);
		contentPane.add(lblImagem);
	}
}
