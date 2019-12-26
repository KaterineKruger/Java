package modelo;

public class FilmeModelo {
	
	// Atributos
	private int idFilme, categoriaFilme;
	private String nomeFilme;
	
	// Construtores
	public FilmeModelo(String nomeFilme, int categoriaFilme) {
		this.nomeFilme = nomeFilme;
		this.categoriaFilme = categoriaFilme;
	}
	
	public FilmeModelo(int idFilme, String nomeFilme, int categoriaFilme) {
		this.idFilme = idFilme;
		this.nomeFilme = nomeFilme;
		this.categoriaFilme = categoriaFilme;
	}
	
	public FilmeModelo() {}
	
	// Set e Get
	public int getIdFilme() {
		return idFilme;
	}
	public void setIdFilme(int idFilme) {
		this.idFilme = idFilme;
	}
	public int getCategoriaFilme() {
		return categoriaFilme;
	}
	public void setCategoriaFilme(int categoriaFilme) {
		this.categoriaFilme = categoriaFilme;
	}
	public String getNomeFilme() {
		return nomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	
}