package forms;

import java.awt.BorderLayout;
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

public class Produto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Produto frame = new Produto();
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
	public Produto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNome.setBounds(69, 14, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblValor.setBounds(69, 39, 46, 14);
		contentPane.add(lblValor);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMarca.setBounds(69, 64, 46, 14);
		contentPane.add(lblMarca);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(109, 11, 238, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(109, 36, 238, 20);
		contentPane.add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(109, 61, 238, 20);
		contentPane.add(comboBox);
		
		JButton button = new JButton("Cadastrar");
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button.setBounds(20, 92, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Alterar");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_1.setEnabled(false);
		button_1.setBounds(120, 92, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Excluir");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_2.setEnabled(false);
		button_2.setBounds(219, 92, 89, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Cancelar");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_3.setEnabled(false);
		button_3.setBounds(318, 92, 89, 23);
		contentPane.add(button_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(422, 255, -232, -102);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 118, 414, 139);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Marca", "Valor"
			}
		));
		scrollPane_1.setViewportView(table);
	}
}
