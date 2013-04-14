package br.com.ProjetoSalao.InterfacesDAO;

import java.util.List;

import br.com.ProjetoSalao.Entidades.Cliente;
import br.com.ProjetoSalao.Exceptions.ObjetoNaoEncontrado;

public interface ClienteDAO {

	public void salvar(Cliente cliente);
	public Cliente getClientePorCodigo(Integer codigo)throws ObjetoNaoEncontrado;
	public void excluir(Cliente cliente);
	public void editar(Cliente cliente);
	public List<Cliente> getListaClientes(boolean Status);
	public List<Cliente> getListaClientePorNome(String nome);
    public void desfazerExclusao(Integer codigo);
    public void inicializarLista(Boolean status);

}
