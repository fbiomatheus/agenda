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

import br.com.teste.agenda.dto.command.TelefoneCommandDto;
import br.com.teste.agenda.service.command.ITelefoneCommandService;
import br.com.teste.agenda.type.TipoTelefoneEnum;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class TelefoneCommandControllerTest {

   @InjectMocks
   TelefoneCommandRestController telefoneCommandRestController;

   @Mock   
   private ITelefoneCommandService telefoneService;    
   
   @Test
   public void adicionar() {
	   MockHttpServletRequest request = new MockHttpServletRequest();
       RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
       when(telefoneService.salvar(any(TelefoneCommandDto.class))).thenReturn(new TelefoneCommandDto());
       
       TelefoneCommandDto telefone= criarMock();
       ResponseEntity<Object> responseEntity =  telefoneCommandRestController.adicionar(telefone);       
       assertThat(responseEntity.getStatusCodeValue()).isEqualTo(201); 
   }
   
   
   private TelefoneCommandDto criarMock() {
	   TelefoneCommandDto telefone = new TelefoneCommandDto();
	   telefone.setIdContato("45151554dewdewd5");
	   telefone.setTipoTelefone(TipoTelefoneEnum.INTERNACIONAL);
	   telefone.setDdd(551);
	   telefone.setDdi(1);
	   telefone.setNumero("55151-555455");
	   telefone.setRamal("335");	   
	   return telefone;	   
   }     
   
   
}
