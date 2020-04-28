package br.com.teste.agenda.service.query;

import java.util.List;

import br.com.teste.agenda.dto.query.EnderecoQueryDto;

public interface IEnderecoQueryService {

		
	List<EnderecoQueryDto> getEnderecos(String idContato);
	
	EnderecoQueryDto getEndereco(String id);
	


	
}
