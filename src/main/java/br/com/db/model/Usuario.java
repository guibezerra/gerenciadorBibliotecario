package br.com.db.model;

import java.io.Serializable;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cpf;
	private String telefone;
	private String login;
	private String senha;
	private String flag_bibli;
	
	public Usuario() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getFlag_bibli() {
		return flag_bibli;
	}
	public void setFlag_bibli(String flag_bibli) {
		this.flag_bibli = flag_bibli;
	}
	
	
}
