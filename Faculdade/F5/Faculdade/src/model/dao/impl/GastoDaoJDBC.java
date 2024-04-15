package model.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.GastoDao;
import model.entities.categoriaGasto;
import model.entities.cliente;
import model.entities.gasto;

public class GastoDaoJDBC implements GastoDao {

private Connection conn;
	
	public GastoDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void insert(gasto obj) {
		PreparedStatement st = null;

		try {
			st = conn.prepareStatement("INSERT INTO gasto " +
					"(idGasto,usuario, categoria, valor, dataHora, descricao) " +
					"VALUES (?, ?, ?, ?, ?)");
					

			st.setInt(1, obj.getIdGasto());
			st.setObject(2, obj.getUsuario());
			st.setObject(3, obj.getCategoria());
			st.setDouble(4, obj.getValor());
			st.setDate(5, (Date) obj.getDataHora());
			st.setString(6,obj.getDescricao());
			
			st.executeUpdate();
			
			int rowsAffected = st.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
		}
		
	}
	
	@Override
	public List<gasto> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			st = conn.prepareStatement("SELECT * FROM Gasto ORDER BY usuario");
			rs = st.executeQuery();
			
			List<gasto> list = new ArrayList<>();
			
			while(rs.next()) {
				gasto gasto = new gasto();
				gasto.setIdGasto(rs.getInt("idGasto"));
				gasto.setUsuario((cliente) rs.getObject("usuario"));
				gasto.setCategoria((categoriaGasto) rs.getObject("categoria"));
				gasto.setValor(rs.getDouble("valor"));
				gasto.setDataHora(rs.getDate("dataHora"));
				gasto.setDescricao(rs.getString("descricao"));
				list.add(gasto);
			}
			
			return list;

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
		}
	
	}
}
