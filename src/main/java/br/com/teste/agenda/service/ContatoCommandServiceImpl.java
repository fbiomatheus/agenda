package br.com.teste.agenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.agemda.entity.Contato;
import br.com.teste.agenda.dto.ContatoCommandDto;
import br.com.teste.agenda.repository.ContatoRepository;

@Service
public class ContatoCommandServiceImpl implements IContatoCommandService{

	@Autowired
    private ContatoRepository contatoRepository;	
	
	@Override
	public void adicionar(ContatoCommandDto contato) {
		this.contatoRepository.insert(dtoToEntity(contato));
		
	}

	@Override
	public void atualizar(ContatoCommandDto contato) {
		this.contatoRepository.save(dtoToEntity(contato));
		
	}

	@Override
	public void remover(String idContato) {
		this.contatoRepository.deleteById(idContato);		
	}
	
	private Contato dtoToEntity(ContatoCommandDto contato){
		Contato entity = new Contato();
		entity.setId(contato.getId());
		entity.setNome(contato.getNome());
		entity.setDataNascimento(contato.getDataNascimento());
		entity.setCpf(contato.getCpf());        
        return entity;
    }

}
