package br.com.andyano.services.generics;

import br.com.andyano.domain.Persistente;
import br.com.andyano.exception.TipoChaveNaoEncontradaException;

import java.util.Collection;

/**
 * @author anderson.salviano
 * Criado em: 14/10/2025
 */
public interface IGenericService<T extends Persistente> {

    /**
     * Metodo para cadastrar objeto
     * @param entity Objeto a ser passado para alteracao de dados
     * @return
     *
     */
    Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    Boolean excluir(Long valor);

    T consultar(Long id);

    void alterar(T entity) throws TipoChaveNaoEncontradaException;

    Collection<T> buscarTodos();
}
