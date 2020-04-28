package br.com.teste.agemda.entity;

import org.springframework.data.annotation.Id;

public class Telefone {

	@Id
	private String id;
	
	private String idContato;
	
	private String tipoTelefone;
	
	private Integer ddi;
	
	private Integer ddd;
	
	private Integer numero;
	
	private Integer ramal;

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

	public String getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public Integer getDdi() {
		return ddi;
	}

	public void setDdi(Integer ddi) {
		this.ddi = ddi;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getRamal() {
		return ramal;
	}

	public void setRamal(Integer ramal) {
		this.ramal = ramal;
	}
	
	
	
	
}
