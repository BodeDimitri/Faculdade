package dominio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Investimento {

	protected Integer idInvestimento;
	public cliente usuario;
	public tipoInvestimento tipo;
	public String nomeDaAplicacao;
	public String nomeBancoCorretora;
	private Double valor;
	private Date dataInvestimento;
	private Date dataVencimento;



	public Investimento(Integer idInvestimento, cliente usuario, tipoInvestimento tipo, String nomeDaAplicacao,String nomeBancoCorretora, Double valor, Date dataInvestimento, Date dataVencimento) {
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
	
	public void alterar(Integer idInvestimento, String novoNomeDaAplicacao, String novoNomeBancoCorretora, Double novoValor, Date novaDataInvestimento, Date novaDataVencimento) {
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
}
