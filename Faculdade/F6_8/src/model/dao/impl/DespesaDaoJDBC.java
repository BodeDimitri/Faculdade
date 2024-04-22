package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.DespesaDAO;
import model.entities.cliente;
import model.entities.despesa;

public class DespesaDaoJDBC implements DespesaDAO {

	private Connection conn;
	
	public DespesaDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public List<despesa> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			st = conn.prepareStatement("SELECT * FROM despesa ORDER BY cliente");
			rs = st.executeQuery();
			
			List<despesa> list = new ArrayList<>();
			
			while(rs.next()) {
				despesa despesa = new despesa(0, null, 0, null, 0);
				despesa.setId_despesa(rs.getInt("id"));
				despesa.setUsuario((cliente) rs.getObject("clinte"));
				despesa.setValor(rs.getDouble("valor"));
				despesa.setDescricao(rs.getString("descricao"));
				list.add(despesa);
			}
			
			return list;

		} catch (SQLException e) {
			throw new DbException("Erro ao buscar tabela despesa no banco de dados:" +  e.getMessage());
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
		}
	}

	@Override
	public void insert(despesa obj) {
		PreparedStatement st = null;

		try {
			st = conn.prepareStatement("INSERT INTO despesa " +
					"(id, cliente, valor, descricao) "+
					"VALUES " +
					"(?, ?, ?, ?)");

			
			st.setInt(1, obj.getId_despesa());
			st.setObject(2, obj.getUsuario());
			st.setDouble(3, obj.getValor());
			st.setString(4, obj.getDescricao());
			
			st.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
		}
		
	}
}

 