package br.com.andyano.dao;

import br.com.andyano.generics.GenericDAO;
import br.com.andyano.domain.Cliente;

/**
 * @author anderson.salviano
 * Criado em: 14/10/2025
 */
public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO {

    public ClienteDAO(){
        super();
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente entity, Cliente entityCadastrado) {

    }
}
