package br.com.ProjetoSalao.InterfacesDAO;

import java.util.HashMap;

import br.com.ProjetoSalao.Entidades.Cliente;
import br.com.ProjetoSalao.Exceptions.ObjetoNaoEncontrado;

public interface ClienteDAO {

	public void salvar(Cliente cliente);
	public Cliente getClientePorCodigo(Integer codigo)throws ObjetoNaoEncontrado;
	public void excluir(Cliente cliente);
	public HashMap<Integer,Cliente> getListaClientes();
	
	
}
