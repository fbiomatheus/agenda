package br.com.teste.agenda.dto.command;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import br.com.teste.agenda.type.TipoEnderecoEnum;
import br.com.teste.agenda.type.TipoLogradouroEnum;

public class EnderecoCommandDto {

	private String id;
	
	@NotEmpty(message = "Campo idContato obrigatorio")	
	private String idContato;

	@NotEmpty(message = "Campo tipoEndereco obrigatorio")
	private TipoEnderecoEnum tipoEndereco;
	
	@NotEmpty(message = "Campo tipoLogradouro obrigatorio")
	private TipoLogradouroEnum tipoLogradouro;
	
	@NotEmpty(message = "Campo logradouro obrigatorio")
	private String logradouro;
	
	@NotEmpty(message = "Campo numero obrigatorio")
	private String numero;
	
	private String complemento;
	
	@NotEmpty(message = "Campo bairro obrigatorio")
	private String bairro;
	
	@NotEmpty(message = "Campo cidade obrigatorio")
	private String cidade;
	
	@Pattern(
		    regexp = "[0-9]{5}-[0-9]{3}", 
		    message = "Formato do campo cep invalido"
		    ) 
	@NotEmpty(message = "Campo cep obrigatorio")
	private String cep;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}	

	public String getIdContato() {
		return idContato;
	}

	public void setIdContato(String idContato) {
		this.idContato = idContato;
	}

	public TipoEnderecoEnum getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(TipoEnderecoEnum tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}	

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public TipoLogradouroEnum getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouroEnum tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	
}
