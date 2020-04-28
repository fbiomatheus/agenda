package br.com.teste.agenda.service.query;

import java.util.List;

import br.com.teste.agenda.dto.query.ContatoQueryDto;

public interface IContatoQueryService {

	ContatoQueryDto getContato(String id);
	
	List<ContatoQueryDto> getContatos();
		
}
