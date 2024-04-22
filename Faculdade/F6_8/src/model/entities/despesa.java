package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class despesa extends TransacaoFinanceira implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id_despesa;



	public despesa(int id_transacao, cliente usuario, double valor, String descricao, int id_despesa) {
		super(id_transacao, usuario, valor, descricao);
		this.id_despesa = id_despesa;
	}

	public int getId_despesa() {
		return id_despesa;
	}

	public void setId_despesa(int id_despesa) {
		this.id_despesa = id_despesa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(id_despesa);
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
		despesa other = (despesa) obj;
		return id_despesa == other.id_despesa;
	}


	
}
