package modelo;

public class CategoriaModelo {

	// Atributos
	private int idCategoria;
	private String nomeCategoria;
	
	// Set e Get
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNomeCategoria() {
		return nomeCategoria;
	}
	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	
	// M�todo toString()
	public String toString() {
		return this.nomeCategoria;
	}
	
}