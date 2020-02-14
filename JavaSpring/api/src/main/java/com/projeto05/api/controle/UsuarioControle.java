package com.projeto05.api.controle;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.projeto05.api.modelo.UsuarioModelo;
import com.projeto05.api.modelo.RespostaModelo;
import com.projeto05.api.repositorio.UsuarioRepositorio;

@RestController
@RequestMapping("/api")
public class UsuarioControle {

	@Autowired
	private UsuarioRepositorio acoes;
	
	@RequestMapping(value="usuarios", method=RequestMethod.GET)
	public @ResponseBody List<UsuarioModelo> listar(){
		return this.acoes.findAll();
	}
	
	@RequestMapping(value="usuarios", method=RequestMethod.POST)
	public @ResponseBody RespostaModelo cadastrar(@RequestBody UsuarioModelo obj) {
		try {
			this.acoes.save(obj);
			return new RespostaModelo("Cadastro realizado com sucesso!");
		} catch (Exception erro) {
			return new RespostaModelo("Falha ao cadastrar: " + erro.getMessage());
		}
	}
	
	@RequestMapping(value="usuarios", method=RequestMethod.PUT)
	public @ResponseBody RespostaModelo alterar(@RequestBody UsuarioModelo obj) {
		try {
			this.acoes.save(obj);
			return new RespostaModelo("Alteração realizada com sucesso!");
		} catch (Exception erro) {
			return new RespostaModelo("Falha ao alterar: " + erro.getMessage());
		}
	}
	
	@RequestMapping(value="/usuarios/{codigo}", method=RequestMethod.GET)
	public @ResponseBody UsuarioModelo buscar(@PathVariable("codigo") Integer codigo) {
		return this.acoes.findByCodigo(codigo);
	}
	
	@RequestMapping(value="/usuarios/{codigo}", method=RequestMethod.DELETE)
	public @ResponseBody RespostaModelo deletar(@PathVariable("codigo") Integer codigo) {
		UsuarioModelo obj = this.acoes.findByCodigo(codigo);
		try {
			this.acoes.delete(obj);
			return new RespostaModelo("Exclusão realizada com sucesso!");
		} catch (Exception erro) {
			return new RespostaModelo("Falha ao excluir: " + erro.getMessage());
		}
	}
	
}