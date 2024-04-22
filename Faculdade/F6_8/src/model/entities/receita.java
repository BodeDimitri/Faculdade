package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


class Receita extends TransacaoFinanceira implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id_receita;
	

	public Receita(int id_transacao, cliente usuario, double valor, String descricao, int id_receita) {
		super(id_transacao, usuario, valor, descricao);
		this.id_receita = id_receita;
	}

	public int getId_receita() {
		return id_receita;
	}

	public void setId_receita(int id_receita) {
		this.id_receita = id_receita;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(id_receita);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Receita other = (Receita) obj;
		return id_receita == other.id_receita;
	}

	
}