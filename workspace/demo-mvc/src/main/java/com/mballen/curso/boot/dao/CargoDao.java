package com.mballen.curso.boot.dao;

import java.util.List;

import com.mballen.curso.boot.domain.Cargos;

public interface CargoDao {

	void save(Cargos cargo);

    void update(Cargos cargo);

    void delete(Long id);

    Cargos findById(Long id);

    List<Cargos> findAll();
}
