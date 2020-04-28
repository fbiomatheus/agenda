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

import br.com.teste.agenda.dto.EnderecoCommandDto;
import br.com.teste.agenda.service.IEnderecoCommandService;

@RestController
@RequestMapping(value = "/api/enderecos")
public class EnderecoCommandRestController {

   @Autowired
   private IEnderecoCommandService enderecoService;
	
	
   @RequestMapping(value = "/", method = RequestMethod.POST)
   @ResponseStatus(HttpStatus.OK)
   public void adicionar(
      HttpServletRequest request, @RequestBody EnderecoCommandDto enderecoDto) {
         
	   enderecoService.adicionar(enderecoDto);
   }
   
   @PreAuthorize("hasRole('USER_WRITE_PRIVILEGE')")
   @RequestMapping(value = "/", method = RequestMethod.PUT)
   @ResponseStatus(HttpStatus.OK)
   public void atualizar(
      HttpServletRequest request, @RequestBody EnderecoCommandDto enderecoDto) {

	   enderecoService.atualizar(enderecoDto);   
   }
   
   @PreAuthorize("hasRole('USER_WRITE_PRIVILEGE')")
   @ResponseStatus(HttpStatus.OK)
   @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
   public void remover(@PathVariable("id") String id) {
	   enderecoService.remover(id);   
   }	   
   
   
}
