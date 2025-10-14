package br.com.andyano.services.generics;

import br.com.andyano.domain.Persistente;
import br.com.andyano.exception.TipoChaveNaoEncontradaException;
import br.com.andyano.generics.GenericDAO;
import br.com.andyano.generics.IGenericDAO;

import java.util.Collection;

/**
 * @author anderson.salviano
 * Criado em: 14/10/2025
 */
public class GenericService<T extends Persistente> implements IGenericService<T> {

    private IGenericDAO<T> entityDAO;

    public GenericService(GenericDAO<T> entityDAO) {
        this.entityDAO = entityDAO;
    }

    @Override
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException {
       return entityDAO.cadastrar(entity);
    }

    @Override
    public Boolean excluir(Long valor) {
        return entityDAO.excluir(valor);
    }

    @Override
    public T consultar(Long id) {
        return entityDAO.consultar(id);
    }

    @Override
    public void alterar(T entity) throws TipoChaveNaoEncontradaException {
        entityDAO.alterar(entity);
    }

    @Override
    public Collection<T> buscarTodos() {
        return entityDAO.buscarTodos();
    }

}
