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
	
	
	public Integer getIdGasto() {
		return idGasto;
	}

	public void setIdGasto(Integer idGasto) {
		this.idGasto = idGasto;
	}

	public cliente getUsuario() {
		return usuario;
	}

	public void setUsuario(cliente usuario) {
		this.usuario = usuario;
	}

	public categoriaGasto getCategoria() {
		return categoria;
	}

	public void setCategoria(categoriaGasto categoria) {
		this.categoria = categoria;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

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
	
	public void alterar(Integer idGasto, Double novoValor, Date novaDataHora, String novaDescricao) {
	    if (this.idGasto.equals(idGasto)) {
	        this.valor = novoValor;
	        this.dataHora = novaDataHora;
	        this.descricao = novaDescricao;
	        System.out.println("Gasto alterado com sucesso!");
	    } else {
	        System.out.println("ID de gasto fornecido não corresponde a este gasto.");
	    }
	}
	
	public void remover(Integer idGasto) {
	    if (this.idGasto.equals(idGasto)) {
	        this.idGasto = null;
	        this.usuario = null;
	        this.categoria = null;
	        this.valor = null;
	        this.dataHora = null;
	        this.descricao = null;
	        System.out.println("Gasto removido com sucesso!");
	    } else {
	        System.out.println("ID de gasto fornecido não corresponde a este gasto.");
	    }
	}
}
