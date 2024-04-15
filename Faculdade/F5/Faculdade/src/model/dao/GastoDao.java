package model.dao;

import java.util.List;

import model.entities.gasto;

public interface GastoDao {

	void insert(gasto obj);
	List<gasto> findAll();
}
