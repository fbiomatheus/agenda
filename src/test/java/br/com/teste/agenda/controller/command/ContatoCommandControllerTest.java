package br.com.teste.agenda.controller.command;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

import br.com.teste.agenda.dto.command.ContatoCommandDto;
import br.com.teste.agenda.service.command.IContatoCommandService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class ContatoCommandControllerTest {

   @InjectMocks
   ContatoCommandRestController contatoCommandRestController;
	
   @Mock   
   private IContatoCommandService contatoService;
   
   DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	
   @Test	
   public void adicionar() {
	   MockHttpServletRequest request = new MockHttpServletRequest();
       RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
       when(contatoService.salvar(any(ContatoCommandDto.class))).thenReturn(new ContatoCommandDto());
       
       ContatoCommandDto contato= criarMock();
       ResponseEntity<Object> responseEntity =  contatoCommandRestController.adicionar(contato);       
       assertThat(responseEntity.getStatusCodeValue()).isEqualTo(201);       
   }
   
   
   private ContatoCommandDto criarMock() {
       ContatoCommandDto contato = new ContatoCommandDto();	    
       contato.setNome("Joao Vitor da Silva");
       contato.setCpf("474.828.440-40");       
   	   contato.setDataNascimento(obterObjetoDataNascimento("17/03/1981"));

       return contato;
   }
   
   private Date obterObjetoDataNascimento(String dataNascimentoStr) { 		   
	   try {
		return df.parse(dataNascimentoStr);
	} catch (ParseException e) {
		return new Date();
	}
   }
   
}
