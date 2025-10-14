package br.com.andyano;

import br.com.andyano.dao.ClienteDAOMock;
import br.com.andyano.dao.IClienteDAO;
import br.com.andyano.domain.Cliente;
import br.com.andyano.exception.TipoChaveNaoEncontradaException;
import br.com.andyano.services.ClienteService;
import br.com.andyano.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author anderson.salviano
 * Criado em: 14/10/2025
 */
public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest(){
        IClienteDAO dao =  new ClienteDAOMock();
        clienteService = new ClienteService(dao);
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
        clienteService.cadastrar(cliente);
    }


    @Test
    public void pesquisarCliente(){

        Cliente clienteConsultado =  clienteService.buscarPorCpf(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        clienteService.cadastrar(cliente);
    }

    @Test
    public void excluirCliente(){
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Carlos Brito");
        clienteService.alterar(cliente);

        Assert.assertEquals("Carlos Brito", cliente.getNome());
    }


}
