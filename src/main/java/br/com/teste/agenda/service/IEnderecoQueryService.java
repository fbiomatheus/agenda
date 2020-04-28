package br.com.teste.agenda.service;

import java.util.List;

import br.com.teste.agenda.dto.EnderecoQueryDto;

public interface IEnderecoQueryService {

		
	List<EnderecoQueryDto> getEnderecos(String idContato);
	
	EnderecoQueryDto getEndereco(String id);
	


	
}
