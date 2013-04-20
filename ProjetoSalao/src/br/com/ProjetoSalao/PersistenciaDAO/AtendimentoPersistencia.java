package br.com.ProjetoSalao.PersistenciaDAO;

import java.util.List;

import br.com.ProjetoSalao.Entidades.Atendimento;
import br.com.ProjetoSalao.Exceptions.ObjetoNaoEncontrado;
import br.com.ProjetoSalao.InterfacesDAO.AtendimentoDAO;
import br.com.ProjetoSalao.RegrasNegocio.ClienteRN;
import br.com.ProjetoSalao.RegrasNegocio.FuncionarioRN;
import br.com.ProjetoSalao.RegrasNegocio.ServicoRN;

public class AtendimentoPersistencia implements AtendimentoDAO{

	@Override
	public void salvar(Atendimento atendimento){
		// TODO Auto-generated method stub
		
	}

	@Override
	public Atendimento buscarAtendimentoPorCodigo(Integer codigo) throws ObjetoNaoEncontrado{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Atendimento atendimento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(Atendimento atendimento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Atendimento> getListaAtendimentos(boolean status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void desfazerExclusao(Integer codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inicializarLista(Boolean status, FuncionarioRN funcionarioRN,
			ClienteRN clienteRN, ServicoRN servicoRN) {
		// TODO Auto-generated method stub
		
	}

}
