package com.mballen.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mballen.curso.boot.dao.CargoDao;
import com.mballen.curso.boot.domain.Cargos;

@Service 
@Transactional (readOnly = false)
public class CargosServiceImpl implements CargosService {

	@Autowired
	private  CargoDao dao;
	
	@Override
	public void salvar(Cargos cargo) {
		dao.save(cargo);
		
	}

	@Override
	public void editar(Cargos cargo) {
		dao.update(cargo);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override
	@Transactional (readOnly = true)
	public Cargos buscarPorId(Long id) {
		return dao.findById(id);
		
	}

	@Override
	@Transactional (readOnly = true)
	public List<Cargos> buscarTodos() {
		
		return dao.findAll();
	}

}
