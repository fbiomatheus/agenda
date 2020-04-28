package br.com.teste.agenda.service;

import java.util.List;

import br.com.teste.agenda.dto.TelefoneQueryDto;

public interface ITelefoneQueryService {

	List<TelefoneQueryDto> getTelefones( Long idContato);
	
	TelefoneQueryDto getTelefone( Long idContato, Long idTelefone);
	
}
