package br.com.andyano.anotation;

import java.lang.annotation.*;

/**
 * @author anderson.salviano
 * Criado em: 14/10/2025
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}