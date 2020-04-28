package br.com.teste.agenda.controller.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.agenda.dto.query.EnderecoQueryDto;
import br.com.teste.agenda.service.query.IEnderecoQueryService;

@RestController
@RequestMapping(value = "/api/enderecos")
public class EnderecoQueryRestController {

	@Autowired
    private IEnderecoQueryService enderecoService;

	
	 @PreAuthorize("hasRole('USER_READ_PRIVILEGE')")
	 @GetMapping(value = "/{idContato}")
	 @ResponseBody
	 public List<EnderecoQueryDto> getAllEnderecos(@PathVariable("idContato") String idContato) {
		 return enderecoService.getEnderecos(idContato);
	 }	
	
	 @PreAuthorize("hasRole('USER_READ_PRIVILEGE')")
	 @GetMapping(value = "/{id}")
	 @ResponseBody
	 public EnderecoQueryDto getEnderecoById(@PathVariable("id") String id) {
		 return enderecoService.getEndereco(id);
	 }	 
	 
	 
}
