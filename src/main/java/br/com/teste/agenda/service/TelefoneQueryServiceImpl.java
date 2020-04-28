package br.com.teste.agenda.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.agemda.entity.Telefone;
import br.com.teste.agenda.dto.TelefoneQueryDto;
import br.com.teste.agenda.repository.TelefoneRepository;
import br.com.teste.agenda.type.TipoTelefoneEnum;

@Service
public class TelefoneQueryServiceImpl implements ITelefoneQueryService{
	
	@Autowired
    private TelefoneRepository telefoneRepository;

	@Override
	public List<TelefoneQueryDto> getTelefones(String idContato) {
		return this.telefoneRepository.findByIdContato(idContato).stream()
        .map(this::entityToDto)
        .collect(Collectors.toList());
	}

	@Override
	public TelefoneQueryDto getTelefone(String id) {
		return this.telefoneRepository.findById(id)
				.map(this::entityToDto)
                .orElseGet(() -> new TelefoneQueryDto(id));
	}
	
	private TelefoneQueryDto entityToDto(Telefone telefone){
		TelefoneQueryDto dto = new TelefoneQueryDto();
        dto.setId(telefone.getId());
        dto.setTipoTelefone(TipoTelefoneEnum.valueOf(telefone.getTipoTelefone()));
        dto.setDdd(telefone.getDdd());
        dto.setDdi(telefone.getDdi());
        dto.setNumero(telefone.getNumero());
        dto.setRamal(telefone.getRamal());
        return dto;
    }

}
