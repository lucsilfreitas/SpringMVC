package com.mballen.curso.boot.dao;

import java.util.List;

import com.mballen.curso.boot.domain.Departamentos;

public interface DepartamentoDao {

	 void save(Departamentos departamento);

	    void update(Departamentos departamento);

	    void delete(Long id);

	    Departamentos findById(Long id);

	    List<Departamentos> findAll();
}
