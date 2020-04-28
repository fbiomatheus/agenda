package br.com.teste.agenda.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = TelefoneValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TelefoneAnnotation {

	String message() default "Obrigatório informar o ddi para números internacionais";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
