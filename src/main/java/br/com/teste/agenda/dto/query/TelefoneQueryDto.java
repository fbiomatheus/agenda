package br.com.teste.agenda.dto.query;

import br.com.teste.agenda.type.TipoTelefoneEnum;

public class TelefoneQueryDto {
		
	private String id;

	private TipoTelefoneEnum tipoTelefone;
	
	private Integer ddi;
	
	private Integer ddd;
	
	private String numero;
	
	private String ramal;	

	public TelefoneQueryDto(){

	}

	public TelefoneQueryDto(String idParam){
		this.id = idParam;
	}

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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}	
		
}
