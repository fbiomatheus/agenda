package br.com.teste.agenda.service;

import br.com.teste.agenda.dto.ContatoCommandDto;

public interface IContatoCommandService {

	void adicionar(ContatoCommandDto contato);
	
	void atualizar(ContatoCommandDto contato);
	
	void remover(String idContato);	
	
}
