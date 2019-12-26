// Pacote
package forms;

// Importar componentes
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import modelo.UsuarioModelo;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

// Classe
public class Principal extends JFrame {

	// Componente
	private JPanel contentPane;
	
	// Construtor
	public Principal() {
		
		// JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 399);
		
		// JPanel
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Componentes
		JLabel lblGerenciar = new JLabel("");
		lblGerenciar.setIcon(new ImageIcon("C:\\Users\\Katerine\\Desktop\\Apex\\Apex - noturno\\Java Fundamentos\\10 Projeto\\src\\imagens\\add.png"));
		lblGerenciar.setBounds(40, 42, 137, 118);
		contentPane.add(lblGerenciar);
		
		JLabel lblUsuario = new JLabel("");
		lblUsuario.setIcon(new ImageIcon("C:\\Users\\Katerine\\Desktop\\Apex\\Apex - noturno\\Java Fundamentos\\10 Projeto\\src\\imagens\\user.png"));
		lblUsuario.setBounds(305, 50, 123, 108);
		contentPane.add(lblUsuario);
		
		JLabel lblProduto = new JLabel("");
		lblProduto.setVerticalAlignment(SwingConstants.BOTTOM);
		lblProduto.setIcon(new ImageIcon("C:\\Users\\Katerine\\Desktop\\Apex\\Apex - noturno\\Java Fundamentos\\10 Projeto\\src\\imagens\\shopping.png"));
		lblProduto.setBounds(40, 210, 137, 109);
		contentPane.add(lblProduto);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Katerine\\Desktop\\Apex\\Apex - noturno\\Java Fundamentos\\10 Projeto\\src\\imagens\\cancel.png"));
		label.setBounds(302, 210, 123, 109);
		contentPane.add(label);
		
		JButton btnGerenciarUsuarios = new JButton("Gerenciar Usuários");
		btnGerenciarUsuarios.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnGerenciarUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Exibir o formulário GerenciarUsuario
				Usuario gerenciarUsuario = new Usuario();
				gerenciarUsuario.setVisible(true);
				
				// Fechar o formulário Login
				dispose();
				
			}
		});
		btnGerenciarUsuarios.setBounds(34, 162, 146, 29);
		contentPane.add(btnGerenciarUsuarios);
		
		if(principal.Principal.usuario.getNivelUsuario() == 2) {
			btnGerenciarUsuarios.setEnabled(false);
		}
		
		JButton btnEditarDados = new JButton("Editar Dados");
		btnEditarDados.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEditarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Exibir o formulário Usuario
				GerenciarUsuario usuario = new GerenciarUsuario();
				usuario.setVisible(true);
				
				// Fechar o formulário Login
				dispose();
				
			}
		});
		btnEditarDados.setBounds(294, 162, 146, 29);
		contentPane.add(btnEditarDados);
		
		JButton btnSairDoSistema = new JButton("Sair do Sistema");
		btnSairDoSistema.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSairDoSistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Fechar o formulário Login
				dispose();
				
			}
		});
		btnSairDoSistema.setBounds(294, 322, 146, 29);
		contentPane.add(btnSairDoSistema);
		
		JButton btnGerenciarProdutos = new JButton("Gerenciar Produtos");
		btnGerenciarProdutos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnGerenciarProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Exibir o formulário Produto
				Produto produto = new Produto();
				produto.setVisible(true);
				
				// Fechar o formulário Login
				dispose();
				
			}
		});
		btnGerenciarProdutos.setBounds(34, 322, 146, 29);
		contentPane.add(btnGerenciarProdutos);
		
		JLabel lblUsuarioTopo = new JLabel("Olá "+principal.Principal.usuario.getNomeUsuario());
		lblUsuarioTopo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsuarioTopo.setBounds(6, 6, 146, 16);
		contentPane.add(lblUsuarioTopo);
	}
}