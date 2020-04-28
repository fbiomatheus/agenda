package br.com.teste.agenda.service.query;

import java.util.List;

import br.com.teste.agenda.dto.query.TelefoneQueryDto;

public interface ITelefoneQueryService {

	List<TelefoneQueryDto> getTelefones( String idContato);
	
	TelefoneQueryDto getTelefone(String id);
	
}
