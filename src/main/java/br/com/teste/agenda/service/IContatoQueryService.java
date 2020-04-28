package br.com.teste.agenda.service;

import java.util.List;

import br.com.teste.agenda.dto.ContatoQueryDto;

public interface IContatoQueryService {

	ContatoQueryDto getContato(Long id);
	
	List<ContatoQueryDto> getContatos();
		
}