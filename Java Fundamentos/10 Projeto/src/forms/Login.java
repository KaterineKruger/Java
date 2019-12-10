// Pacote
package forms;

// Importar componentes
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
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
		lblEmail.setFont(new Font("Consolas", Font.PLAIN, 12));
		lblEmail.setBounds(45, 166, 51, 14);
		contentPane.add(lblEmail);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Consolas", Font.PLAIN, 12));
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
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Exibir o formulário Principal
				Principal principal = new Principal();
				principal.setVisible(true);
				
				// Fechar o formulário Login
				dispose();
				
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
