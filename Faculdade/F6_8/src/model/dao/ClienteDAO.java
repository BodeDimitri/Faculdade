package model.dao;

import java.util.List;

import model.entities.cliente;

public interface ClienteDAO {

	void insert(cliente obj);
	List<cliente> findAll();
}
