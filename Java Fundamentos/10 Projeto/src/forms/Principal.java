package forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdd = new JLabel("");
		lblAdd.setIcon(new ImageIcon("C:\\Users\\Katerine\\Desktop\\Apex\\Apex - noturno\\Java Fundamentos\\10 Projeto\\src\\imagens\\person_add.png"));
		lblAdd.setBounds(111, 11, 128, 101);
		contentPane.add(lblAdd);
		
		JLabel lblEdit = new JLabel("");
		lblEdit.setIcon(new ImageIcon("C:\\Users\\Katerine\\Desktop\\Apex\\Apex - noturno\\Java Fundamentos\\10 Projeto\\src\\imagens\\person.png"));
		lblEdit.setBounds(289, 11, 120, 101);
		contentPane.add(lblEdit);
		
		JLabel lblGerenciar = new JLabel("");
		lblGerenciar.setIcon(new ImageIcon("C:\\Users\\Katerine\\Desktop\\Apex\\Apex - noturno\\Java Fundamentos\\10 Projeto\\src\\imagens\\shopping_cart.png"));
		lblGerenciar.setBounds(111, 152, 118, 112);
		contentPane.add(lblGerenciar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Katerine\\Desktop\\Apex\\Apex - noturno\\Java Fundamentos\\10 Projeto\\src\\imagens\\exit.png"));
		label.setBounds(289, 163, 128, 101);
		contentPane.add(label);
		
		JButton btnGerenciarUsurios = new JButton("Adicionar Usu\u00E1rios");
		btnGerenciarUsurios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Exibir o formulário Usuário
				Usuario usuario = new Usuario();
				usuario.setVisible(true);
				
				// Fechar o formulário Principal
				dispose();
			}
		});
		btnGerenciarUsurios.setBounds(101, 118, 142, 23);
		contentPane.add(btnGerenciarUsurios);
		
		JButton btnEditarDados = new JButton("Editar Dados");
		btnEditarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Exibir o formulário GerenciarUsuario
				GerenciarUsuario gerenciarUsuario = new GerenciarUsuario();
				gerenciarUsuario.setVisible(true);
				
				// Fechar o formulário Principal
				dispose();
			}
		});
		btnEditarDados.setBounds(287, 118, 142, 23);
		contentPane.add(btnEditarDados);
		
		JButton btnGerenciarProdutos = new JButton("Gerenciar Produtos");
		btnGerenciarProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Exibir o formulário Produto
				Produto produto = new Produto();
				produto.setVisible(true);
				
				// Fechar o formulário Principal
				dispose();
			}
		});
		btnGerenciarProdutos.setBounds(101, 271, 142, 23);
		contentPane.add(btnGerenciarProdutos);
		
		JButton btnSairDoSistema = new JButton("Sair do Sistema");
		btnSairDoSistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Fechar o formulário Principal
				dispose();
			}
		});
		btnSairDoSistema.setBounds(287, 271, 142, 23);
		contentPane.add(btnSairDoSistema);
	}
}
