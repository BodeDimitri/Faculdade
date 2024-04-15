package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class tipoInvestimento implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer IdTipoInvestimento;
	private String nome;
	
	
	public tipoInvestimento(Integer idTipoInvestimento, String nome) {
		IdTipoInvestimento = idTipoInvestimento;
		this.nome = nome;
	}


	public Integer getIdTipoInvestimento() {
		return IdTipoInvestimento;
	}


	public void setIdTipoInvestimento(Integer idTipoInvestimento) {
		IdTipoInvestimento = idTipoInvestimento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public int hashCode() {
		return Objects.hash(IdTipoInvestimento, nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		tipoInvestimento other = (tipoInvestimento) obj;
		return Objects.equals(IdTipoInvestimento, other.IdTipoInvestimento) && Objects.equals(nome, other.nome);
	}
	
}
