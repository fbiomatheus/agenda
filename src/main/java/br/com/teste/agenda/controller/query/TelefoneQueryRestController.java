package br.com.teste.agenda.controller.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.agenda.dto.query.TelefoneQueryDto;
import br.com.teste.agenda.service.query.ITelefoneQueryService;

@RestController
@RequestMapping(value = "/api/telefones")
public class TelefoneQueryRestController {

	@Autowired
    private ITelefoneQueryService telefoneService;

	
	 @PreAuthorize("hasRole('USER_READ_PRIVILEGE')")
	 @GetMapping(value = "/{idContato}")
	 @ResponseBody
	 public List<TelefoneQueryDto> getAllTelefones(@PathVariable("idContato") String idContato) {
		 return telefoneService.getTelefones(idContato);
	 }	
	
	 @PreAuthorize("hasRole('USER_READ_PRIVILEGE')")
	 @GetMapping(value = "/{id}")
	 @ResponseBody
	 public TelefoneQueryDto getTelefoneById(@PathVariable("id") String id) {
		 return telefoneService.getTelefone(id);
	 }		 
	 
	 
}
