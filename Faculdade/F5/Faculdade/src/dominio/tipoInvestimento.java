package dominio;

public class tipoInvestimento {

	protected Integer IdTipoInvestimento;
	public String nome;
	
	
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
	
	
}
