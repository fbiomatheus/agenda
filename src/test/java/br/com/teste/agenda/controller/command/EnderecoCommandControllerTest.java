package br.com.teste.agenda.controller.command;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import br.com.teste.agenda.dto.command.EnderecoCommandDto;
import br.com.teste.agenda.service.command.IEnderecoCommandService;
import br.com.teste.agenda.type.TipoEnderecoEnum;
import br.com.teste.agenda.type.TipoLogradouroEnum;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class EnderecoCommandControllerTest {

   @InjectMocks
   EnderecoCommandRestController enderecoCommandRestController;
	
   @Mock   
   private IEnderecoCommandService enderecoService;  
   
   @Test	
   public void adicionar() {
		   MockHttpServletRequest request = new MockHttpServletRequest();
	       RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
	       when(enderecoService.salvar(any(EnderecoCommandDto.class))).thenReturn(new EnderecoCommandDto());
	       
	       EnderecoCommandDto endereco= criarMock();
	       ResponseEntity<Object> responseEntity =  enderecoCommandRestController.adicionar(endereco);       
	       assertThat(responseEntity.getStatusCodeValue()).isEqualTo(201);       
   }
   
   private EnderecoCommandDto criarMock() {
	   EnderecoCommandDto endereco = new EnderecoCommandDto();
	   endereco.setTipoEndereco(TipoEnderecoEnum.COMERCIAL);
	   endereco.setTipoLogradouro(TipoLogradouroEnum.AVENIDA);
	   endereco.setLogradouro("Paulista");
	   endereco.setNumero("2101");
	   endereco.setComplemento("conjunto 55");
	   endereco.setBairro("Jardim Paulista");
	   endereco.setCep("01310-930");
	   endereco.setCidade("São Paulo");
	   endereco.setIdContato("15626226262262");
	   return endereco;   
	   
   }
   
}
