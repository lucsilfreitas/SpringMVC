package com.mballen.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.mballen.curso.boot.domain.Funcionarios;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionarios, Long> implements FuncionarioDao{

}
