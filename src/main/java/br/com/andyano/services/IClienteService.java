package br.com.andyano.services;

import br.com.andyano.domain.Cliente;
import br.com.andyano.exception.TipoChaveNaoEncontradaException;

/**
 * @author anderson.salviano
 * Criado em: 14/10/2025
 */
public interface IClienteService {
    void cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCpf(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;
}
