package br.com.teste.agenda.service.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.agenda.dto.command.TelefoneCommandDto;
import br.com.teste.agenda.entity.Telefone;
import br.com.teste.agenda.repository.TelefoneRepository;
import br.com.teste.agenda.type.TipoTelefoneEnum;

@Service
public class TelefoneCommandServiceImpl implements ITelefoneCommandService{

	@Autowired
    private TelefoneRepository telefoneRepository;	
	
	@Override
	public TelefoneCommandDto salvar(TelefoneCommandDto contato) {
		return entityToDto(this.telefoneRepository.save(dtoToEntity(contato)));		
	}

	@Override
	public void remover(String id) {
		this.telefoneRepository.deleteById(id);		
	}
	
	private Telefone dtoToEntity(TelefoneCommandDto telefone){
		Telefone entity = new Telefone();
		entity.setId(telefone.getId());
		entity.setIdContato(telefone.getIdContato());
		entity.setTipoTelefone(telefone.getTipoTelefone().toString());
		entity.setDdd(telefone.getDdd());
		entity.setDdi(telefone.getDdi());
		entity.setNumero(telefone.getNumero());
		entity.setRamal(telefone.getRamal());		
        return entity;
    }
	
	private TelefoneCommandDto entityToDto(Telefone telefone){
		TelefoneCommandDto dto = new TelefoneCommandDto();
		dto.setId(telefone.getId());
		dto.setIdContato(telefone.getIdContato());
		dto.setTipoTelefone(TipoTelefoneEnum.valueOf(telefone.getTipoTelefone()));
		dto.setDdd(telefone.getDdd());
		dto.setDdi(telefone.getDdi());
		dto.setNumero(telefone.getNumero());
		dto.setRamal(telefone.getRamal());		
        return dto;
    }

}
