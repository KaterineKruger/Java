// Pacote
package forms;

// Importar componentes
import java.awt.BorderLayout;
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
public class Produto extends JFrame {

	// Componentes
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtValor;
	private JTable tblProdutos;

	// Construtor
	public Produto() {
		
		// JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 387);
		
		// JPanel
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Componentes
		JLabel label = new JLabel("Nome");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(26, 19, 61, 16);
		contentPane.add(label);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblValor.setBounds(26, 59, 61, 16);
		contentPane.add(lblValor);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMarca.setBounds(26, 102, 61, 16);
		contentPane.add(lblMarca);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNome.setColumns(10);
		txtNome.setBounds(85, 14, 399, 26);
		contentPane.add(txtNome);
		
		txtValor = new JTextField();
		txtValor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtValor.setColumns(10);
		txtValor.setBounds(85, 54, 399, 26);
		contentPane.add(txtValor);
		
		JComboBox cbxMarca = new JComboBox();
		cbxMarca.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cbxMarca.setBounds(85, 98, 399, 27);
		contentPane.add(cbxMarca);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCadastrar.setBounds(18, 154, 117, 29);
		contentPane.add(btnCadastrar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(135, 154, 117, 29);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(251, 154, 117, 29);
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
		btnCancelar.setBounds(367, 154, 117, 29);
		contentPane.add(btnCancelar);
		
		JScrollPane sclBarra = new JScrollPane();
		sclBarra.setBounds(28, 195, 449, 148);
		contentPane.add(sclBarra);
		
		DefaultTableModel dados = new DefaultTableModel();
		dados.addColumn("Nome");
		dados.addColumn("Marca");
		dados.addColumn("valor");
		
		tblProdutos = new JTable(dados);
		sclBarra.setViewportView(tblProdutos);
	}
}