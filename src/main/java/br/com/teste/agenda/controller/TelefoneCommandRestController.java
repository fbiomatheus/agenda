package br.com.teste.agenda.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.agenda.dto.TelefoneCommandDto;
import br.com.teste.agenda.service.ITelefoneCommandService;

@RestController
@RequestMapping(value = "/api/contatos")
public class TelefoneCommandRestController {

   @Autowired
   private ITelefoneCommandService telefoneService;
	

   @RequestMapping(value = "/", method = RequestMethod.POST)
   @ResponseStatus(HttpStatus.OK)
   public void adicionar(
      HttpServletRequest request, @RequestBody TelefoneCommandDto telefoneDto) {
         
	   telefoneService.adicionar(telefoneDto);
   }
   
   @PreAuthorize("hasRole('USER_WRITE_PRIVILEGE')")
   @RequestMapping(value = "/", method = RequestMethod.PUT)
   @ResponseStatus(HttpStatus.OK)
   public void atualizar(
      HttpServletRequest request, @RequestBody TelefoneCommandDto telefoneDto) {

	   telefoneService.atualizar(telefoneDto);   
   }
   
   @PreAuthorize("hasRole('USER_WRITE_PRIVILEGE')")
   @ResponseStatus(HttpStatus.OK)
   @RequestMapping(value = "/{idContato}/{idTelefone}", method = RequestMethod.DELETE)
   public void remover(@PathVariable("idContato") Long idContato, @PathVariable("idTelefone") Long idTelefone) {

	   telefoneService.remover(idContato, idTelefone);   
   }	   
      
   
   
}