package br.com.andyano.services;

import br.com.andyano.dao.IClienteDAO;
import br.com.andyano.domain.Cliente;
import br.com.andyano.exception.TipoChaveNaoEncontradaException;

/**
 * @author anderson.salviano
 * Criado em: 14/10/2025
 */
public class ClienteService implements IClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO){
        this.clienteDAO = clienteDAO;
    }

    @Override
    public void cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        clienteDAO.cadastrar(cliente);
    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        return clienteDAO.consultar(cpf);
    }

    @Override
    public void excluir(Long cpf) {
        clienteDAO.excluir(cpf);
    }

    @Override
    public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        clienteDAO.cadastrar(cliente);
    }
}
