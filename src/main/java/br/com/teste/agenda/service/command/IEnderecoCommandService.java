package br.com.teste.agenda.service.command;

import br.com.teste.agenda.dto.command.EnderecoCommandDto;

public interface IEnderecoCommandService {
	
	EnderecoCommandDto salvar(EnderecoCommandDto enderecoDto);
	
	void remover(String id);	

	
}
