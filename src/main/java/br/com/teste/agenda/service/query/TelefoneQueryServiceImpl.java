package br.com.teste.agenda.service.query;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import br.com.teste.agenda.dto.query.TelefoneQueryDto;
import br.com.teste.agenda.entity.Telefone;
import br.com.teste.agenda.repository.TelefoneRepository;
import br.com.teste.agenda.type.TipoTelefoneEnum;

@Service
public class TelefoneQueryServiceImpl implements ITelefoneQueryService{
	
	@Autowired
    private TelefoneRepository telefoneRepository;

	@Override
	@Cacheable("telefone")	
	public TelefoneQueryDto getTelefone(String id) {
		return this.telefoneRepository.findById(id)
				.map(this::entityToDto)
                .orElseGet(() -> new TelefoneQueryDto(id));
	}
	
	@Override
	@Cacheable("telefone")	
	public List<TelefoneQueryDto> getTelefones(String idContato) {
		return this.telefoneRepository.findByIdContato(idContato).stream()
        .map(this::entityToDto)
        .collect(Collectors.toList());
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
