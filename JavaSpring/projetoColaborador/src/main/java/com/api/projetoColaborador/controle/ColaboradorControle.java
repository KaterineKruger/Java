package com.api.projetoColaborador.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.projetoColaborador.modelo.ColaboradorModelo;
import com.api.projetoColaborador.modelo.RespostaModelo;
import com.api.projetoColaborador.repositorio.ColaboradorReposirorio;

@RestController
@RequestMapping("/api")
public class ColaboradorControle {

	@Autowired
	private ColaboradorReposirorio acoes;
	
	@RequestMapping(value="colaborador", method=RequestMethod.GET)
	public @ResponseBody List<ColaboradorModelo> listar(){
		return this.acoes.findAll();
	}
	
	@RequestMapping(value="colaborador", method=RequestMethod.POST)
	public @ResponseBody RespostaModelo cadastrar(@RequestBody ColaboradorModelo obj) {
		try {
			this.acoes.save(obj);
			return new RespostaModelo("Cadastro realizado com sucesso!");
		} catch (Exception erro) {
			return new RespostaModelo("Falha ao cadastrar: " + erro.getMessage());
		}
	}
	
	@RequestMapping(value="colaborador", method=RequestMethod.PUT)
	public @ResponseBody RespostaModelo alterar(@RequestBody ColaboradorModelo obj) {
		try {
			this.acoes.save(obj);
			return new RespostaModelo("Alteração realizada com sucesso!");
		} catch (Exception erro) {
			return new RespostaModelo("Falha ao alterar: " + erro.getMessage());
		}
	}
	
	@RequestMapping(value="colaborador/{codigo}", method=RequestMethod.GET)
	public @ResponseBody ColaboradorModelo buscar(@PathVariable("codigo") Integer codigo) {
		return this.acoes.findByCodigo(codigo);
	}
	
	@RequestMapping(value="colaborador/{codigo}", method=RequestMethod.DELETE)
	public @ResponseBody RespostaModelo deletar(@PathVariable("codigo") Integer codigo) {
		ColaboradorModelo obj = this.acoes.findByCodigo(codigo);
		try {
			this.acoes.delete(obj);
			return new RespostaModelo("Exclusão realizada com sucesso!");
		} catch (Exception erro) {
			return new RespostaModelo("Falha ao excluir: " + erro.getMessage());
		}
	}
	
}