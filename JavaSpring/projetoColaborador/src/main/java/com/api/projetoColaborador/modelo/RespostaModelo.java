package com.api.projetoColaborador.modelo;

public class RespostaModelo {

	// Atributo
	private String mensagem;
	
	// Construtores
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