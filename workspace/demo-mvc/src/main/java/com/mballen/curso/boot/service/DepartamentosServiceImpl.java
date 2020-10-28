package com.mballen.curso.boot.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mballen.curso.boot.dao.DepartamentoDao;
import com.mballen.curso.boot.domain.Departamentos;

@Service
public class DepartamentosServiceImpl implements DepartamentosService {

	@Autowired
	private DepartamentoDao dao;
	
	@Transactional(readOnly = false)
	@Override
	public void salvar(Departamentos departamento) {
		dao.save(departamento);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(Departamentos departamento) {
		dao.update(departamento);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Transactional(readOnly = true)
	@Override
	public Departamentos buscarPorId(Long id) {
	
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Departamentos> buscarTodos() {
	
		return dao.findAll();	}

}
