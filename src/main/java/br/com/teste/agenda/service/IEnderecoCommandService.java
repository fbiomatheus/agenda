package br.com.teste.agenda.service;

import br.com.teste.agenda.dto.EnderecoCommandDto;

public interface IEnderecoCommandService {


	
	void adicionar(EnderecoCommandDto enderecoDto);
	
	void atualizar(EnderecoCommandDto enderecoDto);
	
	void remover(Long idContato, Long idEndereco);	

	
}
