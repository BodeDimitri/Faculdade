package model.dao;

import db.DB;
import model.dao.impl.ClienteDaoJDBC;
import model.dao.impl.DespesaDaoJDBC;

public class DAOfactory {

	public static ClienteDAO createClienteDao() {
		return new ClienteDaoJDBC(DB.getConnection());
	}
	
	public static DespesaDAO createDespesaDao() {
		return new DespesaDaoJDBC(DB.getConnection());
	}
}
