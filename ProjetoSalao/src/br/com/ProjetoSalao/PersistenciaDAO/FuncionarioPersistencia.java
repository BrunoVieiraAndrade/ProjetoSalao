package br.com.ProjetoSalao.PersistenciaDAO;

import java.util.ArrayList;
import java.util.List;

import br.com.ProjetoSalao.Entidades.Funcionario;
import br.com.ProjetoSalao.Exceptions.ObjetoNaoEncontrado;
import br.com.ProjetoSalao.InterfacesDAO.FuncionarioDAO;

public class FuncionarioPersistencia implements FuncionarioDAO{

	private List<Funcionario> listaFuncionarios;
	
	@Override
	public void salvar(Funcionario funcionario){
		System.out.println("Funcionario salvo.");
		listaFuncionarios.add(funcionario);
		
	}

	@Override
	public void excluir(Funcionario funcionario) {
		this.listaFuncionarios.remove(funcionario);
		
	}

	@Override
	public void editar(Funcionario funcionario) {
		System.out.println("Funcionario editado com sucesso");
		
	}

	@Override
	public List<Funcionario> getListaFuncionarios(boolean status) {
		// TODO Auto-generated method stub
		return listaFuncionarios;
	}

	@Override
	public void desfazerExclusao(Integer codigo) {
		System.out.println("Exclusão desfeita");
		
	}

	@Override
	public void inicializarLista(Boolean status) {

		listaFuncionarios = new ArrayList<Funcionario>();
		listaFuncionarios.add(this.getFuncionarioPorCodigo(0));
	}

	@Override
	public Funcionario getFuncionarioPorCodigo(Integer codigo) throws ObjetoNaoEncontrado{
		Funcionario funcionario = new Funcionario();
		funcionario.setCodigo(codigo);
		funcionario.setNome("Kaio");
		funcionario.setBairro("Setor sudoeste");
		funcionario.setCep("74305400");
		funcionario.setCpf("74305400");
		funcionario.setEmail("Kaio cristian costa silva");
		funcionario.setRg("5019294");
		funcionario.setSexo("M");
		funcionario.setStatus(true);
		funcionario.setTelefone1("32874164");
		
		return funcionario;
	}

	@Override
	public List<Funcionario> getListaFuncionarioPorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Funcionario getFuncionarioPorLogin(String login) {
		
		return listaFuncionarios.get(0);
	}

	
	
}
