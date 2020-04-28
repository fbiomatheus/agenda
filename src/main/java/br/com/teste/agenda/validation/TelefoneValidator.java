package br.com.teste.agenda.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import br.com.teste.agenda.dto.command.TelefoneCommandDto;
import br.com.teste.agenda.type.TipoTelefoneEnum;

public class TelefoneValidator implements ConstraintValidator<TelefoneAnnotation, TelefoneCommandDto> {

	/**
     * Valida o telefone
     */
    public boolean isValid(TelefoneCommandDto telefoneParam, ConstraintValidatorContext context) {
    	boolean valorValido = true;
        TelefoneCommandDto telefone = telefoneParam;
        if(telefone.getTipoTelefone().equals(TipoTelefoneEnum.INTERNACIONAL)
        	&& telefone.getDdi() == null ||  telefone.getDdi() <= 0) {               	
        	valorValido=false;            
        }
        return valorValido;
    }

	
}

	
	

