package com.mballen.curso.boot.service;

import java.util.List;

import com.mballen.curso.boot.domain.Cargos;

public interface CargosService {

	void salvar(Cargos cargo);

	void editar(Cargos cargo);

	void excluir(Long id);

	Cargos buscarPorId(Long id);

	List<Cargos> buscarTodos();

}
