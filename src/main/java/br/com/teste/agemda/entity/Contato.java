package br.com.teste.agemda.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Contato {
	
	@Id
	private String id;
	
	private String nome;
	
	private Date dataNascimento;
	
	private String cpf;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
	
	
	
}
