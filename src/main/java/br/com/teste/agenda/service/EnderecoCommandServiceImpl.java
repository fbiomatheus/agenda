package br.com.teste.agenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.agemda.entity.Endereco;
import br.com.teste.agenda.dto.EnderecoCommandDto;
import br.com.teste.agenda.repository.EnderecoRepository;



@Service
public class EnderecoCommandServiceImpl implements IEnderecoCommandService{

	@Autowired
    private EnderecoRepository enderecoRepository;

	@Override
	public void adicionar(EnderecoCommandDto endereco) {
		this.enderecoRepository.insert(dtoToEntity(endereco));
		
	}

	@Override
	public void atualizar(EnderecoCommandDto endereco) {
		this.enderecoRepository.save(dtoToEntity(endereco));
		
	}

	@Override
	public void remover(String id) {
		this.enderecoRepository.deleteById(id);		
	}
	
	private Endereco dtoToEntity(EnderecoCommandDto endereco){
		Endereco entity = new Endereco();
		entity.setId(endereco.getId());
		entity.setTipoEndereco(endereco.getTipoEndereco().toString());
		entity.setTipoLogradouro(endereco.getTipoLogradouro().toString());
		entity.setNumero(endereco.getNumero());
		entity.setComplemento(endereco.getComplemento());
		entity.setBairro(endereco.getBairro());
		entity.setCidade(endereco.getCidade());
		entity.setCep(endereco.getCep());		
        return entity;
    }

}
