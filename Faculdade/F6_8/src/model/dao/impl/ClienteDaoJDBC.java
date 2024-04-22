package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.ClienteDAO;
import model.entities.cliente;

public class ClienteDaoJDBC implements ClienteDAO {

	private Connection conn;
	
	public ClienteDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	@Override
	public void insert(cliente obj) {
		PreparedStatement st = null;

		try {
			st = conn.prepareStatement("INSERT INTO cliente " +
					"(idUsuario,nmCompleto, dsEmail, dtAniversario, txSenha) " +
					"VALUES (?, ?, ?, ?, ?)");
					

			st.setInt(1, obj.getIdUsuario());
			st.setString(2, obj.getNmCompleto());
			st.setString(3, obj.getDsEmail());
			st.setString(4, obj.getDtAniversario());
			st.setString(5, obj.getTxSenha());
			
			st.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
		}
		
	}
	
	@Override
	public List<cliente> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			st = conn.prepareStatement("SELECT * FROM Cliente ORDER BY idUsuario");
			rs = st.executeQuery();
			
			List<cliente> list = new ArrayList<>();
			
			while(rs.next()) {
				cliente cliente = new cliente(0, null, null, null, null);
				cliente.setIdUsuario(rs.getInt("idUsuario"));
				cliente.setNmCompleto(rs.getString("nmCompleto"));
				cliente.setDsEmail(rs.getString("dsEmail"));
				cliente.setDtAniversario(rs.getString("dtAniversario"));
				cliente.setTxSenha(rs.getString("txSenha"));
				list.add(cliente);
			}
			
			return list;

		} catch (SQLException e) {
			throw new DbException("Erro ao buscar tabela usuario no banco de dados:" + e.getMessage());
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
		}
	
	}
}
