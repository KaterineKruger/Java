package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import dao.CategoriaDao;
import dao.FilmeDao;
import modelo.CategoriaModelo;
import modelo.FilmeModelo;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class FilmeForm extends JFrame {
	
	// Armazenar o código do filme (alterar/excluir)
	private static int codigo;

	// Objetos
	private JPanel pnlFilme;
	private JTextField txtFilme;
	private JTable tblFilmes;

	// Construtor
	public FilmeForm() {
		
		// Formulário
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 418);
		setLocationRelativeTo(null);
		
		// Painel
		pnlFilme = new JPanel();
		pnlFilme.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnlFilme);
		pnlFilme.setLayout(null);
		
		// Criação dos componentes
		JLabel lblFilme = new JLabel("Filme");
		JLabel lblCategoria = new JLabel("Categoria");
		txtFilme = new JTextField();
		JComboBox cbxCategoria = new JComboBox();
		JButton btnCadastrar = new JButton("Cadastrar");
		JButton btnAlterar = new JButton("Alterar");
		JButton btnCancelar = new JButton("Cancelar");
		JButton btnExcluir = new JButton("Excluir");
		JScrollPane scrlFilmes = new JScrollPane();
		tblFilmes = new JTable();
		
		
		// Características dos componentes
		lblFilme.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblFilme.setBounds(25, 59, 61, 16);
		pnlFilme.add(lblFilme);
		
		txtFilme.setBounds(106, 55, 358, 26);
		pnlFilme.add(txtFilme);
		txtFilme.setColumns(10);
		
		lblCategoria.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblCategoria.setBounds(20, 96, 81, 24);
		pnlFilme.add(lblCategoria);
		
		cbxCategoria.setBounds(106, 93, 358, 27);
		cbxCategoria.setModel(CategoriaDao.listarCategorias());
		pnlFilme.add(cbxCategoria);
		
		btnCadastrar.setBounds(6, 148, 117, 29);
		pnlFilme.add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Obter o nome do filme
				String nomeFilme = txtFilme.getText();
				
				// Obter o id da categoria
				CategoriaModelo cm = new CategoriaModelo();
				cm =  (CategoriaModelo) cbxCategoria.getSelectedItem();
				int categoriaFilme = cm.getIdCategoria();
				
				// Objeto FilmeModelo
				FilmeModelo fm = new FilmeModelo(nomeFilme, categoriaFilme);
				
				// Executar cadastro de filme
				FilmeDao.cadastrar(fm);
				
				// Atualizar a listagem
				tblFilmes.setModel(FilmeDao.listar());
				
				// Limpar campos
				txtFilme.setText("");
				cbxCategoria.setSelectedIndex(0);
				
			}
		});
		
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(124, 148, 117, 29);
		pnlFilme.add(btnAlterar);
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Obter dados
				int idFilme = codigo;
				String nomeFilme = txtFilme.getText();
				CategoriaModelo cm = new CategoriaModelo();
				cm = (CategoriaModelo) cbxCategoria.getSelectedItem();
				int categoriaFilme = cm.getIdCategoria();
				
				// Objeto FilmeModelo
				FilmeModelo fm = new FilmeModelo(idFilme, nomeFilme, categoriaFilme);
				
				// Alterar filme
				FilmeDao.alterar(fm);
				
				// Atualizar a listagem
				tblFilmes.setModel(FilmeDao.listar());
				
				// Limpar campos
				txtFilme.setText("");
				cbxCategoria.setSelectedIndex(0);
				
				// Botões
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);
				
			}
		});
		
		btnCancelar.setEnabled(false);
		btnCancelar.setBounds(359, 148, 117, 29);
		pnlFilme.add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Limpar campos
				txtFilme.setText("");
				cbxCategoria.setSelectedIndex(0);
				
				// Botões
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);
				
			}
		});
		
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(241, 148, 117, 29);
		pnlFilme.add(btnExcluir);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Remover filme
				FilmeDao.excluir(codigo);
				
				// Atualizar a listagem
				tblFilmes.setModel(FilmeDao.listar());
				
				// Limpar campos
				txtFilme.setText("");
				cbxCategoria.setSelectedIndex(0);
				
				// Botões
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);
				
			}
		});
		
		scrlFilmes.setBounds(20, 203, 451, 175);
		pnlFilme.add(scrlFilmes);
		
		scrlFilmes.setViewportView(tblFilmes);
		
		tblFilmes.setModel(FilmeDao.listar());
		tblFilmes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				// Linha selecionada
				int linha = tblFilmes.getSelectedRow();
				
				// Armazenar o código do filme
				codigo = Integer.parseInt(tblFilmes.getValueAt(linha, 0).toString());
				
				// Exibir o nome do filme
				txtFilme.setText(tblFilmes.getValueAt(linha, 1).toString());
				
				// Exibir o nome da categoria
				String categoriaSelecionada = tblFilmes.getValueAt(linha, 2).toString();
				for(int indice=0; indice<cbxCategoria.getItemCount(); indice++) {
					
					// Obter a categoria na posição do combobox
					String combo = cbxCategoria.getItemAt(indice).toString();
					
					// Condicional
					if(categoriaSelecionada.equals(combo)) {
						cbxCategoria.setSelectedIndex(indice);
					}
					
				}
				
				// Botões
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
				btnCancelar.setEnabled(true);
				
			}
		});
	}
}