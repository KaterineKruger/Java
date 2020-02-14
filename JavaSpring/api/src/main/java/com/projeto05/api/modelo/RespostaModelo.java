package com.projeto05.api.modelo;

public class RespostaModelo {

	// Atributo
	private String mensagem;
	
	// Construtor
	public RespostaModelo() {}
	
	public RespostaModelo(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}