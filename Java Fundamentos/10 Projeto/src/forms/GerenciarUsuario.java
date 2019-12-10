package forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GerenciarUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JPasswordField txtSenhaAtual;
	private JPasswordField txtNovaSenha;
	private JPasswordField txtNovaSenha2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenciarUsuario frame = new GerenciarUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GerenciarUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Consolas", Font.PLAIN, 12));
		lblNome.setBounds(22, 15, 52, 14);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("E-Mail");
		lblEmail.setFont(new Font("Consolas", Font.PLAIN, 12));
		lblEmail.setBounds(22, 46, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblSenhaAtual = new JLabel("Senha Atual");
		lblSenhaAtual.setFont(new Font("Consolas", Font.PLAIN, 12));
		lblSenhaAtual.setBounds(22, 95, 84, 14);
		contentPane.add(lblSenhaAtual);
		
		JLabel lblNovaSenha = new JLabel("Nova senha");
		lblNovaSenha.setFont(new Font("Consolas", Font.PLAIN, 12));
		lblNovaSenha.setBounds(22, 126, 74, 14);
		contentPane.add(lblNovaSenha);
		
		JLabel lblRepetirNovaSenha = new JLabel("Repita a nova senha");
		lblRepetirNovaSenha.setFont(new Font("Consolas", Font.PLAIN, 12));
		lblRepetirNovaSenha.setBounds(22, 157, 138, 14);
		contentPane.add(lblRepetirNovaSenha);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(123, 197, 89, 23);
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
		btnCancelar.setBounds(233, 197, 89, 23);
		contentPane.add(btnCancelar);
		
		txtNome = new JTextField();
		txtNome.setBounds(160, 11, 264, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(160, 42, 264, 23);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtSenhaAtual = new JPasswordField();
		txtSenhaAtual.setBounds(160, 90, 264, 23);
		contentPane.add(txtSenhaAtual);
		
		txtNovaSenha = new JPasswordField();
		txtNovaSenha.setBounds(160, 121, 264, 23);
		contentPane.add(txtNovaSenha);
		
		txtNovaSenha2 = new JPasswordField();
		txtNovaSenha2.setBounds(160, 152, 264, 23);
		contentPane.add(txtNovaSenha2);
	}

}
