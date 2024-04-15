package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class cliente implements Serializable  {
	

	private static final long serialVersionUID = 1L;
	private int idUsuario;
	private String nmCompleto;
	private String dsEmail;
	private String dtAniversario;
	private String txSenha;
	
	
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNmCompleto() {
		return nmCompleto;
	}

	public void setNmCompleto(String nmCompleto) {
		this.nmCompleto = nmCompleto;
	}

	public String getDsEmail() {
		return dsEmail;
	}

	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
	}

	public String getDtAniversario() {
		return dtAniversario;
	}

	public void setDtAniversario(String dtAniversario) {
		this.dtAniversario = dtAniversario;
	}

	public String getTxSenha() {
		return txSenha;
	}

	public void setTxSenha(String txSenha) {
		this.txSenha = txSenha;
	}

	public cliente(int i, String nmCompleto, String dsEmail, String dtAniversario, String txSenha) {
		this.idUsuario = i;
		this.nmCompleto = nmCompleto;
		this.dsEmail = dsEmail;
		this.dtAniversario = dtAniversario;
		this.txSenha = txSenha;
	}
	

	public cliente() {
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

	@Override
	public int hashCode() {
		return Objects.hash(dsEmail, dtAniversario, idUsuario, nmCompleto, txSenha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		cliente other = (cliente) obj;
		return Objects.equals(dsEmail, other.dsEmail) && Objects.equals(dtAniversario, other.dtAniversario)
				&& idUsuario == other.idUsuario && Objects.equals(nmCompleto, other.nmCompleto)
				&& Objects.equals(txSenha, other.txSenha);
	}
	
}
