package br.com.teste.agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.agenda.dto.ContatoQueryDto;
import br.com.teste.agenda.service.IContatoQueryService;

@RestController
@RequestMapping(value = "/api/contatos")
public class ContatoQueryRestController {

	@Autowired
    private IContatoQueryService contatoService;

	
	 @PreAuthorize("hasRole('USER_READ_PRIVILEGE')")
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	 @ResponseBody
	 public List<ContatoQueryDto> getAllContatos() {
		 List<ContatoQueryDto> contatos = contatoService.getContatos();
		 return contatos;
	 }	
	
	 @PreAuthorize("hasRole('USER_READ_PRIVILEGE')")
	 @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	 @ResponseBody
	 public ContatoQueryDto getContatoById(@PathVariable("id") Long id) {
		 ContatoQueryDto contato = contatoService.getContato(id);
		 return contato;
	 }	 
	 
	 
}
