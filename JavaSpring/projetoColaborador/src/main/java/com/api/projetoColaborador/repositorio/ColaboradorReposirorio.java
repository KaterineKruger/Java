package com.api.projetoColaborador.repositorio;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.api.projetoColaborador.modelo.ColaboradorModelo;

public interface ColaboradorReposirorio extends Repository<ColaboradorModelo, Integer> {

	List<ColaboradorModelo> findAll();
	ColaboradorModelo findByCodigo(Integer codigo);
	void save(ColaboradorModelo c);
	void delete(ColaboradorModelo c);
	
}