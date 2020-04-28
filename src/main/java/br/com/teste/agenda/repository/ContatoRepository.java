package br.com.teste.agenda.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.teste.agemda.entity.Contato;

public interface ContatoRepository extends MongoRepository<Contato, String>{	

}
