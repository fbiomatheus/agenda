package br.com.teste.agenda.service.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.agenda.dto.command.EnderecoCommandDto;
import br.com.teste.agenda.entity.Endereco;
import br.com.teste.agenda.repository.EnderecoRepository;
import br.com.teste.agenda.type.TipoEnderecoEnum;
import br.com.teste.agenda.type.TipoLogradouroEnum;



@Service
public class EnderecoCommandServiceImpl implements IEnderecoCommandService{

	@Autowired
    private EnderecoRepository enderecoRepository;

	@Override
	public EnderecoCommandDto salvar(EnderecoCommandDto endereco) {
		return entityToDto(this.enderecoRepository.save(dtoToEntity(endereco)));
		
	}

	@Override
	public void remover(String id) {
		this.enderecoRepository.deleteById(id);		
	}
	
	private Endereco dtoToEntity(EnderecoCommandDto endereco){
		Endereco entity = new Endereco();
		entity.setId(endereco.getId());
		entity.setIdContato(endereco.getIdContato());
		entity.setTipoEndereco(endereco.getTipoEndereco().toString());
		entity.setTipoLogradouro(endereco.getTipoLogradouro().toString());
		entity.setNumero(endereco.getNumero());
		entity.setComplemento(endereco.getComplemento());
		entity.setBairro(endereco.getBairro());
		entity.setCidade(endereco.getCidade());
		entity.setCep(endereco.getCep());		
        return entity;
    }
	
	private EnderecoCommandDto entityToDto(Endereco endereco){
		EnderecoCommandDto dto = new EnderecoCommandDto();
		dto.setId(endereco.getId());
		dto.setIdContato(endereco.getIdContato());
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
