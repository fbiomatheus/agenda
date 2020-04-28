package br.com.teste.agenda.dto;

import br.com.teste.agenda.type.TipoTelefoneEnum;

public class TelefoneCommandDto {

	private String id;

	private TipoTelefoneEnum tipoTelefone;
	
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

	public TipoTelefoneEnum getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(TipoTelefoneEnum tipoTelefone) {
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
