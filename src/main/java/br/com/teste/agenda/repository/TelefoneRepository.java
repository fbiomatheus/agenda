package br.com.teste.agenda.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.teste.agenda.entity.Telefone;

public interface TelefoneRepository extends MongoRepository<Telefone, String>{	

	public List<Telefone> findByIdContato(String idContato);
	
}
