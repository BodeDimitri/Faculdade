package model.dao;

import java.util.List;

import model.entities.despesa;

public interface DespesaDAO {

	void insert(despesa obj);
	List<despesa> findAll();
}
