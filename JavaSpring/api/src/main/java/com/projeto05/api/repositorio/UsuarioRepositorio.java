package com.projeto05.api.repositorio;

import java.util.List;
import org.springframework.data.repository.Repository;
import com.projeto05.api.modelo.UsuarioModelo;

public interface UsuarioRepositorio extends Repository<UsuarioModelo, Integer> {

	List<UsuarioModelo> findAll();
	UsuarioModelo findByCodigo(Integer codigo);
	void save(UsuarioModelo c);
	void delete(UsuarioModelo c);
	
}