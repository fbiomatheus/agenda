package br.com.teste.agenda.service.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.agenda.dto.command.ContatoCommandDto;
import br.com.teste.agenda.entity.Contato;
import br.com.teste.agenda.repository.ContatoRepository;

@Service
public class ContatoCommandServiceImpl implements IContatoCommandService{

	@Autowired
    private ContatoRepository contatoRepository;	
	
	@Override
	public ContatoCommandDto salvar(ContatoCommandDto contato) {
		return entityToDto(this.contatoRepository.save(dtoToEntity(contato)));		
	}

	@Override
	public void remover(String idContato) {
		this.contatoRepository.deleteById(idContato);		
	}
	
	private Contato dtoToEntity(ContatoCommandDto contato){
		Contato entity = new Contato();
		entity.setNome(contato.getNome());
		entity.setDataNascimento(contato.getDataNascimento());
		entity.setCpf(contato.getCpf());        
        return entity;
    }
	
	private ContatoCommandDto entityToDto(Contato contato){
		ContatoCommandDto dto = new ContatoCommandDto();
        dto.setId(contato.getId());
        dto.setNome(contato.getNome());
        dto.setDataNascimento(contato.getDataNascimento());
        dto.setCpf(contato.getCpf());        
        return dto;
    }

}
