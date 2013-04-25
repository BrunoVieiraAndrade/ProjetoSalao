package br.com.ProjetoSalao.ClienteBean;

import br.com.ProjetoSalao.ControladorTelas.ClienteControlador;
import br.com.ProjetoSalao.Entidades.Cliente;
import br.com.ProjetoSalao.RegrasNegocio.ClienteRN;

public class ClienteBean implements ClienteControlador{

	ClienteRN clienteRN;
	
	public ClienteBean(ClienteRN clienteRN){
		
		this.clienteRN = clienteRN;
		
	}
	
	@Override
	public void salvarOuEditar(Cliente cliente) {
		
		clienteRN.salvar(cliente);
		
	}

	@Override
	public void excluir(Cliente cliente) {
		
		clienteRN.excluir(cliente);
		
	}

	@Override
	public void getListaClientes(boolean status) {
		clienteRN.getLista();
		
	}

	@Override
	public void restaurarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

}
