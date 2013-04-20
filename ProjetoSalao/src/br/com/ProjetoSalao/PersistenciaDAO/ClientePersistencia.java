package br.com.ProjetoSalao.PersistenciaDAO;

import java.util.List;

import br.com.ProjetoSalao.Entidades.Cliente;
import br.com.ProjetoSalao.Exceptions.ObjetoNaoEncontrado;
import br.com.ProjetoSalao.InterfacesDAO.ClienteDAO;

public class ClientePersistencia implements ClienteDAO{

	@Override
	public void salvar(Cliente cliente){
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> getListaClientes(boolean status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void desfazerExclusao(Integer codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inicializarLista(Boolean status) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente getClientePorCodigo(Integer codigo) throws ObjetoNaoEncontrado{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> getListaClientePorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
