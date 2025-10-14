package br.com.andyano.dao;

import br.com.andyano.domain.Cliente;
import br.com.andyano.generics.GenericDAO;


/**
 * @author anderson.salviano
 * Criado em: 14/10/2025
 */
public class ClienteDAOMock extends GenericDAO<Cliente> implements IClienteDAO{

    public ClienteDAOMock(){
        super();
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return null;
    }

    @Override
    public void atualizarDados(Cliente entity, Cliente entityCadastrado) {

    }
}
