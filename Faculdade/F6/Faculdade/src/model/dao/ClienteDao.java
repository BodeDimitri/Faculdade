package model.dao;

import java.util.List;

import model.entities.cliente;

public interface ClienteDao {

	void insert(cliente obj);
	List<cliente> findAll();
}
