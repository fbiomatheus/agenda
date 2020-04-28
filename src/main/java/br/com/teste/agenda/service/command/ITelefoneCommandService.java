package br.com.teste.agenda.service.command;

import br.com.teste.agenda.dto.command.TelefoneCommandDto;

public interface ITelefoneCommandService {

	TelefoneCommandDto salvar(TelefoneCommandDto telefoneDto);
	
	void remover(String id);
	

	
}
