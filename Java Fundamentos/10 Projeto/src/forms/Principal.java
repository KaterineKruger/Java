// Pacote
package forms;

// Importar componentes
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	// Componente
	private JPanel contentPane;

	// Construtor
	public Principal() {
		
		// JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 371);
		
		// JPanel
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Componentes
		JLabel lblAdd = new JLabel("");
		lblAdd.setIcon(new ImageIcon("C:\\Users\\Katerine\\Desktop\\Apex\\Apex - noturno\\Java Fundamentos\\10 Projeto\\src\\imagens\\add.png"));
		lblAdd.setBounds(91, 7, 146, 112);
		contentPane.add(lblAdd);
		
		JLabel lblEdit = new JLabel("");
		lblEdit.setIcon(new ImageIcon("C:\\Users\\Katerine\\Desktop\\Apex\\Apex - noturno\\Java Fundamentos\\10 Projeto\\src\\imagens\\user.png"));
		lblEdit.setBounds(288, 7, 136, 112);
		contentPane.add(lblEdit);
		
		JLabel lblGerenciar = new JLabel("");
		lblGerenciar.setIcon(new ImageIcon("C:\\Users\\Katerine\\Desktop\\Apex\\Apex - noturno\\Java Fundamentos\\10 Projeto\\src\\imagens\\shopping.png"));
		lblGerenciar.setBounds(89, 152, 143, 127);
		contentPane.add(lblGerenciar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Katerine\\Desktop\\Apex\\Apex - noturno\\Java Fundamentos\\10 Projeto\\src\\imagens\\cancel.png"));
		label.setBounds(290, 164, 128, 112);
		contentPane.add(label);
		
		JButton btnGerenciarUsurios = new JButton("Gerenciar Usu\u00E1rios");
		btnGerenciarUsurios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				// Exibir o formulário GerenciarUsuario
				GerenciarUsuario gerenciarUsuario = new GerenciarUsuario();
				gerenciarUsuario.setVisible(true);
				
				// Fechar o formulário Principal
				dispose();
				
			}
		});
		btnGerenciarUsurios.setBounds(82, 118, 153, 23);
		contentPane.add(btnGerenciarUsurios);
		
		JButton btnEditarDados = new JButton("Editar Dados");
		btnEditarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Exibir o formulário Usuário
				Usuario usuario = new Usuario();
				usuario.setVisible(true);
				
				// Fechar o formulário Principal
				dispose();
			}
		});
		btnEditarDados.setBounds(276, 118, 153, 23);
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
		btnGerenciarProdutos.setBounds(82, 278, 153, 23);
		contentPane.add(btnGerenciarProdutos);
		
		JButton btnSairDoSistema = new JButton("Sair do Sistema");
		btnSairDoSistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Fechar o formulário Principal
				dispose();
			}
		});
		btnSairDoSistema.setBounds(276, 278, 153, 23);
		contentPane.add(btnSairDoSistema);
	}
}
