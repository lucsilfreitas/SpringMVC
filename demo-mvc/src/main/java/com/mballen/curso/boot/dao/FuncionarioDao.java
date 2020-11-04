package com.mballen.curso.boot.dao;

import java.util.List;

import com.mballen.curso.boot.domain.Funcionarios;

public interface FuncionarioDao {

	void save(Funcionarios funcionario);

    void update(Funcionarios funcionario);

    void delete(Long id);

    Funcionarios findById(Long id);

    List<Funcionarios> findAll();
}
