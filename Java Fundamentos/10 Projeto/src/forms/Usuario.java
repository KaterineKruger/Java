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
import java.awt.Font;

// Classe
public class Usuario extends JFrame {

	// Componentes
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTable table;

	
	// Construtor
	public Usuario() {
		
		// JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 339);
		
		// JPanel
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Componentes
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNome.setBounds(98, 6, 76, 17);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("E-Mail");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmail.setBounds(98, 33, 55, 20);
		contentPane.add(lblEmail);
		
		JLabel lblNivel = new JLabel("N\u00EDvel");
		lblNivel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNivel.setBounds(98, 61, 55, 27);
		contentPane.add(lblNivel);
		
		txtNome = new JTextField();
		txtNome.setBounds(173, 5, 238, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(173, 34, 238, 20);
		contentPane.add(txtEmail);
		
		JComboBox cbxNivel = new JComboBox();
		cbxNivel.setBounds(173, 65, 238, 20);
		contentPane.add(cbxNivel);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCadastrar.setBounds(35, 96, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(164, 96, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(298, 96, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCancelar.setEnabled(false);
		btnCancelar.setBounds(422, 96, 89, 23);
		contentPane.add(btnCancelar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 121, 535, 180);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "E-mail", "N\u00EDvel"
			}
		));
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		scrollPane.setViewportView(table);
	}
}
