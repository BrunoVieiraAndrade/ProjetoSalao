package br.com.ProjetoSalao.InterfacesDAO;

import java.util.List;

import br.com.ProjetoSalao.Entidades.Funcionario;
import br.com.ProjetoSalao.Exceptions.ObjetoNaoEncontrado;

public interface FuncionarioDAO {

	public void salvar(Funcionario funcionario);
	public void excluir(Funcionario funcionario);
	public void editar(Funcionario funcionario);
	public Funcionario getFuncionarioPorCodigo(Integer codigo)throws ObjetoNaoEncontrado;
	public Funcionario getFuncionarioPorLogin(String login);
	public List<Funcionario> getListaFuncionarios(boolean Status);
	public List<Funcionario> getListaFuncionarioPorNome(String nome);
    public void desfazerExclusao(Integer codigo);
    public void inicializarLista(Boolean status);
	
}
