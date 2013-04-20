package br.com.ProjetoSalao.PersistenciaDAO;

import java.util.List;

import br.com.ProjetoSalao.Entidades.Funcionario;
import br.com.ProjetoSalao.Exceptions.ObjetoNaoEncontrado;
import br.com.ProjetoSalao.InterfacesDAO.FuncionarioDAO;

public class FuncionarioPersistencia implements FuncionarioDAO{

	@Override
	public void salvar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Funcionario getFuncionarioPorCodigo(Integer codigo) throws ObjetoNaoEncontrado{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Funcionario> getListaFuncionarios(boolean status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Funcionario> getListaFuncionarioPorNome(String nome) {
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
	public Funcionario getFuncionarioPorLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
