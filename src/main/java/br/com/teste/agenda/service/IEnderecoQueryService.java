package br.com.teste.agenda.service;

import java.util.List;

import br.com.teste.agenda.dto.EnderecoQueryDto;

public interface IEnderecoQueryService {

		
	List<EnderecoQueryDto> getEnderecos(Long idContato);
	
	EnderecoQueryDto getEndereco(Long idContato, Long idEndereco);
	


	
}
