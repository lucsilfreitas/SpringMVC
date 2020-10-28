package com.mballen.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mballen.curso.boot.dao.FuncionarioDao;
import com.mballen.curso.boot.domain.Funcionarios;

@Service
@Transactional(readOnly = false)
public class FuncionariosImpl implements FuncionariosService {

	@Autowired
	private FuncionarioDao dao;
	
	
	
	@Override
	public void salvar(Funcionarios funcionario) {
		dao.save(funcionario);
		
	}

	@Override
	public void editar(Funcionarios funcionario) {
	 dao.update(funcionario);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Funcionarios buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Funcionarios> buscarTodos() {
	
		return dao.findAll();
	}

}
