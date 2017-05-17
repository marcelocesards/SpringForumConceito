package com.marcelo.controladores;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class DAOUsuario {
	
	@Size(max=128) @NotNull @NotEmpty
	private String nome;
	
	@Email
	private String email;
	
	@NotNull
	private Date dataCadastro = new Date();
	
	@NotNull @NotEmpty
	@Size(min=8, max=32, message="Login muito curto ou muito longo")
	private String login;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Object list() {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario getUsuario(String login, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	public void persistir(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

}
