package br.com.teste.agenda.service.query;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import br.com.teste.agenda.dto.query.ContatoQueryDto;
import br.com.teste.agenda.entity.Contato;
import br.com.teste.agenda.repository.ContatoRepository;

@Service
public class ContatoQueryServiceImpl implements IContatoQueryService{

	@Autowired
    private ContatoRepository contatoRepository;

	
	@Override
	@Cacheable("contato")
	public ContatoQueryDto getContato(String id) {
		return this.contatoRepository.findById(id)
				.map(this::entityToDto)
                .orElseGet(() -> new ContatoQueryDto(id));
	}

	@Override
	@Cacheable("contato")	
	public List<ContatoQueryDto> getContatos() {
		return this.contatoRepository.findAll().stream()
		        .map(this::entityToDto)
		        .collect(Collectors.toList());	}

	
	
	private ContatoQueryDto entityToDto(Contato contato){
		ContatoQueryDto dto = new ContatoQueryDto();
        dto.setId(contato.getId());
        dto.setNome(contato.getNome());
        dto.setDataNascimento(contato.getDataNascimento());
        dto.setCpf(contato.getCpf());        
        return dto;
    }
}
