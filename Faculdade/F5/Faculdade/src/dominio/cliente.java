package dominio;
import java.util.Date;

public class cliente {
	
	protected String idUsuario;
	public String nmCompleto;
	public String dsEmail;
	public Date dtAniversario;
	private String txSenha;
	
	cliente(String idUsuario, String nmCompleto, String dsEmail, Date dtAniversario, String txSenha) {
		this.idUsuario = idUsuario;
		this.nmCompleto = nmCompleto;
		this.dsEmail = dsEmail;
		this.dtAniversario = dtAniversario;
		this.txSenha = txSenha;
	}
	
	private String cadastrar(String nmCompleto, String dsEmail, Date dtAniversario, String txSenha) {
		this.nmCompleto = nmCompleto;
		this.dsEmail = dsEmail;
		this.dtAniversario = dtAniversario;
		this.txSenha = txSenha;
		
		return "Usuario criado com sucesso";
	}
	
	private String exibirDados() {
		return "Id: " + this.idUsuario + " ,Nome: " + this.nmCompleto + " ,Data de Aniversario: " + this.dtAniversario;
	}
	
	private void alterarSenha(String novaSenha) {
		this.txSenha = novaSenha;
	}
	
	private String identificarSe(String idUsuario, String txSenha) {
		if(idUsuario != this.idUsuario && txSenha != this.txSenha) {
			return "Informacoes inseridas erradas, confira se digiou todas as informacoes corretamente";
		} else {
			return "Bem-vindo" + this.nmCompleto;
		}
		
	}
}
