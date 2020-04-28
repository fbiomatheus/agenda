package br.com.teste.agenda.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.teste.agemda.entity.Endereco;

public interface EnderecoRepository extends MongoRepository<Endereco, String>{	

	public List<Endereco> findByIdContato(String idContato);
	
}
