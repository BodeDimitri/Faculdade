package dominio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class receita {
	
	protected Integer idReceita;
	public cliente usuario;
	private Double valor;
	private Date dateRecebimento;
	private String descricao;

	
	
	public receita(Integer idReceita, cliente usuario, Double valor, Date dateRecebimento, String descricao) {
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
	
    public void alterar(Integer idReceita, Double novoValor, Date novaDataRecebimento, String novaDescricao) {
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
		
	}
}
