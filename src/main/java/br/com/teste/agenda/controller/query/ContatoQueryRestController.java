package br.com.teste.agenda.controller.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.agenda.dto.query.ContatoQueryDto;
import br.com.teste.agenda.service.query.IContatoQueryService;

@RestController
@RequestMapping(value = "/api/contatos")
public class ContatoQueryRestController {

	@Autowired
    private IContatoQueryService contatoService;

	
	 @PreAuthorize("hasRole('USER_READ_PRIVILEGE')")
	 @GetMapping(value = "/")
	 @ResponseBody
	 public List<ContatoQueryDto> getAllContatos() {
		 return contatoService.getContatos();
	 }	
	
	 @PreAuthorize("hasRole('USER_READ_PRIVILEGE')")
	 @GetMapping(value = "/{id}")
	 @ResponseBody
	 public ContatoQueryDto getContatoById(@PathVariable("id") String id) {
		 return contatoService.getContato(id);
	 }	 
	 
	 
}
