package model.entities;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class objetivoFinanceiro implements Serializable {
	

	private static final long serialVersionUID = 1L;
	private Integer idObjetivo;
	private cliente usuario;
	private String nome;
	private Double valor;
	private Date dataDesejada;
	private String descricao;

	public objetivoFinanceiro(Integer idObjetivo, cliente usuario, String nome, Double valor, Date dataDesejada,String descricao) {
		this.idObjetivo = idObjetivo;
		this.usuario = usuario;
		this.nome = nome;
		this.valor = valor;
		this.dataDesejada = dataDesejada;
		this.descricao = descricao;
	}
	
	

	public Integer getIdObjetivo() {
		return idObjetivo;
	}



	public void setIdObjetivo(Integer idObjetivo) {
		this.idObjetivo = idObjetivo;
	}



	public cliente getUsuario() {
		return usuario;
	}



	public void setUsuario(cliente usuario) {
		this.usuario = usuario;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Double getValor() {
		return valor;
	}



	public void setValor(Double valor) {
		this.valor = valor;
	}



	public Date getDataDesejada() {
		return dataDesejada;
	}



	public void setDataDesejada(Date dataDesejada) {
		this.dataDesejada = dataDesejada;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public String adicionar(String nome,Double valor, Date dataDesejada, String descricao) {
        DateFormat formatBR = new SimpleDateFormat("dd-MM-yyyy");
        String dataConvertida = formatBR.format(dataDesejada);
        
		return "Novo objetivo financeiro de nome:" + nome + "de valor R$" + valor +  " ,para o dia: " +  dataConvertida + " ,descricao: " + descricao;
	}
	
	public void alterar(Integer idObjetivo, String novoNome, Double novoValor, Date novaDataDesejada, String novaDescricao) {
	    if (this.idObjetivo.equals(idObjetivo)) {
	        this.nome = novoNome;
	        this.valor = novoValor;
	        this.dataDesejada = novaDataDesejada;
	        this.descricao = novaDescricao;
	        System.out.println("Objetivo financeiro alterado com sucesso!");
	    } else {
	        System.out.println("ID de objetivo fornecido não corresponde a este objetivo financeiro.");
	    }
	}
	
	public void remover(Integer idObjetivo) {
	    if (this.idObjetivo.equals(idObjetivo)) {
	        this.idObjetivo = null;
	        this.usuario = null;
	        this.nome = null;
	        this.valor = null;
	        this.dataDesejada = null;
	        this.descricao = null;
	        System.out.println("Objetivo financeiro removido com sucesso!");
	    } else {
	        System.out.println("ID de objetivo fornecido não corresponde a este objetivo financeiro.");
	    }
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataDesejada, descricao, idObjetivo, nome, usuario, valor);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		objetivoFinanceiro other = (objetivoFinanceiro) obj;
		return Objects.equals(dataDesejada, other.dataDesejada) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(idObjetivo, other.idObjetivo) && Objects.equals(nome, other.nome)
				&& Objects.equals(usuario, other.usuario) && Objects.equals(valor, other.valor);
	}
	
}
