package br.com.ProjetoSalao.ControladorTelas;
import br.com.ProjetoSalao.Entidades.Cliente;


public interface ClienteControlador {

	public void salvarOuEditar(Cliente cliente);
	public void excluir(Cliente cliente);
	public void getListaClientes(boolean status);
	public void restaurarCliente(Cliente cliente);
	
}
