package com.mballen.curso.boot.service;

import java.util.List;

import com.mballen.curso.boot.domain.Funcionarios;

public interface FuncionariosService {

	void salvar(Funcionarios funcionario);

	void editar(Funcionarios funcionario);

	void excluir(Long id);

	Funcionarios buscarPorId(Long id);

	List<Funcionarios> buscarTodos();
}
