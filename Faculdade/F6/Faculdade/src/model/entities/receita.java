package model.entities;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class receita implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer idReceita;
	private cliente usuario;
	private Double valor;
	private String dateRecebimento;
	private String descricao;
	
	public Integer getIdReceita() {
		return idReceita;
	}

	public void setIdReceita(Integer idReceita) {
		this.idReceita = idReceita;
	}

	public cliente getUsuario() {
		return usuario;
	}

	public void setUsuario(cliente usuario) {
		this.usuario = usuario;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDateRecebimento() {
		return dateRecebimento;
	}

	public void setDateRecebimento(String dateRecebimento) {
		this.dateRecebimento = dateRecebimento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public receita(Integer idReceita, cliente usuario, Double valor, String dateRecebimento, String descricao) {
		this.idReceita = idReceita;
		this.usuario = usuario;
		this.valor = valor;
		this.dateRecebimento = dateRecebimento;
		this.descricao = descricao;
	}

    public String adicionar(Double valor, Date dateRecebimento, String descricao) {
        DateFormat formatBR = new SimpleDateFormat("dd-MM-yyyy");
        String dataConvertida = formatBR.format(dateRecebimento);

        return "Foi adicionado R$" + valor + " a sua conta, " + "no dia: " +  dataConvertida + ", descricao: " + descricao;
    }
	
    public void alterar(Integer idReceita, Double novoValor, String novaDataRecebimento, String novaDescricao) {
        if (this.idReceita.equals(idReceita)) {
            this.valor = novoValor;
            this.dateRecebimento = novaDataRecebimento;
            this.descricao = novaDescricao;
            System.out.println("Receita alterada com sucesso!");
        } else {
            System.out.println("ID de receita fornecido não corresponde a esta receita.");
        }
    }
	
    public void remover(Integer idReceita) {
        if (this.idReceita.equals(idReceita)) {
            this.idReceita = null;
            this.usuario = null;
            this.valor = null;
            this.dateRecebimento = null;
            this.descricao = null;
            System.out.println("Receita removida com sucesso!");
        } else {
            System.out.println("ID de receita fornecido não corresponde a esta receita.");
        }
    }

	@Override
	public int hashCode() {
		return Objects.hash(dateRecebimento, descricao, idReceita, usuario, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		receita other = (receita) obj;
		return Objects.equals(dateRecebimento, other.dateRecebimento) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(idReceita, other.idReceita) && Objects.equals(usuario, other.usuario)
				&& Objects.equals(valor, other.valor);
	}
    

}
