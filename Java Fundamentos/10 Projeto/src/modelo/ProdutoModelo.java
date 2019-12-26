package modelo;

public class ProdutoModelo {

	// Atributos
	private int idProduto, marcaProduto;
	private String nomeProduto;
	private double valorProduto;
	
	// Construtor - cadastrar
	public ProdutoModelo(int marcaProduto, String nomeProduto, double valorProduto) {
		this.marcaProduto = marcaProduto;
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
	}
	
	//Construtor - alterar
	public ProdutoModelo(int idProduto, int marcaProduto, String nomeProduto, double valorProduto) {
		this.idProduto = idProduto;
		this.marcaProduto = marcaProduto;
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
	}
	
	// Set e Get
	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public int getMarcaProduto() {
		return marcaProduto;
	}

	public void setMarcaProduto(int marcaProduto) {
		this.marcaProduto = marcaProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

}