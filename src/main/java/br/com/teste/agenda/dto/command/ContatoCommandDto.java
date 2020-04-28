package br.com.teste.agenda.dto.command;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

public class ContatoCommandDto {
	
	private String id;
	
	@NotEmpty(message = "Campo nome obrigatorio")
	private String nome;
	
	@Past(message="A data de nascimento deve ser anterior à data atual")
	@NotNull(message = "Campo data de nascimento obrigatorio")
	private Date dataNascimento;
	
	@Pattern(
		    regexp = "/^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$/", 
		    message = "Formato do campo cpf invalido"
		    ) 
	@NotEmpty(message = "Campo cpf obrigatorio")
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
