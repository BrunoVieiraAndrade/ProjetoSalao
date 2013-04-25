package br.com.ProjetoSalao.PersistenciaDAO;

import java.util.HashMap;

import br.com.ProjetoSalao.Entidades.Cliente;
import br.com.ProjetoSalao.Exceptions.ObjetoNaoEncontrado;
import br.com.ProjetoSalao.InterfacesDAO.ClienteDAO;

public class ClientePersistencia implements ClienteDAO{

	private HashMap<Integer,Cliente> listaClientes;
	
	@Override
	public void salvar(Cliente cliente){

		listaClientes.put(cliente.getCodigo(), cliente);
		
	}

	@Override
	public void excluir(Cliente cliente) {
		
		listaClientes.put(cliente.getCodigo(), cliente);
		
	}
	
	@Override
	public HashMap<Integer,Cliente> getListaClientes() {

		return listaClientes;
		
	}

	@Override
	public Cliente getClientePorCodigo(Integer codigo) throws ObjetoNaoEncontrado{

		Cliente cliente = this.listaClientes.get(codigo);
		return cliente;
	}

	public void inicializarListaTeste(){
		
		Cliente cliente = new Cliente();
		cliente.setCodigo(1);
		cliente.setNome("Kaio");
		cliente.setBairro("Setor sudoeste");
		cliente.setCep("74305400");
		cliente.setCodigoDependente(-1);
		cliente.setCpf("74305400");
		cliente.setEmail("Kaio cristian costa silva");
		cliente.setPendente(false);
		cliente.setRg("5019294");
		cliente.setSaldo(0.0);
		cliente.setSexo("M");
		cliente.setTelefone1("32874164");
		
		Cliente cliente1 = new Cliente();
		cliente.setCodigo(2);
		
		Cliente cliente2 = new Cliente();
		cliente.setCodigo(3);
		
		Cliente cliente3 = new Cliente();
		cliente.setCodigo(4);
		
		this.listaClientes.put(cliente.getCodigo(), cliente);
		this.listaClientes.put(cliente1.getCodigo(), cliente1);
		this.listaClientes.put(cliente2.getCodigo(), cliente2);
		this.listaClientes.put(cliente3.getCodigo(), cliente3);
		
	}
	
}
