package br.com.teste.agenda.dto.command;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import br.com.teste.agenda.type.TipoTelefoneEnum;
import br.com.teste.agenda.validation.TelefoneAnnotation;

@TelefoneAnnotation
public class TelefoneCommandDto {

	private String id;
	
	@NotEmpty(message = "Campo idContato obrigatório")
	private String idContato;

	@NotEmpty(message = "Campo tipo telefone obrigatório")
	private TipoTelefoneEnum tipoTelefone;
	
	@Max(3)
	private Integer ddi;
	
	@Max(3)
	@NotEmpty(message = "Campo ddd obrigatório")
	private Integer ddd;	

	@NotEmpty(message = "Campo número telefone obrigatório")
	@Pattern(
		    regexp = "\\d{4,5}\\-\\d{4}", 
		    message = "Formato do campo numero de telefone invalido"
		    ) 	
	private String numero;
	
	private String ramal;

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
