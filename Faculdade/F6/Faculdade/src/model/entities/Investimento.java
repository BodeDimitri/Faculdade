package model.entities;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Investimento implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idInvestimento;
	private cliente usuario;
	private tipoInvestimento tipo;
	private String nomeDaAplicacao;
	private String nomeBancoCorretora;
	private Double valor;
	private String dataInvestimento;
	private String dataVencimento;



	public Integer getIdInvestimento() {
		return idInvestimento;
	}

	public void setIdInvestimento(Integer idInvestimento) {
		this.idInvestimento = idInvestimento;
	}

	public cliente getUsuario() {
		return usuario;
	}

	public void setUsuario(cliente usuario) {
		this.usuario = usuario;
	}

	public tipoInvestimento getTipo() {
		return tipo;
	}

	public void setTipo(tipoInvestimento tipo) {
		this.tipo = tipo;
	}

	public String getNomeDaAplicacao() {
		return nomeDaAplicacao;
	}

	public void setNomeDaAplicacao(String nomeDaAplicacao) {
		this.nomeDaAplicacao = nomeDaAplicacao;
	}

	public String getNomeBancoCorretora() {
		return nomeBancoCorretora;
	}

	public void setNomeBancoCorretora(String nomeBancoCorretora) {
		this.nomeBancoCorretora = nomeBancoCorretora;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDataInvestimento() {
		return dataInvestimento;
	}

	public void setDataInvestimento(String dataInvestimento) {
		this.dataInvestimento = dataInvestimento;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Investimento(Integer idInvestimento, cliente usuario, tipoInvestimento tipo, String nomeDaAplicacao,String nomeBancoCorretora, Double valor, String dataInvestimento, String dataVencimento) {
		this.idInvestimento = idInvestimento;
		this.usuario = usuario;
		this.tipo = tipo;
		this.nomeDaAplicacao = nomeDaAplicacao;
		this.nomeBancoCorretora = nomeBancoCorretora;
		this.valor = valor;
		this.dataInvestimento = dataInvestimento;
		this.dataVencimento = dataVencimento;
	}

	public String adicionar(String nomeDaAplicacao, String nomeBancoCorretora,Double valor, Date dataInvestimento, Date dataVencimento) {
        DateFormat formatBR = new SimpleDateFormat("dd-MM-yyyy");
        String dataConvertidaInvestimento = formatBR.format(dataInvestimento);
        String dataConvertidaVencimento = formatBR.format(dataVencimento);
        
		return "Novo investimento de nome:" + nomeDaAplicacao + " , no banco: " + nomeBancoCorretora + ", valor de R$" + valor + " ,no prazo de " +  dataConvertidaInvestimento + " - " + dataConvertidaVencimento;
	}
	
	public void alterar(Integer idInvestimento, String novoNomeDaAplicacao, String novoNomeBancoCorretora, Double novoValor, String novaDataInvestimento, String novaDataVencimento) {
	    if (this.idInvestimento.equals(idInvestimento)) {
	        this.nomeDaAplicacao = novoNomeDaAplicacao;
	        this.nomeBancoCorretora = novoNomeBancoCorretora;
	        this.valor = novoValor;
	        this.dataInvestimento = novaDataInvestimento;
	        this.dataVencimento = novaDataVencimento;
	        System.out.println("Investimento alterado com sucesso!");
	    } else {
	        System.out.println("ID de investimento fornecido não corresponde a este investimento.");
	    }
	}
	
	public void remover(Integer idInvestimento) {
	    if (this.idInvestimento.equals(idInvestimento)) {
	        this.idInvestimento = null;
	        this.usuario = null;
	        this.tipo = null;
	        this.nomeDaAplicacao = null;
	        this.nomeBancoCorretora = null;
	        this.valor = null;
	        this.dataInvestimento = null;
	        this.dataVencimento = null;
	        System.out.println("Investimento removido com sucesso!");
	    } else {
	        System.out.println("ID de investimento fornecido não corresponde a este investimento.");
	    }
	}
	
	public void exibirDados() {
	    System.out.println("ID do Investimento: " + idInvestimento);
	    System.out.println("Nome da Aplicação: " + nomeDaAplicacao);
	    System.out.println("Banco/Corretora: " + nomeBancoCorretora);
	    System.out.println("Valor: R$" + valor);
	    System.out.println("Data de Investimento: " + dataInvestimento);
	    System.out.println("Data de Vencimento: " + dataVencimento);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataInvestimento, dataVencimento, idInvestimento, nomeBancoCorretora, nomeDaAplicacao, tipo,
				usuario, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Investimento other = (Investimento) obj;
		return Objects.equals(dataInvestimento, other.dataInvestimento)
				&& Objects.equals(dataVencimento, other.dataVencimento)
				&& Objects.equals(idInvestimento, other.idInvestimento)
				&& Objects.equals(nomeBancoCorretora, other.nomeBancoCorretora)
				&& Objects.equals(nomeDaAplicacao, other.nomeDaAplicacao) && Objects.equals(tipo, other.tipo)
				&& Objects.equals(usuario, other.usuario) && Objects.equals(valor, other.valor);
	}
	
}
