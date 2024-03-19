package dominio;

public class cliente {
	
	protected int idUsuario;
	public String nmCompleto;
	public String dsEmail;
	public String dtAniversario;
	private String txSenha;
	
	cliente(int i, String nmCompleto, String dsEmail, String dtAniversario, String txSenha) {
		this.idUsuario = i;
		this.nmCompleto = nmCompleto;
		this.dsEmail = dsEmail;
		this.dtAniversario = dtAniversario;
		this.txSenha = txSenha;
	}
	
	private String cadastrar(String nmCompleto, String dsEmail, String dtAniversario, String txSenha) {
		this.nmCompleto = nmCompleto;
		this.dsEmail = dsEmail;
		this.dtAniversario = dtAniversario;
		this.txSenha = txSenha;
		
		return "Usuario criado com sucesso";
	}
	
	public String exibirDados() {
		return "Id: " + this.idUsuario + " ,Nome: " + this.nmCompleto + " ,Data de Aniversario: " + this.dtAniversario;
	}
	
	private void alterarSenha(String novaSenha) {
		this.txSenha = novaSenha;
	}
	
	private String identificarSe(int idUsuario, String txSenha) {
		if(idUsuario != this.idUsuario && txSenha != this.txSenha) {
			return "Informacoes inseridas erradas, confira se digiou todas as informacoes corretamente";
		} else {
			return "Bem-vindo" + this.nmCompleto;
		}
		
	}
}
