package br.com.teste.agenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.agemda.entity.Telefone;
import br.com.teste.agenda.dto.TelefoneCommandDto;
import br.com.teste.agenda.repository.TelefoneRepository;

@Service
public class TelefoneCommandServiceImpl implements ITelefoneCommandService{

	@Autowired
    private TelefoneRepository telefoneRepository;	
	
	@Override
	public void adicionar(TelefoneCommandDto contato) {
		this.telefoneRepository.insert(dtoToEntity(contato));
		
	}

	@Override
	public void atualizar(TelefoneCommandDto contato) {
		this.telefoneRepository.save(dtoToEntity(contato));
		
	}

	@Override
	public void remover(String id) {
		this.telefoneRepository.deleteById(id);		
	}
	
	private Telefone dtoToEntity(TelefoneCommandDto telefone){
		Telefone entity = new Telefone();
		entity.setId(telefone.getId());
		entity.setTipoTelefone(telefone.getTipoTelefone().toString());
		entity.setDdd(telefone.getDdd());
		entity.setDdi(telefone.getDdi());
		entity.setNumero(telefone.getNumero());
		entity.setRamal(telefone.getRamal());		
        return entity;
    }

}
