package br.com.andyano.dao;

import br.com.andyano.domain.Produto;
import br.com.andyano.generics.GenericDAO;

/**
 * @author anderson.salviano
 * Criado em: 14/10/2025
 */
public class ProdutoDAO extends GenericDAO<Produto> implements IProdutoDAO {

    public ProdutoDAO(){
        super();
    }


    @Override
    public Class<Produto> getTipoClasse() {
        return null;
    }

    @Override
    public void atualizarDados(Produto entity, Produto entityCadastrado) {

    }
}
