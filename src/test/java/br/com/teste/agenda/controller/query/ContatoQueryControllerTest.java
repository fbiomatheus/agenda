package br.com.teste.agenda.controller.query;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import br.com.teste.agenda.dto.query.ContatoQueryDto;
import br.com.teste.agenda.service.query.IContatoQueryService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)public class ContatoQueryControllerTest {


	   @InjectMocks
	   ContatoQueryRestController contatoQueryRestController;
		
	   @Mock   
	   private IContatoQueryService contatoService;

       DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
     @Test       
	 public void getAllContatos() {

		   MockHttpServletRequest request = new MockHttpServletRequest();
	       RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
	       when(contatoService.getContatos()).thenReturn(criarMockList());
	       
	       List<ContatoQueryDto> contatos =  contatoQueryRestController.getAllContatos();       
	       assertThat(contatos.size()).isEqualTo(3);       
	 }	
	

	 
	 
 
	   private List<ContatoQueryDto> criarMockList() {
		   List<ContatoQueryDto> contatos = new ArrayList<ContatoQueryDto>();

		   ContatoQueryDto contato = new ContatoQueryDto();	    
	       contato.setNome("Joao Vitor da Silva");
	       contato.setCpf("474.828.440-40");
	       contato.setDataNascimento(obterObjetoDataNascimento("15/05/1983"));
	       contatos.add(contato);
	       
		   contato = new ContatoQueryDto();	    
	       contato.setNome("Rafaela Ribeiro");
	       contato.setCpf("589.555.980-21");
	       contato.setDataNascimento(obterObjetoDataNascimento("17/02/1990"));
	       contatos.add(contato);

		   contato = new ContatoQueryDto();	    
	       contato.setNome("Roberto Alves");
	       contato.setCpf("149.291.771-18");
	       contato.setDataNascimento(obterObjetoDataNascimento("17/03/1981"));
	       contatos.add(contato);
	       
	       return contatos;
	   }
	   
	   private Date obterObjetoDataNascimento(String dataNascimentoStr) { 		   
		   try {
			return df.parse(dataNascimentoStr);
		} catch (ParseException e) {
			return new Date();
		}
	   }
}
