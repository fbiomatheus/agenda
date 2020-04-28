package br.com.teste.agenda.dto.query;

import java.util.Date;
import java.util.List;

public class ContatoQueryDto{

	private String id;
	
	private String nome;
	
	private Date dataNascimento;
	
	private String cpf;
	
	private List<EnderecoQueryDto> enderecos;
	
	private List<TelefoneQueryDto> telefones;
	
	public ContatoQueryDto(String idParam) {
		this.id = idParam;
	}
	
	public ContatoQueryDto() {		
	}
	

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

	public List<EnderecoQueryDto> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<EnderecoQueryDto> enderecos) {
		this.enderecos = enderecos;
	}

	public List<TelefoneQueryDto> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<TelefoneQueryDto> telefones) {
		this.telefones = telefones;
	}
	
	
}
