package dominio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class gasto {
	
	protected Integer idGasto;
	public cliente usuario;
	public categoriaGasto categoria;
	private Double valor;
	private Date dataHora;
	private String descricao;
	
	
	
	public gasto(Integer idGasto, cliente usuario, categoriaGasto categoria, Double valor, Date dataHora,String descricao) {
		this.idGasto = idGasto;
		this.usuario = usuario;
		this.categoria = categoria;
		this.valor = valor;
		this.dataHora = dataHora;
		this.descricao = descricao;
	}

	public String adicionar(Double valor, Date dateRecebimento, String descricao) {
        DateFormat formatBR = new SimpleDateFormat("dd-MM-yyyy");
        String dataConvertida = formatBR.format(dateRecebimento);
        
		return "Foi adicionado R$" + this.valor + " a sua conta, " + "no dia: "  + dataConvertida + " ,descricao: " + descricao;
	}
	
	public void alterar(Integer idReceita) {
		
	}
	
	public void remover(Integer idReceita) {
		
	}
}
