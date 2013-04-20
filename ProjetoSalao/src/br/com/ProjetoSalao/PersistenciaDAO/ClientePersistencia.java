package br.com.ProjetoSalao.PersistenciaDAO;

import java.util.ArrayList;
import java.util.List;

import br.com.ProjetoSalao.Entidades.Cliente;
import br.com.ProjetoSalao.Exceptions.ObjetoNaoEncontrado;
import br.com.ProjetoSalao.InterfacesDAO.ClienteDAO;

public class ClientePersistencia implements ClienteDAO{

	private List<Cliente> listaClientes;
	
	@Override
	public void salvar(Cliente cliente){
		System.out.println("Cliente salvo.");
		listaClientes.add(cliente);
		
	}

	@Override
	public void excluir(Cliente cliente) {
		this.listaClientes.remove(cliente);
		
	}

	@Override
	public void editar(Cliente cliente) {
		System.out.println("Cliente editado com sucesso");
		
	}

	@Override
	public List<Cliente> getListaClientes(boolean status) {
		// TODO Auto-generated method stub
		return listaClientes;
	}

	@Override
	public void desfazerExclusao(Integer codigo) {
		System.out.println("Exclusão desfeita");
		
	}

	@Override
	public void inicializarLista(Boolean status) {

		listaClientes = new ArrayList<Cliente>();
		listaClientes.add(this.getClientePorCodigo(0));
	}

	@Override
	public Cliente getClientePorCodigo(Integer codigo) throws ObjetoNaoEncontrado{
		Cliente cliente = new Cliente();
		cliente.setCodigo(codigo);
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
		cliente.setStatus(true);
		cliente.setTelefone1("32874164");
		
		return cliente;
	}

	@Override
	public List<Cliente> getListaClientePorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
