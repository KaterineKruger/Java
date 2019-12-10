// Pacote
package forms;

// Importar componentes
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
		setBounds(100, 100, 450, 300);
		
		// JPanel
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Componentes
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(69, 8, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("E-Mail");
		lblEmail.setBounds(69, 33, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblNivel = new JLabel("N\u00EDvel");
		lblNivel.setBounds(69, 58, 46, 14);
		contentPane.add(lblNivel);
		
		txtNome = new JTextField();
		txtNome.setBounds(109, 5, 238, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(109, 30, 238, 20);
		contentPane.add(txtEmail);
		
		JComboBox cbxNivel = new JComboBox();
		cbxNivel.setBounds(109, 55, 238, 20);
		contentPane.add(cbxNivel);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(20, 86, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(120, 86, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(219, 86, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setEnabled(false);
		btnCancelar.setBounds(318, 86, 89, 23);
		contentPane.add(btnCancelar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(422, 249, -232, -102);
		contentPane.add(scrollPane);
		
		JScrollPane sclTabela = new JScrollPane();
		sclTabela.setBounds(10, 112, 414, 139);
		contentPane.add(sclTabela);
		
		tblUsuarios = new JTable();
		tblUsuarios.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Nome", "E-Mail", "N\u00EDvel"
			}
		));
		sclTabela.setViewportView(tblUsuarios);
	}
}
