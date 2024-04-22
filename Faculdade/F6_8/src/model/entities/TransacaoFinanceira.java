package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

abstract class TransacaoFinanceira implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id_transacao;
    private cliente usuario;
    private double valor;
    private String descricao;
	public int getId_transacao() {
		return id_transacao;
	}
	
	
	
	public TransacaoFinanceira(int id_transacao, cliente usuario, double valor, String descricao) {
		this.id_transacao = id_transacao;
		this.usuario = usuario;
		this.valor = valor;
		this.descricao = descricao;
	}



	public void setId_transacao(int id_transacao) {
		this.id_transacao = id_transacao;
	}
	
	public cliente getUsuario() {
		return usuario;
	}
	
	public void setUsuario(cliente usuario) {
		this.usuario = usuario;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	@Override
	public int hashCode() {
		return Objects.hash(descricao, id_transacao, usuario, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransacaoFinanceira other = (TransacaoFinanceira) obj;
		return Objects.equals(descricao, other.descricao) && id_transacao == other.id_transacao
				&& Objects.equals(usuario, other.usuario)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

}
