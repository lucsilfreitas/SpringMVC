package com.mballen.curso.boot.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mballen.curso.boot.dao.FuncionarioDao;
import com.mballen.curso.boot.domain.Funcionario;

@Service
@Transactional(readOnly = false)
public class FuncionarioImpl implements FuncionarioService {

	@Autowired
	private FuncionarioDao dao;
	
	
	
	@Override
	public void salvar(Funcionario funcionario) {
		dao.save(funcionario);
		
	}

	@Override
	public void editar(Funcionario funcionario) {
	 dao.update(funcionario);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Funcionario buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Funcionario> buscarTodos() {
	
		return dao.findAll();
	}

	@Override
	public List<Funcionario> buscarPorNome(String id) {
		return dao.findByCargoId(id);
	}

	@Override
	public List<Funcionario> buscarPorCargo(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Funcionario> buscarPorDatas(LocalDate entrada, LocalDate saida) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
