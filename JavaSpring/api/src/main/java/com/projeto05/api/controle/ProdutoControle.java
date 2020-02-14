package com.projeto05.api.controle;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.projeto05.api.modelo.ProdutoModelo;
import com.projeto05.api.modelo.RespostaModelo;
import com.projeto05.api.repositorio.ProdutoRepositorio;

@RestController
@RequestMapping("/api")
public class ProdutoControle {

	@Autowired
	private ProdutoRepositorio acoes;
	
	@RequestMapping(value="produtos", method=RequestMethod.GET)
	public @ResponseBody List<ProdutoModelo> listar(){
		return this.acoes.findAll();
	}
	
	@RequestMapping(value="produtos", method=RequestMethod.POST)
	public @ResponseBody RespostaModelo cadastrar(@RequestBody ProdutoModelo obj) {
		try {
			this.acoes.save(obj);
			return new RespostaModelo("Cadastro realizado com sucesso!");
		} catch (Exception erro) {
			return new RespostaModelo("Falha ao cadastrar: " + erro.getMessage());
		}
	}

	@RequestMapping(value="/produtos/{codigo}", method=RequestMethod.GET)
	public @ResponseBody ProdutoModelo buscar(@PathVariable("codigo") Integer codigo) {
		return this.acoes.findByCodigo(codigo);
	}
	
	@RequestMapping(value="/produtos", method=RequestMethod.PUT)
	public @ResponseBody RespostaModelo alterar(@RequestBody ProdutoModelo produto) {
		try {
			this.acoes.save(produto);
			return new RespostaModelo("Alteração realizada com sucesso!");
		} catch (Exception erro) {
			return new RespostaModelo("Falha ao alterar: " + erro.getMessage());
		}
	}
	
	@RequestMapping(value="/produtos/{codigo}", method=RequestMethod.DELETE)
	public @ResponseBody RespostaModelo deletar(@PathVariable("codigo") Integer codigo) {
		ProdutoModelo produto = this.acoes.findByCodigo(codigo);
		try {
			this.acoes.delete(produto);
			return new RespostaModelo("Exclusão realizada com sucesso!");
		} catch (Exception erro) {
			return new RespostaModelo("Falha ao excluir: " + erro.getMessage());
		}
	}
	
}