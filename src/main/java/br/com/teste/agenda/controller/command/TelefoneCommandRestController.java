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
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.agenda.controller.Mensagens;
import br.com.teste.agenda.dto.command.TelefoneCommandDto;
import br.com.teste.agenda.service.command.ITelefoneCommandService;

@RestController
@RequestMapping(value = "/api/telefones")
public class TelefoneCommandRestController {

   @Autowired
   private ITelefoneCommandService telefoneService;
	

   @PostMapping(value = "/")
   public ResponseEntity<Object> adicionar(@Valid @RequestBody TelefoneCommandDto telefoneDto) {         
	   telefoneService.salvar(telefoneDto);
	   
	   return new ResponseEntity<>(
			   	  Mensagens.SUCESSO, 
			      HttpStatus.OK);
   }
   
   @PutMapping(value = "/{id}")
   public ResponseEntity<Object> atualizar(
		@PathVariable("id") String id, @Valid @RequestBody TelefoneCommandDto telefoneDto) {
	   telefoneDto.setId(id);
	   telefoneService.salvar(telefoneDto);
	   
	   return new ResponseEntity<>(
			   	  Mensagens.SUCESSO, 
			      HttpStatus.OK);
   }
   
   @DeleteMapping(value = "/{id}")
   public ResponseEntity<Object> remover(@PathVariable("id") String id) {
	   telefoneService.remover(id);
	   
	   return new ResponseEntity<>(
			   	  Mensagens.SUCESSO, 
			      HttpStatus.OK);	   
   }	   
      
   
   
}
