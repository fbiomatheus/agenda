package br.com.teste.agenda.controller.command;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.agenda.controller.Mensagens;
import br.com.teste.agenda.dto.command.ContatoCommandDto;
import br.com.teste.agenda.service.command.IContatoCommandService;

@RestController
@RequestMapping(value = "/api/contatos")
public class ContatoCommandRestController {
	
	

   @Autowired
   private IContatoCommandService contatoService;
	
	
   @PostMapping(value = "/")   
   public  ResponseEntity<Object> adicionar(@Valid @RequestBody ContatoCommandDto contatoDto) {         
	   contatoService.salvar(contatoDto);
	   
	   return new ResponseEntity<>(
			   	  Mensagens.SUCESSO, 
			      HttpStatus.OK);
   }
   
   @PutMapping(value = "/{id}")
   public ResponseEntity<Object> atualizar(
		   @PathVariable("id") String id, @Valid @RequestBody ContatoCommandDto contatoDto) {
	   contatoDto.setId(id);
	   
	   
	   contatoService.salvar(contatoDto);
	   
	   return new ResponseEntity<>(
			      Mensagens.SUCESSO, 
			      HttpStatus.OK);
	   
   }
   
   @ResponseStatus(HttpStatus.OK)
   @DeleteMapping(value = "/{id}")
   public ResponseEntity<Object> remover(@PathVariable("id") String id) {
	   contatoService.remover(id);
	   
	   return new ResponseEntity<>(
			   	  Mensagens.SUCESSO, 
			      HttpStatus.OK);
   }	   
   
   
}
