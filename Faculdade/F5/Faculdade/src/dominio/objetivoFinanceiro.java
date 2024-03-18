package dominio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class objetivoFinanceiro {
	
	protected Integer idObjetivo;
	public cliente usuario;
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
		
	}
}
