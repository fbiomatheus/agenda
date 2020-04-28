package br.com.teste.agenda.service;

import br.com.teste.agenda.dto.TelefoneCommandDto;

public interface ITelefoneCommandService {

	void adicionar(TelefoneCommandDto telefoneDto);
	
	void atualizar(TelefoneCommandDto telefoneDto);
	
	void remover(Long idContato, Long idTelefone);
	

	
}
