package br.com.teste.agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.agenda.dto.EnderecoQueryDto;
import br.com.teste.agenda.service.IEnderecoQueryService;

@RestController
@RequestMapping(value = "/api/enderecos")
public class EnderecoQueryRestController {

	@Autowired
    private IEnderecoQueryService enderecoService;

	
	 @PreAuthorize("hasRole('USER_READ_PRIVILEGE')")
	 @RequestMapping(value = "/{idContato}", method = RequestMethod.GET)
	 @ResponseBody
	 public List<EnderecoQueryDto> getAllEnderecos(@PathVariable("idContato") Long idContato) {
		 List<EnderecoQueryDto> enderecos = enderecoService.getEnderecos(idContato);
		 return enderecos;
	 }	
	
	 @PreAuthorize("hasRole('USER_READ_PRIVILEGE')")
	 @RequestMapping(value = "/{idContato}/{idEndereco}", method = RequestMethod.GET)
	 @ResponseBody
	 public EnderecoQueryDto getEnderecoById(@PathVariable("idContato") Long idContato,  
			 @PathVariable("idContato") Long idEndereco) {
		 EnderecoQueryDto endereco = enderecoService.getEndereco(idContato, idEndereco);
		 return endereco;
	 }	 
	 
	 
}
