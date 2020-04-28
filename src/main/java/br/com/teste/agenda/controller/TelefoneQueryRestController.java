package br.com.teste.agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.agenda.dto.TelefoneQueryDto;
import br.com.teste.agenda.service.ITelefoneQueryService;

@RestController
@RequestMapping(value = "/api/telefones")
public class TelefoneQueryRestController {

	@Autowired
    private ITelefoneQueryService telefoneService;

	
	 @PreAuthorize("hasRole('USER_READ_PRIVILEGE')")
	 @RequestMapping(value = "/{idContato}", method = RequestMethod.GET)
	 @ResponseBody
	 public List<TelefoneQueryDto> getAllTelefones(@PathVariable("idContato") String idContato) {
		 List<TelefoneQueryDto> telefones = telefoneService.getTelefones(idContato);
		 return telefones;
	 }	
	
	 @PreAuthorize("hasRole('USER_READ_PRIVILEGE')")
	 @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	 @ResponseBody
	 public TelefoneQueryDto getTelefoneById(@PathVariable("id") String id) {
		 TelefoneQueryDto telefone = telefoneService.getTelefone(id);
		 return telefone;
	 }		 
	 
	 
}
