package br.com.teste.agenda.service.command;

import br.com.teste.agenda.dto.command.ContatoCommandDto;

public interface IContatoCommandService {

	ContatoCommandDto salvar(ContatoCommandDto contato);
	
	void remover(String idContato);	
	
}
