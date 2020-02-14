package com.projeto05.api.repositorio;

import java.util.List;
import org.springframework.data.repository.Repository;
import com.projeto05.api.modelo.ProdutoModelo;

public interface ProdutoRepositorio extends Repository<ProdutoModelo, Integer> {

	List<ProdutoModelo> findAll();
	ProdutoModelo findByCodigo(Integer codigo);
	void save(ProdutoModelo c);
	void delete(ProdutoModelo c);
	
}