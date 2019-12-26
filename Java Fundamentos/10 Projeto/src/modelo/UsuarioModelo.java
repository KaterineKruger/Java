package modelo;

public class UsuarioModelo {
	
	// Atributos
	private int idUsuario, nivelUsuario;
	private String nomeUsuario, emailUsuario, senhaUsuario;
	
	// Construtor - Padrão
	public UsuarioModelo() {}
	
	// Construtor - Cadastrar
	public UsuarioModelo(String nomeUsuario, String emailUsuario, String senhaUsuario, int nivelUsuario) {
		this.nomeUsuario = nomeUsuario;
		this.emailUsuario = emailUsuario;
		this.senhaUsuario = senhaUsuario;
		this.nivelUsuario = nivelUsuario;
	}
	
	// Construtor - Alterar
	public UsuarioModelo(String nomeUsuario, String emailUsuario, String senhaUsuario, int nivelUsuario, int idUsuario) {
		this.nomeUsuario = nomeUsuario;
		this.emailUsuario = emailUsuario;
		this.senhaUsuario = senhaUsuario;
		this.nivelUsuario = nivelUsuario;
		this.idUsuario = idUsuario;
	}
	
	// Set e Get
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getNivelUsuario() {
		return nivelUsuario;
	}

	public void setNivelUsuario(int nivelUsuario) {
		this.nivelUsuario = nivelUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}	
	
}