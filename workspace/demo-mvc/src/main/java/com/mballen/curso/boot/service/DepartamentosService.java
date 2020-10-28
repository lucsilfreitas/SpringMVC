package com.mballen.curso.boot.service;

import java.util.List;

import com.mballen.curso.boot.domain.Departamentos;

public interface DepartamentosService {

	void salvar(Departamentos departamento);

	void editar(Departamentos departamento);

	void excluir(Long id);

	Departamentos buscarPorId(Long id);

	List<Departamentos> buscarTodos();
}
