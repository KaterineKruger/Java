// Pacote
package forms;

// Importar componentes
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

// Classe
public class Usuario extends JFrame {

	// Componentes
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTable tblUsuarios;

	// Construtor
	public Usuario() {
		
		// JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 393);
		
		// JPanel
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Componentes
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNome.setBounds(14, 25, 61, 16);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmail.setBounds(14, 65, 61, 16);
		contentPane.add(lblEmail);
		
		JLabel lblNvel = new JLabel("Nível");
		lblNvel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNvel.setBounds(14, 108, 61, 16);
		contentPane.add(lblNvel);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNome.setBounds(69, 20, 403, 26);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtEmail.setBounds(69, 60, 403, 26);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JComboBox cbxNivel = new JComboBox();
		cbxNivel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cbxNivel.setBounds(69, 104, 403, 27);
		contentPane.add(cbxNivel);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCadastrar.setBounds(6, 160, 117, 29);
		contentPane.add(btnCadastrar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(123, 160, 117, 29);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(239, 160, 117, 29);
		contentPane.add(btnExcluir);
		
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
		btnCancelar.setBounds(355, 160, 117, 29);
		contentPane.add(btnCancelar);
		
		JScrollPane sclBarra = new JScrollPane();
		sclBarra.setBounds(16, 201, 449, 148);
		contentPane.add(sclBarra);
		
		DefaultTableModel dados = new DefaultTableModel();
		dados.addColumn("Nome");
		dados.addColumn("E-mail");
		dados.addColumn("Nível");
		
		tblUsuarios = new JTable(dados);
		sclBarra.setViewportView(tblUsuarios);
	}
}