package model.entities;

import java.util.Date;
import java.util.Objects;

public class investimento extends TransacaoFinanceira {
    
	private static final long serialVersionUID = 1L;
	private String tipo;
    private String nomeAplicacao;
    private String nomeBancoCorretora;
    private Date dataVencimento;

	public investimento(int id_transacao, cliente usuario, double valor, String descricao, String tipo,
			String nomeAplicacao, String nomeBancoCorretora, Date dataVencimento) {
		super(id_transacao, usuario, valor, descricao);
		this.tipo = tipo;
		this.nomeAplicacao = nomeAplicacao;
		this.nomeBancoCorretora = nomeBancoCorretora;
		this.dataVencimento = dataVencimento;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getNomeAplicacao() {
		return nomeAplicacao;
	}


	public void setNomeAplicacao(String nomeAplicacao) {
		this.nomeAplicacao = nomeAplicacao;
	}


	public String getNomeBancoCorretora() {
		return nomeBancoCorretora;
	}


	public void setNomeBancoCorretora(String nomeBancoCorretora) {
		this.nomeBancoCorretora = nomeBancoCorretora;
	}


	public Date getDataVencimento() {
		return dataVencimento;
	}


	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(dataVencimento, nomeAplicacao, nomeBancoCorretora, tipo);
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
		investimento other = (investimento) obj;
		return Objects.equals(dataVencimento, other.dataVencimento)
				&& Objects.equals(nomeAplicacao, other.nomeAplicacao)
				&& Objects.equals(nomeBancoCorretora, other.nomeBancoCorretora) && Objects.equals(tipo, other.tipo);
	}
	

}
