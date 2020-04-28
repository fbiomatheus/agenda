package br.com.teste.agenda.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.agemda.entity.Endereco;
import br.com.teste.agenda.dto.EnderecoQueryDto;
import br.com.teste.agenda.repository.EnderecoRepository;
import br.com.teste.agenda.type.TipoEnderecoEnum;
import br.com.teste.agenda.type.TipoLogradouroEnum;

@Service
public class EnderecoQueryServiceImpl implements IEnderecoQueryService{

	@Autowired
    private EnderecoRepository enderecoRepository;

	
	@Override
	public List<EnderecoQueryDto> getEnderecos(String idContato) {
		return this.enderecoRepository.findByIdContato(idContato).stream()
		        .map(this::entityToDto)
		        .collect(Collectors.toList());	
	}

	@Override
	public EnderecoQueryDto getEndereco(String id) {
		return this.enderecoRepository.findById(id)
				.map(this::entityToDto)
                .orElseGet(() -> new EnderecoQueryDto(id));	
	}

	
	private EnderecoQueryDto entityToDto(Endereco endereco){
		EnderecoQueryDto dto = new EnderecoQueryDto();
        dto.setId(endereco.getId());
        dto.setTipoEndereco(TipoEnderecoEnum.valueOf(endereco.getTipoEndereco()));
        dto.setTipoLogradouro(TipoLogradouroEnum.valueOf(endereco.getTipoLogradouro()));
        dto.setNumero(endereco.getNumero());
        dto.setComplemento(endereco.getComplemento());
        dto.setBairro(endereco.getBairro());
        dto.setCidade(endereco.getCidade());
        dto.setCep(endereco.getCep());
        return dto;
    }
}
