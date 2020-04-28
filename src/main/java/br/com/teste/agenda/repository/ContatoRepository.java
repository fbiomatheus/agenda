package br.com.teste.agenda.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.teste.agenda.entity.Contato;

public interface ContatoRepository extends MongoRepository<Contato, String>{	

}
