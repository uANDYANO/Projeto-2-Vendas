package br.com.andyano;

import br.com.andyano.dao.ClienteDAOMock;
import br.com.andyano.dao.IClienteDAO;
import br.com.andyano.domain.Cliente;
import br.com.andyano.exception.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author anderson.salviano
 * Criado em: 14/10/2025
 */
public class ClienteDAOTest {

    private IClienteDAO clienteDao;

    private Cliente cliente;

    public ClienteDAOTest(){
        clienteDao = new ClienteDAOMock();
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();
        cliente.setCpf(12312312312l);
        cliente.setNome("Carlos");
        cliente.setCidade("Pará de Minas");
        cliente.setEndereco("Rua Teste");
        cliente.setNumero(123);
        cliente.setEstado("MG");
        cliente.setNumero(40028922);
        clienteDao.cadastrar(cliente);
    }

    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado =  clienteDao.consultar(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        clienteDao.cadastrar(cliente);
    }

    @Test
    public void excluirCliente(){
        Boolean retorno  = clienteDao.excluir(cliente.getCpf());
        Assert.assertTrue(retorno);
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Carlos Brito");
        clienteDao.cadastrar(cliente);

        Assert.assertEquals("Carlos Brito", cliente.getNome());
    }

}
